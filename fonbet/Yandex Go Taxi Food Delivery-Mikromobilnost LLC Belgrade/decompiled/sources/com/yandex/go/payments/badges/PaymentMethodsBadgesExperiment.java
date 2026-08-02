package com.yandex.go.payments.badges;

import defpackage.c6z;
import defpackage.f9a0;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.n;
import defpackage.nnm;
import defpackage.oyr;
import defpackage.t7a0;
import defpackage.tse0;
import defpackage.unr0;
import defpackage.vfc;
import defpackage.w96;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0004\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/payments/badges/PaymentMethodsBadgesExperiment;", "Lw96;", "Lc6z;", "Companion", "Badge", "AddPaymentBadge", "com/yandex/go/payments/badges/d", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class PaymentMethodsBadgesExperiment extends w96 implements c6z {
    public static final d Companion = new d();
    public static final i3y[] f;
    public static final PaymentMethodsBadgesExperiment g;
    public final boolean b;
    public final Map c;
    public final List d;
    public final List e;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new f9a0(2)), kotlin.a.b(lazyThreadSafetyMode, new f9a0(3)), kotlin.a.b(lazyThreadSafetyMode, new f9a0(4))};
        g = new PaymentMethodsBadgesExperiment(0);
    }

    public /* synthetic */ PaymentMethodsBadgesExperiment(int i, List list, List list2, Map map, boolean z) {
        this.b = (i & 1) == 0 ? false : z;
        this.c = (i & 2) == 0 ? kotlin.collections.b.f() : map;
        int i2 = i & 4;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.d = emptyList;
        } else {
            this.d = list;
        }
        if ((i & 8) == 0) {
            this.e = emptyList;
        } else {
            this.e = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentMethodsBadgesExperiment)) {
            return false;
        }
        PaymentMethodsBadgesExperiment paymentMethodsBadgesExperiment = (PaymentMethodsBadgesExperiment) obj;
        return this.b == paymentMethodsBadgesExperiment.b && jl40.l(this.c, paymentMethodsBadgesExperiment.c) && jl40.l(this.d, paymentMethodsBadgesExperiment.d) && jl40.l(this.e, paymentMethodsBadgesExperiment.e);
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.c(unr0.d(Boolean.hashCode(this.b) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        return vfc.p(nnm.l("PaymentMethodsBadgesExperiment(enabled=", ", l10n=", ", badges=", this.c, this.b), this.d, ", addPaymentBadges=", this.e, Extension.C_BRAKE);
    }

    public PaymentMethodsBadgesExperiment() {
        this(0);
    }

    public PaymentMethodsBadgesExperiment(int i) {
        Map f2 = kotlin.collections.b.f();
        this.b = false;
        this.c = f2;
        EmptyList emptyList = EmptyList.a;
        this.d = emptyList;
        this.e = emptyList;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/badges/PaymentMethodsBadgesExperiment$AddPaymentBadge;", "", "Companion", "$serializer", "com/yandex/go/payments/badges/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes13.dex */
    public static final /* data */ class AddPaymentBadge {
        public static final b Companion = new b();
        public static final i3y[] i = {null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new t7a0(5)), null, null, null, null};
        public final String a;
        public final Integer b;
        public final Integer c;
        public final List d;
        public final String e;
        public final String f;
        public final String g;
        public final String h;

        public /* synthetic */ AddPaymentBadge(int i2, String str, Integer num, Integer num2, List list, String str2, String str3, String str4, String str5) {
            if ((i2 & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i2 & 2) == 0) {
                this.b = null;
            } else {
                this.b = num;
            }
            if ((i2 & 4) == 0) {
                this.c = null;
            } else {
                this.c = num2;
            }
            if ((i2 & 8) == 0) {
                this.d = EmptyList.a;
            } else {
                this.d = list;
            }
            if ((i2 & 16) == 0) {
                this.e = "";
            } else {
                this.e = str2;
            }
            if ((i2 & 32) == 0) {
                this.f = "";
            } else {
                this.f = str3;
            }
            if ((i2 & 64) == 0) {
                this.g = "";
            } else {
                this.g = str4;
            }
            if ((i2 & 128) == 0) {
                this.h = "";
            } else {
                this.h = str5;
            }
        }

        /* renamed from: a, reason: from getter */
        public final String getG() {
            return this.g;
        }

        /* renamed from: b, reason: from getter */
        public final String getA() {
            return this.a;
        }

        /* renamed from: c, reason: from getter */
        public final Integer getB() {
            return this.b;
        }

        /* renamed from: d, reason: from getter */
        public final String getF() {
            return this.f;
        }

        /* renamed from: e, reason: from getter */
        public final List getD() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AddPaymentBadge)) {
                return false;
            }
            AddPaymentBadge addPaymentBadge = (AddPaymentBadge) obj;
            return jl40.l(this.a, addPaymentBadge.a) && jl40.l(this.b, addPaymentBadge.b) && jl40.l(this.c, addPaymentBadge.c) && jl40.l(this.d, addPaymentBadge.d) && jl40.l(this.e, addPaymentBadge.e) && jl40.l(this.f, addPaymentBadge.f) && jl40.l(this.g, addPaymentBadge.g) && jl40.l(this.h, addPaymentBadge.h);
        }

        /* renamed from: f, reason: from getter */
        public final Integer getC() {
            return this.c;
        }

        /* renamed from: g, reason: from getter */
        public final String getH() {
            return this.h;
        }

        /* renamed from: h, reason: from getter */
        public final String getE() {
            return this.e;
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            Integer num = this.b;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.c;
            return this.h.hashCode() + unr0.b(unr0.b(unr0.b(unr0.c((hashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        }

        public final String toString() {
            StringBuilder q = n.q("AddPaymentBadge(id=", this.b, this.a, ", maxShowCount=", ", showCountResetTime=");
            q.append(this.c);
            q.append(", services=");
            q.append(this.d);
            q.append(", titleKey=");
            g8e.D(q, this.e, ", paymentType=", this.f, ", backgroundColor=");
            return g8e.r(q, this.g, ", textColor=", this.h, Extension.C_BRAKE);
        }

        public AddPaymentBadge() {
            this.a = "";
            this.b = null;
            this.c = null;
            this.d = EmptyList.a;
            this.e = "";
            this.f = "";
            this.g = "";
            this.h = "";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/badges/PaymentMethodsBadgesExperiment$Badge;", "", "Companion", "$serializer", "com/yandex/go/payments/badges/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes13.dex */
    public static final /* data */ class Badge {
        public static final c Companion = new c();
        public static final i3y[] m;
        public final String a;
        public final Integer b;
        public final Integer c;
        public final List d;
        public final String e;
        public final List f;
        public final List g;
        public final String h;
        public final List i;
        public final String j;
        public final boolean k;
        public final String l;

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            m = new i3y[]{null, null, null, kotlin.a.b(lazyThreadSafetyMode, new t7a0(6)), null, kotlin.a.b(lazyThreadSafetyMode, new t7a0(7)), kotlin.a.b(lazyThreadSafetyMode, new t7a0(8)), null, kotlin.a.b(lazyThreadSafetyMode, new t7a0(9)), null, null, null};
        }

        public /* synthetic */ Badge(int i, String str, Integer num, Integer num2, List list, String str2, List list2, List list3, String str3, List list4, String str4, boolean z, String str5) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = num;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = num2;
            }
            int i2 = i & 8;
            EmptyList emptyList = EmptyList.a;
            if (i2 == 0) {
                this.d = emptyList;
            } else {
                this.d = list;
            }
            if ((i & 16) == 0) {
                this.e = "";
            } else {
                this.e = str2;
            }
            if ((i & 32) == 0) {
                this.f = emptyList;
            } else {
                this.f = list2;
            }
            if ((i & 64) == 0) {
                this.g = emptyList;
            } else {
                this.g = list3;
            }
            if ((i & 128) == 0) {
                this.h = "";
            } else {
                this.h = str3;
            }
            if ((i & 256) == 0) {
                this.i = emptyList;
            } else {
                this.i = list4;
            }
            if ((i & 512) == 0) {
                this.j = "";
            } else {
                this.j = str4;
            }
            if ((i & 1024) == 0) {
                this.k = false;
            } else {
                this.k = z;
            }
            if ((i & 2048) == 0) {
                this.l = "";
            } else {
                this.l = str5;
            }
        }

        /* renamed from: a, reason: from getter */
        public final String getJ() {
            return this.j;
        }

        /* renamed from: b, reason: from getter */
        public final boolean getK() {
            return this.k;
        }

        /* renamed from: c, reason: from getter */
        public final String getA() {
            return this.a;
        }

        /* renamed from: d, reason: from getter */
        public final Integer getB() {
            return this.b;
        }

        /* renamed from: e, reason: from getter */
        public final List getF() {
            return this.f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Badge)) {
                return false;
            }
            Badge badge = (Badge) obj;
            return jl40.l(this.a, badge.a) && jl40.l(this.b, badge.b) && jl40.l(this.c, badge.c) && jl40.l(this.d, badge.d) && jl40.l(this.e, badge.e) && jl40.l(this.f, badge.f) && jl40.l(this.g, badge.g) && jl40.l(this.h, badge.h) && jl40.l(this.i, badge.i) && jl40.l(this.j, badge.j) && this.k == badge.k && jl40.l(this.l, badge.l);
        }

        /* renamed from: f, reason: from getter */
        public final String getH() {
            return this.h;
        }

        /* renamed from: g, reason: from getter */
        public final List getD() {
            return this.d;
        }

        /* renamed from: h, reason: from getter */
        public final Integer getC() {
            return this.c;
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            Integer num = this.b;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.c;
            return this.l.hashCode() + unr0.e(unr0.b(unr0.c(unr0.b(unr0.c(unr0.c(unr0.b(unr0.c((hashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
        }

        /* renamed from: i, reason: from getter */
        public final List getI() {
            return this.i;
        }

        /* renamed from: j, reason: from getter */
        public final List getG() {
            return this.g;
        }

        /* renamed from: k, reason: from getter */
        public final String getL() {
            return this.l;
        }

        /* renamed from: l, reason: from getter */
        public final String getE() {
            return this.e;
        }

        public final String toString() {
            StringBuilder q = n.q("Badge(id=", this.b, this.a, ", maxShowCount=", ", showCountResetTime=");
            q.append(this.c);
            q.append(", services=");
            q.append(this.d);
            q.append(", title=");
            tse0.x(this.e, ", paymentScreens=", ", tariffClasses=", q, this.f);
            oyr.D(", paymentType=", this.h, ", subtypes=", q, this.g);
            oyr.D(", backgroundColor=", this.j, ", canShowInEdit=", q, this.i);
            return n.m(", textColor=", this.l, Extension.C_BRAKE, q, this.k);
        }

        public Badge() {
            this.a = "";
            this.b = null;
            this.c = null;
            EmptyList emptyList = EmptyList.a;
            this.d = emptyList;
            this.e = "";
            this.f = emptyList;
            this.g = emptyList;
            this.h = "";
            this.i = emptyList;
            this.j = "";
            this.k = false;
            this.l = "";
        }
    }
}
