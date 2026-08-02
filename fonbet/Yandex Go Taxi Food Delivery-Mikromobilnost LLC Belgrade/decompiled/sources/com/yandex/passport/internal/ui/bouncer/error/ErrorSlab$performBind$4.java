package com.yandex.passport.internal.ui.bouncer.error;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.widget.Toast;
import com.yandex.passport.R;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.bouncer.error.ErrorSlab$performBind$4", f = "ErrorSlab.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ErrorSlab$performBind$4 extends SuspendLambda implements tls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ErrorSlab$performBind$4(a aVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ErrorSlab$performBind$4(this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ErrorSlab$performBind$4 errorSlab$performBind$4 = (ErrorSlab$performBind$4) create((Continuation) obj);
        zy11 zy11Var = zy11.a;
        errorSlab$performBind$4.invokeSuspend(zy11Var);
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
        a aVar = this.this$0;
        com.yandex.passport.internal.clipboard.a aVar2 = aVar.I;
        d dVar = aVar.E.w;
        StringBuilder sb = new StringBuilder();
        sb.append((Object) dVar.y.getText());
        sb.append('\n');
        sb.append((Object) dVar.z.getText());
        sb.append('\n');
        sb.append((Object) dVar.A.getText());
        sb.append('\n');
        sb.append((Object) dVar.B.getText());
        String sb2 = sb.toString();
        aVar2.getClass();
        ClipData newPlainText = ClipData.newPlainText("errorInfo", sb2);
        ClipboardManager clipboardManager = aVar2.a;
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(newPlainText);
        }
        Context context = this.this$0.E.a;
        Toast.makeText(context, context.getString(R.string.passport_error_slab_toast_text), 0).show();
        return zy11.a;
    }
}
