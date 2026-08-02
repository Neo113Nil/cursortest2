package xsna;

import java.util.ArrayList;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;

/* compiled from: TreeJsonEncoder.kt */
/* loaded from: classes8.dex */
public final class dby extends ef {
    public final ArrayList<JsonElement> h;

    public dby(j8y j8yVar, izs<? super JsonElement, s3q0> izsVar) {
        super(j8yVar, izsVar);
        this.h = new ArrayList<>();
    }

    @Override // xsna.ef, xsna.nc
    public final String T(SerialDescriptor serialDescriptor, int i) {
        return String.valueOf(i);
    }

    @Override // xsna.ef
    public final JsonElement i0() {
        return new JsonArray(this.h);
    }

    @Override // xsna.ef
    public final void j0(String str, JsonElement jsonElement) {
        this.h.add(Integer.parseInt(str), jsonElement);
    }
}
