package xsna;

import android.util.Size;
import android.view.Surface;
import java.util.function.Consumer;
import one.video.player.l;

/* compiled from: ViewSurfaceHolder.kt */
/* loaded from: classes8.dex */
public final class h1u0 implements one.video.player.l {
    public final Consumer<Size> a;
    public Surface b;
    public l.a c;
    public volatile Size d;

    public h1u0(d1u0 d1u0Var) {
        this.a = d1u0Var;
    }

    public static final void b(h1u0 h1u0Var, Surface surface) {
        h1u0Var.b = surface;
        l.a aVar = h1u0Var.c;
        if (aVar != null) {
            aVar.a(surface);
        }
    }

    @Override // one.video.player.l
    public final void a(one.video.player.b bVar) {
        this.c = bVar;
    }

    @Override // one.video.player.l
    public final Size f() {
        return this.d;
    }

    @Override // one.video.player.l
    public final Surface getSurface() {
        return this.b;
    }
}
