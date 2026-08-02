package xsna;

import com.vk.reefton.Reef;
import com.vk.reefton.ReefEvent;
import xsna.uuv0;

/* compiled from: PlayerAnalyticsWrapper.kt */
/* loaded from: classes3.dex */
public final class qza0 implements uuv0.a {
    public final /* synthetic */ nza0 a;

    public qza0(nza0 nza0Var) {
        this.a = nza0Var;
    }

    @Override // xsna.uuv0.a
    public final void b(int i) {
        Reef reef;
        nza0 nza0Var = this.a;
        en80 en80Var = nza0Var.e;
        if (en80Var != null) {
            en80Var.b(i);
        }
        if (nza0Var.f == null || (reef = nza0Var.c) == null) {
            return;
        }
        reef.a(new ReefEvent.f(i));
    }

    @Override // xsna.uuv0.a
    public final void a(long j) {
    }
}
