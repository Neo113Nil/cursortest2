package xsna;

import com.vk.media.MediaUtils;
import com.vk.media.gles.EglTexture;
import xsna.pes;
import xsna.xk9;

/* compiled from: CameraDrawable.java */
/* loaded from: classes3.dex */
public abstract class ci9 extends com.vk.media.gles.a {
    public final a e;
    public xk9.a f;
    public boolean g;
    public boolean h;

    /* compiled from: CameraDrawable.java */
    public static class a implements xk9.c {
        public final Object a = new Object();
        public final pes.b b = new pes.b();
        public final pes.b c = new pes.b();
        public boolean d = false;
    }

    /* compiled from: CameraDrawable.java */
    public static class b extends ci9 {
    }

    public ci9(EglTexture eglTexture) {
        super(eglTexture);
        this.e = new a();
        this.g = false;
        new MediaUtils.d();
    }

    public final void j() {
        xk9.a aVar = this.f;
        if (aVar != null) {
            ri9 ri9Var = (ri9) aVar;
            synchronized (ri9Var.b) {
                ri9Var.c.a.e();
                ri9Var.g = false;
            }
        }
        a aVar2 = this.e;
        aVar2.b.a.e();
        aVar2.c.a.e();
    }
}
