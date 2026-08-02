package xsna;

import android.opengl.GLES20;
import com.huawei.hms.adapter.internal.CommonCode;

/* compiled from: RawFilter.kt */
/* loaded from: classes12.dex */
public class iye0 extends kax {
    public int s;
    public final float[] t;

    public iye0(String str) {
        super("uniform mat4 mvpMatrix;\nuniform mat4 texMatrix;\nattribute highp vec4 aPosition;\nattribute highp vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n   gl_Position = mvpMatrix * aPosition;   vTextureCoord = (texMatrix * aTextureCoord).xy;}\n", str);
        this.s = -1;
        this.t = new float[2];
    }

    @Override // xsna.e0u, xsna.umv
    public final void a(int i, int i2) {
        float[] fArr = this.t;
        fArr[0] = i;
        fArr[1] = i2;
    }

    @Override // xsna.kax, xsna.e0u, xsna.umv
    public void init() {
        super.init();
        this.s = f(CommonCode.MapKey.HAS_RESOLUTION);
    }

    @Override // xsna.kax, xsna.e0u, xsna.umv
    public void onDraw() {
        super.onDraw();
        int i = this.s;
        if (i != -1) {
            float[] fArr = this.t;
            GLES20.glUniform2f(i, fArr[0], fArr[1]);
        }
    }

    @Override // xsna.kax, xsna.e0u, xsna.umv
    public void release() {
        this.s = -1;
        super.release();
    }
}
