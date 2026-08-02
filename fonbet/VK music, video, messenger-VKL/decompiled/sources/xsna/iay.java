package xsna;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;

/* compiled from: TreeJsonDecoder.kt */
/* loaded from: classes8.dex */
public final class iay extends bf {
    public final JsonElement g;

    public iay(j8y j8yVar, JsonElement jsonElement, String str) {
        super(j8yVar, jsonElement, str);
        this.g = jsonElement;
        this.b.add("primitive");
    }

    @Override // xsna.bf
    public final JsonElement U(String str) {
        if (str == "primitive") {
            return this.g;
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag");
    }

    @Override // xsna.bf
    public final JsonElement W() {
        return this.g;
    }

    @Override // xsna.ssi
    public final int m(SerialDescriptor serialDescriptor) {
        return 0;
    }
}
