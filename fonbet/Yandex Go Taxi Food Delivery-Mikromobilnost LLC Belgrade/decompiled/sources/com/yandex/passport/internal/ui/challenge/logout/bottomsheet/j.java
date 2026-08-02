package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import defpackage.jl40;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zy11;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class j implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ LogoutBottomSheetActivity b;

    public /* synthetic */ j(LogoutBottomSheetActivity logoutBottomSheetActivity, int i) {
        this.a = i;
        this.b = logoutBottomSheetActivity;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        LogoutBottomSheetActivity logoutBottomSheetActivity = this.b;
        switch (i) {
            case 0:
                t0 t0Var = (t0) obj;
                if (!(t0Var instanceof s0)) {
                    if (!(t0Var instanceof q0)) {
                        if (!(t0Var instanceof r0)) {
                            if (!jl40.l(t0Var, p0.a)) {
                                w511.b();
                                break;
                            } else {
                                logoutBottomSheetActivity.setResult(4);
                                logoutBottomSheetActivity.finish();
                            }
                        } else {
                            com.yandex.passport.internal.ui.c.j(logoutBottomSheetActivity, ((r0) t0Var).a);
                        }
                    } else {
                        logoutBottomSheetActivity.delete(((q0) t0Var).a);
                    }
                } else {
                    s0 s0Var = (s0) t0Var;
                    logoutBottomSheetActivity.logout(s0Var.a, s0Var.b);
                }
                break;
            default:
                v0 v0Var = (v0) obj;
                if (v0Var == null) {
                    w511.b();
                    break;
                } else {
                    logoutBottomSheetActivity.showButtons(v0Var);
                    break;
                }
        }
        return null;
    }
}
