package com.yandex.passport.internal.ui.bouncer.model.middleware;

import com.yandex.passport.api.PassportAccountType;
import com.yandex.passport.api.PassportSocialConfiguration;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.properties.BindPhoneProperties;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.report.jd;
import com.yandex.passport.internal.report.k2;
import com.yandex.passport.internal.ui.bouncer.model.w1;
import com.yandex.passport.internal.ui.domik.DomikExternalAuthRequest;
import com.yandex.passport.sloth.data.AccountForProfile;
import com.yandex.passport.sloth.data.SlothParams;
import com.yandex.passport.sloth.dependencies.SlothLoginProperties;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes2.dex */
public final class b1 implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ c1 b;

    public b1(vpr vprVar, c1 c1Var) {
        this.a = vprVar;
        this.b = c1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        if (r9 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0072, code lost:
    
        if (r9 == null) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01f6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ShowMansionMiddleware$accept$$inlined$map$1$2$1 showMansionMiddleware$accept$$inlined$map$1$2$1;
        int i;
        Object pVar;
        Object obj2;
        Object obj3;
        com.yandex.passport.sloth.data.c0 tVar;
        String loginHint;
        if (continuation instanceof ShowMansionMiddleware$accept$$inlined$map$1$2$1) {
            showMansionMiddleware$accept$$inlined$map$1$2$1 = (ShowMansionMiddleware$accept$$inlined$map$1$2$1) continuation;
            int i2 = showMansionMiddleware$accept$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                showMansionMiddleware$accept$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj4 = showMansionMiddleware$accept$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = showMansionMiddleware$accept$$inlined$map$1$2$1.label;
                AccountForProfile accountForProfile = null;
                if (i != 0) {
                    kotlin.b.b(obj4);
                    com.yandex.passport.internal.ui.bouncer.model.d0 d0Var = (com.yandex.passport.internal.ui.bouncer.model.d0) obj;
                    LoginProperties loginProperties = d0Var.a;
                    String str = d0Var.h;
                    List list = d0Var.b;
                    ModernAccount modernAccount = d0Var.c;
                    if (loginProperties.getSocialRegistrationProperties().getUid() == null && loginProperties.getSocialConfiguration() == null && !loginProperties.getFilter().isOnlySupported(PassportAccountType.PHONISH)) {
                        if (modernAccount != null) {
                            Object accountType = modernAccount.getAccountType();
                            obj2 = accountType;
                        }
                        obj2 = Boolean.FALSE;
                        if (obj2 != PassportAccountType.SOCIAL) {
                            if (modernAccount != null) {
                                Object accountType2 = modernAccount.getAccountType();
                                obj3 = accountType2;
                            }
                            obj3 = Boolean.FALSE;
                            if (obj3 != PassportAccountType.MAILISH) {
                                BindPhoneProperties bindPhoneProperties = loginProperties.getBindPhoneProperties();
                                c1 c1Var = this.b;
                                if (bindPhoneProperties != null) {
                                    Uid B = com.yandex.passport.internal.util.p.B(loginProperties.getBindPhoneProperties().getUid());
                                    ModernAccount modernAccount2 = d0Var.d;
                                    tVar = new com.yandex.passport.sloth.data.s(B, modernAccount2 != null ? modernAccount2.getLocationId() : 0L, loginProperties.getBindPhoneProperties().getPhoneNumber(), loginProperties.getBindPhoneProperties().isPhoneEditable(), com.yandex.passport.internal.properties.u.i(loginProperties));
                                    com.yandex.passport.internal.report.reporters.m mVar = c1Var.b;
                                    String valueOf = String.valueOf(loginProperties.getBindPhoneProperties().getUid().getValue());
                                    mVar.getClass();
                                    mVar.f(k2.w, new jd(valueOf, 3));
                                } else if (loginProperties.getTurboAuthParams() != null) {
                                    tVar = new com.yandex.passport.sloth.data.z(loginProperties.getTurboAuthParams().getPhoneNumber(), loginProperties.getTurboAuthParams().getEmail(), loginProperties.getTurboAuthParams().getFirstName(), loginProperties.getTurboAuthParams().getLastName(), com.yandex.passport.internal.properties.u.i(loginProperties));
                                } else if (loginProperties.isRegistrationOnlyRequired()) {
                                    SlothLoginProperties i3 = com.yandex.passport.internal.properties.u.i(loginProperties);
                                    boolean z = !list.isEmpty();
                                    Uid uid = d0Var.g;
                                    if (uid != null) {
                                        ModernAccount e = c1Var.c.b(false).e(uid);
                                        accountForProfile = new AccountForProfile(uid, e != null ? e.getMasterUid() : null);
                                    }
                                    tVar = new com.yandex.passport.sloth.data.w(i3, z, accountForProfile, str);
                                } else if (loginProperties.getSelectedUid() != null) {
                                    if (modernAccount == null || (loginHint = modernAccount.getNativeDefaultEmail()) == null) {
                                        loginHint = loginProperties.getLoginHint();
                                    }
                                    tVar = new com.yandex.passport.sloth.data.x(loginHint, com.yandex.passport.internal.util.p.B(loginProperties.getSelectedUid()), loginProperties.getVisualProperties().isReloginEditable(), com.yandex.passport.internal.properties.u.i(loginProperties));
                                } else {
                                    tVar = loginProperties.getVisualProperties().isPreferPhonishAuth() ? new com.yandex.passport.sloth.data.t(com.yandex.passport.internal.properties.u.i(loginProperties)) : new com.yandex.passport.sloth.data.p(loginProperties.getLoginHint(), com.yandex.passport.internal.properties.u.i(loginProperties), !list.isEmpty(), str);
                                }
                                pVar = new com.yandex.passport.internal.ui.bouncer.model.j0(new SlothParams(tVar, com.yandex.passport.internal.util.p.u(loginProperties.getFilter().getPrimaryEnvironment()), null, com.yandex.passport.internal.properties.u.J(loginProperties.getWebAmProperties(), ((Boolean) c1Var.a.b(com.yandex.passport.internal.flags.q.z)).booleanValue()), 4, null));
                                showMansionMiddleware$accept$$inlined$map$1$2$1.label = 1;
                                if (this.a.emit(pVar, showMansionMiddleware$accept$$inlined$map$1$2$1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                        }
                    }
                    ModernAccount modernAccount3 = d0Var.c;
                    boolean z2 = d0Var.e;
                    boolean z3 = d0Var.f;
                    PassportSocialConfiguration socialConfiguration = loginProperties.getSocialConfiguration();
                    pVar = new com.yandex.passport.internal.ui.bouncer.model.p(new w1(loginProperties, z3, list, modernAccount3, z2, socialConfiguration != null ? new DomikExternalAuthRequest.Social(com.yandex.passport.internal.a0.V(socialConfiguration)) : null, 64));
                    showMansionMiddleware$accept$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(pVar, showMansionMiddleware$accept$$inlined$map$1$2$1) == coroutineSingletons) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj4);
                }
                return zy11.a;
            }
        }
        showMansionMiddleware$accept$$inlined$map$1$2$1 = new ShowMansionMiddleware$accept$$inlined$map$1$2$1(this, continuation);
        Object obj42 = showMansionMiddleware$accept$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = showMansionMiddleware$accept$$inlined$map$1$2$1.label;
        AccountForProfile accountForProfile2 = null;
        if (i != 0) {
        }
        return zy11.a;
    }
}
