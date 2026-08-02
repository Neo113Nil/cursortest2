package com.yandex.fintechsdk.features.webview.internal.presentation;

import com.yandex.fintechsdk.entities.environment.DefaultEnvironment;
import defpackage.dn90;
import defpackage.ds31;
import defpackage.ek;
import defpackage.evu0;
import defpackage.hn90;
import defpackage.mt41;
import defpackage.mua1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qk3;
import defpackage.tje;
import defpackage.v7w;
import defpackage.wls;
import defpackage.xk3;
import defpackage.zu41;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lv7w;", "Ldu41;", "Lot41;", "Lzy11;", "<anonymous>", "(Lv7w;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.fintechsdk.features.webview.internal.presentation.WebViewViewModel$onCreateView$1", f = "WebViewViewModel.kt", l = {52, 60}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class WebViewViewModel$onCreateView$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewViewModel$onCreateView$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        WebViewViewModel$onCreateView$1 webViewViewModel$onCreateView$1 = new WebViewViewModel$onCreateView$1(this.this$0, continuation);
        webViewViewModel$onCreateView$1.L$0 = obj;
        return webViewViewModel$onCreateView$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WebViewViewModel$onCreateView$1) create((v7w) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007b, code lost:
    
        if (r14 == r0) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007a  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        v7w v7wVar;
        ek ekVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            v7wVar = (v7w) this.L$0;
            zu41 zu41Var = this.this$0.x;
            this.L$0 = v7wVar;
            this.label = 1;
            String str = zu41Var.f;
            if (str == null) {
                obj = null;
            } else {
                xk3 xk3Var = (xk3) zu41Var.a.c.a.getValue();
                dn90 dn90Var = zu41Var.d;
                if (dn90Var != null) {
                    qk3 qk3Var = xk3Var instanceof qk3 ? (qk3) xk3Var : null;
                    if (qk3Var != null && (ekVar = qk3Var.a) != null) {
                        obj = ((hn90) dn90Var).b(zu41Var.b, str, ekVar.b, zu41Var.e.getKey(), zu41Var.c == DefaultEnvironment.TESTING);
                        if (obj == null) {
                            obj = str;
                        }
                    }
                }
                obj = null;
                if (obj == null) {
                }
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v7wVar = (v7w) this.L$0;
            kotlin.b.b(obj);
        }
        String str2 = (String) obj;
        if (str2 == null || evu0.J(str2)) {
            mua1.f(this.this$0.w.b, "error", null, 6);
            return zy11Var;
        }
        b bVar = this.this$0;
        tje.N(ds31.a(bVar), null, null, new WebViewViewModel$observeFacadeStates$1(bVar.z, bVar, null), 3);
        this.this$0.c.getClass();
        mt41 mt41Var = new mt41(kotlin.collections.b.f(), str2, this.this$0.z);
        this.L$0 = null;
        this.label = 2;
        return com.yandex.fintechsdk.core.architecture.api.mvi.b.d(v7wVar, mt41Var, this) == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
