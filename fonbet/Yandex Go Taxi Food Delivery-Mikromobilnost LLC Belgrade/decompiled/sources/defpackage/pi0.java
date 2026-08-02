package defpackage;

import com.adjust.sdk.Constants;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;
import ru.yandex.taxi.deeplinks.DeeplinkSource;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes8.dex */
public final class pi0 extends qi0 {
    public final yvf0 b;
    public final yvf0 c;
    public final yvf0 d;
    public final yvf0 e;
    public final fx60 f;
    public final yvf0 g;

    public pi0(yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, lf0 lf0Var, fx60 fx60Var, vd vdVar) {
        this.b = yvf0Var;
        this.c = yvf0Var2;
        this.d = yvf0Var3;
        this.e = lf0Var;
        this.f = fx60Var;
        this.g = vdVar;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final boolean b() {
        return false;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final Object c(final oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        mi0 mi0Var = (mi0) obj;
        final String a = mi0Var.a();
        if (a == null) {
            a = TariffOrderFlow.ORDER_FLOW_TAXI_KEY;
        }
        int i = oi0.a[mi0Var.b().ordinal()];
        final int i2 = 1;
        if (i != 1) {
            final int i3 = 2;
            fx60 fx60Var = this.f;
            if (i != 2) {
                final int i4 = 3;
                if (i == 3) {
                    fx60Var.a(Events$Zalogin$LoginContext.DEEPLINK, new sls() { // from class: ni0
                        @Override // defpackage.sls
                        public final Object invoke() {
                            int i5 = i2;
                            zy11 zy11Var = zy11.a;
                            String str = a;
                            pi0 pi0Var = this;
                            oep0 oep0Var2 = oep0Var;
                            switch (i5) {
                                case 0:
                                    ((pep0) oep0Var2).f((m950) pi0Var.e.get(), new jf0(str), hxx.a);
                                    break;
                                case 1:
                                    ((pep0) oep0Var2).f((m950) pi0Var.b.get(), new lk0(Constants.DEEPLINK, str), hxx.a);
                                    break;
                                case 2:
                                    ((pep0) oep0Var2).f((m950) pi0Var.c.get(), new cf0(Constants.DEEPLINK, str, 1), hxx.a);
                                    break;
                                default:
                                    ((pep0) oep0Var2).f((m950) pi0Var.d.get(), new jd0(Constants.DEEPLINK, str), hxx.a);
                                    break;
                            }
                            return zy11Var;
                        }
                    });
                } else if (i == 4) {
                    fx60Var.a(Events$Zalogin$LoginContext.DEEPLINK, new sls() { // from class: ni0
                        @Override // defpackage.sls
                        public final Object invoke() {
                            int i5 = i3;
                            zy11 zy11Var = zy11.a;
                            String str = a;
                            pi0 pi0Var = this;
                            oep0 oep0Var2 = oep0Var;
                            switch (i5) {
                                case 0:
                                    ((pep0) oep0Var2).f((m950) pi0Var.e.get(), new jf0(str), hxx.a);
                                    break;
                                case 1:
                                    ((pep0) oep0Var2).f((m950) pi0Var.b.get(), new lk0(Constants.DEEPLINK, str), hxx.a);
                                    break;
                                case 2:
                                    ((pep0) oep0Var2).f((m950) pi0Var.c.get(), new cf0(Constants.DEEPLINK, str, 1), hxx.a);
                                    break;
                                default:
                                    ((pep0) oep0Var2).f((m950) pi0Var.d.get(), new jd0(Constants.DEEPLINK, str), hxx.a);
                                    break;
                            }
                            return zy11Var;
                        }
                    });
                } else {
                    if (i != 5) {
                        w511.b();
                        return null;
                    }
                    fx60Var.a(Events$Zalogin$LoginContext.DEEPLINK, new sls() { // from class: ni0
                        @Override // defpackage.sls
                        public final Object invoke() {
                            int i5 = i4;
                            zy11 zy11Var = zy11.a;
                            String str = a;
                            pi0 pi0Var = this;
                            oep0 oep0Var2 = oep0Var;
                            switch (i5) {
                                case 0:
                                    ((pep0) oep0Var2).f((m950) pi0Var.e.get(), new jf0(str), hxx.a);
                                    break;
                                case 1:
                                    ((pep0) oep0Var2).f((m950) pi0Var.b.get(), new lk0(Constants.DEEPLINK, str), hxx.a);
                                    break;
                                case 2:
                                    ((pep0) oep0Var2).f((m950) pi0Var.c.get(), new cf0(Constants.DEEPLINK, str, 1), hxx.a);
                                    break;
                                default:
                                    ((pep0) oep0Var2).f((m950) pi0Var.d.get(), new jd0(Constants.DEEPLINK, str), hxx.a);
                                    break;
                            }
                            return zy11Var;
                        }
                    });
                }
            } else {
                final int i5 = 0;
                fx60Var.a(Events$Zalogin$LoginContext.DEEPLINK, new sls() { // from class: ni0
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i52 = i5;
                        zy11 zy11Var = zy11.a;
                        String str = a;
                        pi0 pi0Var = this;
                        oep0 oep0Var2 = oep0Var;
                        switch (i52) {
                            case 0:
                                ((pep0) oep0Var2).f((m950) pi0Var.e.get(), new jf0(str), hxx.a);
                                break;
                            case 1:
                                ((pep0) oep0Var2).f((m950) pi0Var.b.get(), new lk0(Constants.DEEPLINK, str), hxx.a);
                                break;
                            case 2:
                                ((pep0) oep0Var2).f((m950) pi0Var.c.get(), new cf0(Constants.DEEPLINK, str, 1), hxx.a);
                                break;
                            default:
                                ((pep0) oep0Var2).f((m950) pi0Var.d.get(), new jd0(Constants.DEEPLINK, str), hxx.a);
                                break;
                        }
                        return zy11Var;
                    }
                });
            }
        } else {
            ((pep0) oep0Var).f((m950) this.g.get(), new veb(a), hxx.a);
        }
        return zy11.a;
    }
}
