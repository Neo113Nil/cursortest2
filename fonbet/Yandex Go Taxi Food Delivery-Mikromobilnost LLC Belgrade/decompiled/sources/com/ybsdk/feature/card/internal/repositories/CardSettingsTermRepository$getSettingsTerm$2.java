package com.ybsdk.feature.card.internal.repositories;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.feature.card.internal.network.CardApi;
import com.ybsdk.feature.card.internal.network.dto.SettingsTermRequest;
import com.ybsdk.rconfig.configs.CommonFeatureFlag;
import defpackage.if8;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.wlp;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/Result;", "Lv7l;", "<anonymous>", "()Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.card.internal.repositories.CardSettingsTermRepository$getSettingsTerm$2", f = "CardSettingsTermRepository.kt", l = {21, 23, 25}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CardSettingsTermRepository$getSettingsTerm$2 extends SuspendLambda implements tls {
    final /* synthetic */ String $initialScreenId;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardSettingsTermRepository$getSettingsTerm$2(d dVar, String str, Continuation continuation) {
        super(1, continuation);
        this.this$0 = dVar;
        this.$initialScreenId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new CardSettingsTermRepository$getSettingsTerm$2(this.this$0, this.$initialScreenId, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((CardSettingsTermRepository$getSettingsTerm$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0079, code lost:
    
        if (r7 == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        if (r8 == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
    
        if (r8 == r0) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object m;
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            boolean isEnabled = ((CommonFeatureFlag) ((if8) this.this$0.a).a.d(wlp.w0).getData()).isEnabled();
            d dVar = this.this$0;
            if (isEnabled) {
                CardApi cardApi = dVar.b;
                SettingsTermRequest settingsTermRequest = new SettingsTermRequest(this.$initialScreenId);
                this.label = 1;
                m = cardApi.e(settingsTermRequest, this);
            } else {
                CardApi cardApi2 = dVar.b;
                this.label = 2;
                m = cardApi2.m(this);
            }
            return new Result(failure);
        }
        if (i != 1 && i != 2) {
            if (i != 3) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            failure = ((Result) obj).getValue();
            return new Result(failure);
        }
        kotlin.b.b(obj);
        m = ((Result) obj).getValue();
        Throwable a = Result.a(m);
        if (a == null) {
            CardSettingsTermRepository$getSettingsTerm$2$1$1 cardSettingsTermRepository$getSettingsTerm$2$1$1 = new CardSettingsTermRepository$getSettingsTerm$2$1$1(2, null);
            this.label = 3;
            failure = com.ybsdk.core.utils.dto.b.a((DataWithStatusResponse) m, cardSettingsTermRepository$getSettingsTerm$2$1$1, this);
        } else {
            failure = new Result.Failure(a);
        }
        return new Result(failure);
    }
}
