package com.yandex.go.taxi.order.models.api.objects;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.vfy;
import defpackage.vix;
import defpackage.wh60;
import defpackage.x4e;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0005\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/objects/LackOfMoneyNotificationDto;", "Lwh60;", "Lvfy;", "Companion", "Informer", "Conditions", "RequiredCardBalance", "$serializer", "com/yandex/go/taxi/order/models/api/objects/r", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class LackOfMoneyNotificationDto implements wh60, vfy {
    public static final r Companion = new r();
    public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new vix(11)), null};
    public final int a;
    public final Map b;
    public final Informer c;

    public /* synthetic */ LackOfMoneyNotificationDto(int i, int i2, Map map, Informer informer) {
        this.a = (i & 1) == 0 ? 1 : i2;
        if ((i & 2) == 0) {
            this.b = kotlin.collections.b.f();
        } else {
            this.b = map;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = informer;
        }
    }

    @Override // defpackage.vfy
    /* renamed from: a, reason: from getter */
    public final int getA() {
        return this.a;
    }

    /* renamed from: b, reason: from getter */
    public final Informer getC() {
        return this.c;
    }

    public final RequiredCardBalance c() {
        Conditions conditions;
        Informer informer = this.c;
        if (informer == null || (conditions = informer.d) == null) {
            return null;
        }
        return conditions.a;
    }

    /* renamed from: d, reason: from getter */
    public final Map getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LackOfMoneyNotificationDto)) {
            return false;
        }
        LackOfMoneyNotificationDto lackOfMoneyNotificationDto = (LackOfMoneyNotificationDto) obj;
        return this.a == lackOfMoneyNotificationDto.a && jl40.l(this.b, lackOfMoneyNotificationDto.b) && jl40.l(this.c, lackOfMoneyNotificationDto.c);
    }

    public final int hashCode() {
        int d2 = unr0.d(Integer.hashCode(this.a) * 31, 31, this.b);
        Informer informer = this.c;
        return d2 + (informer == null ? 0 : informer.hashCode());
    }

    public final String toString() {
        return "LackOfMoneyNotificationDto(showCountLimit=" + this.a + ", translations=" + this.b + ", informer=" + this.c + Extension.C_BRAKE;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/objects/LackOfMoneyNotificationDto$Conditions;", "", "Companion", "com/yandex/go/taxi/order/models/api/objects/s", "$serializer", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Conditions {
        public static final s Companion = new s();
        public static final Conditions b;
        public final RequiredCardBalance a;

        static {
            RequiredCardBalance.Companion.getClass();
            b = new Conditions(RequiredCardBalance.c);
        }

        public /* synthetic */ Conditions(int i, RequiredCardBalance requiredCardBalance) {
            if ((i & 1) != 0) {
                this.a = requiredCardBalance;
            } else {
                RequiredCardBalance.Companion.getClass();
                this.a = RequiredCardBalance.c;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Conditions) && jl40.l(this.a, ((Conditions) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Conditions(requiredCardBalance=" + this.a + Extension.C_BRAKE;
        }

        public Conditions(RequiredCardBalance requiredCardBalance) {
            this.a = requiredCardBalance;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Conditions() {
            this(RequiredCardBalance.c);
            RequiredCardBalance.Companion.getClass();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/objects/LackOfMoneyNotificationDto$RequiredCardBalance;", "", "Companion", "com/yandex/go/taxi/order/models/api/objects/u", "$serializer", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class RequiredCardBalance {
        public static final u Companion = new u();
        public static final RequiredCardBalance c = new RequiredCardBalance(-1.0d, "null");
        public final double a;
        public final String b;

        public /* synthetic */ RequiredCardBalance(double d, int i, String str) {
            this.a = (i & 1) == 0 ? 0.0d : d;
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str;
            }
        }

        /* renamed from: a, reason: from getter */
        public final double getA() {
            return this.a;
        }

        /* renamed from: b, reason: from getter */
        public final String getB() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RequiredCardBalance)) {
                return false;
            }
            RequiredCardBalance requiredCardBalance = (RequiredCardBalance) obj;
            return Double.compare(this.a, requiredCardBalance.a) == 0 && jl40.l(this.b, requiredCardBalance.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Double.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "RequiredCardBalance(amount=" + this.a + ", currency=" + this.b + Extension.C_BRAKE;
        }

        public RequiredCardBalance(double d, String str) {
            this.a = d;
            this.b = str;
        }

        public RequiredCardBalance() {
            this(0.0d, "");
        }
    }

    public LackOfMoneyNotificationDto() {
        Map f = kotlin.collections.b.f();
        this.a = 1;
        this.b = f;
        this.c = null;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/objects/LackOfMoneyNotificationDto$Informer;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/objects/t", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Informer {
        public static final t Companion = new t();
        public final String a;
        public final String b;
        public final String c;
        public final Conditions d;
        public final boolean e;

        public Informer(int i, String str, String str2, String str3, Conditions conditions, boolean z) {
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
                Conditions.Companion.getClass();
                this.d = Conditions.b;
            } else {
                this.d = conditions;
            }
            if ((i & 16) == 0) {
                this.e = false;
            } else {
                this.e = z;
            }
        }

        /* renamed from: a, reason: from getter */
        public final boolean getE() {
            return this.e;
        }

        /* renamed from: b, reason: from getter */
        public final String getA() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Informer)) {
                return false;
            }
            Informer informer = (Informer) obj;
            return jl40.l(this.a, informer.a) && jl40.l(this.b, informer.b) && jl40.l(this.c, informer.c) && jl40.l(this.d, informer.d) && this.e == informer.e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.e) + ((this.d.a.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
        }

        public final String toString() {
            StringBuilder v = b64.v("Informer(titleKey=", this.a, ", subtitleKey=", this.b, ", iconTag=");
            v.append(this.c);
            v.append(", conditions=");
            v.append(this.d);
            v.append(", needSendReplenishAmount=");
            return x4e.i(v, this.e, Extension.C_BRAKE);
        }

        public Informer() {
            Conditions.Companion.getClass();
            Conditions conditions = Conditions.b;
            this.a = "";
            this.b = "";
            this.c = "";
            this.d = conditions;
            this.e = false;
        }
    }
}
