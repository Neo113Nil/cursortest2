package xsna;

import com.vk.popupmanager.api.PopupPriority;
import java.util.Iterator;

/* compiled from: PopupManagerImpl.kt */
/* loaded from: classes.dex */
public final class zwb0 implements ywb0 {
    public final sk3<dwb0> a;
    public dwb0 b;
    public final dwb0 c;

    public zwb0() {
        sk3<dwb0> sk3Var = new sk3<>();
        this.a = sk3Var;
        this.b = sk3Var.d();
        this.c = (dwb0) new sk3().d();
    }

    @Override // xsna.ywb0
    public final void a(dwb0 dwb0Var, PopupPriority popupPriority) {
        sk3<dwb0> sk3Var = this.a;
        if (sk3Var == null || !sk3Var.isEmpty()) {
            Iterator<dwb0> it = sk3Var.iterator();
            while (it.hasNext()) {
                if (epx.f(it.next(), dwb0Var)) {
                    return;
                }
            }
        }
        if (popupPriority == PopupPriority.HIGH) {
            sk3Var.addFirst(dwb0Var);
        } else {
            sk3Var.addLast(dwb0Var);
        }
        c();
    }

    @Override // xsna.ywb0
    public final void b(dwb0 dwb0Var) {
        this.a.remove(dwb0Var);
        c();
    }

    public final void c() {
        dwb0 dwb0Var = this.b;
        sk3<dwb0> sk3Var = this.a;
        if (epx.f(dwb0Var, sk3Var.d())) {
            return;
        }
        dwb0 dwb0Var2 = this.b;
        if (dwb0Var2 != null) {
            dwb0Var2.e();
        }
        dwb0 d = sk3Var.d();
        this.b = d;
        if (d != null) {
            d.n();
        }
    }
}
