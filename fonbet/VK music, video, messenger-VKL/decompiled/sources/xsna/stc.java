package xsna;

import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.dto.common.id.UserId;
import java.util.Collections;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.r1r0;

/* compiled from: ClipEditSdkRepositoryImpl.kt */
@b6l(c = "com.vk.clips.viewer.edit.data.ClipEditSdkRepositoryImpl$getUserInfo$2", f = "ClipEditSdkRepositoryImpl.kt", l = {127}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class stc extends SuspendLambda implements wzs<yvj, spj<? super UsersUserFullDto>, Object> {
    final /* synthetic */ UserId $userId;
    int label;
    final /* synthetic */ wtc this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public stc(wtc wtcVar, UserId userId, spj<? super stc> spjVar) {
        super(2, spjVar);
        this.this$0 = wtcVar;
        this.$userId = userId;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new stc(this.this$0, this.$userId, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super UsersUserFullDto> spjVar) {
        return ((stc) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            wtc wtcVar = this.this$0;
            gof gofVar = wtcVar.c;
            xy2 b = r1r0.a.b(wtcVar.j, Collections.singletonList(this.$userId), null, null, null, 62);
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
        return j5g.Y((List) obj);
    }
}
