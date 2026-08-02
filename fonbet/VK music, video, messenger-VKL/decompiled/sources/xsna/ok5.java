package xsna;

import androidx.annotation.Nullable;
import xsna.g52;

/* compiled from: AutoValue_AndroidClientInfo.java */
/* loaded from: classes.dex */
public final class ok5 extends g52 {
    public final Integer a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;

    /* compiled from: AutoValue_AndroidClientInfo.java */
    /* loaded from: classes12.dex */
    public static final class a extends g52.a {
        public Integer a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;
        public String i;
        public String j;
        public String k;
        public String l;

        public final ok5 a() {
            return new ok5(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l);
        }

        public final a b(@Nullable String str) {
            this.l = str;
            return this;
        }

        public final a c(@Nullable String str) {
            this.j = str;
            return this;
        }

        public final a d(@Nullable String str) {
            this.d = str;
            return this;
        }

        public final a e(@Nullable String str) {
            this.h = str;
            return this;
        }

        public final a f(@Nullable String str) {
            this.c = str;
            return this;
        }

        public final a g(@Nullable String str) {
            this.i = str;
            return this;
        }

        public final a h(@Nullable String str) {
            this.g = str;
            return this;
        }

        public final a i(@Nullable String str) {
            this.k = str;
            return this;
        }

        public final a j(@Nullable String str) {
            this.b = str;
            return this;
        }

        public final a k(@Nullable String str) {
            this.f = str;
            return this;
        }

        public final a l(@Nullable String str) {
            this.e = str;
            return this;
        }

        public final a m(@Nullable Integer num) {
            this.a = num;
            return this;
        }
    }

    public ok5(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.a = num;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = str9;
        this.k = str10;
        this.l = str11;
    }

    @Override // xsna.g52
    @Nullable
    public final String a() {
        return this.l;
    }

    @Override // xsna.g52
    @Nullable
    public final String b() {
        return this.j;
    }

    @Override // xsna.g52
    @Nullable
    public final String c() {
        return this.d;
    }

    @Override // xsna.g52
    @Nullable
    public final String d() {
        return this.h;
    }

    @Override // xsna.g52
    @Nullable
    public final String e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g52)) {
            return false;
        }
        g52 g52Var = (g52) obj;
        Integer num = this.a;
        if (num == null) {
            if (g52Var.l() != null) {
                return false;
            }
        } else if (!num.equals(g52Var.l())) {
            return false;
        }
        String str = this.b;
        if (str == null) {
            if (g52Var.i() != null) {
                return false;
            }
        } else if (!str.equals(g52Var.i())) {
            return false;
        }
        String str2 = this.c;
        if (str2 == null) {
            if (g52Var.e() != null) {
                return false;
            }
        } else if (!str2.equals(g52Var.e())) {
            return false;
        }
        String str3 = this.d;
        if (str3 == null) {
            if (g52Var.c() != null) {
                return false;
            }
        } else if (!str3.equals(g52Var.c())) {
            return false;
        }
        String str4 = this.e;
        if (str4 == null) {
            if (g52Var.k() != null) {
                return false;
            }
        } else if (!str4.equals(g52Var.k())) {
            return false;
        }
        String str5 = this.f;
        if (str5 == null) {
            if (g52Var.j() != null) {
                return false;
            }
        } else if (!str5.equals(g52Var.j())) {
            return false;
        }
        String str6 = this.g;
        if (str6 == null) {
            if (g52Var.g() != null) {
                return false;
            }
        } else if (!str6.equals(g52Var.g())) {
            return false;
        }
        String str7 = this.h;
        if (str7 == null) {
            if (g52Var.d() != null) {
                return false;
            }
        } else if (!str7.equals(g52Var.d())) {
            return false;
        }
        String str8 = this.i;
        if (str8 == null) {
            if (g52Var.f() != null) {
                return false;
            }
        } else if (!str8.equals(g52Var.f())) {
            return false;
        }
        String str9 = this.j;
        if (str9 == null) {
            if (g52Var.b() != null) {
                return false;
            }
        } else if (!str9.equals(g52Var.b())) {
            return false;
        }
        String str10 = this.k;
        if (str10 == null) {
            if (g52Var.h() != null) {
                return false;
            }
        } else if (!str10.equals(g52Var.h())) {
            return false;
        }
        String str11 = this.l;
        return str11 == null ? g52Var.a() == null : str11.equals(g52Var.a());
    }

    @Override // xsna.g52
    @Nullable
    public final String f() {
        return this.i;
    }

    @Override // xsna.g52
    @Nullable
    public final String g() {
        return this.g;
    }

    @Override // xsna.g52
    @Nullable
    public final String h() {
        return this.k;
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.d;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.e;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f;
        int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.g;
        int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.h;
        int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.i;
        int hashCode9 = (hashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.j;
        int hashCode10 = (hashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.k;
        int hashCode11 = (hashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.l;
        return (str11 != null ? str11.hashCode() : 0) ^ hashCode11;
    }

    @Override // xsna.g52
    @Nullable
    public final String i() {
        return this.b;
    }

    @Override // xsna.g52
    @Nullable
    public final String j() {
        return this.f;
    }

    @Override // xsna.g52
    @Nullable
    public final String k() {
        return this.e;
    }

    @Override // xsna.g52
    @Nullable
    public final Integer l() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb.append(this.a);
        sb.append(", model=");
        sb.append(this.b);
        sb.append(", hardware=");
        sb.append(this.c);
        sb.append(", device=");
        sb.append(this.d);
        sb.append(", product=");
        sb.append(this.e);
        sb.append(", osBuild=");
        sb.append(this.f);
        sb.append(", manufacturer=");
        sb.append(this.g);
        sb.append(", fingerprint=");
        sb.append(this.h);
        sb.append(", locale=");
        sb.append(this.i);
        sb.append(", country=");
        sb.append(this.j);
        sb.append(", mccMnc=");
        sb.append(this.k);
        sb.append(", applicationBuild=");
        return i5s.a(sb, this.l, "}");
    }
}
