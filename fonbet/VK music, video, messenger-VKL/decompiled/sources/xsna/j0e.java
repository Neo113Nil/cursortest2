package xsna;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.kuc;
import xsna.luc;
import xsna.wzd;
import xsna.x8d;

/* compiled from: ClipsEditorSwapDelegateImpl.kt */
/* loaded from: classes16.dex */
public final class j0e implements i0e, x8d.b {
    public final x8d a;
    public final xvd b;
    public final rzd c;
    public k0e d;
    public final a e = new a();

    /* compiled from: ClipsEditorSwapDelegateImpl.kt */
    public final class a implements z6d {
        public boolean a;

        public a() {
        }

        @Override // xsna.z6d
        public final void a(int i) {
            this.a = true;
            j0e j0eVar = j0e.this;
            x8d x8dVar = j0eVar.a;
            x8dVar.d(true);
            Long h = j0eVar.c.getState().h(i);
            if (h != null) {
                x8dVar.seekTo(h.longValue());
            }
            k0e k0eVar = j0eVar.d;
            if (k0eVar == null) {
                k0eVar = null;
            }
            k0eVar.c(false);
        }

        @Override // xsna.z6d
        public final boolean b() {
            return this.a;
        }

        @Override // xsna.z6d
        public final void c(int i, int i2) {
            j0e.this.b.h(i, i2);
        }

        @Override // xsna.z6d
        public final void d() {
            this.a = false;
            k0e k0eVar = j0e.this.d;
            if (k0eVar == null) {
                k0eVar = null;
            }
            k0eVar.c(true);
        }
    }

    public j0e(c9d c9dVar, bwd bwdVar, rzd rzdVar) {
        this.a = c9dVar;
        this.b = bwdVar;
        this.c = rzdVar;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.x8d.b
    public final void a(int i) {
        k0e k0eVar = this.d;
        if (k0eVar == null) {
            k0eVar = null;
        }
        ((gvc) k0eVar.l.getValue()).b(f());
    }

    @Override // xsna.i0e
    public final a c() {
        return this.e;
    }

    @Override // xsna.i0e
    public final void d(k0e k0eVar) {
        this.d = k0eVar;
    }

    @Override // xsna.i0e
    public final ArrayList f() {
        ArrayList f = this.c.getState().f();
        ArrayList arrayList = new ArrayList(c5g.u(f, 10));
        Iterator it = f.iterator();
        while (it.hasNext()) {
            fzd fzdVar = (fzd) it.next();
            arrayList.add(new zcd(fzdVar.a, fzdVar.b));
        }
        return arrayList;
    }

    @Override // xsna.i0e
    public final void g(int i) {
        Long h = this.c.getState().h(i);
        if (h != null) {
            this.a.seekTo(h.longValue());
        }
    }

    @Override // xsna.i0e
    public final void k() {
        rzd rzdVar = this.c;
        rzdVar.c(rzdVar.getState(), e43.l(new wzd.a(true, (luc) luc.f.a), new wzd.c(0)));
        k0e k0eVar = this.d;
        if (k0eVar == null) {
            k0eVar = null;
        }
        k0eVar.a();
    }

    @Override // xsna.i0e
    public final void m() {
        x8d x8dVar = this.a;
        x8dVar.i(this);
        x8dVar.p();
    }

    @Override // xsna.i0e
    public final void onCancel() {
        ArrayList arrayList;
        List<com.vk.clips.editor.state.model.c> list;
        rzd rzdVar = this.c;
        com.vk.clips.editor.state.model.a b = rzdVar.b();
        if (b == null || (list = b.c) == null) {
            arrayList = null;
        } else {
            List<com.vk.clips.editor.state.model.c> list2 = list;
            arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((com.vk.clips.editor.state.model.c) it.next()).j);
            }
        }
        List<com.vk.clips.editor.state.model.c> list3 = rzdVar.getState().c;
        ArrayList arrayList2 = new ArrayList(c5g.u(list3, 10));
        Iterator<T> it2 = list3.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((com.vk.clips.editor.state.model.c) it2.next()).j);
        }
        if (epx.f(arrayList, arrayList2)) {
            k0e k0eVar = this.d;
            (k0eVar != null ? k0eVar : null).a();
            return;
        }
        k0e k0eVar2 = this.d;
        k0e k0eVar3 = k0eVar2 != null ? k0eVar2 : null;
        hg hgVar = new hg(this, 20);
        k0eVar3.getClass();
        k0eVar3.e.c(new kuc.b(new bb(hgVar, 17), new kr6(4)));
    }

    @Override // xsna.i0e
    public final void onClosed() {
        x8d x8dVar = this.a;
        x8dVar.f(this);
        x8dVar.o();
    }
}
