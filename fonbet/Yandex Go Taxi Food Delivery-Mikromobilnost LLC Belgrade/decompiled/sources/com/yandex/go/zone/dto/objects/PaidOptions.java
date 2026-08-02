package com.yandex.go.zone.dto.objects;

import defpackage.b64;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/zone/dto/objects/PaidOptions;", "", "Companion", "Alert", "com/yandex/go/zone/dto/objects/y2", "$serializer", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class PaidOptions {
    public static final y2 Companion = new y2();
    public static final PaidOptions g = new PaidOptions(61);
    public final double a;
    public final Boolean b;
    public final boolean c;
    public final Alert d;
    public final boolean e;
    public final u2 f;

    public PaidOptions(int i, double d, Boolean bool, boolean z, Alert alert, boolean z2, u2 u2Var) {
        this.a = (i & 1) == 0 ? 0.0d : d;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bool;
        }
        if ((i & 4) == 0) {
            this.c = false;
        } else {
            this.c = z;
        }
        if ((i & 8) == 0) {
            Alert.Companion.getClass();
            this.d = Alert.e;
        } else {
            this.d = alert;
        }
        if ((i & 16) == 0) {
            this.e = false;
        } else {
            this.e = z2;
        }
        if ((i & 32) == 0) {
            this.f = s6.INSTANCE;
        } else {
            this.f = u2Var;
        }
    }

    public final boolean a() {
        Boolean bool = this.b;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaidOptions)) {
            return false;
        }
        PaidOptions paidOptions = (PaidOptions) obj;
        return Double.compare(this.a, paidOptions.a) == 0 && jl40.l(this.b, paidOptions.b) && this.c == paidOptions.c && jl40.l(this.d, paidOptions.d) && this.e == paidOptions.e && jl40.l(this.f, paidOptions.f);
    }

    public final int hashCode() {
        int hashCode = Double.hashCode(this.a) * 31;
        Boolean bool = this.b;
        return this.f.hashCode() + unr0.e((this.d.hashCode() + unr0.e((hashCode + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.c)) * 31, 31, this.e);
    }

    public final String toString() {
        return "PaidOptions(value=" + this.a + ", displayCardIcon=" + this.b + ", isColorButton=" + this.c + ", alertProperties=" + this.d + ", showOrderPopup=" + this.e + ", orderPopupProperties=" + this.f + Extension.C_BRAKE;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/PaidOptions$Alert;", "", "Companion", "com/yandex/go/zone/dto/objects/x2", "$serializer", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Alert {
        public static final x2 Companion = new x2();
        public static final Alert e = new Alert(0);
        public final String a;
        public final String b;
        public final String c;
        public final String d;

        public /* synthetic */ Alert(int i, String str, String str2, String str3, String str4) {
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

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Alert)) {
                return false;
            }
            Alert alert = (Alert) obj;
            return jl40.l(this.a, alert.a) && jl40.l(this.b, alert.b) && jl40.l(this.c, alert.c) && jl40.l(this.d, alert.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            return g8e.r(b64.v("Alert(label=", this.a, ", title=", this.b, ", description="), this.c, ", buttonText=", this.d, Extension.C_BRAKE);
        }

        public Alert(int i) {
            this.a = "";
            this.b = "";
            this.c = "";
            this.d = "";
        }

        public Alert() {
            this(0);
        }
    }

    public PaidOptions() {
        this(63);
    }

    public PaidOptions(int i) {
        Boolean bool = (i & 2) != 0 ? null : Boolean.FALSE;
        Alert.Companion.getClass();
        s6 s6Var = s6.INSTANCE;
        this.a = 0.0d;
        this.b = bool;
        this.c = false;
        this.d = Alert.e;
        this.e = false;
        this.f = s6Var;
    }
}
