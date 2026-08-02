package xsna;

import xsna.ycw0;

/* compiled from: VoipMainMenuActionsViewModel.kt */
/* loaded from: classes7.dex */
public final class orw0 implements ycw0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final ycw0.d d;
    public final ycw0.r e;
    public final ycw0.u f;
    public final ycw0.l g;
    public final ycw0.n h;
    public final ycw0.m i;
    public final ycw0.j j;
    public final ycw0.b k;
    public final ycw0.k l;
    public final ycw0.g m;
    public final ycw0.v n;
    public final ycw0.f o;
    public final ycw0.s p;
    public final ycw0.t q;
    public final ycw0.a r;
    public final ycw0.e s;

    public orw0(boolean z, boolean z2, boolean z3, ycw0.d dVar, ycw0.r rVar, ycw0.u uVar, ycw0.l lVar, ycw0.n nVar, ycw0.m mVar, ycw0.j jVar, ycw0.b bVar, ycw0.k kVar, ycw0.g gVar, ycw0.v vVar, ycw0.f fVar, ycw0.s sVar, ycw0.t tVar, ycw0.a aVar, ycw0.e eVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = dVar;
        this.e = rVar;
        this.f = uVar;
        this.g = lVar;
        this.h = nVar;
        this.i = mVar;
        this.j = jVar;
        this.k = bVar;
        this.l = kVar;
        this.m = gVar;
        this.n = vVar;
        this.o = fVar;
        this.p = sVar;
        this.q = tVar;
        this.r = aVar;
        this.s = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof orw0)) {
            return false;
        }
        orw0 orw0Var = (orw0) obj;
        return this.a == orw0Var.a && this.b == orw0Var.b && this.c == orw0Var.c && epx.f(this.d, orw0Var.d) && epx.f(this.e, orw0Var.e) && epx.f(this.f, orw0Var.f) && epx.f(this.g, orw0Var.g) && epx.f(this.h, orw0Var.h) && epx.f(this.i, orw0Var.i) && epx.f(this.j, orw0Var.j) && epx.f(this.k, orw0Var.k) && epx.f(this.l, orw0Var.l) && epx.f(this.m, orw0Var.m) && epx.f(this.n, orw0Var.n) && epx.f(this.o, orw0Var.o) && epx.f(this.p, orw0Var.p) && epx.f(this.q, orw0Var.q) && epx.f(this.r, orw0Var.r) && epx.f(this.s, orw0Var.s);
    }

    public final int hashCode() {
        return this.s.hashCode() + ((this.r.hashCode() + qoy.b((this.p.hashCode() + qoy.b((this.n.hashCode() + qoy.b((this.l.a.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.m.a)) * 31, 31, this.o.a)) * 31, 31, this.q.a)) * 31);
    }

    public final String toString() {
        return "VoipMainMenuActionsViewModel(screencastStarted=" + this.a + ", canScreencast=" + this.b + ", canManageParticipantPermissions=" + this.c + ", broadcastStatus=" + this.d + ", recordStatus=" + this.e + ", virtualBackground=" + this.f + ", mask=" + this.g + ", mediaSettingAudio=" + this.h + ", mediaRequestAttention=" + this.i + ", holidayInteraction=" + this.j + ", asrRecordStatus=" + this.k + ", logsSending=" + this.l + ", debugMenu=" + this.m + ", vmojiStatus=" + this.n + ", callEffectsPlaceholder=" + this.o + ", sessionRooms=" + this.p + ", shareLink=" + this.q + ", asrOnline=" + this.r + ", callDump=" + this.s + ')';
    }
}
