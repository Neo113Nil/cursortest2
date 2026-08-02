package com.yandex.passport.internal.ui.sloth;

import android.content.DialogInterface;
import androidx.appcompat.app.AlertDialog;
import com.yandex.passport.R;
import com.yandex.passport.internal.report.reporters.WebAmReporter$Companion$EventPlace;
import com.yandex.passport.internal.report.reporters.i1;
import com.yandex.passport.sloth.a1;
import com.yandex.passport.sloth.m0;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/passport/sloth/a1;", TarifficatorScenarioActivity.RESULT_KEY, "Lzy11;", "<anonymous>", "(Lcom/yandex/passport/sloth/a1;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.sloth.StandaloneSlothComposeActivity$onCreate$3", f = "StandaloneSlothComposeActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class StandaloneSlothComposeActivity$onCreate$3 extends SuspendLambda implements wls {
    final /* synthetic */ i1 $webAmReporter;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ StandaloneSlothComposeActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StandaloneSlothComposeActivity$onCreate$3(StandaloneSlothComposeActivity standaloneSlothComposeActivity, i1 i1Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = standaloneSlothComposeActivity;
        this.$webAmReporter = i1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        StandaloneSlothComposeActivity$onCreate$3 standaloneSlothComposeActivity$onCreate$3 = new StandaloneSlothComposeActivity$onCreate$3(this.this$0, this.$webAmReporter, continuation);
        standaloneSlothComposeActivity$onCreate$3.L$0 = obj;
        return standaloneSlothComposeActivity$onCreate$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        StandaloneSlothComposeActivity$onCreate$3 standaloneSlothComposeActivity$onCreate$3 = (StandaloneSlothComposeActivity$onCreate$3) create((a1) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        standaloneSlothComposeActivity$onCreate$3.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        a1 a1Var = (a1) this.L$0;
        if (a1Var instanceof com.yandex.passport.sloth.d) {
            this.this$0.finish();
        } else if (a1Var instanceof m0) {
            this.this$0.processResult((m0) a1Var);
        } else if (jl40.l(a1Var, com.yandex.passport.sloth.b.a)) {
            final StandaloneSlothComposeActivity standaloneSlothComposeActivity = this.this$0;
            AlertDialog.a aVar = new AlertDialog.a(standaloneSlothComposeActivity);
            aVar.i(R.string.passport_fatal_error_dialog_text);
            aVar.c(R.string.passport_error_unknown);
            aVar.a();
            aVar.setPositiveButton(R.string.passport_fatal_error_dialog_button, new DialogInterface.OnClickListener() { // from class: com.yandex.passport.internal.ui.sloth.StandaloneSlothComposeActivity$onCreate$3$invokeSuspend$lambda$1$$inlined$positiveButton$1
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    StandaloneSlothComposeActivity.this.finish();
                }
            });
            aVar.create().show();
        } else if (a1Var instanceof com.yandex.passport.sloth.m) {
            this.this$0.processError((com.yandex.passport.sloth.m) a1Var);
        } else {
            this.$webAmReporter.j(com.yandex.passport.sloth.j.b(a1Var), WebAmReporter$Companion$EventPlace.STANDALONE);
        }
        return zy11.a;
    }
}
