package xsna;

import xsna.lu7;

/* compiled from: BookingRecordCompletedScreenViewState.kt */
/* loaded from: classes18.dex */
public final class vu7 implements lm50 {
    public final av7 b;
    public final boolean c;
    public final lu7.a d;
    public final boolean e;
    public final String f;
    public final a g;
    public final String h;

    /* compiled from: BookingRecordCompletedScreenViewState.kt */
    public static final class a {
        public final String a;
        public final String b;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Company(name=");
            sb.append(this.a);
            sb.append(", logoUrl=");
            return ho8.a(sb, this.b, ')');
        }
    }

    public vu7(av7 av7Var, boolean z, lu7.a aVar, boolean z2, String str, a aVar2, String str2) {
        this.b = av7Var;
        this.c = z;
        this.d = aVar;
        this.e = z2;
        this.f = str;
        this.g = aVar2;
        this.h = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vu7)) {
            return false;
        }
        vu7 vu7Var = (vu7) obj;
        return epx.f(this.b, vu7Var.b) && this.c == vu7Var.c && epx.f(this.d, vu7Var.d) && this.e == vu7Var.e && epx.f(this.f, vu7Var.f) && epx.f(this.g, vu7Var.g) && epx.f(this.h, vu7Var.h);
    }

    public final int hashCode() {
        av7 av7Var = this.b;
        int b = qoy.b((av7Var == null ? 0 : av7Var.hashCode()) * 31, 31, this.c);
        lu7.a aVar = this.d;
        int hashCode = (this.g.hashCode() + urd0.a(qoy.b((b + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.e), 31, this.f)) * 31;
        String str = this.h;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BookingRecordCompletedScreenViewState(record=");
        sb.append(this.b);
        sb.append(", needConfirmCancelRecord=");
        sb.append(this.c);
        sb.append(", error=");
        sb.append(this.d);
        sb.append(", isLoading=");
        sb.append(this.e);
        sb.append(", currency=");
        sb.append(this.f);
        sb.append(", company=");
        sb.append(this.g);
        sb.append(", address=");
        return ho8.a(sb, this.h, ')');
    }
}
