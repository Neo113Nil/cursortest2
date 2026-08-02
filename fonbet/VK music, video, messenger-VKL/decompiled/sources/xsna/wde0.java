package xsna;

import com.vk.api.generated.video.dto.VideoGetPrivacyDictionaryResponseDto;
import com.vk.api.generated.video.dto.VideoPrivacyDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;

/* compiled from: PublishNetworkApiImpl.kt */
@b6l(c = "com.vk.video.ui.upload.impl.publish.data.network.PublishNetworkApiImpl$getVideoPrivacyPossibleRules$2", f = "PublishNetworkApiImpl.kt", l = {202}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class wde0 extends SuspendLambda implements wzs<yvj, spj<? super Result<? extends l6t0>>, Object> {
    final /* synthetic */ UserId $userId;
    int I$0;
    int I$1;
    int label;
    final /* synthetic */ bee0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wde0(bee0 bee0Var, UserId userId, spj<? super wde0> spjVar) {
        super(2, spjVar);
        this.this$0 = bee0Var;
        this.$userId = userId;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new wde0(this.this$0, this.$userId, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super Result<? extends l6t0>> spjVar) {
        return ((wde0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
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
                bee0 bee0Var = this.this$0;
                UserId userId = this.$userId;
                iz2 A = yfb.A(bee0Var.a.j(fkq0.b(userId) ? fkq0.e(userId) : null));
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
            VideoGetPrivacyDictionaryResponseDto videoGetPrivacyDictionaryResponseDto = (VideoGetPrivacyDictionaryResponseDto) obj;
            List<VideoPrivacyDto> e = videoGetPrivacyDictionaryResponseDto.d().e();
            ArrayList arrayList = new ArrayList(c5g.u(e, 10));
            Iterator<T> it = e.iterator();
            while (it.hasNext()) {
                arrayList.add(((VideoPrivacyDto) it.next()).d());
            }
            List<VideoPrivacyDto> d = videoGetPrivacyDictionaryResponseDto.d().d();
            ArrayList arrayList2 = new ArrayList(c5g.u(d, 10));
            Iterator<T> it2 = d.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((VideoPrivacyDto) it2.next()).d());
            }
            obj2 = new l6t0(arrayList, arrayList2);
        } catch (TimeoutCancellationException e2) {
            failure = new Result.Failure(e2);
            obj2 = failure;
            return new Result(obj2);
        } catch (CancellationException e3) {
            throw e3;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
            obj2 = failure;
            return new Result(obj2);
        }
        return new Result(obj2);
    }
}
