package defpackage;

import android.graphics.Rect;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import androidx.recyclerview.widget.x0;
import com.yandex.go.trusted_contacts.analytics.ContactType;
import com.yandex.go.trusted_contacts.analytics.evgen.TrustedContactsAnalytics$TrustedContactsContactType;
import com.yandex.go.walking.navigation.impl.analytics.WalkingNavigationAnalytics$ExitOptionsTapType;
import com.yandex.go.walking.navigation.impl.analytics.WalkingNavigationAnalytics$WalkingNavigationGeneration;
import com.yandex.go.walking.navigation.impl.navigation_core.guidance.b;
import com.yandex.urbanads.UrbanAdsError$ErrorType;
import com.ybsdk.core.analytics.generated.delegates.TransferEvents$TransferPaymentInitiatedChosenMethod;
import com.ybsdk.core.analytics.generated.delegates.TransferEvents$TransferPaymentResultChosenMethod;
import com.ybsdk.core.transfer.utils.domain.AnalyticsPaymentStatus;
import com.ybsdk.core.transfer.utils.domain.entities.AnalyticsSourceScreen;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.a;
import kotlinx.serialization.KSerializer;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.rt.ebs.cryptosdk.core.verificationFlow.controllers.IVerificationFlowController;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.EmptyFlow;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IFlow;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IVerificationFlow;
import ru.yandex.taxi.navigation.single_guidance_coordinator.GuidanceOwnerId;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;

/* loaded from: classes6.dex */
public final class a201 implements hxs, IVerificationFlowController, ve31, bx60, j4u, bnj, zs10 {
    public final /* synthetic */ int a;
    public final Object b;
    public Object c;

    public a201(rqo rqoVar) {
        this.a = 9;
        this.b = rqoVar;
        this.c = a.a(new pv01(8, this));
    }

    @Override // defpackage.hxs
    public void a(String str, AnalyticsSourceScreen analyticsSourceScreen, TransferEvents$TransferPaymentInitiatedChosenMethod transferEvents$TransferPaymentInitiatedChosenMethod, String str2, String str3, String str4, String str5, String str6, String str7) {
        ((us3) this.c).a(str, analyticsSourceScreen, transferEvents$TransferPaymentInitiatedChosenMethod, str2, str3, str4, str5, str6, null);
    }

    @Override // defpackage.hxs
    public void b(String str, AnalyticsPaymentStatus analyticsPaymentStatus, AnalyticsSourceScreen analyticsSourceScreen, String str2, String str3, String str4, String str5, String str6, String str7, TransferEvents$TransferPaymentResultChosenMethod transferEvents$TransferPaymentResultChosenMethod, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        ((us3) this.c).b(str, analyticsPaymentStatus, analyticsSourceScreen, str2, str3, str4, str5, str6, str7, transferEvents$TransferPaymentResultChosenMethod, str8, str9, str10, str11, str12, str13, str14, str15);
    }

