package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.adjust.sdk.Constants;
import com.yandex.messaging.internal.images.b;
import java.util.UUID;
import java.util.concurrent.FutureTask;

/* loaded from: classes15.dex */
public final class j220 extends FutureTask implements dl21 {
    public final kwu a;
    public xi3 b;
    public xi3 c;
    public final /* synthetic */ b w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j220(b bVar, kwu kwuVar) {
        super(new h220());
        this.w = bVar;
        this.a = kwuVar;
        ((Handler) bVar.b.get()).post(new fbz(26, this));
    }

    public static void a(j220 j220Var, cl21 cl21Var, cn3 cn3Var) {
        z83.b(null, ((Handler) j220Var.w.b.get()).getLooper(), Looper.myLooper());
        if (cn3Var.e()) {
            zo3 zo3Var = (zo3) ((d9g) cl21Var).x0.get();
            kwu kwuVar = j220Var.a;
            evu evuVar = zo3Var.b;
            evuVar.getClass();
            jwu g = kwuVar.g();
            g.o(Constants.SCHEME);
            gsu gsuVar = evuVar.d;
            g.h((String) gsuVar.a.c(gsuVar.c));
            t4j0 b = evuVar.b(g.e());
            b.c();
            b.a("X-Request-Id", UUID.randomUUID().toString());
            cn3Var.a(b);
            j220Var.set(zo3Var.a.newCall(new d5j0(b)));
            xi3 xi3Var = j220Var.c;
            if (xi3Var != null) {
                xi3Var.close();
                j220Var.c = null;
            }
            xi3 xi3Var2 = j220Var.b;
            if (xi3Var2 != null) {
                xi3Var2.close();
                j220Var.b = null;
            }
        }
    }

    @Override // defpackage.dl21
    public final void e(cl21 cl21Var) {
        z83.b(null, ((Handler) this.w.b.get()).getLooper(), Looper.myLooper());
        final d9g d9gVar = (d9g) cl21Var;
        this.c = ((yi3) d9gVar.e.get()).c(new zi3() { // from class: i220
            @Override // defpackage.zi3
            public final void b(cn3 cn3Var, wl3 wl3Var, boolean z) {
                j220.a(j220.this, d9gVar, cn3Var);
            }
        });
        if (isDone()) {
            xi3 xi3Var = this.c;
            if (xi3Var != null) {
                xi3Var.close();
                this.c = null;
            }
            xi3 xi3Var2 = this.b;
            if (xi3Var2 != null) {
                xi3Var2.close();
                this.b = null;
            }
        }
    }
}
