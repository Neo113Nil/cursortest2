package xsna;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import com.vkontakte.android.R;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import ru.ok.android.api.core.ApiInvocationException;

/* compiled from: SmallVkMixAnimationRenderer.kt */
/* loaded from: classes16.dex */
public final class b4k0 implements GLSurfaceView.Renderer {
    public float A;
    public final Context b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final x3k0 g;
    public long h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public FloatBuffer r;
    public float s;
    public float t;
    public float u;
    public boolean v;
    public ValueAnimator w;
    public ValueAnimator x;
    public ValueAnimator y;
    public float z;

    public b4k0(Context context) {
        this.b = context;
        Color valueOf = Color.valueOf(0.9176471f, 0.1647059f, 0.8313726f, 1.0f);
        this.c = valueOf.red();
        this.d = valueOf.green();
        this.e = valueOf.blue();
        this.f = valueOf.alpha();
        x3k0 x3k0Var = new x3k0();
        x3k0Var.a = 1.0f;
        x3k0Var.c = System.nanoTime();
        this.g = x3k0Var;
        this.t = 0.45f;
        this.u = 1.9f;
        this.z = Float.NaN;
        this.A = Float.NaN;
    }

    public final void d(float f, float f2) {
        ValueAnimator valueAnimator = this.y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        ofFloat.setDuration(1000L);
        ofFloat.setInterpolator(new y3k0(this));
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.z3k0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                b4k0.this.u = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
            }
        });
        ofFloat.start();
        this.y = ofFloat;
    }

    public final void k(float f, float f2) {
        ValueAnimator valueAnimator = this.w;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        ofFloat.setDuration(1000L);
        ofFloat.setInterpolator(new y3k0(this));
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.a4k0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                b4k0.this.t = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
            }
        });
        ofFloat.start();
        this.w = ofFloat;
    }

    public final void l(float f, float f2) {
        ValueAnimator valueAnimator = this.x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat((float) Math.log(f), (float) Math.log(f2));
        ofFloat.setDuration(1000L);
        ofFloat.setInterpolator(new y3k0(this));
        ofFloat.addUpdateListener(new ds6(this, 2));
        ofFloat.start();
        this.x = ofFloat;
    }

    public final int m(int i, int i2) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.b.getResources().openRawResource(i2), emb.b), 8192);
        try {
            String b = a0a.b(bufferedReader);
            bufferedReader.close();
            int glCreateShader = GLES20.glCreateShader(i);
            GLES20.glShaderSource(glCreateShader, b);
            GLES20.glCompileShader(glCreateShader);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            if (iArr[0] == 0) {
                String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(glCreateShader);
                GLES20.glDeleteShader(glCreateShader);
                bn40.c(new RuntimeException(go9.b("SmallVkMixAnimationRenderer. Shader compile error: ", glGetShaderInfoLog)), new Object[0]);
            }
            return glCreateShader;
        } finally {
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        GLES20.glClear(16384);
        x3k0 x3k0Var = this.g;
        x3k0Var.getClass();
        x3k0Var.c = System.nanoTime();
        float f = (x3k0Var.a * ((r1 - x3k0Var.c) / 1.0E9f)) + x3k0Var.b;
        x3k0Var.b = f;
        GLES20.glUniform1f(this.k, (System.currentTimeMillis() - this.h) / 1000.0f);
        GLES20.glUniform1f(this.p, f);
        float f2 = this.z;
        float f3 = this.t;
        if (f2 != f3) {
            GLES20.glUniform1f(this.n, f3);
            this.z = this.t;
        }
        float f4 = this.A;
        float f5 = this.u;
        if (f4 != f5) {
            GLES20.glUniform1f(this.m, f5);
            this.A = this.u;
        }
        FloatBuffer floatBuffer = this.r;
        if (floatBuffer != null) {
            floatBuffer.position(0);
        }
        GLES20.glEnableVertexAttribArray(this.j);
        GLES20.glVertexAttribPointer(this.j, 2, 5126, false, 8, (Buffer) this.r);
        GLES20.glUniform4f(this.o, this.c, this.d, this.e, this.f);
        GLES20.glDrawArrays(5, 0, 1024);
        GLES20.glDisableVertexAttribArray(this.j);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
        GLES20.glUseProgram(this.i);
        int i3 = (int) (i / (this.b.getResources().getDisplayMetrics().density * 28.0f));
        if (i3 < 1) {
            i3 = 1;
        }
        this.s = i3;
        GLES20.glUniform1f(this.l, 1.9f);
        GLES20.glUniform1f(this.m, this.u);
        GLES20.glUniform1f(this.q, this.s);
        GLES20.glUniform1f(this.n, this.t);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(770, 771);
        Color valueOf = Color.valueOf(dhr0.t.c(R.attr.vk_ui_background_content));
        GLES20.glClearColor(valueOf.red(), valueOf.green(), valueOf.blue(), valueOf.alpha());
        int m = m(35633, R.raw.mix_by_my_music_vert);
        int m2 = m(35632, R.raw.mix_by_my_music_frag);
        int glCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(glCreateProgram, m);
        GLES20.glAttachShader(glCreateProgram, m2);
        GLES20.glLinkProgram(glCreateProgram);
        this.i = glCreateProgram;
        this.j = GLES20.glGetAttribLocation(glCreateProgram, "a_position");
        this.k = GLES20.glGetUniformLocation(this.i, "u_time");
        this.l = GLES20.glGetUniformLocation(this.i, "u_amplitude");
        this.m = GLES20.glGetUniformLocation(this.i, "u_frequency");
        GLES20.glGetUniformLocation(this.i, "u_speed");
        this.n = GLES20.glGetUniformLocation(this.i, "u_current_wave_height");
        this.o = GLES20.glGetUniformLocation(this.i, "u_color");
        this.p = GLES20.glGetUniformLocation(this.i, "u_phase");
        this.q = GLES20.glGetUniformLocation(this.i, "u_stripes_count");
        float[] fArr = new float[2048];
        int i = 0;
        for (int i2 = 0; i2 < 512; i2++) {
            float f = ((i2 * 2.0f) / ApiInvocationException.ErrorCodes.IDS_BLOCKED) - 1.0f;
            fArr[i] = f;
            fArr[i + 1] = 0.0f;
            int i3 = i + 3;
            fArr[i + 2] = f;
            i += 4;
            fArr[i3] = -1.0f;
        }
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(8192).order(ByteOrder.nativeOrder()).asFloatBuffer();
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        this.r = asFloatBuffer;
        this.h = System.currentTimeMillis();
    }
}
