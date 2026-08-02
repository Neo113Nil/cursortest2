package xsna;

import com.vk.voip.ui.accessibility.AccessibilityEvents;
import com.vk.voip.ui.c;

/* compiled from: VoipViewModelBroadcastDelegate.kt */
/* loaded from: classes7.dex */
public final class r4x0 extends xj8 {
    public final com.vk.voip.ui.c e;
    public final AccessibilityEvents f;
    public final c.d g;

    public r4x0(com.vk.voip.ui.c cVar, AccessibilityEvents accessibilityEvents, c.d dVar) {
        super(com.vk.voip.ui.c.r, cVar.P(), (apv) com.vk.voip.ui.c.w0.getValue());
        this.e = cVar;
        this.f = accessibilityEvents;
        this.g = dVar;
    }

    @Override // xsna.xj8
    public final vay0 b() {
        this.e.getClass();
        return new vay0(com.vk.voip.ui.c.j0());
    }

    @Override // xsna.xj8
    public final boolean e() {
        if (!i()) {
            return false;
        }
        this.e.getClass();
        com.vk.voip.ui.c.s0.d.getClass();
        mqw0 mqw0Var = mqw0.a;
        return Boolean.TRUE.booleanValue();
    }

    @Override // xsna.xj8
    public final io.reactivex.rxjava3.core.q k(gzs gzsVar) {
        return this.g.a(true, gzsVar);
    }
}
