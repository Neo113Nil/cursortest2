package xsna;

import android.opengl.GLES20;
import android.opengl.Matrix;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.Objects;
import ru.ok.gl.objects.GLProgram;

/* compiled from: GlFilter.java */
/* loaded from: classes12.dex */
public class e0u implements umv {
    public static final float[] p = {-1.0f, -1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, -1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -1.0f, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1.0f, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1.0f};
    public final String b;
    public final String c;
    public boolean d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public float[] j;
    public float[] k;
    public int l;
    public boolean m;
    public boolean n;
    public final HashMap o;

    public e0u() {
        this("uniform mat4 mvpMatrix;\nuniform mat4 texMatrix;\nattribute highp vec4 aPosition;\nattribute highp vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n   gl_Position = mvpMatrix * aPosition;   vTextureCoord = (texMatrix * aTextureCoord).xy;}\n", "%s\nprecision mediump float;\nvarying highp vec2 vTextureCoord;\nuniform %s sTexture;void main() {\ngl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
    }

    @Override // xsna.umv
    public final void b(float[] fArr) {
        this.k = fArr;
    }

    @Override // xsna.umv
    public final void c(float[] fArr) {
        this.j = fArr;
    }

    @Override // xsna.umv
    public final void d() {
        this.d = false;
    }

    @Override // xsna.umv
    @NonNull
    public final String e(boolean z) {
        String str = this.c;
        return z ? String.format(str, "#extension GL_OES_EGL_image_external : require", "samplerExternalOES") : String.format(str, "", "sampler2D");
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            e0u e0uVar = (e0u) obj;
            if (Objects.equals(this.b, e0uVar.b) && Objects.equals(this.c, e0uVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int f(String str) {
        HashMap hashMap = this.o;
        Integer num = (Integer) hashMap.get(str);
        if (num != null) {
            return num.intValue();
        }
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.e, str);
        if (glGetAttribLocation == -1) {
            glGetAttribLocation = GLES20.glGetUniformLocation(this.e, str);
        }
        if (glGetAttribLocation != -1) {
            hashMap.put(str, Integer.valueOf(glGetAttribLocation));
        }
        float[] fArr = nap.a;
        return glGetAttribLocation;
    }

    public int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + (hashCode * 31) + hashCode;
    }

    @Override // xsna.umv
    public final void i() {
        this.m = true;
    }

    @Override // xsna.umv
    public void init() {
        float[] fArr = nap.a;
        if (this.m) {
            return;
        }
        release();
        this.f = nap.f(35633, this.b);
        int f = nap.f(35632, e(this.d));
        this.g = f;
        this.e = nap.d(this.f, f);
        this.h = f(GLProgram.VERTEX_SHADER_UNI_MVP_MATRIX);
        this.i = f(GLProgram.VERTEX_SHADER_UNI_TEXTURE_MATRIX);
        FloatBuffer c = nap.c(p);
        int[] iArr = new int[1];
        GLES20.glGenBuffers(1, iArr, 0);
        GLES20.glBindBuffer(34962, iArr[0]);
        GLES20.glBufferData(34962, c.capacity() * 4, c, 35044);
        GLES20.glBindBuffer(34962, 0);
        this.l = iArr[0];
        f("aPosition");
        f(GLProgram.VERTEX_SHADER_ATTR_TEXTURE_COORDINATES);
        f(GLProgram.FRAGMENT_SHADER_UNI_TEXTURE_SAMPLER);
        this.n = true;
    }

    @Override // xsna.umv
    public final void l(int i) {
        this.e = i;
    }

    @Override // xsna.umv
    public final void n(int i) {
        float[] fArr = nap.a;
        GLES20.glUseProgram(this.e);
        if (this.j == null) {
            float[] fArr2 = new float[16];
            this.j = fArr2;
            Matrix.setIdentityM(fArr2, 0);
        }
        if (this.k == null) {
            float[] fArr3 = new float[16];
            this.k = fArr3;
            Matrix.setIdentityM(fArr3, 0);
        }
        GLES20.glUniformMatrix4fv(this.h, 1, false, this.j, 0);
        GLES20.glUniformMatrix4fv(this.i, 1, false, this.k, 0);
        GLES20.glBindBuffer(34962, this.l);
        GLES20.glEnableVertexAttribArray(f("aPosition"));
        GLES20.glVertexAttribPointer(f("aPosition"), 3, 5126, false, 20, 0);
        GLES20.glEnableVertexAttribArray(f(GLProgram.VERTEX_SHADER_ATTR_TEXTURE_COORDINATES));
        GLES20.glVertexAttribPointer(f(GLProgram.VERTEX_SHADER_ATTR_TEXTURE_COORDINATES), 2, 5126, false, 20, 12);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(this.d ? 36197 : 3553, i);
        GLES20.glUniform1i(f(GLProgram.FRAGMENT_SHADER_UNI_TEXTURE_SAMPLER), 0);
        onDraw();
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(f("aPosition"));
        GLES20.glDisableVertexAttribArray(f(GLProgram.VERTEX_SHADER_ATTR_TEXTURE_COORDINATES));
        GLES20.glBindTexture(3553, 0);
        GLES20.glBindBuffer(34962, 0);
    }

    @Override // xsna.umv
    @NonNull
    public final String p() {
        return this.b;
    }

    @Override // xsna.umv
    public void release() {
        float[] fArr = nap.a;
        if (this.m || !this.n) {
            return;
        }
        GLES20.glDeleteProgram(this.e);
        this.e = 0;
        GLES20.glDeleteShader(this.f);
        this.f = 0;
        GLES20.glDeleteShader(this.g);
        this.g = 0;
        GLES20.glDeleteBuffers(1, new int[]{this.l}, 0);
        this.l = 0;
        this.o.clear();
        this.n = false;
    }

    public e0u(String str, String str2) {
        this.d = true;
        this.m = false;
        this.n = false;
        this.o = new HashMap();
        this.b = str;
        this.c = str2;
    }

    @Override // xsna.umv
    public void onDraw() {
    }

    @Override // xsna.umv
    public void h(float f) {
    }

    @Override // xsna.umv
    public void a(int i, int i2) {
    }
}
