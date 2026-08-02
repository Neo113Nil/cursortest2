package xsna;

import com.vk.music.haptic.MusicHapticEvent;
import xsna.qy40;

/* compiled from: RadioActionHandler.kt */
/* loaded from: classes3.dex */
public final class ite0 implements izs<Throwable, s3q0> {
    public final /* synthetic */ kte0 b;

    public ite0(kte0 kte0Var) {
        this.b = kte0Var;
    }

    @Override // xsna.izs
    public final s3q0 invoke(Throwable th) {
        kte0 kte0Var = this.b;
        kte0Var.d.b(MusicHapticEvent.ERROR);
        kte0Var.c.b(qy40.a.f.b);
        return s3q0.a;
    }
}
