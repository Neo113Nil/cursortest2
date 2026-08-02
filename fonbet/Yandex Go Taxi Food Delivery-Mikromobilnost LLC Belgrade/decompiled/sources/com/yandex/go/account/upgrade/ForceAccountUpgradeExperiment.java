package com.yandex.go.account.upgrade;

import defpackage.b64;
import defpackage.c6z;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jsq0;
import defpackage.k4o;
import defpackage.ksq0;
import defpackage.nnm;
import defpackage.ogr;
import defpackage.unr0;
import defpackage.w96;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0005\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/yandex/go/account/upgrade/ForceAccountUpgradeExperiment;", "Lw96;", "Lc6z;", "Companion", "AccountType", "MenuItem", "ModalView", "com/yandex/go/account/upgrade/h", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ForceAccountUpgradeExperiment extends w96 implements c6z {
    public static final h Companion = new h();
    public static final i3y[] g;
    public static final ForceAccountUpgradeExperiment h;
    public final boolean b;
    public final Map c;
    public final jsq0 d;
    public final MenuItem e;
    public final ModalView f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/account/upgrade/ForceAccountUpgradeExperiment$AccountType;", "", "Companion", "com/yandex/go/account/upgrade/g", "SOCIAL", "LITE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class AccountType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ AccountType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final g Companion;
        public static final AccountType LITE;
        public static final AccountType SOCIAL;

        static {
            AccountType accountType = new AccountType("SOCIAL", 0);
            SOCIAL = accountType;
            AccountType accountType2 = new AccountType("LITE", 1);
            LITE = accountType2;
            AccountType[] accountTypeArr = {accountType, accountType2};
            $VALUES = accountTypeArr;
            $ENTRIES = kotlin.enums.a.a(accountTypeArr);
            Companion = new g();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ogr(15));
        }

        public static AccountType valueOf(String str) {
            return (AccountType) Enum.valueOf(AccountType.class, str);
        }

        public static AccountType[] values() {
            return (AccountType[]) $VALUES.clone();
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        g = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new ogr(13)), kotlin.a.b(lazyThreadSafetyMode, new ogr(14)), null, null};
        h = new ForceAccountUpgradeExperiment(0);
    }

    public /* synthetic */ ForceAccountUpgradeExperiment(int i, boolean z, Map map, jsq0 jsq0Var, MenuItem menuItem, ModalView modalView) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = kotlin.collections.b.f();
        } else {
            this.c = map;
        }
        if ((i & 4) == 0) {
            this.d = ksq0.a;
        } else {
            this.d = jsq0Var;
        }
        if ((i & 8) == 0) {
            this.e = null;
        } else {
            this.e = menuItem;
        }
        if ((i & 16) == 0) {
            this.f = null;
        } else {
            this.f = modalView;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ForceAccountUpgradeExperiment)) {
            return false;
        }
        ForceAccountUpgradeExperiment forceAccountUpgradeExperiment = (ForceAccountUpgradeExperiment) obj;
        return this.b == forceAccountUpgradeExperiment.b && jl40.l(this.c, forceAccountUpgradeExperiment.c) && jl40.l(this.d, forceAccountUpgradeExperiment.d) && jl40.l(this.e, forceAccountUpgradeExperiment.e) && jl40.l(this.f, forceAccountUpgradeExperiment.f);
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
        int c = unr0.c(unr0.d(Boolean.hashCode(this.b) * 31, 31, this.c), 31, this.d.a);
        MenuItem menuItem = this.e;
        int hashCode = (c + (menuItem == null ? 0 : menuItem.hashCode())) * 31;
        ModalView modalView = this.f;
        return hashCode + (modalView != null ? modalView.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder l = nnm.l("ForceAccountUpgradeExperiment(enabled=", ", l10n=", ", accountTypes=", this.c, this.b);
        l.append(this.d);
        l.append(", menuItem=");
        l.append(this.e);
        l.append(", modalView=");
        l.append(this.f);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/account/upgrade/ForceAccountUpgradeExperiment$MenuItem;", "", "Companion", "$serializer", "com/yandex/go/account/upgrade/i", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class MenuItem {
        public static final i Companion = new i();
        public final String a;
        public final String b;

        public /* synthetic */ MenuItem(int i, String str, String str2) {
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
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MenuItem)) {
                return false;
            }
            MenuItem menuItem = (MenuItem) obj;
            return jl40.l(this.a, menuItem.a) && jl40.l(this.b, menuItem.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return unr0.p("MenuItem(title=", this.a, ", subtitle=", this.b, Extension.C_BRAKE);
        }

        public MenuItem() {
            this.a = "";
            this.b = "";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/account/upgrade/ForceAccountUpgradeExperiment$ModalView;", "", "Companion", "$serializer", "com/yandex/go/account/upgrade/j", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class ModalView {
        public static final j Companion = new j();
        public final String a;
        public final String b;
        public final String c;
        public final double d;

        public /* synthetic */ ModalView(int i, String str, String str2, double d, String str3) {
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
                this.d = 0.0d;
            } else {
                this.d = d;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ModalView)) {
                return false;
            }
            ModalView modalView = (ModalView) obj;
            return jl40.l(this.a, modalView.a) && jl40.l(this.b, modalView.b) && jl40.l(this.c, modalView.c) && Double.compare(this.d, modalView.d) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.d) + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder v = b64.v("ModalView(title=", this.a, ", subtitle=", this.b, ", buttonText=");
            v.append(this.c);
            v.append(", nextShowDelaySeconds=");
            v.append(this.d);
            v.append(Extension.C_BRAKE);
            return v.toString();
        }

        public ModalView() {
            this.a = "";
            this.b = "";
            this.c = "";
            this.d = 0.0d;
        }
    }

    public ForceAccountUpgradeExperiment() {
        this(0);
    }

    public ForceAccountUpgradeExperiment(int i) {
        Map f = kotlin.collections.b.f();
        jsq0 jsq0Var = ksq0.a;
        this.b = false;
        this.c = f;
        this.d = jsq0Var;
        this.e = null;
        this.f = null;
    }
}
