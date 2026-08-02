package xsna;

import android.content.Context;
import android.os.Bundle;
import com.ironsource.X3;
import com.vk.auth.main.AuthStatSender;
import com.vk.auth.main.SignUpDataHolder;
import com.vk.auth.main.VkAuthMetaInfo;
import com.vk.auth.main.VkClientLibverifyInfo;
import com.vk.auth.screendata.CreateVkEmailRequiredData;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.collections.EmptyList;
import xsna.yak;

/* compiled from: CreateVkEmailPresenter.kt */
/* loaded from: classes15.dex */
public final class xak extends p66<tak> implements rak {
    public static final long G = TimeUnit.MILLISECONDS.toMillis(300);
    public d A;
    public CreateVkEmailRequiredData.AdsAcceptance B;
    public boolean C;
    public qak D;
    public final String E;
    public final ArrayList<sak> F;
    public final String x;
    public final wak y;
    public b z;

    /* compiled from: CreateVkEmailPresenter.kt */
    public final class a extends p66<tak>.a {
        @Override // xsna.p66.a, xsna.ipj0, io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            if (th instanceof c) {
                return;
            }
            super.onError(th);
            com.vk.registration.funnels.b.a.getClass();
            RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
            frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.ERROR_VK_MAIL_LOGIN, null, null, null, null, null, null, 254);
        }
    }

    /* compiled from: CreateVkEmailPresenter.kt */
    public static final class b implements io.reactivex.rxjava3.disposables.c {
        public final /* synthetic */ io.reactivex.rxjava3.disposables.c b;
        public final String c;

        public b(String str, io.reactivex.rxjava3.disposables.c cVar) {
            this.b = cVar;
            this.c = str;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            this.b.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.b.h();
        }
    }

    /* compiled from: CreateVkEmailPresenter.kt */
    public static final class c extends Exception {
    }

    /* compiled from: CreateVkEmailPresenter.kt */
    public static final class d {
        public final String a;
        public final String b;
        public final boolean c;

        public d(String str, String str2, boolean z) {
            this.a = str;
            this.b = str2;
            this.c = z;
        }

        public static d a(d dVar, String str) {
            String str2 = dVar.a;
            dVar.getClass();
            return new d(str2, str, true);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b) && this.c == dVar.c;
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            return Boolean.hashCode(this.c) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UsernameStatus(username=");
            sb.append(this.a);
            sb.append(", cantCreateReason=");
            sb.append(this.b);
            sb.append(", isChecked=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    public xak(Bundle bundle, CreateVkEmailRequiredData createVkEmailRequiredData) {
        String str;
        String str2;
        String str3 = createVkEmailRequiredData.b;
        this.x = str3;
        this.y = new wak(str3);
        if ((bundle == null || (str = bundle.getString("username")) == null) && (str = createVkEmailRequiredData.e) == null) {
            str = "";
        }
        this.A = new d(str, null, false);
        this.B = createVkEmailRequiredData.f;
        boolean z = bundle != null ? bundle.getBoolean("emailCreated") : false;
        this.C = z;
        this.D = new qak(null, false, z);
        if (bundle == null || (str2 = bundle.getString(X3.j.D)) == null) {
            List<String> list = createVkEmailRequiredData.c;
            String str4 = createVkEmailRequiredData.d;
            str2 = str4.length() > 0 ? str4 : !list.isEmpty() ? list.get(0) : "@vk.com";
        }
        this.E = str2;
        this.F = new ArrayList<>();
    }

    public final void A0(qak qakVar) {
        this.D = qakVar;
        tak takVar = (tak) this.a;
        if (takVar != null) {
            takVar.r7(qakVar);
        }
    }

    public final void B0(d dVar) {
        this.A = dVar;
        A0(qak.a(this.D, false, dVar.b, false, 5));
        C0();
    }

    public final void C0() {
        boolean z = false;
        boolean z2 = this.A.a.length() >= 2;
        d dVar = this.A;
        boolean z3 = dVar.b == null && dVar.c;
        tak takVar = (tak) this.a;
        if (takVar != null) {
            if (z2 && z3) {
                z = true;
            }
            takVar.setContinueButtonEnabled(z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    public final void D0(List<String> list) {
        ?? r0;
        if (list != null) {
            List<String> list2 = list;
            r0 = new ArrayList(c5g.u(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                r0.add(new sak((String) it.next()));
            }
        } else {
            r0 = EmptyList.b;
        }
        ArrayList<sak> arrayList = this.F;
        arrayList.clear();
        arrayList.addAll((Collection) r0);
        tak takVar = (tak) this.a;
        if (takVar != null) {
            takVar.M8();
        }
    }

    @Override // xsna.rak
    public final void a() {
        String str = this.A.a;
        l55 l55Var = l55.a;
        SignUpDataHolder signUpDataHolder = this.p;
        if (signUpDataHolder == null) {
            signUpDataHolder = null;
        }
        VkAuthMetaInfo vkAuthMetaInfo = signUpDataHolder.I;
        l55Var.getClass();
        Context applicationContext = this.b.getApplicationContext();
        r55 r55Var = r55.a;
        r55.e().d(VkClientLibverifyInfo.Service.PASSWORDLESS);
        io.reactivex.rxjava3.core.q j = l55.j(new q45(this.x, applicationContext, vkAuthMetaInfo, 0));
        if (!this.C) {
            boolean z = this.B != CreateVkEmailRequiredData.AdsAcceptance.NOT_ACCEPTED;
            wak wakVar = this.y;
            wakVar.getClass();
            vdx0 vdx0Var = e370.e;
            if (vdx0Var == null) {
                vdx0Var = null;
            }
            j = new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.o(vdx0Var.g().a(str, (String) wakVar.b, z), new js1(new z5a(7, wakVar, str), 21)).h(new f50(new com.vk.movika.sdk.base.logic.interactor.e(this, 26), 23)), new lf1(new kf1(this, 29), 20)).w().L(new e05(new cqf(j, 10), 15), false);
        }
        p66.r0(this, j, new a(), null, 6);
    }

    @Override // xsna.rak
    public final void c0(int i) {
        com.vk.registration.funnels.b.a.getClass();
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.VK_MAIL_SELECTED, null, null, null, null, null, null, 254);
        B0(new d(this.F.get(i).a, null, false));
        tak takVar = (tak) this.a;
        if (takVar != null) {
            takVar.ph(this.A.a);
        }
        y0();
    }

    @Override // xsna.rak
    public final void f0(yak.a aVar, int i) {
        aVar.l.setText(this.F.get(i).a);
    }

    @Override // xsna.z55
    public final AuthStatSender.Screen g0() {
        return AuthStatSender.Screen.UNKNOWN;
    }

    @Override // xsna.p66, xsna.z55
    /* renamed from: p */
    public final void y0(tak takVar) {
        tak takVar2 = takVar;
        super.y0(takVar2);
        takVar2.ph(this.A.a);
        takVar2.r7(this.D);
        takVar2.Bj(this.E);
        qno0 j6 = takVar2.j6();
        da daVar = new da(new x2e(this, 7), 21);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        io.reactivex.rxjava3.disposables.c subscribe = j6.E(daVar, lVar, kVar, kVar).y(G, TimeUnit.MILLISECONDS).subscribe(new ea(new t6(this, 29), 24));
        io.reactivex.rxjava3.disposables.b bVar = this.r;
        if (bVar == null) {
            bVar = null;
        }
        bVar.b(subscribe);
        CreateVkEmailRequiredData.AdsAcceptance adsAcceptance = this.B;
        CreateVkEmailRequiredData.AdsAcceptance adsAcceptance2 = CreateVkEmailRequiredData.AdsAcceptance.HIDE;
        takVar2.ek(adsAcceptance != adsAcceptance2);
        takVar2.r3(this.B == CreateVkEmailRequiredData.AdsAcceptance.ACCEPTED);
        if (this.B != adsAcceptance2) {
            io.reactivex.rxjava3.disposables.c subscribe2 = takVar2.Ki().subscribe(new el6(new srg(this, 6), 16));
            io.reactivex.rxjava3.disposables.b bVar2 = this.r;
            (bVar2 != null ? bVar2 : null).b(subscribe2);
        }
        y0();
        takVar2.md();
    }

    @Override // xsna.rak
    public final void u(boolean z) {
        A0(qak.a(this.D, z, null, false, 6));
    }

    @Override // xsna.p66, xsna.z55
    public final void x(Bundle bundle) {
        bundle.putString("username", this.A.a);
        bundle.putString(X3.j.D, this.E);
        bundle.putBoolean("emailCreated", this.C);
    }

    @Override // xsna.rak
    public final int y() {
        return this.F.size();
    }

    public final void y0() {
        io.reactivex.rxjava3.core.x oVar;
        if (this.C) {
            return;
        }
        String str = this.A.a;
        b bVar = this.z;
        if (epx.f(bVar != null ? bVar.c : null, str) && hg1.d(this.z)) {
            return;
        }
        b bVar2 = this.z;
        if (bVar2 != null) {
            bVar2.dispose();
        }
        wak wakVar = this.y;
        gcp gcpVar = (gcp) ((m900) wakVar.c).get(str);
        if (gcpVar != null) {
            oVar = io.reactivex.rxjava3.core.x.k(gcpVar).m(io.reactivex.rxjava3.android.schedulers.a.b());
        } else {
            vdx0 vdx0Var = e370.e;
            if (vdx0Var == null) {
                vdx0Var = null;
            }
            oVar = new io.reactivex.rxjava3.internal.operators.single.o(com.vk.registration.funnels.a.b(vdx0Var.g().b(str, (String) wakVar.b)), new is1(new eaa(8, wakVar, str), 18));
        }
        this.z = new b(str, mnh0.C(oVar, this.s, new jp5(7, this, str), new b1a(8, this, str), null));
        C0();
    }

    public final void z0(boolean z) {
        this.C = z;
        A0(qak.a(this.D, false, null, z, 3));
        if (this.C) {
            D0(null);
        }
    }
}
