package sg.bigo.ads.cg;

import android.os.Parcel;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huawei.hms.framework.common.BundleUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.rate.connection.CandidateTypeHintConfig;
import sg.bigo.ads.ai.j;
import sg.bigo.ads.an.f;
import sg.bigo.ads.an.n;
import sg.bigo.ads.cf.i;
import sg.bigo.ads.common.utils.l;

/* loaded from: classes9.dex */
public class b implements sg.bigo.ads.an.f {
    public C2452b a;
    public C2452b b;
    public int c;
    private final String d;
    private final String e;
    private Map<a, C2452b> f;
    private Map<a, List<C2452b>> g;
    private int h = 3;
    private Map<a, C2452b> i = b();
    private Map<a, List<C2452b>> j;

    public static class a implements sg.bigo.ads.an.f {
        private static final f.a<a> c = new f.a<a>() { // from class: sg.bigo.ads.cg.b.a.1
            @Override // sg.bigo.ads.an.f.a
            public final /* synthetic */ a a() {
                return new a("", 0);
            }
        };
        public String a;
        public int b;

        public a(String str, int i) {
            this.a = TextUtils.isEmpty(str) ? "all" : str.toLowerCase();
            this.b = i;
        }

        @Override // sg.bigo.ads.an.f
        public final void b(@NonNull Parcel parcel) {
            this.a = n.a(parcel, "");
            this.b = n.a(parcel, 0);
        }

        public final boolean equals(@Nullable Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (TextUtils.equals(this.a, aVar.a) && this.b == aVar.b) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return (this.a + BundleUtil.UNDERLINE_TAG + this.b).hashCode();
        }

        @NonNull
        public final String toString() {
            return super.toString();
        }

        @Override // sg.bigo.ads.an.f
        public final void a(@NonNull Parcel parcel) {
            parcel.writeString(this.a);
            parcel.writeInt(this.b);
        }
    }

    /* renamed from: sg.bigo.ads.cg.b$b, reason: collision with other inner class name */
    public static class C2452b extends i implements sg.bigo.ads.an.f {
        private static final f.a<C2452b> e = new f.a<C2452b>() { // from class: sg.bigo.ads.cg.b.b.1
            @Override // sg.bigo.ads.an.f.a
            public final /* synthetic */ C2452b a() {
                return new C2452b("", "", 0);
            }
        };
        boolean d;
        private int f;
        private long g;
        private int h;

        public C2452b(String str, String str2, int i) {
            super(str, str2, i);
            this.d = true;
            this.f = 0;
            this.g = 0L;
            this.h = 0;
        }

        public static /* synthetic */ int c(C2452b c2452b) {
            c2452b.h = 0;
            return 0;
        }

        public static /* synthetic */ int e(C2452b c2452b) {
            int i = c2452b.f;
            c2452b.f = i + 1;
            return i;
        }

        public static /* synthetic */ int f(C2452b c2452b) {
            c2452b.f = 0;
            return 0;
        }

        public static /* synthetic */ int g(C2452b c2452b) {
            int i = c2452b.h;
            c2452b.h = i + 1;
            return i;
        }

