package defpackage;

import android.text.TextUtils;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes7.dex */
public final class kw71 {
    public int f;
    public int h;
    public float o;
    public String a = "";
    public String b = "";
    public Set c = Collections.EMPTY_SET;
    public String d = "";
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

    public final int a(String str, String str2, String str3, Set set) {
        if (this.a.isEmpty() && this.b.isEmpty() && this.c.isEmpty() && this.d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        String str4 = this.a;
        int i = !str4.isEmpty() ? str4.equals(str) ? 1073741824 : -1 : 0;
        String str5 = this.b;
        if (!str5.isEmpty() && i != -1) {
            i = str5.equals(str2) ? i + 2 : -1;
        }
        String str6 = this.d;
        if (!str6.isEmpty() && i != -1) {
            i = str6.equals(str3) ? i + 4 : -1;
        }
        if (i == -1 || !set.containsAll(this.c)) {
            return 0;
        }
        return (this.c.size() * 4) + i;
    }
}
