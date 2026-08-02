package com.ybsdk.feature.pin.internal.repositories;

import com.ybsdk.core.utils.ext.c;
import com.ybsdk.feature.pin.internal.network.PinApi;
import com.ybsdk.feature.pin.internal.network.dto.IssuePinTokenRequest;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.wls;
import defpackage.ynb1;
import defpackage.yu50;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/ybsdk/feature/pin/internal/network/dto/IssuePinTokenResponse;", "idempotencyToken", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.pin.internal.repositories.PinRepository$issuePinToken$2", f = "PinRepository.kt", l = {30}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class PinRepository$issuePinToken$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $deviceId;
    final /* synthetic */ String $verificationToken;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/ybsdk/feature/pin/internal/network/dto/IssuePinTokenResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @mvg(c = "com.ybsdk.feature.pin.internal.repositories.PinRepository$issuePinToken$2$1", f = "PinRepository.kt", l = {31}, m = "invokeSuspend")
    /* renamed from: com.ybsdk.feature.pin.internal.repositories.PinRepository$issuePinToken$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements tls {
        final /* synthetic */ String $deviceId;
        final /* synthetic */ String $idempotencyToken;
        final /* synthetic */ String $verificationToken;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a aVar, String str, String str2, String str3, Continuation continuation) {
            super(1, continuation);
            this.this$0 = aVar;
            this.$deviceId = str;
            this.$idempotencyToken = str2;
            this.$verificationToken = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$deviceId, this.$idempotencyToken, this.$verificationToken, continuation);
        }

        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            return ((AnonymousClass1) create((Continuation) obj)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                b.b(obj);
                PinApi pinApi = this.this$0.a;
                IssuePinTokenRequest issuePinTokenRequest = new IssuePinTokenRequest(this.$deviceId);
                String str = this.$idempotencyToken;
                String str2 = yu50.a;
                Map<String, String> b = ynb1.b(new Pair(yu50.a, this.$verificationToken));
                this.label = 1;
                a = pinApi.a(issuePinTokenRequest, str, b, this);
                if (a == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                a = ((Result) obj).getValue();
            }
            return new Result(a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinRepository$issuePinToken$2(a aVar, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$deviceId = str;
        this.$verificationToken = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PinRepository$issuePinToken$2 pinRepository$issuePinToken$2 = new PinRepository$issuePinToken$2(this.this$0, this.$deviceId, this.$verificationToken, continuation);
        pinRepository$issuePinToken$2.L$0 = obj;
        return pinRepository$issuePinToken$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PinRepository$issuePinToken$2) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$deviceId, (String) this.L$0, this.$verificationToken, null);
            this.label = 1;
            c = c.c(anonymousClass1, this);
            if (c == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            c = ((Result) obj).getValue();
        }
        return new Result(c);
    }
}
