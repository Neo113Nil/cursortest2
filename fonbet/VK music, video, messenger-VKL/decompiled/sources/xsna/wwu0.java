package xsna;

/* compiled from: VkGetOauthTokenArgs.kt */
/* loaded from: classes6.dex */
public final class wwu0 {
    public final String a;
    public final String b;
    public final Long c;
    public final String d;
    public final String e;
    public final String f;
    public final Long g;
    public final boolean h;

    /* compiled from: VkGetOauthTokenArgs.kt */
    public static final class a {
        public static wwu0 a(String str, String str2, long j, String str3, String str4, String str5, Long l, boolean z, int i) {
            return new wwu0(str, str2, Long.valueOf(j), str3, str4, str5, (i & 256) != 0 ? null : l, (i & 1024) != 0 ? false : z);
        }
    }

    public wwu0(String str, String str2, Long l, String str3, String str4, String str5, Long l2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = l;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = l2;
        this.h = z;
    }
}
