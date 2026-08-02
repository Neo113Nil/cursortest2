package xsna;

import android.content.Context;
import android.widget.TextView;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.design.view.info.VideoInfoTextView;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: BottomInfoView.kt */
@b6l(c = "com.vk.catalog2.common.ui.holders.video.info_overlays.BottomInfoView$setSubtitleTextOptimized$1", f = "BottomInfoView.kt", l = {294}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class z48 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ fqs0 $config;
    final /* synthetic */ Context $context;
    final /* synthetic */ VideoFile $video;
    Object L$0;
    int label;
    final /* synthetic */ a58 this$0;

    /* compiled from: BottomInfoView.kt */
    @b6l(c = "com.vk.catalog2.common.ui.holders.video.info_overlays.BottomInfoView$setSubtitleTextOptimized$1$1", f = "BottomInfoView.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ zps0 $videoSubtitle;
        int label;
        final /* synthetic */ a58 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(a58 a58Var, zps0 zps0Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.this$0 = a58Var;
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
            TextView textView = this.this$0.k;
            VideoInfoTextView videoInfoTextView = textView instanceof VideoInfoTextView ? (VideoInfoTextView) textView : null;
            if (videoInfoTextView != null) {
                videoInfoTextView.setText(this.$videoSubtitle);
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z48(a58 a58Var, VideoFile videoFile, Context context, fqs0 fqs0Var, spj<? super z48> spjVar) {
        super(2, spjVar);
        this.this$0 = a58Var;
        this.$video = videoFile;
        this.$context = context;
        this.$config = fqs0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new z48(this.this$0, this.$video, this.$context, this.$config, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((z48) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            a58 a58Var = this.this$0;
            VideoFile videoFile = this.$video;
            Context context = this.$context;
            fqs0 fqs0Var = this.$config;
            zps0 c = a58Var.e ? a58Var.h.c(videoFile, context, fqs0Var) : cqs0.f(a58Var.h, videoFile, context, null, fqs0Var, 4);
            bdn bdnVar = bdn.a;
            ge00 ge00Var = ie00.a;
            a aVar = new a(this.this$0, c, null);
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
