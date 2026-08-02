package com.yandex.quark.js.implementation.webView.internal;

import defpackage.dig0;
import defpackage.eig0;
import defpackage.hg41;
import defpackage.jq6;
import defpackage.mm41;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.om41;
import defpackage.tse;
import defpackage.wls;
import defpackage.y3x0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.quark.js.implementation.webView.internal.WebViewCommandExecutor$onWebViewResumed$1", f = "WebViewCommandExecutor.kt", l = {HProv.PP_RESERVED1}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class WebViewCommandExecutor$onWebViewResumed$1 extends SuspendLambda implements wls {
    final /* synthetic */ hg41 $webView;
    Object L$0;
    int label;
    final /* synthetic */ om41 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewCommandExecutor$onWebViewResumed$1(om41 om41Var, hg41 hg41Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = om41Var;
        this.$webView = hg41Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WebViewCommandExecutor$onWebViewResumed$1(this.this$0, this.$webView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WebViewCommandExecutor$onWebViewResumed$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x002f -> B:5:0x0032). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        jq6 jq6Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            kotlinx.coroutines.channels.a aVar = this.this$0.z;
            aVar.getClass();
            jq6Var = new jq6(aVar);
            this.L$0 = jq6Var;
            this.label = 1;
            obj = jq6Var.a(this);
            if (obj == coroutineSingletons) {
            }
            if (((Boolean) obj).booleanValue()) {
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jq6Var = (jq6) this.L$0;
            kotlin.b.b(obj);
            if (((Boolean) obj).booleanValue()) {
                mm41 mm41Var = (mm41) jq6Var.b();
                boolean z = this.this$0.y;
                om41 om41Var = this.this$0;
                if (z) {
                    om41Var.c.b(new dig0(mm41Var.b()));
                    ((y3x0) this.$webView).e.evaluateJavascript(mm41Var.a(), null);
                } else {
                    om41Var.c.b(new eig0(mm41Var.b()));
                    this.this$0.a.e("DefaultCommandExecutor", "Skip command on flow " + mm41Var.b() + ", because command executor is not ready");
                }
                this.L$0 = jq6Var;
                this.label = 1;
                obj = jq6Var.a(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                if (((Boolean) obj).booleanValue()) {
                    return zy11.a;
                }
            }
        }
    }
}
