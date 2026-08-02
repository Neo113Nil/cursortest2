package xsna;

import com.vk.voip.userid.CallsUserId;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PastCallsContent.kt */
/* loaded from: classes7.dex */
public final class rp90 {
    public final List<a59> a;
    public final Map<CallsUserId, z49> b;
    public final Map<CallsUserId, w49> c;
    public final LinkedHashMap d;
    public final Map<CallsUserId, t49> e;
    public final b f;
    public final a g;

    /* compiled from: PastCallsContent.kt */
    public static abstract class a {

        /* compiled from: PastCallsContent.kt */
        /* renamed from: xsna.rp90$a$a, reason: collision with other inner class name */
        public static final class C3619a extends a {
            public static final C3619a a = new C3619a();
        }

        /* compiled from: PastCallsContent.kt */
        public static final class b extends a {
            public final a59 a;
            public final boolean b;

            public b(a59 a59Var, boolean z) {
                this.a = a59Var;
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && this.b == bVar.b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Visible(call=");
                sb.append(this.a);
                sb.append(", isFromMore=");
                return defpackage.q0.a(sb, this.b, ')');
            }
        }
    }

    /* compiled from: PastCallsContent.kt */
    public static abstract class b {

        /* compiled from: PastCallsContent.kt */
        public static final class a extends b {
            public static final a a = new a();
        }

        /* compiled from: PastCallsContent.kt */
        /* renamed from: xsna.rp90$b$b, reason: collision with other inner class name */
        public static final class C3620b extends b {
            public final CallsUserId a;

            public C3620b(CallsUserId callsUserId) {
                this.a = callsUserId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3620b) && epx.f(this.a, ((C3620b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "FromGroup(groupId=" + this.a + ')';
            }
        }

        /* compiled from: PastCallsContent.kt */
        public static final class c extends b {
            public static final c a = new c();
        }

        /* compiled from: PastCallsContent.kt */
        public static final class d extends b {
            public static final d a = new d();
        }
    }

    public rp90(List list, Map map, Map map2, LinkedHashMap linkedHashMap, Map map3, b bVar, a aVar) {
        this.a = list;
        this.b = map;
        this.c = map2;
        this.d = linkedHashMap;
        this.e = map3;
        this.f = bVar;
        this.g = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static rp90 a(rp90 rp90Var, List list, Map map, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, b bVar, a aVar, int i) {
        rp90Var.getClass();
        if ((i & 2) != 0) {
            list = rp90Var.a;
        }
        List list2 = list;
        if ((i & 4) != 0) {
            map = rp90Var.b;
        }
        Map map2 = map;
        Map map3 = linkedHashMap;
        if ((i & 8) != 0) {
            map3 = rp90Var.c;
        }
        Map map4 = map3;
        LinkedHashMap linkedHashMap3 = rp90Var.d;
        Map map5 = linkedHashMap2;
        if ((i & 32) != 0) {
            map5 = rp90Var.e;
        }
        Map map6 = map5;
        if ((i & 64) != 0) {
            bVar = rp90Var.f;
        }
        b bVar2 = bVar;
        if ((i & 128) != 0) {
            aVar = rp90Var.g;
        }
        rp90Var.getClass();
        return new rp90(list2, map2, map4, linkedHashMap3, map6, bVar2, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rp90)) {
            return false;
        }
        rp90 rp90Var = (rp90) obj;
        rp90Var.getClass();
        return epx.f(this.a, rp90Var.a) && epx.f(this.b, rp90Var.b) && epx.f(this.c, rp90Var.c) && this.d.equals(rp90Var.d) && epx.f(this.e, rp90Var.e) && epx.f(this.f, rp90Var.f) && epx.f(this.g, rp90Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + v11.a(uf3.b(this.d, v11.a(v11.a(fw3.a(Boolean.hashCode(true) * 31, 31, this.a), 31, this.b), 31, this.c), 31), 31, this.e)) * 31);
    }

    public final String toString() {
        return "PastCallsContent(enablePastCalls=true, pastCalls=" + this.a + ", pastCallsParticipants=" + this.b + ", pastCallsGroups=" + this.c + ", pastCallsFilterGroups=" + this.d + ", pastCallsContacts=" + this.e + ", pastCallsFilterState=" + this.f + ", pastCallDetailsDialogState=" + this.g + ')';
    }
}
