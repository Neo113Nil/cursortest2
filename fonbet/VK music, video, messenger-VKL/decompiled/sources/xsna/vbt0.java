package xsna;

import com.vk.api.generated.video.dto.VideoSaveAssistantAlbumResponseDto;
import com.vk.video.assistant.api.domain.model.AiAssistantEvent;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: VideoRelatedVideosFeature.kt */
@b6l(c = "com.vk.video.ui.discovery.minimizable.dialog.related_videos.VideoRelatedVideosFeature$sendTemporaryPlaylistAddedEvent$1", f = "VideoRelatedVideosFeature.kt", l = {Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class vbt0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ String $playlistId;
    final /* synthetic */ VideoSaveAssistantAlbumResponseDto $saveAssistantAlbumResponse;
    int label;
    final /* synthetic */ com.vk.video.ui.discovery.minimizable.dialog.related_videos.d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vbt0(com.vk.video.ui.discovery.minimizable.dialog.related_videos.d dVar, String str, VideoSaveAssistantAlbumResponseDto videoSaveAssistantAlbumResponseDto, spj<? super vbt0> spjVar) {
        super(2, spjVar);
        this.this$0 = dVar;
        this.$playlistId = str;
        this.$saveAssistantAlbumResponse = videoSaveAssistantAlbumResponseDto;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new vbt0(this.this$0, this.$playlistId, this.$saveAssistantAlbumResponse, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((vbt0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            lc1 lc1Var = this.this$0.h;
            this.$saveAssistantAlbumResponse.d();
            long j = this.$saveAssistantAlbumResponse.q().b;
            AiAssistantEvent.EventSource eventSource = AiAssistantEvent.EventSource.AiAssistantSearchCardVH;
            this.label = 1;
            if (lc1Var.b() == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }
}
