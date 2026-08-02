package com.yandex.passport.internal.ui.sloth.authsdk;

import com.yandex.passport.internal.report.reporters.WebAmReporter$Companion$EventPlace;
import com.yandex.passport.internal.report.reporters.i1;
import com.yandex.passport.sloth.a1;
import defpackage.jl40;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class h implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ AuthSdkSlothActivity b;
    public final /* synthetic */ i1 c;

    public /* synthetic */ h(AuthSdkSlothActivity authSdkSlothActivity, i1 i1Var, int i) {
        this.a = i;
        this.b = authSdkSlothActivity;
        this.c = i1Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        i1 i1Var = this.c;
        AuthSdkSlothActivity authSdkSlothActivity = this.b;
        switch (i) {
            case 0:
                com.yandex.passport.sloth.i0 i0Var = (com.yandex.passport.sloth.i0) obj;
                if (!jl40.l(i0Var, com.yandex.passport.sloth.x.a)) {
                    if (!(i0Var instanceof com.yandex.passport.sloth.c0)) {
                        i1Var.j(i0Var.toString(), WebAmReporter$Companion$EventPlace.AUTH_SDK);
                        break;
                    } else {
                        authSdkSlothActivity.relogin();
                        break;
                    }
                } else {
                    authSdkSlothActivity.chooseAccount();
                    break;
                }
            default:
                a1 a1Var = (a1) obj;
                if (!jl40.l(a1Var, com.yandex.passport.sloth.d.a)) {
                    if (!(a1Var instanceof com.yandex.passport.sloth.c)) {
                        if (!jl40.l(a1Var, com.yandex.passport.sloth.b.a)) {
                            if (!(a1Var instanceof com.yandex.passport.sloth.m)) {
                                i1Var.j(com.yandex.passport.sloth.j.b(a1Var), WebAmReporter$Companion$EventPlace.AUTH_SDK);
                                break;
                            } else {
                                authSdkSlothActivity.processError((com.yandex.passport.sloth.m) a1Var);
                                break;
                            }
                        } else {
                            authSdkSlothActivity.errorAlert();
                            break;
                        }
                    } else {
                        com.yandex.passport.sloth.c cVar = (com.yandex.passport.sloth.c) a1Var;
                        com.yandex.passport.internal.ui.c.k(authSdkSlothActivity, o.b(new f(cVar.a, cVar.b, cVar.c)));
                        break;
                    }
                } else {
                    com.yandex.passport.internal.ui.c.k(authSdkSlothActivity, o.b(b.a));
                    break;
                }
        }
        return zy11Var;
    }
}
