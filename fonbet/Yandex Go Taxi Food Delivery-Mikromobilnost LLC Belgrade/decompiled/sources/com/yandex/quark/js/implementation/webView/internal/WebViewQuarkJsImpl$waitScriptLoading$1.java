package com.yandex.quark.js.implementation.webView.internal;

import android.os.SystemClock;
import defpackage.aig0;
import defpackage.hig0;
import defpackage.iig0;
import defpackage.jig0;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.z83;
import defpackage.zy11;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.quark.js.implementation.webView.internal.WebViewQuarkJsImpl$waitScriptLoading$1", f = "WebViewQuarkJsImpl.kt", l = {159}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class WebViewQuarkJsImpl$waitScriptLoading$1 extends SuspendLambda implements wls {
    final /* synthetic */ long $loadingStart;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewQuarkJsImpl$waitScriptLoading$1(c cVar, long j, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$loadingStart = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WebViewQuarkJsImpl$waitScriptLoading$1(this.this$0, this.$loadingStart, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WebViewQuarkJsImpl$waitScriptLoading$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            mth mthVar = new mth(this.this$0.y.a, 18);
            this.label = 1;
            obj = e.y(mthVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        jig0 jig0Var = (jig0) obj;
        if (jig0Var instanceof hig0) {
            z83.i();
        } else {
            if (!(jig0Var instanceof iig0)) {
                w511.b();
                return null;
            }
            r0 r0Var = this.this$0.A.a;
            Boolean bool = Boolean.TRUE;
            r0Var.getClass();
            r0Var.m(null, bool);
            long uptimeMillis = SystemClock.uptimeMillis() - this.$loadingStart;
            this.this$0.B.b(new aig0(uptimeMillis));
            this.this$0.C.e("WebChat.QuarkJs.Loaded", uptimeMillis, TimeUnit.MILLISECONDS);
        }
        return zy11.a;
    }
}
