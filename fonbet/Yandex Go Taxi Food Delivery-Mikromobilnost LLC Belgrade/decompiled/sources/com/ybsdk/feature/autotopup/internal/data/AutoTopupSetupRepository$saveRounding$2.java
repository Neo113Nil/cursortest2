package com.ybsdk.feature.autotopup.internal.data;

import com.ybsdk.core.common.data.network.dto.HmacDto;
import com.ybsdk.feature.autotopup.internal.network.AutoTopupApi;
import com.ybsdk.feature.autotopup.internal.network.dto.rounding.RoundingSaveRequest;
import com.ybsdk.feature.autotopup.internal.network.dto.rounding.RoundingStatusDto;
import defpackage.a5f;
import defpackage.azk0;
import defpackage.czk0;
import defpackage.j73;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.tls;
import defpackage.uza;
import defpackage.w511;
import defpackage.xv3;
import defpackage.ynb1;
import defpackage.yu50;
import defpackage.zy11;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.Map;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/ybsdk/core/utils/dto/TwoFactorAuthResponse;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/rounding/RoundingSaveResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.autotopup.internal.data.AutoTopupSetupRepository$saveRounding$2", f = "AutoTopupSetupRepository.kt", l = {591}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AutoTopupSetupRepository$saveRounding$2 extends SuspendLambda implements tls {
    final /* synthetic */ String $idempotencyToken;
    final /* synthetic */ czk0 $settings;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoTopupSetupRepository$saveRounding$2(b bVar, czk0 czk0Var, String str, Continuation continuation) {
        super(1, continuation);
        this.this$0 = bVar;
        this.$settings = czk0Var;
        this.$idempotencyToken = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new AutoTopupSetupRepository$saveRounding$2(this.this$0, this.$settings, this.$idempotencyToken, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((AutoTopupSetupRepository$saveRounding$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        RoundingStatusDto roundingStatusDto;
        Object q;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            xv3 xv3Var = this.this$0.b;
            czk0 czk0Var = this.$settings;
            String str = this.$idempotencyToken;
            String str2 = xv3Var.a.b;
            if (str2 == null) {
                ny61.g("Failed requirement.");
                return null;
            }
            String str3 = czk0Var.b;
            String str4 = czk0Var.c;
            String name = czk0Var.a.name();
            String str5 = czk0Var.e.a;
            StringBuilder w = oyr.w(str, str3, str4, name, "ROUNDING");
            w.append(str5);
            String lowerCase = w.toString().toLowerCase(Locale.ROOT);
            Mac mac = Mac.getInstance("HmacSHA256");
            Charset charset = uza.a;
            mac.init(new SecretKeySpec(str2.getBytes(charset), "HmacSHA256"));
            HmacDto hmacDto = new HmacDto(j73.K(mac.doFinal(lowerCase.getBytes(charset)), "", new a5f(5), 30), HmacDto.Version.ONE);
            czk0 czk0Var2 = this.$settings;
            int i2 = azk0.a[czk0Var2.a.ordinal()];
            if (i2 == 1) {
                roundingStatusDto = RoundingStatusDto.ENABLED;
            } else {
                if (i2 != 2) {
                    w511.b();
                    return null;
                }
                roundingStatusDto = RoundingStatusDto.DISABLED;
            }
            RoundingStatusDto roundingStatusDto2 = roundingStatusDto;
            RoundingSaveRequest roundingSaveRequest = new RoundingSaveRequest(roundingStatusDto2, czk0Var2.c, czk0Var2.b, czk0Var2.e.a, hmacDto);
            AutoTopupApi autoTopupApi = this.this$0.a;
            String str6 = yu50.a;
            czk0 czk0Var3 = this.$settings;
            Map<String, String> b = ynb1.b(new Pair(str6, czk0Var3.f), new Pair(yu50.e, czk0Var3.d));
            String str7 = this.$idempotencyToken;
            this.label = 1;
            q = autoTopupApi.q(str7, b, roundingSaveRequest, this);
            if (q == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            q = ((Result) obj).getValue();
        }
        return new Result(q);
    }
}