        public final boolean equals(@Nullable Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof i) {
                return TextUtils.equals(this.a, ((i) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            String str = this.a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        @Override // sg.bigo.ads.an.f
        public final void a(@NonNull Parcel parcel) {
            parcel.writeString(this.a);
            parcel.writeInt(this.c);
            n.a(parcel, this.d);
            parcel.writeString(this.b);
            parcel.writeInt(this.f);
            parcel.writeLong(this.g);
            parcel.writeInt(this.h);
        }

        @Override // sg.bigo.ads.an.f
        public final void b(@NonNull Parcel parcel) {
            this.a = n.a(parcel, "");
            this.c = n.a(parcel, 1);
            this.d = n.b(parcel, true);
            this.b = n.a(parcel, "");
            this.f = n.a(parcel, 0);
            this.g = n.a(parcel, 0L);
            this.h = n.a(parcel, 0);
        }

        public final void a(String str) {
            this.b = str;
        }
    }

    public b(@NonNull String str, @Nullable String str2) {
        this.d = str;
        this.e = str2;
    }

    @NonNull
    private Map<a, C2452b> b() {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(this.d)) {
            hashMap.put(new a("all", 0), new C2452b(this.d, "", 0));
        }
        if (!TextUtils.isEmpty(this.e)) {
            hashMap.put(new a("ru", 0), new C2452b(this.e, "", 0));
        }
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0020 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair<String, Integer> a(j jVar) {
        synchronized (this) {
            try {
                if (!l.a(this.f) && jVar != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    Iterator<Map.Entry<a, C2452b>> it = this.f.entrySet().iterator();
                    while (it.hasNext()) {
                        C2452b value = it.next().getValue();
                        if (!value.d) {
                            if (value.f % jVar.y() == 0) {
                                C2452b.c(value);
                                if (value.g != 0) {
                                    if (Math.round(Math.abs(currentTimeMillis - value.g) / 8.64E7f) > jVar.A()) {
                                    }
                                    value = null;
                                }
                                if (value != null) {
                                    value.g = currentTimeMillis;
                                    C2452b.e(value);
                                    return new Pair<>(value.a(), Integer.valueOf(value.f));
                                }
                            } else {
                                if (Math.round(Math.abs(currentTimeMillis - value.g) / 60000.0f) > jVar.z()) {
                                    if (value != null) {
                                    }
                                }
                                value = null;
                                if (value != null) {
                                }
                            }
                        }
                    }
                }
                return null;
            } finally {
            }
        }
    }

    @NonNull
    public String toString() {
        return super.toString();
    }

    @NonNull
    private static List<a> a(@NonNull a aVar) {
        ArrayList arrayList = new ArrayList();
        a aVar2 = new a("all", 0);
        if (aVar2.equals(aVar)) {
            arrayList.add(0, aVar);
            return arrayList;
        }
        arrayList.add(0, aVar2);
        a aVar3 = new a("all", aVar.b);
        if (aVar3.equals(aVar)) {
            arrayList.add(0, aVar);
            return arrayList;
        }
        arrayList.add(0, aVar3);
        a aVar4 = new a(aVar.a, 0);
        if (aVar4.equals(aVar)) {
            arrayList.add(0, aVar);
            return arrayList;
        }
        arrayList.add(0, aVar4);
        arrayList.add(0, aVar);
        return arrayList;
    }

    @Nullable
    private C2452b b(Map<a, List<C2452b>> map, a aVar) {
        if (!l.a(map) && aVar != null) {
            Iterator<a> it = a(aVar).iterator();
            while (it.hasNext()) {
                C2452b c2452b = (C2452b) l.a(l.a(map.get(it.next()), new Comparable<C2452b>() { // from class: sg.bigo.ads.cg.b.1
                    @Override // java.lang.Comparable
                    public final /* bridge */ /* synthetic */ int compareTo(C2452b c2452b2) {
                        C2452b c2452b3 = c2452b2;
                        return (c2452b3 == null || !c2452b3.d) ? 0 : 1;
                    }
                }));
                if (a(c2452b)) {
                    return c2452b;
                }
            }
        }
        return null;
    }

    @NonNull
    public final sg.bigo.ads.cf.d a(String str, int i) {
        boolean z;
        sg.bigo.ads.cf.d dVar;
        synchronized (this) {
            try {
                C2452b c2452b = this.b;
                if (c2452b == null || this.c >= this.h) {
                    a aVar = new a(str, i);
                    C2452b a2 = a(aVar, false);
                    if (a(a2)) {
                        z = false;
                    } else {
                        a();
                        a2 = a(aVar, true);
                        z = true;
                    }
                    if (a(a2)) {
                        a2.d = false;
                        this.a = this.b;
                        this.b = new C2452b(a2.a(), a2.b(), a2.d());
                        this.c = 0;
                    }
                    if (this.b == null) {
                        this.b = new C2452b(this.d, "", 0);
                    }
                    dVar = new sg.bigo.ads.cf.d(this.b, z, true);
                } else {
                    dVar = new sg.bigo.ads.cf.d(c2452b, false, false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }

    @Override // sg.bigo.ads.an.f
    public void b(@NonNull Parcel parcel) {
        synchronized (this) {
            try {
                this.f = n.a(parcel, a.c, C2452b.e);
                this.g = n.b(parcel, a.c, C2452b.e);
                this.h = n.a(parcel, 3);
                Map a2 = n.a(parcel, a.c, C2452b.e);
                this.j = n.b(parcel, a.c, C2452b.e);
                this.a = (C2452b) n.b(parcel, C2452b.e);
                this.b = (C2452b) n.b(parcel, C2452b.e);
                this.c = n.a(parcel, 0);
                this.i = b();
                HashSet hashSet = new HashSet();
                for (C2452b c2452b : this.i.values()) {
                    hashSet.add(c2452b.a());
                    if (!l.a(a2)) {
                        for (C2452b c2452b2 : a2.values()) {
                            if (TextUtils.equals(c2452b.a(), c2452b2.a())) {
                                c2452b.d = c2452b2.d;
                            }
                        }
                    }
                }
                C2452b c2452b3 = this.b;
                if (c2452b3 != null && c2452b3.d() == 0 && !hashSet.contains(this.b.a())) {
                    this.a = this.b;
                    this.b = null;
                    this.c = 0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    private static C2452b a(Map<a, C2452b> map, a aVar) {
        if (!l.a(map) && aVar != null) {
            Iterator<a> it = a(aVar).iterator();
            while (it.hasNext()) {
                C2452b c2452b = map.get(it.next());
                if (a(c2452b)) {
                    return c2452b;
                }
            }
        }
        return null;
    }

    @Nullable
    private C2452b a(a aVar, boolean z) {
        C2452b a2 = a(this.f, aVar);
        if (!a(a2)) {
            a2 = b(this.g, aVar);
            if (!a(a2)) {
                a2 = a(this.i, aVar);
                if (!a(a2)) {
                    a2 = b(this.j, aVar);
                    a(a2);
                }
            }
        }
        Objects.toString(aVar);
        Objects.toString(this.b);
        if (a(a2)) {
            return a2;
        }
        return null;
    }

    public final void a() {
        Map<a, C2452b> map = this.f;
        if (map != null) {
            Iterator<Map.Entry<a, C2452b>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                C2452b value = it.next().getValue();
                if (value != null) {
                    value.d = true;
                }
            }
        }
        Map<a, List<C2452b>> map2 = this.g;
        if (map2 != null) {
            Iterator<Map.Entry<a, List<C2452b>>> it2 = map2.entrySet().iterator();
            while (it2.hasNext()) {
                List<C2452b> value2 = it2.next().getValue();
                if (!l.a((Collection) value2)) {
                    Iterator<C2452b> it3 = value2.iterator();
                    while (it3.hasNext()) {
                        it3.next().d = true;
                    }
                }
            }
        }
        Map<a, List<C2452b>> map3 = this.j;
        if (map3 != null) {
            Iterator<Map.Entry<a, List<C2452b>>> it4 = map3.entrySet().iterator();
            while (it4.hasNext()) {
                List<C2452b> value3 = it4.next().getValue();
                if (!l.a((Collection) value3)) {
                    Iterator<C2452b> it5 = value3.iterator();
                    while (it5.hasNext()) {
                        it5.next().d = true;
                    }
                }
            }
        }
        Map<a, C2452b> map4 = this.i;
        if (map4 != null) {
            Iterator<Map.Entry<a, C2452b>> it6 = map4.entrySet().iterator();
            while (it6.hasNext()) {
                C2452b value4 = it6.next().getValue();
                if (value4 != null) {
                    value4.d = true;
                }
            }
        }
        this.a = this.b;
        this.b = null;
        this.c = 0;
    }

    @Override // sg.bigo.ads.an.f
    public void a(@NonNull Parcel parcel) {
        synchronized (this) {
            n.a(parcel, this.f);
            n.b(parcel, this.g);
            parcel.writeInt(this.h);
            n.a(parcel, this.i);
            n.b(parcel, this.j);
            n.a(parcel, this.a);
            n.a(parcel, this.b);
            parcel.writeInt(this.c);
        }
    }

    private void a(Map<a, C2452b> map, Map<a, List<C2452b>> map2, String str, int i) {
        C2452b value;
        C2452b c2452b;
        synchronized (this) {
            try {
                if (!l.a(this.f) && !l.a(map)) {
                    for (Map.Entry<a, C2452b> entry : this.f.entrySet()) {
                        a key = entry.getKey();
                        if (key != null && (value = entry.getValue()) != null && (c2452b = map.get(key)) != null && value.equals(c2452b)) {
                            value.a(c2452b.b());
                        }
                    }
                }
                if (!l.a(this.g) && !l.a(map2)) {
                    for (Map.Entry<a, List<C2452b>> entry2 : this.g.entrySet()) {
                        a key2 = entry2.getKey();
                        if (key2 != null) {
                            List<C2452b> value2 = entry2.getValue();
                            if (!l.a((Collection) value2)) {
                                List<C2452b> list = map2.get(key2);
                                if (!l.a((Collection) list)) {
                                    for (C2452b c2452b2 : value2) {
                                        if (c2452b2 != null) {
                                            Iterator<C2452b> it = list.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    C2452b next = it.next();
                                                    if (c2452b2.equals(next)) {
                                                        c2452b2.a(next.b());
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                C2452b c2452b3 = this.b;
                if (c2452b3 != null) {
                    if (c2452b3.d() == 1) {
                        C2452b c2452b4 = this.f.get(new a(str, i));
                        if (this.b.equals(c2452b4)) {
                            this.b.a(c2452b4.b());
                        }
                    } else if (this.b.d() == 2) {
                        List<C2452b> list2 = this.g.get(new a(str, i));
                        if (!l.a((Collection) list2)) {
                            Iterator<C2452b> it2 = list2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                C2452b next2 = it2.next();
                                if (this.b.equals(next2)) {
                                    this.b.a(next2.b());
                                    break;
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(@NonNull JSONObject jSONObject, boolean z, String str, int i) {
        synchronized (this) {
            try {
                HashMap hashMap = new HashMap();
                JSONArray optJSONArray = jSONObject.optJSONArray("country_hosts");
                if (optJSONArray != null) {
                    for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                        if (optJSONObject != null) {
                            String optString = optJSONObject.optString(CandidateTypeHintConfig.TYPE_HOST, "");
                            if (sg.bigo.ads.common.utils.c.a(optString)) {
                                hashMap.put(new a(optJSONObject.optString("country", "all"), optJSONObject.optInt("app_flag", 0)), new C2452b(optString, optJSONObject.optString("domain_front", ""), 1));
                            }
                        }
                    }
                }
                HashMap hashMap2 = new HashMap();
                JSONArray optJSONArray2 = jSONObject.optJSONArray("backup_hosts");
                if (optJSONArray2 != null) {
                    for (int i3 = 0; i3 < optJSONArray2.length(); i3++) {
                        JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i3);
                        if (optJSONObject2 != null) {
                            a aVar = new a(optJSONObject2.optString("country", "all"), optJSONObject2.optInt("app_flag", 0));
                            List list = (List) hashMap2.get(aVar);
                            if (list == null) {
                                list = new ArrayList();
                                hashMap2.put(aVar, list);
                            }
                            String optString2 = optJSONObject2.optString("domain_front", "");
                            JSONArray optJSONArray3 = optJSONObject2.optJSONArray("hosts");
                            if (optJSONArray3 != null) {
                                for (int i4 = 0; i4 < optJSONArray3.length(); i4++) {
                                    String optString3 = optJSONArray3.optString(i4, "");
                                    if (sg.bigo.ads.common.utils.c.a(optString3)) {
                                        C2452b c2452b = new C2452b(optString3, optString2, 2);
                                        if (!list.contains(c2452b)) {
                                            list.add(c2452b);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (z) {
                    a(hashMap, hashMap2, str, i);
                } else {
                    int optInt = jSONObject.optInt("threshold", 3);
                    this.f = hashMap;
                    this.g = hashMap2;
                    this.h = optInt;
                    this.j = new HashMap();
                    this.i = b();
                    this.a = this.b;
                    this.b = null;
                    this.c = 0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean a(String str, String str2) {
        synchronized (this) {
            try {
                if (sg.bigo.ads.common.utils.c.a(str2)) {
                    a aVar = new a(str, 0);
                    if (this.j == null) {
                        this.j = new HashMap();
                    }
                    List<C2452b> list = this.j.get(aVar);
                    if (list == null) {
                        list = new ArrayList<>();
                        this.j.put(aVar, list);
                    }
                    C2452b c2452b = new C2452b(str2, "", 3);
                    if (!list.contains(c2452b)) {
                        list.add(c2452b);
                        return true;
                    }
                }
                return false;
            } finally {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x003d, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0185, code lost:
    
        throw r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(String str, String str2, int i, j jVar, boolean z) {
        Map<a, C2452b> map;
        C2452b c2452b;
        Map<a, List<C2452b>> map2;
        synchronized (this) {
            try {
                if (!TextUtils.isEmpty(str) && (map = this.f) != null && jVar != null) {
                    Iterator<Map.Entry<a, C2452b>> it = map.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        c2452b = it.next().getValue();
                        if (TextUtils.equals(c2452b.a(), str)) {
                            if (z) {
                                C2452b.c(c2452b);
                                C2452b.f(c2452b);
                                break;
                            }
                            C2452b.g(c2452b);
                            if (c2452b.h != 0 && c2452b.h % jVar.y() == 0) {
                                break;
                            }
                        }
                    }
                    c2452b = null;
                    if (c2452b != null) {
                        C2452b.c(c2452b);
                        C2452b.f(c2452b);
                        C2452b a2 = a(this.f, new a(str2, i));
                        if (a2 != null) {
                            c2452b = a2;
                        }
                        C2452b c2452b2 = this.b;
                        if (c2452b2 != null) {
                            synchronized (this) {
                                ArrayList arrayList = new ArrayList();
                                int d = c2452b2.d();
                                if (d == 0) {
                                    Map<a, C2452b> map3 = this.i;
                                    if (map3 != null) {
                                        for (C2452b c2452b3 : map3.values()) {
                                            if (c2452b3 != null && TextUtils.equals(c2452b3.a(), c2452b2.a())) {
                                                arrayList.add(c2452b3);
                                            }
                                        }
                                    }
                                } else if (d == 1) {
                                    Map<a, C2452b> map4 = this.f;
                                    if (map4 != null) {
                                        for (C2452b c2452b4 : map4.values()) {
                                            if (c2452b4 != null && TextUtils.equals(c2452b4.a(), c2452b2.a())) {
                                                arrayList.add(c2452b4);
                                            }
                                        }
                                    }
                                } else if (d == 2) {
                                    Map<a, List<C2452b>> map5 = this.g;
                                    if (map5 != null) {
                                        Iterator<List<C2452b>> it2 = map5.values().iterator();
                                        while (it2.hasNext()) {
                                            for (C2452b c2452b5 : it2.next()) {
                                                if (c2452b5 != null && TextUtils.equals(c2452b5.a(), c2452b2.a())) {
                                                    arrayList.add(c2452b5);
                                                }
                                            }
                                        }
                                    }
                                } else if (d == 3 && (map2 = this.j) != null) {
                                    Iterator<List<C2452b>> it3 = map2.values().iterator();
                                    while (it3.hasNext()) {
                                        for (C2452b c2452b6 : it3.next()) {
                                            if (c2452b6 != null && TextUtils.equals(c2452b6.a(), c2452b2.a())) {
                                                arrayList.add(c2452b6);
                                            }
                                        }
                                    }
                                }
                                if (!arrayList.isEmpty()) {
                                    Iterator it4 = arrayList.iterator();
                                    while (it4.hasNext()) {
                                        ((C2452b) it4.next()).d = true;
                                    }
                                }
                            }
                        }
                        this.a = this.b;
                        this.b = c2452b;
                        this.c = 0;
                        return true;
                    }
                }
                return false;
            } finally {
            }
        }
    }

    private static boolean a(C2452b c2452b) {
        return c2452b != null && c2452b.d;
    }
}
