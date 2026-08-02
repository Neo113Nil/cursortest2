package xsna;

import android.os.Bundle;
import android.text.TextUtils;
import com.vk.api.sdk.auth.UtilityToken;
import com.vk.api.sdk.auth.UtilityTokens;
import com.vk.auth.api.models.AuthResult;
import com.vk.bridges.ProfileType;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.auth.VKLightAccount;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.account.AudioAdConfig;
import com.vk.dto.common.account.ProfilerConfig;
import com.vk.dto.common.account.VideoConfig;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.user.ObsceneTextFilter;
import com.vk.dto.user.UserNameType;
import com.vk.dto.user.UserSex;
import com.vk.im.engine.models.EngineInvalidateSource;
import com.vk.im.engine.models.credentials.UserCredentials;
import com.vk.log.L;
import com.vk.metrics.eventtracking.Event;
import com.vk.superapp.multiaccount.api.MultiAccountEntryPoint;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;
import xsna.b25;
import xsna.usi0;

/* compiled from: VkAuthBridge.kt */
/* loaded from: classes11.dex */
public final class tbu0 implements b25 {
    public final mui0 a;
    public final sxi0 b;
    public final mxi0 c;
    public final bpn0 d;
    public final bpn0 e;
    public final bpn0 f;
    public final bpn0 g;
    public final bpn0 h;
    public final bpn0 i;
    public final bpn0 j = new bpn0(new dr4(this, 10));
    public final AtomicReference<UserId> k = new AtomicReference<>(UserId.d);
    public final CopyOnWriteArraySet<b25.a> l = new CopyOnWriteArraySet<>();

    public tbu0(mui0 mui0Var, sxi0 sxi0Var, mxi0 mxi0Var, bpn0 bpn0Var, bpn0 bpn0Var2, bpn0 bpn0Var3, bpn0 bpn0Var4, bpn0 bpn0Var5, bpn0 bpn0Var6) {
        this.a = mui0Var;
        this.b = sxi0Var;
        this.c = mxi0Var;
        this.d = bpn0Var;
        this.e = bpn0Var2;
        this.f = bpn0Var3;
        this.g = bpn0Var4;
        this.h = bpn0Var5;
        this.i = bpn0Var6;
    }

    @Override // xsna.b25
    public final n6r0 A() {
        return q6r0.c();
    }

    @Override // xsna.b25
    public final void B(b25.a aVar) {
        this.l.remove(aVar);
    }

    @Override // xsna.b25
    public final Image D() {
        return (Image) ((bxx) q6r0.f().a(m6r0.D0));
    }

    @Override // xsna.b25
    public final ProfilerConfig E() {
        ProfilerConfig profilerConfig = (ProfilerConfig) ((bxx) q6r0.f().a(m6r0.m0));
        return profilerConfig == null ? new ProfilerConfig(false, null, 3, null) : profilerConfig;
    }

    @Override // xsna.b25
    public final long F() {
        return q6r0.f().d(m6r0.T0);
    }

    @Override // xsna.b25
    public final s2r G() {
        return (s2r) ((bxx) q6r0.f().a(m6r0.v1));
    }

    @Override // xsna.b25
    public final void H(AudioAdConfig audioAdConfig) {
        q6r0.f().f(m6r0.Z, Boolean.valueOf(audioAdConfig.Ab()));
        q6r0.f().f(m6r0.k0, audioAdConfig);
    }

    @Override // xsna.b25
    public final int I() {
        vj a;
        usi0.a i = this.a.i();
        if (i == null || (a = i.a()) == null) {
            return 0;
        }
        return a.d();
    }

    @Override // xsna.b25
    public final int J() {
        return q6r0.f().c(m6r0.v0, 0);
    }

    @Override // xsna.b25
    public final boolean K(long j) {
        return i35.h(j);
    }

    @Override // xsna.b25
    public final UserId L() {
        return c();
    }

