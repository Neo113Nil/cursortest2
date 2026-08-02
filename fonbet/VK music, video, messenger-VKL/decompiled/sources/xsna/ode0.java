package xsna;

import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.api.generated.groups.dto.GroupsFilterDto;
import com.vk.api.generated.groups.dto.GroupsGetObjectExtendedResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.groups.dto.GroupsGroupIsClosedDto;
import com.vk.video.ui.upload.impl.publish.domain.model.VideoAuthorDo;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;

/* compiled from: PublishNetworkApiImpl.kt */
@b6l(c = "com.vk.video.ui.upload.impl.publish.data.network.PublishNetworkApiImpl$getAvailableVideoAuthorListInternal$2", f = "PublishNetworkApiImpl.kt", l = {349}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class ode0 extends SuspendLambda implements wzs<yvj, spj<? super Result<? extends List<? extends VideoAuthorDo>>>, Object> {
    int I$0;
    int I$1;
    int label;
    final /* synthetic */ bee0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ode0(bee0 bee0Var, spj<? super ode0> spjVar) {
        super(2, spjVar);
        this.this$0 = bee0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new ode0(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super Result<? extends List<? extends VideoAuthorDo>>> spjVar) {
        return ((ode0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.Result$Failure] */
    /* JADX WARN: Type inference failed for: r0v5, types: [kotlin.Result$Failure] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                iz2 A = yfb.A(xqu.h(this.this$0.b, null, e43.l(GroupsFilterDto.ADMIN, GroupsFilterDto.EDITOR), e43.l(GroupsFieldsDto.PHOTO_BASE, GroupsFieldsDto.NAME, GroupsFieldsDto.IS_CLOSED), null, null, 57));
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
            List<GroupsGroupFullDto> e = ((GroupsGetObjectExtendedResponseDto) obj).e();
            failure = new ArrayList(c5g.u(e, 10));
            for (GroupsGroupFullDto groupsGroupFullDto : e) {
                failure.add(new VideoAuthorDo(fkq0.e(fkq0.a(groupsGroupFullDto.P0())), groupsGroupFullDto.u3() != GroupsGroupIsClosedDto.OPEN, groupsGroupFullDto.V1(), groupsGroupFullDto.y1()));
            }
        } catch (TimeoutCancellationException e2) {
            failure = new Result.Failure(e2);
        } catch (CancellationException e3) {
            throw e3;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        return new Result(failure);
    }
}
