package xsna;

import android.graphics.Rect;
import com.vk.libvideo.api.ui.VideoResizer;
import kotlin.NoWhenBranchMatchedException;
import one.video.transform.TransformController;

/* compiled from: AnimationDialogCallbackMapper.kt */
/* loaded from: classes18.dex */
public final class lo2 implements nc0 {
    public final /* synthetic */ io2 a;

    /* compiled from: AnimationDialogCallbackMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoResizer.VideoFitType.values().length];
            try {
                iArr[VideoResizer.VideoFitType.CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoResizer.VideoFitType.FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public lo2(io2 io2Var) {
        this.a = io2Var;
    }

    @Override // xsna.nc0
    public final void C() {
        this.a.C();
    }

    @Override // xsna.nc0
    public final void D0() {
        this.a.D0();
    }

    @Override // xsna.nc0
    public final boolean G() {
        return this.a.G();
    }

    @Override // xsna.nc0
    public final void J() {
        this.a.J();
    }

    @Override // xsna.nc0
    public final boolean M() {
        return this.a.M();
    }

    @Override // xsna.nc0
    public final void e0() {
        this.a.e0();
    }

    @Override // xsna.nc0
    public final boolean f0() {
        return this.a.f0();
    }

    @Override // xsna.nc0
    public final Rect g0() {
        return this.a.g0();
    }

    @Override // xsna.nc0
    public final TransformController.ScaleType getContentScaleType() {
        int i = a.$EnumSwitchMapping$0[this.a.getContentScaleType().ordinal()];
        if (i == 1) {
            return TransformController.ScaleType.CROP;
        }
        if (i == 2) {
            return TransformController.ScaleType.FIT;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.nc0
    public final float i0() {
        return this.a.i0();
    }

    @Override // xsna.nc0
    public final Rect t0() {
        return this.a.t0();
    }
}
