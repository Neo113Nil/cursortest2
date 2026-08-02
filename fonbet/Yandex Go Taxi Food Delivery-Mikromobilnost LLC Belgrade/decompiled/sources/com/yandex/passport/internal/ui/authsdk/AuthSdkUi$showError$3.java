package com.yandex.passport.internal.ui.authsdk;

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
@mvg(c = "com.yandex.passport.internal.ui.authsdk.AuthSdkUi$showError$3", f = "AuthSdkUi.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AuthSdkUi$showError$3 extends SuspendLambda implements tls {
    int label;
    final /* synthetic */ p this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthSdkUi$showError$3(p pVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new AuthSdkUi$showError$3(this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        AuthSdkUi$showError$3 authSdkUi$showError$3 = (AuthSdkUi$showError$3) create((Continuation) obj);
        zy11 zy11Var = zy11.a;
        authSdkUi$showError$3.invokeSuspend(zy11Var);
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
        p pVar = this.this$0;
        com.yandex.passport.internal.clipboard.a aVar = pVar.y;
        com.yandex.passport.internal.ui.bouncer.error.d dVar = pVar.c.w;
        StringBuilder sb = new StringBuilder();
        sb.append((Object) dVar.y.getText());
        sb.append('\n');
        sb.append((Object) dVar.z.getText());
        sb.append('\n');
        sb.append((Object) dVar.A.getText());
        sb.append('\n');
        sb.append((Object) dVar.B.getText());
        String sb2 = sb.toString();
        aVar.getClass();
        ClipData newPlainText = ClipData.newPlainText("errorInfo", sb2);
        ClipboardManager clipboardManager = aVar.a;
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(newPlainText);
        }
        Context context = this.this$0.c.a;
        Toast.makeText(context, context.getString(R.string.passport_error_slab_toast_text), 0).show();
        return zy11.a;
    }
}
