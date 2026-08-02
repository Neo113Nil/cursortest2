package com.yandex.passport.internal.ui.router;

import android.content.Context;
import com.yandex.passport.api.PassportSocialConfiguration;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.usecase.ui.a0;
import com.yandex.passport.internal.usecase.ui.c0;
import defpackage.bvf0;
import defpackage.ds31;
import defpackage.ffx;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tje;
import defpackage.yr31;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes2.dex */
public final class r extends yr31 {
    public final PassportProcessGlobalComponent b;
    public final c0 c;
    public final n0 w;

    public r() {
        PassportProcessGlobalComponent a = com.yandex.passport.internal.di.a.a();
        this.b = a;
        this.c = a.getLoadAccountsUseCase();
        this.w = ffx.c(0, 0, null, 7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0088, code lost:
    
        if (r9 == r1) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r8v7, types: [noh] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object W(r rVar, Context context, LoginProperties loginProperties, ContinuationImpl continuationImpl) {
        LoginRouterViewModel$createRoutingData$1 loginRouterViewModel$createRoutingData$1;
        int i;
        qoh h;
        Object Y;
        LoginProperties loginProperties2;
        rVar.getClass();
        if (continuationImpl instanceof LoginRouterViewModel$createRoutingData$1) {
            loginRouterViewModel$createRoutingData$1 = (LoginRouterViewModel$createRoutingData$1) continuationImpl;
            int i2 = loginRouterViewModel$createRoutingData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                loginRouterViewModel$createRoutingData$1.label = i2 - Integer.MIN_VALUE;
                Object obj = loginRouterViewModel$createRoutingData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = loginRouterViewModel$createRoutingData$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    h = tje.h(bvf0.a(loginRouterViewModel$createRoutingData$1.get_context()), null, CoroutineStart.LAZY, new LoginRouterViewModel$createRoutingData$accountsLoadPromise$1(rVar, loginProperties, null), 1);
                    if (loginProperties.isAdditionOnlyRequired() && context.getPackageManager().hasSystemFeature("android.software.leanback")) {
                        return new s(loginProperties);
                    }
                    loginRouterViewModel$createRoutingData$1.L$0 = rVar;
                    loginRouterViewModel$createRoutingData$1.L$1 = loginProperties;
                    loginRouterViewModel$createRoutingData$1.L$2 = h;
                    loginRouterViewModel$createRoutingData$1.label = 1;
                    Y = rVar.Y(loginProperties, h, loginRouterViewModel$createRoutingData$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        loginProperties2 = (LoginProperties) loginRouterViewModel$createRoutingData$1.L$0;
                        kotlin.b.b(obj);
                        return new u(loginProperties2, (ModernAccount) obj);
                    }
                    ?? r8 = (noh) loginRouterViewModel$createRoutingData$1.L$2;
                    loginProperties = (LoginProperties) loginRouterViewModel$createRoutingData$1.L$1;
                    r rVar2 = (r) loginRouterViewModel$createRoutingData$1.L$0;
                    kotlin.b.b(obj);
                    h = r8;
                    rVar = rVar2;
                    Y = obj;
                }
                if (((Boolean) Y).booleanValue()) {
                    return new t(loginProperties);
                }
                loginRouterViewModel$createRoutingData$1.L$0 = loginProperties;
                loginRouterViewModel$createRoutingData$1.L$1 = null;
                loginRouterViewModel$createRoutingData$1.L$2 = null;
                loginRouterViewModel$createRoutingData$1.label = 2;
                obj = rVar.X(h, loginProperties, loginRouterViewModel$createRoutingData$1);
                if (obj != coroutineSingletons) {
                    loginProperties2 = loginProperties;
                    return new u(loginProperties2, (ModernAccount) obj);
                }
                return coroutineSingletons;
            }
        }
        loginRouterViewModel$createRoutingData$1 = new LoginRouterViewModel$createRoutingData$1(rVar, continuationImpl);
        Object obj2 = loginRouterViewModel$createRoutingData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = loginRouterViewModel$createRoutingData$1.label;
        if (i != 0) {
        }
        if (((Boolean) Y).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object X(noh nohVar, LoginProperties loginProperties, ContinuationImpl continuationImpl) {
        LoginRouterViewModel$getSelectedAccount$1 loginRouterViewModel$getSelectedAccount$1;
        int i;
        if (continuationImpl instanceof LoginRouterViewModel$getSelectedAccount$1) {
            loginRouterViewModel$getSelectedAccount$1 = (LoginRouterViewModel$getSelectedAccount$1) continuationImpl;
            int i2 = loginRouterViewModel$getSelectedAccount$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                loginRouterViewModel$getSelectedAccount$1.label = i2 - Integer.MIN_VALUE;
                Object obj = loginRouterViewModel$getSelectedAccount$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = loginRouterViewModel$getSelectedAccount$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    loginRouterViewModel$getSelectedAccount$1.L$0 = loginProperties;
                    loginRouterViewModel$getSelectedAccount$1.L$1 = this;
                    loginRouterViewModel$getSelectedAccount$1.label = 1;
                    obj = nohVar.k(loginRouterViewModel$getSelectedAccount$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (r) loginRouterViewModel$getSelectedAccount$1.L$1;
                    loginProperties = (LoginProperties) loginRouterViewModel$getSelectedAccount$1.L$0;
                    kotlin.b.b(obj);
                }
                com.yandex.passport.internal.b bVar = ((a0) obj).a;
                this.getClass();
                if (loginProperties.getSelectedUid() == null) {
                    return bVar.e(com.yandex.passport.internal.util.p.B(loginProperties.getSelectedUid()));
                }
                if (loginProperties.getLoginHint() == null) {
                    return null;
                }
                return com.yandex.passport.common.permission.b.b(bVar.a, null, loginProperties.getLoginHint(), bVar.b);
            }
        }
        loginRouterViewModel$getSelectedAccount$1 = new LoginRouterViewModel$getSelectedAccount$1(this, continuationImpl);
        Object obj3 = loginRouterViewModel$getSelectedAccount$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = loginRouterViewModel$getSelectedAccount$1.label;
        if (i != 0) {
        }
        com.yandex.passport.internal.b bVar2 = ((a0) obj3).a;
        this.getClass();
        if (loginProperties.getSelectedUid() == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Y(LoginProperties loginProperties, qoh qohVar, ContinuationImpl continuationImpl) {
        LoginRouterViewModel$isGimapMailish$1 loginRouterViewModel$isGimapMailish$1;
        int i;
        if (continuationImpl instanceof LoginRouterViewModel$isGimapMailish$1) {
            loginRouterViewModel$isGimapMailish$1 = (LoginRouterViewModel$isGimapMailish$1) continuationImpl;
            int i2 = loginRouterViewModel$isGimapMailish$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                loginRouterViewModel$isGimapMailish$1.label = i2 - Integer.MIN_VALUE;
                Object obj = loginRouterViewModel$isGimapMailish$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = loginRouterViewModel$isGimapMailish$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (loginProperties.getSocialConfiguration() == PassportSocialConfiguration.MAILISH_OTHER) {
                        return Boolean.TRUE;
                    }
                    loginRouterViewModel$isGimapMailish$1.label = 1;
                    obj = X(qohVar, loginProperties, loginRouterViewModel$isGimapMailish$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                ModernAccount modernAccount = (ModernAccount) obj;
                return Boolean.valueOf(modernAccount == null ? "OTHER".equals(modernAccount.getSocialProviderCode()) : false);
            }
        }
        loginRouterViewModel$isGimapMailish$1 = new LoginRouterViewModel$isGimapMailish$1(this, continuationImpl);
        Object obj3 = loginRouterViewModel$isGimapMailish$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = loginRouterViewModel$isGimapMailish$1.label;
        if (i != 0) {
        }
        ModernAccount modernAccount2 = (ModernAccount) obj3;
        return Boolean.valueOf(modernAccount2 == null ? "OTHER".equals(modernAccount2.getSocialProviderCode()) : false);
    }

    public final void Z(LoginRouterActivity loginRouterActivity, LoginProperties loginProperties) {
        tje.N(ds31.a(this), null, null, new LoginRouterViewModel$onFirstStart$1(this, loginRouterActivity, loginProperties, null), 3);
    }
}
