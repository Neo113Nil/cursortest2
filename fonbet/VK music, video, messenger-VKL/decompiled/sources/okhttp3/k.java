package okhttp3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.brm0;
import xsna.drm0;
import xsna.g5g;
import xsna.gcy;
import xsna.tyx;
import xsna.wk3;
import xsna.x2r0;

/* compiled from: Headers.kt */
/* loaded from: classes11.dex */
public final class k implements Iterable<Pair<? extends String, ? extends String>>, gcy {
    public final String[] b;

    /* compiled from: Headers.kt */
    public static final class a {
        public final ArrayList a = new ArrayList(20);

        public final void a(String str) {
            int L = drm0.L(str, ':', 0, 6);
            if (L == -1) {
                throw new IllegalArgumentException("Unexpected header: ".concat(str).toString());
            }
            b(drm0.p0(str.substring(0, L)).toString(), str.substring(L + 1));
        }

        public final void b(String str, String str2) {
            b.a(str);
            b.b(str2, str);
            d(str, str2);
        }

        public final void c(String str) {
            int L = drm0.L(str, ':', 1, 4);
            if (L != -1) {
                d(str.substring(0, L), str.substring(L + 1));
            } else if (str.charAt(0) == ':') {
                d("", str.substring(1));
            } else {
                d("", str);
            }
        }

        public final void d(String str, String str2) {
            ArrayList arrayList = this.a;
            arrayList.add(str);
            arrayList.add(drm0.p0(str2).toString());
        }

        public final k e() {
            return new k((String[]) this.a.toArray(new String[0]));
        }

        public final String f(String str) {
            ArrayList arrayList = this.a;
            int size = arrayList.size() - 2;
            int b = tyx.b(size, 0, -2);
            if (b > size) {
                return null;
            }
            while (!str.equalsIgnoreCase((String) arrayList.get(size))) {
                if (size == b) {
                    return null;
                }
                size -= 2;
            }
            return (String) arrayList.get(size + 1);
        }

        public final void g(String str) {
            int i = 0;
            while (true) {
                ArrayList arrayList = this.a;
                if (i >= arrayList.size()) {
                    return;
                }
                if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                    arrayList.remove(i);
                    arrayList.remove(i);
                    i -= 2;
                }
                i += 2;
            }
        }

        public final void h(String str, String str2) {
            b.a(str);
            b.b(str2, str);
            g(str);
            d(str, str2);
        }
    }

    /* compiled from: Headers.kt */
    public static final class b {
        public static void a(String str) {
            if (str.length() <= 0) {
                throw new IllegalArgumentException("name is empty");
            }
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if ('!' > charAt || charAt >= 127) {
                    throw new IllegalArgumentException(x2r0.h("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str).toString());
                }
            }
        }

        public static void b(String str, String str2) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt != '\t' && (' ' > charAt || charAt >= 127)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(x2r0.h("Unexpected char %#04x at %d in %s value", Integer.valueOf(charAt), Integer.valueOf(i), str2));
                    sb.append(x2r0.p(str2) ? "" : ": ".concat(str));
                    throw new IllegalArgumentException(sb.toString().toString());
                }
            }
        }

        public static k c(Map map) {
            String[] strArr = new String[map.size() * 2];
            int i = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                String obj = drm0.p0(str).toString();
                String obj2 = drm0.p0(str2).toString();
                a(obj);
                b(obj2, obj);
                strArr[i] = obj;
                strArr[i + 1] = obj2;
                i += 2;
            }
            return new k(strArr);
        }

        public static k d(String... strArr) {
            if (strArr.length % 2 != 0) {
                throw new IllegalArgumentException("Expected alternating header names and values");
            }
            String[] strArr2 = (String[]) strArr.clone();
            int length = strArr2.length;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                String str = strArr2[i2];
                if (str == null) {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
                strArr2[i2] = drm0.p0(str).toString();
            }
            int b = tyx.b(0, strArr2.length - 1, 2);
            if (b >= 0) {
                while (true) {
                    String str2 = strArr2[i];
                    String str3 = strArr2[i + 1];
                    a(str2);
                    b(str3, str2);
                    if (i == b) {
                        break;
                    }
                    i += 2;
                }
            }
            return new k(strArr2);
        }
    }

    public k(String[] strArr) {
        this.b = strArr;
    }

    public final String a(String str) {
        String[] strArr = this.b;
        int length = strArr.length - 2;
        int b2 = tyx.b(length, 0, -2);
        if (b2 > length) {
            return null;
        }
        while (!brm0.w(str, strArr[length], true)) {
            if (length == b2) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    public final String c(int i) {
        return this.b[i * 2];
    }

    public final a d() {
        a aVar = new a();
        g5g.A(aVar.a, this.b);
        return aVar;
    }

    public final TreeMap e() {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        int size = size();
        for (int i = 0; i < size; i++) {
            String lowerCase = c(i).toLowerCase(Locale.US);
            List list = (List) treeMap.get(lowerCase);
            if (list == null) {
                list = new ArrayList(2);
                treeMap.put(lowerCase, list);
            }
            list.add(f(i));
        }
        return treeMap;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return Arrays.equals(this.b, ((k) obj).b);
        }
        return false;
    }

    public final String f(int i) {
        return this.b[(i * 2) + 1];
    }

    public final List<String> g(String str) {
        int size = size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase(c(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(f(i));
            }
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : EmptyList.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b);
    }

    @Override // java.lang.Iterable
    public final Iterator<Pair<? extends String, ? extends String>> iterator() {
        int size = size();
        Pair[] pairArr = new Pair[size];
        for (int i = 0; i < size; i++) {
            pairArr[i] = new Pair(c(i), f(i));
        }
        return new wk3(pairArr);
    }

    public final int size() {
        return this.b.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String c = c(i);
            String f = f(i);
            sb.append(c);
            sb.append(": ");
            if (x2r0.p(c)) {
                f = "██";
            }
            sb.append(f);
            sb.append("\n");
        }
        return sb.toString();
    }
}
