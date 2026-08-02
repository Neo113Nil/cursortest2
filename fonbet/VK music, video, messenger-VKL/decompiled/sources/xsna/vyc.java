package xsna;

import com.vk.clips.tool.view.viewer.feed.list.clip.ClipFeedSideControlsView;

/* compiled from: ClipFeedSideControlsUseCases.kt */
/* loaded from: classes17.dex */
public final class vyc implements ykj0 {
    public final mxl0 a;
    public final k0p0 b;
    public final zdk c;
    public final m9j0 d;
    public final btu e;
    public final rr80 f;

    public vyc(i4f i4fVar, rwc rwcVar, ClipFeedSideControlsView.c cVar, com.vk.movika.sdk.base.logic.processor.h hVar) {
        y8e y8eVar = i4fVar.a;
        i7e i7eVar = new i7e(y8eVar);
        q1t q1tVar = i4fVar.c;
        g6o0 g6o0Var = i4fVar.b;
        this.a = new mxl0(i7eVar, q1tVar, g6o0Var, rwcVar, hVar);
        this.b = new k0p0(new i7e(y8eVar), q1tVar, g6o0Var, rwcVar, cVar, hVar);
        this.c = new zdk(q1tVar, g6o0Var, rwcVar, hVar);
        this.d = new m9j0(new k7e(y8eVar), q1tVar, g6o0Var, rwcVar, hVar);
        this.e = new btu(new c7e(y8eVar), q1tVar, g6o0Var, rwcVar, hVar);
        this.f = new rr80(q1tVar, g6o0Var, rwcVar, hVar);
    }

    @Override // xsna.ykj0
    public final k0p0 a() {
        return this.b;
    }

    @Override // xsna.ykj0
    public final m9j0 b() {
        return this.d;
    }

    @Override // xsna.ykj0
    public final btu c() {
        return this.e;
    }

    @Override // xsna.ykj0
    public final zdk d() {
        return this.c;
    }

    @Override // xsna.ykj0
    public final mxl0 e() {
        return this.a;
    }

    @Override // xsna.ykj0
    public final rr80 f() {
        return this.f;
    }
}
