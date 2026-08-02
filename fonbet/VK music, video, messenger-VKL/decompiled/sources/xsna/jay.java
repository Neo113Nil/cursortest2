package xsna;

import java.util.ArrayList;
import kotlinx.serialization.json.JsonElement;

/* compiled from: TreeJsonEncoder.kt */
/* loaded from: classes8.dex */
public final class jay extends ef {
    public JsonElement h;

    public jay(j8y j8yVar, izs<? super JsonElement, s3q0> izsVar) {
        super(j8yVar, izsVar);
        ((ArrayList) this.b).add("primitive");
    }

    @Override // xsna.ef
    public final JsonElement i0() {
        JsonElement jsonElement = this.h;
        if (jsonElement != null) {
            return jsonElement;
        }
        throw new IllegalArgumentException("Primitive element has not been recorded. Is call to .encodeXxx is missing in serializer?");
    }

    @Override // xsna.ef
    public final void j0(String str, JsonElement jsonElement) {
        if (str != "primitive") {
            throw new IllegalArgumentException("This output can only consume primitives with 'primitive' tag");
        }
        if (this.h != null) {
            throw new IllegalArgumentException("Primitive element was already recorded. Does call to .encodeXxx happen more than once?");
        }
        this.h = jsonElement;
        this.d.invoke(jsonElement);
    }
}
