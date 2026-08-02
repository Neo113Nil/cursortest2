package xsna;

import android.util.LruCache;
import xsna.qr60;
import xsna.svq0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class agk implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ agk(Object obj, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.d;
        boolean z = this.c;
        switch (i) {
            case 0:
                izs izsVar = (izs) obj2;
                tny tnyVar = (tny) obj;
                if (z) {
                    izsVar.invoke(jgz.p(tnyVar).z(tnyVar, true));
                }
                return s3q0.a;
            case 1:
                boi0 boi0Var = (boi0) obj2;
                String str = (String) obj;
                boolean e = boi0Var.e();
                kza0 kza0Var = boi0Var.a;
                if (e && str != null && str.length() != 0) {
                    kza0Var.N(str);
                } else if ((str == null || str.length() == 0) && z) {
                    boi0Var.c.g = true;
                    kza0Var.stop(32);
                }
                return s3q0.a;
            case 2:
                fsk0.i((fsk0) obj2, z, false, (gzs) obj, 2);
                return s3q0.a;
            case 3:
                hxq0 hxq0Var = (hxq0) obj;
                ((zvq0) obj2).c(new svq0.a(zp60.a));
                return new awq0(new qr60.a.g(hxq0Var.a, hxq0Var.b, hxq0Var.d, !z, false, null, null, 96));
            default:
                String str2 = (String) obj2;
                i700 i700Var = (i700) obj;
                if (!z) {
                    bpn0 bpn0Var = c7r0.a;
                    ((LruCache) c7r0.a.getValue()).put(str2, i700Var);
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ agk(boolean z, Object obj, int i) {
        this.b = i;
        this.c = z;
        this.d = obj;
    }
}
