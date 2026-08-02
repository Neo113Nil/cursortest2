package defpackage;

import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes5.dex */
public final class dch extends a151 {
    public dch() {
        super("header");
    }

    @Override // defpackage.a151
    public final void a(final n351 n351Var, fid fidVar, final int i) {
        int i2;
        aii0 v;
        wls wlsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1318058703);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(n351Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        final int i3 = 0;
        final int i4 = 1;
        if (!btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            btsVar.Y();
        } else {
            if (!(n351Var instanceof zbu)) {
                v = btsVar.v();
                if (v != null) {
                    wlsVar = new wls(this) { // from class: cch
                        public final /* synthetic */ dch b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = i3;
                            zy11 zy11Var = zy11.a;
                            int i6 = i;
                            n351 n351Var2 = n351Var;
                            dch dchVar = this.b;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    dchVar.a(n351Var2, fidVar2, vng.O(i6 | 1));
                                    break;
                                default:
                                    dchVar.a(n351Var2, fidVar2, vng.O(i6 | 1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v.d = wlsVar;
                }
                return;
            }
            zbu zbuVar = (zbu) n351Var;
            cza1.a(zbuVar.g || !zbuVar.h, 0, null, null, wwg.S(957785462, true, new qq0(n351Var, i4), btsVar), btsVar, HProv.ALG_CLASS_DATA_ENCRYPT);
        }
        v = btsVar.v();
        if (v != null) {
            wlsVar = new wls(this) { // from class: cch
                public final /* synthetic */ dch b;

                {
                    this.b = this;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i4;
                    zy11 zy11Var = zy11.a;
                    int i6 = i;
                    n351 n351Var2 = n351Var;
                    dch dchVar = this.b;
                    fid fidVar2 = (fid) obj;
                    ((Integer) obj2).getClass();
                    switch (i5) {
                        case 0:
                            dchVar.a(n351Var2, fidVar2, vng.O(i6 | 1));
                            break;
                        default:
                            dchVar.a(n351Var2, fidVar2, vng.O(i6 | 1));
                            break;
                    }
                    return zy11Var;
                }
            };
            v.d = wlsVar;
        }
    }
}
