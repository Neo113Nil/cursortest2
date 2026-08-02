package com.yandex.go.payments.paymentlist.experiments;

import defpackage.b64;
import defpackage.c6z;
import defpackage.f9a0;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.nnm;
import defpackage.oyr;
import defpackage.t7a0;
import defpackage.unr0;
import defpackage.w96;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0004\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/payments/paymentlist/experiments/PaymentMethodsCustomSubtitlesExperiment;", "Lw96;", "Lc6z;", "Companion", "PaymentMethodsDescription", "PaymentMethodsSubtitlesTariffDescription", "com/yandex/go/payments/paymentlist/experiments/t", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class PaymentMethodsCustomSubtitlesExperiment extends w96 implements c6z {
    public static final t Companion = new t();
    public static final i3y[] e;
    public static final PaymentMethodsCustomSubtitlesExperiment f;
    public final boolean b;
    public final Map c;
    public final List d;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new f9a0(7)), kotlin.a.b(lazyThreadSafetyMode, new f9a0(8))};
        f = new PaymentMethodsCustomSubtitlesExperiment(0);
    }

    public /* synthetic */ PaymentMethodsCustomSubtitlesExperiment(int i, List list, Map map, boolean z) {
        this.b = (i & 1) == 0 ? false : z;
        this.c = (i & 2) == 0 ? kotlin.collections.b.f() : map;
        if ((i & 4) == 0) {
            this.d = EmptyList.a;
        } else {
            this.d = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentMethodsCustomSubtitlesExperiment)) {
            return false;
        }
        PaymentMethodsCustomSubtitlesExperiment paymentMethodsCustomSubtitlesExperiment = (PaymentMethodsCustomSubtitlesExperiment) obj;
        return this.b == paymentMethodsCustomSubtitlesExperiment.b && jl40.l(this.c, paymentMethodsCustomSubtitlesExperiment.c) && jl40.l(this.d, paymentMethodsCustomSubtitlesExperiment.d);
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getF() {
        return this.c;
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.d(Boolean.hashCode(this.b) * 31, 31, this.c);
    }

    public final String toString() {
        return ly3.s(nnm.l("PaymentMethodsCustomSubtitlesExperiment(enabled=", ", l10n=", ", paymentMethodsDescription=", this.c, this.b), this.d, Extension.C_BRAKE);
    }

    public PaymentMethodsCustomSubtitlesExperiment() {
        this(0);
    }

    public PaymentMethodsCustomSubtitlesExperiment(Map map, List list, boolean z) {
        this.b = z;
        this.c = map;
        this.d = list;
    }

    public /* synthetic */ PaymentMethodsCustomSubtitlesExperiment(int i) {
        this(kotlin.collections.b.f(), EmptyList.a, false);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/paymentlist/experiments/PaymentMethodsCustomSubtitlesExperiment$PaymentMethodsSubtitlesTariffDescription;", "", "Companion", "$serializer", "com/yandex/go/payments/paymentlist/experiments/v", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes13.dex */
    public static final /* data */ class PaymentMethodsSubtitlesTariffDescription {
        public static final v Companion = new v();
        public final String a;
        public final String b;
        public final String c;
        public final String d;

        public /* synthetic */ PaymentMethodsSubtitlesTariffDescription(int i, String str, String str2, String str3, String str4) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = "";
            } else {
                this.c = str3;
            }
            if ((i & 8) == 0) {
                this.d = "";
            } else {
                this.d = str4;
            }
        }

        /* renamed from: a, reason: from getter */
        public final String getD() {
            return this.d;
        }

        /* renamed from: b, reason: from getter */
        public final String getC() {
            return this.c;
        }

        /* renamed from: c, reason: from getter */
        public final String getB() {
            return this.b;
        }

        /* renamed from: d, reason: from getter */
        public final String getA() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaymentMethodsSubtitlesTariffDescription)) {
                return false;
            }
            PaymentMethodsSubtitlesTariffDescription paymentMethodsSubtitlesTariffDescription = (PaymentMethodsSubtitlesTariffDescription) obj;
            return jl40.l(this.a, paymentMethodsSubtitlesTariffDescription.a) && jl40.l(this.b, paymentMethodsSubtitlesTariffDescription.b) && jl40.l(this.c, paymentMethodsSubtitlesTariffDescription.c) && jl40.l(this.d, paymentMethodsSubtitlesTariffDescription.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            return g8e.r(b64.v("PaymentMethodsSubtitlesTariffDescription(titleKey=", this.a, ", textKey=", this.b, ", textColor="), this.c, ", tariffName=", this.d, Extension.C_BRAKE);
        }

        public PaymentMethodsSubtitlesTariffDescription() {
            this.a = "";
            this.b = "";
            this.c = "";
            this.d = "";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/paymentlist/experiments/PaymentMethodsCustomSubtitlesExperiment$PaymentMethodsDescription;", "", "Companion", "$serializer", "com/yandex/go/payments/paymentlist/experiments/u", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes13.dex */
    public static final /* data */ class PaymentMethodsDescription {
        public static final u Companion = new u();
        public static final i3y[] h;
        public final String a;
        public final String b;
        public final Set c;
        public final List d;
        public final String e;
        public final Set f;
        public final String g;

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            h = new i3y[]{null, null, kotlin.a.b(lazyThreadSafetyMode, new t7a0(10)), kotlin.a.b(lazyThreadSafetyMode, new t7a0(11)), null, kotlin.a.b(lazyThreadSafetyMode, new t7a0(12)), null};
        }

        public /* synthetic */ PaymentMethodsDescription(int i, String str, String str2, Set set, List list, String str3, Set set2, String str4) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str2;
            }
            int i2 = i & 4;
            EmptySet emptySet = EmptySet.a;
            if (i2 == 0) {
                this.c = emptySet;
            } else {
                this.c = set;
            }
            if ((i & 8) == 0) {
                this.d = EmptyList.a;
            } else {
                this.d = list;
            }
            if ((i & 16) == 0) {
                this.e = "";
            } else {
                this.e = str3;
            }
            if ((i & 32) == 0) {
                this.f = emptySet;
            } else {
                this.f = set2;
            }
            if ((i & 64) == 0) {
                this.g = "";
            } else {
                this.g = str4;
            }
        }

        public static PaymentMethodsDescription a(PaymentMethodsDescription paymentMethodsDescription, ArrayList arrayList) {
            return new PaymentMethodsDescription(paymentMethodsDescription.a, paymentMethodsDescription.b, paymentMethodsDescription.c, arrayList, paymentMethodsDescription.e, paymentMethodsDescription.f, paymentMethodsDescription.g);
        }

        /* renamed from: b, reason: from getter */
        public final String getE() {
            return this.e;
        }

        /* renamed from: c, reason: from getter */
        public final Set getC() {
            return this.c;
        }

        /* renamed from: d, reason: from getter */
        public final Set getF() {
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
            if (!(obj instanceof PaymentMethodsDescription)) {
                return false;
            }
            PaymentMethodsDescription paymentMethodsDescription = (PaymentMethodsDescription) obj;
            return jl40.l(this.a, paymentMethodsDescription.a) && jl40.l(this.b, paymentMethodsDescription.b) && jl40.l(this.c, paymentMethodsDescription.c) && jl40.l(this.d, paymentMethodsDescription.d) && jl40.l(this.e, paymentMethodsDescription.e) && jl40.l(this.f, paymentMethodsDescription.f) && jl40.l(this.g, paymentMethodsDescription.g);
        }

        /* renamed from: f, reason: from getter */
        public final String getG() {
            return this.g;
        }

        /* renamed from: g, reason: from getter */
        public final String getB() {
            return this.b;
        }

        /* renamed from: h, reason: from getter */
        public final String getA() {
            return this.a;
        }

        public final int hashCode() {
            return this.g.hashCode() + g8e.e(this.f, unr0.b(unr0.c(g8e.e(this.c, unr0.b(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31);
        }

        public final String toString() {
            StringBuilder v = b64.v("PaymentMethodsDescription(titleKey=", this.a, ", textKey=", this.b, ", services=");
            v.append(this.c);
            v.append(", tariffs=");
            v.append(this.d);
            v.append(", paymentType=");
            v.append(this.e);
            v.append(", subtypes=");
            v.append(this.f);
            v.append(", textColor=");
            return oyr.t(v, this.g, Extension.C_BRAKE);
        }

        public PaymentMethodsDescription(String str, String str2, Set set, List list, String str3, Set set2, String str4) {
            this.a = str;
            this.b = str2;
            this.c = set;
            this.d = list;
            this.e = str3;
            this.f = set2;
            this.g = str4;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public PaymentMethodsDescription() {
            this("", "", r3, r4, "", r3, "");
            EmptyList emptyList = EmptyList.a;
            EmptySet emptySet = EmptySet.a;
        }
    }
}
