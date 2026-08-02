package com.yandex.go.taxi.order.details.v1.elements.support;

import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.vf41;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.web.CoreWebViewConfig;
import ru.yandex.taxi.web.UiWebViewConfig;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v1.elements.support.SupportChatRouter$openSupportChat$1", f = "SupportChatRouter.kt", l = {33}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SupportChatRouter$openSupportChat$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $supportChatUrl;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportChatRouter$openSupportChat$1(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$supportChatUrl = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SupportChatRouter$openSupportChat$1(this.this$0, this.$supportChatUrl, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SupportChatRouter$openSupportChat$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object k0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            this.this$0.e.getClass();
            sjh sjhVar = uyj.a;
            mdh mdhVar = mdh.b;
            SupportChatRouter$openSupportChat$1$oAuthToken$1 supportChatRouter$openSupportChat$1$oAuthToken$1 = new SupportChatRouter$openSupportChat$1$oAuthToken$1(this.this$0, null);
            this.label = 1;
            k0 = tje.k0(mdhVar, supportChatRouter$openSupportChat$1$oAuthToken$1, this);
            if (k0 == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            k0 = obj;
        }
        String str = (String) k0;
        zy11 zy11Var = zy11.a;
        if (str == null) {
            return zy11Var;
        }
        CoreWebViewConfig.Companion.getClass();
        CoreWebViewConfig.a aVar = new CoreWebViewConfig.a();
        aVar.b = this.$supportChatUrl;
        aVar.c = str;
        UiWebViewConfig uiWebViewConfig = new UiWebViewConfig(aVar.a(), null, false, false, false, false, null, false, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4194302, null);
        uiWebViewConfig.setHasTitleFromWeb(true);
        a aVar2 = this.this$0;
        aVar2.a.s(vf41.a(aVar2.b, uiWebViewConfig, null, null, null, 254), true);
        return zy11Var;
    }
}
