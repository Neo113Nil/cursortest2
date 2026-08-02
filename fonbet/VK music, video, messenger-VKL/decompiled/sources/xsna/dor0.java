package xsna;

import androidx.annotation.NonNull;
import java.util.Set;

/* compiled from: VersionedBrowserMatcher.java */
/* loaded from: classes15.dex */
public final class dor0 {
    public static final dor0 e;
    public static final dor0 f;
    public static final dor0 g;
    public static final dor0 h;
    public static final dor0 i;
    public static final dor0 j;
    public final String a;
    public final Set<String> b;
    public final v7x c;
    public final boolean d;

    static {
        Set<String> set = uk8.a;
        e = new dor0("com.android.chrome", set, true, new v7x(uk8.b, 1));
        v7x v7xVar = v7x.d;
        f = new dor0("com.android.chrome", set, false, v7xVar);
        Set<String> set2 = vk8.a;
        g = new dor0("org.mozilla.firefox", set2, true, new v7x(vk8.b, 1));
        h = new dor0("org.mozilla.firefox", set2, false, v7xVar);
        Set<String> set3 = wk8.a;
        i = new dor0("com.sec.android.app.sbrowser", set3, false, v7xVar);
        j = new dor0("com.sec.android.app.sbrowser", set3, true, new v7x(wk8.b, 1));
    }

    public dor0(@NonNull String str, @NonNull Set<String> set, boolean z, @NonNull v7x v7xVar) {
        this.a = str;
        this.b = set;
        this.d = z;
        this.c = v7xVar;
    }
}
