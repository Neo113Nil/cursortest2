package defpackage;

import android.os.Looper;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.LocalMessageRef;
import com.yandex.messaging.internal.ServerMessageRef;

/* loaded from: classes15.dex */
public final class dlz0 extends ky4 {
    public final LocalMessageRef y;
    public hai0 z;

    public dlz0(ChatRequest chatRequest, LocalMessageRef localMessageRef) {
        super(chatRequest);
        this.y = localMessageRef;
    }

    @Override // defpackage.ky4, defpackage.xx4, defpackage.hr
    public final void b() {
        hai0 hai0Var = this.z;
        if (hai0Var != null) {
            hai0Var.close();
        }
        this.z = null;
        super.b();
    }

    @Override // defpackage.hr
    public final boolean f(hr hrVar) {
        dlz0 dlz0Var = hrVar instanceof dlz0 ? (dlz0) hrVar : null;
        return jl40.l(this.y, dlz0Var != null ? dlz0Var.y : null);
    }

    @Override // defpackage.b9b
    public final void k(j3b j3bVar, s020 s020Var) {
        zxs0 zxs0Var = new zxs0(s020Var, this);
        m8g m8gVar = (m8g) s020Var;
        n5t0 e = m8gVar.d.e();
        naz0 f = m8gVar.f();
        vcz0 h = m8gVar.h();
        kdd0 kdd0Var = new kdd0(e, f, h, (fw10) m8gVar.v0.get());
        hai0 hai0Var = null;
        z83.g(null, (Looper) kdd0Var.d, Looper.myLooper());
        ServerMessageRef g = h.g(this.y);
        if (g == null) {
            dlz0 dlz0Var = (dlz0) zxs0Var.b;
            hai0 hai0Var2 = dlz0Var.z;
            if (hai0Var2 != null) {
                hai0Var2.close();
            }
            dlz0Var.z = null;
            dlz0Var.h();
        } else {
            hai0Var = new hai0(kdd0Var, g, zxs0Var);
        }
        this.z = hai0Var;
        if (hai0Var != null || this.a == null) {
            return;
        }
        h();
    }
}
