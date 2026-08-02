package defpackage;

import com.yandex.messaging.audio.d;
import com.yandex.messaging.internal.ThreadChat;
import com.yandex.messaging.internal.net.Error;
import java.util.concurrent.TimeUnit;

/* loaded from: classes15.dex */
public final class b1s implements x08, b9b {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final /* synthetic */ Object c;

    public b1s(c1s c1sVar, ThreadChat threadChat, c1o c1oVar) {
        this.c = c1sVar;
        this.b = c1oVar;
        e1k c = c1sVar.a.c(threadChat, this);
        qp3 qp3Var = c1sVar.b;
        kgx kgxVar = c1s.c[0];
        qp3Var.b(c);
    }

    @Override // defpackage.b9b
    public void a(Error error) {
        if (ydz.a.a()) {
            ydz.b("ForceCreateThread", error.toString());
        }
    }

    @Override // defpackage.x08
    public final void cancel() {
        int i = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                qp3 qp3Var = ((c1s) obj2).b;
                kgx kgxVar = c1s.c[0];
                qp3Var.b(null);
                break;
            case 1:
                ((tyc0) obj2).g.remove((rh3) obj);
                break;
            default:
                jz01 jz01Var = (jz01) obj2;
                jz01Var.getClass();
                jz01Var.d = null;
                ((w0j0) obj).cancel();
                break;
        }
    }

    @Override // defpackage.b9b
    public void k(j3b j3bVar, s020 s020Var) {
        ((c1o) this.b).invoke();
    }

    public b1s(jz01 jz01Var, String str) {
        this.c = jz01Var;
        this.b = jz01Var.b.a(25L, TimeUnit.SECONDS, new iz01(jz01Var, str));
    }

    public b1s(tyc0 tyc0Var, rh3 rh3Var, d dVar) {
        this.c = tyc0Var;
        this.b = rh3Var;
        tyc0Var.g.put(rh3Var, dVar);
    }
}
