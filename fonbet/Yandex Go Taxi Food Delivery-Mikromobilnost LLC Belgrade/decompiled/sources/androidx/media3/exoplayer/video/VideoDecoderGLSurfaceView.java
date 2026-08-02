package androidx.media3.exoplayer.video;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.util.Log;
import androidx.media3.common.util.GlUtil$GlException;
import defpackage.jht;
import defpackage.lxa1;
import defpackage.nl31;
import defpackage.ny61;
import defpackage.ol31;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes10.dex */
public final class VideoDecoderGLSurfaceView extends GLSurfaceView implements ol31 {
    private static final String TAG = "VideoDecoderGLSV";
    public static final /* synthetic */ int a = 0;
    private final Renderer renderer;

    public static final class Renderer implements GLSurfaceView.Renderer {
        private static final String FRAGMENT_SHADER = "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n";
        private static final String VERTEX_SHADER = "varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n";
        private int colorMatrixLocation;
        private jht program;
        private nl31 renderedOutputBuffer;
        private final GLSurfaceView surfaceView;
        private static final float[] kColorConversion601 = {1.164f, 1.164f, 1.164f, 0.0f, -0.392f, 2.017f, 1.596f, -0.813f, 0.0f};
        private static final float[] kColorConversion709 = {1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};
        private static final float[] kColorConversion2020 = {1.168f, 1.168f, 1.168f, 0.0f, -0.188f, 2.148f, 1.683f, -0.652f, 0.0f};
        private static final String[] TEXTURE_UNIFORMS = {"y_tex", "u_tex", "v_tex"};
        private static final FloatBuffer TEXTURE_VERTICES = lxa1.f(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});
        private final int[] yuvTextures = new int[3];
        private final int[] texLocations = new int[3];
        private final int[] previousWidths = new int[3];
        private final int[] previousStrides = new int[3];
        private final AtomicReference<nl31> pendingOutputBufferReference = new AtomicReference<>();
        private final FloatBuffer[] textureCoords = new FloatBuffer[3];

        public Renderer(GLSurfaceView gLSurfaceView) {
            this.surfaceView = gLSurfaceView;
            for (int i = 0; i < 3; i++) {
                int[] iArr = this.previousWidths;
                this.previousStrides[i] = -1;
                iArr[i] = -1;
            }
        }

        private void setupTextures() {
            try {
                GLES20.glGenTextures(3, this.yuvTextures, 0);
                for (int i = 0; i < 3; i++) {
                    jht jhtVar = this.program;
                    GLES20.glUniform1i(GLES20.glGetUniformLocation(jhtVar.a, TEXTURE_UNIFORMS[i]), i);
                    GLES20.glActiveTexture(33984 + i);
                    lxa1.b(3553, this.yuvTextures[i]);
                }
                lxa1.c();
            } catch (GlUtil$GlException e) {
                Log.e(VideoDecoderGLSurfaceView.TAG, "Failed to set up the textures", e);
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            if (this.pendingOutputBufferReference.getAndSet(null) == null) {
                return;
            }
            ny61.u();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i, int i2) {
            GLES20.glViewport(0, 0, i, i2);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            try {
                jht jhtVar = new jht(VERTEX_SHADER, FRAGMENT_SHADER);
                this.program = jhtVar;
                GLES20.glVertexAttribPointer(jhtVar.b("in_pos"), 2, 5126, false, 0, (Buffer) TEXTURE_VERTICES);
                this.texLocations[0] = this.program.b("in_tc_y");
                this.texLocations[1] = this.program.b("in_tc_u");
                this.texLocations[2] = this.program.b("in_tc_v");
                this.colorMatrixLocation = GLES20.glGetUniformLocation(this.program.a, "mColorConversion");
                lxa1.c();
                setupTextures();
                lxa1.c();
            } catch (GlUtil$GlException e) {
                Log.e(VideoDecoderGLSurfaceView.TAG, "Failed to set up the textures and program", e);
            }
        }

        public void setOutputBuffer(nl31 nl31Var) {
            if (this.pendingOutputBufferReference.getAndSet(nl31Var) == null) {
                this.surfaceView.requestRender();
            } else {
                ny61.u();
            }
        }
    }

    public VideoDecoderGLSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Renderer renderer = new Renderer(this);
        this.renderer = renderer;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(renderer);
        setRenderMode(0);
    }

    @Deprecated
    public ol31 getVideoDecoderOutputBufferRenderer() {
        return this;
    }

    public void setOutputBuffer(nl31 nl31Var) {
        this.renderer.setOutputBuffer(nl31Var);
    }

    public VideoDecoderGLSurfaceView(Context context) {
        this(context, null);
    }
}
