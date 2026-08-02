package xsna;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.util.Map;

/* compiled from: FrescoCloseableDrawable.kt */
/* loaded from: classes2.dex */
public final class xgs implements svf {
    public kcl b;

    public xgs(Drawable drawable) {
        this.b = uvf.x(drawable, lmc.b, uvf.g);
    }

    @Override // xsna.svf
    public final mjw B() {
        return null;
    }

    @Override // xsna.svf
    public final cpe0 R3() {
        return gpw.d;
    }

    @Override // xsna.svf
    public final boolean c4() {
        return false;
    }

    @Override // xsna.svf, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        kcl kclVar;
        synchronized (this) {
            kclVar = this.b;
            this.b = null;
        }
        if (kclVar != null) {
            kclVar.close();
        }
    }

    @Override // xsna.muu, xsna.kuu
    public final Map<String, Object> getExtras() {
        return jgp.b;
    }

    @Override // xsna.svf, xsna.mjw
    public final int getHeight() {
        if (x() == null) {
            return 0;
        }
        return Math.max(0, x().getIntrinsicHeight());
    }

    @Override // xsna.svf, xsna.mjw
    public final int getWidth() {
        if (x() == null) {
            return 0;
        }
        return Math.max(0, x().getIntrinsicWidth());
    }

    @Override // xsna.svf
    public final boolean isClosed() {
        return this.b == null;
    }

    @Override // xsna.svf
    public final int u() {
        if (x() instanceof BitmapDrawable) {
            return id7.d(((BitmapDrawable) x()).getBitmap());
        }
        return Math.max(1, getHeight() * getWidth() * 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Drawable x() {
        kcl kclVar = this.b;
        if (kclVar != null) {
            return (Drawable) kclVar.r();
        }
        return null;
    }

    @Override // xsna.kuu
    public final void b(Map<String, ? extends Object> map) {
    }
}
