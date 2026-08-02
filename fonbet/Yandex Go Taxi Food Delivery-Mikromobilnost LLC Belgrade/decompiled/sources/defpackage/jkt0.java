package defpackage;

import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.dashboard.ui.state.SpacerState;

/* loaded from: classes5.dex */
public final class jkt0 extends a151 {
    public jkt0() {
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
        btsVar.g0(-728946015);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(n351Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        final int i3 = 1;
        if (!btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            btsVar.Y();
        } else {
            if (!(n351Var instanceof SpacerState)) {
                v = btsVar.v();
                if (v != null) {
                    wlsVar = new wls(this) { // from class: fkt0
                        public final /* synthetic */ jkt0 b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = r4;
                            zy11 zy11Var = zy11.a;
                            int i5 = i;
                            n351 n351Var2 = n351Var;
                            jkt0 jkt0Var = this.b;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).getClass();
                            switch (i4) {
                                case 0:
                                    jkt0Var.a(n351Var2, fidVar2, vng.O(i5 | 1));
                                    break;
                                default:
                                    jkt0Var.a(n351Var2, fidVar2, vng.O(i5 | 1));
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
            int i4 = hkt0.a[spacerState.c.ordinal()];
            int i5 = 3;
            if (i4 == 1) {
                f = 8.0f;
            } else if (i4 == 2) {
                f = 12.0f;
            } else if (i4 == 3) {
                f = 16.0f;
            } else {
                if (i4 != 4) {
                    w511.b();
                    return;
                }
                f = 24.0f;
            }
            cza1.a((spacerState.d || !spacerState.f) ? 1 : 0, 0, null, null, wwg.S(-627018360, true, new k0(f, i5), btsVar), btsVar, HProv.ALG_CLASS_DATA_ENCRYPT);
        }
        v = btsVar.v();
        if (v != null) {
            wlsVar = new wls(this) { // from class: fkt0
                public final /* synthetic */ jkt0 b;

                {
                    this.b = this;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i42 = i3;
                    zy11 zy11Var = zy11.a;
                    int i52 = i;
                    n351 n351Var2 = n351Var;
                    jkt0 jkt0Var = this.b;
                    fid fidVar2 = (fid) obj;
                    ((Integer) obj2).getClass();
                    switch (i42) {
                        case 0:
                            jkt0Var.a(n351Var2, fidVar2, vng.O(i52 | 1));
                            break;
                        default:
                            jkt0Var.a(n351Var2, fidVar2, vng.O(i52 | 1));
                            break;
                    }
                    return zy11Var;
                }
            };
            v.d = wlsVar;
        }
    }

    @Override // defpackage.a151
    public final boolean b(fid fidVar) {
        bts btsVar = (bts) fidVar;
        btsVar.e0(265327645);
        btsVar.t(false);
        return false;
    }
}
