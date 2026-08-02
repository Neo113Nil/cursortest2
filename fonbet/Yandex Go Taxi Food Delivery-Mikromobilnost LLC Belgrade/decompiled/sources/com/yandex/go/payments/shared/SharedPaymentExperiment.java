package com.yandex.go.payments.shared;

import defpackage.c6z;
import defpackage.dwq0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.xn11;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/yandex/go/payments/shared/SharedPaymentExperiment;", "Lxn11;", "Lc6z;", "Companion", "RawType", "RawTypeDescription", "BusinessAccountCreationFlow", "Action", "CreateCorporateAccount", "AccountAction", "PlusMultiBanner", "com/yandex/go/payments/shared/k", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SharedPaymentExperiment implements xn11, c6z {
    public static final k Companion = new k();
    public static final i3y[] e;
    public static final SharedPaymentExperiment f;
    public final Map b;
    public final List c;
    public final boolean d;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new dwq0(16)), kotlin.a.b(lazyThreadSafetyMode, new dwq0(17)), null};
        f = new SharedPaymentExperiment(0);
    }

    public /* synthetic */ SharedPaymentExperiment(int i, List list, Map map, boolean z) {
        this.b = (i & 1) == 0 ? kotlin.collections.b.f() : map;
        this.c = (i & 2) == 0 ? EmptyList.a : list;
        if ((i & 4) == 0) {
            this.d = false;
        } else {
            this.d = z;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.b;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/SharedPaymentExperiment$Action;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/i", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Action {
        public static final i Companion = new i();
        public final String a;
        public final String b;

        public /* synthetic */ Action(int i, String str, String str2) {
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

        public Action(int i) {
            this.a = "";
            this.b = "";
        }

        public Action() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/SharedPaymentExperiment$RawTypeDescription;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/o", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class RawTypeDescription {
        public static final o Companion = new o();
        public final String a;
        public final String b;

        public /* synthetic */ RawTypeDescription(int i, String str, String str2) {
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

        public RawTypeDescription() {
            this.a = "";
            this.b = "";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/SharedPaymentExperiment$AccountAction;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/h", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class AccountAction {
        public static final h Companion = new h();
        public final String a;
        public final String b;
        public final String c;

        public /* synthetic */ AccountAction(int i, String str, String str2, String str3) {
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

        public AccountAction() {
            this.a = "";
            this.b = "";
            this.c = "";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/SharedPaymentExperiment$CreateCorporateAccount;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/l", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class CreateCorporateAccount {
        public static final l Companion = new l();
        public final String a;
        public final String b;
        public final String c;

        public /* synthetic */ CreateCorporateAccount(int i, String str, String str2, String str3) {
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

        public CreateCorporateAccount(int i) {
            this.a = "";
            this.b = "";
            this.c = "";
        }

        public CreateCorporateAccount() {
            this(0);
        }
    }

    public SharedPaymentExperiment() {
        this(0);
    }

    public SharedPaymentExperiment(Map map, List list, boolean z) {
        this.b = map;
        this.c = list;
        this.d = z;
    }

    public /* synthetic */ SharedPaymentExperiment(int i) {
        this(kotlin.collections.b.f(), EmptyList.a, false);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/SharedPaymentExperiment$PlusMultiBanner;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/m", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class PlusMultiBanner {
        public static final m Companion = new m();
        public final String a;
        public final String b;
        public final String c;
        public final String d;

        public /* synthetic */ PlusMultiBanner(int i, String str, String str2, String str3, String str4) {
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

        public PlusMultiBanner() {
            this.a = "";
            this.b = "";
            this.c = "";
            this.d = "";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/SharedPaymentExperiment$RawType;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/n", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class RawType {
        public static final n Companion = new n();
        public static final i3y[] m;
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final boolean f;
        public final List g;
        public final boolean h;
        public final String i;
        public final List j;
        public final PlusMultiBanner k;
        public final BusinessAccountCreationFlow l;

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            m = new i3y[]{null, null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new dwq0(18)), null, null, kotlin.a.b(lazyThreadSafetyMode, new dwq0(19)), null, null};
        }

        public /* synthetic */ RawType(int i, String str, String str2, String str3, String str4, String str5, boolean z, List list, boolean z2, String str6, List list2, PlusMultiBanner plusMultiBanner, BusinessAccountCreationFlow businessAccountCreationFlow) {
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
            if ((i & 16) == 0) {
                this.e = "";
            } else {
                this.e = str5;
            }
            if ((i & 32) == 0) {
                this.f = false;
            } else {
                this.f = z;
            }
            int i2 = i & 64;
            EmptyList emptyList = EmptyList.a;
            if (i2 == 0) {
                this.g = emptyList;
            } else {
                this.g = list;
            }
            if ((i & 128) == 0) {
                this.h = false;
            } else {
                this.h = z2;
            }
            if ((i & 256) == 0) {
                this.i = "";
            } else {
                this.i = str6;
            }
            if ((i & 512) == 0) {
                this.j = emptyList;
            } else {
                this.j = list2;
            }
            if ((i & 1024) == 0) {
                this.k = null;
            } else {
                this.k = plusMultiBanner;
            }
            if ((i & 2048) == 0) {
                this.l = null;
            } else {
                this.l = businessAccountCreationFlow;
            }
        }

        public RawType() {
            this.a = "";
            this.b = "";
            this.c = "";
            this.d = "";
            this.e = "";
            this.f = false;
            EmptyList emptyList = EmptyList.a;
            this.g = emptyList;
            this.h = false;
            this.i = "";
            this.j = emptyList;
            this.k = null;
            this.l = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/SharedPaymentExperiment$BusinessAccountCreationFlow;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/j", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class BusinessAccountCreationFlow {
        public static final j Companion = new j();
        public final boolean a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public final String h;
        public final String i;
        public final String j;
        public final Action k;
        public final CreateCorporateAccount l;

        public /* synthetic */ BusinessAccountCreationFlow(int i, boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Action action, CreateCorporateAccount createCorporateAccount) {
            if ((i & 1) == 0) {
                this.a = false;
            } else {
                this.a = z;
            }
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str;
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
                this.h = "";
            } else {
                this.h = str7;
            }
            if ((i & 256) == 0) {
                this.i = "";
            } else {
                this.i = str8;
            }
            if ((i & 512) == 0) {
                this.j = "";
            } else {
                this.j = str9;
            }
            if ((i & 1024) == 0) {
                this.k = new Action(0);
            } else {
                this.k = action;
            }
            if ((i & 2048) == 0) {
                this.l = new CreateCorporateAccount(0);
            } else {
                this.l = createCorporateAccount;
            }
        }

        public BusinessAccountCreationFlow() {
            Action action = new Action(0);
            CreateCorporateAccount createCorporateAccount = new CreateCorporateAccount(0);
            this.a = false;
            this.b = "";
            this.c = "";
            this.d = "";
            this.e = "";
            this.f = "";
            this.g = "";
            this.h = "";
            this.i = "";
            this.j = "";
            this.k = action;
            this.l = createCorporateAccount;
        }
    }
}
