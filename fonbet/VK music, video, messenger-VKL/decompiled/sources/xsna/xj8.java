package xsna;

import com.vk.voip.dto.call_member.CallMemberId;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: BroadcastStateProviderImpl.kt */
/* loaded from: classes7.dex */
public abstract class xj8 {
    public final com.vk.voip.b a;
    public final bfw0 b;
    public final apv c;
    public final ReentrantLock d = new ReentrantLock(true);

    public xj8(com.vk.voip.b bVar, bfw0 bfw0Var, apv apvVar) {
        this.a = bVar;
        this.b = bfw0Var;
        this.c = apvVar;
    }

    public static boolean f(xj8 xj8Var) {
        return xj8Var.a() != null;
    }

    public final hd8 a() {
        if (i()) {
            return this.a.M().a();
        }
        return null;
    }

    public abstract vay0 b();

    public final CallMemberId c() {
        return this.a.d().b();
    }

    public final boolean d(String str) {
        if (this.a.d().e()) {
            return false;
        }
        CallMemberId c = c();
        return str.equals(c != null ? c.b : null);
    }

    public abstract boolean e();

    public final boolean g() {
        boolean z;
        com.vk.voip.b bVar = this.a;
        boolean isGroupCall = bVar.isGroupCall();
        apv apvVar = this.c;
        if (isGroupCall) {
            z = apvVar.isCallActive();
        } else {
            if (isGroupCall) {
                throw new NoWhenBranchMatchedException();
            }
            z = apvVar.a() || apvVar.isConnecting();
        }
        return i() && !bVar.d().e() && !f(this) && z;
    }

    public final boolean h() {
        hd8 a = a();
        CallMemberId c = c();
        boolean f = epx.f(a != null ? a.d : null, c);
        com.vk.voip.b bVar = this.a;
        boolean d = bVar.d().d(c);
        boolean c2 = bVar.d().c(c);
        if (i() && f(this) && !bVar.d().e()) {
            return f || d || c2;
        }
        return false;
    }

    public final boolean i() {
        this.a.M().getClass();
        return this.b.isEnabled();
    }

    public final boolean j() {
        hd8 a = a();
        return (i() || e()) && !this.a.d().e() && epx.f(a != null ? a.d : null, c()) && f(this);
    }

    public abstract io.reactivex.rxjava3.core.q k(gzs gzsVar);

    public final <T> io.reactivex.rxjava3.core.q<T> l(gzs<? extends T> gzsVar) {
        return ((r4x0) this).k(gzsVar);
    }

    public final hd8 m(String str, String str2, String str3, boolean z) {
        ReentrantLock reentrantLock = this.d;
        reentrantLock.lock();
        try {
            if (f(this)) {
                throw new IllegalStateException("Another active broadcast is running");
            }
            if (g()) {
                return this.a.M().b(str, str2, str3, z);
            }
            throw new IllegalArgumentException("No permissions to start broadcast");
        } finally {
            reentrantLock.unlock();
        }
    }
}
