package xsna;

import com.vk.api.generated.groups.dto.GroupsGetByIdObjectResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.dto.common.id.UserId;
import java.util.Collections;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.wqu;

/* compiled from: ClipEditSdkRepositoryImpl.kt */
@b6l(c = "com.vk.clips.viewer.edit.data.ClipEditSdkRepositoryImpl$getGroupInfo$2", f = "ClipEditSdkRepositoryImpl.kt", l = {142}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class qtc extends SuspendLambda implements wzs<yvj, spj<? super GroupsGroupFullDto>, Object> {
    final /* synthetic */ UserId $groupId;
    int label;
    final /* synthetic */ wtc this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qtc(wtc wtcVar, UserId userId, spj<? super qtc> spjVar) {
        super(2, spjVar);
        this.this$0 = wtcVar;
        this.$groupId = userId;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new qtc(this.this$0, this.$groupId, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super GroupsGroupFullDto> spjVar) {
        return ((qtc) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            wtc wtcVar = this.this$0;
            gof gofVar = wtcVar.c;
            xy2 b = wqu.a.b(wtcVar.k, Collections.singletonList(this.$groupId), null, null, 6);
            this.label = 1;
            obj = gofVar.a(b, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        List<GroupsGroupFullDto> d = ((GroupsGetByIdObjectResponseDto) obj).d();
        if (d != null) {
            return (GroupsGroupFullDto) j5g.Y(d);
        }
        return null;
    }
}
