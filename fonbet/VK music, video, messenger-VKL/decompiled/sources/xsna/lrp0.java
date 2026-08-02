package xsna;

import com.vk.libvideo.design.compose.base.trimmer.TrimmerBound;

/* compiled from: TrimmerInternalState.kt */
/* loaded from: classes2.dex */
public final class lrp0 {
    public final float a;
    public final float b;
    public final wh50<jrp0> c;
    public final lqr d;
    public final float e;
    public final mtk0<jrp0> f;
    public final f1m g;
    public final int h;

    /* compiled from: TrimmerInternalState.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TrimmerBound.values().length];
            try {
                iArr[TrimmerBound.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TrimmerBound.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TrimmerBound.INTERNAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TrimmerBound.EXTERNAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public lrp0(float f, r500 r500Var, r500 r500Var2, long j, wh50 wh50Var, long j2, float f2) {
        this.a = f;
        this.b = f2;
        wh50<jrp0> b = androidx.compose.runtime.k.b(new jrp0(f, new lqr(r500Var.a / f, r500Var.b / f), -(j2 / f)));
        this.c = b;
        this.d = new lqr(r500Var2.a / f, r500Var2.b / f);
        this.e = j / f;
        this.f = b;
        this.g = bbk0.b(new com.vk.movika.tools.controls.seekbar.f(22, this, wh50Var));
        this.h = an10.b((float) Math.ceil(r8 / f2));
    }
}
