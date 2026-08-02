package xsna;

import android.opengl.GLES20;
import com.ironsource.X3;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.LinkedList;

/* compiled from: GPUImageFilter.java */
/* loaded from: classes12.dex */
public class n2t {
    public final LinkedList<Runnable> a = new LinkedList<>();
    public final String b = "attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}";
    public final String c = "varying highp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}";
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;

    public int a() {
        return this.d;
    }

    public void b() {
        if (this.h) {
            return;
        }
        e();
    }

    public void d(int i, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        GLES20.glUseProgram(this.d);
        synchronized (this.a) {
            while (!this.a.isEmpty()) {
                try {
                    this.a.removeFirst().run();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (this.h) {
            floatBuffer.position(0);
            GLES20.glVertexAttribPointer(this.e, 2, 5126, false, 0, (Buffer) floatBuffer);
            GLES20.glEnableVertexAttribArray(this.e);
            floatBuffer2.position(0);
            GLES20.glVertexAttribPointer(this.g, 2, 5126, false, 0, (Buffer) floatBuffer2);
            GLES20.glEnableVertexAttribArray(this.g);
            if (i != -1) {
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, i);
                GLES20.glUniform1i(this.f, 0);
            }
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisableVertexAttribArray(this.e);
            GLES20.glDisableVertexAttribArray(this.g);
            GLES20.glBindTexture(3553, 0);
        }
    }

    public void e() {
        int e = nap.e(this.b, this.c);
        this.d = e;
        this.e = GLES20.glGetAttribLocation(e, X3.i.L);
        this.f = GLES20.glGetUniformLocation(this.d, "inputImageTexture");
        this.g = GLES20.glGetAttribLocation(this.d, "inputTextureCoordinate");
        this.h = true;
    }

    public void c() {
    }

    public void f(int i, int i2) {
    }
}
