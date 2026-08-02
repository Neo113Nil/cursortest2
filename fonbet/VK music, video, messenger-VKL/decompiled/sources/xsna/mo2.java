package xsna;

import android.graphics.Rect;
import com.vk.libvideo.api.ui.VideoResizer;
import kotlin.NoWhenBranchMatchedException;
import one.video.transform.TransformController;

/* compiled from: AnimationDialogCallbackMapper.kt */
/* loaded from: classes18.dex */
public final class mo2 implements io2 {
    public final /* synthetic */ nc0 b;

    /* compiled from: AnimationDialogCallbackMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TransformController.ScaleType.values().length];
            try {
                iArr[TransformController.ScaleType.CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransformController.ScaleType.FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public mo2(nc0 nc0Var) {
        this.b = nc0Var;
    }

    @Override // xsna.io2
    public final void C() {
        this.b.C();
    }

    @Override // xsna.io2
    public final void D0() {
        this.b.D0();
    }

    @Override // xsna.io2
    public final boolean G() {
        return this.b.G();
    }

    @Override // xsna.io2
    public final void J() {
        this.b.J();
    }

    @Override // xsna.io2
    public final boolean M() {
        return this.b.M();
    }

    @Override // xsna.io2
    public final void e0() {
        this.b.e0();
    }

    @Override // xsna.io2
    public final boolean f0() {
        return this.b.f0();
    }

    @Override // xsna.io2
    public final Rect g0() {
        return this.b.g0();
    }

    @Override // xsna.io2
    public final VideoResizer.VideoFitType getContentScaleType() {
        int i = a.$EnumSwitchMapping$0[this.b.getContentScaleType().ordinal()];
        if (i == 1) {
            return VideoResizer.VideoFitType.CROP;
        }
        if (i == 2) {
            return VideoResizer.VideoFitType.FIT;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.io2
    public final float i0() {
        return this.b.i0();
    }

    @Override // xsna.io2
    public final Rect t0() {
        return this.b.t0();
    }
}
