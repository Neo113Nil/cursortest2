package xsna;

import java.util.ArrayList;

/* compiled from: ReceivedThrows.kt */
/* loaded from: classes5.dex */
public final class d9f0 {
    public final ArrayList a;
    public final int b;
    public final boolean c;
    public final a d;
    public final String e;
    public final boolean f;
    public final long g;

    /* compiled from: ReceivedThrows.kt */
    public static final class a {
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public final String h;

        public a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = str6;
            this.g = str7;
            this.h = str8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g) && epx.f(this.h, aVar.h);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.d;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.e;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f;
            int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.g;
            int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.h;
            return hashCode7 + (str8 != null ? str8.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PopUp(title=");
            sb.append(this.a);
            sb.append(", description=");
            sb.append(this.b);
            sb.append(", buttonTitle=");
            sb.append(this.c);
            sb.append(", actionUrl=");
            sb.append(this.d);
            sb.append(", iconLocalAssetName=");
            sb.append(this.e);
            sb.append(", iconRemoteAssetName=");
            sb.append(this.f);
            sb.append(", secondaryButtonTitle=");
            sb.append(this.g);
            sb.append(", secondaryButtonActionUrl=");
            return ho8.a(sb, this.h, ')');
        }
    }

    /* compiled from: ReceivedThrows.kt */
    public static final class b {
        public final String a;
        public final long b;

        public b(String str, long j) {
            this.a = str;
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b == bVar.b;
        }

        public final int hashCode() {
            return Long.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UserAsset(remoteAssetUrl=");
            sb.append(this.a);
            sb.append(", userId=");
            return vu5.a(')', this.b, sb);
        }
    }

    public d9f0(ArrayList arrayList, int i, boolean z, a aVar, String str, boolean z2, long j) {
        this.a = arrayList;
        this.b = i;
        this.c = z;
        this.d = aVar;
        this.e = str;
        this.f = z2;
        this.g = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d9f0)) {
            return false;
        }
        d9f0 d9f0Var = (d9f0) obj;
        return this.a.equals(d9f0Var.a) && this.b == d9f0Var.b && this.c == d9f0Var.c && this.d.equals(d9f0Var.d) && epx.f(this.e, d9f0Var.e) && this.f == d9f0Var.f && this.g == d9f0Var.g;
    }

    public final int hashCode() {
        return Long.hashCode(this.g) + qoy.b(urd0.a((this.d.hashCode() + qoy.b(shy.a(this.b, this.a.hashCode() * 31, 31), 31, this.c)) * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReceivedThrows(userAssets=");
        sb.append(this.a);
        sb.append(", count=");
        sb.append(this.b);
        sb.append(", ignoreTouch=");
        sb.append(this.c);
        sb.append(", popUp=");
        sb.append(this.d);
        sb.append(", firstName=");
        sb.append(this.e);
        sb.append(", isCurrentUser=");
        sb.append(this.f);
        sb.append(", userId=");
        return vu5.a(')', this.g, sb);
    }
}
