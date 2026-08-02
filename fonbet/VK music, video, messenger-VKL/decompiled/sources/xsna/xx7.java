package xsna;

import androidx.compose.runtime.a;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.SpinnerSize;
import com.vk.core.compose.component.defaults.SpinnerState;
import com.vk.ecomm.onlinebooking.impl.services.presentation.model.a;
import com.vk.ecomm.onlinebooking.impl.services.presentation.ui.BookingServicesScreenKt;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class xx7 implements yzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ izs c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ xx7(com.vk.ecomm.onlinebooking.impl.services.presentation.model.a aVar, izs izsVar, gzs gzsVar) {
        this.d = aVar;
        this.c = izsVar;
        this.e = gzsVar;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                com.vk.ecomm.onlinebooking.impl.services.presentation.model.a aVar = (com.vk.ecomm.onlinebooking.impl.services.presentation.model.a) this.d;
                gzs gzsVar = (gzs) this.e;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar2.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(80334470, intValue, -1, "com.vk.ecomm.onlinebooking.impl.services.presentation.ui.BookingServicesView.<anonymous> (BookingServicesScreen.kt:149)");
                    }
                    a.InterfaceC0987a interfaceC0987a = aVar.d;
                    if (interfaceC0987a instanceof a.InterfaceC0987a.c) {
                        aVar2.K(-107981830);
                        zfr0.f(SpinnerState.Loading, txj0.d(q630.a.a, 1.0f), null, 0L, SpinnerSize.Size56, null, aVar2, 24630, 44);
                        aVar2.j();
                    } else {
                        boolean z = interfaceC0987a instanceof a.InterfaceC0987a.b;
                        izs izsVar = this.c;
                        a.C0011a.C0012a c0012a = a.C0011a.a;
                        if (z) {
                            aVar2.K(-107973459);
                            com.vk.ecomm.onlinebooking.impl.common.a aVar3 = ((a.InterfaceC0987a.b) interfaceC0987a).a.a;
                            boolean J = aVar2.J(izsVar) | aVar2.J(aVar);
                            Object x = aVar2.x();
                            if (J || x == c0012a) {
                                x = new cg1(3, izsVar, aVar);
                                aVar2.R(x);
                            }
                            iq7.a(aVar3, (gzs) x, aVar2, 0);
                            aVar2.j();
                        } else {
                            if (!(interfaceC0987a instanceof a.InterfaceC0987a.C0988a)) {
                                throw alb0.c(-107984450, aVar2);
                            }
                            aVar2.K(948021794);
                            BookingServicesScreenKt.j((a.InterfaceC0987a.C0988a) interfaceC0987a, aVar.b, izsVar, aVar2, 0);
                            s3q0 s3q0Var = s3q0.a;
                            boolean J2 = aVar2.J(gzsVar);
                            Object x2 = aVar2.x();
                            if (J2 || x2 == c0012a) {
                                x2 = new BookingServicesScreenKt.b(gzsVar, null);
                                aVar2.R(x2);
                            }
                            bap.g(s3q0Var, (wzs) x2, aVar2, 6);
                            aVar2.j();
                        }
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            default:
                hh80 hh80Var = (hh80) this.d;
                mc90 mc90Var = (mc90) this.e;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(348202787, intValue2, -1, "com.vk.onboardingpromo.impl.ui.view.ButtonPagerComponent.<anonymous> (OnboardingPromoFullscreenSlides.kt:371)");
                }
                qg80 qg80Var = ((dh80) hh80Var.c.get(mc90Var.r())).a;
                q630 h = txj0.h(txj0.f(s200.E(ahn.E(q630.a.a, "buttonContinue"), kqu0.w, kqu0.v), 1.0f), 44);
                bn20 z2 = hr80.z();
                ButtonSize buttonSize = ButtonSize.Large;
                r5j0 x3 = z2.x(6, aVar4);
                frv0 y = hr80.z().y(buttonSize, aVar4, 6);
                bn20 z3 = hr80.z();
                long h2 = pf80.h(true, hh80Var.d.d.d, aVar4);
                z3.getClass();
                mgu0 a = op8.a(h2, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, aVar4, 0, 0, IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW);
                izs izsVar2 = this.c;
                boolean J3 = aVar4.J(izsVar2) | aVar4.J(qg80Var) | aVar4.J(mc90Var);
                Object x4 = aVar4.x();
                if (J3 || x4 == a.C0011a.a) {
                    x4 = new aq3(izsVar2, qg80Var, mc90Var, 2);
                    aVar4.R(x4);
                }
                bhu0.f((gzs) x4, h, false, null, null, null, y, null, x3, a, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, false, kai.c(-60735444, new un7(hh80Var, 2), aVar4), aVar4, 0, 1572864, 64700);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ xx7(hh80 hh80Var, mc90 mc90Var, izs izsVar) {
        this.d = hh80Var;
        this.e = mc90Var;
        this.c = izsVar;
    }
}
