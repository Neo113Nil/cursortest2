package xsna;

import java.util.ArrayList;

/* compiled from: FontCharacter.java */
/* loaded from: classes12.dex */
public final class r4s {
    public final ArrayList a;
    public final char b;
    public final double c;
    public final String d;
    public final String e;

    public r4s(ArrayList arrayList, char c, double d, String str, String str2) {
        this.a = arrayList;
        this.b = c;
        this.c = d;
        this.d = str;
        this.e = str2;
    }

    public static int a(char c, String str, String str2) {
        return str2.hashCode() + urd0.a(c * 31, 31, str);
    }

    public final int hashCode() {
        return a(this.b, this.e, this.d);
    }
}
