package com.yandex.go.payments.paymentlist.experiments;

import defpackage.c6z;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jsq0;
import defpackage.k4o;
import defpackage.ksq0;
import defpackage.nnm;
import defpackage.oo31;
import defpackage.oyr;
import defpackage.qxz;
import defpackage.t5z;
import defpackage.unr0;
import defpackage.w96;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0007\u0004\u0005\u0006\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/go/payments/paymentlist/experiments/MainMenuPaymentMethodsSelectorExperiment;", "Lw96;", "Lc6z;", "Companion", "InformationBanner", "PromoBannerConditions", "Screen", "PaymentTypes", "ShowPolicy", "com/yandex/go/payments/paymentlist/experiments/j", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class MainMenuPaymentMethodsSelectorExperiment extends w96 implements c6z {
    public static final j Companion = new j();
    public static final i3y[] f;
    public static final MainMenuPaymentMethodsSelectorExperiment g;
    public final boolean b;
    public final Map c;
    public final ShowPolicy d;
    public final List e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/payments/paymentlist/experiments/MainMenuPaymentMethodsSelectorExperiment$PaymentTypes;", "", "Companion", "com/yandex/go/payments/paymentlist/experiments/l", "CARD", "SBP_TOKEN", "UNKNOWN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes12.dex */
    public static final class PaymentTypes {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ PaymentTypes[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final PaymentTypes CARD;
        public static final l Companion;
        public static final PaymentTypes SBP_TOKEN;
        public static final PaymentTypes UNKNOWN;

        static {
            PaymentTypes paymentTypes = new PaymentTypes("CARD", 0);
            CARD = paymentTypes;
            PaymentTypes paymentTypes2 = new PaymentTypes("SBP_TOKEN", 1);
            SBP_TOKEN = paymentTypes2;
            PaymentTypes paymentTypes3 = new PaymentTypes("UNKNOWN", 2);
            UNKNOWN = paymentTypes3;
            PaymentTypes[] paymentTypesArr = {paymentTypes, paymentTypes2, paymentTypes3};
            $VALUES = paymentTypesArr;
            $ENTRIES = kotlin.enums.a.a(paymentTypesArr);
            Companion = new l();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new qxz(5));
        }

        public static PaymentTypes valueOf(String str) {
            return (PaymentTypes) Enum.valueOf(PaymentTypes.class, str);
        }

        public static PaymentTypes[] values() {
            return (PaymentTypes[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/payments/paymentlist/experiments/MainMenuPaymentMethodsSelectorExperiment$Screen;", "", "Companion", "com/yandex/go/payments/paymentlist/experiments/n", "PAYMENT_LIST", "DETAILS_CARD", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes12.dex */
    public static final class Screen {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Screen[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final n Companion;
        public static final Screen DETAILS_CARD;
        public static final Screen PAYMENT_LIST;

        static {
            Screen screen = new Screen("PAYMENT_LIST", 0);
            PAYMENT_LIST = screen;
            Screen screen2 = new Screen("DETAILS_CARD", 1);
            DETAILS_CARD = screen2;
            Screen[] screenArr = {screen, screen2};
            $VALUES = screenArr;
            $ENTRIES = kotlin.enums.a.a(screenArr);
            Companion = new n();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new qxz(8));
        }

        public static Screen valueOf(String str) {
            return (Screen) Enum.valueOf(Screen.class, str);
        }

        public static Screen[] values() {
            return (Screen[]) $VALUES.clone();
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new t5z(7)), null, kotlin.a.b(lazyThreadSafetyMode, new t5z(8))};
        g = new MainMenuPaymentMethodsSelectorExperiment(0);
    }

    public /* synthetic */ MainMenuPaymentMethodsSelectorExperiment(int i, boolean z, Map map, ShowPolicy showPolicy, List list) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = kotlin.collections.b.f();
        } else {
            this.c = map;
        }
        if ((i & 4) == 0) {
            this.d = null;
        } else {
            this.d = showPolicy;
        }
        if ((i & 8) == 0) {
            this.e = EmptyList.a;
        } else {
            this.e = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MainMenuPaymentMethodsSelectorExperiment)) {
            return false;
        }
        MainMenuPaymentMethodsSelectorExperiment mainMenuPaymentMethodsSelectorExperiment = (MainMenuPaymentMethodsSelectorExperiment) obj;
        return this.b == mainMenuPaymentMethodsSelectorExperiment.b && jl40.l(this.c, mainMenuPaymentMethodsSelectorExperiment.c) && jl40.l(this.d, mainMenuPaymentMethodsSelectorExperiment.d) && jl40.l(this.e, mainMenuPaymentMethodsSelectorExperiment.e);
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
        int d = unr0.d(Boolean.hashCode(this.b) * 31, 31, this.c);
        ShowPolicy showPolicy = this.d;
        return this.e.hashCode() + ((d + (showPolicy == null ? 0 : showPolicy.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder l = nnm.l("MainMenuPaymentMethodsSelectorExperiment(enabled=", ", l10n=", ", defaultShowPolicy=", this.c, this.b);
        l.append(this.d);
        l.append(", banners=");
        l.append(this.e);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/paymentlist/experiments/MainMenuPaymentMethodsSelectorExperiment$ShowPolicy;", "", "Companion", "$serializer", "com/yandex/go/payments/paymentlist/experiments/o", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes13.dex */
    public static final /* data */ class ShowPolicy {
        public static final o Companion = new o();
        public final int a;

        public /* synthetic */ ShowPolicy(int i, int i2) {
            if ((i & 1) == 0) {
                this.a = 0;
            } else {
                this.a = i2;
            }
        }

        /* renamed from: a, reason: from getter */
        public final int getA() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowPolicy) && this.a == ((ShowPolicy) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return oyr.j(this.a, "ShowPolicy(maxShowCount=", Extension.C_BRAKE);
        }

        public ShowPolicy() {
            this.a = 0;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/paymentlist/experiments/MainMenuPaymentMethodsSelectorExperiment$PromoBannerConditions;", "", "Companion", "$serializer", "com/yandex/go/payments/paymentlist/experiments/m", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes13.dex */
    public static final /* data */ class PromoBannerConditions {
        public static final m Companion = new m();
        public static final i3y[] c;
        public final Screen a;
        public final jsq0 b;

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            c = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new qxz(6)), kotlin.a.b(lazyThreadSafetyMode, new qxz(7))};
        }

        public PromoBannerConditions(int i, Screen screen, jsq0 jsq0Var) {
            this.a = (i & 1) == 0 ? null : screen;
            if ((i & 2) != 0) {
                this.b = jsq0Var;
                return;
            }
            List singletonList = Collections.singletonList(PaymentTypes.UNKNOWN);
            jsq0 jsq0Var2 = ksq0.a;
            this.b = new jsq0(singletonList);
        }

        /* renamed from: a, reason: from getter */
        public final jsq0 getB() {
            return this.b;
        }

        /* renamed from: b, reason: from getter */
        public final Screen getA() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PromoBannerConditions)) {
                return false;
            }
            PromoBannerConditions promoBannerConditions = (PromoBannerConditions) obj;
            return this.a == promoBannerConditions.a && jl40.l(this.b, promoBannerConditions.b);
        }

        public final int hashCode() {
            Screen screen = this.a;
            return this.b.a.hashCode() + ((screen == null ? 0 : screen.hashCode()) * 31);
        }

        public final String toString() {
            return "PromoBannerConditions(screen=" + this.a + ", paymentTypes=" + this.b + Extension.C_BRAKE;
        }

        public PromoBannerConditions() {
            this(0);
        }

        public PromoBannerConditions(int i) {
            List singletonList = Collections.singletonList(PaymentTypes.UNKNOWN);
            jsq0 jsq0Var = ksq0.a;
            jsq0 jsq0Var2 = new jsq0(singletonList);
            this.a = null;
            this.b = jsq0Var2;
        }
    }

    public MainMenuPaymentMethodsSelectorExperiment() {
        this(0);
    }

    public MainMenuPaymentMethodsSelectorExperiment(int i) {
        Map f2 = kotlin.collections.b.f();
        this.b = false;
        this.c = f2;
        this.d = null;
        this.e = EmptyList.a;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/paymentlist/experiments/MainMenuPaymentMethodsSelectorExperiment$InformationBanner;", "", "Companion", "$serializer", "com/yandex/go/payments/paymentlist/experiments/k", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes13.dex */
    public static final /* data */ class InformationBanner {
        public static final k Companion = new k();
        public final String a;
        public final boolean b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public final ShowPolicy h;
        public final PromoBannerConditions i;

        public /* synthetic */ InformationBanner(int i, String str, boolean z, String str2, String str3, String str4, String str5, String str6, ShowPolicy showPolicy, PromoBannerConditions promoBannerConditions) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = true;
            } else {
                this.b = z;
            }
            if ((i & 4) == 0) {
                this.c = "";
            } else {
                this.c = str2;
            }
            if ((i & 8) == 0) {
                this.d = "";
            } else {
                this.d = str3;
            }
            if ((i & 16) == 0) {
                this.e = "";
            } else {
                this.e = str4;
            }
            if ((i & 32) == 0) {
                this.f = "";
            } else {
                this.f = str5;
            }
            if ((i & 64) == 0) {
                this.g = "";
            } else {
                this.g = str6;
            }
            if ((i & 128) == 0) {
                this.h = null;
            } else {
                this.h = showPolicy;
            }
            if ((i & 256) == 0) {
                this.i = new PromoBannerConditions(0);
            } else {
                this.i = promoBannerConditions;
            }
        }

        /* renamed from: a, reason: from getter */
        public final String getD() {
            return this.d;
        }

        /* renamed from: b, reason: from getter */
        public final String getA() {
            return this.a;
        }

        /* renamed from: c, reason: from getter */
        public final PromoBannerConditions getI() {
            return this.i;
        }

        /* renamed from: d, reason: from getter */
        public final String getF() {
            return this.f;
        }

        /* renamed from: e, reason: from getter */
        public final String getG() {
            return this.g;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InformationBanner)) {
                return false;
            }
            InformationBanner informationBanner = (InformationBanner) obj;
            return jl40.l(this.a, informationBanner.a) && this.b == informationBanner.b && jl40.l(this.c, informationBanner.c) && jl40.l(this.d, informationBanner.d) && jl40.l(this.e, informationBanner.e) && jl40.l(this.f, informationBanner.f) && jl40.l(this.g, informationBanner.g) && jl40.l(this.h, informationBanner.h) && jl40.l(this.i, informationBanner.i);
        }

        /* renamed from: f, reason: from getter */
        public final ShowPolicy getH() {
            return this.h;
        }

        /* renamed from: g, reason: from getter */
        public final String getC() {
            return this.c;
        }

        /* renamed from: h, reason: from getter */
        public final String getE() {
            return this.e;
        }

        public final int hashCode() {
            int b = unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.e(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
            ShowPolicy showPolicy = this.h;
            return this.i.hashCode() + ((b + (showPolicy == null ? 0 : Integer.hashCode(showPolicy.a))) * 31);
        }

        /* renamed from: i, reason: from getter */
        public final boolean getB() {
            return this.b;
        }

        public final String toString() {
            StringBuilder l = oo31.l("InformationBanner(bannerId=", this.a, ", isClosable=", ", textColor=", this.b);
            g8e.D(l, this.c, ", backgroundColor=", this.d, ", title=");
            g8e.D(l, this.e, ", content=", this.f, ", iconTag=");
            l.append(this.g);
            l.append(", showPolicy=");
            l.append(this.h);
            l.append(", conditions=");
            l.append(this.i);
            l.append(Extension.C_BRAKE);
            return l.toString();
        }

        public InformationBanner() {
            PromoBannerConditions promoBannerConditions = new PromoBannerConditions(0);
            this.a = "";
            this.b = true;
            this.c = "";
            this.d = "";
            this.e = "";
            this.f = "";
            this.g = "";
            this.h = null;
            this.i = promoBannerConditions;
        }
    }
}
