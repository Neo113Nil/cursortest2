package xsna;

import com.vk.bridges.ImageViewer;
import com.vk.dto.attaches.AttachForMediaViewer;

/* compiled from: MediaViewerCallback.kt */
/* loaded from: classes2.dex */
public final class g120 extends wmw {
    public final a1w g;
    public final ah h;
    public final wn7 i;
    public final com.vk.movika.sdk.base.observable.g j;
    public final gzs<Boolean> k;
    public final io.reactivex.rxjava3.subjects.f<a> l;
    public final io.reactivex.rxjava3.disposables.b m;
    public final f120 n;

    /* compiled from: MediaViewerCallback.kt */
    public static final class a {
        public final AttachForMediaViewer a;
        public final ImageViewer.SwipeDirection b;
        public final boolean c;

        public a(AttachForMediaViewer attachForMediaViewer, ImageViewer.SwipeDirection swipeDirection, boolean z) {
            this.a = attachForMediaViewer;
            this.b = swipeDirection;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NextPageRequestData(attach=");
            sb.append(this.a);
            sb.append(", swipeDirection=");
            sb.append(this.b);
            sb.append(", isOffline=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    public g120(a1w a1wVar, ah ahVar, wn7 wn7Var, com.vk.movika.sdk.base.observable.g gVar, gzs gzsVar, bi0 bi0Var, s4 s4Var, a94 a94Var, in0 in0Var, z4 z4Var) {
        super(bi0Var, s4Var, a94Var, in0Var, z4Var, ((Boolean) gzsVar.invoke()).booleanValue());
        this.g = a1wVar;
        this.h = ahVar;
        this.i = wn7Var;
        this.j = gVar;
        this.k = gzsVar;
        io.reactivex.rxjava3.subjects.f<a> fVar = new io.reactivex.rxjava3.subjects.f<>();
        this.l = fVar;
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        this.m = bVar;
        bVar.b(new io.reactivex.rxjava3.internal.operators.observable.y(fVar, io.reactivex.rxjava3.internal.functions.a.a, new d810(new a9b(this, 5), 1)).subscribe(new c120(new wpg(this, 29), 0)));
        this.n = new f120(this);
    }

    @Override // xsna.wmw, com.vk.bridges.ImageViewer.a
    public final void n(int i) {
        this.j.invoke(Integer.valueOf(i));
    }

    @Override // xsna.wmw, com.vk.bridges.ImageViewer.a
    public final void onDismiss() {
        this.m.dispose();
        super.onDismiss();
    }

    @Override // xsna.wmw, com.vk.bridges.ImageViewer.a
    public final ImageViewer.d r() {
        return this.n;
    }

    @Override // xsna.wmw, com.vk.bridges.ImageViewer.a
    public final ImageViewer.ControlsOptions u() {
        boolean booleanValue = this.k.invoke().booleanValue();
        return new ImageViewer.ControlsOptions(booleanValue, booleanValue, null, 252);
    }

    @Override // xsna.wmw, com.vk.bridges.ImageViewer.a
    public final void v(AttachForMediaViewer attachForMediaViewer, ImageViewer.SwipeDirection swipeDirection, boolean z) {
        this.l.onNext(new a(attachForMediaViewer, swipeDirection, z));
    }
}
