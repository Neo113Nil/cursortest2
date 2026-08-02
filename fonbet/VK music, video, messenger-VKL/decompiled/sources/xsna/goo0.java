package xsna;

import android.graphics.Bitmap;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.media3.common.VideoFrameProcessingException;
import xsna.jms0;
import xsna.o0u;

/* compiled from: TextureManager.java */
/* loaded from: classes12.dex */
public abstract class goo0 implements o0u.b {
    public final jms0 a;
    public final Object b = new Object();

    @Nullable
    public jms0.b c;

    public goo0(jms0 jms0Var) {
        this.a = jms0Var;
    }

    @Override // xsna.o0u.b
    public final void a() {
        this.a.f(new jms0.b() { // from class: xsna.foo0
            @Override // xsna.jms0.b
            public final void run() {
                goo0.this.d();
            }
        }, true);
    }

    public void d() throws VideoFrameProcessingException {
        synchronized (this.b) {
            try {
                jms0.b bVar = this.c;
                if (bVar != null) {
                    this.a.g(bVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Surface f() {
        throw new UnsupportedOperationException();
    }

    public abstract int g();

    public void h(Bitmap bitmap, hfs hfsVar, k5j k5jVar) {
        throw new UnsupportedOperationException();
    }

    public void i(int i, long j) {
        throw new UnsupportedOperationException();
    }

    public void j(hfs hfsVar) {
        throw new UnsupportedOperationException();
    }

    public abstract void k() throws VideoFrameProcessingException;

    public void n(com.vk.movika.sdk.base.hooks.f fVar) {
        throw new UnsupportedOperationException();
    }

    public abstract void o(mml mmlVar);

    public abstract void p();

    public void c() {
    }

    public void l() {
    }

    public void m(hfs hfsVar, boolean z) {
    }
}
