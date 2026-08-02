package defpackage;

import android.os.Looper;
import com.yandex.messaging.core.net.entities.proto.ChatHistoryResponse;
import kotlin.Pair;

/* loaded from: classes15.dex */
public abstract class kbb implements cxy, e1k {
    public final cxy a;
    public e1k b;
    public final /* synthetic */ lbb c;

    public kbb(lbb lbbVar, cxy cxyVar) {
        this.c = lbbVar;
        this.a = cxyVar;
    }

    @Override // defpackage.cxy
    public final void a() {
        e1k e1kVar = this.b;
        if (e1kVar != null) {
            e1kVar.close();
        }
        this.b = null;
        this.a.a();
    }

    public abstract Pair c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        e1k e1kVar = this.b;
        if (e1kVar != null) {
            e1kVar.close();
        }
        this.b = null;
    }

    @Override // defpackage.cxy
    public final void d(ChatHistoryResponse chatHistoryResponse) {
        this.c.e.getClass();
        e1k e1kVar = this.b;
        if (e1kVar != null) {
            e1kVar.close();
        }
        this.b = null;
        this.a.d(chatHistoryResponse);
        e();
    }

    public final boolean e() {
        kbb kbbVar;
        e1k cn2Var;
        this.c.e.getClass();
        Pair c = c();
        ry10 ry10Var = (ry10) c.c();
        Long l = (Long) c.f();
        if (ry10Var == null) {
            close();
            return false;
        }
        exy exyVar = this.c.c;
        z83.g(null, exyVar.c, Looper.myLooper());
        if (l != null) {
            Long f = exyVar.d.b.Y().f(exyVar.e.a);
            if ((f != null ? f.longValue() : 0L) >= l.longValue()) {
                a();
                cn2Var = e1k.M1;
                kbbVar = this;
                kbbVar.b = cn2Var;
                return true;
            }
        }
        ecz0 ecz0Var = exyVar.h;
        if (l != null) {
            wtb1.c(l.longValue());
        }
        ry10Var.toString();
        ecz0Var.getClass();
        n5t0 n5t0Var = exyVar.b;
        naz0 naz0Var = exyVar.a;
        kbbVar = this;
        cn2Var = new cn2(n5t0Var.f(new dxy(ry10Var, exyVar, kbbVar, l, naz0Var.a.b, naz0Var.e(), exyVar.a.b(), exyVar.f.a, exyVar.g)), 2);
        kbbVar.b = cn2Var;
        return true;
    }
}
