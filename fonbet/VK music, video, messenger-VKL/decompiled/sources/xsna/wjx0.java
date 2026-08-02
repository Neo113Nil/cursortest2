package xsna;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.Set;

/* compiled from: WebvttCssStyle.java */
/* loaded from: classes12.dex */
public final class wjx0 {
    public int f;
    public int h;
    public float o;
    public String a = "";
    public String b = "";
    public Set<String> c = Collections.EMPTY_SET;
    public String d = "";

    @Nullable
    public String e = null;
    public boolean g = false;
    public boolean i = false;
    public final int j = -1;
    public int k = -1;
    public int l = -1;
    public int m = -1;
    public int n = -1;
    public int p = -1;
    public boolean q = false;

    public static int c(int i, String str, @Nullable String str2, int i2) {
        if (str.isEmpty() || i == -1) {
            return i;
        }
        if (str.equals(str2)) {
            return i + i2;
        }
        return -1;
    }

    public final int a(@Nullable String str, @Nullable String str2, Set<String> set, @Nullable String str3) {
        if (this.a.isEmpty() && this.b.isEmpty() && this.c.isEmpty() && this.d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int c = c(c(c(0, this.a, str, 1073741824), this.b, str2, 2), this.d, str3, 4);
        if (c == -1 || !set.containsAll(this.c)) {
            return 0;
        }
        return (this.c.size() * 4) + c;
    }

    public final int b() {
        int i = this.l;
        if (i == -1 && this.m == -1) {
            return -1;
        }
        return (i == 1 ? 1 : 0) | (this.m == 1 ? 2 : 0);
    }
}
