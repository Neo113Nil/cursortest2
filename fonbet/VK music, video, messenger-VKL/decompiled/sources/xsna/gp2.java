package xsna;

import android.net.Uri;

/* compiled from: AnimationFrameCacheKey.kt */
/* loaded from: classes12.dex */
public final class gp2 implements ww8 {
    public final boolean a;
    public final String b;

    public gp2(int i, boolean z) {
        this.a = z;
        this.b = lhg.a(i, "anim://");
    }

    @Override // xsna.ww8
    public final String a() {
        return this.b;
    }

    @Override // xsna.ww8
    public final boolean b() {
        return false;
    }

    @Override // xsna.ww8
    public final boolean c(Uri uri) {
        return brm0.B(uri.toString(), this.b, false);
    }

    public final boolean equals(Object obj) {
        if (!this.a) {
            return super.equals(obj);
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || !gp2.class.equals(obj.getClass())) {
            return false;
        }
        return epx.f(this.b, ((gp2) obj).b);
    }

    public final int hashCode() {
        return !this.a ? super.hashCode() : this.b.hashCode();
    }
}
