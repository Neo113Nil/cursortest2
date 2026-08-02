package xsna;

import xsna.r1k0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class zre implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ zre(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.e = obj;
        this.c = obj2;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                izs izsVar = (izs) this.e;
                q630 q630Var = (q630) this.c;
                ((Integer) obj2).getClass();
                ase.a(ne7.I(this.d | 1), (androidx.compose.runtime.a) obj, izsVar, q630Var);
                break;
            case 1:
                ((Integer) obj2).getClass();
                uag.a((r1k0.a.AbstractC3589a) this.e, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 2:
                r4t0 r4t0Var = (r4t0) this.e;
                jai jaiVar = (jai) this.c;
                ((Integer) obj2).getClass();
                r4t0Var.z(ne7.I(this.d | 1), (androidx.compose.runtime.a) obj, jaiVar);
                break;
            default:
                ((Integer) obj2).getClass();
                wiu0.a((qco0) this.e, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
        }
        return s3q0.a;
    }
}
