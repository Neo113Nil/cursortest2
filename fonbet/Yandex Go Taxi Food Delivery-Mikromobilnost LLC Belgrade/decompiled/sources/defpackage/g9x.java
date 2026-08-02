package defpackage;

import android.os.Looper;
import com.yandex.messaging.core.net.entities.JoinParams;
import com.yandex.messaging.core.net.entities.JoinThreadParams;
import com.yandex.messaging.internal.entities.ChatId;
import java.util.UUID;

/* loaded from: classes15.dex */
public final class g9x extends ky4 {
    public h4b y;

    @Override // defpackage.ky4, defpackage.xx4, defpackage.hr
    public final void b() {
        h4b h4bVar = this.y;
        if (h4bVar != null) {
            h4bVar.cancel();
            this.y = null;
        }
        super.b();
    }

    @Override // defpackage.hr
    public final boolean f(hr hrVar) {
        if (hrVar instanceof g9x) {
            return ((g9x) hrVar).w.equals(this.w);
        }
        return false;
    }

    @Override // defpackage.b9b
    public final void k(j3b j3bVar, s020 s020Var) {
        h4b h4bVar;
        i4b i4bVar = (i4b) ((m8g) s020Var).V.get();
        dhv dhvVar = new dhv(14, this);
        fxj0 fxj0Var = i4bVar.c;
        naz0 naz0Var = i4bVar.b;
        String str = naz0Var.a.b;
        i4bVar.a.b(dhvVar);
        int i = 0;
        if (i4bVar.f == null) {
            ChatId a = ChatId.Companion.a(str);
            h4bVar = null;
            if (!(a instanceof ChatId.ThreadId) || ((ChatId.ThreadId) a).d < 0) {
                String e = naz0Var.e();
                if (e == null) {
                    i4bVar.e.reportError("empty invite hash for chat id=".concat(str), null);
                    this.y = h4bVar;
                }
                g4b g4bVar = new g4b(i4bVar, 1);
                JoinParams joinParams = new JoinParams(e);
                boj0 boj0Var = fxj0Var.b;
                io3 io3Var = new io3(fxj0Var, joinParams, g4bVar, 27);
                d7g0 d7g0Var = new d7g0(9);
                z83.g(null, (Looper) boj0Var.b, Looper.myLooper());
                i4bVar.f = new ixj0(boj0Var, UUID.randomUUID().toString(), io3Var, d7g0Var);
            } else {
                g4b g4bVar2 = new g4b(i4bVar, i);
                JoinThreadParams joinThreadParams = new JoinThreadParams(str);
                boj0 boj0Var2 = fxj0Var.b;
                io3 io3Var2 = new io3(fxj0Var, joinThreadParams, g4bVar2, 28);
                d7g0 d7g0Var2 = new d7g0(9);
                z83.g(null, (Looper) boj0Var2.b, Looper.myLooper());
                i4bVar.f = new ixj0(boj0Var2, UUID.randomUUID().toString(), io3Var2, d7g0Var2);
            }
        }
        h4bVar = new h4b(0, i4bVar, dhvVar);
        this.y = h4bVar;
    }
}
