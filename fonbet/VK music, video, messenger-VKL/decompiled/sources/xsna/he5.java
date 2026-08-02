package xsna;

import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.dto.common.id.UserId;
import com.vungle.ads.internal.protos.Sdk;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;
import xsna.yqu;

/* compiled from: AuthorsChannelRepository.kt */
@b6l(c = "com.vk.catalog.mvi.block.video.impl.channel.AuthorsChannelRepositoryImpl$unsubscribeChannel$2", f = "AuthorsChannelRepository.kt", l = {66}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class he5 extends SuspendLambda implements wzs<yvj, spj<? super Result<? extends s3q0>>, Object> {
    final /* synthetic */ UserId $channelId;
    final /* synthetic */ String $source;
    final /* synthetic */ String $trackCode;
    int I$0;
    int I$1;
    int label;
    final /* synthetic */ ie5 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public he5(ie5 ie5Var, UserId userId, String str, String str2, spj<? super he5> spjVar) {
        super(2, spjVar);
        this.this$0 = ie5Var;
        this.$channelId = userId;
        this.$source = str;
        this.$trackCode = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new he5(this.this$0, this.$channelId, this.$source, this.$trackCode, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super Result<? extends s3q0>> spjVar) {
        return ((he5) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Result.Failure failure;
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                ie5 ie5Var = this.this$0;
                UserId userId = this.$channelId;
                iz2 A = yfb.A(yqu.a.e(ie5Var.a, fkq0.a(userId), null, this.$source, this.$trackCode, null, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE));
                this.I$0 = 0;
                this.I$1 = 0;
                this.label = 1;
                obj = evj.p(A, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
        } catch (TimeoutCancellationException e) {
            failure = new Result.Failure(e);
            obj2 = failure;
            return new Result(obj2);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
            obj2 = failure;
            return new Result(obj2);
        }
        if (((BaseOkResponseDto) obj) != BaseOkResponseDto.OK) {
            throw new IllegalStateException("Group unsubscribe failed");
        }
        obj2 = s3q0.a;
        return new Result(obj2);
    }
}
