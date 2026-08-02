package sg.bigo.ads.bs;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import sg.bigo.ads.bo.a;
import sg.bigo.ads.bo.f;

/* loaded from: classes9.dex */
public abstract class c<T extends sg.bigo.ads.bo.a> {
    public final int j;
    public final T k;

    @Nullable
    public Executor l;
    public long m = 15000;
    public final Map<String, Set<String>> n = new HashMap();
    public final boolean o;
    public String p;

    public c(int i, @NonNull T t, boolean z, Context context) {
        this.j = i;
        this.k = t;
        this.o = z;
        a("BIGO-Ad-Request-Id", String.valueOf(i));
        a("User-Agent", sg.bigo.ads.bz.c.c(context));
    }

    @NonNull
    private Set<String> b(@NonNull String str) {
        Set<String> set = this.n.get(str);
        if (set != null) {
            return set;
        }
        HashSet hashSet = new HashSet();
        this.n.put(str, hashSet);
        return hashSet;
    }

    @NonNull
    public String a() {
        return "GET";
    }

    @Nullable
    public byte[] c() {
        return null;
    }

    @Nullable
    public String d() {
        return null;
    }

    public int e() {
        return -1;
    }

    public boolean f() {
        return false;
    }

    @NonNull
    public final String g() {
        return this.k.a();
    }

    public final void a(String str) {
        b(str).clear();
    }

    @Nullable
    public f b() {
        return null;
    }

    public final void a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        b(str).add(str2);
    }

    public void h() {
    }
}
