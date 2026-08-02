package xsna;

import com.vk.api.generated.video.dto.VideoGetResponseDto;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipAttachedVideoInfo;
import com.vk.dto.common.VideoFile;
import java.util.Collections;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.sft0;

/* compiled from: ClipsUploadVideoAttachDataInteractorImpl.kt */
@b6l(c = "com.vk.clips.upload.vk.ui.impl.fragment.data.ClipsUploadVideoAttachDataInteractorImpl$loadAttachedVideoInfo$2", f = "ClipsUploadVideoAttachDataInteractorImpl.kt", l = {30}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class alf extends SuspendLambda implements wzs<yvj, spj<? super ClipAttachedVideoInfo>, Object> {
    final /* synthetic */ Integer $videoAlbumId;
    final /* synthetic */ String $videoId;
    int label;
    final /* synthetic */ blf this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alf(blf blfVar, String str, Integer num, spj<? super alf> spjVar) {
        super(2, spjVar);
        this.this$0 = blfVar;
        this.$videoId = str;
        this.$videoAlbumId = num;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new alf(this.this$0, this.$videoId, this.$videoAlbumId, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super ClipAttachedVideoInfo> spjVar) {
        return ((alf) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            iz2 A = yfb.A(sft0.a.b((tft0) this.this$0.a.getValue(), null, Collections.singletonList(this.$videoId), null, null, null, Boolean.TRUE, Collections.singletonList("attached_short_videos_counter"), 16774135));
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
        VideoGetResponseDto videoGetResponseDto = (VideoGetResponseDto) obj;
        VideoFile videoFile = (VideoFile) j5g.a0(ums0.e((ums0) this.this$0.b.getValue(), videoGetResponseDto.e(), videoGetResponseDto.g(), videoGetResponseDto.d(), false, 52));
        if (videoFile == null) {
            return null;
        }
        Integer num = this.$videoAlbumId;
        Integer L3 = videoFile.L3();
        int intValue = L3 != null ? L3.intValue() : 0;
        Integer f = videoGetResponseDto.f();
        boolean z = intValue < (f != null ? f.intValue() : 3);
        if (videoFile.O() != null || !z) {
            return null;
        }
        String title = videoFile.getTitle();
        String n = ixj0.n(videoFile.getImage().b);
        if (n == null) {
            n = "";
        }
        return new ClipAttachedVideoInfo(title, n, videoFile.a1(), num);
    }
}
