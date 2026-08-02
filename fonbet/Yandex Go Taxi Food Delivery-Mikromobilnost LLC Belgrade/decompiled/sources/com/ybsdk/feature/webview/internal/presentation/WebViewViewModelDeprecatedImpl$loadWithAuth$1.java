package com.ybsdk.feature.webview.internal.presentation;

import android.webkit.URLUtil;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.di.modules.features.w;
import com.ybsdk.feature.webview.api.WebViewScreenParams;
import defpackage.ds31;
import defpackage.eu41;
import defpackage.ev41;
import defpackage.fu41;
import defpackage.g8e;
import defpackage.gw41;
import defpackage.hu41;
import defpackage.if8;
import defpackage.mvg;
import defpackage.nl91;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.webview.internal.presentation.WebViewViewModelDeprecatedImpl$loadWithAuth$1", f = "WebViewViewModelDeprecatedImpl.kt", l = {185, 187}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class WebViewViewModelDeprecatedImpl$loadWithAuth$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $afterError;
    final /* synthetic */ boolean $disableSpeedUp;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewViewModelDeprecatedImpl$loadWithAuth$1(b bVar, boolean z, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$disableSpeedUp = z;
        this.$afterError = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WebViewViewModelDeprecatedImpl$loadWithAuth$1(this.this$0, this.$disableSpeedUp, this.$afterError, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WebViewViewModelDeprecatedImpl$loadWithAuth$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e2, code lost:
    
        if (((java.lang.Boolean) r2).booleanValue() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d9, code lost:
    
        if (r2 == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0101  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        Object value;
        Object b;
        r0 r0Var2;
        Object value2;
        Object obj2;
        b bVar;
        Throwable a;
        pz40 Y;
        r0 r0Var3;
        Object value3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        boolean z = false;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar2 = this.this$0;
            bVar2.F.j(bVar2.B);
            boolean isValidUrl = URLUtil.isValidUrl(this.this$0.B);
            b bVar3 = this.this$0;
            if (!isValidUrl) {
                nl91.g(bVar3.B, null, "Invalid URL to open web view", null, null, null, null, null, null, null, 2040);
                b bVar4 = this.this$0;
                bVar4.F.e(bVar4.B, "Invalid URL to open web view", true);
                b bVar5 = this.this$0;
                pz40 Y2 = bVar5.Y();
                do {
                    r0Var2 = (r0) Y2;
                    value2 = r0Var2.getValue();
                } while (!r0Var2.k(value2, hu41.a((hu41) value2, 0, new eu41(new IllegalArgumentException(g8e.o("Invalid URL: ", bVar5.B)), null), null, false, false, HProv.PP_DELETE_KEYSET)));
                return zy11Var;
            }
            boolean z2 = this.$afterError;
            pz40 Y3 = bVar3.Y();
            do {
                r0Var = (r0) Y3;
                value = r0Var.getValue();
            } while (!r0Var.k(value, hu41.a((hu41) value, z2 ? ((hu41) bVar3.X()).a : 0, new fu41(z2), bVar3.B, false, true, 88)));
            if (!this.$disableSpeedUp) {
                b bVar6 = this.this$0;
                com.ybsdk.feature.webview.internal.utils.b bVar7 = bVar6.L;
                String str = bVar6.B;
                this.label = 1;
                b = bVar7.b(str, this);
            }
            z = true;
            b bVar8 = this.this$0;
            com.ybsdk.feature.webview.internal.domain.a aVar = bVar8.E;
            String str2 = bVar8.B;
            WebViewScreenParams.Auth auth = bVar8.C.getAuth();
            this.label = 2;
            Object a2 = aVar.a(str2, auth, z, this);
            if (a2 != coroutineSingletons) {
                obj2 = a2;
                b bVar9 = this.this$0;
                if (!(obj2 instanceof Result.Failure)) {
                }
                bVar = this.this$0;
                a = Result.a(obj2);
                if (a != null) {
                    Y = bVar.Y();
                    do {
                        r0Var3 = (r0) Y;
                        value3 = r0Var3.getValue();
                    } while (!r0Var3.k(value3, hu41.a((hu41) value3, 0, new eu41(a, null), null, false, false, HProv.PP_DELETE_KEYSET)));
                }
                return zy11Var;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            obj2 = ((Result) obj).getValue();
            b bVar92 = this.this$0;
            if (!(obj2 instanceof Result.Failure)) {
                ev41 ev41Var = (ev41) obj2;
                AppAnalyticsReporter appAnalyticsReporter = bVar92.I;
                com.ybsdk.feature.webview.internal.domain.a aVar2 = bVar92.E;
                gw41 gw41Var = appAnalyticsReporter.v0;
                String str3 = ev41Var.a;
                aVar2.getClass();
                gw41Var.c("auth_success", str3, Boolean.valueOf(com.ybsdk.feature.webview.internal.domain.a.g(str3)));
                if (com.ybsdk.feature.webview.internal.domain.a.g(ev41Var.a)) {
                    bVar92.U = ev41Var;
                    if (((if8) bVar92.K).a.p().isEnabled() && !bVar92.T) {
                        pzt0 pzt0Var = bVar92.S;
                        if (pzt0Var != null) {
                            pzt0Var.a(null);
                        }
                        bVar92.S = tje.N(ds31.a(bVar92), null, null, new WebViewViewModelDeprecatedImpl$startRedirectStallCheck$1(bVar92, ev41Var, null), 3);
                    }
                }
                bVar92.x0(ev41Var, "loadWithAuth");
            }
            bVar = this.this$0;
            a = Result.a(obj2);
            if (a != null && !((w) bVar.P).a(a)) {
                Y = bVar.Y();
                do {
                    r0Var3 = (r0) Y;
                    value3 = r0Var3.getValue();
                } while (!r0Var3.k(value3, hu41.a((hu41) value3, 0, new eu41(a, null), null, false, false, HProv.PP_DELETE_KEYSET)));
            }
            return zy11Var;
        }
        kotlin.b.b(obj);
        b = obj;
    }
}
