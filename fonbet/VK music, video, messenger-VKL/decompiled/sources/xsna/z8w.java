package xsna;

import android.app.Activity;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.attaches.AttachDoc;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.im.engine.models.attaches.AttachVideoMsg;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;
import kotlin.LazyThreadSafetyMode;

/* compiled from: ImListAutoplayPlayer.kt */
/* loaded from: classes2.dex */
public final class z8w implements b9w {
    public final zof a;
    public final boolean b;
    public final a2f c;
    public final com.vk.im.engine.models.c d;
    public final iw00 e;
    public final pbw f;
    public final qbm g;
    public final bpn0 h = new bpn0(new yv2(16));
    public hbt0 i;
    public final Object j;
    public final Object k;

    /* compiled from: ImListAutoplayPlayer.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public final boolean a;
        public final bky b;
        public final a2f c;
        public final com.vk.im.engine.models.c d;
        public final iw00 e;
        public final pbw f;
        public final qbm g;

        public a(boolean z, bky bkyVar, a2f a2fVar, com.vk.im.engine.models.c cVar, iw00 iw00Var, pbw pbwVar, qbm qbmVar) {
            this.a = z;
            this.b = bkyVar;
            this.c = a2fVar;
            this.d = cVar;
            this.e = iw00Var;
            this.f = pbwVar;
            this.g = qbmVar;
        }

        public final z8w a() {
            return new z8w((zof) this.b.invoke(), this.a, this.c, this.d, this.e, this.f, this.g);
        }
    }

    public z8w(zof zofVar, boolean z, a2f a2fVar, com.vk.im.engine.models.c cVar, iw00 iw00Var, pbw pbwVar, qbm qbmVar) {
        this.a = zofVar;
        this.b = z;
        this.c = a2fVar;
        this.d = cVar;
        this.e = iw00Var;
        this.f = pbwVar;
        this.g = qbmVar;
        x3i x3iVar = new x3i(this, 18);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.j = msy.a(lazyThreadSafetyMode, x3iVar);
        this.k = msy.a(lazyThreadSafetyMode, new y3i(this, 17));
    }

    @Override // xsna.xfz
    public final void a() {
        hbt0 hbt0Var = this.i;
        if (hbt0Var == null) {
            hbt0Var = null;
        }
        hbt0Var.y();
    }

    @Override // xsna.b9w
    public final h4w b(AdapterEntryType adapterEntryType) {
        int h = adapterEntryType.h();
        if (h == AdapterEntryType.TYPE_VIDEO_AUTOPLAY.h()) {
            return new com.vk.im.video.g(g(), this.a, this.b, this.c, this.e, this.f, this.g);
        }
        if (h == AdapterEntryType.TYPE_VIDEO_MSG.h()) {
            return new com.vk.im.video.e(g(), this.d.A(), this.f);
        }
        if (h == AdapterEntryType.TYPE_PUBLIC_VIDEO.h()) {
            return new l4w(g());
        }
        if (h == AdapterEntryType.TYPE_GIF_AUTOPLAY.h()) {
            return new com.vk.im.video.a(g());
        }
        if (h == AdapterEntryType.TYPE_INTERACTIVE_VIDEO.h()) {
            return new com.vk.im.video.b();
        }
        throw new UnsupportedOperationException();
    }

    @Override // xsna.xfz
    public final void c(RecyclerView recyclerView) {
        hbt0 hbt0Var = this.i;
        if (hbt0Var == null) {
            hbt0Var = null;
        }
        recyclerView.removeOnScrollListener(hbt0Var);
        g().a = null;
    }

    @Override // xsna.xfz
    public final void d(String str) {
        g().a = str;
    }

    @Override // xsna.xfz
    public final void e(Activity activity, RecyclerView recyclerView) {
        com.vk.libvideo.autoplay.e eVar = com.vk.libvideo.autoplay.e.a;
        com.vk.libvideo.autoplay.e.f(true);
        hbt0 hbt0Var = new hbt0(activity, new ywv(recyclerView, g()), h(), dcw.a, null, 130800);
        this.i = hbt0Var;
        recyclerView.addOnScrollListener(hbt0Var);
        h().c(Lifecycle.Event.ON_CREATE);
        r5i r5iVar = new r5i(this, 21);
        Object obj = new Object();
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter != null) {
            adapter.registerAdapterDataObserver(new tjf0(obj, r5iVar));
        }
    }

    @Override // xsna.b9w
    public final h4w f(Class<?> cls) {
        if (AttachVideoMsg.class.equals(cls)) {
            return new com.vk.im.video.e(g(), this.d.A(), this.f);
        }
        if (!AttachVideo.class.equals(cls)) {
            if (AttachDoc.class.equals(cls)) {
                return new com.vk.im.video.a(g());
            }
            throw new UnsupportedOperationException();
        }
        return new com.vk.im.video.g(g(), this.a, this.b, this.c, this.e, this.f, this.g);
    }

    public final zwv g() {
        return (zwv) this.h.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final androidx.lifecycle.m h() {
        return (androidx.lifecycle.m) this.j.getValue();
    }

    @Override // xsna.xfz
    public final void onDestroy() {
        if (h().d != Lifecycle.State.INITIALIZED) {
            h().c(Lifecycle.Event.ON_DESTROY);
        }
        com.vk.libvideo.autoplay.e eVar = com.vk.libvideo.autoplay.e.a;
        com.vk.libvideo.autoplay.e.f(true);
    }

    @Override // xsna.xfz
    public final void onPause() {
        h().c(Lifecycle.Event.ON_PAUSE);
    }

    @Override // xsna.xfz
    public final void onResume() {
        h().c(Lifecycle.Event.ON_RESUME);
    }
}