    public void c(long j, ef90 ef90Var) {
        if (ef90Var.a() < 9) {
            return;
        }
        int k = ef90Var.k();
        int k2 = ef90Var.k();
        int y = ef90Var.y();
        if (k == 434 && k2 == 1195456820 && y == 3) {
            sgb1.c(j, ef90Var, (g001[]) this.c);
        }
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.controllers.IVerificationFlowController
    public void createFlowFZ115() {
        release();
        this.c = ((wpy0) this.b).createFZ115();
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.controllers.IVerificationFlowController
    public void createFlowWithoutEsia() {
        release();
        this.c = ((wpy0) this.b).createFlowWithoutEsia();
    }

    public Rect d(z021 z021Var) {
        zuj0 zuj0Var = (zuj0) this.b;
        int c = ((avj0) zuj0Var).c(cvg0.universal_qr_scanner_target_frame_bottom_offset);
        int c2 = ((avj0) zuj0Var).c(cvg0.universal_qr_scanner_target_frame_horizontal_margin);
        int c3 = ((avj0) zuj0Var).c(cvg0.universal_qr_scanner_target_frame_max_size);
        int i = z021Var.a;
        int i2 = i - (c2 * 2);
        if (i2 <= c3) {
            c3 = i2;
        }
        int i3 = ((z021Var.d - c) + z021Var.c) / 2;
        int i4 = i / 2;
        int i5 = c3 / 2;
        return new Rect(i4 - i5, i3 - i5, i4 + i5, i3 + i5);
    }

    public void e(d5p d5pVar, xi11 xi11Var) {
        g001[] g001VarArr = (g001[]) this.c;
        for (int i = 0; i < g001VarArr.length; i++) {
            xi11Var.c();
            xi11Var.d();
            g001 B = d5pVar.B(xi11Var.d, 3);
            androidx.media3.common.a aVar = (androidx.media3.common.a) ((List) this.b).get(i);
            String str = aVar.n;
            d6z.k("Invalid closed caption MIME type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            f7s f7sVar = new f7s();
            xi11Var.d();
            f7sVar.a = xi11Var.e;
            f7sVar.l = eh20.q("video/mp2t");
            f7sVar.m = eh20.q(str);
            f7sVar.e = aVar.e;
            f7sVar.d = aVar.d;
            f7sVar.H = aVar.I;
            f7sVar.p = aVar.q;
            smw0.u(f7sVar, B);
            g001VarArr[i] = B;
        }
    }

    public void f(kyg kygVar) {
        synchronized (kygVar) {
        }
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new ao31(this, kygVar, 1));
        }
    }

    public s501 g() {
        return (s501) this.c;
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.controllers.IFlowController
    public IFlow getCurrentFlow() {
        IVerificationFlow iVerificationFlow = (IVerificationFlow) this.c;
        return iVerificationFlow != null ? iVerificationFlow : EmptyFlow.INSTANCE;
    }

    @Override // defpackage.j4u
    public GuidanceOwnerId getId() {
        return (GuidanceOwnerId) this.b;
    }

    @Override // defpackage.bnj
    public void h(smj smjVar) {
        ((e331) this.c).invoke(smjVar);
    }

    @Override // defpackage.ve31
    public void i(ux31 ux31Var) {
        ((sf31) this.b).I.i(ux31Var);
    }

    @Override // defpackage.ve31
    public void j(String str) {
        ((sf31) this.b).I.j(str);
    }

    @Override // defpackage.ve31
    public void k() {
        ((sf31) this.b).I.k();
    }

    @Override // defpackage.ve31
    public void l() {
        ((sf31) this.b).I.l();
    }

    @Override // defpackage.bnj
    public Set m() {
        return (Set) this.b;
    }

    @Override // defpackage.ve31
    public void n(x0 x0Var, elx0 elx0Var) {
        ((sf31) this.b).I.n(x0Var, elx0Var);
    }

    @Override // defpackage.ve31
    public void o() {
        ((sf31) this.b).I.g(((qf31) this.c).E());
    }

    @Override // defpackage.bx60
    public n751 onApplyWindowInsets(View view, n751 n751Var) {
        hw31 hw31Var = (hw31) this.b;
        iw31 iw31Var = (iw31) this.c;
        iw31 iw31Var2 = new iw31();
        iw31Var2.a = iw31Var.a;
        iw31Var2.b = iw31Var.b;
        iw31Var2.c = iw31Var.c;
        iw31Var2.d = iw31Var.d;
        return hw31Var.k(view, n751Var, iw31Var2);
    }

    public String p() {
        return (String) this.b;
    }

    public void q(Object obj) {
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new kx6(this, obj, SystemClock.elapsedRealtime(), 5));
        }
    }

