package com.yandex.plus.home.feature.webviews.internal.bridge;

import com.yandex.plus.home.feature.webviews.internal.settings.domain.ChangePlusSettingsInteractor$ChangeSettingError;
import defpackage.ba6;
import defpackage.m5r0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u0002H\n"}, d2 = {"Lm5r0;", "S", "Ltse;", "<anonymous>"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.feature.webviews.internal.settings.domain.ChangePlusSettingsInteractor$changeSetting$2", f = "ChangePlusSettingsInteractor.kt", l = {27}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class BasePlusWebMessagesHandler$handleChangeOptionStatusRequestMessage$1$invokeSuspend$lambda$0$$inlined$changeSetting$1 extends SuspendLambda implements wls {
    final /* synthetic */ m5r0 $settingData;
    int label;
    final /* synthetic */ com.yandex.plus.home.feature.webviews.internal.settings.domain.b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasePlusWebMessagesHandler$handleChangeOptionStatusRequestMessage$1$invokeSuspend$lambda$0$$inlined$changeSetting$1(m5r0 m5r0Var, com.yandex.plus.home.feature.webviews.internal.settings.domain.b bVar, Continuation continuation) {
        super(2, continuation);
        this.$settingData = m5r0Var;
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BasePlusWebMessagesHandler$handleChangeOptionStatusRequestMessage$1$invokeSuspend$lambda$0$$inlined$changeSetting$1(this.$settingData, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BasePlusWebMessagesHandler$handleChangeOptionStatusRequestMessage$1$invokeSuspend$lambda$0$$inlined$changeSetting$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            m5r0 m5r0Var = this.$settingData;
            if (!(m5r0Var instanceof ba6)) {
                throw new ChangePlusSettingsInteractor$ChangeSettingError.UnsupportedSettingType(this.$settingData);
            }
            this.label = 1;
            obj = com.yandex.plus.home.feature.webviews.internal.settings.domain.b.a(this.this$0, (ba6) m5r0Var, this);
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
        if (obj != null) {
            return (ba6) obj;
        }
        ny61.t("null cannot be cast to non-null type com.yandex.plus.home.feature.webviews.internal.settings.model.BooleanSettingData");
        return null;
    }
}
