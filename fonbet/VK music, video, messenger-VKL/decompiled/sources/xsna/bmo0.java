package xsna;

import android.view.Window;
import android.view.WindowManager;
import com.vk.dto.stories.entities.StoryCameraMode;

/* compiled from: TextStickerDialogDelegate.kt */
/* loaded from: classes16.dex */
public final class bmo0 implements w8i {
    public final l7s b;
    public final xpa0 c;
    public final bpn0 d = new bpn0(new rrn0(this, 3));
    public final bpn0 e = new bpn0(new kcj0(this, 6));
    public iz8 f;

    public bmo0(l7s l7sVar, xpa0 xpa0Var) {
        this.b = l7sVar;
        this.c = xpa0Var;
    }

    public final zlo0 a(imo0 imo0Var, StoryCameraMode storyCameraMode, amo0 amo0Var, hhw hhwVar, CharSequence charSequence) {
        cmo0 a = ((w3l0) this.d.getValue()).a(this.b, !iah0.o(r2), amo0Var, hhwVar, this.c, ((psj0) this.e.getValue()).h(storyCameraMode), charSequence, imo0Var, true);
        iz8 iz8Var = this.f;
        if (iz8Var != null) {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            Window window = a.getWindow();
            layoutParams.copyFrom(window != null ? window.getAttributes() : null);
            Float f = iz8Var.g;
            if (f == null) {
                layoutParams.gravity = 17;
            } else {
                layoutParams.gravity = 48;
                layoutParams.y = (int) f.floatValue();
            }
            layoutParams.width = iz8Var.a;
            layoutParams.height = iz8Var.b;
            Window window2 = a.getWindow();
            if (window2 != null) {
                window2.setAttributes(layoutParams);
            }
        }
        return a;
    }
}
