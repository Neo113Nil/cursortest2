package xsna;

import android.opengl.GLES20;
import com.ironsource.X3;

/* compiled from: CrtFilter.kt */
/* loaded from: classes12.dex */
public final class qjk extends kax {
    public final int s;

    public qjk() {
        super("uniform mat4 mvpMatrix;\nuniform mat4 texMatrix;\nattribute highp vec4 aPosition;\nattribute highp vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n   gl_Position = mvpMatrix * aPosition;   vTextureCoord = (texMatrix * aTextureCoord).xy;}\n", "\n%s\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform %s sTexture;\nuniform int orientation;\nuniform float paramIntensity;\nvoid main() {\n    float intensity = (paramIntensity / 100.0)*2.5;\n    float f  = sin( (orientation > 0 ? vTextureCoord.x : vTextureCoord.y) * 320.0 * 3.14 );\n    float o  = f * (0.35 / 320.0);\n    float s  = f * .03 + 0.97;\n    float l  = 0.97;\n    float r = texture2D(sTexture, vec2( vTextureCoord.x+o, vTextureCoord.y+o ) ).r;\n    float g = texture2D(sTexture, vec2( vTextureCoord.x-o, vTextureCoord.y+o ) ).g;\n    float b = texture2D(sTexture, vec2( vTextureCoord.x, vTextureCoord.y-o ) ).b;\n    vec4 ts = texture2D(sTexture, vTextureCoord);\n    gl_FragColor = mix(ts, vec4( r*0.7, g, b*0.9, l)*l*s, intensity);\n}\n");
        this.s = 1;
    }

    @Override // xsna.kax
    public final float g(float f) {
        return f * 40.0f;
    }

    @Override // xsna.kax, xsna.e0u, xsna.umv
    public final void onDraw() {
        super.onDraw();
        int f = f(X3.i.n);
        float[] fArr = nap.a;
        GLES20.glUniform1i(f, this.s);
    }
}
