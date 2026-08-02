package xsna;

import com.vk.api.sdk.auth.AccountProfileType;
import com.vk.api.sdk.auth.UtilityTokens;
import com.vk.dto.auth.VKLightAccount;
import com.vk.im.engine.lifecycle.di.ImEngineLifecycleComponent;
import com.vk.im.engine.models.EngineInvalidateSource;
import com.vk.im.engine.models.credentials.UserCredentials;
import com.vk.log.L;
import com.vk.superapp.sessionmanagment.api.domain.di.SessionManagementComponent;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.collections.EmptyList;
import xsna.usi0;

/* compiled from: VKAccountManagerSyncInternalAction.kt */
/* loaded from: classes11.dex */
public final class s6r0 implements pon0 {
    public final Lazy<SessionManagementComponent> a;
    public final bpn0 b;

    /* compiled from: Comparisons.kt */
    /* loaded from: classes7.dex */
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return jw5.b(Integer.valueOf(((hp) t2).g), Integer.valueOf(((hp) t).g));
        }
    }

    public s6r0(bpn0 bpn0Var, bpn0 bpn0Var2) {
        this.a = bpn0Var;
        this.b = bpn0Var2;
    }

    @Override // xsna.pon0
    public final void a(List<hp> list) {
        synchronized (q6r0.class) {
            L.p("Use AccountManager data, internal is empty");
            b(list);
            s3q0 s3q0Var = s3q0.a;
        }
    }

    public final void b(List<hp> list) {
        hp hpVar = (hp) j5g.a0(list);
        if (hpVar == null) {
            return;
        }
        m6r0 f = q6r0.f();
        f.G(hpVar.j());
        f.C(hpVar.b());
        f.E(hpVar.i());
        f.f(m6r0.i, hpVar.k());
        f.D(hpVar.f());
        f.F(hpVar.d());
        VKLightAccount g = q6r0.g();
        q6r0.b = VKLightAccount.zb(g, hpVar.j(), g.c, hpVar.k(), g.e, g.f, g.g, hpVar.b(), hpVar.i(), hpVar.f(), hpVar.d(), 1024);
        ArrayList b = gn00.b(list);
        vx2.a.getClass();
        vx2.b().j(b);
        mgn0 mgn0Var = wgn0.a;
        if (i2w.b) {
            ((ImEngineLifecycleComponent) this.b.getValue()).N().a(new UserCredentials(hpVar.f(), hpVar.d(), hpVar.j(), hpVar.b(), hpVar.i()), EngineInvalidateSource.LOGIN);
        }
        sxi0 B2 = this.a.getValue().B2();
        List<hp> D0 = j5g.D0(new a(), list);
        ArrayList arrayList = new ArrayList(c5g.u(D0, 10));
        for (hp hpVar2 : D0) {
            arrayList.add(new usi0.a(new vj(hpVar2.b(), hpVar2.f(), hpVar2.d()), new fhq0(hpVar2.j(), AccountProfileType.NORMAL), new UtilityTokens(EmptyList.b)));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            B2.l((usi0) it.next());
        }
        ArrayList b2 = gn00.b(list);
        vx2.a.getClass();
        vx2.b().j(b2);
        mgn0 mgn0Var2 = wgn0.a;
    }
}
