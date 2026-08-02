package com.ybsdk.feature.settings.internal.data;

import com.ybsdk.feature.settings.api.data.SettingPropertyDto;
import com.ybsdk.feature.settings.internal.network.SettingsApi;
import com.ybsdk.feature.settings.internal.network.dto.SetSettingRequest;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o8r0;
import defpackage.tls;
import defpackage.ynb1;
import defpackage.yu50;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/ybsdk/core/utils/dto/OldTwoFactorAuthResponse;", "Lcom/ybsdk/feature/settings/internal/network/dto/SettingsResponseDto;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.settings.internal.data.SettingsRepository$setSetting$2", f = "SettingsRepository.kt", l = {35}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SettingsRepository$setSetting$2 extends SuspendLambda implements tls {
    final /* synthetic */ String $idempotencyToken;
    final /* synthetic */ String $operationId;
    final /* synthetic */ o8r0 $setting;
    final /* synthetic */ String $verificationToken;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsRepository$setSetting$2(b bVar, String str, String str2, String str3, o8r0 o8r0Var, Continuation continuation) {
        super(1, continuation);
        this.this$0 = bVar;
        this.$idempotencyToken = str;
        this.$operationId = str2;
        this.$verificationToken = str3;
        this.$setting = o8r0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new SettingsRepository$setSetting$2(this.this$0, this.$idempotencyToken, this.$operationId, this.$verificationToken, this.$setting, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((SettingsRepository$setSetting$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            SettingsApi settingsApi = this.this$0.a;
            String str = this.$idempotencyToken;
            String str2 = yu50.a;
            Map<String, String> b = ynb1.b(new Pair(yu50.e, this.$operationId), new Pair(yu50.a, this.$verificationToken));
            o8r0 o8r0Var = this.$setting;
            SetSettingRequest setSettingRequest = new SetSettingRequest(o8r0Var.a, new SettingPropertyDto(SettingPropertyDto.Type.SWITCH, Boolean.valueOf(o8r0Var.g), o8r0Var.h, o8r0Var.k));
            this.label = 1;
            a = settingsApi.a(str, b, setSettingRequest, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            a = ((Result) obj).getValue();
        }
        return new Result(a);
    }
}
