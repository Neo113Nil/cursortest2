package xsna;

import com.vk.video.assistant.api.domain.model.AiAssistantEvent;
import com.vk.video.ui.discovery.minimizable.dialog.related_videos.VideoRelatedVideosFragment;
import com.vk.video.ui.discovery.minimizable.dialog.related_videos.VideoRelatedVideosFragment$observeAiAssistantEvent$1$invokeSuspend$$inlined$filter$1$2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: VideoRelatedVideosFragment.kt */
@b6l(c = "com.vk.video.ui.discovery.minimizable.dialog.related_videos.VideoRelatedVideosFragment$observeAiAssistantEvent$1", f = "VideoRelatedVideosFragment.kt", l = {259}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class ybt0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ VideoRelatedVideosFragment this$0;

    /* compiled from: VideoRelatedVideosFragment.kt */
    public static final class a<T> implements lsr {
        public final /* synthetic */ VideoRelatedVideosFragment b;

        public a(VideoRelatedVideosFragment videoRelatedVideosFragment) {
            this.b = videoRelatedVideosFragment;
        }

        @Override // xsna.lsr
        public final Object emit(Object obj, spj spjVar) {
            AiAssistantEvent aiAssistantEvent = (AiAssistantEvent) obj;
            if (aiAssistantEvent instanceof AiAssistantEvent.a) {
                ((AiAssistantEvent.a) aiAssistantEvent).getClass();
                VideoRelatedVideosFragment videoRelatedVideosFragment = this.b;
                if (epx.f(null, videoRelatedVideosFragment.g0)) {
                    videoRelatedVideosFragment.so();
                }
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ybt0(VideoRelatedVideosFragment videoRelatedVideosFragment, spj<? super ybt0> spjVar) {
        super(2, spjVar);
        this.this$0 = videoRelatedVideosFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new ybt0(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((ybt0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            VideoRelatedVideosFragment videoRelatedVideosFragment = this.this$0;
            int i2 = VideoRelatedVideosFragment.n0;
            caj0 a2 = ((lc1) videoRelatedVideosFragment.k0.getValue()).a();
            a aVar = new a(this.this$0);
            this.label = 1;
            Object k = caj0.k(a2, new VideoRelatedVideosFragment$observeAiAssistantEvent$1$invokeSuspend$$inlined$filter$1$2(aVar), this);
            if (k != obj2) {
                k = s3q0.a;
            }
            if (k == obj2) {
                return obj2;
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
