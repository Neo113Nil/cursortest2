package xsna;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import com.vk.dto.common.id.UserId;

/* compiled from: ContentProductsDialog.kt */
/* loaded from: classes18.dex */
public final class vjj implements fcn {
    public final Activity b;
    public dw20 c;
    public final bpn0 d = new bpn0(new n5i(this, 2));

    /* compiled from: ContentProductsDialog.kt */
    public static final class a implements dz20 {
        public a() {
        }

        @Override // xsna.dz20
        public final void Ff(String str) {
            ww50<?> Y;
            vjj vjjVar = vjj.this;
            ComponentCallbacks2 componentCallbacks2 = vjjVar.b;
            ey50 ey50Var = componentCallbacks2 instanceof ey50 ? (ey50) componentCallbacks2 : null;
            if (ey50Var == null || (Y = ey50Var.Y()) == null) {
                return;
            }
            Y.S(vjjVar);
        }

        @Override // xsna.dz20
        public final void Qc(String str) {
            ww50<?> Y;
            vjj vjjVar = vjj.this;
            ComponentCallbacks2 componentCallbacks2 = vjjVar.b;
            ey50 ey50Var = componentCallbacks2 instanceof ey50 ? (ey50) componentCallbacks2 : null;
            if (ey50Var == null || (Y = ey50Var.Y()) == null) {
                return;
            }
            Y.H(vjjVar);
        }
    }

    public vjj(Activity activity, UserId userId, long j) {
        this.b = activity;
    }

    @Override // xsna.fcn
    public final boolean M4() {
        return true;
    }

    @Override // xsna.fcn
    public final boolean N8() {
        return false;
    }

    @Override // xsna.fcn
    public final void b(boolean z) {
        dw20 dw20Var = this.c;
        if (dw20Var != null) {
            dw20Var.dismiss();
        }
    }

    @Override // xsna.fcn
    public final void dismiss() {
        b(false);
    }

    @Override // xsna.fcn
    public final boolean v6() {
        return false;
    }
}
