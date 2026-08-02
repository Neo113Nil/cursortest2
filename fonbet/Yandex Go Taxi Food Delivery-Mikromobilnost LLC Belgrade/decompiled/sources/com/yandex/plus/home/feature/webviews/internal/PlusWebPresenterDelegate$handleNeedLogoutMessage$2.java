package com.yandex.plus.home.feature.webviews.internal;

import com.yandex.plus.home.feature.webviews.internalapi.authorization.LogoutResult;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.InMessage$LogoutResponse$LogoutStatus;
import defpackage.EvgenDiagnostic$WebViewType;
import defpackage.bt80;
import defpackage.imv;
import defpackage.kio;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rrd0;
import defpackage.tls;
import defpackage.tse;
import defpackage.uho;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.feature.webviews.internal.PlusWebPresenterDelegate$handleNeedLogoutMessage$2", f = "PlusWebPresenterDelegate.kt", l = {90}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PlusWebPresenterDelegate$handleNeedLogoutMessage$2 extends SuspendLambda implements wls {
    final /* synthetic */ tls $onLogout;
    final /* synthetic */ bt80 $outMessage;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlusWebPresenterDelegate$handleNeedLogoutMessage$2(a aVar, bt80 bt80Var, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$outMessage = bt80Var;
        this.$onLogout = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlusWebPresenterDelegate$handleNeedLogoutMessage$2(this.this$0, this.$outMessage, this.$onLogout, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlusWebPresenterDelegate$handleNeedLogoutMessage$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InMessage$LogoutResponse$LogoutStatus inMessage$LogoutResponse$LogoutStatus;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.plus.home.auth.b bVar = this.this$0.b;
            this.label = 1;
            obj = bVar.e(this);
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
        LogoutResult logoutResult = (LogoutResult) obj;
        if (logoutResult == LogoutResult.ERROR) {
            kio kioVar = this.this$0.c;
            uho uhoVar = kioVar.a;
            EvgenDiagnostic$WebViewType evgenDiagnostic$WebViewType = kioVar.b;
            Map f = kotlin.collections.b.f();
            uhoVar.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("webview_type", evgenDiagnostic$WebViewType.getEventValue());
            linkedHashMap.put("additional_params", f);
            linkedHashMap.put("_meta", uho.b(new HashMap()));
            uhoVar.c("Error.WebView.NativeAuth.LogoutFailed", linkedHashMap);
        }
        String str = this.$outMessage.a;
        int i2 = rrd0.a[logoutResult.ordinal()];
        if (i2 == 1) {
            inMessage$LogoutResponse$LogoutStatus = InMessage$LogoutResponse$LogoutStatus.SUCCESS;
        } else if (i2 == 2) {
            inMessage$LogoutResponse$LogoutStatus = InMessage$LogoutResponse$LogoutStatus.CANCELED;
        } else {
            if (i2 != 3) {
                w511.b();
                return null;
            }
            inMessage$LogoutResponse$LogoutStatus = InMessage$LogoutResponse$LogoutStatus.FAILED;
        }
        this.$onLogout.invoke(new imv(str, inMessage$LogoutResponse$LogoutStatus));
        return zy11.a;
    }
}
