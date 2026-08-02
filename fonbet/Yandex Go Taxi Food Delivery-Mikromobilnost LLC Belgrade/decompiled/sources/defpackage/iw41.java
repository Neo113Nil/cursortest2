package defpackage;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes10.dex */
public final class iw41 {
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

    public static int a(int i, int i2, String str, String str2) {
        if (str.isEmpty() || i == -1) {
            return i;
        }
        if (str.equals(str2)) {
            return i + i2;
        }
        return -1;
    }
}
