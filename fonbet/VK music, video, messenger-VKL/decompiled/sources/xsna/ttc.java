package xsna;

import com.vk.api.generated.video.dto.VideoGetResponseDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import java.util.Collections;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.sft0;

/* compiled from: ClipEditSdkRepositoryImpl.kt */
@b6l(c = "com.vk.clips.viewer.edit.data.ClipEditSdkRepositoryImpl$getVideoInfo$2", f = "ClipEditSdkRepositoryImpl.kt", l = {110}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class ttc extends SuspendLambda implements wzs<yvj, spj<? super VideoVideoFullDto>, Object> {
    final /* synthetic */ String $videoId;
    int label;
    final /* synthetic */ wtc this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ttc(wtc wtcVar, String str, spj<? super ttc> spjVar) {
        super(2, spjVar);
        this.this$0 = wtcVar;
        this.$videoId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new ttc(this.this$0, this.$videoId, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super VideoVideoFullDto> spjVar) {
        return ((ttc) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            wtc wtcVar = this.this$0;
            gof gofVar = wtcVar.c;
            xy2 b = sft0.a.b(wtcVar.i, null, Collections.singletonList(this.$videoId), null, null, null, null, null, 16777207);
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
        return j5g.Y(((VideoGetResponseDto) obj).e());
    }
}
