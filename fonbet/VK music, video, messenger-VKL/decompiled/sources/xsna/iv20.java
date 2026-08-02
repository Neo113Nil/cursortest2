package xsna;

import java.util.ArrayList;

/* compiled from: ModalAuthContract.kt */
/* loaded from: classes15.dex */
public abstract class iv20 {

    /* compiled from: ModalAuthContract.kt */
    public static final class a extends iv20 {
        public static final a a = new a();
    }

    /* compiled from: ModalAuthContract.kt */
    public static final class b extends iv20 {
        public final String a;
        public final String b;
        public final String c;
        public final ArrayList d;
        public final String e;
        public final String f;
        public final String g;
        public final String h;
        public final Integer i;
        public final boolean j;
        public final boolean k;

        public b(String str, String str2, String str3, ArrayList arrayList, String str4, String str5, String str6, String str7, Integer num, boolean z, boolean z2) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = arrayList;
            this.e = str4;
            this.f = str5;
            this.g = str6;
            this.h = str7;
            this.i = num;
            this.j = z;
            this.k = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e) && epx.f(this.f, bVar.f) && epx.f(this.g, bVar.g) && epx.f(this.h, bVar.h) && epx.f(this.i, bVar.i) && this.j == bVar.j && this.k == bVar.k;
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int a = urd0.a(urd0.a(qr.a(this.d, urd0.a((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.c), 31), 31, this.e), 31, this.f);
            String str3 = this.g;
            int hashCode2 = (a + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.h;
            int hashCode3 = (hashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Integer num = this.i;
            return Boolean.hashCode(this.k) + qoy.b((hashCode3 + (num != null ? num.hashCode() : 0)) * 31, 31, this.j);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Normal(userName=");
            sb.append(this.a);
            sb.append(", userAvatar=");
            sb.append(this.b);
            sb.append(", userPhone=");
            sb.append(this.c);
            sb.append(", infoScopeList=");
            sb.append(this.d);
            sb.append(", authCode=");
            sb.append(this.e);
            sb.append(", authId=");
            sb.append(this.f);
            sb.append(", authDomain=");
            sb.append(this.g);
            sb.append(", browserName=");
            sb.append(this.h);
            sb.append(", appId=");
            sb.append(this.i);
            sb.append(", isExternalCameraFlow=");
            sb.append(this.j);
            sb.append(", isOfficialApp=");
            return defpackage.q0.a(sb, this.k, ')');
        }
    }

    /* compiled from: ModalAuthContract.kt */
    public static final class c extends iv20 {
        public static final c a = new c();
    }
}
