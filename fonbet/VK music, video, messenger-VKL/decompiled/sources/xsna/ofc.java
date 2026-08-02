package xsna;

import android.content.Context;
import kotlin.LazyThreadSafetyMode;
import xsna.lfc;

/* compiled from: CitySearchDatabaseInteractorImpl.kt */
/* loaded from: classes5.dex */
public final class ofc implements mfc {
    public final Object a = msy.a(LazyThreadSafetyMode.NONE, new qe3(8));

    @Override // xsna.mfc
    public final nfc a(izs izsVar) {
        return new nfc(izsVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.mfc
    public final sh90 c(Context context, String str, Integer num, Integer num2, boolean z, Integer num3, boolean z2) {
        lfc.a aVar;
        if (((Boolean) this.a.getValue()).booleanValue()) {
            lfc.b bVar = new lfc.b(context, z2);
            bVar.j = num2;
            bVar.i = num;
            bVar.k = z;
            bVar.l = num3;
            bVar.h = str;
            aVar = bVar;
        } else {
            lfc.a aVar2 = new lfc.a(context);
            aVar2.g = num2;
            aVar2.f = num;
            aVar2.h = z;
            aVar2.i = num3;
            aVar2.e = str;
            aVar = aVar2;
        }
        return new sh90(aVar);
    }
}