    @Override // defpackage.ve31
    public void r(elx0 elx0Var, boolean z, int i) {
        sf31 sf31Var = (sf31) this.b;
        elx0 elx0Var2 = (elx0) kotlin.collections.a.S(((qf31) this.c).E(), sf31Var.G);
        if (elx0Var2 == null) {
            return;
        }
        sf31Var.w.e("TariffSelector.Change", PerformanceAnalytics$Type.Animation, SystemClock.elapsedRealtime());
        sf31Var.I.h(elx0Var.d, elx0Var2.a, z);
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.controllers.IVerificationFlowController
    public void release() {
        IVerificationFlow iVerificationFlow = (IVerificationFlow) this.c;
        if (iVerificationFlow != null) {
            iVerificationFlow.release();
        }
        this.c = null;
    }

    public void s(String str, ContactType contactType) {
        TrustedContactsAnalytics$TrustedContactsContactType trustedContactsAnalytics$TrustedContactsContactType;
        o7r0 o7r0Var = (o7r0) this.c;
        int i = lg11.a[contactType.ordinal()];
        if (i == 1) {
            trustedContactsAnalytics$TrustedContactsContactType = TrustedContactsAnalytics$TrustedContactsContactType.Trusted;
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            trustedContactsAnalytics$TrustedContactsContactType = TrustedContactsAnalytics$TrustedContactsContactType.Trusting;
        }
        o7r0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("user_id", str);
        hashMap.put("contact_type", trustedContactsAnalytics$TrustedContactsContactType.getEventValue());
        o7r0Var.a.a("TrustedContacts.Delete.DeleteButtonTapped", hashMap, 1, new HashMap());
    }

    @Override // defpackage.j4u
    public void stopGuidance() {
        ((b) this.c).d();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public java.lang.Object t(defpackage.d0l0 r36, java.util.List r37, defpackage.dbl0 r38, java.util.List r39, java.lang.String r40, boolean r41, java.util.List r42, kotlin.coroutines.Continuation r43) {
        /*
            Method dump skipped, instructions count: 1240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a201.t(d0l0, java.util.List, dbl0, java.util.List, java.lang.String, boolean, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public String toString() {
        switch (this.a) {
            case 14:
                return g8e.p(((UrbanAdsError$ErrorType) this.b).getDescription(), Extension.COLON_SPACE, (String) this.c);
            default:
                return super.toString();
        }
    }

    @Override // defpackage.zs10
    public Object u(String str) {
        return ((sbx) this.b).b((v521) this.c, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void v(WalkingNavigationAnalytics$ExitOptionsTapType walkingNavigationAnalytics$ExitOptionsTapType) {
        b741 b741Var = (b741) this.b;
        w041 w041Var = (w041) this.c;
        String str = w041Var.a;
        WalkingNavigationAnalytics$WalkingNavigationGeneration walkingNavigationAnalytics$WalkingNavigationGeneration = null;
        if (w041Var.b != null) {
            Iterator<E> it = WalkingNavigationAnalytics$WalkingNavigationGeneration.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (jl40.l(((WalkingNavigationAnalytics$WalkingNavigationGeneration) next).getEventValue(), w041Var.b)) {
                    walkingNavigationAnalytics$WalkingNavigationGeneration = next;
                    break;
                }
            }
            walkingNavigationAnalytics$WalkingNavigationGeneration = walkingNavigationAnalytics$WalkingNavigationGeneration;
        }
        b741Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("tap_type", walkingNavigationAnalytics$ExitOptionsTapType.getEventValue());
        if (str != null) {
            hashMap.put("hub_session_id", str);
        }
        if (walkingNavigationAnalytics$WalkingNavigationGeneration != null) {
            hashMap.put("generation", walkingNavigationAnalytics$WalkingNavigationGeneration.getEventValue());
        }
        b741Var.a.a("WalkingNavigation.ExitOptions.Tapped", hashMap, 1, new HashMap());
    }

    public void w(do31 do31Var) {
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new t601(28, this, do31Var));
        }
    }

    public a201(wpy0 wpy0Var) {
        this.a = 19;
        this.b = wpy0Var;
    }

    public /* synthetic */ a201(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public a201(KSerializer kSerializer, sbx sbxVar) {
        this.a = 29;
        this.b = sbxVar;
        this.c = new v521(kSerializer);
    }

    public a201(on2 on2Var, p1v p1vVar) {
        this.a = 20;
        this.b = p1vVar;
        this.c = a.a(new lr40(on2Var, 21));
    }

    public a201(List list) {
        this.a = 15;
        this.b = list;
        this.c = new g001[list.size()];
    }

    public a201(b bVar) {
        this.a = 27;
        this.c = bVar;
        this.b = GuidanceOwnerId.WALKING_NAVIGATION;
    }

    public a201(Handler handler, co31 co31Var) {
        this.a = 23;
        if (co31Var != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.b = handler;
        this.c = co31Var;
    }

    public a201(exy0 exy0Var, View view) {
        this.a = 0;
        this.b = view;
    }
}
