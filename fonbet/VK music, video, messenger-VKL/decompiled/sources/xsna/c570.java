package xsna;

import ru.ok.android.webrtc.stat.call.methods.call_stat.OutgoingAudioStatistics;

/* compiled from: LayoutModifierNode.kt */
/* loaded from: classes11.dex */
public final class c570 implements zo10 {
    public final zox b;
    public final e570 c;
    public final f570 d;

    public c570(zox zoxVar, e570 e570Var, f570 f570Var) {
        this.b = zoxVar;
        this.c = e570Var;
        this.d = f570Var;
    }

    @Override // xsna.zox
    public final int M(int i) {
        return this.b.M(i);
    }

    @Override // xsna.zo10
    public final tra0 N(long j) {
        f570 f570Var = this.d;
        f570 f570Var2 = f570.Width;
        int i = OutgoingAudioStatistics.AUDIO_LEVEL_MULTIPLIER_FOR_BACKEND;
        e570 e570Var = this.c;
        zox zoxVar = this.b;
        if (f570Var == f570Var2) {
            int l0 = e570Var == e570.Max ? zoxVar.l0(o6j.h(j)) : zoxVar.M(o6j.h(j));
            if (o6j.d(j)) {
                i = o6j.h(j);
            }
            return new d570(l0, i);
        }
        int Z = e570Var == e570.Max ? zoxVar.Z(o6j.i(j)) : zoxVar.j0(o6j.i(j));
        if (o6j.e(j)) {
            i = o6j.i(j);
        }
        return new d570(i, Z);
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
