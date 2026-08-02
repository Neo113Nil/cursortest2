package xsna;

import com.ironsource.B5;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.MapBuilder;
import kotlin.collections.builders.SetBuilder;

/* compiled from: TableInfo.android.kt */
/* loaded from: classes12.dex */
public final class nxn0 {
    public final String a;
    public final Map<String, a> b;
    public final Set<c> c;
    public final Set<d> d;

    /* compiled from: TableInfo.android.kt */
    public static final class a {
        public final String a;
        public final String b;
        public final boolean c;
        public final int d;
        public final String e;
        public final int f;
        public final int g;

        public a(int i, String str, String str2, String str3, boolean z, int i2) {
            this.a = str;
            this.b = str2;
            this.c = z;
            this.d = i;
            this.e = str3;
            this.f = i2;
            String upperCase = str2.toUpperCase(Locale.ROOT);
            this.g = drm0.D(upperCase, "INT", false) ? 3 : (drm0.D(upperCase, "CHAR", false) || drm0.D(upperCase, "CLOB", false) || drm0.D(upperCase, "TEXT", false)) ? 2 : drm0.D(upperCase, "BLOB", false) ? 5 : (drm0.D(upperCase, "REAL", false) || drm0.D(upperCase, "FLOA", false) || drm0.D(upperCase, "DOUB", false)) ? 4 : 1;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                    boolean z = this.d > 0;
                    a aVar = (a) obj;
                    boolean z2 = aVar.d > 0;
                    int i = aVar.f;
                    if (z == z2 && epx.f(this.a, aVar.a) && this.c == aVar.c) {
                        String str = aVar.e;
                        int i2 = this.f;
                        String str2 = this.e;
                        if ((i2 != 1 || i != 2 || str2 == null || oxn0.a(str2, str)) && ((i2 != 2 || i != 1 || str == null || oxn0.a(str, str2)) && ((i2 == 0 || i2 != i || (str2 == null ? str == null : oxn0.a(str2, str))) && this.g == aVar.g))) {
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return (((((this.a.hashCode() * 31) + this.g) * 31) + (this.c ? 1231 : 1237)) * 31) + this.d;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("\n            |Column {\n            |   name = '");
            sb.append(this.a);
            sb.append("',\n            |   type = '");
            sb.append(this.b);
            sb.append("',\n            |   affinity = '");
            sb.append(this.g);
            sb.append("',\n            |   notNull = '");
            sb.append(this.c);
            sb.append("',\n            |   primaryKeyPosition = '");
            sb.append(this.d);
            sb.append("',\n            |   defaultValue = '");
            String str = this.e;
            if (str == null) {
                str = StringUtils.UNDEFINED;
            }
            sb.append(str);
            sb.append("'\n            |}\n        ");
            return xqm0.f(xqm0.h(sb.toString()));
        }
    }

    /* compiled from: TableInfo.android.kt */
    public static final class b {
        /* JADX WARN: Code restructure failed: missing block: B:69:0x01da, code lost:
        
            r0 = r8.d();
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x01de, code lost:
        
            xsna.yfb.d(r2, null);
            r10 = r0;
         */
        /* JADX WARN: Finally extract failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static nxn0 a(hyg0 hyg0Var, String str) {
            Map h;
            SetBuilder setBuilder;
            qyg0 V0 = hyg0Var.V0("PRAGMA table_info(`" + str + "`)");
            try {
                long j = 0;
                if (V0.step()) {
                    int h2 = egi.h(V0, "name");
                    int h3 = egi.h(V0, "type");
                    int h4 = egi.h(V0, "notnull");
                    int h5 = egi.h(V0, "pk");
                    int h6 = egi.h(V0, "dflt_value");
                    MapBuilder mapBuilder = new MapBuilder();
                    do {
                        String l2 = V0.l2(h2);
                        mapBuilder.put(l2, new a((int) V0.getLong(h5), l2, V0.l2(h3), V0.isNull(h6) ? null : V0.l2(h6), V0.getLong(h4) != 0, 2));
                    } while (V0.step());
                    h = mapBuilder.h();
                    yfb.d(V0, null);
                } else {
                    h = jgp.b;
                    yfb.d(V0, null);
                }
                V0 = hyg0Var.V0("PRAGMA foreign_key_list(`" + str + "`)");
                try {
                    int h7 = egi.h(V0, "id");
                    int h8 = egi.h(V0, "seq");
                    int h9 = egi.h(V0, B5.R);
                    int h10 = egi.h(V0, "on_delete");
                    int h11 = egi.h(V0, "on_update");
                    List<w7s> a = n8h0.a(V0);
                    V0.reset();
                    SetBuilder setBuilder2 = new SetBuilder();
                    while (V0.step()) {
                        if (V0.getLong(h8) == j) {
                            int i = (int) V0.getLong(h7);
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = new ArrayList();
                            int i2 = h7;
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj : a) {
                                int i3 = h8;
                                List<w7s> list = a;
                                if (((w7s) obj).b == i) {
                                    arrayList3.add(obj);
                                }
                                h8 = i3;
                                a = list;
                            }
                            int i4 = h8;
                            List<w7s> list2 = a;
                            Iterator it = arrayList3.iterator();
                            while (it.hasNext()) {
                                w7s w7sVar = (w7s) it.next();
                                arrayList.add(w7sVar.d);
                                arrayList2.add(w7sVar.e);
                            }
                            setBuilder2.add(new c(V0.l2(h9), V0.l2(h10), V0.l2(h11), arrayList, arrayList2));
                            h7 = i2;
                            h8 = i4;
                            a = list2;
                            j = 0;
                        }
                    }
                    SetBuilder d = setBuilder2.d();
                    yfb.d(V0, null);
                    V0 = hyg0Var.V0("PRAGMA index_list(`" + str + "`)");
                    try {
                        int h12 = egi.h(V0, "name");
                        int h13 = egi.h(V0, "origin");
                        int h14 = egi.h(V0, "unique");
                        if (h12 == -1 || h13 == -1 || h14 == -1) {
                            yfb.d(V0, null);
                            setBuilder = null;
                        } else {
                            SetBuilder setBuilder3 = new SetBuilder();
                            while (true) {
                                if (!V0.step()) {
                                    break;
                                }
                                if ("c".equals(V0.l2(h13))) {
                                    d b = n8h0.b(hyg0Var, V0.l2(h12), V0.getLong(h14) == 1);
                                    if (b == null) {
                                        yfb.d(V0, null);
                                        setBuilder = null;
                                        break;
                                    }
                                    setBuilder3.add(b);
                                }
                            }
                        }
                        return new nxn0(str, h, d, setBuilder);
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } finally {
                    }
                }
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        }
    }

    /* compiled from: TableInfo.android.kt */
    public static final class c {
        public final String a;
        public final String b;
        public final String c;
        public final List<String> d;
        public final List<String> e;

        public c(String str, String str2, String str3, List<String> list, List<String> list2) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = list;
            this.e = list2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c) && epx.f(this.d, cVar.d)) {
                return epx.f(this.e, cVar.e);
            }
            return false;
        }

