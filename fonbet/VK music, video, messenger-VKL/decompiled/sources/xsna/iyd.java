package xsna;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.LruCache;
import com.vk.clips.editor.mapper.fragment.ClipsEditorFragment;
import com.vk.core.ui.measuring.UiMeasuringScreen;
import com.vk.dto.clips.model.ClipsEditorInitParams;
import com.vk.dto.clips.model.ClipsEditorInputVideoItem;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* compiled from: ClipsEditorImpl.kt */
/* loaded from: classes16.dex */
public final class iyd implements wvd {
    public final t0e a;
    public final bzd b;
    public final mzp0 c;

    public iyd(ClipsEditorInitParams clipsEditorInitParams, Context context, int i, ClipsEditorFragment.b bVar, e2e e2eVar) {
        t0e t0eVar = new t0e(new lpj(context, i), e2eVar);
        this.a = t0eVar;
        mzp0 mzp0Var = null;
        lxd lxdVar = new lxd(m7m.c(t0eVar), (String) null);
        irk0 irk0Var = (irk0) e2eVar.m.c;
        if (irk0Var != null) {
            LruCache<UUID, mzp0> lruCache = rzp0.a;
            mzp0Var = (mzp0) rzp0.b(UiMeasuringScreen.CLIPS_EDITOR, null, true, false, null, null, irk0Var).j();
            mzp0Var.b();
            mzp0Var.init();
            mzp0Var.start();
        }
        mzp0 mzp0Var2 = mzp0Var;
        this.c = mzp0Var2;
        bzd bzdVar = new bzd(clipsEditorInitParams, t0eVar, bVar, e2eVar, mzp0Var2, lxdVar);
        this.b = bzdVar;
        t0eVar.setPresenter(bzdVar);
    }

    @Override // xsna.wvd
    public final void d() {
        this.a.g5();
    }

    @Override // xsna.wvd
    public final void e(List<? extends yxd> list) {
        bzd bzdVar = this.b;
        bzdVar.getClass();
        bzdVar.w.C(new psb(new j4(7, bzdVar, list), 1)).subscribe();
    }

    @Override // xsna.wvd
    public final void f(List<ClipsEditorInputVideoItem> list) {
        bzd bzdVar = this.b;
        bzdVar.getClass();
        bzdVar.w.C(new psb(new s(7, bzdVar, list), 1)).subscribe();
    }

    @Override // xsna.wvd
    public final void g(Uri uri) {
        bzd bzdVar = this.b;
        bzdVar.getClass();
        bzdVar.w.C(new psb(new k4(3, bzdVar, uri), 1)).subscribe();
    }

    @Override // xsna.wvd
    public final t0e getView() {
        return this.a;
    }

    @Override // xsna.wvd
    public final void onActivityResult(int i, int i2, Intent intent) {
        bzd bzdVar = this.b;
        bzdVar.getClass();
        if (i2 == -1 && i == 811) {
            bzdVar.d.b(i2, intent);
        }
    }

    @Override // xsna.wvd
    public final void onDestroy() {
        bzd bzdVar = this.b;
        szd szdVar = bzdVar.p;
        io.reactivex.rxjava3.disposables.c cVar = szdVar.k;
        if (cVar != null) {
            cVar.dispose();
        }
        Set a = y000.a(szdVar.o.a.c);
        HashSet<String> hashSet = szdVar.n;
        g2f g2fVar = szdVar.e;
        LinkedHashSet E0 = j5g.E0(hashSet, a);
        if (!E0.isEmpty()) {
            new io.reactivex.rxjava3.internal.operators.single.v(new bp0(E0, 2)).q(g2fVar.c()).m(g2fVar.d()).h(new defpackage.i0(new n40(E0, 23), 12)).subscribe(new lrj(new c3v(21)), new hf0());
        }
        bzdVar.d();
        bzdVar.n.s();
        q0e q0eVar = bzdVar.h;
        q0eVar.onClosed();
        s0e s0eVar = q0eVar.l;
        if (s0eVar == null) {
            s0eVar = null;
        }
        s0eVar.g().clear();
        mzp0 mzp0Var = this.c;
        if (mzp0Var != null) {
            mzp0Var.g();
        }
    }

    @Override // xsna.wvd
    public final void onPause() {
        bzd bzdVar = this.b;
        c9d c9dVar = bzdVar.n;
        mzp0 mzp0Var = bzdVar.f;
        if (mzp0Var != null) {
            mzp0Var.g();
        }
        c9dVar.l();
        c9dVar.d(true);
        com.vk.clips.editor.voiceover.impl.a aVar = bzdVar.h.w;
        if (aVar != null) {
            boolean z = aVar.l != null;
            if (!z) {
                lyd.a.a("ClipsEditorVoiceoverDelegateImpl", new IllegalStateException("ClipsEditorVoiceoverDelegateImpl try to call voiceover delegate method but it is not initialized"));
            }
            if (z) {
                a1e a1eVar = aVar.l;
                if (a1eVar == null) {
                    a1eVar = null;
                }
                if (a1eVar.a) {
                    aVar.a();
                } else {
                    aVar.f();
                }
            }
        }
    }

    @Override // xsna.wvd
    public final void onResume() {
        bzd bzdVar = this.b;
        mzp0 mzp0Var = bzdVar.f;
        if (mzp0Var != null) {
            mzp0Var.h();
        }
        bzdVar.n.j();
    }

    @Override // xsna.wvd
    public final void onStart() {
        this.b.getClass();
    }

    @Override // xsna.wvd
    public final void onStop() {
        this.b.getClass();
    }

    @Override // xsna.wvd
    public final void prepare() {
        t0e t0eVar = this.a;
        mzp0 mzp0Var = this.c;
        if (mzp0Var != null) {
            mzp0Var.e(t0eVar);
        }
        t0eVar.h5();
    }
}
