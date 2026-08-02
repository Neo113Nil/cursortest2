package defpackage;

import com.yandex.go.urbanads.b;
import defpackage.bts;
import defpackage.did;
import defpackage.fid;
import defpackage.lhg;
import defpackage.n351;
import defpackage.qpa1;
import defpackage.wls;
import defpackage.xc1;
import defpackage.zpn;
import defpackage.zy11;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes5.dex */
public final class cd1 extends a151 {
    public final /* synthetic */ int b;
    public final b c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cd1(b bVar, int i) {
        super("ads-banner-key");
        this.b = i;
        switch (i) {
            case 1:
                super("ads-banner");
                this.c = bVar;
                break;
            default:
                this.c = bVar;
                break;
        }
    }

    @Override // defpackage.a151
    public final void a(final n351 n351Var, fid fidVar, final int i) {
        int i2;
        aii0 v;
        wls wlsVar;
        int i3;
        bts btsVar;
        aii0 v2;
        wls wlsVar2;
        final int i4 = 1;
        final int i5 = 0;
        switch (this.b) {
            case 0:
                bts btsVar2 = (bts) fidVar;
                btsVar2.g0(-1622800200);
                if ((i & 6) == 0) {
                    i2 = (btsVar2.k(n351Var) ? 4 : 2) | i;
                } else {
                    i2 = i;
                }
                if ((i & 48) == 0) {
                    i2 |= btsVar2.e(this) ? 32 : 16;
                }
                if (!btsVar2.V(i2 & 1, (i2 & 19) != 18)) {
                    btsVar2.Y();
                } else if (!(n351Var instanceof pc1)) {
                    v = btsVar2.v();
                    if (v != null) {
                        wlsVar = new wls(this) { // from class: ad1
                            public final /* synthetic */ cd1 b;

                            {
                                this.b = this;
                            }

                            @Override // defpackage.wls
                            public final Object invoke(Object obj, Object obj2) {
                                int i6 = i5;
                                zy11 zy11Var = zy11.a;
                                int i7 = i;
                                n351 n351Var2 = n351Var;
                                cd1 cd1Var = this.b;
                                fid fidVar2 = (fid) obj;
                                ((Integer) obj2).getClass();
                                switch (i6) {
                                    case 0:
                                        cd1Var.a(n351Var2, fidVar2, vng.O(i7 | 1));
                                        break;
                                    default:
                                        cd1Var.a(n351Var2, fidVar2, vng.O(i7 | 1));
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                        v.d = wlsVar;
                        break;
                    }
                } else {
                    ppa1.a((pc1) n351Var, this.c, btsVar2, i2 & 14);
                }
                v = btsVar2.v();
                if (v != null) {
                    wlsVar = new wls(this) { // from class: ad1
                        public final /* synthetic */ cd1 b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i6 = i4;
                            zy11 zy11Var = zy11.a;
                            int i7 = i;
                            n351 n351Var2 = n351Var;
                            cd1 cd1Var = this.b;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).getClass();
                            switch (i6) {
                                case 0:
                                    cd1Var.a(n351Var2, fidVar2, vng.O(i7 | 1));
                                    break;
                                default:
                                    cd1Var.a(n351Var2, fidVar2, vng.O(i7 | 1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v.d = wlsVar;
                }
                break;
            default:
                bts btsVar3 = (bts) fidVar;
                btsVar3.g0(-1810814677);
                if ((i & 6) == 0) {
                    i3 = (btsVar3.k(n351Var) ? 4 : 2) | i;
                } else {
                    i3 = i;
                }
                if ((i & 48) == 0) {
                    i3 |= btsVar3.e(this) ? 32 : 16;
                }
                if (!btsVar3.V(i3 & 1, (i3 & 19) != 18)) {
                    btsVar = btsVar3;
                    btsVar.Y();
                } else if (!(n351Var instanceof xc1)) {
                    v2 = btsVar3.v();
                    if (v2 != null) {
                        wlsVar2 = new wls(this) { // from class: bd1
                            public final /* synthetic */ cd1 b;

                            {
                                this.b = this;
                            }

                            @Override // defpackage.wls
                            public final Object invoke(Object obj, Object obj2) {
                                int i6 = i5;
                                zy11 zy11Var = zy11.a;
                                int i7 = i;
                                n351 n351Var2 = n351Var;
                                cd1 cd1Var = this.b;
                                fid fidVar2 = (fid) obj;
                                ((Integer) obj2).getClass();
                                switch (i6) {
                                    case 0:
                                        cd1Var.a(n351Var2, fidVar2, vng.O(i7 | 1));
                                        break;
                                    default:
                                        cd1Var.a(n351Var2, fidVar2, vng.O(i7 | 1));
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                        v2.d = wlsVar2;
                        break;
                    }
                } else {
                    final lhg lhgVar = (lhg) btsVar3.m(mhg.a);
                    xc1 xc1Var = (xc1) n351Var;
                    btsVar = btsVar3;
                    cza1.a(xc1Var.c || !xc1Var.d, 0, null, null, wwg.S(811870290, true, new wls() { // from class: ru.yandex.taxi.logistics.sdk.deliverydashboard.ui.widget.b
                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            fid fidVar2 = (fid) obj;
                            int intValue = ((Integer) obj2).intValue();
                            bts btsVar4 = (bts) fidVar2;
                            boolean V = btsVar4.V(intValue & 1, (intValue & 3) != 2);
                            zy11 zy11Var = zy11.a;
                            if (!V) {
                                btsVar4.Y();
                                return zy11Var;
                            }
                            lhg lhgVar2 = lhg.this;
                            boolean e = btsVar4.e(lhgVar2);
                            n351 n351Var2 = n351Var;
                            boolean k = e | btsVar4.k(n351Var2);
                            Object Q = btsVar4.Q();
                            if (k || Q == did.a) {
                                Q = new AdsBannerWidget$Content$2$1$1(lhgVar2, n351Var2, null);
                                btsVar4.o0(Q);
                            }
                            zpn.e(btsVar4, (wls) Q, zy11Var);
                            qpa1.a((xc1) n351Var2, this.c, btsVar4, 0);
                            return zy11Var;
                        }
                    }, btsVar3), btsVar, HProv.ALG_CLASS_DATA_ENCRYPT);
                }
                v2 = btsVar.v();
                if (v2 != null) {
                    wlsVar2 = new wls(this) { // from class: bd1
                        public final /* synthetic */ cd1 b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i6 = i4;
                            zy11 zy11Var = zy11.a;
                            int i7 = i;
                            n351 n351Var2 = n351Var;
                            cd1 cd1Var = this.b;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).getClass();
                            switch (i6) {
                                case 0:
                                    cd1Var.a(n351Var2, fidVar2, vng.O(i7 | 1));
                                    break;
                                default:
                                    cd1Var.a(n351Var2, fidVar2, vng.O(i7 | 1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v2.d = wlsVar2;
                }
                break;
        }
    }
}
