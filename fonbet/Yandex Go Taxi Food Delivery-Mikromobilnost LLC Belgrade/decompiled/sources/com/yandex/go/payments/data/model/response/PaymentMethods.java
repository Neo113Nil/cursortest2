package com.yandex.go.payments.data.model.response;

import defpackage.b64;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.ks90;
import defpackage.oo31;
import defpackage.oyr;
import defpackage.qv10;
import defpackage.t7a0;
import defpackage.tse0;
import defpackage.unr0;
import defpackage.xvz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u000f\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/yandex/go/payments/data/model/response/PaymentMethods;", "", "Companion", "CardPaymentMethods", "CashLikePaymentMethods", "CorpPaymentMethods", "CargoCorpPaymentMethods", "LastPaymentMethod", "PersonalWalletPaymentMethods", "SharedPaymentMethods", "YbWalletPaymentMethods", "YangoPayPaymentMethod", "LocationInfo", "com/yandex/go/payments/data/model/response/v0", "SbpTokensPaymentMethods", "MBankAccountPaymentMethod", "ComplementPaymentMethod", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class PaymentMethods {
    public static final v0 Companion = new v0();
    public static final i3y[] w;
    public static final PaymentMethods x;
    public final CardPaymentMethods a;
    public final CashLikePaymentMethods b;
    public final CorpPaymentMethods c;
    public final CargoCorpPaymentMethods d;
    public final PersonalWalletPaymentMethods e;
    public final SharedPaymentMethods f;
    public final YbWalletPaymentMethods g;
    public final YangoPayPaymentMethod h;
    public final String i;
    public final String j;
    public final LastPaymentMethod k;
    public final String l;
    public final String m;
    public final String n;
    public final LocationInfo o;
    public final String p;
    public final SbpTokensPaymentMethods q;
    public final MBankAccountPaymentMethod r;
    public final ComplementPaymentMethod s;
    public final List t;
    public final ListPaymentMethodsUiDto u;
    public final List v;

    static {
        o0 o0Var = ListPaymentMethodsUiDto.Companion;
        y yVar = ComplementWallet.Companion;
        f fVar = AddPaymentMethodButton.Companion;
        p0 p0Var = MBankAccount.Companion;
        g gVar = AddSbpTokenButtonDto.Companion;
        c2 c2Var = YbWallet.Companion;
        u1 u1Var = SharedAccount.Companion;
        k1 k1Var = PersonalAccount.Companion;
        b0 b0Var = CorpAccount.Companion;
        v vVar = CardProfile.Companion;
        s sVar = Card.Companion;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        w = new i3y[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new ks90(14)), null, kotlin.a.b(lazyThreadSafetyMode, new ks90(15))};
        x = new PaymentMethods(0);
    }

    public PaymentMethods(int i, CardPaymentMethods cardPaymentMethods, CashLikePaymentMethods cashLikePaymentMethods, CorpPaymentMethods corpPaymentMethods, CargoCorpPaymentMethods cargoCorpPaymentMethods, PersonalWalletPaymentMethods personalWalletPaymentMethods, SharedPaymentMethods sharedPaymentMethods, YbWalletPaymentMethods ybWalletPaymentMethods, YangoPayPaymentMethod yangoPayPaymentMethod, String str, String str2, LastPaymentMethod lastPaymentMethod, String str3, String str4, String str5, LocationInfo locationInfo, String str6, SbpTokensPaymentMethods sbpTokensPaymentMethods, MBankAccountPaymentMethod mBankAccountPaymentMethod, ComplementPaymentMethod complementPaymentMethod, List list, ListPaymentMethodsUiDto listPaymentMethodsUiDto, List list2) {
        SbpTokensPaymentMethods sbpTokensPaymentMethods2;
        MBankAccountPaymentMethod mBankAccountPaymentMethod2;
        ComplementPaymentMethod complementPaymentMethod2;
        if ((i & 1) == 0) {
            CardPaymentMethods.Companion.getClass();
            cardPaymentMethods = new CardPaymentMethods(10);
        }
        this.a = cardPaymentMethods;
        int i2 = i & 2;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            CashLikePaymentMethods.Companion.getClass();
            this.b = new CashLikePaymentMethods(emptyList);
        } else {
            this.b = cashLikePaymentMethods;
        }
        if ((i & 4) == 0) {
            CorpPaymentMethods.Companion.getClass();
            this.c = new CorpPaymentMethods(emptyList);
        } else {
            this.c = corpPaymentMethods;
        }
        if ((i & 8) == 0) {
            CargoCorpPaymentMethods.Companion.getClass();
            this.d = new CargoCorpPaymentMethods(0);
        } else {
            this.d = cargoCorpPaymentMethods;
        }
        if ((i & 16) == 0) {
            PersonalWalletPaymentMethods.Companion.getClass();
            this.e = new PersonalWalletPaymentMethods(0);
        } else {
            this.e = personalWalletPaymentMethods;
        }
        if ((i & 32) == 0) {
            SharedPaymentMethods.Companion.getClass();
            this.f = new SharedPaymentMethods(emptyList, emptyList);
        } else {
            this.f = sharedPaymentMethods;
        }
        if ((i & 64) == 0) {
            YbWalletPaymentMethods.Companion.getClass();
            this.g = new YbWalletPaymentMethods(0);
        } else {
            this.g = ybWalletPaymentMethods;
        }
        if ((i & 128) == 0) {
            YangoPayPaymentMethod.Companion.getClass();
            this.h = new YangoPayPaymentMethod(0);
        } else {
            this.h = yangoPayPaymentMethod;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = str2;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = lastPaymentMethod;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = str3;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = str4;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = str5;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = locationInfo;
        }
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = str6;
        }
        if ((65536 & i) == 0) {
            SbpTokensPaymentMethods.Companion.getClass();
            sbpTokensPaymentMethods2 = SbpTokensPaymentMethods.e;
        } else {
            sbpTokensPaymentMethods2 = sbpTokensPaymentMethods;
        }
        this.q = sbpTokensPaymentMethods2;
        if ((131072 & i) == 0) {
            MBankAccountPaymentMethod.Companion.getClass();
            mBankAccountPaymentMethod2 = new MBankAccountPaymentMethod(null, null);
        } else {
            mBankAccountPaymentMethod2 = mBankAccountPaymentMethod;
        }
        this.r = mBankAccountPaymentMethod2;
        if ((262144 & i) == 0) {
            ComplementPaymentMethod.Companion.getClass();
            complementPaymentMethod2 = new ComplementPaymentMethod(0);
        } else {
            complementPaymentMethod2 = complementPaymentMethod;
        }
        this.s = complementPaymentMethod2;
        if ((524288 & i) == 0) {
            this.t = emptyList;
        } else {
            this.t = list;
        }
        if ((1048576 & i) == 0) {
            this.u = null;
        } else {
            this.u = listPaymentMethodsUiDto;
        }
        if ((i & 2097152) == 0) {
            this.v = emptyList;
        } else {
            this.v = list2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List] */
    public static PaymentMethods a(PaymentMethods paymentMethods, CardPaymentMethods cardPaymentMethods, PersonalWalletPaymentMethods personalWalletPaymentMethods, SharedPaymentMethods sharedPaymentMethods, SbpTokensPaymentMethods sbpTokensPaymentMethods, MBankAccountPaymentMethod mBankAccountPaymentMethod, ArrayList arrayList, int i) {
        CardPaymentMethods cardPaymentMethods2 = (i & 1) != 0 ? paymentMethods.a : cardPaymentMethods;
        CashLikePaymentMethods cashLikePaymentMethods = paymentMethods.b;
        CorpPaymentMethods corpPaymentMethods = paymentMethods.c;
        CargoCorpPaymentMethods cargoCorpPaymentMethods = paymentMethods.d;
        PersonalWalletPaymentMethods personalWalletPaymentMethods2 = (i & 16) != 0 ? paymentMethods.e : personalWalletPaymentMethods;
        SharedPaymentMethods sharedPaymentMethods2 = (i & 32) != 0 ? paymentMethods.f : sharedPaymentMethods;
        YbWalletPaymentMethods ybWalletPaymentMethods = paymentMethods.g;
        YangoPayPaymentMethod yangoPayPaymentMethod = paymentMethods.h;
        String str = paymentMethods.i;
        String str2 = paymentMethods.j;
        LastPaymentMethod lastPaymentMethod = paymentMethods.k;
        String str3 = paymentMethods.l;
        String str4 = paymentMethods.m;
        String str5 = paymentMethods.n;
        LocationInfo locationInfo = paymentMethods.o;
        String str6 = paymentMethods.p;
        SbpTokensPaymentMethods sbpTokensPaymentMethods2 = (i & 65536) != 0 ? paymentMethods.q : sbpTokensPaymentMethods;
        MBankAccountPaymentMethod mBankAccountPaymentMethod2 = (i & 131072) != 0 ? paymentMethods.r : mBankAccountPaymentMethod;
        ComplementPaymentMethod complementPaymentMethod = paymentMethods.s;
        ArrayList arrayList2 = (i & 524288) != 0 ? paymentMethods.t : arrayList;
        ListPaymentMethodsUiDto listPaymentMethodsUiDto = paymentMethods.u;
        List list = paymentMethods.v;
        paymentMethods.getClass();
        return new PaymentMethods(cardPaymentMethods2, cashLikePaymentMethods, corpPaymentMethods, cargoCorpPaymentMethods, personalWalletPaymentMethods2, sharedPaymentMethods2, ybWalletPaymentMethods, yangoPayPaymentMethod, str, str2, lastPaymentMethod, str3, str4, str5, locationInfo, str6, sbpTokensPaymentMethods2, mBankAccountPaymentMethod2, complementPaymentMethod, arrayList2, listPaymentMethodsUiDto, list);
    }

    public final ArrayList b() {
        List list = this.t;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof Kaspi) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final ArrayList c() {
        List list = this.t;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof NequiToken) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((NequiToken) next).getE() == null) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    public final ArrayList d() {
        List list = this.t;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof YapeToken) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((YapeToken) next).getE() == null) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    public final ArrayList e() {
        List list = this.t;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof SbpBindToken) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentMethods)) {
            return false;
        }
        PaymentMethods paymentMethods = (PaymentMethods) obj;
        return jl40.l(this.a, paymentMethods.a) && jl40.l(this.b, paymentMethods.b) && jl40.l(this.c, paymentMethods.c) && jl40.l(this.d, paymentMethods.d) && jl40.l(this.e, paymentMethods.e) && jl40.l(this.f, paymentMethods.f) && jl40.l(this.g, paymentMethods.g) && jl40.l(this.h, paymentMethods.h) && jl40.l(this.i, paymentMethods.i) && jl40.l(this.j, paymentMethods.j) && jl40.l(this.k, paymentMethods.k) && jl40.l(this.l, paymentMethods.l) && jl40.l(this.m, paymentMethods.m) && jl40.l(this.n, paymentMethods.n) && jl40.l(this.o, paymentMethods.o) && jl40.l(this.p, paymentMethods.p) && jl40.l(this.q, paymentMethods.q) && jl40.l(this.r, paymentMethods.r) && jl40.l(this.s, paymentMethods.s) && jl40.l(this.t, paymentMethods.t) && jl40.l(this.u, paymentMethods.u) && jl40.l(this.v, paymentMethods.v);
    }

    public final int hashCode() {
        int c = unr0.c(unr0.c((this.f.hashCode() + ((this.e.hashCode() + unr0.c((this.c.hashCode() + unr0.c(this.a.hashCode() * 31, 31, this.b.a)) * 31, 31, this.d.a)) * 31)) * 31, 31, this.g.a), 31, this.h.a);
        String str = this.i;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.j;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        LastPaymentMethod lastPaymentMethod = this.k;
        int hashCode3 = (hashCode2 + (lastPaymentMethod == null ? 0 : lastPaymentMethod.hashCode())) * 31;
        String str3 = this.l;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.m;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.n;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        LocationInfo locationInfo = this.o;
        int hashCode7 = (hashCode6 + (locationInfo == null ? 0 : locationInfo.hashCode())) * 31;
        String str6 = this.p;
        int c2 = unr0.c(unr0.c((this.r.hashCode() + ((this.q.hashCode() + ((hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31)) * 31)) * 31, 31, this.s.a), 31, this.t);
        ListPaymentMethodsUiDto listPaymentMethodsUiDto = this.u;
        return this.v.hashCode() + ((c2 + (listPaymentMethodsUiDto != null ? listPaymentMethodsUiDto.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaymentMethods(card=");
        sb.append(this.a);
        sb.append(", cashLike=");
        sb.append(this.b);
        sb.append(", corp=");
        sb.append(this.c);
        sb.append(", cargoCorp=");
        sb.append(this.d);
        sb.append(", personalWallet=");
        sb.append(this.e);
        sb.append(", shared=");
        sb.append(this.f);
        sb.append(", ybWallet=");
        sb.append(this.g);
        sb.append(", yangoPayMethod=");
        sb.append(this.h);
        sb.append(", error=");
        g8e.D(sb, this.i, ", text=", this.j, ", lastPaymentMethod=");
        sb.append(this.k);
        sb.append(", binsInfoFileUrl=");
        sb.append(this.l);
        sb.append(", bankIconsFileUrl=");
        g8e.D(sb, this.m, ", googlePayPublicKey=", this.n, ", locationInfo=");
        sb.append(this.o);
        sb.append(", serviceToken=");
        sb.append(this.p);
        sb.append(", sbpTokens=");
        sb.append(this.q);
        sb.append(", mBankAccountPaymentMethod=");
        sb.append(this.r);
        sb.append(", complement=");
        sb.append(this.s);
        sb.append(", paymentMethodsList=");
        sb.append(this.t);
        sb.append(", ui=");
        sb.append(this.u);
        sb.append(", bindingsInProgress=");
        sb.append(this.v);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/data/model/response/PaymentMethods$CargoCorpPaymentMethods;", "", "Companion", "com/yandex/go/payments/data/model/response/t0", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class CargoCorpPaymentMethods {
        public static final t0 Companion = new t0();
        public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ks90(18))};
        public final List a;

        public /* synthetic */ CargoCorpPaymentMethods(int i, List list) {
            if ((i & 1) == 0) {
                this.a = EmptyList.a;
            } else {
                this.a = list;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CargoCorpPaymentMethods) && jl40.l(this.a, ((CargoCorpPaymentMethods) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tse0.k("CargoCorpPaymentMethods(availableClients=", Extension.C_BRAKE, this.a);
        }

        public CargoCorpPaymentMethods(int i) {
            this.a = EmptyList.a;
        }

        public CargoCorpPaymentMethods() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/data/model/response/PaymentMethods$CashLikePaymentMethods;", "", "Companion", "com/yandex/go/payments/data/model/response/u0", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class CashLikePaymentMethods {
        public static final u0 Companion = new u0();
        public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ks90(19))};
        public final List a;

        public /* synthetic */ CashLikePaymentMethods(int i, List list) {
            if ((i & 1) == 0) {
                this.a = EmptyList.a;
            } else {
                this.a = list;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CashLikePaymentMethods) && jl40.l(this.a, ((CashLikePaymentMethods) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tse0.k("CashLikePaymentMethods(availableAccounts=", Extension.C_BRAKE, this.a);
        }

        public CashLikePaymentMethods(List list) {
            this.a = list;
        }

        public CashLikePaymentMethods() {
            this(EmptyList.a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/data/model/response/PaymentMethods$ComplementPaymentMethod;", "", "Companion", "com/yandex/go/payments/data/model/response/w0", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class ComplementPaymentMethod {
        public static final w0 Companion = new w0();
        public static final i3y[] b;
        public final List a;

        static {
            y yVar = ComplementWallet.Companion;
            b = new i3y[]{kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ks90(20))};
        }

        public /* synthetic */ ComplementPaymentMethod(int i, List list) {
            if ((i & 1) == 0) {
                this.a = EmptyList.a;
            } else {
                this.a = list;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ComplementPaymentMethod) && jl40.l(this.a, ((ComplementPaymentMethod) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tse0.k("ComplementPaymentMethod(wallets=", Extension.C_BRAKE, this.a);
        }

        public ComplementPaymentMethod(int i) {
            this.a = EmptyList.a;
        }

        public ComplementPaymentMethod() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/data/model/response/PaymentMethods$YangoPayPaymentMethod;", "", "Companion", "com/yandex/go/payments/data/model/response/e1", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class YangoPayPaymentMethod {
        public static final e1 Companion = new e1();
        public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ks90(28))};
        public final List a;

        public /* synthetic */ YangoPayPaymentMethod(int i, List list) {
            if ((i & 1) == 0) {
                this.a = EmptyList.a;
            } else {
                this.a = list;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof YangoPayPaymentMethod) && jl40.l(this.a, ((YangoPayPaymentMethod) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tse0.k("YangoPayPaymentMethod(wallets=", Extension.C_BRAKE, this.a);
        }

        public YangoPayPaymentMethod(int i) {
            this.a = EmptyList.a;
        }

        public YangoPayPaymentMethod() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/data/model/response/PaymentMethods$YbWalletPaymentMethods;", "", "Companion", "com/yandex/go/payments/data/model/response/f1", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class YbWalletPaymentMethods {
        public static final f1 Companion = new f1();
        public static final i3y[] b;
        public final List a;

        static {
            c2 c2Var = YbWallet.Companion;
            b = new i3y[]{kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ks90(29))};
        }

        public /* synthetic */ YbWalletPaymentMethods(int i, List list) {
            if ((i & 1) == 0) {
                this.a = EmptyList.a;
            } else {
                this.a = list;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof YbWalletPaymentMethods) && jl40.l(this.a, ((YbWalletPaymentMethods) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tse0.k("YbWalletPaymentMethods(wallets=", Extension.C_BRAKE, this.a);
        }

        public YbWalletPaymentMethods(int i) {
            this.a = EmptyList.a;
        }

        public YbWalletPaymentMethods() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/data/model/response/PaymentMethods$CorpPaymentMethods;", "", "Companion", "com/yandex/go/payments/data/model/response/x0", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class CorpPaymentMethods {
        public static final x0 Companion = new x0();
        public static final i3y[] c;
        public final List a;
        public final boolean b;

        static {
            b0 b0Var = CorpAccount.Companion;
            c = new i3y[]{kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ks90(21)), null};
        }

        public /* synthetic */ CorpPaymentMethods(int i, boolean z, List list) {
            this.a = (i & 1) == 0 ? EmptyList.a : list;
            if ((i & 2) == 0) {
                this.b = false;
            } else {
                this.b = z;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CorpPaymentMethods)) {
                return false;
            }
            CorpPaymentMethods corpPaymentMethods = (CorpPaymentMethods) obj;
            return jl40.l(this.a, corpPaymentMethods.a) && this.b == corpPaymentMethods.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return xvz.o(this.a, "CorpPaymentMethods(availableAccounts=", ", isPaymentAvailable=", Extension.C_BRAKE, this.b);
        }

        public CorpPaymentMethods(List list) {
            this.a = list;
            this.b = false;
        }

        public CorpPaymentMethods() {
            this(EmptyList.a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/data/model/response/PaymentMethods$MBankAccountPaymentMethod;", "", "Companion", "com/yandex/go/payments/data/model/response/a1", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class MBankAccountPaymentMethod {
        public static final a1 Companion = new a1();
        public final MBankAccount a;
        public final AddPaymentMethodButton b;

        static {
            f fVar = AddPaymentMethodButton.Companion;
            p0 p0Var = MBankAccount.Companion;
        }

        public /* synthetic */ MBankAccountPaymentMethod(int i, MBankAccount mBankAccount, AddPaymentMethodButton addPaymentMethodButton) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = mBankAccount;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = addPaymentMethodButton;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MBankAccountPaymentMethod)) {
                return false;
            }
            MBankAccountPaymentMethod mBankAccountPaymentMethod = (MBankAccountPaymentMethod) obj;
            return jl40.l(this.a, mBankAccountPaymentMethod.a) && jl40.l(this.b, mBankAccountPaymentMethod.b);
        }

        public final int hashCode() {
            MBankAccount mBankAccount = this.a;
            int hashCode = (mBankAccount == null ? 0 : mBankAccount.hashCode()) * 31;
            AddPaymentMethodButton addPaymentMethodButton = this.b;
            return hashCode + (addPaymentMethodButton != null ? addPaymentMethodButton.hashCode() : 0);
        }

        public final String toString() {
            return "MBankAccountPaymentMethod(mBankAccount=" + this.a + ", addButton=" + this.b + Extension.C_BRAKE;
        }

        public MBankAccountPaymentMethod(MBankAccount mBankAccount, AddPaymentMethodButton addPaymentMethodButton) {
            this.a = mBankAccount;
            this.b = addPaymentMethodButton;
        }

        public MBankAccountPaymentMethod() {
            this(null, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/data/model/response/PaymentMethods$PersonalWalletPaymentMethods;", "", "Companion", "com/yandex/go/payments/data/model/response/b1", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class PersonalWalletPaymentMethods {
        public static final b1 Companion = new b1();
        public static final i3y[] c;
        public final List a;
        public final List b;

        static {
            k1 k1Var = PersonalAccount.Companion;
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            c = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new ks90(22)), kotlin.a.b(lazyThreadSafetyMode, new ks90(23))};
        }

        public /* synthetic */ PersonalWalletPaymentMethods(List list, List list2, int i) {
            int i2 = i & 1;
            EmptyList emptyList = EmptyList.a;
            if (i2 == 0) {
                this.a = emptyList;
            } else {
                this.a = list;
            }
            if ((i & 2) == 0) {
                this.b = emptyList;
            } else {
                this.b = list2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PersonalWalletPaymentMethods)) {
                return false;
            }
            PersonalWalletPaymentMethods personalWalletPaymentMethods = (PersonalWalletPaymentMethods) obj;
            return jl40.l(this.a, personalWalletPaymentMethods.a) && jl40.l(this.b, personalWalletPaymentMethods.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return xvz.l("PersonalWalletPaymentMethods(availableAccounts=", this.a, ", unavailableAccounts=", this.b, Extension.C_BRAKE);
        }

        public PersonalWalletPaymentMethods(int i) {
            EmptyList emptyList = EmptyList.a;
            this.a = emptyList;
            this.b = emptyList;
        }

        public PersonalWalletPaymentMethods() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/data/model/response/PaymentMethods$SharedPaymentMethods;", "", "Companion", "com/yandex/go/payments/data/model/response/d1", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class SharedPaymentMethods {
        public static final d1 Companion = new d1();
        public static final i3y[] c;
        public final List a;
        public final List b;

        static {
            u1 u1Var = SharedAccount.Companion;
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            c = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new ks90(26)), kotlin.a.b(lazyThreadSafetyMode, new ks90(27))};
        }

        public /* synthetic */ SharedPaymentMethods(List list, List list2, int i) {
            int i2 = i & 1;
            EmptyList emptyList = EmptyList.a;
            if (i2 == 0) {
                this.a = emptyList;
            } else {
                this.a = list;
            }
            if ((i & 2) == 0) {
                this.b = emptyList;
            } else {
                this.b = list2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SharedPaymentMethods)) {
                return false;
            }
            SharedPaymentMethods sharedPaymentMethods = (SharedPaymentMethods) obj;
            return jl40.l(this.a, sharedPaymentMethods.a) && jl40.l(this.b, sharedPaymentMethods.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return xvz.l("SharedPaymentMethods(ownerAccounts=", this.a, ", memberAccounts=", this.b, Extension.C_BRAKE);
        }

        public SharedPaymentMethods(List list, List list2) {
            this.a = list;
            this.b = list2;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public SharedPaymentMethods() {
            this(r0, r0);
            EmptyList emptyList = EmptyList.a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/data/model/response/PaymentMethods$LastPaymentMethod;", "", "Companion", "$serializer", "com/yandex/go/payments/data/model/response/y0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class LastPaymentMethod {
        public static final y0 Companion = new y0();
        public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new t7a0(4)), null};
        public final String a;
        public final PaymentMethod$Type b;
        public final String c;

        public /* synthetic */ LastPaymentMethod(int i, String str, PaymentMethod$Type paymentMethod$Type, String str2) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = paymentMethod$Type;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = str2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LastPaymentMethod)) {
                return false;
            }
            LastPaymentMethod lastPaymentMethod = (LastPaymentMethod) obj;
            return jl40.l(this.a, lastPaymentMethod.a) && this.b == lastPaymentMethod.b && jl40.l(this.c, lastPaymentMethod.c);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            PaymentMethod$Type paymentMethod$Type = this.b;
            int hashCode2 = (hashCode + (paymentMethod$Type == null ? 0 : paymentMethod$Type.hashCode())) * 31;
            String str2 = this.c;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LastPaymentMethod(id=");
            sb.append(this.a);
            sb.append(", type=");
            sb.append(this.b);
            sb.append(", updatedAt=");
            return oyr.t(sb, this.c, Extension.C_BRAKE);
        }

        public LastPaymentMethod() {
            this.a = null;
            this.b = null;
            this.c = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/data/model/response/PaymentMethods$LocationInfo;", "", "Companion", "$serializer", "com/yandex/go/payments/data/model/response/z0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class LocationInfo {
        public static final z0 Companion = new z0();
        public final String a;
        public final String b;
        public final Integer c;

        public /* synthetic */ LocationInfo(String str, int i, Integer num, String str2) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = num;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LocationInfo)) {
                return false;
            }
            LocationInfo locationInfo = (LocationInfo) obj;
            return jl40.l(this.a, locationInfo.a) && jl40.l(this.b, locationInfo.b) && jl40.l(this.c, locationInfo.c);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.c;
            return hashCode2 + (num != null ? num.hashCode() : 0);
        }

        public final String toString() {
            return oo31.j(b64.v("LocationInfo(countryCode=", this.a, ", currency=", this.b, ", regionId="), this.c, Extension.C_BRAKE);
        }

        public LocationInfo() {
            this.a = null;
            this.b = null;
            this.c = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/data/model/response/PaymentMethods$SbpTokensPaymentMethods;", "", "Companion", "com/yandex/go/payments/data/model/response/c1", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class SbpTokensPaymentMethods {
        public static final c1 Companion = new c1();
        public static final i3y[] d;
        public static final SbpTokensPaymentMethods e;
        public final List a;
        public final List b;
        public final AddSbpTokenButtonDto c;

        static {
            g gVar = AddSbpTokenButtonDto.Companion;
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            d = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new ks90(24)), kotlin.a.b(lazyThreadSafetyMode, new ks90(25)), null};
            e = new SbpTokensPaymentMethods(0);
        }

        public /* synthetic */ SbpTokensPaymentMethods(int i, List list, List list2, AddSbpTokenButtonDto addSbpTokenButtonDto) {
            int i2 = i & 1;
            EmptyList emptyList = EmptyList.a;
            if (i2 == 0) {
                this.a = emptyList;
            } else {
                this.a = list;
            }
            if ((i & 2) == 0) {
                this.b = emptyList;
            } else {
                this.b = list2;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = addSbpTokenButtonDto;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SbpTokensPaymentMethods)) {
                return false;
            }
            SbpTokensPaymentMethods sbpTokensPaymentMethods = (SbpTokensPaymentMethods) obj;
            return jl40.l(this.a, sbpTokensPaymentMethods.a) && jl40.l(this.b, sbpTokensPaymentMethods.b) && jl40.l(this.c, sbpTokensPaymentMethods.c);
        }

        public final int hashCode() {
            int c = unr0.c(this.a.hashCode() * 31, 31, this.b);
            AddSbpTokenButtonDto addSbpTokenButtonDto = this.c;
            return c + (addSbpTokenButtonDto == null ? 0 : addSbpTokenButtonDto.hashCode());
        }

        public final String toString() {
            StringBuilder v = qv10.v("SbpTokensPaymentMethods(availableTokens=", this.a, ", unverifiedSbpTokens=", this.b, ", addSbpTokenButtonDto=");
            v.append(this.c);
            v.append(Extension.C_BRAKE);
            return v.toString();
        }

        public SbpTokensPaymentMethods() {
            this(0);
        }

        public SbpTokensPaymentMethods(List list, List list2, AddSbpTokenButtonDto addSbpTokenButtonDto) {
            this.a = list;
            this.b = list2;
            this.c = addSbpTokenButtonDto;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ SbpTokensPaymentMethods(int i) {
            this(r0, r0, null);
            EmptyList emptyList = EmptyList.a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/data/model/response/PaymentMethods$CardPaymentMethods;", "", "Companion", "com/yandex/go/payments/data/model/response/s0", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class CardPaymentMethods {
        public static final s0 Companion = new s0();
        public static final i3y[] e;
        public final List a;
        public final List b;
        public final boolean c;
        public final CardProfile d;

        static {
            v vVar = CardProfile.Companion;
            s sVar = Card.Companion;
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            e = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new ks90(16)), kotlin.a.b(lazyThreadSafetyMode, new ks90(17)), null, null};
        }

        public /* synthetic */ CardPaymentMethods(int i, List list, List list2, boolean z, CardProfile cardProfile) {
            int i2 = i & 1;
            EmptyList emptyList = EmptyList.a;
            if (i2 == 0) {
                this.a = emptyList;
            } else {
                this.a = list;
            }
            if ((i & 2) == 0) {
                this.b = emptyList;
            } else {
                this.b = list2;
            }
            if ((i & 4) == 0) {
                this.c = false;
            } else {
                this.c = z;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = cardProfile;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CardPaymentMethods)) {
                return false;
            }
            CardPaymentMethods cardPaymentMethods = (CardPaymentMethods) obj;
            return jl40.l(this.a, cardPaymentMethods.a) && jl40.l(this.b, cardPaymentMethods.b) && this.c == cardPaymentMethods.c && jl40.l(this.d, cardPaymentMethods.d);
        }

        public final int hashCode() {
            int e2 = unr0.e(unr0.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
            CardProfile cardProfile = this.d;
            return e2 + (cardProfile == null ? 0 : cardProfile.hashCode());
        }

        public final String toString() {
            StringBuilder v = qv10.v("CardPaymentMethods(availableCards=", this.a, ", unverifiedCards=", this.b, ", isPaymentAvailable=");
            v.append(this.c);
            v.append(", cardStorageProfile=");
            v.append(this.d);
            v.append(Extension.C_BRAKE);
            return v.toString();
        }

        public CardPaymentMethods() {
            this(15);
        }

        public CardPaymentMethods(List list, List list2, boolean z, CardProfile cardProfile) {
            this.a = list;
            this.b = list2;
            this.c = z;
            this.d = cardProfile;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ CardPaymentMethods(int i) {
            this(r3, r3, false, null);
            EmptyList emptyList = EmptyList.a;
        }
    }

    public PaymentMethods() {
        this(0);
    }

    public PaymentMethods(CardPaymentMethods cardPaymentMethods, CashLikePaymentMethods cashLikePaymentMethods, CorpPaymentMethods corpPaymentMethods, CargoCorpPaymentMethods cargoCorpPaymentMethods, PersonalWalletPaymentMethods personalWalletPaymentMethods, SharedPaymentMethods sharedPaymentMethods, YbWalletPaymentMethods ybWalletPaymentMethods, YangoPayPaymentMethod yangoPayPaymentMethod, String str, String str2, LastPaymentMethod lastPaymentMethod, String str3, String str4, String str5, LocationInfo locationInfo, String str6, SbpTokensPaymentMethods sbpTokensPaymentMethods, MBankAccountPaymentMethod mBankAccountPaymentMethod, ComplementPaymentMethod complementPaymentMethod, List list, ListPaymentMethodsUiDto listPaymentMethodsUiDto, List list2) {
        this.a = cardPaymentMethods;
        this.b = cashLikePaymentMethods;
        this.c = corpPaymentMethods;
        this.d = cargoCorpPaymentMethods;
        this.e = personalWalletPaymentMethods;
        this.f = sharedPaymentMethods;
        this.g = ybWalletPaymentMethods;
        this.h = yangoPayPaymentMethod;
        this.i = str;
        this.j = str2;
        this.k = lastPaymentMethod;
        this.l = str3;
        this.m = str4;
        this.n = str5;
        this.o = locationInfo;
        this.p = str6;
        this.q = sbpTokensPaymentMethods;
        this.r = mBankAccountPaymentMethod;
        this.s = complementPaymentMethod;
        this.t = list;
        this.u = listPaymentMethodsUiDto;
        this.v = list2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PaymentMethods(int i) {
        this(r2, r3, r4, r5, r6, r7, r8, r9, null, null, null, null, null, null, null, null, r18, r10, new ComplementPaymentMethod(0), r0, null, r0);
        CardPaymentMethods.Companion.getClass();
        CardPaymentMethods cardPaymentMethods = new CardPaymentMethods(10);
        CashLikePaymentMethods.Companion.getClass();
        EmptyList emptyList = EmptyList.a;
        CashLikePaymentMethods cashLikePaymentMethods = new CashLikePaymentMethods(emptyList);
        CorpPaymentMethods.Companion.getClass();
        CorpPaymentMethods corpPaymentMethods = new CorpPaymentMethods(emptyList);
        CargoCorpPaymentMethods.Companion.getClass();
        CargoCorpPaymentMethods cargoCorpPaymentMethods = new CargoCorpPaymentMethods(0);
        PersonalWalletPaymentMethods.Companion.getClass();
        PersonalWalletPaymentMethods personalWalletPaymentMethods = new PersonalWalletPaymentMethods(0);
        SharedPaymentMethods.Companion.getClass();
        SharedPaymentMethods sharedPaymentMethods = new SharedPaymentMethods(emptyList, emptyList);
        YbWalletPaymentMethods.Companion.getClass();
        YbWalletPaymentMethods ybWalletPaymentMethods = new YbWalletPaymentMethods(0);
        YangoPayPaymentMethod.Companion.getClass();
        YangoPayPaymentMethod yangoPayPaymentMethod = new YangoPayPaymentMethod(0);
        SbpTokensPaymentMethods.Companion.getClass();
        SbpTokensPaymentMethods sbpTokensPaymentMethods = SbpTokensPaymentMethods.e;
        MBankAccountPaymentMethod.Companion.getClass();
        MBankAccountPaymentMethod mBankAccountPaymentMethod = new MBankAccountPaymentMethod(null, null);
        ComplementPaymentMethod.Companion.getClass();
    }
}
