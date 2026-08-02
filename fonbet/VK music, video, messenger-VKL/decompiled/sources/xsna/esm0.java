package xsna;

import com.vk.clips.viewer.impl.grid.lists.ClipsGridTabData;
import com.vk.dto.shortvideo.ClipGridParams;
import kotlin.collections.EmptyList;
import xsna.wfu;

/* compiled from: StubLoadPresenter.kt */
/* loaded from: classes17.dex */
public final class esm0 implements ufu {
    public final au2 a;

    public esm0(au2 au2Var) {
        this.a = au2Var;
    }

    @Override // xsna.ufu
    public final sde a(ClipsGridTabData clipsGridTabData) {
        com.vk.metrics.eventtracking.b.a.a(new IllegalStateException("Stub clips delegate returned from " + qjg.a(this) + " for tab type = " + clipsGridTabData));
        ane aneVar = new ane();
        rdi.F(aneVar);
        return aneVar;
    }

    @Override // xsna.ufu
    public final void e(wfu wfuVar, wfu.a aVar) {
        wfuVar.a(aVar, EmptyList.b);
    }

    @Override // xsna.ufu
    public final wfu f() {
        return this.a;
    }

    @Override // xsna.ufu
    public final wfu g(wfu wfuVar, wfu.a aVar) {
        return null;
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

    @Override // xsna.ufu
    public final void d(ClipGridParams clipGridParams) {
    }
}
