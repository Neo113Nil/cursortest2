package xsna;

import com.vk.dto.common.Source;
import com.vk.dto.messages.MsgIdType;
import com.vk.im.engine.models.dialogs.DialogsHistory;
import com.vk.im.engine.models.messages.Msg;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: DialogsHistoryGetByCacheHelper.kt */
/* loaded from: classes2.dex */
public final class hrm {
    public static final hrm a = new hrm();

    /* compiled from: DialogsHistoryGetByCacheHelper.kt */
    public static final class a {
        public final List<arm> a;
        public final boolean b;
        public final boolean c;

        public a(List<arm> list, boolean z, boolean z2) {
            this.a = list;
            this.b = z;
            this.c = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + qoy.b(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DialogsHistoryRaw(history=");
            sb.append(this.a);
            sb.append(", hasBeforeInCache=");
            sb.append(this.b);
            sb.append(", hasAfterInCache=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: DialogsHistoryGetByCacheHelper.kt */
    public static final class b {
        public final List<arm> a;
        public final Object b;
        public final Set<Long> c;
        public final boolean d;
        public final boolean e;
        public final boolean f;
        public final boolean g;

        public b(List<arm> list, Map<Long, lj30> map, Set<Long> set, boolean z, boolean z2, boolean z3, boolean z4) {
            this.a = list;
            this.b = map;
            this.c = set;
            this.d = z;
            this.e = z2;
            this.f = z3;
            this.g = z4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b.equals(bVar.b) && epx.f(this.c, bVar.c) && this.d == bVar.d && this.e == bVar.e && this.f == bVar.f && this.g == bVar.g;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.g) + qoy.b(qoy.b(qoy.b(fw3.b(vul0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DialogsHistoryStructure(history=");
            sb.append(this.a);
            sb.append(", latestMsg=");
            sb.append(this.b);
            sb.append(", expiredDialogsIds=");
            sb.append(this.c);
            sb.append(", hasHistoryAfter=");
            sb.append(this.d);
            sb.append(", hasHistoryAfterCached=");
            sb.append(this.e);
            sb.append(", hasHistoryBefore=");
            sb.append(this.f);
            sb.append(", hasHistoryBeforeCached=");
            return defpackage.q0.a(sb, this.g, ')');
        }
    }

    /* compiled from: DialogsHistoryGetByCacheHelper.kt */
    public static final class c {
        public final gkx0 a;
        public final pum b;
        public final int c;

        public c(gkx0 gkx0Var, pum pumVar, int i) {
            this.a = gkx0Var;
            this.b = pumVar;
            this.c = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && this.c == cVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + ((this.b.hashCode() + (Long.hashCode(this.a.b) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DialogsHistoryStructureLoadArgs(since=");
            sb.append(this.a);
            sb.append(", mode=");
            sb.append(this.b);
            sb.append(", limit=");
            return vu5.b(sb, this.c, ')');
        }
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, java.util.Map] */
    public static LinkedHashMap a(w2w w2wVar, b bVar) {
        Collection values = bVar.b.values();
        ArrayList arrayList = new ArrayList(c5g.u(values, 10));
        Iterator it = values.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((lj30) it.next()).c));
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        ArrayList arrayList2 = arrayList;
        if (arrayList2 != null) {
            Collection values2 = ((wpp) w2wVar.L0(a, new dj30(MsgIdType.LOCAL_ID, arrayList2, null, Source.CACHE, false, null, 52))).c.values();
            if (values2 != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj : values2) {
                    linkedHashMap.put(Long.valueOf(((Msg) obj).c), obj);
                }
                return linkedHashMap;
            }
        }
        return new LinkedHashMap();
    }

    public static DialogsHistory b(w2w w2wVar, drm drmVar) {
        return (DialogsHistory) w2wVar.I0().c(new bi0(15, w2wVar, drmVar));
    }
}
