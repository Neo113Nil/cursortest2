package defpackage;

import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.dashboard.ui.state.SpacerState;

/* loaded from: classes5.dex */
public final class kkt0 extends a151 {
    public kkt0() {
        super("spacer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.a151
    public final void a(final n351 n351Var, fid fidVar, final int i) {
        int i2;
        aii0 v;
        wls wlsVar;
        float f;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-2016569623);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (btsVar.k(n351Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        final int i4 = 1;
        if (!btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            btsVar.Y();
        } else {
            if (!(n351Var instanceof SpacerState)) {
                v = btsVar.v();
                if (v != null) {
                    wlsVar = new wls(this) { // from class: gkt0
                        public final /* synthetic */ kkt0 b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = r4;
                            zy11 zy11Var = zy11.a;
                            int i6 = i;
                            n351 n351Var2 = n351Var;
                            kkt0 kkt0Var = this.b;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    kkt0Var.a(n351Var2, fidVar2, vng.O(i6 | 1));
                                    break;
                                default:
                                    kkt0Var.a(n351Var2, fidVar2, vng.O(i6 | 1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v.d = wlsVar;
                }
                return;
            }
            SpacerState spacerState = (SpacerState) n351Var;
            int i5 = ikt0.a[spacerState.c.ordinal()];
            if (i5 == 1) {
                f = 8.0f;
            } else if (i5 == 2) {
                f = 12.0f;
            } else if (i5 == 3) {
                f = 16.0f;
            } else {
                if (i5 != 4) {
                    w511.b();
                    return;
                }
                f = 24.0f;
            }
            cza1.a((spacerState.d || !spacerState.f) ? 1 : 0, 0, null, null, wwg.S(-1132406640, true, new k0(f, i3), btsVar), btsVar, HProv.ALG_CLASS_DATA_ENCRYPT);
        }
        v = btsVar.v();
        if (v != null) {
            wlsVar = new wls(this) { // from class: gkt0
                public final /* synthetic */ kkt0 b;

                {
                    this.b = this;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i52 = i4;
                    zy11 zy11Var = zy11.a;
                    int i6 = i;
                    n351 n351Var2 = n351Var;
                    kkt0 kkt0Var = this.b;
                    fid fidVar2 = (fid) obj;
                    ((Integer) obj2).getClass();
                    switch (i52) {
                        case 0:
                            kkt0Var.a(n351Var2, fidVar2, vng.O(i6 | 1));
                            break;
                        default:
                            kkt0Var.a(n351Var2, fidVar2, vng.O(i6 | 1));
                            break;
                    }
                    return zy11Var;
                }
            };
            v.d = wlsVar;
        }
    }
}