        public final int hashCode() {
            return this.e.hashCode() + fw3.a(urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("\n            |ForeignKey {\n            |   referenceTable = '");
            sb.append(this.a);
            sb.append("',\n            |   onDelete = '");
            sb.append(this.b);
            sb.append("',\n            |   onUpdate = '");
            sb.append(this.c);
            sb.append("',\n            |   columnNames = {");
            xqm0.f(j5g.g0(j5g.C0(this.d), StringUtils.COMMA, null, null, 0, null, 62));
            xqm0.f("},");
            s3q0 s3q0Var = s3q0.a;
            sb.append(s3q0Var);
            sb.append("\n            |   referenceColumnNames = {");
            xqm0.f(j5g.g0(j5g.C0(this.e), StringUtils.COMMA, null, null, 0, null, 62));
            xqm0.f(" }");
            sb.append(s3q0Var);
            sb.append("\n            |}\n        ");
            return xqm0.f(xqm0.h(sb.toString()));
        }
    }

    /* compiled from: TableInfo.android.kt */
    public static final class d {
        public final String a;
        public final boolean b;
        public final List<String> c;
        public final List<String> d;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r3v2 */
        /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
        public d(String str, List list, List list2, boolean z) {
            this.a = str;
            this.b = z;
            this.c = list;
            this.d = list2;
            List list3 = list2;
            if (list3.isEmpty()) {
                int size = list.size();
                list3 = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    list3.add("ASC");
                }
            }
            this.d = (List) list3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                boolean z = dVar.b;
                String str = dVar.a;
                if (this.b == z && epx.f(this.c, dVar.c) && epx.f(this.d, dVar.d)) {
                    String str2 = this.a;
                    return brm0.B(str2, "index_", false) ? brm0.B(str, "index_", false) : str2.equals(str);
                }
            }
            return false;
        }

        public final int hashCode() {
            String str = this.a;
            return this.d.hashCode() + fw3.a((((brm0.B(str, "index_", false) ? -1184239155 : str.hashCode()) * 31) + (this.b ? 1 : 0)) * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("\n            |Index {\n            |   name = '");
            sb.append(this.a);
            sb.append("',\n            |   unique = '");
            sb.append(this.b);
            sb.append("',\n            |   columns = {");
            xqm0.f(j5g.g0(this.c, StringUtils.COMMA, null, null, 0, null, 62));
            xqm0.f("},");
            s3q0 s3q0Var = s3q0.a;
            sb.append(s3q0Var);
            sb.append("\n            |   orders = {");
            xqm0.f(j5g.g0(this.d, StringUtils.COMMA, null, null, 0, null, 62));
            xqm0.f(" }");
            sb.append(s3q0Var);
            sb.append("\n            |}\n        ");
            return xqm0.f(xqm0.h(sb.toString()));
        }
    }

    public nxn0(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        this.a = str;
        this.b = map;
        this.c = abstractSet;
        this.d = abstractSet2;
    }

    @ozl
    public static final nxn0 a(sin0 sin0Var, String str) {
        return b.a(new qin0(sin0Var), str);
    }

    public final boolean equals(Object obj) {
        Set<d> set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nxn0)) {
            return false;
        }
        nxn0 nxn0Var = (nxn0) obj;
        if (!epx.f(this.a, nxn0Var.a) || !epx.f(this.b, nxn0Var.b) || !epx.f(this.c, nxn0Var.c)) {
            return false;
        }
        Set<d> set2 = this.d;
        if (set2 == null || (set = nxn0Var.d) == null) {
            return true;
        }
        return epx.f(set2, set);
    }

    public final int hashCode() {
        return this.c.hashCode() + v11.a(this.a.hashCode() * 31, 31, this.b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0051, code lost:
    
        if (r1 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        Collection collection;
        StringBuilder sb = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb.append(this.a);
        sb.append("',\n            |    columns = {");
        sb.append(oxn0.b(j5g.D0(new tbb0(3), this.b.values())));
        sb.append("\n            |    foreignKeys = {");
        sb.append(oxn0.b(this.c));
        sb.append("\n            |    indices = {");
        Set<d> set = this.d;
        if (set != null) {
            collection = j5g.D0(new wiu(3), set);
        }
        collection = EmptyList.b;
        sb.append(oxn0.b(collection));
        sb.append("\n            |}\n        ");
        return xqm0.h(sb.toString());
    }
}
