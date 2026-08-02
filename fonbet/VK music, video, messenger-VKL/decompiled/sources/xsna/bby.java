package xsna;

import java.util.LinkedHashMap;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* compiled from: TreeJsonEncoder.kt */
/* loaded from: classes8.dex */
public class bby extends ef {
    public final LinkedHashMap h;

    public bby(j8y j8yVar, izs<? super JsonElement, s3q0> izsVar) {
        super(j8yVar, izsVar);
        this.h = new LinkedHashMap();
    }

    @Override // xsna.ef
    public JsonElement i0() {
        return new JsonObject(this.h);
    }

    @Override // xsna.ef
    public void j0(String str, JsonElement jsonElement) {
        this.h.put(str, jsonElement);
    }

    @Override // xsna.nc, xsna.cti
    public final <T> void s(SerialDescriptor serialDescriptor, int i, mmi0<? super T> mmi0Var, T t) {
        if (t != null || this.e.f) {
            super.s(serialDescriptor, i, mmi0Var, t);
        }
    }
}
