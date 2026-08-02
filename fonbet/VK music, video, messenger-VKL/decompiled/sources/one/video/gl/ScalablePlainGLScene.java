package one.video.gl;

import android.opengl.Matrix;
import android.util.Size;
import kotlin.NoWhenBranchMatchedException;
import one.video.gl.ScalablePlainGLScene;
import xsna.asp;
import xsna.gzs;
import xsna.k75;
import xsna.ozl;
import xsna.vob;
import xsna.zrp;
import xsna.zsa0;

/* compiled from: ScalablePlainGLScene.kt */
@ozl
/* loaded from: classes8.dex */
public final class ScalablePlainGLScene extends zsa0 {
    public volatile ScaleType i = ScaleType.FIT;
    public float j = 1.0f;
    public float k = 1.0f;
    public float l = 1.0f;
    public volatile float m = 1.0f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ScalablePlainGLScene.kt */
    public static final class ScaleType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ScaleType[] $VALUES;
        public static final ScaleType CROP;
        public static final ScaleType CUSTOM;
        public static final ScaleType FIT;

        static {
            ScaleType scaleType = new ScaleType("FIT", 0);
            FIT = scaleType;
            ScaleType scaleType2 = new ScaleType("CROP", 1);
            CROP = scaleType2;
            ScaleType scaleType3 = new ScaleType("CUSTOM", 2);
            CUSTOM = scaleType3;
            ScaleType[] scaleTypeArr = {scaleType, scaleType2, scaleType3};
            $VALUES = scaleTypeArr;
            $ENTRIES = new asp(scaleTypeArr);
        }

        public ScaleType() {
            throw null;
        }

        public static ScaleType valueOf(String str) {
            return (ScaleType) Enum.valueOf(ScaleType.class, str);
        }

        public static ScaleType[] values() {
            return (ScaleType[]) $VALUES.clone();
        }
    }

    /* compiled from: ScalablePlainGLScene.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ScaleType.values().length];
            try {
                iArr[ScaleType.FIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScaleType.CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ScaleType.CUSTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static void e(final ScalablePlainGLScene scalablePlainGLScene, ScaleType scaleType) {
        if (scalablePlainGLScene.i == scaleType) {
            return;
        }
        scalablePlainGLScene.i = scaleType;
        final float g = scalablePlainGLScene.g();
        gzs gzsVar = new gzs() { // from class: xsna.f4h0
            @Override // xsna.gzs
            public final Object invoke() {
                float f = g;
                ScalablePlainGLScene scalablePlainGLScene2 = ScalablePlainGLScene.this;
                scalablePlainGLScene2.j = f;
                scalablePlainGLScene2.f();
                return s3q0.a;
            }
        };
        vob vobVar = scalablePlainGLScene.a;
        if (vobVar != null) {
            vobVar.k(new k75(8, gzsVar, scalablePlainGLScene));
        }
    }

    @Override // xsna.a2t
    public final void c() {
        Size size;
        if (this.d == null || (size = this.c) == null) {
            return;
        }
        float width = r0.getWidth() / r0.getHeight();
        float width2 = size.getWidth() / size.getHeight();
        float f = width > width2 ? width2 / width : 1.0f;
        this.k = f;
        this.l = width < width2 ? width / width2 : 1.0f;
        this.m = (width < width2 ? width2 / width : 1.0f) / f;
        this.j = g();
        f();
    }

    @Override // xsna.zsa0, xsna.a2t
    public final void d() {
        super.d();
    }

    public final void f() {
        float f = this.k;
        float f2 = this.l;
        float[] fArr = this.f;
        Matrix.setIdentityM(fArr, 0);
        float f3 = this.j;
        Matrix.scaleM(fArr, 0, f * f3, f2 * f3, 1.0f);
    }

    public final float g() {
        int i = a.$EnumSwitchMapping$0[this.i.ordinal()];
        if (i == 1) {
            return 1.0f;
        }
        if (i == 2) {
            return this.m;
        }
        if (i == 3) {
            return this.j;
        }
        throw new NoWhenBranchMatchedException();
    }
}
