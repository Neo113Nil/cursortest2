package com.ybsdk.feature.webview.internal.presentation;

import android.webkit.URLUtil;
import com.ybsdk.di.modules.features.w;
import com.ybsdk.feature.webview.api.WebViewScreenParams;
import defpackage.ev41;
import defpackage.gw41;
import defpackage.iu41;
import defpackage.lv41;
import defpackage.mvg;
import defpackage.nl91;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.webview.internal.presentation.WebViewViewModelImpl$loadWithAuth$1", f = "WebViewViewModelImpl.kt", l = {339, 341}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class WebViewViewModelImpl$loadWithAuth$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $afterError;
    final /* synthetic */ boolean $disableSpeedUp;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewViewModelImpl$loadWithAuth$1(c cVar, boolean z, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$disableSpeedUp = z;
        this.$afterError = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        WebViewViewModelImpl$loadWithAuth$1 webViewViewModelImpl$loadWithAuth$1 = new WebViewViewModelImpl$loadWithAuth$1(this.this$0, this.$disableSpeedUp, this.$afterError, continuation);
        webViewViewModelImpl$loadWithAuth$1.L$0 = obj;
        return webViewViewModelImpl$loadWithAuth$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WebViewViewModelImpl$loadWithAuth$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00de, code lost:
    
        if (((java.lang.Boolean) r7).booleanValue() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d5, code lost:
    
        if (r7 == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0100  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        tse tseVar;
        r0 r0Var;
        Object value;
        iu41 iu41Var;
        Object b;
        r0 r0Var2;
        Object value2;
        iu41 iu41Var2;
        tse tseVar2;
        Object obj2;
        c cVar;
        Throwable a;
        pz40 Y;
        r0 r0Var3;
        Object value3;
        iu41 iu41Var3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        boolean z = false;
        int i2 = 2;
        int i3 = 1;
        if (i == 0) {
            kotlin.b.b(obj);
            tseVar = (tse) this.L$0;
            c cVar2 = this.this$0;
            cVar2.F.j(cVar2.B);
            boolean isValidUrl = URLUtil.isValidUrl(this.this$0.B);
            c cVar3 = this.this$0;
            if (!isValidUrl) {
                nl91.g(cVar3.B, null, "Invalid URL to open web view", null, null, null, null, null, null, null, 2040);
                c cVar4 = this.this$0;
                cVar4.F.e(cVar4.B, "Invalid URL to open web view", true);
                pz40 Y2 = this.this$0.Y();
                do {
                    r0Var2 = (r0) Y2;
                    value2 = r0Var2.getValue();
                    iu41Var2 = (iu41) value2;
                } while (!r0Var2.k(value2, iu41.a(iu41Var2, iu41Var2.a.b(new IllegalArgumentException("Invalid URL to open web view"), null), 0, false, null, 62)));
                return zy11.a;
            }
            boolean z2 = this.$afterError;
            pz40 Y3 = cVar3.Y();
            do {
                r0Var = (r0) Y3;
                value = r0Var.getValue();
                iu41Var = (iu41) value;
            } while (!r0Var.k(value, iu41.a(iu41Var, iu41Var.a.d(z2, false), z2 ? iu41Var.b : 0, true, null, 52)));
            if (!this.$disableSpeedUp) {
                c cVar5 = this.this$0;
                com.ybsdk.feature.webview.internal.utils.b bVar = cVar5.K;
                String str = cVar5.B;
                this.L$0 = tseVar;
                this.label = 1;
                b = bVar.b(str, this);
            }
            z = true;
            c cVar6 = this.this$0;
            com.ybsdk.feature.webview.internal.domain.a aVar = cVar6.E;
            String str2 = cVar6.B;
            WebViewScreenParams.Auth auth = cVar6.C.getAuth();
            this.L$0 = tseVar;
            this.label = 2;
            Object a2 = aVar.a(str2, auth, z, this);
            if (a2 != coroutineSingletons) {
                tseVar2 = tseVar;
                obj2 = a2;
                c cVar7 = this.this$0;
                if (!(obj2 instanceof Result.Failure)) {
                }
                cVar = this.this$0;
                a = Result.a(obj2);
                if (a != null) {
                    Y = cVar.Y();
                    do {
                        r0Var3 = (r0) Y;
                        value3 = r0Var3.getValue();
                        iu41Var3 = (iu41) value3;
                    } while (!r0Var3.k(value3, iu41.a(iu41Var3, iu41Var3.a.b(a, null), 0, false, null, 62)));
                }
                return zy11.a;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            tse tseVar3 = (tse) this.L$0;
            kotlin.b.b(obj);
            obj2 = ((Result) obj).getValue();
            tseVar2 = tseVar3;
            c cVar72 = this.this$0;
            if (!(obj2 instanceof Result.Failure)) {
                ev41 ev41Var = (ev41) obj2;
                gw41 gw41Var = cVar72.M.v0;
                String str3 = ev41Var.a;
                cVar72.E.getClass();
                gw41Var.c("auth_success", str3, Boolean.valueOf(com.ybsdk.feature.webview.internal.domain.a.g(str3)));
                cVar72.Z(ev41Var);
                cVar72.F.k(tseVar2, new lv41(cVar72, i3), ev41Var, null, new lv41(cVar72, i2));
            }
            cVar = this.this$0;
            a = Result.a(obj2);
            if (a != null && !((w) cVar.P).a(a)) {
                Y = cVar.Y();
                do {
                    r0Var3 = (r0) Y;
                    value3 = r0Var3.getValue();
                    iu41Var3 = (iu41) value3;
                } while (!r0Var3.k(value3, iu41.a(iu41Var3, iu41Var3.a.b(a, null), 0, false, null, 62)));
            }
            return zy11.a;
        }
        tseVar = (tse) this.L$0;
        kotlin.b.b(obj);
        b = obj;
    }
}
