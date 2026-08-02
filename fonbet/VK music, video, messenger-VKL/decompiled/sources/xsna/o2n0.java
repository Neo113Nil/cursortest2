package xsna;

import com.vk.im.engine.reporters.performance.events.VkmSuccessRateEventBuilder;

/* compiled from: SuccessRateReportersImpl.kt */
/* loaded from: classes11.dex */
public final class o2n0 implements n2n0 {
    public final bpn0 b = new bpn0(new c24(16));
    public final bpn0 c = new bpn0(new pb8(7));
    public final bpn0 d = new bpn0(new qb8(9));
    public final bpn0 e = new bpn0(new k03(13));
    public final bpn0 f = new bpn0(new vv8(7));
    public final bpn0 g = new bpn0(new wv8(9));
    public final bpn0 h = new bpn0(new l03(11));
    public final bpn0 i = new bpn0(new l67(11));
    public final bpn0 j = new bpn0(new jbw(11));
    public final bpn0 k = new bpn0(new mb8(10));
    public final bpn0 l = new bpn0(new nb8(17));
    public final bpn0 m = new bpn0(new p5m(9));
    public final bpn0 n = new bpn0(new b55(8));

    public o2n0(cau0 cau0Var) {
    }

    @Override // xsna.n2n0
    public final s2n0 B() {
        return (s2n0) this.f.getValue();
    }

    @Override // xsna.n2n0
    public final v2n0 C() {
        return (v2n0) this.i.getValue();
    }

    @Override // xsna.n2n0
    public final i2n0 a() {
        return new j2n0(VkmSuccessRateEventBuilder.EventName.DIALOGS_LIST_OPEN);
    }

    @Override // xsna.n2n0
    public final s2n0 b() {
        return (s2n0) this.d.getValue();
    }

    @Override // xsna.n2n0
    public final k2n0 c() {
        return (k2n0) this.l.getValue();
    }

    @Override // xsna.n2n0
    public final v2n0 h() {
        return (v2n0) this.h.getValue();
    }

    @Override // xsna.n2n0
    public final i2n0 i() {
        return new j2n0(VkmSuccessRateEventBuilder.EventName.CHANNEL_OPEN);
    }

    @Override // xsna.n2n0
    public final s2n0 j() {
        return (s2n0) this.e.getValue();
    }

    @Override // xsna.n2n0
    public final k2n0 k() {
        return (k2n0) this.k.getValue();
    }

    @Override // xsna.n2n0
    public final f2n0<String> l() {
        return (f2n0) this.n.getValue();
    }

    @Override // xsna.n2n0
    public final s2n0 o() {
        return new t2n0(VkmSuccessRateEventBuilder.EventName.VIDEO_MSG_PLAY);
    }

    @Override // xsna.n2n0
    public final i2n0 p() {
        return new j2n0(VkmSuccessRateEventBuilder.EventName.CHAT_OPEN);
    }

    @Override // xsna.n2n0
    public final v2n0 q() {
        return (v2n0) this.j.getValue();
    }

    @Override // xsna.n2n0
    public final s2n0 r() {
        return new t2n0(VkmSuccessRateEventBuilder.EventName.AUDIO_MSG_PLAY);
    }

    @Override // xsna.n2n0
    public final s2n0 s() {
        return (s2n0) this.b.getValue();
    }

    @Override // xsna.n2n0
    public final p2n0 u() {
        return (p2n0) this.m.getValue();
    }

    @Override // xsna.n2n0
    public final s2n0 v() {
        return (s2n0) this.c.getValue();
    }

    @Override // xsna.n2n0
    public final i2n0 y() {
        return new j2n0(VkmSuccessRateEventBuilder.EventName.CHANNELS_LIST_OPEN);
    }

    @Override // xsna.n2n0
    public final v2n0 z() {
        return (v2n0) this.g.getValue();
    }
}
