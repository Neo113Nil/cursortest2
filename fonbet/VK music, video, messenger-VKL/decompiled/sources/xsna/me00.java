package xsna;

import com.vk.voip.ui.actions.feature.VoipActionsFeatureState;

/* compiled from: MainMenuActionsFeatureState.kt */
/* loaded from: classes7.dex */
public final class me00 implements VoipActionsFeatureState {
    public final VoipActionsFeatureState.UserType a;
    public final VoipActionsFeatureState.s b;
    public final VoipActionsFeatureState.v c;
    public final VoipActionsFeatureState.r d;
    public final VoipActionsFeatureState.e e;
    public final VoipActionsFeatureState.w f;
    public final VoipActionsFeatureState.k g;
    public final VoipActionsFeatureState.i h;
    public final VoipActionsFeatureState.b i;
    public final VoipActionsFeatureState.n j;
    public final VoipActionsFeatureState.o k;
    public final VoipActionsFeatureState.m l;
    public final VoipActionsFeatureState.l m;
    public final VoipActionsFeatureState.j n;
    public final VoipActionsFeatureState.x o;
    public final VoipActionsFeatureState.q p;
    public final VoipActionsFeatureState.t q;
    public final VoipActionsFeatureState.u r;
    public final VoipActionsFeatureState.a s;
    public final VoipActionsFeatureState.f t;
    public final VoipActionsFeatureState.d u;

    public me00(VoipActionsFeatureState.UserType userType, VoipActionsFeatureState.s sVar, VoipActionsFeatureState.v vVar, VoipActionsFeatureState.r rVar, VoipActionsFeatureState.e eVar, VoipActionsFeatureState.w wVar, VoipActionsFeatureState.k kVar, VoipActionsFeatureState.i iVar, VoipActionsFeatureState.b bVar, VoipActionsFeatureState.n nVar, VoipActionsFeatureState.o oVar, VoipActionsFeatureState.m mVar, VoipActionsFeatureState.l lVar, VoipActionsFeatureState.j jVar, VoipActionsFeatureState.x xVar, VoipActionsFeatureState.q qVar, VoipActionsFeatureState.t tVar, VoipActionsFeatureState.u uVar, VoipActionsFeatureState.a aVar, VoipActionsFeatureState.f fVar, VoipActionsFeatureState.d dVar) {
        this.a = userType;
        this.b = sVar;
        this.c = vVar;
        this.d = rVar;
        this.e = eVar;
        this.f = wVar;
        this.g = kVar;
        this.h = iVar;
        this.i = bVar;
        this.j = nVar;
        this.k = oVar;
        this.l = mVar;
        this.m = lVar;
        this.n = jVar;
        this.o = xVar;
        this.p = qVar;
        this.q = tVar;
        this.r = uVar;
        this.s = aVar;
        this.t = fVar;
        this.u = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof me00)) {
            return false;
        }
        me00 me00Var = (me00) obj;
        return this.a == me00Var.a && epx.f(this.b, me00Var.b) && epx.f(this.c, me00Var.c) && epx.f(this.d, me00Var.d) && epx.f(this.e, me00Var.e) && epx.f(this.f, me00Var.f) && epx.f(this.g, me00Var.g) && epx.f(this.h, me00Var.h) && epx.f(this.i, me00Var.i) && epx.f(this.j, me00Var.j) && epx.f(this.k, me00Var.k) && epx.f(this.l, me00Var.l) && epx.f(this.m, me00Var.m) && epx.f(this.n, me00Var.n) && epx.f(this.o, me00Var.o) && epx.f(this.p, me00Var.p) && epx.f(this.q, me00Var.q) && epx.f(this.r, me00Var.r) && epx.f(this.s, me00Var.s) && epx.f(this.t, me00Var.t) && epx.f(this.u, me00Var.u);
    }

    public final int hashCode() {
        return this.u.hashCode() + qoy.b((this.s.hashCode() + qoy.b((this.q.hashCode() + qoy.b((this.o.hashCode() + ((this.n.a.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + qoy.b((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.e.a)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.p.a)) * 31, 31, this.r.a)) * 31, 31, this.t.a);
    }

    public final String toString() {
        return "MainMenuActionsFeatureState(userType=" + this.a + ", screenCaptureStatus=" + this.b + ", streamStatus=" + this.c + ", recordStatus=" + this.d + ", callEffectsPlaceholder=" + this.e + ", virtualBackground=" + this.f + ", mask=" + this.g + ", holidayInteraction=" + this.h + ", asrRecord=" + this.i + ", mediaSettingMicrophone=" + this.j + ", mediaSettingVideo=" + this.k + ", mediaSettingAudio=" + this.l + ", mediaRequestAttention=" + this.m + ", logsSending=" + this.n + ", vmojiStatus=" + this.o + ", participantPermissions=" + this.p + ", sessionRooms=" + this.q + ", shareLink=" + this.r + ", asrOnline=" + this.s + ", debugMenu=" + this.t + ", callDump=" + this.u + ')';
    }
}
