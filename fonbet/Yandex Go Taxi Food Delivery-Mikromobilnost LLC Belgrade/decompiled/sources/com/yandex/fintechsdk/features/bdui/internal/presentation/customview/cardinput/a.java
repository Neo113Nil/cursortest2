package com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput;

import com.yandex.fintechsdk.entities.theme.Theme;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.analytics.DynamicBinInfoAnalyticsResetReason;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.analytics.DynamicBinInfoAnalyticsStaticDataReason;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.analytics.DynamicBinInfoEventName;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.contract.CardNetwork;
import defpackage.a5n;
import defpackage.b131;
import defpackage.b5n;
import defpackage.bau0;
import defpackage.bei;
import defpackage.bvf0;
import defpackage.cvu0;
import defpackage.dau0;
import defpackage.dk8;
import defpackage.eh8;
import defpackage.et5;
import defpackage.f5n;
import defpackage.fk8;
import defpackage.fv50;
import defpackage.gso;
import defpackage.gw00;
import defpackage.hau0;
import defpackage.hh8;
import defpackage.hk8;
import defpackage.ig8;
import defpackage.jg8;
import defpackage.jh8;
import defpackage.jk8;
import defpackage.jyq;
import defpackage.klk;
import defpackage.kxq;
import defpackage.kzo;
import defpackage.li3;
import defpackage.lk8;
import defpackage.mof;
import defpackage.nk8;
import defpackage.ny61;
import defpackage.ot5;
import defpackage.oz21;
import defpackage.qfb1;
import defpackage.qk8;
import defpackage.qxq;
import defpackage.sg8;
import defpackage.uro;
import defpackage.v6q0;
import defpackage.vxh0;
import defpackage.x031;
import defpackage.x9u0;
import defpackage.xb8;
import defpackage.xj8;
import defpackage.yg5;
import defpackage.ynf;
import defpackage.yro;
import defpackage.yz91;
import defpackage.z031;
import defpackage.z22;
import defpackage.z6q0;
import defpackage.z9u0;
import defpackage.zh5;
import defpackage.zy11;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

/* loaded from: classes12.dex */
public final class a implements nk8, uro, ynf {
    public final z22 a;
    public final xb8 b;
    public final dk8 c;
    public final hk8 d;
    public final lk8 e;
    public final ig8 f;
    public final yro g;
    public final fv50 h;
    public final z6q0 i;
    public final jg8 j;
    public final jg8 k;
    public final zh5 l;
    public final oz21 m;
    public final r0 n;
    public final r0 o;
    public klk p;
    public yg5 q;
    public et5 r;
    public ot5 s;
    public String t;
    public final Map u;
    public final boolean v;
    public final String w;
    public final com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.dynamicbininfo.a x;
    public final kzo y;
    public final long z;