    @Override // xsna.b25
    public final or00 M() {
        return (or00) ((bxx) q6r0.f().a(m6r0.r1));
    }

    @Override // xsna.b25
    public final void O(t200 t200Var) {
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        el3 el3Var = Event.b;
        Event.a b = h5s.b("VkAuthBridge.logout");
        b.c("reason", t200Var.a());
        bVar.k(b.e());
        if (b()) {
            ArrayList e = this.a.e();
            if (!e.isEmpty()) {
                Iterator it = e.iterator();
                while (it.hasNext()) {
                    if (epx.f(((usi0.a) it.next()).c().b(), t200Var.b())) {
                        UserId userId = UserId.d;
                        UserId b2 = t200Var.b();
                        AtomicReference<UserId> atomicReference = this.k;
                        if (vcl0.c(atomicReference, userId, b2)) {
                            try {
                                ((u200) this.j.getValue()).b(t200Var);
                                atomicReference.set(userId);
                                return;
                            } catch (Throwable th) {
                                atomicReference.set(UserId.d);
                                throw th;
                            }
                        }
                        return;
                    }
                }
            }
            L.o(new xq1(17, t200Var, this));
        }
    }

    @Override // xsna.b25
    public final String P() {
        return (String) q6r0.f().a(m6r0.H0);
    }

    @Override // xsna.b25
    public final void Q(or00 or00Var) {
        o6r0 c = q6r0.c();
        c.m(or00Var);
        c.f();
    }

