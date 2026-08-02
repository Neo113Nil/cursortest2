package xsna;

import android.graphics.PointF;
import android.widget.FrameLayout;
import com.vk.clips.design.view.editor.TransformOverlayView;
import com.vk.clips.editor.base.api.ClipsEditorScreen;
import com.vk.dto.clips.VideoTransform;
import java.util.ArrayList;
import xsna.swd;
import xsna.vik;
import xsna.wzd;
import xsna.x8d;

/* compiled from: ClipsEditorFullscreenPreviewDelegateImpl.kt */
/* loaded from: classes16.dex */
public final class eyd implements dyd, x8d.a {
    public final x8d a;
    public final nal0 b;
    public final rzd c;
    public final xvd d;
    public final e2e e;
    public hyd f;
    public final bpn0 g = new bpn0(new kd(this, 20));
    public final bpn0 h = new bpn0(new ld(this, 22));
    public final bpn0 i = new bpn0(new h6(this, 19));
    public final bpn0 j = new bpn0(new we0(this, 19));

    /* compiled from: ClipsEditorFullscreenPreviewDelegateImpl.kt */
    public final class b implements vik.a {
        public b() {
        }

        /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.vik.a
        public final void a(int i, int i2, boolean z) {
            eyd eydVar = eyd.this;
            PointF[] l = ((o0e) eydVar.g.getValue()).l();
            ArrayList arrayList = new ArrayList(l.length);
            for (PointF pointF : l) {
                arrayList.add(e43.l(Float.valueOf(pointF.x), Float.valueOf(pointF.y)));
            }
            float[] L0 = j5g.L0(c5g.v(arrayList));
            hyd hydVar = eydVar.f;
            if (hydVar == null) {
                hydVar = null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(i - 100);
            sb.append('%');
            ((TransformOverlayView) hydVar.j.getValue()).a(L0, sb.toString(), vu5.b(new StringBuilder(), -i2, (char) 176), z, !(((FrameLayout) hydVar.q.getValue()).getVisibility() == 0));
        }

        @Override // xsna.vik.a
        public final void b() {
            eyd eydVar = eyd.this;
            x8d x8dVar = eydVar.a;
            x8dVar.d(false);
            x8dVar.o();
            hyd hydVar = eydVar.f;
            if (hydVar == null) {
                hydVar = null;
            }
            hydVar.k(true);
            hyd hydVar2 = eydVar.f;
            (hydVar2 != null ? hydVar2 : null).j(true);
        }

        @Override // xsna.vik.a
        public final void c(VideoTransform videoTransform) {
            eyd eydVar = eyd.this;
            eydVar.d.b(videoTransform);
            hyd hydVar = eydVar.f;
            if (hydVar == null) {
                hydVar = null;
            }
            hydVar.k(false);
            eydVar.a.p();
            hyd hydVar2 = eydVar.f;
            (hydVar2 != null ? hydVar2 : null).j(false);
        }
    }

    public eyd(c9d c9dVar, nal0 nal0Var, rzd rzdVar, bwd bwdVar, e2e e2eVar) {
        this.a = c9dVar;
        this.b = nal0Var;
        this.c = rzdVar;
        this.d = bwdVar;
        this.e = e2eVar;
    }

    @Override // xsna.dyd
    public final void a() {
        x8d x8dVar = this.a;
        x8dVar.k(this);
        ((dzd) this.j.getValue()).a();
        c(x8dVar.n());
    }

    @Override // xsna.dyd
    public final void b(nov novVar) {
        ((swd) this.i.getValue()).j(novVar);
    }

    @Override // xsna.x8d.a
    public final void c(long j) {
        hyd hydVar = this.f;
        if (hydVar == null) {
            hydVar = null;
        }
        float e = j / this.c.getState().e();
        if (hydVar.s) {
            return;
        }
        hydVar.g().a(e, false);
    }

    @Override // xsna.dyd
    public final vik d() {
        return (vik) this.h.getValue();
    }

    @Override // xsna.dyd
    public final void e(nov novVar) {
        ((swd) this.i.getValue()).e(novVar);
        d().e = true;
    }

    @Override // xsna.dyd
    public final void f(nov novVar) {
        rj01 rj01Var = this.e.b;
        vzd.b(this.c, novVar, e43.l(new wzd.a(true, novVar instanceof xlo0 ? dvc.a : zuc.a), new wzd.b(null)));
        ((swd) this.i.getValue()).k(true);
    }

    @Override // xsna.dyd
    public final void g(nov novVar) {
        ((swd) this.i.getValue()).g(novVar);
        d().e = false;
    }

    @Override // xsna.dyd
    public final void l(float f) {
        long e = this.c.getState().e();
        this.a.seekTo(Math.min((long) (e * f), e));
    }

    @Override // xsna.dyd
    public final swd m() {
        return (swd) this.i.getValue();
    }

    @Override // xsna.dyd
    public final void n() {
        x8d x8dVar = this.a;
        x8dVar.b(true);
        x8dVar.d(true);
    }

    @Override // xsna.dyd
    public final void o() {
        ((dzd) this.j.getValue()).o();
    }

    @Override // xsna.dyd
    public final void onClose() {
        this.a.h(this);
        ((dzd) this.j.getValue()).onClose();
    }

    @Override // xsna.dyd
    public final void p() {
        this.a.b(false);
    }

    @Override // xsna.dyd
    public final void q(hyd hydVar) {
        this.f = hydVar;
    }

    /* compiled from: ClipsEditorFullscreenPreviewDelegateImpl.kt */
    public final class a implements swd.a {
        public a() {
        }

        @Override // xsna.swd.a
        public final void b(ClipsEditorScreen.State state, ClipsEditorScreen.a.b bVar) {
            bVar.a.putBoolean("from_fullscreen", true);
            hyd hydVar = eyd.this.f;
            if (hydVar == null) {
                hydVar = null;
            }
            hydVar.e.b(state, bVar);
        }

        @Override // xsna.swd.a
        public final void a(nov novVar) {
        }

        @Override // xsna.swd.a
        public final void c(com.vk.clips.editor.state.model.b bVar) {
        }
    }
}