    public a(sg8 sg8Var, z22 z22Var, xb8 xb8Var, hk8 hk8Var, lk8 lk8Var, ig8 ig8Var, fv50 fv50Var, z6q0 z6q0Var, jg8 jg8Var, jg8 jg8Var2, zh5 zh5Var) {
        Map f;
        Map map;
        dk8 dk8Var = new dk8();
        yro yroVar = new yro();
        oz21 oz21Var = new oz21(lk8Var, 62);
        this.a = z22Var;
        this.b = xb8Var;
        this.c = dk8Var;
        this.d = hk8Var;
        this.e = lk8Var;
        this.f = ig8Var;
        this.g = yroVar;
        this.h = fv50Var;
        this.i = z6q0Var;
        this.j = jg8Var;
        this.k = jg8Var2;
        this.l = zh5Var;
        this.m = oz21Var;
        int i = 0;
        r0 c = bvf0.c(sg8Var == null ? new sg8(new qk8("", false, new x031(vxh0.finsdk_wrong_card_number)), new mof("", false, new x031(vxh0.finsdk_wrong_cvv)), new gso("", bei.E, false, new x031(vxh0.finsdk_wrong_expiration_date)), 0, null, null, null, vxh0.finsdk_cvv, null, dau0.a, null, false, false) : sg8Var);
        this.n = c;
        this.o = c;
        f5n f5nVar = ig8Var.e;
        if (f5nVar == null || (map = f5nVar.b) == null) {
            f = b.f();
        } else {
            f = new LinkedHashMap(gw00.d(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                f.put(((String) entry.getKey()).toLowerCase(Locale.ROOT), entry.getValue());
            }
        }
        this.u = f;
        a5n a5nVar = new a5n();
        Boolean bool = this.f.b;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        this.v = booleanValue;
        this.w = this.f.a.a;
        boolean z = booleanValue;
        this.x = new com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.dynamicbininfo.a(this.a, a5nVar, new CardInputViewController$binInfoManager$1(this, null), z, new eh8(this, 0), new hh8(i, this), new eh8(this, 1), new jh8(this, 0), new jh8(this, 1));
        this.y = new kzo(this.a, this.e, a5nVar, z, 6);
        f5n f5nVar2 = this.f.e;
        this.z = f5nVar2 != null ? f5nVar2.a : 0L;
    }

    public static String a(String str) {
        return cvu0.v(str, " ", "", false);
    }

    public static void i(a aVar, CardNetwork cardNetwork, int i) {
        Object value;
        int i2;
        String str;
        Object value2;
        CardNetwork cardNetwork2 = (i & 1) != 0 ? null : cardNetwork;
        boolean z = aVar.v;
        r0 r0Var = aVar.n;
        String str2 = ((sg8) r0Var.getValue()).a.a;
        if (a(str2).length() == 0) {
            do {
                value2 = r0Var.getValue();
            } while (!r0Var.k(value2, sg8.a((sg8) value2, null, null, null, 0, null, null, null, vxh0.finsdk_cvv, null, null, null, false, false, 4615)));
            return;
        }
        Theme g = aVar.g();
        fv50 fv50Var = aVar.h;
        xj8 a = !z ? cardNetwork2 != null ? fv50Var.a(cardNetwork2, g) : fv50Var.a(fv50Var.b.a(str2).a, g) : (cardNetwork2 == null || cardNetwork2 == CardNetwork.UNKNOWN) ? new xj8(0, null) : fv50Var.a(cardNetwork2, g);
        ot5 ot5Var = aVar.s;
        Pair pair = (!z || a.b == null || ot5Var == null) ? new Pair(null, null) : new Pair(aVar.a, new b5n(ot5Var.b));
        z22 z22Var = (z22) pair.getFirst();
        b5n b5nVar = (b5n) pair.getSecond();
        z6q0 z6q0Var = aVar.i;
        v6q0 a2 = cardNetwork2 != null ? z6q0Var.a(cardNetwork2) : z6q0Var.a(z6q0Var.a.a(str2).a);
        boolean h = aVar.h(str2, null, cardNetwork2);
        do {
            value = r0Var.getValue();
            i2 = a.a;
            str = a.b;
        } while (!r0Var.k(value, sg8.a((sg8) value, null, null, null, i2, str, z22Var, b5nVar, a2.a, a2.b, null, str, h, false, 4615)));
    }

    public static b131 j(int i, boolean z) {
        return z ? z031.a : new x031(i);
    }

    public final void b() {
        r0 r0Var;
        Object value;
        do {
            r0Var = this.n;
            value = r0Var.getValue();
        } while (!r0Var.k(value, sg8.a((sg8) value, null, null, null, 0, null, null, null, 0, null, bau0.a, null, false, false, 3583)));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01f1 A[LOOP:0: B:29:0x00cc->B:40:0x01f1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01d8 A[EDGE_INSN: B:41:0x01d8->B:42:0x01d8 BREAK  A[LOOP:0: B:29:0x00cc->B:40:0x01f1], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(String str) {
        Object value;
        int i;
        int i2;
        boolean z;
        Object value2;
        sg8 sg8Var;
        xj8 a;
        v6q0 a2;
        boolean h;
        String str2;
        boolean z2;
        String a3 = a(str);
        int length = a3.length();
        r0 r0Var = this.n;
        oz21 oz21Var = this.m;
        if (length <= 0) {
            this.r = null;
            this.s = null;
            boolean a4 = oz21Var.a(str);
            do {
                value = r0Var.getValue();
            } while (!r0Var.k(value, sg8.a((sg8) value, new qk8(str, oz21Var.b(str), j(vxh0.finsdk_wrong_card_number, a4)), null, null, 0, null, null, null, vxh0.finsdk_cvv, null, null, null, false, false, 518)));
            return;
        }
        int length2 = a(((sg8) r0Var.getValue()).a.a).length();
        boolean a5 = oz21Var.a(str);
        com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.dynamicbininfo.a aVar = this.x;
        boolean z3 = this.v;
        if (z3 && a3.length() < 3) {
            aVar.i(a3.length(), a3.length() == 0 ? DynamicBinInfoAnalyticsResetReason.CARD_CLEARED : DynamicBinInfoAnalyticsResetReason.PREFIX_CHANGED);
        }
        if (!z3) {
            if (a3.length() == 0) {
                this.t = null;
            } else if (!a3.equals(this.t)) {
                CardNetwork cardNetwork = this.e.a(a3).a;
                int length3 = a3.length();
                kzo kzoVar = this.y;
                if (kzoVar.b) {
                    z22 z22Var = (z22) kzoVar.c;
                    String stringCode = cardNetwork.getStringCode();
                    DynamicBinInfoAnalyticsStaticDataReason dynamicBinInfoAnalyticsStaticDataReason = DynamicBinInfoAnalyticsStaticDataReason.FEATURE_DISABLED;
                    String a6 = DynamicBinInfoEventName.STATIC_DATA_APPLIED.a();
                    Pair pair = new Pair("payment_system", stringCode);
                    Pair pair2 = new Pair("card_number_length", String.valueOf(length3));
                    String value3 = dynamicBinInfoAnalyticsStaticDataReason.getValue();
                    i = length2;
                    yz91.c(z22Var, new li3(14, a6, b.i(pair, pair2, new Pair(CRLReasonCodeExtension.REASON, value3))), true);
                } else {
                    i = length2;
                }
                this.t = a3;
                int length4 = a3.length();
                i2 = 0;
                z = length4 >= 3 || length4 == 3 || length4 == 8;
                while (true) {
                    value2 = r0Var.getValue();
                    sg8Var = (sg8) value2;
                    if (z) {
                        a = new xj8(sg8Var.d, sg8Var.e);
                    } else if (a3.length() == 0) {
                        a = new xj8(i2, null);
                    } else if (z3 && a3.length() < 3) {
                        a = new xj8(i2, null);
                    } else if (z3) {
                        a = new xj8(sg8Var.d, sg8Var.e);
                    } else {
                        Theme g = g();
                        fv50 fv50Var = this.h;
                        a = fv50Var.a(fv50Var.b.a(str).a, g);
                    }
                    if (a3.length() != 0) {
                        a2 = new v6q0(vxh0.finsdk_cvv, null);
                    } else if (z3 && a3.length() < 3) {
                        a2 = new v6q0(vxh0.finsdk_cvv, null);
                    } else if (z3) {
                        a2 = new v6q0(sg8Var.h, sg8Var.i);
                    } else {
                        z6q0 z6q0Var = this.i;
                        a2 = z6q0Var.a(z6q0Var.a.a(str).a);
                    }
                    h = h(a3, this.r, null);
                    b131 j = j(vxh0.finsdk_wrong_card_number, a5);
                    boolean b = oz21Var.b(str);
                    hau0 hau0Var = sg8Var.j;
                    str2 = a3;
                    z2 = j instanceof z031;
                    boolean z4 = z;
                    z22 z22Var2 = this.a;
                    if (!z2) {
                        ((com.yandex.fintechsdk.core.analytics.impl.internal.a) z22Var2).a(new kxq("card_number", qfb1.b(hau0Var)));
                    } else if ((j instanceof x031) && b) {
                        ((com.yandex.fintechsdk.core.analytics.impl.internal.a) z22Var2).a(new jyq("card_number", "Invalid card number", qfb1.b(hau0Var)));
                    }
                    if (!r0Var.k(value2, sg8.a(sg8Var, new qk8(str, oz21Var.b(str), j(vxh0.finsdk_wrong_card_number, a5)), null, null, a.a, a.b, null, null, a2.a, a2.b, null, null, h, false, 5734))) {
                        break;
                    }
                    a3 = str2;
                    z = z4;
                    i2 = 0;
                }
                if (z3 || str2.length() < 3) {
                }
                aVar.g(str, str2.length() - i > 1);
                return;
            }
        }
        i = length2;
        int length42 = a3.length();
        i2 = 0;
        if (length42 >= 3) {
        }
        while (true) {
            value2 = r0Var.getValue();
            sg8Var = (sg8) value2;
            if (z) {
            }
            if (a3.length() != 0) {
            }
            h = h(a3, this.r, null);
            b131 j2 = j(vxh0.finsdk_wrong_card_number, a5);
            boolean b2 = oz21Var.b(str);
            hau0 hau0Var2 = sg8Var.j;
            str2 = a3;
            z2 = j2 instanceof z031;
            boolean z42 = z;
            z22 z22Var22 = this.a;
            if (!z2) {
            }
            if (!r0Var.k(value2, sg8.a(sg8Var, new qk8(str, oz21Var.b(str), j(vxh0.finsdk_wrong_card_number, a5)), null, null, a.a, a.b, null, null, a2.a, a2.b, null, null, h, false, 5734))) {
            }
            a3 = str2;
            z = z42;
            i2 = 0;
        }
        if (z3) {
        }
    }

    public final void d() {
        r0 r0Var;
        Object value;
        sg8 sg8Var;
        dau0 dau0Var;
        do {
            r0Var = this.n;
            value = r0Var.getValue();
            sg8Var = (sg8) value;
            hau0 hau0Var = sg8Var.j;
            dau0Var = dau0.a;
            if (!hau0Var.equals(dau0Var)) {
                ((com.yandex.fintechsdk.core.analytics.impl.internal.a) this.a).a(new qxq("card_number", qfb1.b(dau0Var)));
            }
        } while (!r0Var.k(value, sg8.a(sg8Var, null, null, null, 0, null, null, null, 0, null, dau0Var, null, false, false, 7679)));
    }

    public final void e() {
        r0 r0Var;
        Object value;
        sg8 sg8Var;
        hau0 x9u0Var;
        do {
            r0Var = this.n;
            value = r0Var.getValue();
            sg8Var = (sg8) value;
            x9u0Var = sg8Var.l ? new x9u0(false) : z9u0.a;
            ((com.yandex.fintechsdk.core.analytics.impl.internal.a) this.a).a(new qxq("cvv", qfb1.b(x9u0Var)));
        } while (!r0Var.k(value, sg8.a(sg8Var, null, null, null, 0, null, null, null, 0, null, x9u0Var, null, false, false, 7679)));
    }

    public final void f() {
        r0 r0Var;
        Object value;
        sg8 sg8Var;
        bau0 bau0Var;
        if (((Boolean) this.k.invoke()).booleanValue()) {
            b();
            return;
        }
        if (this.v && this.z > 0 && this.x.f()) {
            this.j.invoke();
            return;
        }
        do {
            r0Var = this.n;
            value = r0Var.getValue();
            sg8Var = (sg8) value;
            hau0 hau0Var = sg8Var.j;
            bau0Var = bau0.a;
            if (!hau0Var.equals(bau0Var)) {
                ((com.yandex.fintechsdk.core.analytics.impl.internal.a) this.a).a(new qxq("expiration_date", qfb1.b(bau0Var)));
            }
        } while (!r0Var.k(value, sg8.a(sg8Var, null, null, null, 0, null, null, null, 0, null, bau0Var, null, false, false, 7679)));
    }

    public final Theme g() {
        String str;
        yg5 yg5Var = this.q;
        Object obj = null;
        if (yg5Var != null) {
            String str2 = this.f.d;
            if (str2 == null) {
                str2 = "";
            }
            str = yg5Var.resolveString(str2);
        } else {
            str = null;
        }
        Iterator<E> it = Theme.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (cvu0.t(((Theme) next).getKey(), str, true)) {
                obj = next;
                break;
            }
        }
        Theme theme = (Theme) obj;
        return theme == null ? Theme.DAY : theme;
    }

    public final boolean h(String str, et5 et5Var, CardNetwork cardNetwork) {
        Pair pair;
        if (et5Var == null || !et5Var.b) {
            if (cardNetwork != null) {
                hk8 hk8Var = this.d;
                fk8 fk8Var = (fk8) hk8Var.b.get(cardNetwork);
                if (fk8Var == null) {
                    fk8Var = hk8Var.a;
                }
                pair = new Pair(cardNetwork, fk8Var);
            } else {
                jk8 a = this.e.a(str);
                pair = new Pair(a.a, a.b);
            }
            if (((fk8) pair.getSecond()).c != 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(ContinuationImpl continuationImpl) {
        CardInputViewController$waitForBinInfoIfNeeded$1 cardInputViewController$waitForBinInfoIfNeeded$1;
        Object obj;
        int i;
        Object value;
        if (continuationImpl instanceof CardInputViewController$waitForBinInfoIfNeeded$1) {
            cardInputViewController$waitForBinInfoIfNeeded$1 = (CardInputViewController$waitForBinInfoIfNeeded$1) continuationImpl;
            int i2 = cardInputViewController$waitForBinInfoIfNeeded$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cardInputViewController$waitForBinInfoIfNeeded$1.label = i2 - Integer.MIN_VALUE;
                obj = cardInputViewController$waitForBinInfoIfNeeded$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cardInputViewController$waitForBinInfoIfNeeded$1.label;
                zy11 zy11Var = zy11.a;
                r0 r0Var = this.n;
                com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.dynamicbininfo.a aVar = this.x;
                if (i != 0) {
                    kotlin.b.b(obj);
                    boolean f = aVar.f();
                    if (this.v) {
                        long j = this.z;
                        if (j > 0 && f) {
                            do {
                                value = r0Var.getValue();
                            } while (!r0Var.k(value, sg8.a((sg8) value, null, null, null, 0, null, null, null, 0, null, null, null, false, true, 4095)));
                            CardInputViewController$waitForBinInfoIfNeeded$finished$1 cardInputViewController$waitForBinInfoIfNeeded$finished$1 = new CardInputViewController$waitForBinInfoIfNeeded$finished$1(this, null);
                            cardInputViewController$waitForBinInfoIfNeeded$1.label = 1;
                            obj = kotlinx.coroutines.a.w(j, cardInputViewController$waitForBinInfoIfNeeded$finished$1, cardInputViewController$waitForBinInfoIfNeeded$1);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                    b();
                    return zy11Var;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                if (((sg8) obj) == null) {
                    aVar.i(a(((sg8) r0Var.getValue()).a.a).length(), DynamicBinInfoAnalyticsResetReason.TIMEOUT_WAIT_FOR_BIN_INFO);
                    i(this, CardNetwork.UNKNOWN, 2);
                }
                b();
                return zy11Var;
            }
        }
        cardInputViewController$waitForBinInfoIfNeeded$1 = new CardInputViewController$waitForBinInfoIfNeeded$1(this, continuationImpl);
        obj = cardInputViewController$waitForBinInfoIfNeeded$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cardInputViewController$waitForBinInfoIfNeeded$1.label;
        zy11 zy11Var2 = zy11.a;
        r0 r0Var2 = this.n;
        com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.dynamicbininfo.a aVar2 = this.x;
        if (i != 0) {
        }
        if (((sg8) obj) == null) {
        }
        b();
        return zy11Var2;
    }
}
