package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* loaded from: classes10.dex */
public final class cbm implements q7v {
    public final Drawable a;

    public cbm(Drawable drawable) {
        this.a = drawable;
    }

    @Override // defpackage.q7v
    public final boolean a() {
        return false;
    }

    public final Drawable b() {
        return this.a;
    }

    @Override // defpackage.q7v
    public final void draw(Canvas canvas) {
        this.a.draw(canvas);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cbm) && jl40.l(this.a, ((cbm) obj).a);
    }

    @Override // defpackage.q7v
    public final int getHeight() {
        return zx21.a(this.a);
    }

    @Override // defpackage.q7v
    public final long getSize() {
        Drawable drawable = this.a;
        long b = zx21.b(drawable) * 4 * zx21.a(drawable);
        if (b < 0) {
            return 0L;
        }
        return b;
    }

    @Override // defpackage.q7v
    public final int getWidth() {
        return zx21.b(this.a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DrawableImage(drawable=" + this.a + ", shareable=false)";
    }
}
