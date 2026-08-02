package xsna;

import com.vk.media.pipeline.model.effect.VideoEffect;

/* compiled from: RenderingParams.kt */
/* loaded from: classes3.dex */
public final class mzf0 {
    public final ocs a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public mzf0(ocs ocsVar, int i, int i2, int i3, int i4) {
        this.a = ocsVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public static mzf0 a(mzf0 mzf0Var, ocs ocsVar, int i, int i2, int i3, int i4, int i5) {
        if ((i5 & 1) != 0) {
            ocsVar = mzf0Var.a;
        }
        ocs ocsVar2 = ocsVar;
        if ((i5 & 2) != 0) {
            i = mzf0Var.b;
        }
        int i6 = i;
        if ((i5 & 4) != 0) {
            i2 = mzf0Var.c;
        }
        int i7 = i2;
        if ((i5 & 8) != 0) {
            i3 = mzf0Var.d;
        }
        int i8 = i3;
        if ((i5 & 16) != 0) {
            i4 = mzf0Var.e;
        }
        mzf0Var.getClass();
        return new mzf0(ocsVar2, i6, i7, i8, i4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mzf0)) {
            return false;
        }
        mzf0 mzf0Var = (mzf0) obj;
        return epx.f(this.a, mzf0Var.a) && this.b == mzf0Var.b && this.c == mzf0Var.c && this.d == mzf0Var.d && this.e == mzf0Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + shy.a(this.d, shy.a(this.c, shy.a(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("configure video frame handler:\n- video (decoder) size=");
        sb.append(this.b);
        sb.append('x');
        sb.append(this.c);
        sb.append("\n- video (viewPort) size=");
        sb.append(this.d);
        sb.append('x');
        sb.append(this.e);
        sb.append("\n- video (decoder) rotation=");
        ocs ocsVar = this.a;
        sb.append(ocsVar.a);
        sb.append("\n- custom transformation matrix=");
        VideoEffect videoEffect = ocsVar.b;
        sb.append(videoEffect != null ? videoEffect.b : null);
        sb.append('\n');
        return sb.toString();
    }
}
