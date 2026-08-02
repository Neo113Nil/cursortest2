package xsna;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.clips.sdk.shared.item.clip.subtitles.SdkSubtitlesConfigurationMode;
import com.vk.clips.sdk.shared.item.video.VideoTextureViewAdapter;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import one.video.transform.TransformController;

/* compiled from: VideoTextureViewAdapterImpl.kt */
/* loaded from: classes17.dex */
public final class tjt0 implements VideoTextureViewAdapter {
    public final wzs<y0r, SdkSubtitlesConfigurationMode, com.vk.libvideo.autoplay.a> a;
    public final Object b;
    public final Object c;

    /* compiled from: VideoTextureViewAdapterImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoTextureViewAdapter.ScaleType.values().length];
            try {
                iArr[VideoTextureViewAdapter.ScaleType.FIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoTextureViewAdapter.ScaleType.CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public tjt0(Context context, wzs<? super y0r, ? super SdkSubtitlesConfigurationMode, com.vk.libvideo.autoplay.a> wzsVar) {
        this.a = wzsVar;
        sk7 sk7Var = new sk7(context, 3);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.b = msy.a(lazyThreadSafetyMode, sk7Var);
        this.c = msy.a(lazyThreadSafetyMode, new kcj0(this, 22));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.clips.sdk.shared.item.video.VideoTextureViewAdapter
    public final void a(VideoTextureViewAdapter.ScaleType scaleType) {
        TransformController.ScaleType scaleType2;
        TransformController transformController = ((VideoTextureView) this.b.getValue()).getTransformController();
        int i = a.$EnumSwitchMapping$0[scaleType.ordinal()];
        if (i == 1) {
            scaleType2 = TransformController.ScaleType.FIT;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            scaleType2 = TransformController.ScaleType.CROP;
        }
        transformController.f(scaleType2, false);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.clips.sdk.shared.item.video.VideoTextureViewAdapter
    public final void b(kih0 kih0Var) {
        d3b0 v0 = d370.R(kih0Var).v0();
        if (v0 != null) {
            v0.j((VideoTextureView) this.b.getValue());
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.clips.sdk.shared.item.video.VideoTextureViewAdapter
    public final void c() {
        vjt0 vjt0Var = (vjt0) this.c.getValue();
        if (vjt0Var.a == null) {
            View childAt = vjt0Var.a().getChildAt(0);
            if (childAt != null) {
                vjt0Var.a().removeView(childAt);
            } else {
                childAt = null;
            }
            vjt0Var.a = childAt;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.clips.sdk.shared.item.video.VideoTextureViewAdapter
    public final void d(int i, int i2) {
        ((VideoTextureView) this.b.getValue()).getMatrixProvider().l(i, i2);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.clips.sdk.shared.item.video.VideoTextureViewAdapter
    public final void e(kih0 kih0Var, String str, RecyclerView.e0 e0Var, y0r y0rVar, SdkSubtitlesConfigurationMode sdkSubtitlesConfigurationMode) {
        ?? r3 = this.c;
        ((vjt0) r3.getValue()).a();
        d370.R(kih0Var).z0(((vjt0) r3.getValue()).a(), this.a.invoke(y0rVar, sdkSubtitlesConfigurationMode), e0Var);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.clips.sdk.shared.item.video.VideoTextureViewAdapter
    public final VideoTextureView getView() {
        return (VideoTextureView) this.b.getValue();
    }
}
