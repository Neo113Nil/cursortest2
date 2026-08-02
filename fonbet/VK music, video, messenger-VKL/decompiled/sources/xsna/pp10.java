package xsna;

import ru.ok.android.webrtc.stat.call.methods.call_stat.OutgoingAudioStatistics;

/* compiled from: LayoutModifier.kt */
/* loaded from: classes11.dex */
public final class pp10 implements zo10 {
    public final zox b;
    public final rp10 c;
    public final sp10 d;

    public pp10(zox zoxVar, rp10 rp10Var, sp10 sp10Var) {
        this.b = zoxVar;
        this.c = rp10Var;
        this.d = sp10Var;
    }

    @Override // xsna.zox
    public final int M(int i) {
        return this.b.M(i);
    }

    @Override // xsna.zo10
    public final tra0 N(long j) {
        sp10 sp10Var = this.d;
        sp10 sp10Var2 = sp10.Width;
        int i = OutgoingAudioStatistics.AUDIO_LEVEL_MULTIPLIER_FOR_BACKEND;
        rp10 rp10Var = this.c;
        zox zoxVar = this.b;
        if (sp10Var == sp10Var2) {
            int l0 = rp10Var == rp10.Max ? zoxVar.l0(o6j.h(j)) : zoxVar.M(o6j.h(j));
            if (o6j.d(j)) {
                i = o6j.h(j);
            }
            return new qp10(l0, i);
        }
        int Z = rp10Var == rp10.Max ? zoxVar.Z(o6j.i(j)) : zoxVar.j0(o6j.i(j));
        if (o6j.e(j)) {
            i = o6j.i(j);
        }
        return new qp10(i, Z);
    }

    @Override // xsna.zox
    public final int Z(int i) {
        return this.b.Z(i);
    }

    @Override // xsna.zox
    public final Object c() {
        return this.b.c();
    }

    @Override // xsna.zox
    public final int j0(int i) {
        return this.b.j0(i);
    }

    @Override // xsna.zox
    public final int l0(int i) {
        return this.b.l0(i);
    }
}
