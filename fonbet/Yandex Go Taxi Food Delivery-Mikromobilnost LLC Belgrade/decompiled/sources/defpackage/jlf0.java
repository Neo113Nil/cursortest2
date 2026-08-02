package defpackage;

import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes5.dex */
public final class jlf0 extends a151 {
    public jlf0() {
        super("promo");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.a151
    public final void a(final n351 n351Var, fid fidVar, final int i) {
        int i2;
        aii0 v;
        wls wlsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1454258227);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(n351Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        final int i3 = 1;
        if (!btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            btsVar.Y();
        } else {
            if (!(n351Var instanceof hqf0)) {
                v = btsVar.v();
                if (v != null) {
                    wlsVar = new wls(this) { // from class: ilf0
                        public final /* synthetic */ jlf0 b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = r4;
                            zy11 zy11Var = zy11.a;
                            int i5 = i;
                            n351 n351Var2 = n351Var;
                            jlf0 jlf0Var = this.b;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).getClass();
                            switch (i4) {
                                case 0:
                                    jlf0Var.a(n351Var2, fidVar2, vng.O(i5 | 1));
                                    break;
                                default:
                                    jlf0Var.a(n351Var2, fidVar2, vng.O(i5 | 1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v.d = wlsVar;
                }
                return;
            }
            hqf0 hqf0Var = (hqf0) n351Var;
            w3b1 w3b1Var = hqf0Var.i;
            cza1.a((hqf0Var.k || !hqf0Var.n) ? 1 : 0, 0, null, null, wwg.S(767074420, true, new o990(9, w3b1Var, n351Var), btsVar), btsVar, HProv.ALG_CLASS_DATA_ENCRYPT);
        }
        v = btsVar.v();
        if (v != null) {
            wlsVar = new wls(this) { // from class: ilf0
                public final /* synthetic */ jlf0 b;

                {
                    this.b = this;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i4 = i3;
                    zy11 zy11Var = zy11.a;
                    int i5 = i;
                    n351 n351Var2 = n351Var;
                    jlf0 jlf0Var = this.b;
                    fid fidVar2 = (fid) obj;
                    ((Integer) obj2).getClass();
                    switch (i4) {
                        case 0:
                            jlf0Var.a(n351Var2, fidVar2, vng.O(i5 | 1));
                            break;
                        default:
                            jlf0Var.a(n351Var2, fidVar2, vng.O(i5 | 1));
                            break;
                    }
                    return zy11Var;
                }
            };
            v.d = wlsVar;
        }
    }
}
