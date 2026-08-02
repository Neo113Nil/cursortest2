package xsna;

import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class u6z0 {
    public String e;
    public final int g;
    public volatile String h;
    public String i;
    public final qnk a = new qnk();
    public final Map b = Collections.synchronizedMap(new HashMap());
    public boolean c = true;
    public int d = 360;
    public int f = 0;
    public udz0 j = udz0.j;
    public final bqz0 k = new bqz0(14);

    public u6z0(int i, String str) {
        this.g = i;
        this.h = str;
    }

    public final pg0 a(String str) {
        return (pg0) this.b.get(str.toLowerCase(Locale.ROOT));
    }

    public final void b(udz0 udz0Var) {
        this.j = udz0Var;
        udz0Var.g = this.f;
        udz0Var.h = this.i;
    }
}
