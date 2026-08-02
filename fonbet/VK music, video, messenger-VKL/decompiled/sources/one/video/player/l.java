package one.video.player;

import android.util.Size;
import android.view.Surface;

/* compiled from: OneVideoSurfaceHolder.kt */
/* loaded from: classes8.dex */
public interface l {

    /* compiled from: OneVideoSurfaceHolder.kt */
    public interface a {
        void a(Surface surface);
    }

    void a(one.video.player.b bVar);

    Size f();

    Surface getSurface();

    /* compiled from: OneVideoSurfaceHolder.kt */
    public static final class b implements l {
        public final Surface a;

        public b(Surface surface) {
            this.a = surface;
        }

        @Override // one.video.player.l
        public final Size f() {
            return null;
        }

        @Override // one.video.player.l
        public final Surface getSurface() {
            return this.a;
        }

        @Override // one.video.player.l
        public final void a(one.video.player.b bVar) {
        }
    }
}
