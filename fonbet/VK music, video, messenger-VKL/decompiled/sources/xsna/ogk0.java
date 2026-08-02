package xsna;

/* compiled from: SourceInformation.kt */
/* loaded from: classes11.dex */
public final class ogk0 {
    public final String a;
    public int b;

    public ogk0(String str) {
        this.a = str;
    }

    public final boolean a() {
        return this.b >= this.a.length();
    }

    public final void b() {
        if (c(')')) {
            return;
        }
        f("expected )");
        throw null;
    }

    public final boolean c(char c) {
        int i = this.b;
        String str = this.a;
        return i < str.length() && str.charAt(this.b) == c;
    }

    public final int d(String str) {
        Integer m = arm0.m(10, e(str));
        if (m != null) {
            return m.intValue();
        }
        f("expected int");
        throw null;
    }

    public final String e(String str) {
        String str2;
        int i = this.b;
        while (true) {
            int i2 = this.b;
            str2 = this.a;
            if (i2 >= str2.length() || drm0.E(str, str2.charAt(this.b))) {
                break;
            }
            this.b++;
        }
        int i3 = this.b;
        return i3 > i ? str2.substring(i, i3) : "";
    }

    public final void f(String str) {
        int i = this.b;
        String str2 = this.a;
        int min = Math.min(i, str2.length());
        StringBuilder a = t33.a("Error while parsing source information: ", str, " at ");
        a.append(str2.substring(0, min));
        a.append('|');
        throw new zi90(up.b(min, str2, a));
    }
}
