package xsna;

import com.vk.bridges.ImageViewer;
import com.vk.dto.attaches.AttachForMediaViewer;

/* compiled from: MediaViewerCallback.kt */
/* loaded from: classes16.dex */
public final class e120 extends xmw {
    public final fza g;
    public final sz h;
    public final io.reactivex.rxjava3.disposables.b i;

    /* compiled from: MediaViewerCallback.kt */
    public static final class a {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            ((a) obj).getClass();
            return epx.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NextPageRequestData(attach=");
            sb.append((Object) null);
            sb.append(", swipeDirection=");
            sb.append((Object) null);
            sb.append(", isOffline=");
            return defpackage.q0.a(sb, false, ')');
        }
    }

    public e120(fza fzaVar, sz szVar, sh3 sh3Var, yh yhVar, ic icVar, com.vk.movika.sdk.android.defaultplayer.view.timeline.a aVar, dwn dwnVar) {
        super(sh3Var, yhVar, icVar, aVar, dwnVar, true);
        this.g = fzaVar;
        this.h = szVar;
        io.reactivex.rxjava3.subjects.f fVar = new io.reactivex.rxjava3.subjects.f();
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        this.i = bVar;
        bVar.b(new io.reactivex.rxjava3.internal.operators.observable.y(fVar, io.reactivex.rxjava3.internal.functions.a.a, new nb(new nde(this), 22)).subscribe(new ir0(new kdn(this, 20), 23)));
    }

    @Override // xsna.xmw, com.vk.bridges.ImageViewer.a
    public final void n(int i) {
        this.h.invoke(Integer.valueOf(i));
    }

    @Override // xsna.xmw, com.vk.bridges.ImageViewer.a
    public final void onDismiss() {
        super.onDismiss();
        this.i.dispose();
    }

    @Override // xsna.xmw, com.vk.bridges.ImageViewer.a
    public final void v(AttachForMediaViewer attachForMediaViewer, ImageViewer.SwipeDirection swipeDirection, boolean z) {
        g2v.c().getClass();
    }
}
