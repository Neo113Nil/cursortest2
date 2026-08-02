package com.yandex.plus.home.feature.webviews.internal.bridge;

import com.yandex.plus.core.analytics.logging.PlusLogTag;
import defpackage.EvgenDiagnostic$WebViewType;
import defpackage.gov;
import defpackage.gw00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.skd0;
import defpackage.tje;
import defpackage.tse;
import defpackage.uho;
import defpackage.vio;
import defpackage.wls;
import defpackage.zy11;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.feature.webviews.internal.bridge.BasePlusWebMessagesHandler$sendMessage$1", f = "BasePlusWebMessagesHandler.kt", l = {119, 122}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class BasePlusWebMessagesHandler$sendMessage$1 extends SuspendLambda implements wls {
    final /* synthetic */ gov $inMessage;
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasePlusWebMessagesHandler$sendMessage$1(a aVar, gov govVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$inMessage = govVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BasePlusWebMessagesHandler$sendMessage$1(this.this$0, this.$inMessage, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BasePlusWebMessagesHandler$sendMessage$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0038, code lost:
    
        if (r9 == r0) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0070  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b;
        Object obj2;
        Throwable a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.plus.home.feature.webviews.internalapi.bridge.a aVar = this.this$0.d;
            gov govVar = this.$inMessage;
            this.label = 1;
            b = aVar.b(govVar, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj2 = this.L$0;
                kotlin.b.b(obj);
                b = obj2;
                gov govVar2 = this.$inMessage;
                a aVar2 = this.this$0;
                a = Result.a(b);
                if (a != null) {
                    skd0.c(PlusLogTag.JS, "sendMessage() Processing message error inMessage=" + govVar2 + ", throwable=" + a, null);
                    vio vioVar = aVar2.i;
                    uho uhoVar = vioVar.a;
                    EvgenDiagnostic$WebViewType evgenDiagnostic$WebViewType = vioVar.b;
                    String message = a.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    Map e = gw00.e(new Pair(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, message));
                    uhoVar.getClass();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("webview_type", evgenDiagnostic$WebViewType.getEventValue());
                    linkedHashMap.put("additional_params", e);
                    linkedHashMap.put("_meta", uho.b(new HashMap()));
                    uhoVar.c("Error.WebView.Protocol.Serialize", linkedHashMap);
                }
                return zy11Var;
            }
            kotlin.b.b(obj);
            b = ((Result) obj).getValue();
        }
        a aVar3 = this.this$0;
        gov govVar3 = this.$inMessage;
        if (!(b instanceof Result.Failure)) {
            String str = (String) b;
            aVar3.B(str);
            this.L$0 = b;
            this.L$1 = null;
            this.I$0 = 0;
            this.label = 2;
            Object k0 = tje.k0(aVar3.b, new BasePlusWebMessagesHandler$logInMessage$2(aVar3, govVar3, str, null), this);
            if (k0 != coroutineSingletons) {
                k0 = zy11Var;
            }
            if (k0 != coroutineSingletons) {
                obj2 = b;
                b = obj2;
            }
            return coroutineSingletons;
        }
        gov govVar22 = this.$inMessage;
        a aVar22 = this.this$0;
        a = Result.a(b);
        if (a != null) {
        }
        return zy11Var;
    }
}
