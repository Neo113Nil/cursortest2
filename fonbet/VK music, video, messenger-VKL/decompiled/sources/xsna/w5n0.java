package xsna;

import android.widget.TextView;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.design.view.info.VideoInfoTextView;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: SuggestedVideoAutoPlayHolder.kt */
@b6l(c = "com.vk.newsfeed.common.recycler.holders.videos.suggested.video_holder.SuggestedVideoAutoPlayHolder$setSubtitleTextOptimized$1", f = "SuggestedVideoAutoPlayHolder.kt", l = {169}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class w5n0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ VideoFile $video;
    Object L$0;
    int label;
    final /* synthetic */ x5n0 this$0;

    /* compiled from: SuggestedVideoAutoPlayHolder.kt */
    @b6l(c = "com.vk.newsfeed.common.recycler.holders.videos.suggested.video_holder.SuggestedVideoAutoPlayHolder$setSubtitleTextOptimized$1$1", f = "SuggestedVideoAutoPlayHolder.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ zps0 $videoSubtitle;
        int label;
        final /* synthetic */ x5n0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x5n0 x5n0Var, zps0 zps0Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.this$0 = x5n0Var;
            this.$videoSubtitle = zps0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.this$0, this.$videoSubtitle, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            TextView textView = this.this$0.x0;
            VideoInfoTextView videoInfoTextView = textView instanceof VideoInfoTextView ? (VideoInfoTextView) textView : null;
            if (videoInfoTextView != null) {
                videoInfoTextView.setText(this.$videoSubtitle);
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w5n0(x5n0 x5n0Var, VideoFile videoFile, spj<? super w5n0> spjVar) {
        super(2, spjVar);
        this.this$0 = x5n0Var;
        this.$video = videoFile;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new w5n0(this.this$0, this.$video, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((w5n0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            x5n0 x5n0Var = this.this$0;
            VideoFile videoFile = this.$video;
            int i2 = x5n0.K0;
            zps0 J7 = x5n0Var.J7(videoFile);
            bdn bdnVar = bdn.a;
            ge00 ge00Var = ie00.a;
            a aVar = new a(this.this$0, J7, null);
            this.L$0 = null;
            this.label = 1;
            if (myc0.k(ge00Var, aVar, this) == coroutineSingletons) {
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
