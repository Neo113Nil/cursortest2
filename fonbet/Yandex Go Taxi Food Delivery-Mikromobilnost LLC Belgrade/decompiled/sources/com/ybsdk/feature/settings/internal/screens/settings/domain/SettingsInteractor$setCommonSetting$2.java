package com.ybsdk.feature.settings.internal.screens.settings.domain;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.o8r0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "idempotencyToken", "Lkotlin/Result;", "Lsk11;", "Lv7r0;", "<anonymous>", "(Ljava/lang/String;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.settings.internal.screens.settings.domain.SettingsInteractor$setCommonSetting$2", f = "SettingsInteractor.kt", l = {39}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SettingsInteractor$setCommonSetting$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $operationId;
    final /* synthetic */ o8r0 $settingItem;
    final /* synthetic */ String $verificationToken;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsInteractor$setCommonSetting$2(a aVar, o8r0 o8r0Var, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$settingItem = o8r0Var;
        this.$verificationToken = str;
        this.$operationId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SettingsInteractor$setCommonSetting$2 settingsInteractor$setCommonSetting$2 = new SettingsInteractor$setCommonSetting$2(this.this$0, this.$settingItem, this.$verificationToken, this.$operationId, continuation);
        settingsInteractor$setCommonSetting$2.L$0 = obj;
        return settingsInteractor$setCommonSetting$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SettingsInteractor$setCommonSetting$2) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SettingsInteractor$setCommonSetting$2 settingsInteractor$setCommonSetting$2;
        Object b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            String str = (String) this.L$0;
            com.ybsdk.feature.settings.internal.data.b bVar = this.this$0.a;
            o8r0 o8r0Var = this.$settingItem;
            String str2 = this.$verificationToken;
            String str3 = this.$operationId;
            this.label = 1;
            settingsInteractor$setCommonSetting$2 = this;
            b = bVar.b(str, o8r0Var, str2, str3, settingsInteractor$setCommonSetting$2);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            b = ((Result) obj).getValue();
            settingsInteractor$setCommonSetting$2 = this;
        }
        a aVar = settingsInteractor$setCommonSetting$2.this$0;
        o8r0 o8r0Var2 = settingsInteractor$setCommonSetting$2.$settingItem;
        if (!(b instanceof Result.Failure)) {
            aVar.b.g(o8r0Var2, null);
        }
        a aVar2 = settingsInteractor$setCommonSetting$2.this$0;
        o8r0 o8r0Var3 = settingsInteractor$setCommonSetting$2.$settingItem;
        Throwable a = Result.a(b);
        if (a != null) {
            aVar2.b.g(o8r0Var3, a.toString());
        }
        return new Result(b);
    }
}
