package com.yandex.go.taxi.order.models.api.request;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jsq0;
import defpackage.k4o;
import defpackage.ksq0;
import defpackage.nnm;
import defpackage.qje;
import defpackage.s780;
import defpackage.scc;
import defpackage.unr0;
import defpackage.vfc;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/request/OrderStatusParam;", "", "Companion", "Break", "Widget", "PromoAction", "OrderContact", "SearchStateInfoRequest", "$serializer", "com/yandex/go/taxi/order/models/api/request/b", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class OrderStatusParam {
    public static final b Companion = new b();
    public static final i3y[] s;
    public final String a;
    public final String b;
    public final String c;
    public final Break d;
    public final String e;
    public final Map f;
    public final OrderContact g;
    public final List h;
    public final SearchStateInfoRequest i;
    public final Boolean j;
    public final boolean k;
    public final jsq0 l;
    public final jsq0 m;
    public final String n;
    public final String o;
    public final Integer p;
    public final String q;
    public final boolean r;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/request/OrderStatusParam$Break;", "", "Companion", "com/yandex/go/taxi/order/models/api/request/a", "USER", "TIMEOUT", "ACCIDENT", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Break {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Break[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final Break ACCIDENT;
        public static final a Companion;
        public static final Break TIMEOUT;
        public static final Break USER;

        static {
            Break r0 = new Break("USER", 0);
            USER = r0;
            Break r1 = new Break("TIMEOUT", 1);
            TIMEOUT = r1;
            Break r2 = new Break("ACCIDENT", 2);
            ACCIDENT = r2;
            Break[] breakArr = {r0, r1, r2};
            $VALUES = breakArr;
            $ENTRIES = kotlin.enums.a.a(breakArr);
            Companion = new a();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new s780(8));
        }

        public static Break valueOf(String str) {
            return (Break) Enum.valueOf(Break.class, str);
        }

        public static Break[] values() {
            return (Break[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/request/OrderStatusParam$PromoAction;", "", "Companion", "com/yandex/go/taxi/order/models/api/request/d", "DEEPLINK", "PICK_CONTACT_FOR_TOTW", "MODAL_VIEW", "LOOT_BOX", "OFFER_SUBSTITUTION", "TARIFF_REDIRECT", "REQUEST_TOTW", "CAR_APPEARANCE_OVERRIDE", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class PromoAction {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ PromoAction[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final PromoAction CAR_APPEARANCE_OVERRIDE;
        public static final d Companion;
        public static final PromoAction DEEPLINK;
        public static final PromoAction LOOT_BOX;
        public static final PromoAction MODAL_VIEW;
        public static final PromoAction OFFER_SUBSTITUTION;
        public static final PromoAction PICK_CONTACT_FOR_TOTW;
        public static final PromoAction REQUEST_TOTW;
        public static final PromoAction TARIFF_REDIRECT;

        static {
            PromoAction promoAction = new PromoAction("DEEPLINK", 0);
            DEEPLINK = promoAction;
            PromoAction promoAction2 = new PromoAction("PICK_CONTACT_FOR_TOTW", 1);
            PICK_CONTACT_FOR_TOTW = promoAction2;
            PromoAction promoAction3 = new PromoAction("MODAL_VIEW", 2);
            MODAL_VIEW = promoAction3;
            PromoAction promoAction4 = new PromoAction("LOOT_BOX", 3);
            LOOT_BOX = promoAction4;
            PromoAction promoAction5 = new PromoAction("OFFER_SUBSTITUTION", 4);
            OFFER_SUBSTITUTION = promoAction5;
            PromoAction promoAction6 = new PromoAction("TARIFF_REDIRECT", 5);
            TARIFF_REDIRECT = promoAction6;
            PromoAction promoAction7 = new PromoAction("REQUEST_TOTW", 6);
            REQUEST_TOTW = promoAction7;
            PromoAction promoAction8 = new PromoAction("CAR_APPEARANCE_OVERRIDE", 7);
            CAR_APPEARANCE_OVERRIDE = promoAction8;
            PromoAction[] promoActionArr = {promoAction, promoAction2, promoAction3, promoAction4, promoAction5, promoAction6, promoAction7, promoAction8};
            $VALUES = promoActionArr;
            $ENTRIES = kotlin.enums.a.a(promoActionArr);
            Companion = new d();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new s780(9));
        }

        public static k4o b() {
            return $ENTRIES;
        }

        public static PromoAction valueOf(String str) {
            return (PromoAction) Enum.valueOf(PromoAction.class, str);
        }

        public static PromoAction[] values() {
            return (PromoAction[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/request/OrderStatusParam$Widget;", "", "Companion", "com/yandex/go/taxi/order/models/api/request/f", "ACTIONS_ARROW_BUTTON", "DEEPLINK_ARROW_BUTTON", "TOGGLE", "ACTION_BUTTONS", "ACTION_BUTTON", "ATTRIBUTED_TEXT", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Widget {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Widget[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final Widget ACTIONS_ARROW_BUTTON;
        public static final Widget ACTION_BUTTON;
        public static final Widget ACTION_BUTTONS;
        public static final Widget ATTRIBUTED_TEXT;
        public static final f Companion;
        public static final Widget DEEPLINK_ARROW_BUTTON;
        public static final Widget TOGGLE;

        static {
            Widget widget = new Widget("ACTIONS_ARROW_BUTTON", 0);
            ACTIONS_ARROW_BUTTON = widget;
            Widget widget2 = new Widget("DEEPLINK_ARROW_BUTTON", 1);
            DEEPLINK_ARROW_BUTTON = widget2;
            Widget widget3 = new Widget("TOGGLE", 2);
            TOGGLE = widget3;
            Widget widget4 = new Widget("ACTION_BUTTONS", 3);
            ACTION_BUTTONS = widget4;
            Widget widget5 = new Widget("ACTION_BUTTON", 4);
            ACTION_BUTTON = widget5;
            Widget widget6 = new Widget("ATTRIBUTED_TEXT", 5);
            ATTRIBUTED_TEXT = widget6;
            Widget[] widgetArr = {widget, widget2, widget3, widget4, widget5, widget6};
            $VALUES = widgetArr;
            $ENTRIES = kotlin.enums.a.a(widgetArr);
            Companion = new f();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new s780(10));
        }

        public static k4o b() {
            return $ENTRIES;
        }

        public static Widget valueOf(String str) {
            return (Widget) Enum.valueOf(Widget.class, str);
        }

        public static Widget[] values() {
            return (Widget[]) $VALUES.clone();
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        s = new i3y[]{null, null, null, kotlin.a.b(lazyThreadSafetyMode, new s780(3)), null, kotlin.a.b(lazyThreadSafetyMode, new s780(4)), null, kotlin.a.b(lazyThreadSafetyMode, new s780(5)), null, null, null, kotlin.a.b(lazyThreadSafetyMode, new s780(6)), kotlin.a.b(lazyThreadSafetyMode, new s780(7)), null, null, null, null, null};
    }

    public OrderStatusParam(int i, String str, String str2, String str3, Break r8, String str4, Map map, OrderContact orderContact, List list, SearchStateInfoRequest searchStateInfoRequest, Boolean bool, boolean z, jsq0 jsq0Var, jsq0 jsq0Var2, String str5, String str6, Integer num, String str7, boolean z2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, OrderStatusParam$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = r8;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = map;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = orderContact;
        }
        if ((i & 128) == 0) {
            this.h = scc.g("midpointchange", "code_dispatch");
        } else {
            this.h = list;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = searchStateInfoRequest;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = bool;
        }
        if ((i & 1024) == 0) {
            this.k = true;
        } else {
            this.k = z;
        }
        if ((i & 2048) == 0) {
            k4o b = Widget.b();
            jsq0 jsq0Var3 = ksq0.a;
            this.l = new jsq0(b);
        } else {
            this.l = jsq0Var;
        }
        if ((i & 4096) == 0) {
            k4o b2 = PromoAction.b();
            jsq0 jsq0Var4 = ksq0.a;
            this.m = new jsq0(b2);
        } else {
            this.m = jsq0Var2;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = str5;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = str6;
        }
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = num;
        }
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = str7;
        }
        this.r = (i & 131072) == 0 ? false : z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderStatusParam)) {
            return false;
        }
        OrderStatusParam orderStatusParam = (OrderStatusParam) obj;
        return jl40.l(this.a, orderStatusParam.a) && jl40.l(this.b, orderStatusParam.b) && jl40.l(this.c, orderStatusParam.c) && this.d == orderStatusParam.d && jl40.l(this.e, orderStatusParam.e) && jl40.l(this.f, orderStatusParam.f) && jl40.l(this.g, orderStatusParam.g) && jl40.l(this.h, orderStatusParam.h) && jl40.l(this.i, orderStatusParam.i) && jl40.l(this.j, orderStatusParam.j) && this.k == orderStatusParam.k && jl40.l(this.l, orderStatusParam.l) && jl40.l(this.m, orderStatusParam.m) && jl40.l(this.n, orderStatusParam.n) && jl40.l(this.o, orderStatusParam.o) && jl40.l(this.p, orderStatusParam.p) && jl40.l(this.q, orderStatusParam.q) && this.r == orderStatusParam.r;
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        Break r3 = this.d;
        int hashCode2 = (hashCode + (r3 == null ? 0 : r3.hashCode())) * 31;
        String str2 = this.e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map map = this.f;
        int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        OrderContact orderContact = this.g;
        int c = unr0.c((hashCode4 + (orderContact == null ? 0 : orderContact.hashCode())) * 31, 31, this.h);
        SearchStateInfoRequest searchStateInfoRequest = this.i;
        int hashCode5 = (c + (searchStateInfoRequest == null ? 0 : searchStateInfoRequest.hashCode())) * 31;
        Boolean bool = this.j;
        int c2 = unr0.c(unr0.c(unr0.e((hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.k), 31, this.l.a), 31, this.m.a);
        String str3 = this.n;
        int hashCode6 = (c2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.o;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.p;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.q;
        return Boolean.hashCode(this.r) + ((hashCode8 + (str5 != null ? str5.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("OrderStatusParam(id=", this.a, ", orderId=", this.b, ", version=");
        v.append(this.c);
        v.append(", breakOrder=");
        v.append(this.d);
        v.append(", cancelState=");
        v.append(this.e);
        v.append(", userActionsParam=");
        v.append(this.f);
        v.append(", orderContact=");
        v.append(this.g);
        v.append(", supported=");
        v.append(this.h);
        v.append(", searchStateInfoRequest=");
        v.append(this.i);
        v.append(", isMultiorder=");
        v.append(this.j);
        v.append(", formatCurrency=");
        v.append(this.k);
        v.append(", supportedWidgets=");
        v.append(this.l);
        v.append(", supportedPromoActions=");
        v.append(this.m);
        v.append(", ultimaMode=");
        v.append(this.n);
        v.append(", chooseUltimaAppearanceMode=");
        vfc.w(this.p, this.o, ", userPowerPrc=", ", userPluggedState=", v);
        return nnm.i(this.q, ", isLightweight=", Extension.C_BRAKE, v, this.r);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/request/OrderStatusParam$OrderContact;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/request/c", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class OrderContact {
        public static final c Companion = new c();
        public final String a;
        public final String b;

        public /* synthetic */ OrderContact(int i, String str, String str2) {
            if (3 != (i & 3)) {
                qje.Z(i, 3, OrderStatusParam$OrderContact$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OrderContact)) {
                return false;
            }
            OrderContact orderContact = (OrderContact) obj;
            return jl40.l(this.a, orderContact.a) && jl40.l(this.b, orderContact.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return unr0.p("OrderContact(name=", this.a, ", phone=", this.b, Extension.C_BRAKE);
        }

        public OrderContact(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/request/OrderStatusParam$SearchStateInfoRequest;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/request/e", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class SearchStateInfoRequest {
        public static final e Companion = new e();
        public final String a;
        public final String b;

        public /* synthetic */ SearchStateInfoRequest(int i, String str, String str2) {
            if (3 != (i & 3)) {
                qje.Z(i, 3, OrderStatusParam$SearchStateInfoRequest$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SearchStateInfoRequest)) {
                return false;
            }
            SearchStateInfoRequest searchStateInfoRequest = (SearchStateInfoRequest) obj;
            return jl40.l(this.a, searchStateInfoRequest.a) && jl40.l(this.b, searchStateInfoRequest.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return unr0.p("SearchStateInfoRequest(state=", this.a, ", stateTp=", this.b, Extension.C_BRAKE);
        }

        public SearchStateInfoRequest(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    public OrderStatusParam(String str, String str2, String str3, Break r7, String str4, Map map, OrderContact orderContact, List list, SearchStateInfoRequest searchStateInfoRequest, Boolean bool, String str5, String str6, Integer num, String str7, boolean z) {
        k4o b = Widget.b();
        jsq0 jsq0Var = ksq0.a;
        jsq0 jsq0Var2 = new jsq0(b);
        jsq0 jsq0Var3 = new jsq0(PromoAction.b());
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = r7;
        this.e = str4;
        this.f = map;
        this.g = orderContact;
        this.h = list;
        this.i = searchStateInfoRequest;
        this.j = bool;
        this.k = true;
        this.l = jsq0Var2;
        this.m = jsq0Var3;
        this.n = str5;
        this.o = str6;
        this.p = num;
        this.q = str7;
        this.r = z;
    }
}
