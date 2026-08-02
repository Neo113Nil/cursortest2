package defpackage;

import com.yandex.quark.capability.CapabilityListener;

/* loaded from: classes8.dex */
public final class fvc0 implements CapabilityListener {
    public final /* synthetic */ gvc0 a;
    public final /* synthetic */ String b;

    public fvc0(gvc0 gvc0Var, String str) {
        this.a = gvc0Var;
        this.b = str;
    }

    @Override // com.yandex.quark.capability.CapabilityListener
    public final void onEvent(png pngVar) {
        Object obj;
        gvc0 gvc0Var = this.a;
        String str = this.b;
        if (gvc0Var.w) {
            syj0 b = gvc0Var.b.x.b(new rkc(str, pngVar));
            jyj0 jyj0Var = b instanceof jyj0 ? (jyj0) b : null;
            if (jyj0Var == null || (obj = jyj0Var.a) == null) {
                return;
            }
            gvc0Var.a("Failed to send event for capability ".concat(z28.a(str)), (plc) obj);
        }
    }

    @Override // com.yandex.quark.capability.CapabilityListener
    public final void onStateChanged(png pngVar) {
        Object obj;
        gvc0 gvc0Var = this.a;
        String str = this.b;
        if (gvc0Var.w) {
            syj0 b = gvc0Var.b.x.b(new vkc(str, pngVar));
            jyj0 jyj0Var = b instanceof jyj0 ? (jyj0) b : null;
            if (jyj0Var == null || (obj = jyj0Var.a) == null) {
                return;
            }
            gvc0Var.a("Failed to send new state for capability ".concat(z28.a(str)), (plc) obj);
        }
    }
}
