package defpackage;

/* loaded from: classes13.dex */
public final class nwj {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public nwj(String str, String str2, String str3, String str4, int i, String str5) {
        str2 = (i & 2) != 0 ? null : str2;
        str3 = (i & 4) != 0 ? null : str3;
        str4 = (i & 8) != 0 ? null : str4;
        str5 = (i & 16) != 0 ? null : str5;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }
}
