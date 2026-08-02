package xsna;

import com.ironsource.X3;
import com.vk.music.restriction.ResubscribeRequiredException;
import java.util.concurrent.TimeUnit;
import xsna.akv;
import xsna.dg40;

/* compiled from: MusicMessageQueue.kt */
/* loaded from: classes3.dex */
public final class o400 implements io.reactivex.rxjava3.core.s<za20> {
    public static final long f = TimeUnit.MINUTES.toMillis(9);
    public static final long g = TimeUnit.SECONDS.toMillis(30);
    public final f500 b;
    public final laq c;
    public final long d = System.currentTimeMillis();
    public boolean e;

    public o400(f500 f500Var, laq laqVar) {
        this.b = f500Var;
        this.c = laqVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0057, code lost:
    
        xsna.bn40.f("MusicMessageQueue LP", "Key is about to expire");
        r4 = new com.vk.music.restriction.ResubscribeRequiredException(null, 2);
        r8.e = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x006c, code lost:
    
        if (r9.h() == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x006e, code lost:
    
        xsna.bn40.f("Subscription on MusicMessageQueue was disposed");
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0078, code lost:
    
        if (r5 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x007a, code lost:
    
        r5.onError(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0077, code lost:
    
        r5 = r9;
     */
    @Override // io.reactivex.rxjava3.core.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void subscribe(io.reactivex.rxjava3.core.r<za20> rVar) {
        io.reactivex.rxjava3.core.r<za20> rVar2;
        io.reactivex.rxjava3.core.r<za20> rVar3;
        bn40.f("MusicMessageQueue LP", X3.i.d0);
        while (true) {
            if (rVar.h()) {
                break;
            }
            try {
                if (this.c.d()) {
                    bn40.h("MusicMessageQueue LP", "Waiting on backoff " + this.c.g);
                    Thread.sleep(this.c.g);
                    if (rVar.h()) {
                        break;
                    }
                }
                if (this.d + f >= System.currentTimeMillis()) {
                    rVar.onNext(new bb20());
                    akv.a a = this.b.a();
                    a.d = 0;
                    a.e = g;
                    a.f = true;
                    akv akvVar = new akv(a);
                    bn40.f("MusicMessageQueue LP", "Performing call: " + akvVar.a);
                    wy2 wy2Var = vx2.e;
                    dg40 dg40Var = wy2Var != null ? (dg40) l7r0.g(wy2Var, akvVar, new dg40.a()) : null;
                    bn40.f("MusicMessageQueue LP", "Got response: " + dg40Var);
                    this.c.c();
                    if (rVar.h()) {
                        break;
                    }
                    if (dg40Var != null) {
                        this.b.b = dg40Var.a;
                        if (rVar.h()) {
                            bn40.f("Subscription on MusicMessageQueue was disposed");
                            rVar3 = null;
                        } else {
                            rVar3 = rVar;
                        }
                        if (rVar3 != null) {
                            rVar3.onNext(new ab20(dg40Var.b));
                        }
                    }
                    bn40.f("MusicMessageQueue LP", "iteration");
                } else {
                    break;
                }
            } catch (Exception e) {
                this.c.b();
                bn40.c(e, "MusicMessageQueue LP", "Something went wrong");
                ResubscribeRequiredException resubscribeRequiredException = new ResubscribeRequiredException(e, 5);
                this.e = true;
                if (rVar.h()) {
                    bn40.f("Subscription on MusicMessageQueue was disposed");
                    rVar2 = null;
                } else {
                    rVar2 = rVar;
                }
                if (rVar2 != null) {
                    rVar2.onError(resubscribeRequiredException);
                }
            }
        }
        if (this.e) {
            return;
        }
        bn40.f("MusicMessageQueue", "MusicMessageQueue LP", "completed");
        if (rVar.h()) {
            bn40.f("Subscription on MusicMessageQueue was disposed");
            rVar = null;
        }
        if (rVar != null) {
            rVar.onComplete();
        }
    }
}
