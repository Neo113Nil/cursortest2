package com.ybsdk.common.repositiories.user;

import com.ybsdk.common.entities.UserIdentificationStatusEntity;
import com.ybsdk.core.utils.ext.c;
import com.ybsdk.network.Api;
import com.ybsdk.network.dto.GetUserInfoResponse;
import defpackage.kn21;
import defpackage.mn21;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.w511;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/Result;", "Lkn21;", "<anonymous>", "()Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.common.repositiories.user.UserInfoRepository$getUserInfo$2", f = "UserInfoRepository.kt", l = {22}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class UserInfoRepository$getUserInfo$2 extends SuspendLambda implements tls {
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/ybsdk/network/dto/GetUserInfoResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @mvg(c = "com.ybsdk.common.repositiories.user.UserInfoRepository$getUserInfo$2$1", f = "UserInfoRepository.kt", l = {23}, m = "invokeSuspend")
    /* renamed from: com.ybsdk.common.repositiories.user.UserInfoRepository$getUserInfo$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements tls {
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a aVar, Continuation continuation) {
            super(1, continuation);
            this.this$0 = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            return ((AnonymousClass1) create((Continuation) obj)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object F;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                b.b(obj);
                Api api = this.this$0.a;
                this.label = 1;
                F = api.F(this);
                if (F == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                F = ((Result) obj).getValue();
            }
            return new Result(F);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserInfoRepository$getUserInfo$2(a aVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new UserInfoRepository$getUserInfo$2(this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((UserInfoRepository$getUserInfo$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object c;
        UserIdentificationStatusEntity userIdentificationStatusEntity;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
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
        if (!(c instanceof Result.Failure)) {
            GetUserInfoResponse getUserInfoResponse = (GetUserInfoResponse) c;
            int i2 = mn21.a[getUserInfoResponse.getIdentificationStatus().ordinal()];
            if (i2 == 1) {
                userIdentificationStatusEntity = UserIdentificationStatusEntity.ANONYMOUS;
            } else if (i2 == 2) {
                userIdentificationStatusEntity = UserIdentificationStatusEntity.IDENTIFIED;
            } else if (i2 == 3) {
                userIdentificationStatusEntity = UserIdentificationStatusEntity.KYC;
            } else if (i2 == 4) {
                userIdentificationStatusEntity = UserIdentificationStatusEntity.KYC_EDS;
            } else {
                if (i2 != 5) {
                    w511.b();
                    return null;
                }
                userIdentificationStatusEntity = UserIdentificationStatusEntity.NOT_REGISTERED;
            }
            c = new kn21(userIdentificationStatusEntity, getUserInfoResponse.getPhone());
        }
        return new Result(c);
    }
}
