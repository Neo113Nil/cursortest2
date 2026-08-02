package xsna;

import com.vk.music.haptic.MusicHapticEvent;
import xsna.qy40;

/* compiled from: RadioActionHandler.kt */
/* loaded from: classes3.dex */
public final class jte0 implements izs<Boolean, s3q0> {
    public final /* synthetic */ kte0 b;
    public final /* synthetic */ sy40 c;

    public jte0(kte0 kte0Var, sy40 sy40Var) {
        this.b = kte0Var;
        this.c = sy40Var;
    }

    @Override // xsna.izs
    public final s3q0 invoke(Boolean bool) {
        qy40 qy40Var;
        kte0 kte0Var = this.b;
        f4z f4zVar = kte0Var.d;
        if (bool.booleanValue()) {
            f4zVar.b(MusicHapticEvent.SUCCESS);
            qy40Var = this.c.e.a ? qy40.a.i.b : qy40.a.j.b;
        } else {
            f4zVar.b(MusicHapticEvent.ERROR);
            qy40Var = qy40.a.b.b;
        }
        kte0Var.c.b(qy40Var);
        return s3q0.a;
    }
}
