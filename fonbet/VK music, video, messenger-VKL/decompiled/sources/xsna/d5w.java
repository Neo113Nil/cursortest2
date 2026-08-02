package xsna;

import com.vk.im.engine.models.messages.Msg;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: ImItemHistory.kt */
/* loaded from: classes2.dex */
public final class d5w {
    public static final bpn0 j = new bpn0(new i13(14));
    public final List<a5w> a;
    public final Map<b5w, Msg> b;
    public final Set<b5w> c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final com.vk.im.engine.models.im_item.a h;
    public final boolean i;

    /* JADX WARN: Multi-variable type inference failed */
    public d5w(List<? extends a5w> list, Map<b5w, ? extends Msg> map, Set<b5w> set, boolean z, boolean z2, boolean z3, boolean z4, com.vk.im.engine.models.im_item.a aVar, boolean z5) {
        this.a = list;
        this.b = map;
        this.c = set;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = aVar;
        this.i = z5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static d5w a(d5w d5wVar, List list, LinkedHashMap linkedHashMap, Set set, boolean z, int i) {
        if ((i & 1) != 0) {
            list = d5wVar.a;
        }
        List list2 = list;
        Map map = linkedHashMap;
        if ((i & 2) != 0) {
            map = d5wVar.b;
        }
        Map map2 = map;
        if ((i & 4) != 0) {
            set = d5wVar.c;
        }
        Set set2 = set;
        boolean z2 = d5wVar.d;
        if ((i & 16) != 0) {
            z = d5wVar.e;
        }
        boolean z3 = z;
        boolean z4 = d5wVar.f;
        boolean z5 = (i & 64) != 0 ? d5wVar.g : true;
        com.vk.im.engine.models.im_item.a aVar = d5wVar.h;
        boolean z6 = (i & 256) != 0 ? d5wVar.i : true;
        d5wVar.getClass();
        return new d5w(list2, map2, set2, z2, z3, z4, z5, aVar, z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d5w)) {
            return false;
        }
        d5w d5wVar = (d5w) obj;
        return epx.f(this.a, d5wVar.a) && epx.f(this.b, d5wVar.b) && epx.f(this.c, d5wVar.c) && this.d == d5wVar.d && this.e == d5wVar.e && this.f == d5wVar.f && this.g == d5wVar.g && epx.f(this.h, d5wVar.h) && this.i == d5wVar.i;
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(qoy.b(qoy.b(fw3.b(v11.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        com.vk.im.engine.models.im_item.a aVar = this.h;
        return Boolean.hashCode(this.i) + ((b + (aVar == null ? 0 : aVar.hashCode())) * 31);
    }

    public final String toString() {
        List<a5w> list = this.a;
        String g0 = j5g.g0(list, StringUtils.COMMA, null, null, 0, new g53(22), 30);
        String g02 = j5g.g0(this.c, StringUtils.COMMA, null, null, 0, new qm(29), 30);
        StringBuilder sb = new StringBuilder("ImItemHistory\nsize -> ");
        sb.append(list.size());
        sb.append("\nitems -> ");
        sb.append(g0);
        sb.append("\nexpired -> ");
        sb.append(g02);
        sb.append("\nhasAfterCached -> ");
        sb.append(this.d);
        sb.append("\nhasAfterRemote -> ");
        sb.append(this.e);
        sb.append("\nhasBeforeCached -> ");
        sb.append(this.f);
        sb.append("\nhasBeforeRemote -> ");
        return defpackage.q0.a(sb, this.g, '\n');
    }
}
