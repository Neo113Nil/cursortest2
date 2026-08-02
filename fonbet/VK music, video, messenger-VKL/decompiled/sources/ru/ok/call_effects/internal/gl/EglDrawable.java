package ru.ok.call_effects.internal.gl;

import android.content.Context;
import android.opengl.GLES20;
import com.unity3d.services.UnityAdsConstants;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import ru.ok.call_effects.internal.gl.EglTexture;

/* loaded from: classes9.dex */
public class EglDrawable {
    private static final Rotation DEFAULT_ROTATION = Rotation.ROTATION_270;
    private EglTexture program;
    private Drawable2d rectDrawable;

    /* renamed from: ru.ok.call_effects.internal.gl.EglDrawable$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$ru$ok$call_effects$internal$gl$EglDrawable$Flip;
        static final /* synthetic */ int[] $SwitchMap$ru$ok$call_effects$internal$gl$EglDrawable$Rotation;

        static {
            int[] iArr = new int[Flip.values().length];
            $SwitchMap$ru$ok$call_effects$internal$gl$EglDrawable$Flip = iArr;
            try {
                iArr[Flip.VERTICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$ru$ok$call_effects$internal$gl$EglDrawable$Flip[Flip.HORIZONTAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$ru$ok$call_effects$internal$gl$EglDrawable$Flip[Flip.VERTICAL_HORIZONTAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[Rotation.values().length];
            $SwitchMap$ru$ok$call_effects$internal$gl$EglDrawable$Rotation = iArr2;
            try {
                iArr2[Rotation.ROTATION_0.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$ru$ok$call_effects$internal$gl$EglDrawable$Rotation[Rotation.ROTATION_90.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$ru$ok$call_effects$internal$gl$EglDrawable$Rotation[Rotation.ROTATION_180.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$ru$ok$call_effects$internal$gl$EglDrawable$Rotation[Rotation.ROTATION_270.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Drawable2d {
        private static final int SIZEOF_FLOAT = 4;
        private final Context context;
        private int coordsPerVertex;
        private FloatBuffer texCoordArray;
        private FloatBuffer texCoordArrayFlip;
        private int texCoordStride;
        private EglTexture.ProgramType type;
        private FloatBuffer vertexArray;
        private int vertexCount;
        private int vertexStride;
        private static final float[] FULL_RECTANGLE_COORDS = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        private static final float[] FULL_RECTANGLE_TEX_COORDS_0 = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1.0f, 1.0f};
        private static final float[] FULL_RECTANGLE_TEX_COORDS_90 = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1.0f, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
        private static final float[] FULL_RECTANGLE_TEX_COORDS_180 = {1.0f, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
        private static final float[] FULL_RECTANGLE_TEX_COORDS_270 = {1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f};

        public Drawable2d(Context context, EglTexture.ProgramType programType) {
            this.type = EglTexture.ProgramType.TEXTURE_2D;
            float[] fArr = FULL_RECTANGLE_COORDS;
            this.vertexArray = EglUtils.createFloatBuffer(fArr);
            this.type = programType;
            makeTexCoordArrays(false, false);
            this.coordsPerVertex = 2;
            this.vertexStride = 2 * 4;
            this.vertexCount = fArr.length / 2;
            this.texCoordStride = 8;
            this.context = context;
        }

        private static float flip(float f) {
            if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return 1.0f;
            }
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }

        private static float[] flipHorizontal(float[] fArr) {
            return new float[]{fArr[0], flip(fArr[1]), fArr[2], flip(fArr[3]), fArr[4], flip(fArr[5]), fArr[6], flip(fArr[7])};
        }

        private static float[] flipVertical(float[] fArr) {
            return new float[]{flip(fArr[0]), fArr[1], flip(fArr[2]), fArr[3], flip(fArr[4]), fArr[5], flip(fArr[6]), fArr[7]};
        }

        private static float[] getRotation(Rotation rotation, Flip flip) {
            int i = AnonymousClass1.$SwitchMap$ru$ok$call_effects$internal$gl$EglDrawable$Rotation[rotation.ordinal()];
            float[] fArr = i != 1 ? i != 2 ? i != 3 ? i != 4 ? FULL_RECTANGLE_TEX_COORDS_0 : FULL_RECTANGLE_TEX_COORDS_270 : FULL_RECTANGLE_TEX_COORDS_180 : FULL_RECTANGLE_TEX_COORDS_90 : FULL_RECTANGLE_TEX_COORDS_0;
            int i2 = AnonymousClass1.$SwitchMap$ru$ok$call_effects$internal$gl$EglDrawable$Flip[flip.ordinal()];
            return i2 != 1 ? i2 != 2 ? i2 != 3 ? fArr : flipHorizontal(flipVertical(fArr)) : flipHorizontal(fArr) : flipVertical(fArr);
        }

        public static Rotation getSurfaceEglRotation(Context context, boolean z) {
            Rotation rotation = Rotation.ROTATION_0;
            boolean hasVerticalFlipByModel = CameraUtils.hasVerticalFlipByModel(z);
            int surfaceRotation = CameraUtils.getSurfaceRotation(context);
            if (surfaceRotation == 0) {
                return hasVerticalFlipByModel ? Rotation.ROTATION_90 : Rotation.ROTATION_270;
            }
            if (surfaceRotation != 1) {
                if (surfaceRotation == 2) {
                    return hasVerticalFlipByModel ? Rotation.ROTATION_270 : Rotation.ROTATION_90;
                }
                if (surfaceRotation == 3 && hasVerticalFlipByModel) {
                    return Rotation.ROTATION_180;
                }
            } else if (!hasVerticalFlipByModel) {
                return Rotation.ROTATION_180;
            }
            return rotation;
        }

        public final int getCoordsPerVertex() {
            return this.coordsPerVertex;
        }

        public final FloatBuffer getTexCoordArray(Flip flip) {
            return flip == Flip.NO_FLIP ? this.texCoordArray : this.texCoordArrayFlip;
        }

        public final int getTexCoordStride() {
            return this.texCoordStride;
        }

        public final FloatBuffer getVertexArray() {
            return this.vertexArray;
        }

        public final int getVertexCount() {
            return this.vertexCount;
        }

        public final int getVertexStride() {
            return this.vertexStride;
        }

        public void makeTexCoordArrays(boolean z, boolean z2) {
            makeTexCoordArrays(z, true, true, z2);
        }

        public void makeTexCoordArrays() {
            makeTexCoordArrays(true, false, false, false);
        }

        public void makeTexCoordArrays(boolean z, boolean z2, boolean z3, boolean z4) {
            Flip flip = Flip.NO_FLIP;
            Rotation rotation = Rotation.ROTATION_0;
            EglTexture.ProgramType programType = this.type;
            if (programType == EglTexture.ProgramType.TEXTURE_2D || programType == EglTexture.ProgramType.TEXTURE_2D_YUV) {
                if (z3) {
                    rotation = z4 ? EglDrawable.DEFAULT_ROTATION : getSurfaceEglRotation(this.context, z);
                    flip = Flip.VERTICAL_HORIZONTAL;
                } else {
                    rotation = Rotation.ROTATION_180;
                    if (z2 && z) {
                        flip = Flip.VERTICAL_HORIZONTAL;
                    } else if (z2) {
                        flip = Flip.HORIZONTAL;
                    } else if (z) {
                        flip = Flip.VERTICAL;
                    }
                }
            }
            this.texCoordArray = EglUtils.createFloatBuffer(getRotation(rotation, flip));
            this.texCoordArrayFlip = EglUtils.createFloatBuffer(getRotation(rotation, Flip.VERTICAL));
        }
    }

    public enum Flip {
        NO_FLIP,
        VERTICAL,
        HORIZONTAL,
        VERTICAL_HORIZONTAL
    }

    public enum Rotation {
        ROTATION_0,
        ROTATION_90,
        ROTATION_180,
        ROTATION_270
    }

    public static final class TestDrawer {
        private Color color = Color.GREEN;

        public enum Color {
            GREEN,
            RED,
            BLUE
        }

        public void draw() {
            draw(this.color);
        }

        public void setNextColor() {
            Color color = this.color;
            Color color2 = Color.GREEN;
            if (color == color2) {
                this.color = Color.RED;
            } else {
                this.color = color2;
            }
        }

        public void draw(Color color) {
            GLES20.glEnable(3042);
            GLES20.glBlendFunc(1, 771);
            if (color == Color.GREEN) {
                GLES20.glClearColor(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            } else if (color == Color.BLUE) {
                GLES20.glClearColor(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1.0f);
            } else if (color == Color.RED) {
                GLES20.glClearColor(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            }
            GLES20.glClear(16640);
        }
    }

    public EglDrawable(Context context, EglTexture eglTexture) {
        this.rectDrawable = new Drawable2d(context, eglTexture.getProgramType());
        this.program = eglTexture;
    }

    public void changeProgram(EglTexture eglTexture) {
        this.program.release();
        this.program = eglTexture;
    }

    public int createTextureObject() {
        return this.program.createTextureObject();
    }

    public void drawFrame(int i, float[] fArr, float[] fArr2, float[] fArr3) {
        drawFrame(i, fArr, fArr2, Flip.NO_FLIP, fArr3);
    }

    public void drawFrame2D(int i, float[] fArr, float[] fArr2, Flip flip, Buffer buffer, int i2, int i3) {
        this.program.drawPixels(fArr == null ? EglUtils.IDENTITY_MATRIX : fArr, this.rectDrawable.getVertexArray(), 0, this.rectDrawable.getVertexCount(), this.rectDrawable.getCoordsPerVertex(), this.rectDrawable.getVertexStride(), fArr2, this.rectDrawable.getTexCoordArray(flip), i, this.rectDrawable.getTexCoordStride(), i2, i3, buffer);
    }

    public Drawable2d getDrawable() {
        return this.rectDrawable;
    }

    public EglTexture getProgram() {
        return this.program;
    }

    public void release(boolean z) {
        EglTexture eglTexture = this.program;
        if (eglTexture != null) {
            if (z) {
                eglTexture.release();
            }
            this.program = null;
        }
    }

    public void drawFrame(int i, float[] fArr, float[] fArr2, Flip flip) {
        drawFrame(i, fArr, fArr2, flip, EglUtils.IDENTITY_MATRIX);
    }

    public void drawFrame(int i, float[] fArr, float[] fArr2, Flip flip, float[] fArr3) {
        if (fArr == null) {
            fArr = EglUtils.IDENTITY_MATRIX;
        }
        this.program.draw(fArr, this.rectDrawable.getVertexArray(), 0, this.rectDrawable.getVertexCount(), this.rectDrawable.getCoordsPerVertex(), this.rectDrawable.getVertexStride(), fArr2, this.rectDrawable.getTexCoordArray(flip), i, this.rectDrawable.getTexCoordStride());
    }
}
