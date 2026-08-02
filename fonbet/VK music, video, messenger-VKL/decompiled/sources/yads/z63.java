package yads;

import android.text.TextUtils;
import java.util.Collections;
import java.util.regex.Pattern;

/* loaded from: classes10.dex */
public final class z63 {
    public static final Pattern b = Pattern.compile("\\s+");
    public static final x51 c = x51.b(2, "auto", "none");
    public static final x51 d = x51.b(3, "dot", "sesame", "circle");
    public static final x51 e = x51.b(2, "filled", "open");
    public static final x51 f = x51.b(3, "after", "before", "outside");
    public final int a;

    public z63(int i, int i2, int i3) {
        this.a = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x0158, code lost:
    
        if (r3.equals("dot") != false) goto L103;
     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static z63 a(String str) {
        boolean z;
        int i;
        int hashCode;
        if (str == null) {
            return null;
        }
        String a = ki.a(str.trim());
        if (a.isEmpty()) {
            return null;
        }
        String[] split = TextUtils.split(a, b);
        int length = split.length;
        boolean z2 = false;
        int i2 = 1;
        x51 b2 = length != 0 ? length != 1 ? x51.b(split.length, (Object[]) split.clone()) : new b13(split[0]) : zn2.j;
        x51 x51Var = f;
        if (x51Var == null) {
            throw new NullPointerException("set1");
        }
        if (b2 == null) {
            throw new NullPointerException("set2");
        }
        kz2 kz2Var = new kz2(new lz2(x51Var, b2));
        String str2 = (String) (kz2Var.hasNext() ? kz2Var.next() : "outside");
        int hashCode2 = str2.hashCode();
        int i3 = -1;
        if (hashCode2 == -1392885889) {
            if (str2.equals("before")) {
                z = 2;
            }
            z = -1;
        } else if (hashCode2 != -1106037339) {
            if (hashCode2 == 92734940 && str2.equals("after")) {
                z = false;
            }
            z = -1;
        } else {
            if (str2.equals("outside")) {
                z = true;
            }
            z = -1;
        }
        int i4 = z ? !z ? 1 : -2 : 2;
        x51 x51Var2 = c;
        if (x51Var2 == null) {
            throw new NullPointerException("set1");
        }
        lz2 lz2Var = new lz2(x51Var2, b2);
        if (!Collections.disjoint(b2, x51Var2)) {
            String str3 = (String) new kz2(lz2Var).next();
            int hashCode3 = str3.hashCode();
            if (hashCode3 == 3005871) {
                str3.equals("auto");
            } else if (hashCode3 == 3387192 && str3.equals("none")) {
                i3 = 0;
            }
            return new z63(i3, 0, i4);
        }
        x51 x51Var3 = e;
        if (x51Var3 == null) {
            throw new NullPointerException("set1");
        }
        lz2 lz2Var2 = new lz2(x51Var3, b2);
        x51 x51Var4 = d;
        if (x51Var4 == null) {
            throw new NullPointerException("set1");
        }
        lz2 lz2Var3 = new lz2(x51Var4, b2);
        if (Collections.disjoint(b2, x51Var3) && Collections.disjoint(b2, x51Var4)) {
            return new z63(-1, 0, i4);
        }
        kz2 kz2Var2 = new kz2(lz2Var2);
        String str4 = (String) (kz2Var2.hasNext() ? kz2Var2.next() : "filled");
        int hashCode4 = str4.hashCode();
        if (hashCode4 == -1274499742) {
            str4.equals("filled");
        } else if (hashCode4 == 3417674 && str4.equals("open")) {
            i = 2;
            kz2 kz2Var3 = new kz2(lz2Var3);
            String str5 = (String) (!kz2Var3.hasNext() ? kz2Var3.next() : "circle");
            hashCode = str5.hashCode();
            if (hashCode != -1360216880) {
                if (str5.equals("circle")) {
                    z2 = 2;
                }
                z2 = -1;
            } else if (hashCode != -905816648) {
                if (hashCode == 99657) {
                }
                z2 = -1;
            } else {
                if (str5.equals("sesame")) {
                    z2 = true;
                }
                z2 = -1;
            }
            if (z2) {
                i2 = 2;
            } else if (z2) {
                i2 = 3;
            }
            return new z63(i2, i, i4);
        }
        i = 1;
        kz2 kz2Var32 = new kz2(lz2Var3);
        String str52 = (String) (!kz2Var32.hasNext() ? kz2Var32.next() : "circle");
        hashCode = str52.hashCode();
        if (hashCode != -1360216880) {
        }
        if (z2) {
        }
        return new z63(i2, i, i4);
    }
}
