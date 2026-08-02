package com.ybsdk.feature.card.internal.presentation.singlecard;

import android.net.Uri;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.CardMainScreenEvents$CardMainScreenCardDetailsClickAction;
import com.ybsdk.core.analytics.generated.delegates.CardMainScreenEvents$CardMainScreenCardDetailsClickProductId;
import com.ybsdk.core.analytics.generated.delegates.CardMainScreenEvents$CardMainScreenCardDetailsClickType;
import com.ybsdk.core.analytics.generated.delegates.CardMainScreenEvents$CardMainScreenCardDetailsCopyField;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.card.api.CardSecondFactorHelper$Request;
import com.ybsdk.feature.card.api.entities.YbCardStatusEntity;
import com.ybsdk.feature.card.internal.interactors.d;
import com.ybsdk.feature.card.internal.interactors.l;
import com.ybsdk.feature.card.internal.interactors.requisites.c;
import com.ybsdk.feature.card.internal.repositories.b;
import com.ybsdk.rconfig.configs.NonYbProductDetailsFlags;
import defpackage.aj8;
import defpackage.al8;
import defpackage.ayp0;
import defpackage.cdb1;
import defpackage.ds31;
import defpackage.dzh0;
import defpackage.e7r0;
import defpackage.en8;
import defpackage.g8e;
import defpackage.g9r0;
import defpackage.gao;
import defpackage.gas0;
import defpackage.ggs0;
import defpackage.hgs0;
import defpackage.if8;
import defpackage.jl40;
import defpackage.m04;
import defpackage.mf8;
import defpackage.ny61;
import defpackage.o8r0;
import defpackage.oe60;
import defpackage.pgs0;
import defpackage.pz40;
import defpackage.pzt0;
import defpackage.qgs0;
import defpackage.qn8;
import defpackage.qq7;
import defpackage.r8j0;
import defpackage.rgs0;
import defpackage.rx3;
import defpackage.sgs0;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.uc5;
import defpackage.vm7;
import defpackage.w511;
import defpackage.wls;
import defpackage.wm8;
import defpackage.x4c;
import defpackage.xxp0;
import defpackage.ykn0;
import defpackage.yxp0;
import defpackage.zxp0;
import defpackage.zy11;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class a extends uc5 {
    public final SingleCardScreenScreenParams B;
    public final vm7 C;
    public final l D;
    public final tfl0 E;
    public final qn8 F;
    public final com.ybsdk.feature.settings.internal.domain.card.a G;
    public final al8 H;
    public final AppAnalyticsReporter I;
    public final d J;
    public final vm7 K;
    public final m04 L;
    public final wm8 M;
    public final en8 N;
    public pzt0 O;

    public a(SingleCardScreenScreenParams singleCardScreenScreenParams, vm7 vm7Var, l lVar, tfl0 tfl0Var, qn8 qn8Var, com.ybsdk.feature.settings.internal.domain.card.a aVar, al8 al8Var, AppAnalyticsReporter appAnalyticsReporter, sgs0 sgs0Var, d dVar, vm7 vm7Var2, m04 m04Var, aj8 aj8Var, wm8 wm8Var) {
        super(new gas0(3, singleCardScreenScreenParams), new ykn0(13, sgs0Var));
        this.B = singleCardScreenScreenParams;
        this.C = vm7Var;
        this.D = lVar;
        this.E = tfl0Var;
        this.F = qn8Var;
        this.G = aVar;
        this.H = al8Var;
        this.I = appAnalyticsReporter;
        this.J = dVar;
        this.K = vm7Var2;
        this.L = m04Var;
        this.M = wm8Var;
        boolean a = com.ybsdk.feature.card.internal.interactors.requisites.a.a(((NonYbProductDetailsFlags) ((if8) wm8Var).a.d(oe60.a).getData()).getNonYbProductsEnabled() ? singleCardScreenScreenParams.getProductId() : null);
        b bVar = aj8Var.a;
        this.N = a ? new com.ybsdk.feature.card.internal.interactors.requisites.b(bVar) : new c(bVar);
        tje.N(ds31.a(this), null, null, new SingleCardViewModel$checkCardTokenization$1(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b0(a aVar, o8r0 o8r0Var, String str, ContinuationImpl continuationImpl) {
        SingleCardViewModel$switchToggle$1 singleCardViewModel$switchToggle$1;
        int i;
        Object a;
        o8r0 o8r0Var2;
        Throwable a2;
        r0 r0Var;
        Object value;
        rgs0 rgs0Var;
        r0 r0Var2;
        Object value2;
        aVar.getClass();
        if (continuationImpl instanceof SingleCardViewModel$switchToggle$1) {
            singleCardViewModel$switchToggle$1 = (SingleCardViewModel$switchToggle$1) continuationImpl;
            int i2 = singleCardViewModel$switchToggle$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                singleCardViewModel$switchToggle$1.label = i2 - Integer.MIN_VALUE;
                SingleCardViewModel$switchToggle$1 singleCardViewModel$switchToggle$12 = singleCardViewModel$switchToggle$1;
                Object obj = singleCardViewModel$switchToggle$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = singleCardViewModel$switchToggle$12.label;
                String str2 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    boolean z = !o8r0Var.g;
                    m04 m04Var = aVar.L;
                    String str3 = o8r0Var.a;
                    qq7 qq7Var = m04Var.a.l;
                    LinkedHashMap w = g8e.w(2, "key", str3);
                    w.put("is_toggled", Boolean.valueOf(z));
                    qq7Var.a.a("card.main_screen.toggled", w);
                    aVar.a0(new rx3(aVar, o8r0Var, z, 14));
                    com.ybsdk.feature.settings.internal.domain.card.a aVar2 = aVar.G;
                    singleCardViewModel$switchToggle$12.L$0 = o8r0Var;
                    singleCardViewModel$switchToggle$12.label = 1;
                    a = aVar2.a(z, o8r0Var, str, aVar, singleCardViewModel$switchToggle$12);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    o8r0Var2 = o8r0Var;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o8r0Var2 = (o8r0) singleCardViewModel$switchToggle$12.L$0;
                    kotlin.b.b(obj);
                    a = ((Result) obj).getValue();
                }
                if (!(a instanceof Result.Failure)) {
                    ayp0 ayp0Var = (ayp0) a;
                    if (ayp0Var instanceof zxp0) {
                        hgs0 e = cdb1.e((rgs0) aVar.X(), (List) ((zxp0) ayp0Var).a);
                        if (e != null) {
                            pz40 Y = aVar.Y();
                            do {
                                r0Var2 = (r0) Y;
                                value2 = r0Var2.getValue();
                            } while (!r0Var2.k(value2, rgs0.a((rgs0) value2, new r8j0(e, null, 14), false, null, false, null, new e7r0(str2, str2, 7), false, 894)));
                            aVar.f0(false);
                        }
                    } else if (ayp0Var instanceof xxp0) {
                        pz40 Y2 = aVar.Y();
                        do {
                            r0Var = (r0) Y2;
                            value = r0Var.getValue();
                            rgs0Var = (rgs0) value;
                        } while (!r0Var.k(value, rgs0.a(rgs0Var, null, false, null, false, null, e7r0.a(rgs0Var.f, o8r0Var2), false, 895)));
                        qn8 qn8Var = aVar.F;
                        if (o8r0Var2.c == null) {
                            Text.Empty empty = Text.Empty.INSTANCE;
                        }
                        aVar.E.h(((mf8) qn8Var).b(((xxp0) ayp0Var).a, CardSecondFactorHelper$Request.SETTINGS));
                    } else if (!(ayp0Var instanceof yxp0)) {
                        w511.b();
                        return null;
                    }
                }
                a2 = Result.a(a);
                if (a2 != null) {
                    gao.e(null, null, a2, 3);
                }
                return zy11.a;
            }
        }
        singleCardViewModel$switchToggle$1 = new SingleCardViewModel$switchToggle$1(aVar, continuationImpl);
        SingleCardViewModel$switchToggle$1 singleCardViewModel$switchToggle$122 = singleCardViewModel$switchToggle$1;
        Object obj2 = singleCardViewModel$switchToggle$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = singleCardViewModel$switchToggle$122.label;
        String str22 = null;
        if (i != 0) {
        }
        if (!(a instanceof Result.Failure)) {
        }
        a2 = Result.a(a);
        if (a2 != null) {
        }
        return zy11.a;
    }

    public static void o0(a aVar, String str, Integer num, wls wlsVar, int i) {
        if ((i & 2) != 0) {
            num = null;
        }
        aVar.n0(str, num, null, null, wlsVar);
    }

    @Override // defpackage.yr31
    public final void V() {
        this.L.a.l.a.a("card.main_screen.exit.click", null);
    }

    public final void c0(String str) {
        qq7 qq7Var = this.L.a.l;
        qq7Var.a.a("card.main_screen.button.show", g8e.w(1, "key", str));
    }

    public final void d0(String str, String str2) {
        String cardId;
        hgs0 b = ((rgs0) X()).b();
        if (b == null || (cardId = this.B.getCardId()) == null) {
            return;
        }
        boolean z = b.b.c == YbCardStatusEntity.FROZEN;
        if (str != null) {
            this.L.a.l.a.a("card.main_screen.button.click", g8e.w(1, "key", str));
        }
        tje.N(ds31.a(this), null, null, new SingleCardViewModel$freezeCard$2(str, this, z, cardId, str2, null), 3);
    }

    public final void e0() {
        r0 r0Var;
        Object value;
        String str;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
            str = null;
        } while (!r0Var.k(value, rgs0.a((rgs0) value, null, false, null, false, null, new e7r0(str, str, 7), false, 895)));
    }

    public final void f0(boolean z) {
        this.I.l.a.a("card.main_screen.initiated", null);
        tje.N(ds31.a(this), null, null, new SingleCardViewModel$loadSingleCardData$1(z, this, null), 3);
    }

    public final void g0() {
        String cardId = this.B.getCardId();
        this.L.k(((rgs0) X()).b(), CardMainScreenEvents$CardMainScreenCardDetailsCopyField.NUMBER);
        o0(this, cardId, Integer.valueOf(dzh0.ybsdk_card_card_payment_details_copying_failure), new SingleCardViewModel$onCopyCardNumberClick$1(this, null), 12);
    }

    public final void h0() {
        this.L.k(((rgs0) X()).b(), CardMainScreenEvents$CardMainScreenCardDetailsCopyField.CVV);
        o0(this, this.B.getCardId(), Integer.valueOf(dzh0.ybsdk_card_card_payment_details_copying_failure), new SingleCardViewModel$onCopyCvvClick$1(this, null), 12);
    }

    public final void i0() {
        qgs0 qgs0Var;
        hgs0 b = ((rgs0) X()).b();
        String str = (b == null || (qgs0Var = b.b) == null) ? null : qgs0Var.b;
        this.L.k(((rgs0) X()).b(), CardMainScreenEvents$CardMainScreenCardDetailsCopyField.DATE);
        if (str != null) {
            tje.N(ds31.a(this), null, null, new SingleCardViewModel$onCopyExpireDateClick$1(this, str, null), 3);
        } else {
            x4c.g("Can't copy expiration date for card", null, null, null, 14);
        }
    }

    public final boolean j0(Uri uri) {
        return ((com.ybsdk.di.modules.features.c) this.H).a(uri.toString());
    }

    public final void k0() {
        pgs0 pgs0Var;
        String str = null;
        this.L.a.l.a.a("card.main_screen.rename_card.click", null);
        hgs0 b = ((rgs0) X()).b();
        if (b != null && (pgs0Var = b.a) != null) {
            str = pgs0Var.i;
        }
        if (str != null) {
            ((com.ybsdk.di.modules.features.c) this.H).a(str);
        }
    }

    public final boolean l0(g9r0 g9r0Var) {
        List list;
        Object obj;
        hgs0 b = ((rgs0) X()).b();
        pzt0 pzt0Var = null;
        if (b != null && (list = b.e) != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (jl40.l(((o8r0) obj).a, g9r0Var.a)) {
                    break;
                }
            }
            o8r0 o8r0Var = (o8r0) obj;
            if (o8r0Var != null) {
                pzt0Var = tje.N(ds31.a(this), null, null, new SingleCardViewModel$onSettingSwitchToggle$itemEntity$2$1(this, o8r0Var, null), 3);
            }
        }
        return pzt0Var != null;
    }

    public final void m0() {
        CardMainScreenEvents$CardMainScreenCardDetailsClickProductId cardMainScreenEvents$CardMainScreenCardDetailsClickProductId;
        CardMainScreenEvents$CardMainScreenCardDetailsClickType cardMainScreenEvents$CardMainScreenCardDetailsClickType;
        r0 r0Var;
        Object value;
        hgs0 b = ((rgs0) X()).b();
        boolean z = ((rgs0) X()).d;
        m04 m04Var = this.L;
        if (b == null) {
            m04Var.getClass();
        } else {
            qq7 qq7Var = m04Var.a.l;
            int i = ggs0.b[b.g.ordinal()];
            if (i == 1) {
                cardMainScreenEvents$CardMainScreenCardDetailsClickProductId = CardMainScreenEvents$CardMainScreenCardDetailsClickProductId.WALLET;
            } else if (i == 2) {
                cardMainScreenEvents$CardMainScreenCardDetailsClickProductId = CardMainScreenEvents$CardMainScreenCardDetailsClickProductId.PRO;
            } else if (i == 3) {
                cardMainScreenEvents$CardMainScreenCardDetailsClickProductId = CardMainScreenEvents$CardMainScreenCardDetailsClickProductId.CREDLIM;
            } else if (i == 4) {
                cardMainScreenEvents$CardMainScreenCardDetailsClickProductId = CardMainScreenEvents$CardMainScreenCardDetailsClickProductId.UNKNOWN;
            } else {
                if (i != 5) {
                    w511.b();
                    return;
                }
                cardMainScreenEvents$CardMainScreenCardDetailsClickProductId = CardMainScreenEvents$CardMainScreenCardDetailsClickProductId.SPLIT;
            }
            int i2 = ggs0.a[b.h.ordinal()];
            if (i2 == 1) {
                cardMainScreenEvents$CardMainScreenCardDetailsClickType = CardMainScreenEvents$CardMainScreenCardDetailsClickType.CARD_DIGITAL;
            } else {
                if (i2 != 2) {
                    w511.b();
                    return;
                }
                cardMainScreenEvents$CardMainScreenCardDetailsClickType = CardMainScreenEvents$CardMainScreenCardDetailsClickType.CARD_PLASTIC;
            }
            CardMainScreenEvents$CardMainScreenCardDetailsClickAction cardMainScreenEvents$CardMainScreenCardDetailsClickAction = !z ? CardMainScreenEvents$CardMainScreenCardDetailsClickAction.UNWRAPP : CardMainScreenEvents$CardMainScreenCardDetailsClickAction.HIDE;
            LinkedHashMap linkedHashMap = new LinkedHashMap(3);
            linkedHashMap.put("product_id", cardMainScreenEvents$CardMainScreenCardDetailsClickProductId.getOriginalValue());
            linkedHashMap.put("type", cardMainScreenEvents$CardMainScreenCardDetailsClickType.getOriginalValue());
            linkedHashMap.put("action", cardMainScreenEvents$CardMainScreenCardDetailsClickAction.getOriginalValue());
            qq7Var.a.a("card.main_screen.card_details.click", linkedHashMap);
        }
        if (!((rgs0) X()).d) {
            o0(this, this.B.getCardId(), null, new SingleCardViewModel$onShowRequisitesClick$2(this, null), 14);
            return;
        }
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, rgs0.a((rgs0) value, null, false, null, false, null, null, false, 991)));
    }

    public final void n0(String str, Integer num, String str2, String str3, wls wlsVar) {
        if (str == null) {
            return;
        }
        pzt0 pzt0Var = this.O;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.O = tje.N(ds31.a(this), null, null, new SingleCardViewModel$requestRequisitesIfRequired$2(this, wlsVar, str, str2, str3, num, null), 3);
    }

    public final void p0(String str, boolean z) {
        qq7 qq7Var = this.L.a.l;
        LinkedHashMap w = g8e.w(2, "key", str);
        w.put("is_toggled", Boolean.valueOf(z));
        qq7Var.a.a("card.main_screen.toggle.show", w);
    }
}
