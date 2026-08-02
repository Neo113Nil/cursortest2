package com.ybsdk.feature.partnerselection.internal.screens.partners.presentation;

import com.yandex.passport.sloth.ui.dependencies.m;
import com.ybsdk.core.common.domain.entities.ActionButtonEntity;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.transfer.utils.TransferScenario;
import com.ybsdk.core.utils.dto.common.FailDataException;
import com.ybsdk.di.modules.features.l;
import com.ybsdk.feature.partnerselection.api.PartnerSelectionDeeplink;
import com.ybsdk.feature.partnerselection.api.PartnerSelectionFeature$Companion$Entry;
import com.ybsdk.feature.partnerselection.internal.screens.partners.presentation.PartnersFragment;
import defpackage.aj90;
import defpackage.ak80;
import defpackage.bj90;
import defpackage.br51;
import defpackage.di8;
import defpackage.dqg;
import defpackage.ds31;
import defpackage.fh90;
import defpackage.fj90;
import defpackage.g680;
import defpackage.g8e;
import defpackage.gi90;
import defpackage.gj90;
import defpackage.h791;
import defpackage.hj90;
import defpackage.ii90;
import defpackage.j3g;
import defpackage.j3h;
import defpackage.k5c;
import defpackage.kj90;
import defpackage.l0p;
import defpackage.l180;
import defpackage.mi90;
import defpackage.mj90;
import defpackage.n3w;
import defpackage.ny61;
import defpackage.pi90;
import defpackage.pz40;
import defpackage.pzt0;
import defpackage.qi90;
import defpackage.r8j0;
import defpackage.s8j0;
import defpackage.si90;
import defpackage.t8j0;
import defpackage.tfl0;
import defpackage.ti90;
import defpackage.tje;
import defpackage.tv3;
import defpackage.u8j0;
import defpackage.uc5;
import defpackage.us3;
import defpackage.uty;
import defpackage.w511;
import defpackage.xvf0;
import defpackage.zh90;
import defpackage.zka1;
import defpackage.zl50;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class c extends uc5 implements aj90 {
    public final us3 B;
    public final PartnersFragment.Arguments C;
    public final ii90 D;
    public final j3h E;
    public final zh90 F;
    public pzt0 G;
    public final String H;
    public final com.ybsdk.feature.partnerselection.internal.screens.partners.domain.a I;

    public c(fh90 fh90Var, us3 us3Var, a aVar, PartnersFragment.Arguments arguments, ii90 ii90Var, j3h j3hVar, zh90 zh90Var) {
        super(new ak80(10, arguments), aVar);
        this.B = us3Var;
        this.C = arguments;
        this.D = ii90Var;
        this.E = j3hVar;
        this.F = zh90Var;
        String transferSessionId = arguments.getTransferSessionId();
        this.H = transferSessionId;
        String agreementId = arguments.getAgreementId();
        MoneyEntity money = arguments.getMoney();
        String comment = arguments.getComment();
        k5c a = ds31.a(this);
        TransferScenario transferScenario = arguments.getTransferScenario();
        boolean skipPartnerCheck = arguments.getSkipPartnerCheck();
        PartnersViewModel$partnerCheckInteractor$1 partnersViewModel$partnerCheckInteractor$1 = new PartnersViewModel$partnerCheckInteractor$1(1, this, c.class, "onSuccessPartnerCheck", "onSuccessPartnerCheck(Lcom/ybsdk/feature/partnerselection/api/SelectedPartner;)V", 0);
        PartnerSelectionFeature$Companion$Entry entry = arguments.getEntry();
        String destinationCountry = arguments.getDestinationCountry();
        gj90 gj90Var = new gj90(0, this);
        m mVar = fh90Var.a;
        this.I = new com.ybsdk.feature.partnerselection.internal.screens.partners.domain.a((com.ybsdk.feature.partnerselection.internal.data.a) ((l180) mVar.a).get(), (com.ybsdk.feature.partnerselection.internal.data.b) ((g680) mVar.b).get(), (gi90) ((n3w) mVar.c).a, (l) ((j3g) mVar.d).get(), (j3h) ((j3g) mVar.e).get(), (zh90) ((j3g) mVar.f).get(), (mi90) ((xvf0) mVar.g).get(), (tfl0) ((j3g) mVar.h).get(), (com.ybsdk.utils.poller.b) ((j3g) mVar.i).get(), (tv3) ((j3g) mVar.j).get(), agreementId, money, comment, this, this, a, transferSessionId, transferScenario, destinationCountry, skipPartnerCheck, partnersViewModel$partnerCheckInteractor$1, gj90Var, entry);
        c0();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b0(c cVar, String str, ContinuationImpl continuationImpl) {
        PartnersViewModel$getAllPartners$1 partnersViewModel$getAllPartners$1;
        int i;
        Object g;
        Throwable a;
        r0 r0Var;
        Object value;
        PartnersFragment.Arguments arguments = cVar.C;
        if (continuationImpl instanceof PartnersViewModel$getAllPartners$1) {
            partnersViewModel$getAllPartners$1 = (PartnersViewModel$getAllPartners$1) continuationImpl;
            int i2 = partnersViewModel$getAllPartners$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                partnersViewModel$getAllPartners$1.label = i2 - Integer.MIN_VALUE;
                PartnersViewModel$getAllPartners$1 partnersViewModel$getAllPartners$12 = partnersViewModel$getAllPartners$1;
                Object obj = partnersViewModel$getAllPartners$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = partnersViewModel$getAllPartners$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.ybsdk.feature.partnerselection.internal.screens.partners.domain.a aVar = cVar.I;
                    String receiverPhone = arguments.getReceiverPhone();
                    String transferId = arguments.getTransferId();
                    String transferType = arguments.getTransferType();
                    String destinationCountry = arguments.getDestinationCountry();
                    partnersViewModel$getAllPartners$12.label = 1;
                    g = aVar.g(receiverPhone, transferId, transferType, str, destinationCountry, partnersViewModel$getAllPartners$12);
                    if (g == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    g = ((Result) obj).getValue();
                }
                if (!(g instanceof Result.Failure)) {
                    cVar.a0(new zl50(28, (dqg) g, cVar));
                }
                a = Result.a(g);
                if (a != null) {
                    cVar.B.g(a.getMessage(), cVar.H, arguments.getTransferScenario());
                    pz40 Y = cVar.Y();
                    do {
                        r0Var = (r0) Y;
                        value = r0Var.getValue();
                    } while (!r0Var.k(value, bj90.a((bj90) value, null, new s8j0(a), 11)));
                }
                return g;
            }
        }
        partnersViewModel$getAllPartners$1 = new PartnersViewModel$getAllPartners$1(cVar, continuationImpl);
        PartnersViewModel$getAllPartners$1 partnersViewModel$getAllPartners$122 = partnersViewModel$getAllPartners$1;
        Object obj2 = partnersViewModel$getAllPartners$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = partnersViewModel$getAllPartners$122.label;
        if (i != 0) {
        }
        if (!(g instanceof Result.Failure)) {
        }
        a = Result.a(g);
        if (a != null) {
        }
        return g;
    }

    @Override // defpackage.aj90
    public final void N(u8j0 u8j0Var) {
        r0 r0Var;
        Object value;
        bj90 bj90Var;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
            bj90Var = (bj90) value;
        } while (!r0Var.k(value, bj90.a(bj90Var, null, zka1.d(bj90Var.c, new di8((r8j0) u8j0Var, 1)), 11)));
    }

    public final void c0() {
        pzt0 pzt0Var = this.G;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        Z(kj90.a);
        this.G = tje.N(ds31.a(this), null, null, new PartnersViewModel$loadPartners$1(this, null), 3);
    }

    public final boolean d0() {
        if (((bj90) X()).a == null) {
            return false;
        }
        g0();
        return true;
    }

    public final void e0() {
        String supportUrl;
        u8j0 u8j0Var = ((bj90) X()).c;
        s8j0 s8j0Var = u8j0Var instanceof s8j0 ? (s8j0) u8j0Var : null;
        Throwable th = s8j0Var != null ? s8j0Var.a : null;
        FailDataException failDataException = th instanceof FailDataException ? (FailDataException) th : null;
        if (failDataException == null || (supportUrl = failDataException.getSupportUrl()) == null) {
            return;
        }
        qi90 qi90Var = (qi90) this.D;
        h791.f(qi90Var.a, supportUrl, com.ybsdk.feature.webview.api.a.b(qi90Var.b, supportUrl, null, null, 6));
    }

    public final void f0(String str) {
        r0 r0Var;
        Object value;
        bj90 bj90Var;
        u8j0 t8j0Var;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
            bj90Var = (bj90) value;
            u8j0 u8j0Var = bj90Var.c;
            if (u8j0Var instanceof r8j0) {
                r8j0 r8j0Var = (r8j0) u8j0Var;
                t8j0Var = new r8j0(fj90.a((fj90) r8j0Var.a, null, str, 3), r8j0Var.b, r8j0Var.c, r8j0Var.d);
            } else if (u8j0Var instanceof s8j0) {
                t8j0Var = new s8j0(((s8j0) u8j0Var).a);
            } else {
                if (!(u8j0Var instanceof t8j0)) {
                    w511.b();
                    return;
                }
                t8j0Var = new t8j0();
            }
        } while (!r0Var.k(value, bj90.a(bj90Var, null, t8j0Var, 11)));
    }

    public final void g0() {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, bj90.a((bj90) value, null, null, 14)));
        Z(kj90.a);
    }

    public final void h0() {
        ActionButtonEntity actionButtonEntity;
        String action;
        br51 br51Var = ((bj90) X()).a;
        if (br51Var == null || (actionButtonEntity = br51Var.d) == null || (action = actionButtonEntity.getAction()) == null || h791.e(this.E, action, false, null, 14) == null) {
            g0();
        }
    }

    public final void i0() {
        ActionButtonEntity actionButtonEntity;
        String action;
        br51 br51Var = ((bj90) X()).a;
        if (br51Var == null || (actionButtonEntity = br51Var.e) == null || (action = actionButtonEntity.getAction()) == null || h791.e(this.E, action, false, null, 14) == null) {
            g0();
        }
    }

    public final void j0() {
        u8j0 u8j0Var = ((bj90) X()).c;
        if ((u8j0Var instanceof s8j0) || (u8j0Var instanceof t8j0)) {
            Z(hj90.a);
        } else if (u8j0Var instanceof r8j0) {
            Z(kj90.a);
        } else {
            w511.b();
        }
    }

    public final void k0(uty utyVar, int i) {
        String transferId;
        si90 si90Var = utyVar.a;
        PartnersFragment.Arguments arguments = this.C;
        int i2 = mj90.a[arguments.getEntry().ordinal()];
        us3 us3Var = this.B;
        if (i2 == 1) {
            us3Var.d(i, si90Var.a.a, this.H, arguments.getTransferScenario());
        } else {
            if (i2 != 2) {
                w511.b();
                return;
            }
            String str = si90Var.a.d;
            PartnerSelectionDeeplink a = str != null ? ((pi90) this.F).a(str) : null;
            PartnerSelectionDeeplink.SelectPartner selectPartner = a instanceof PartnerSelectionDeeplink.SelectPartner ? (PartnerSelectionDeeplink.SelectPartner) a : null;
            String partnerId = selectPartner != null ? selectPartner.getPartnerId() : null;
            l0p l0pVar = us3Var.a.y;
            if (partnerId == null) {
                partnerId = "unknown";
            }
            l0pVar.a.a("external_member.selection.member_click", g8e.w(1, "member_id", partnerId));
        }
        ti90 ti90Var = si90Var.a;
        fj90 fj90Var = (fj90) ((bj90) X()).c.a();
        if (fj90Var == null || (transferId = fj90Var.b) == null) {
            transferId = arguments.getTransferId();
        }
        this.I.e(ti90Var, arguments.getReceiverPhone(), transferId, arguments.getTransferType(), false);
    }

    @Override // defpackage.aj90
    public final u8j0 l() {
        u8j0 u8j0Var = ((bj90) X()).c;
        if (u8j0Var instanceof r8j0) {
            r8j0 r8j0Var = (r8j0) u8j0Var;
            return new r8j0(((fj90) r8j0Var.a).a, r8j0Var.b, r8j0Var.c, r8j0Var.d);
        }
        if (u8j0Var instanceof s8j0) {
            return new s8j0(((s8j0) u8j0Var).a);
        }
        if (u8j0Var instanceof t8j0) {
            return new t8j0();
        }
        w511.b();
        return null;
    }

    public final void l0() {
        c0();
    }
}
