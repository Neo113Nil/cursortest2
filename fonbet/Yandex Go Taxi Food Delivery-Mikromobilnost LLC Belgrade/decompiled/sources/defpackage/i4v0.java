package defpackage;

/* loaded from: classes9.dex */
public final class i4v0 {
    public static final i4v0 j = new i4v0("UNKNOWN", null, null, null, null, null, null, false, false, 508);
    public final String a;
    public final zzs b;
    public final String c;
    public final Integer d;
    public final String e;
    public final String f;
    public final String g;
    public final boolean h;
    public final boolean i;

    public /* synthetic */ i4v0(String str, zzs zzsVar, String str2, Integer num, String str3, String str4, String str5, boolean z, boolean z2, int i) {
        this(str, zzsVar, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? false : z, (i & 256) != 0 ? false : z2);
    }

    public i4v0(String str, zzs zzsVar, String str2, Integer num, String str3, String str4, String str5, boolean z, boolean z2) {
        this.a = str;
        this.b = zzsVar;
        this.c = str2;
        this.d = num;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = z;
        this.i = z2;
    }
}
