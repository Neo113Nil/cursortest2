package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class ikc extends clc {
    public ikc(ArrayList arrayList) {
        super("registerSupportedFeatures", new hkc(arrayList));
    }

    @Override // defpackage.clc
    public final String d(zcx zcxVar) {
        return zcxVar.c(this.b, hkc.Companion.serializer());
    }
}
