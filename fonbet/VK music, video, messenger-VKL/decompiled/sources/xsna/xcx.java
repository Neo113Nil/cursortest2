package xsna;

import one.video.transform.TransformController;

/* compiled from: InteractiveZoomController.kt */
/* loaded from: classes3.dex */
public final class xcx {
    public final c4u0 a;
    public boolean b;
    public TransformController.ScaleType c = TransformController.ScaleType.FIT;
    public final hv1 d = new hv1(this, 8);

    /* compiled from: InteractiveZoomController.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TransformController.ScaleType.values().length];
            try {
                iArr[TransformController.ScaleType.FIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransformController.ScaleType.CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public xcx(c4u0 c4u0Var) {
        this.a = c4u0Var;
    }
}