    @Override // xsna.b25
    public final void R(String str, String str2, boolean z) {
        Object obj;
        Iterator it = this.a.e().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (epx.f(((usi0.a) obj).a().e(), str2)) {
                    break;
                }
            }
        }
        usi0.a aVar = (usi0.a) obj;
        if (aVar == null) {
            return;
        }
        O(new t200(104, aVar.c().b(), str, null, z, true, false));
    }

    @Override // xsna.b25
    public final void S(boolean z) {
        q6r0.f().f(m6r0.C0, Boolean.valueOf(z));
    }

    @Override // xsna.b25
    public final pv8 T() {
        return (pv8) ((bxx) q6r0.f().a(m6r0.Z0));
    }

    @Override // xsna.b25
    public final boolean U(String str) {
        Object obj;
        Iterator it = this.a.e().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (epx.f(((usi0.a) obj).a().e(), str)) {
                break;
            }
        }
        return obj != null;
    }

    @Override // xsna.b25
    public final AudioAdConfig V() {
        AudioAdConfig audioAdConfig = (AudioAdConfig) ((bxx) q6r0.f().a(m6r0.k0));
        return audioAdConfig == null ? new AudioAdConfig(0, 0, null, null, false, 31, null) : audioAdConfig;
    }

    @Override // xsna.b25
    public final long X() {
        return (((Integer) q6r0.f().a(m6r0.B)) != null ? r0.intValue() : -1) * 1000;
    }

    @Override // xsna.b25
    public final String Z() {
        return q6r0.f().m();
    }

    @Override // xsna.b25
    public final boolean a(UserId userId) {
        return epx.f(this.a.a(), userId);
    }

    @Override // xsna.b25
    public final void a0(UserNameType userNameType) {
        m6r0 f = q6r0.f();
        f.getClass();
        f.f(m6r0.j1, userNameType.h());
    }

    @Override // xsna.b25
    public final boolean b() {
        return fkq0.c(this.a.a());
    }

    @Override // xsna.b25
    public final void b0(b25.a aVar) {
        this.l.add(aVar);
    }

    @Override // xsna.b25
    public final UserId c() {
        return this.a.a();
    }

    @Override // xsna.b25
    public final ProfileType c0() {
        return ProfileType.NORMAL;
    }

    @Override // xsna.b25
    public final boolean d() {
        Boolean bool = (Boolean) q6r0.f().a(m6r0.C0);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // xsna.b25
    public final VideoConfig d0() {
        VideoConfig videoConfig = (VideoConfig) ((bxx) q6r0.f().a(m6r0.n0));
        if (videoConfig != null) {
            return videoConfig;
        }
        return new VideoConfig(0, null, 0L, false, false, 31, null);
    }

    @Override // xsna.b25
    public final void e() {
        q6r0.f().f(m6r0.O, Boolean.TRUE);
    }

    @Override // xsna.b25
    public final io.reactivex.rxjava3.core.a f(UserId userId) {
        Object obj;
        Bundle x;
        mui0 mui0Var = this.a;
        Iterator it = mui0Var.e().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (epx.f(((usi0.a) obj).c().b(), userId)) {
                break;
            }
        }
        usi0.a aVar = (usi0.a) obj;
        if (aVar == null) {
            return io.reactivex.rxjava3.core.a.k(new IllegalStateException("User " + userId + " was not found in sessions storage"));
        }
        if (!aVar.equals(mui0Var.i())) {
            x = sv1.x(MultiAccountEntryPoint.Push.d, null, null);
            AuthResult a = an00.a(aVar, x);
            return new io.reactivex.rxjava3.internal.operators.observable.b1(l55.g(l55.a, a, null, 6)).j(new cdd(a, 5));
        }
        return io.reactivex.rxjava3.core.a.k(new IllegalStateException("User " + userId + " is already active user"));
    }

    @Override // xsna.b25
    public final List<UserId> g() {
        ArrayList e = this.a.e();
        ArrayList arrayList = new ArrayList(c5g.u(e, 10));
        Iterator it = e.iterator();
        while (it.hasNext()) {
            arrayList.add(((usi0.a) it.next()).c().b());
        }
        return arrayList;
    }

    @Override // xsna.b25
    public final String h() {
        vj a;
        String e;
        usi0.a i = this.a.i();
        return (i == null || (a = i.a()) == null || (e = a.e()) == null) ? "" : e;
    }

    @Override // xsna.b25
    public final ms i() {
        m6r0 f = q6r0.f();
        n7r n7rVar = m6r0.q;
        boolean equals = TextUtils.equals((String) f.a(n7rVar), "tester");
        boolean equals2 = TextUtils.equals((String) f.a(n7rVar), "app_developer");
        boolean B = f.B();
        boolean z = q6r0.f().B() || !BuildInfo.m();
        long d = f.d(m6r0.U0);
        long d2 = f.d(m6r0.V0);
        UserSex w = f.w();
        Integer num = (Integer) f.a(m6r0.m);
        int intValue = num != null ? num.intValue() : 0;
        boolean e = f.e(m6r0.T);
        boolean e2 = f.e(m6r0.e0);
        boolean e3 = f.e(m6r0.d0);
        boolean e4 = f.e(m6r0.f0);
        boolean e5 = f.e(m6r0.D);
        String str = (String) f.a(m6r0.G);
        if (str == null) {
            str = "RUB";
        }
        String str2 = str;
        int c = f.c(m6r0.I, 0);
        int c2 = f.c(m6r0.J, 0);
        boolean e6 = f.e(m6r0.F);
        boolean e7 = f.e(m6r0.H);
        boolean e8 = f.e(m6r0.V);
        String str3 = (String) f.b(m6r0.W, "");
        String str4 = (String) f.b(m6r0.X, "");
        int c3 = f.c(m6r0.Y, 0);
        boolean e9 = f.e(m6r0.z);
        int c4 = f.c(m6r0.K0, 0);
        boolean e10 = f.e(m6r0.x);
        long d3 = f.d(m6r0.y);
        int c5 = f.c(m6r0.S, -1);
        boolean e11 = f.e(m6r0.l0);
        boolean e12 = f.e(m6r0.N);
        boolean e13 = f.e(m6r0.O);
        boolean e14 = f.e(m6r0.Q);
        boolean e15 = f.e(m6r0.L0);
        UserNameType.a aVar = UserNameType.Companion;
        String str5 = (String) f.a(m6r0.j1);
        aVar.getClass();
        UserNameType a = UserNameType.a.a(str5);
        if (a == null) {
            a = UserNameType.VK;
        }
        UserNameType userNameType = a;
        md20 md20Var = (md20) ((bxx) f.b(m6r0.k1, md20.e.getSTUB()));
        Integer num2 = (Integer) f.a(m6r0.y0);
        int intValue2 = num2 != null ? num2.intValue() : 3;
        Integer num3 = (Integer) f.a(m6r0.z0);
        int intValue3 = num3 != null ? num3.intValue() : 10;
        Integer num4 = (Integer) f.a(m6r0.A0);
        int intValue4 = num4 != null ? num4.intValue() : 1;
        Integer num5 = (Integer) f.a(m6r0.B0);
        int intValue5 = num5 != null ? num5.intValue() : 10;
        boolean e16 = f.e(m6r0.w0);
        boolean e17 = f.e(m6r0.P);
        boolean e18 = f.e(m6r0.t);
        boolean e19 = f.e(m6r0.s);
        Boolean bool = (Boolean) f.a(m6r0.C0);
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        ObsceneTextFilter t = f.t();
        or00 or00Var = (or00) ((bxx) f.a(m6r0.r1));
        d7r d7rVar = m6r0.t1;
        Boolean bool2 = (Boolean) f.a(d7rVar);
        return new ms(equals2, equals, B, z, d, d2, w, intValue, e, e2, e3, e4, e5, intValue2, intValue3, intValue4, intValue5, e16, e17, str2, c, c2, e6, e7, e8, str3, str4, c3, e9, e10, c5, e11, d3, c4, e12, e13, e14, e18, e19, e15, userNameType, md20Var, booleanValue, t, or00Var, bool2 != null ? bool2.booleanValue() : false, ((Boolean) f.a(d7rVar)) != null, f.e(m6r0.u1), 57344);
    }

    @Override // xsna.b25
    public final String j() {
        return (String) q6r0.f().b(m6r0.X, "");
    }

    @Override // xsna.b25
    public final void k(long j, boolean z) {
        o6r0 c = q6r0.c();
        c.i(z);
        c.n(j);
        c.commit();
    }

    @Override // xsna.b25
    public final void l(boolean z) {
        m6r0 f = q6r0.f();
        f.getClass();
        l7r l7rVar = m6r0.k1;
        q6r0.f().f(l7rVar, md20.b((md20) ((bxx) f.b(l7rVar, md20.e.getSTUB())), z, false, 6));
    }

    @Override // xsna.b25
    public final int n() {
        return q6r0.f().c(m6r0.Y, 0);
    }

    @Override // xsna.b25
    public final cn o() {
        ImageList imageList;
        if (q6r0.a == null) {
            VKLightAccount g = q6r0.g();
            return new cn(g.b, g.d, g.g, g.c, g.e, g.f, 0L, "", null, g.l, null, null);
        }
        UserId y = q6r0.a.y();
        String r = q6r0.a.r();
        String u = q6r0.a.u();
        UserSex w = q6r0.a.w();
        String str = (String) q6r0.a.b(m6r0.o, "");
        String str2 = (String) q6r0.a.a(m6r0.h1);
        long d = q6r0.a.d(m6r0.i1);
        String str3 = (String) q6r0.a.a(m6r0.j);
        Image image = (Image) ((bxx) q6r0.a.a(m6r0.D0));
        if (image == null) {
            imageList = null;
        } else {
            imageList = new ImageList();
            Iterator it = image.b.iterator();
            while (it.hasNext()) {
                imageList.zb(((ImageSize) it.next()).Bb());
            }
        }
        return new cn(y, r, u, w, str, str2, d, str3, imageList, q6r0.a.e(m6r0.s1), (Boolean) q6r0.a.a(m6r0.t1), q6r0.a.z());
    }

    @Override // xsna.b25
    public final String p() {
        UtilityTokens utilityTokens;
        Object obj;
        usi0.a i = this.a.i();
        if (i == null || (utilityTokens = i.d) == null) {
            return "";
        }
        Iterator<T> it = utilityTokens.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (epx.f(((UtilityToken) obj).d(), "EVENT_HUB")) {
                break;
            }
        }
        UtilityToken utilityToken = (UtilityToken) obj;
        String e = utilityToken != null ? utilityToken.e() : null;
        return e == null ? "" : e;
    }

    @Override // xsna.b25
    public final String q() {
        return (String) q6r0.f().a(m6r0.G0);
    }

    @Override // xsna.b25
    public final long r() {
        vj a;
        usi0.a i = this.a.i();
        if (i == null || (a = i.a()) == null) {
            return 0L;
        }
        return a.c();
    }

    @Override // xsna.b25
    public final String s(UserId userId) {
        Object obj;
        vj a;
        Iterator it = this.a.e().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (epx.f(((usi0.a) obj).c().b(), userId)) {
                break;
            }
        }
        usi0.a aVar = (usi0.a) obj;
        if (aVar == null || (a = aVar.a()) == null) {
            return null;
        }
        return a.e();
    }

    @Override // xsna.b25
    public final void t(h7r0 h7r0Var) {
        o6r0 c = q6r0.c();
        c.g(h7r0Var.a);
        c.p(h7r0Var.b);
        c.h(h7r0Var.c);
        c.q(h7r0Var.d);
        c.commit();
        vx2.a.getClass();
        wy2 wy2Var = vx2.e;
        if (wy2Var != null) {
            wy2Var.j(Collections.singletonList(h7r0Var));
        }
        ((r1w) this.i.getValue()).a(new UserCredentials(h7r0Var.c, h7r0Var.d, h7r0Var.e, h7r0Var.a, h7r0Var.b), EngineInvalidateSource.LOGIN);
        usi0.a i = this.a.i();
        if (i == null) {
            return;
        }
        vj a = i.a();
        String str = h7r0Var.a;
        int i2 = h7r0Var.c;
        long j = h7r0Var.d;
        a.getClass();
        this.b.j(i, i.b(vj.a(i2, j, str), h7r0Var.f));
        ArrayList c2 = an00.c(this.a.e());
        wy2 wy2Var2 = vx2.e;
        if (wy2Var2 != null) {
            bpn0 bpn0Var = new bpn0(new we0(c2, 3));
            mkx i3 = wy2Var2.i();
            i3.getClass();
            if (bpn0Var.isInitialized()) {
                i3.m(bpn0Var.getValue().toString());
            }
            i3.e = bpn0Var;
        }
    }

    @Override // xsna.b25
    public final UtilityTokens v() {
        UtilityTokens utilityTokens;
        usi0.a i = this.a.i();
        if (i != null && (utilityTokens = i.d) != null) {
            return utilityTokens;
        }
        UtilityTokens.CREATOR.getClass();
        return UtilityTokens.c;
    }

    @Override // xsna.b25
    public final boolean w() {
        return q6r0.f().e(m6r0.F);
    }

    @Override // xsna.b25
    public final void x() {
        Iterator<b25.a> it = this.l.iterator();
        while (it.hasNext()) {
            it.next().d(this);
        }
    }

    @Override // xsna.b25
    public final void y(boolean z) {
        m6r0 f = q6r0.f();
        f.getClass();
        l7r l7rVar = m6r0.k1;
        q6r0.f().f(l7rVar, md20.b((md20) ((bxx) f.b(l7rVar, md20.e.getSTUB())), false, z, 3));
    }

    @Override // xsna.b25
    public final long z() {
        return (((Integer) q6r0.f().a(m6r0.A)) != null ? r0.intValue() : -1) * 1000;
    }
}
