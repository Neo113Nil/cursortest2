package xsna;

import android.opengl.GLES20;
import com.vk.media.filters.model.Hsl;

/* compiled from: HslFilter.kt */
/* loaded from: classes12.dex */
public final class vgv extends e0u {
    public Hsl q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;

    @Override // xsna.e0u, xsna.umv
    public final void init() {
        super.init();
        this.r = f("hsl_red");
        this.s = f("hsl_orange");
        this.t = f("hsl_yellow");
        this.u = f("hsl_green");
        this.v = f("hsl_cyan");
        this.w = f("hsl_blue");
        this.x = f("hsl_purple");
        this.y = f("hsl_magenta");
    }

    @Override // xsna.e0u, xsna.umv
    public final void onDraw() {
        int i = this.r;
        Hsl.Params params = this.q.b;
        GLES20.glUniform3f(i, params.e * 0.25f, params.f, params.g / 2.7f);
        int i2 = this.s;
        Hsl.Params params2 = this.q.c;
        GLES20.glUniform3f(i2, params2.e * 0.15f, params2.f, params2.g / 2.7f);
        int i3 = this.t;
        Hsl.Params params3 = this.q.d;
        GLES20.glUniform3f(i3, params3.e * 0.3f, params3.f, params3.g / 2.7f);
        int i4 = this.u;
        Hsl.Params params4 = this.q.e;
        GLES20.glUniform3f(i4, params4.e * 0.3f, params4.f * 1.1f, params4.g / 2.7f);
        int i5 = this.v;
        Hsl.Params params5 = this.q.f;
        GLES20.glUniform3f(i5, params5.e * 0.4f, params5.f, params5.g / 2.2f);
        int i6 = this.w;
        Hsl.Params params6 = this.q.g;
        GLES20.glUniform3f(i6, params6.e * 0.4f, params6.f * 1.2f, params6.g / 2.0f);
        int i7 = this.x;
        Hsl.Params params7 = this.q.h;
        GLES20.glUniform3f(i7, params7.e * 0.4f, params7.f, params7.g / 2.7f);
        int i8 = this.y;
        Hsl.Params params8 = this.q.i;
        GLES20.glUniform3f(i8, params8.e * 0.4f, params8.f, params8.g / 2.7f);
    }
}
