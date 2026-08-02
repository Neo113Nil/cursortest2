package ru.mail.libverify.f0;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import xsna.i5s;

/* loaded from: classes9.dex */
public final class b {

    @Nullable
    String a;

    @Nullable
    String b;

    @Nullable
    String c;

    @Nullable
    String d;

    @Nullable
    String e;
    boolean f;
    boolean g;
    boolean h = false;

    @Nullable
    String i;

    @Nullable
    String j;

    @Nullable
    String k;

    @Nullable
    String l;

    @Nullable
    String m;

    @Nullable
    Integer n;

    public static class a {

        @Nullable
        private String a;

        @Nullable
        private String b;

        @Nullable
        private String c;

        @Nullable
        private String d;

        @Nullable
        private String e;
        private boolean f;
        private boolean g;
        private boolean h = false;

        @Nullable
        private String i;

        @Nullable
        private String j;

        @Nullable
        private String k;

        @Nullable
        private String l;

        @Nullable
        private String m;

        @Nullable
        private Integer n;

        @NonNull
        public final b a() {
            b bVar = new b();
            bVar.a = this.a;
            bVar.b = this.b;
            bVar.c = this.c;
            bVar.d = this.d;
            bVar.e = this.e;
            bVar.f = this.f;
            bVar.g = this.g;
            bVar.h = this.h;
            bVar.i = this.i;
            bVar.j = this.j;
            bVar.k = this.k;
            bVar.l = this.l;
            bVar.m = this.m;
            bVar.n = this.n;
            return bVar;
        }

        @NonNull
        public final void b(@Nullable String str) {
            this.a = str;
        }

        @NonNull
        public final void c(boolean z) {
            this.h = z;
        }

        @NonNull
        public final void d(@Nullable String str) {
            this.l = str;
        }

        @NonNull
        public final void e(@Nullable String str) {
            this.k = str;
        }

        @NonNull
        public final void f(@Nullable String str) {
            this.j = str;
        }

        @NonNull
        public final void g(@Nullable String str) {
            this.i = str;
        }

        @NonNull
        public final void h(@Nullable String str) {
            this.c = str;
        }

        @NonNull
        public final void i(@Nullable String str) {
            this.d = str;
        }

        @NonNull
        public final void j(@Nullable String str) {
            this.e = str;
        }

        @NonNull
        public final void b(boolean z) {
            this.f = z;
        }

        @NonNull
        public final void c(@Nullable String str) {
            this.m = str;
        }

        @NonNull
        public final void a(@Nullable String str) {
            this.b = str;
        }

        @NonNull
        public final void a(boolean z) {
            this.g = z;
        }

        @NonNull
        public final void a(@Nullable Integer num) {
            this.n = num;
        }
    }

    @Nullable
    public final String a() {
        return this.m;
    }

    @Nullable
    public final String b() {
        String str = this.l;
        if (TextUtils.isEmpty(str) || str.length() < 3) {
            return null;
        }
        return str.substring(0, 3);
    }

    @Nullable
    public final String c() {
        String str = this.l;
        if (TextUtils.isEmpty(str) || str.length() < 5) {
            return null;
        }
        return str.substring(3);
    }

    @Nullable
    public final String d() {
        return this.l;
    }

    @Nullable
    public final String e() {
        return this.k;
    }

    @Nullable
    public final String f() {
        return this.j;
    }

    @Nullable
    public final String g() {
        String str = this.j;
        if (TextUtils.isEmpty(str) || str.length() < 3) {
            return null;
        }
        return str.substring(0, 3);
    }

    @Nullable
    public final String h() {
        String str = this.j;
        if (TextUtils.isEmpty(str) || str.length() < 5) {
            return null;
        }
        return str.substring(3);
    }

    @Nullable
    public final String i() {
        return this.i;
    }

    @Nullable
    public final String j() {
        return this.c;
    }

    @Nullable
    public final String k() {
        return this.d;
    }

    @Nullable
    public final Integer l() {
        return this.n;
    }

    public final boolean m() {
        return this.g;
    }

    @NonNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("SimCardItem{simCountryIso='");
        sb.append(this.c);
        sb.append("', simPhoneNumber='");
        sb.append(this.d);
        sb.append("', simState='");
        sb.append(this.e);
        sb.append("', isNetworkRoaming=");
        sb.append(this.g);
        sb.append(", isRoamingDataAllowed=");
        sb.append(this.h);
        sb.append(", operatorName='");
        sb.append(this.i);
        sb.append("', operator='");
        sb.append(this.j);
        sb.append("', networkOperatorName='");
        sb.append(this.k);
        sb.append("', networkOperator='");
        sb.append(this.l);
        sb.append("', networkCountryIso='");
        return i5s.a(sb, this.m, "'}");
    }
}
