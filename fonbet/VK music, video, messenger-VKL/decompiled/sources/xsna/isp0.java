package xsna;

import android.content.SharedPreferences;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* compiled from: TrustedHashRepositoryImpl.kt */
/* loaded from: classes11.dex */
public final class isp0 implements hsp0 {
    public final SharedPreferences a;

    /* compiled from: Comparisons.kt */
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return jw5.b(Long.valueOf(((UserId) ((Pair) t).i()).b), Long.valueOf(((UserId) ((Pair) t2).i()).b));
        }
    }

    public isp0(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    @Override // xsna.hsp0
    public final Map<UserId, String> a() {
        hfr t = rli0.t(rn00.w(d()), new aej(5));
        a aVar = new a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List B = rli0.B(t);
        g5g.L(B, aVar);
        Iterator it = ((ArrayList) B).iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            linkedHashMap.put(pair.i(), pair.j());
        }
        return linkedHashMap;
    }

    @Override // xsna.hsp0
    public final void b() {
        this.a.edit().clear().apply();
    }

    @Override // xsna.hsp0
    public final void c(UserId userId, String str) {
        String str2;
        String valueOf = String.valueOf(userId.b);
        SharedPreferences sharedPreferences = this.a;
        boolean contains = sharedPreferences.contains(valueOf);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (!contains) {
            Set keySet = d().keySet();
            if (keySet.size() >= 7 && (str2 = (String) j5g.r0(jw5.a(new j5b0(this, 20), new jvl0(5)), keySet)) != null) {
                edit.remove(str2);
                edit.remove("timestamp_".concat(str2));
            }
        }
        edit.putLong(go9.b("timestamp_", valueOf), System.currentTimeMillis());
        edit.putString(valueOf, str);
        edit.apply();
    }

    public final LinkedHashMap d() {
        Map<String, ?> all = this.a.getAll();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            if (!epx.f(key, "values") && !brm0.B(key, "timestamp_", false)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @Override // xsna.hsp0
    public final List<String> getAll() {
        return j5g.O0(((LinkedHashMap) a()).values());
    }
}
