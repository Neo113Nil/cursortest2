package com.yandex.go.payments.shared.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.ief;
import defpackage.pd;
import defpackage.qmr0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.gopayments.dto.SharedAccountType;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/payments/shared/data/model/Account;", "", "Companion", "Settings", "ReportOption", "$serializer", "com/yandex/go/payments/shared/data/model/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class Account {
    public static final a Companion = new a();
    public static final i3y[] q = {null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new pd(8)), null, null, null, null, null, null, null, null, null, null, null, null};
    public final String a;
    public final String b;
    public final AccountDetails c;
    public final List d;
    public final SharedPayment e;
    public final boolean f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final Settings l;
    public final ief m;
    public final boolean n;
    public final Long o;
    public final boolean p;

    public Account(int i, String str, String str2, AccountDetails accountDetails, List list, SharedPayment sharedPayment, boolean z, String str3, String str4, String str5, String str6, String str7, Settings settings, ief iefVar, boolean z2, Long l, boolean z3) {
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
            this.c = AccountDetails.d;
        } else {
            this.c = accountDetails;
        }
        if ((i & 8) == 0) {
            this.d = EmptyList.a;
        } else {
            this.d = list;
        }
        int i2 = 0;
        if ((i & 16) == 0) {
            SharedPayment.Companion.getClass();
            this.e = new SharedPayment(i2);
        } else {
            this.e = sharedPayment;
        }
        if ((i & 32) == 0) {
            this.f = false;
        } else {
            this.f = z;
        }
        if ((i & 64) == 0) {
            this.g = "";
        } else {
            this.g = str3;
        }
        if ((i & 128) == 0) {
            this.h = "";
        } else {
            this.h = str4;
        }
        if ((i & 256) == 0) {
            this.i = "";
        } else {
            this.i = str5;
        }
        if ((i & 512) == 0) {
            this.j = "";
        } else {
            this.j = str6;
        }
        if ((i & 1024) == 0) {
            this.k = "";
        } else {
            this.k = str7;
        }
        if ((i & 2048) == 0) {
            this.l = Settings.f;
        } else {
            this.l = settings;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = iefVar;
        }
        if ((i & 8192) == 0) {
            this.n = false;
        } else {
            this.n = z2;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = l;
        }
        if ((i & 32768) == 0) {
            this.p = false;
        } else {
            this.p = z3;
        }
    }

    /* renamed from: a, reason: from getter */
    public final String getB() {
        return this.b;
    }

    public final String b() {
        String str = this.c.a;
        return str == null ? "" : str;
    }

    public final SharedAccountType c() {
        SharedAccountType.Companion.getClass();
        return qmr0.a(this.b);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/data/model/Account$ReportOption;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/data/model/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class ReportOption {
        public static final b Companion = new b();
        public final String a;
        public final String b;
        public final String c;

        public /* synthetic */ ReportOption(int i, String str, String str2, String str3) {
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
        }

        public ReportOption() {
            this.a = "";
            this.b = "";
            this.c = "";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/data/model/Account$Settings;", "", "Companion", "com/yandex/go/payments/shared/data/model/c", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Settings {
        public static final c Companion = new c();
        public static final i3y[] e = {null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new pd(9))};
        public static final Settings f = new Settings(0);
        public final boolean a;
        public final boolean b;
        public final boolean c;
        public final List d;

        public /* synthetic */ Settings(int i, boolean z, boolean z2, boolean z3, List list) {
            if ((i & 1) == 0) {
                this.a = false;
            } else {
                this.a = z;
            }
            if ((i & 2) == 0) {
                this.b = false;
            } else {
                this.b = z2;
            }
            if ((i & 4) == 0) {
                this.c = false;
            } else {
                this.c = z3;
            }
            if ((i & 8) == 0) {
                this.d = EmptyList.a;
            } else {
                this.d = list;
            }
        }

        public Settings(int i) {
            this.a = false;
            this.b = false;
            this.c = false;
            this.d = EmptyList.a;
        }

        public Settings() {
            this(0);
        }
    }

    public Account() {
        AccountDetails accountDetails = AccountDetails.d;
        SharedPayment.Companion.getClass();
        SharedPayment sharedPayment = new SharedPayment(0);
        Settings settings = Settings.f;
        this.a = "";
        this.b = "";
        this.c = accountDetails;
        this.d = EmptyList.a;
        this.e = sharedPayment;
        this.f = false;
        this.g = "";
        this.h = "";
        this.i = "";
        this.j = "";
        this.k = "";
        this.l = settings;
        this.m = null;
        this.n = false;
        this.o = null;
        this.p = false;
    }
}
