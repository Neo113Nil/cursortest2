package xsna;

/* compiled from: CustomVariable.java */
/* loaded from: classes11.dex */
public final class zok {
    public String a;
    public int b;
    public int c;
    public float d;

    public static String a(int i) {
        return "#" + et.a(i, new StringBuilder("00000000")).substring(r2.length() - 8);
    }

    public final zok b() {
        zok zokVar = new zok();
        zokVar.c = Integer.MIN_VALUE;
        zokVar.d = Float.NaN;
        zokVar.a = this.a;
        zokVar.b = this.b;
        zokVar.c = this.c;
        zokVar.d = this.d;
        return zokVar;
    }

    public final String c() {
        return this.a;
    }

    public final String toString() {
        String a = ho8.a(new StringBuilder(), this.a, ':');
        switch (this.b) {
            case 900:
                StringBuilder e = fw3.e(a);
                e.append(this.c);
                return e.toString();
            case 901:
                StringBuilder e2 = fw3.e(a);
                e2.append(this.d);
                return e2.toString();
            case 902:
                StringBuilder e3 = fw3.e(a);
                e3.append(a(this.c));
                return e3.toString();
            case 903:
                return fo8.a(a, null);
            default:
                return fo8.a(a, "????");
        }
    }
}
