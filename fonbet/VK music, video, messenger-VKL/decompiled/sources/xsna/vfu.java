package xsna;

import com.vk.clips.viewer.impl.grid.lists.ClipsGridTabData;
import com.vk.dto.shortvideo.ClipGridParams;
import kotlin.LazyThreadSafetyMode;
import xsna.wfu;

/* compiled from: GridLoadPresenterSwitcher.kt */
/* loaded from: classes17.dex */
public final class vfu implements ufu {
    public final esm0 a;
    public final n1d b;
    public final Object c = msy.a(LazyThreadSafetyMode.NONE, new ocg(this, 26));

    public vfu(esm0 esm0Var, n1d n1dVar) {
        this.a = esm0Var;
        this.b = n1dVar;
    }

    @Override // xsna.ufu
    public final sde a(ClipsGridTabData clipsGridTabData) {
        return h().a(clipsGridTabData);
    }

    @Override // xsna.ufu
    public final void d(ClipGridParams clipGridParams) {
        h().d(clipGridParams);
    }

    @Override // xsna.ufu
    public final void e(wfu wfuVar, wfu.a aVar) {
        h().e(wfuVar, aVar);
    }

    @Override // xsna.ufu
    public final wfu f() {
        return h().f();
    }

    @Override // xsna.ufu
    public final wfu g(wfu wfuVar, wfu.a aVar) {
        return h().g(wfuVar, aVar);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    public final ufu h() {
        return o25.a().b() ? (ufu) this.c.getValue() : this.a;
    }

    @Override // xsna.ufu
    public final void G0() {
    }

    @Override // xsna.ufu
    public final void c() {
    }

    @Override // xsna.ufu
    public final void b(boolean z) {
    }
}
