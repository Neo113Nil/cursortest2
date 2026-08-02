package defpackage;

/* loaded from: classes12.dex */
public final class b5n {
    public final String a;
    public final int b;

    public b5n(String str) {
        String concat = str.length() > 6 ? gvu0.A0(6, str).concat("**") : str;
        int length = str.length();
        this.a = concat;
        this.b = length;
    }
}
