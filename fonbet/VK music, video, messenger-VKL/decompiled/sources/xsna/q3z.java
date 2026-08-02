package xsna;

import android.content.Context;
import com.vk.auth.main.VkClientLibverifyInfo;
import com.vk.toggle.anonymous.SakFeatures;
import com.vk.toggle.b;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import xsna.uir0;

/* compiled from: LibverifySessionDelegateImpl.kt */
/* loaded from: classes.dex */
public final class q3z implements o3z {
    public final Context a;
    public final gau b;
    public final VkClientLibverifyInfo c;
    public final VkClientLibverifyInfo.Service d;
    public boolean e;
    public VkClientLibverifyInfo.Service f;
    public d3z g;

    public q3z(Context context, gau gauVar, VkClientLibverifyInfo vkClientLibverifyInfo, VkClientLibverifyInfo.Service service) {
        this.a = context;
        this.b = gauVar;
        this.c = vkClientLibverifyInfo;
        this.d = service;
    }

    @Override // xsna.o3z
    public final void a() {
        this.e = true;
    }

    @Override // xsna.o3z
    public final io.reactivex.rxjava3.core.q<String> b() {
        if (this.e) {
            return io.reactivex.rxjava3.core.q.T("");
        }
        SakFeatures.b.getClass();
        b.d i = SakFeatures.c.i(SakFeatures.Type.VKC_LIBVERIFY_SESSION);
        uir0 uir0Var = null;
        if (p1p0.a(i)) {
            uir0Var = vir0.a(i != null ? i.c.toString() : null);
        }
        if (uir0Var == null) {
            return io.reactivex.rxjava3.core.q.T("");
        }
        if (uir0Var.equals(uir0.b.a)) {
            d3z d3zVar = this.g;
            if (d3zVar == null) {
                d3zVar = e();
            }
            return io.reactivex.rxjava3.core.q.T(d3zVar.l());
        }
        if (!(uir0Var instanceof uir0.a)) {
            throw new NoWhenBranchMatchedException();
        }
        final long a = ((uir0.a) uir0Var).a();
        return new io.reactivex.rxjava3.internal.operators.observable.s0(new Callable() { // from class: xsna.p3z
            @Override // java.util.concurrent.Callable
            public final Object call() {
                q3z q3zVar = q3z.this;
                d3z d3zVar2 = q3zVar.g;
                if (d3zVar2 == null) {
                    d3zVar2 = q3zVar.e();
                }
                dlv dlvVar = new dlv(d3zVar2);
                d3zVar2.c(new e7(dlvVar, 29));
                d3zVar2.i(new r3z(dlvVar));
                String l = d3zVar2.l();
                ((CountDownLatch) dlvVar.b).await(a, TimeUnit.MILLISECONDS);
                d3zVar2.c(null);
                d3zVar2.i(null);
                return l;
            }
        }).r0(io.reactivex.rxjava3.schedulers.a.b());
    }

    @Override // xsna.o3z
    public final void c() {
        if (this.f != null) {
            this.e = false;
            this.f = null;
            if (this.g != null) {
                e();
            }
        }
        this.e = false;
    }

    @Override // xsna.o3z
    public final void d(VkClientLibverifyInfo.Service service) {
        par0.a.getClass();
        par0.e("[LibverifySession] auth is started for service " + service);
        if (this.f != service) {
            this.e = false;
            this.f = service;
            if (this.g != null) {
                e();
            }
        }
        this.e = false;
    }

    public final d3z e() {
        VkClientLibverifyInfo.Service service = this.f;
        if (service == null) {
            service = this.d;
        }
        String c = this.c.c(service);
        par0.a.getClass();
        par0.e("[LibverifySession] initializing LibverifyController for service " + c);
        e3z a = this.b.a(this.a, c);
        this.g = a;
        return a;
    }
}
