package com.yandex.passport.internal.ui.sloth;

import android.content.DialogInterface;
import androidx.appcompat.app.AlertDialog;
import com.yandex.passport.R;
import com.yandex.passport.internal.report.reporters.WebAmReporter$Companion$EventPlace;
import com.yandex.passport.internal.report.reporters.i1;
import com.yandex.passport.sloth.a1;
import com.yandex.passport.sloth.i0;
import com.yandex.passport.sloth.m0;
import defpackage.jl40;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class q implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ StandaloneSlothActivity b;
    public final /* synthetic */ i1 c;

    public /* synthetic */ q(StandaloneSlothActivity standaloneSlothActivity, i1 i1Var, int i) {
        this.a = i;
        this.b = standaloneSlothActivity;
        this.c = i1Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        i1 i1Var = this.c;
        final StandaloneSlothActivity standaloneSlothActivity = this.b;
        switch (i) {
            case 0:
                i0 i0Var = (i0) obj;
                if (!jl40.l(i0Var, com.yandex.passport.sloth.x.a)) {
                    i1Var.j(i0Var.toString(), WebAmReporter$Companion$EventPlace.STANDALONE);
                    break;
                } else {
                    standaloneSlothActivity.setResult(666);
                    standaloneSlothActivity.finish();
                    break;
                }
            default:
                a1 a1Var = (a1) obj;
                if (!jl40.l(a1Var, com.yandex.passport.sloth.d.a)) {
                    if (!(a1Var instanceof m0)) {
                        if (!jl40.l(a1Var, com.yandex.passport.sloth.b.a)) {
                            if (!(a1Var instanceof com.yandex.passport.sloth.m)) {
                                i1Var.j(com.yandex.passport.sloth.j.b(a1Var), WebAmReporter$Companion$EventPlace.STANDALONE);
                                break;
                            } else {
                                standaloneSlothActivity.processError((com.yandex.passport.sloth.m) a1Var);
                                break;
                            }
                        } else {
                            AlertDialog.a aVar = new AlertDialog.a(standaloneSlothActivity);
                            aVar.i(R.string.passport_fatal_error_dialog_text);
                            aVar.c(R.string.passport_error_unknown);
                            aVar.a();
                            aVar.setPositiveButton(R.string.passport_fatal_error_dialog_button, new DialogInterface.OnClickListener() { // from class: com.yandex.passport.internal.ui.sloth.StandaloneSlothActivity$bind$2$invokeSuspend$lambda$5$lambda$3$$inlined$positiveButton$1
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i2) {
                                    StandaloneSlothActivity.this.finish();
                                }
                            });
                            aVar.create().show();
                            break;
                        }
                    } else {
                        standaloneSlothActivity.processResult((m0) a1Var);
                        break;
                    }
                } else {
                    standaloneSlothActivity.finish();
                    break;
                }
        }
        return zy11Var;
    }
}
