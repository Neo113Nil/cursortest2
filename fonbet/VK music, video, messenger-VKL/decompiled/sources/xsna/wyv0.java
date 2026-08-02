package xsna;

import android.net.Uri;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.auth.oauth.VkOAuthService;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeVkConnectNavigationItem;
import com.vk.superapp.api.dto.esia.EsiaCheckEsiaLinkFlow;
import com.vk.superapp.verification.account.b;
import java.util.List;

/* compiled from: VkVerificationByEsiaAccountPresenter.kt */
/* loaded from: classes6.dex */
public final class wyv0 extends tyv0 {
    public a h;
    public final bpn0 i;
    public com.vk.superapp.verification.account.b j;

    /* compiled from: VkVerificationByEsiaAccountPresenter.kt */
    public static final class a {
        public final boolean a;
        public final String b;
        public final boolean c;
        public final String d;
        public final String e;
        public final List<b.f> f;

        public a(String str, String str2, String str3, List list, boolean z, boolean z2) {
            this.a = z;
            this.b = str;
            this.c = z2;
            this.d = str2;
            this.e = str3;
            this.f = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b) && this.c == aVar.c && epx.f(this.d, aVar.d) && this.e.equals(aVar.e) && this.f.equals(aVar.f);
        }

        public final int hashCode() {
            int hashCode = Boolean.hashCode(this.a) * 31;
            String str = this.b;
            return this.f.hashCode() + urd0.a(urd0.a(qoy.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("EsiaOAuthInfo(needOAuthLink=");
            sb.append(this.a);
            sb.append(", esiaSid=");
            sb.append(this.b);
            sb.append(", isEduAccount=");
            sb.append(this.c);
            sb.append(", esiaName=");
            sb.append(this.d);
            sb.append(", vkName=");
            sb.append(this.e);
            sb.append(", migrationItems=");
            return ms9.a(')', sb, this.f);
        }
    }

    public wyv0(boolean z) {
        super(new com.vk.superapp.verification.account.e(z, VkOAuthService.ESIA), z);
        this.i = new bpn0(new o2a0(20));
        this.j = z ? b.j.h : b.d.h;
    }

    public static final void k(wyv0 wyv0Var, Throwable th) {
        wyv0Var.getClass();
        VKApiExecutionException vKApiExecutionException = th instanceof VKApiExecutionException ? (VKApiExecutionException) th : null;
        Integer valueOf = vKApiExecutionException != null ? Integer.valueOf(vKApiExecutionException.s()) : null;
        if (valueOf != null && valueOf.intValue() == 8206) {
            wyv0Var.n(wyv0Var.m().c());
            return;
        }
        if ((valueOf != null && valueOf.intValue() == 8202) || (valueOf != null && valueOf.intValue() == 8203)) {
            wyv0Var.n(wyv0Var.m().b());
        } else {
            r55 r55Var = r55.a;
            wyv0Var.i(wbu0.a(r55.a(), th, true));
        }
    }

    @Override // xsna.tyv0, xsna.kyv0
    public final void a() {
        super.a();
        com.vk.superapp.verification.account.b bVar = this.j;
        if (bVar instanceof b.d) {
            l();
            return;
        }
        if (bVar instanceof b.a) {
            h();
            return;
        }
        if (bVar instanceof b.e) {
            com.vk.superapp.verification.account.d dVar = this.e;
            if (dVar != null) {
                dVar.In(Uri.parse("https://m." + a0a.d + "/faq20573"));
                return;
            }
            return;
        }
        if (bVar instanceof b.h) {
            com.vk.superapp.verification.account.d dVar2 = this.e;
            if (dVar2 != null) {
                dVar2.In(Uri.parse("https://www.gosuslugi.ru/help/faq/login/2"));
                return;
            }
            return;
        }
        if ((bVar instanceof b.C1911b) || (bVar instanceof b.c)) {
            o();
            return;
        }
        if (bVar instanceof b.k) {
            com.vk.superapp.verification.account.d dVar3 = this.e;
            if (dVar3 != null) {
                dVar3.close();
                return;
            }
            return;
        }
        if (!(bVar instanceof b.l)) {
            par0 par0Var = par0.a;
            String str = "Impossible action. There was a call to onPrimaryButtonClick for " + this.j;
            par0Var.getClass();
            par0.b(str);
            return;
        }
        a aVar = this.h;
        List<b.f> list = aVar != null ? aVar.f : null;
        if (list != null) {
            n(m().d(list));
            return;
        }
        com.vk.superapp.verification.account.d dVar4 = this.e;
        if (dVar4 != null) {
            dVar4.close();
        }
    }

    @Override // xsna.tyv0, xsna.kyv0
    public final void b() {
        io.reactivex.rxjava3.core.x i;
        super.b();
        com.vk.superapp.verification.account.b bVar = this.j;
        if ((bVar instanceof b.a) || (bVar instanceof b.h) || (bVar instanceof b.g) || (bVar instanceof b.l) || (bVar instanceof b.e)) {
            com.vk.superapp.verification.account.d dVar = this.e;
            if (dVar != null) {
                dVar.close();
                return;
            }
            return;
        }
        if (!(bVar instanceof b.C1911b)) {
            par0 par0Var = par0.a;
            String str = "Impossible action. There was a call to onSecondaryButtonClick for " + this.j;
            par0Var.getClass();
            par0.b(str);
            return;
        }
        String str2 = this.c;
        if (str2 == null) {
            h();
            return;
        }
        a aVar = this.h;
        Boolean valueOf = aVar != null ? Boolean.valueOf(aVar.a) : null;
        a aVar2 = this.h;
        String str3 = aVar2 != null ? aVar2.b : null;
        Boolean bool = Boolean.TRUE;
        if (!epx.f(valueOf, bool) || str3 == null) {
            i = (epx.f(valueOf, bool) && str3 == null) ? io.reactivex.rxjava3.core.x.i(new NullPointerException("EsiaSid must not be null")) : io.reactivex.rxjava3.core.x.k(bool);
        } else {
            vdx0 vdx0Var = e370.e;
            i = (vdx0Var != null ? vdx0Var : null).h().d(str3, str2);
        }
        this.f.b(j(i).subscribe(new qeu0(new r0r0(this, 15), 1), new zk30(new hx3(1, this, wyv0.class, "processEsiaError", "processEsiaError(Ljava/lang/Throwable;)V", 0, 9), 25)));
    }

    @Override // xsna.kyv0
    public final void c() {
        n(m().e());
    }

    @Override // xsna.kyv0
    public final void d(String str, String str2, String str3) {
        vdx0 vdx0Var = e370.e;
        if (vdx0Var == null) {
            vdx0Var = null;
        }
        this.f.b(j(vdx0Var.h().a(str, EsiaCheckEsiaLinkFlow.VERIFY)).subscribe(new q440(new s1f0(8, str, this), 29), new hmq0(new vs6(1, this, wyv0.class, "processEsiaError", "processEsiaError(Ljava/lang/Throwable;)V", 0, 10), 8)));
    }

    @Override // xsna.kyv0
    public final void e() {
        l();
    }

    @Override // xsna.tyv0
    public final void f(String str) {
        SchemeStatSak$TypeVkConnectNavigationItem.EventType eventType = SchemeStatSak$TypeVkConnectNavigationItem.EventType.GO;
        com.vk.superapp.verification.account.e eVar = this.a;
        com.vk.superapp.verification.account.e.c(eVar, eventType, eVar.a(), SchemeStatSak$EventScreen.OTHER, SchemeStatSak$EventScreen.NOWHERE, null, 36);
        this.c = str;
        a aVar = this.h;
        if (aVar == null) {
            n(this.b ? b.j.h : b.d.h);
            return;
        }
        List<b.f> list = aVar.f;
        if (aVar.c) {
            o();
        } else if (list.isEmpty()) {
            o();
        } else {
            n(m().d(list));
        }
    }

    @Override // xsna.tyv0
    public final com.vk.superapp.verification.account.b g() {
        return this.j;
    }

    public final void l() {
        vdx0 vdx0Var = e370.e;
        if (vdx0Var == null) {
            vdx0Var = null;
        }
        this.f.b(new io.reactivex.rxjava3.internal.operators.single.n(vdx0Var.h().e(EsiaCheckEsiaLinkFlow.VERIFY), new vyv0(new wgm0(this, 18), 0)).subscribe(new pw40(new vhs0(this, 7), 21), new cgu0(new zyl0(this, 22), 3)));
    }

    public final azv0 m() {
        return (azv0) this.i.getValue();
    }

    public final void n(com.vk.superapp.verification.account.b bVar) {
        SchemeStatSak$EventScreen schemeStatSak$EventScreen = this.j.g;
        SchemeStatSak$EventScreen schemeStatSak$EventScreen2 = bVar.g;
        SchemeStatSak$TypeVkConnectNavigationItem.EventType eventType = SchemeStatSak$TypeVkConnectNavigationItem.EventType.GO;
        com.vk.superapp.verification.account.e eVar = this.a;
        com.vk.superapp.verification.account.e.c(eVar, eventType, eVar.a(), schemeStatSak$EventScreen, schemeStatSak$EventScreen2, null, 36);
        this.j = bVar;
        com.vk.superapp.verification.account.d dVar = this.e;
        if (dVar != null) {
            dVar.Jn(bVar);
        }
    }

    public final void o() {
        io.reactivex.rxjava3.core.x b;
        String str = this.c;
        if (str == null) {
            h();
            return;
        }
        a aVar = this.h;
        Boolean valueOf = aVar != null ? Boolean.valueOf(aVar.a) : null;
        a aVar2 = this.h;
        List<b.f> list = aVar2 != null ? aVar2.f : null;
        String str2 = aVar2 != null ? aVar2.b : null;
        Boolean bool = Boolean.TRUE;
        if (epx.f(valueOf, bool) && str2 != null) {
            vdx0 vdx0Var = e370.e;
            b = (vdx0Var != null ? vdx0Var : null).h().c(str2, str);
        } else if (epx.f(valueOf, bool) && str2 == null) {
            b = io.reactivex.rxjava3.core.x.i(new NullPointerException("EsiaSid must not be null"));
        } else {
            vdx0 vdx0Var2 = e370.e;
            b = (vdx0Var2 != null ? vdx0Var2 : null).h().b(str);
        }
        com.vk.superapp.verification.account.d dVar = this.e;
        if (dVar != null) {
            dVar.Fn();
            dVar.e0();
        }
        this.f.b(j(b).subscribe(new tmz(new l1k0(9, this, list), 28), new i3q0(new hoh(1, this, wyv0.class, "processEsiaError", "processEsiaError(Ljava/lang/Throwable;)V", 0, 12), 6)));
    }
}
