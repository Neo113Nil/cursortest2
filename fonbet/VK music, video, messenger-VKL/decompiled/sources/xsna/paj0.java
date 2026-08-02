package xsna;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.oxc0;

/* compiled from: SharedPreferencesExt.kt */
/* loaded from: classes.dex */
public final class paj0 implements SharedPreferences {
    public final /* synthetic */ SharedPreferences a;

    /* compiled from: SharedPreferencesExt.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements yzs<SharedPreferences, String, Boolean, Boolean> {
        public static final a b = new a(3, SharedPreferences.class, "getBoolean", "getBoolean(Ljava/lang/String;Z)Z", 0);

        @Override // xsna.yzs
        public final Boolean invoke(SharedPreferences sharedPreferences, String str, Boolean bool) {
            return Boolean.valueOf(sharedPreferences.getBoolean(str, bool.booleanValue()));
        }
    }

    /* compiled from: SharedPreferencesExt.kt */
    /* loaded from: classes17.dex */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements yzs<SharedPreferences, String, Float, Float> {
        public static final b b = new b(3, SharedPreferences.class, "getFloat", "getFloat(Ljava/lang/String;F)F", 0);

        @Override // xsna.yzs
        public final Float invoke(SharedPreferences sharedPreferences, String str, Float f) {
            return Float.valueOf(sharedPreferences.getFloat(str, f.floatValue()));
        }
    }

    /* compiled from: SharedPreferencesExt.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements yzs<SharedPreferences, String, Integer, Integer> {
        public static final c b = new c(3, SharedPreferences.class, "getInt", "getInt(Ljava/lang/String;I)I", 0);

        @Override // xsna.yzs
        public final Integer invoke(SharedPreferences sharedPreferences, String str, Integer num) {
            return Integer.valueOf(sharedPreferences.getInt(str, num.intValue()));
        }
    }

    /* compiled from: SharedPreferencesExt.kt */
    /* loaded from: classes17.dex */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements yzs<SharedPreferences, String, Long, Long> {
        public static final d b = new d(3, SharedPreferences.class, "getLong", "getLong(Ljava/lang/String;J)J", 0);

        @Override // xsna.yzs
        public final Long invoke(SharedPreferences sharedPreferences, String str, Long l) {
            return Long.valueOf(sharedPreferences.getLong(str, l.longValue()));
        }
    }

    /* compiled from: SharedPreferencesExt.kt */
    /* loaded from: classes17.dex */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements yzs<SharedPreferences, String, String, String> {
        public static final e b = new e(3, SharedPreferences.class, "getString", "getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", 0);

        @Override // xsna.yzs
        public final String invoke(SharedPreferences sharedPreferences, String str, String str2) {
            return sharedPreferences.getString(str, str2);
        }
    }

    /* compiled from: SharedPreferencesExt.kt */
    /* loaded from: classes17.dex */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements yzs<SharedPreferences, String, Set<String>, Set<String>> {
        public static final f b = new f(3, SharedPreferences.class, "getStringSet", "getStringSet(Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;", 0);

        @Override // xsna.yzs
        public final Set<String> invoke(SharedPreferences sharedPreferences, String str, Set<String> set) {
            return sharedPreferences.getStringSet(str, set);
        }
    }

    public paj0(Map<String, oxc0.b> map, oxc0 oxc0Var, SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2) {
        Map<String, ?> all;
        Object obj;
        Object invoke;
        SharedPreferences.Editor remove;
        SharedPreferences.Editor remove2;
        this.a = sharedPreferences2;
        Iterator<Map.Entry<String, oxc0.b>> it = map.entrySet().iterator();
        while (true) {
            SharedPreferences sharedPreferences3 = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, oxc0.b> next = it.next();
            String key = next.getKey();
            oxc0.b value = next.getValue();
            if (sharedPreferences.contains(key)) {
                sharedPreferences3 = sharedPreferences;
            } else if (sharedPreferences2.contains(key)) {
                sharedPreferences3 = sharedPreferences2;
            }
            if (sharedPreferences3 != null && (all = sharedPreferences3.getAll()) != null && (obj = all.get(key)) != null && (invoke = value.c.invoke(obj)) != null) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                if (edit != null && (remove2 = edit.remove(key)) != null) {
                    remove2.apply();
                }
                SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                if (edit2 != null && (remove = edit2.remove(key)) != null) {
                    remove.apply();
                }
                qaj0.c(sharedPreferences2, value.b, invoke);
            }
        }
        List<oxc0.b> list = oxc0Var.a;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            ((oxc0.b) it2.next()).getClass();
        }
        Iterator it3 = arrayList.iterator();
        if (it3.hasNext()) {
            String str = ((oxc0.b) it3.next()).b;
            throw null;
        }
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        return this.a.contains(str);
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return this.a.edit();
    }

    @Override // android.content.SharedPreferences
    public final Map<String, ?> getAll() {
        return this.a.getAll();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z) {
        a aVar = a.b;
        Object valueOf = Boolean.valueOf(z);
        SharedPreferences sharedPreferences = this.a;
        if (sharedPreferences.contains(str)) {
            valueOf = aVar.invoke(sharedPreferences, str, valueOf);
        }
        return ((Boolean) valueOf).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f2) {
        b bVar = b.b;
        Object valueOf = Float.valueOf(f2);
        SharedPreferences sharedPreferences = this.a;
        if (sharedPreferences.contains(str)) {
            valueOf = bVar.invoke(sharedPreferences, str, valueOf);
        }
        return ((Number) valueOf).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i) {
        c cVar = c.b;
        Object valueOf = Integer.valueOf(i);
        SharedPreferences sharedPreferences = this.a;
        if (sharedPreferences.contains(str)) {
            valueOf = cVar.invoke(sharedPreferences, str, valueOf);
        }
        return ((Number) valueOf).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        d dVar = d.b;
        Object valueOf = Long.valueOf(j);
        SharedPreferences sharedPreferences = this.a;
        if (sharedPreferences.contains(str)) {
            valueOf = dVar.invoke(sharedPreferences, str, valueOf);
        }
        return ((Number) valueOf).longValue();
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        e eVar = e.b;
        SharedPreferences sharedPreferences = this.a;
        Object obj = str2;
        if (sharedPreferences.contains(str)) {
            obj = eVar.invoke(sharedPreferences, str, str2);
        }
        return (String) obj;
    }

    @Override // android.content.SharedPreferences
    public final Set<String> getStringSet(String str, Set<String> set) {
        f fVar = f.b;
        SharedPreferences sharedPreferences = this.a;
        if (sharedPreferences.contains(str)) {
            set = fVar.invoke(sharedPreferences, str, set);
        }
        return set;
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.a.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.a.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }
}
