package xsna;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Size;
import android.view.Surface;
import java.lang.ref.WeakReference;
import one.video.player.BaseVideoPlayer;
import xsna.hzf0;

/* compiled from: RendererHandler.kt */
/* loaded from: classes8.dex */
public final class bzf0 extends Handler {
    public final WeakReference<hzf0> a;

    /* compiled from: RendererHandler.kt */
    public static final class a {
        public final BaseVideoPlayer a;
        public final hzf0.a b;
        public final Handler c;

        public a(BaseVideoPlayer baseVideoPlayer, hzf0.a aVar, Handler handler) {
            this.a = baseVideoPlayer;
            this.b = aVar;
            this.c = handler;
        }
    }

    /* compiled from: RendererHandler.kt */
    public static final class b {
        public final BaseVideoPlayer a;
        public final a2t b;

        public b(BaseVideoPlayer baseVideoPlayer, a2t a2tVar) {
            this.a = baseVideoPlayer;
            this.b = a2tVar;
        }
    }

    /* compiled from: RendererHandler.kt */
    public static final class c {
        public final BaseVideoPlayer a;
        public final Surface b;

        public c(BaseVideoPlayer baseVideoPlayer, Surface surface) {
            this.a = baseVideoPlayer;
            this.b = surface;
        }

        public final boolean equals(Object obj) {
            c cVar = obj instanceof c ? (c) obj : null;
            if (cVar == null) {
                return false;
            }
            return this.a.equals(cVar.a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }
    }

    /* compiled from: RendererHandler.kt */
    public static final class d {
        public final Object a;
        public final Size b;

        public d(Object obj, Size size) {
            this.a = obj;
            this.b = size;
        }
    }

    public bzf0(Looper looper, WeakReference<hzf0> weakReference) {
        super(looper);
        this.a = weakReference;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        hzf0 hzf0Var = this.a.get();
        if (hzf0Var == null) {
            return;
        }
        int i = message.what;
        if (i == 0) {
            a aVar = (a) message.obj;
            hzf0Var.a(aVar.a, aVar.b, aVar.c);
            return;
        }
        if (i == 1) {
            hzf0Var.b(message.obj);
            return;
        }
        if (i == 2) {
            c cVar = (c) message.obj;
            hzf0Var.h(cVar.a, cVar.b);
            return;
        }
        if (i == 3) {
            b bVar = (b) message.obj;
            hzf0Var.g(bVar.a, bVar.b);
        } else if (i == 4) {
            hzf0Var.f(message.obj);
        } else {
            if (i != 5) {
                throw new IllegalStateException(lhg.a(message.what, "unknown message with type "));
            }
            d dVar = (d) message.obj;
            hzf0Var.i(dVar.a, dVar.b);
        }
    }
}
