package xsna;

import java.util.Objects;
import java.util.TreeSet;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes.dex */
public final class udz0 {
    public static final udz0 j = new udz0("", null, -1, 999, 0, v5z0.b);
    public static final TreeSet k;
    public static volatile boolean l;
    public final String a;
    public final String b;
    public final int c;
    public final Integer d;
    public final int e;
    public final y6z0 f;
    public int g;
    public String h;
    public volatile int i = l ? 1 : 0;

    static {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        k = treeSet;
        treeSet.add("com.vkontakte.android");
        treeSet.add("ru.mail.mailapp");
        treeSet.add("ru.ok.messages");
        treeSet.add("ru.ok.android");
        treeSet.add("ru.ok.android.debug");
        treeSet.add("ru.vk.store");
        treeSet.add("ru.vk.store.qa");
        treeSet.add("com.vk.tv");
        treeSet.add("com.vk.vkvideo");
        treeSet.add("com.vk.clips");
        l = false;
    }

    public udz0(String str, String str2, Integer num, int i, int i2, y6z0 y6z0Var) {
        this.a = str;
        this.b = str2;
        this.d = num;
        this.c = i;
        this.e = i2;
        this.f = y6z0Var;
    }

    public final void a(int i, int i2, int i3, String str, String str2) {
        this.f.a(this, i, i2, i3, str, str2);
    }

    public final void b(int i, int i2, String str) {
        a(i, 0, i2, str, null);
    }

    public final void c(int i) {
        a(0, 3, i, null, null);
    }

    public final void d(int i, String str) {
        a(0, 3, i, str, null);
    }

    public final boolean equals(Object obj) {
        if (obj == null || udz0.class != obj.getClass()) {
            return false;
        }
        udz0 udz0Var = (udz0) obj;
        return this.c == udz0Var.c && this.e == udz0Var.e && this.g == udz0Var.g && Objects.equals(this.h, udz0Var.h) && Objects.equals(this.a, udz0Var.a) && Objects.equals(this.b, udz0Var.b) && this.d.equals(udz0Var.d) && Objects.equals(this.f, udz0Var.f);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, Integer.valueOf(this.c), this.d, Integer.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h);
    }
}
