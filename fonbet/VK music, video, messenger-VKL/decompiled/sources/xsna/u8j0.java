package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.narratives.Narrative;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.builders.ListBuilder;
import kotlin.collections.builders.MapBuilder;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.q8j0;

/* compiled from: ShareStoryReducer.kt */
/* loaded from: classes16.dex */
public final class u8j0 extends dm50<e9j0, q8j0, c9j0> {
    public final gpj0 d;
    public final boolean e;

    public u8j0(c9j0 c9j0Var, gpj0 gpj0Var, boolean z) {
        super(c9j0Var);
        this.d = gpj0Var;
        this.e = z;
    }

    public static MapBuilder i(c9j0 c9j0Var, izs izsVar) {
        MapBuilder mapBuilder = new MapBuilder();
        Map<UserId, Set<Narrative>> map = c9j0Var.h;
        UserId userId = c9j0Var.b;
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!epx.f(entry.getKey(), userId)) {
                mapBuilder.put(entry.getKey(), entry.getValue());
            }
        }
        mapBuilder.put(userId, (Set) izsVar.invoke(c9j0Var.h.getOrDefault(userId, EmptySet.b)));
        return mapBuilder.h();
    }

    @Override // xsna.dm50
    public final c9j0 c(c9j0 c9j0Var, q8j0 q8j0Var) {
        UserId uid;
        c9j0 c9j0Var2 = c9j0Var;
        q8j0 q8j0Var2 = q8j0Var;
        List<Group> list = c9j0Var2.f;
        UserId userId = c9j0Var2.b;
        if (q8j0Var2 instanceof q8j0.c) {
            q8j0.c cVar = (q8j0.c) q8j0Var2;
            return c9j0.a(c9j0Var2, null, null, 0, cVar.b, null, null, false, null, cVar.c, 495);
        }
        if (q8j0Var2 instanceof q8j0.b) {
            Group group = ((q8j0.b) q8j0Var2).b;
            if (group == null || (uid = group.c) == null) {
                uid = this.d.getUid();
            }
            return c9j0.a(c9j0Var2, uid, null, 0, null, null, null, true, null, null, 894);
        }
        if (q8j0Var2 instanceof q8j0.d) {
            ListBuilder e = e43.e();
            List<Group> list2 = list;
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                e.add((Group) it.next());
            }
            ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(((Group) it2.next()).c);
            }
            Set S0 = j5g.S0(arrayList);
            for (Group group2 : ((q8j0.d) q8j0Var2).b) {
                if (!S0.contains(group2.c)) {
                    e.add(group2);
                }
            }
            s3q0 s3q0Var = s3q0.a;
            return c9j0.a(c9j0Var2, null, null, 0, e.g(), null, null, false, null, null, 1007);
        }
        if (q8j0Var2 instanceof q8j0.i) {
            if (fkq0.d(userId)) {
                c9j0Var2 = c9j0.a(c9j0Var2, null, ((q8j0.i) q8j0Var2).b, 0, null, null, null, false, null, null, IronSourceError.ERROR_RV_EMPTY_DEFAULT_PLACEMENT);
            }
            return c9j0.a(c9j0Var2, null, null, 0, null, null, null, false, null, null, 1015);
        }
        if (q8j0Var2 instanceof q8j0.h) {
            return c9j0.a(c9j0Var2, null, null, ((q8j0.h) q8j0Var2).b, null, null, null, false, null, null, 1019);
        }
        if (q8j0Var2 instanceof q8j0.a) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(c9j0Var2.k);
            linkedHashMap.put(userId, Boolean.valueOf(((q8j0.a) q8j0Var2).b));
            return c9j0.a(c9j0Var2, null, null, 0, null, null, null, false, null, linkedHashMap, ApiInvocationException.ErrorCodes.IDS_BLOCKED);
        }
        if (q8j0Var2 instanceof q8j0.f) {
            return c9j0.a(c9j0Var2, null, null, 0, null, null, i(c9j0Var2, new e810(q8j0Var2, 27)), false, null, null, 959);
        }
        if (q8j0Var2 instanceof q8j0.g) {
            return c9j0.a(c9j0Var2, null, null, 0, null, null, i(c9j0Var2, new n3b0(q8j0Var2, 11)), false, null, null, 959);
        }
        if (!(q8j0Var2 instanceof q8j0.e)) {
            return c9j0.a(c9j0Var2, null, null, 0, null, null, null, false, null, null, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE);
        }
        q8j0.e eVar = (q8j0.e) q8j0Var2;
        boolean z = eVar.d;
        MapBuilder mapBuilder = new MapBuilder();
        Map<UserId, List<Narrative>> map = c9j0Var2.g;
        Iterator<T> it3 = map.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            if (!epx.f(entry.getKey(), userId)) {
                mapBuilder.put(entry.getKey(), entry.getValue());
            }
        }
        ListBuilder e2 = e43.e();
        List<Narrative> list3 = eVar.b;
        if (z) {
            for (Narrative narrative : list3) {
                if (!map.getOrDefault(userId, EmptyList.b).contains(narrative)) {
                    e2.add(narrative);
                }
            }
        }
        Iterator<T> it4 = map.getOrDefault(userId, EmptyList.b).iterator();
        while (it4.hasNext()) {
            e2.add((Narrative) it4.next());
        }
        if (!z) {
            for (Narrative narrative2 : list3) {
                if (!map.getOrDefault(userId, EmptyList.b).contains(narrative2)) {
                    e2.add(narrative2);
                }
            }
        }
        mapBuilder.put(userId, e2.g());
        MapBuilder h = mapBuilder.h();
        MapBuilder mapBuilder2 = new MapBuilder();
        Iterator<T> it5 = c9j0Var2.j.entrySet().iterator();
        while (it5.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it5.next();
            if (!epx.f(entry2.getKey(), userId)) {
                mapBuilder2.put(entry2.getKey(), entry2.getValue());
            }
        }
        mapBuilder2.put(userId, eVar.c);
        return c9j0.a(c9j0Var2, null, null, 0, null, h, null, false, mapBuilder2.h(), null, IronSourceError.ERROR_BN_INSTANCE_INIT_TIMEOUT);
    }

    @Override // xsna.dm50
    public final e9j0 d() {
        return new e9j0(e(new q9i0(this, 2)));
    }

    @Override // xsna.dm50
    public final void h(c9j0 c9j0Var, e9j0 e9j0Var) {
        f(e9j0Var.a, c9j0Var);
    }
}
