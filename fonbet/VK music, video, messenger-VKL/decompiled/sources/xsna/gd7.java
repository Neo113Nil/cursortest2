package xsna;

import android.graphics.Bitmap;
import android.graphics.Gainmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.Build;
import androidx.annotation.Nullable;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.LinkedHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import xsna.gd7;
import xsna.jms0;

/* compiled from: BitmapTextureManager.java */
/* loaded from: classes12.dex */
public final class gd7 extends goo0 {
    public final LinkedBlockingQueue d;
    public final k0u e;
    public final boolean f;
    public mml g;

    @Nullable
    public r0u h;
    public int i;
    public boolean j;
    public boolean k;

    /* compiled from: BitmapTextureManager.java */
    public static final class a {
        public final Bitmap a;
        public final hfs b;
        public final k5j c;

        public a(Bitmap bitmap, hfs hfsVar, k5j k5jVar) {
            this.a = bitmap;
            this.b = hfsVar;
            this.c = k5jVar;
        }
    }

    public gd7(k0u k0uVar, jms0 jms0Var, boolean z) {
        super(jms0Var);
        this.e = k0uVar;
        this.d = new LinkedBlockingQueue();
        this.f = z;
    }

    @Override // xsna.goo0
    public final void d() throws VideoFrameProcessingException {
        this.d.clear();
        this.k = false;
        this.j = false;
        this.i = 0;
        r0u r0uVar = this.h;
        if (r0uVar != null) {
            try {
                r0uVar.a();
                this.h = null;
            } catch (GlUtil.GlException e) {
                throw VideoFrameProcessingException.a(C.TIME_UNSET, e);
            }
        }
        super.d();
    }

    @Override // xsna.o0u.b
    public final void e() {
        this.a.f(new jms0.b() { // from class: xsna.dd7
            @Override // xsna.jms0.b
            public final void run() {
                gd7 gd7Var = gd7.this;
                gd7Var.i++;
                gd7Var.q();
            }
        }, true);
    }

    @Override // xsna.goo0
    public final int g() {
        return 0;
    }

    @Override // xsna.goo0
    public final void h(final Bitmap bitmap, final hfs hfsVar, final k5j k5jVar) {
        this.a.f(new jms0.b() { // from class: xsna.fd7
            @Override // xsna.jms0.b
            public final void run() {
                k5j k5jVar2 = k5jVar;
                fxc0.q(k5jVar2.b(), "Bitmap queued but no timestamps provided.");
                gd7 gd7Var = gd7.this;
                gd7Var.d.add(new gd7.a(bitmap, hfsVar, k5jVar2));
                gd7Var.q();
                gd7Var.j = false;
            }
        }, true);
    }

    @Override // xsna.goo0
    public final void k() {
        this.a.f(new jms0.b() { // from class: xsna.ed7
            @Override // xsna.jms0.b
            public final void run() {
                gd7 gd7Var = gd7.this;
                r0u r0uVar = gd7Var.h;
                if (r0uVar != null) {
                    r0uVar.a();
                }
                gd7Var.d.clear();
            }
        }, true);
    }

    @Override // xsna.goo0
    public final void o(mml mmlVar) {
        this.i = 0;
        this.g = mmlVar;
    }

    @Override // xsna.goo0
    public final void p() {
        this.a.f(new jms0.b() { // from class: xsna.cd7
            @Override // xsna.jms0.b
            public final void run() {
                gd7 gd7Var = gd7.this;
                if (!gd7Var.d.isEmpty()) {
                    gd7Var.j = true;
                    return;
                }
                mml mmlVar = gd7Var.g;
                mmlVar.getClass();
                mmlVar.f();
                a7l.a();
            }
        }, true);
    }

    public final void q() throws VideoFrameProcessingException {
        boolean hasGainmap;
        Gainmap gainmap;
        if (this.d.isEmpty() || this.i == 0) {
            return;
        }
        a aVar = (a) this.d.element();
        hfs hfsVar = aVar.b;
        k5j k5jVar = aVar.c;
        fxc0.z(k5jVar.b());
        long j = aVar.b.b;
        fxc0.z(k5jVar.b());
        int i = k5jVar.e;
        k5jVar.e = i + 1;
        long round = Math.round(k5jVar.b * i);
        fxc0.z(round >= 0);
        long j2 = round + j;
        if (!this.k) {
            this.k = true;
            Bitmap bitmap = aVar.a;
            try {
                r0u r0uVar = this.h;
                if (r0uVar != null) {
                    r0uVar.a();
                }
                int[] iArr = new int[1];
                GLES20.glGenTextures(1, iArr, 0);
                GlUtil.d();
                int i2 = iArr[0];
                GlUtil.a(bitmap.getWidth(), bitmap.getHeight());
                GlUtil.b(3553, i2, 9729);
                GLUtils.texImage2D(3553, 0, bitmap, 0);
                GlUtil.d();
                androidx.media3.common.a aVar2 = hfsVar.a;
                this.h = new r0u(i2, -1, aVar2.u, aVar2.v);
                if (Build.VERSION.SDK_INT >= 34) {
                    hasGainmap = bitmap.hasGainmap();
                    if (hasGainmap) {
                        mml mmlVar = this.g;
                        mmlVar.getClass();
                        gainmap = bitmap.getGainmap();
                        gainmap.getClass();
                        mmlVar.n(x81.c(gainmap));
                    }
                }
                if (this.f) {
                    mml mmlVar2 = this.g;
                    mmlVar2.getClass();
                    fxc0.z(mmlVar2.a.c == 1);
                    mmlVar2.u = true;
                    mmlVar2.v = false;
                }
            } catch (GlUtil.GlException e) {
                throw VideoFrameProcessingException.a(C.TIME_UNSET, e);
            }
        }
        this.i--;
        mml mmlVar3 = this.g;
        mmlVar3.getClass();
        k0u k0uVar = this.e;
        r0u r0uVar2 = this.h;
        r0uVar2.getClass();
        mmlVar3.c(k0uVar, r0uVar2, j2);
        androidx.media3.common.a aVar3 = hfsVar.a;
        int i3 = aVar3.u;
        int i4 = aVar3.v;
        LinkedHashMap linkedHashMap = a7l.a;
        synchronized (a7l.class) {
        }
        if (aVar.c.b()) {
            return;
        }
        this.k = false;
        ((a) this.d.remove()).a.recycle();
        if (this.d.isEmpty() && this.j) {
            mml mmlVar4 = this.g;
            mmlVar4.getClass();
            mmlVar4.f();
            a7l.a();
            this.j = false;
        }
    }
}
