package com.yandex.plus.webview.api.contract.message;

import defpackage.i45;
import defpackage.m6;
import defpackage.mn41;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.w3x;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.webview.api.contract.message.WebViewContractMessagesSender$sendMessage$1", f = "WebViewContractMessagesSender.kt", l = {36}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class WebViewContractMessagesSender$sendMessage$1 extends SuspendLambda implements wls {
    final /* synthetic */ w3x $jsEvaluator;
    final /* synthetic */ Object $message;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewContractMessagesSender$sendMessage$1(a aVar, Object obj, w3x w3xVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$message = obj;
        this.$jsEvaluator = w3xVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WebViewContractMessagesSender$sendMessage$1(this.this$0, this.$message, this.$jsEvaluator, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WebViewContractMessagesSender$sendMessage$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            Object obj2 = this.$message;
            this.label = 1;
            obj = a.a(aVar, obj2, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        String str = (String) obj;
        if (str != null) {
            w3x w3xVar = this.$jsEvaluator;
            a aVar2 = this.this$0;
            StringBuilder sb = new StringBuilder("__homeApp.response(");
            aVar2.getClass();
            sb.append(str);
            sb.append(')');
            String sb2 = sb.toString();
            mn41 t = ((i45) ((m6) w3xVar).b).t();
            if (t != null) {
                t.b(sb2);
            }
        }
        return zy11.a;
    }
}
