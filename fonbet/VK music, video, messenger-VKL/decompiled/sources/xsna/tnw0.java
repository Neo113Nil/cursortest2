package xsna;

import com.vk.core.fragments.FragmentImpl;
import xsna.i3x0;

/* compiled from: VoipEffectControllerInteractorImpl.kt */
/* loaded from: classes7.dex */
public abstract class tnw0 implements snw0 {
    public final com.vk.voip.ui.c a;
    public final gzs<FragmentImpl> b;
    public final bpn0 c = new bpn0(new yei0(this, 27));
    public final bpn0 d = new bpn0(new mwm0(this, 23));
    public final bpn0 e = new bpn0(new wcs0(this, 9));
    public final bpn0 f = new bpn0(new icn0(this, 22));

    /* JADX WARN: Multi-variable type inference failed */
    public tnw0(com.vk.voip.ui.c cVar, gzs<? extends FragmentImpl> gzsVar) {
        this.a = cVar;
        this.b = gzsVar;
    }

    public final i3x0.a d() {
        return (i3x0.a) this.c.getValue();
    }

    public final i3x0.b e() {
        return (i3x0.b) this.d.getValue();
    }
}
