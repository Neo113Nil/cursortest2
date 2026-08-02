package com.yandex.fintechsdk.adapters.flex.sdk.impl.state;

import com.yandex.div.state.db.StateEntry;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.state.JasonStateExtKt;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.state.BduiStateManagerImpl;
import com.yandex.fintechsdk.core.bdui.api.state.BduiStateTag;
import defpackage.d6x;
import defpackage.h5x;
import defpackage.i5x;
import defpackage.j5x;
import defpackage.jl40;
import defpackage.k6x;
import defpackage.m5x;
import defpackage.o6x;
import defpackage.p6x;
import defpackage.q6x;
import defpackage.r6x;
import defpackage.s6x;
import defpackage.sh5;
import defpackage.th5;
import defpackage.uza;
import defpackage.v4x;
import defpackage.v6x;
import defpackage.w4x;
import defpackage.w511;
import defpackage.wls;
import defpackage.zw01;
import defpackage.zy11;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.collections.builders.MapBuilder;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b0\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J5\u0010\u001b\u001a\u0004\u0018\u00010\u000f2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b0\u00122\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001d\u001a\u0004\u0018\u00010\u00142\b\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010!\u001a\u00020\u00142\b\u0010\u001f\u001a\u0004\u0018\u00010\u00142\u0006\u0010 \u001a\u00020\u0014H\u0002¢\u0006\u0004\b!\u0010\"JC\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00140\u00122\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00140\u00122\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00140\u0012H\u0002¢\u0006\u0004\b#\u0010$JY\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00140%*\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00140%2\u001e\u0010&\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b0\u00120\u00122\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\bH\u0002¢\u0006\u0004\b)\u0010*J\u001f\u0010+\u001a\u0004\u0018\u00010\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b+\u0010,J/\u0010.\u001a\u00020-2\u001e\u0010&\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b0\u00120\u0012H\u0016¢\u0006\u0004\b.\u0010/J=\u0010.\u001a\u00020-2\u001e\u0010&\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b0\u00120\u00122\f\u00100\u001a\b\u0012\u0004\u0012\u00020'0\bH\u0016¢\u0006\u0004\b.\u00101R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00102¨\u00063"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/state/BduiStateManagerImpl;", "Lsh5;", "Lk6x;", "jasonStateStore", "<init>", "(Lk6x;)V", "Lm5x;", "obj", "", "", StateEntry.COLUMN_PATH, "", "extractValueRecursive", "(Lm5x;Ljava/util/List;)Ljava/lang/Object;", "value", "Lj5x;", "getJasonNode", "(Ljava/lang/Object;)Lj5x;", "", "screenStates", "Lq6x;", "getNewTagsScreenState", "(Ljava/util/Map;)Lq6x;", "keyValues", "screenStateName", "Ld6x;", ClidProvider.STATE, "getNewValueScreenState", "(Ljava/util/Map;Ljava/lang/String;Ld6x;)Lj5x;", "getTagsNode", "(Ljava/lang/Object;)Lq6x;", "last", "new", "merge", "(Lq6x;Lq6x;)Lq6x;", "mergeTree", "(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;", "", "payload", "Lcom/yandex/fintechsdk/core/bdui/api/state/BduiStateTag;", "tagsToUpdate", "updateTags", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/List;)Ljava/util/Map;", "getValue", "(Ljava/util/List;)Ljava/lang/Object;", "Lzy11;", "update", "(Ljava/util/Map;)V", "tags", "(Ljava/util/Map;Ljava/util/List;)V", "Lk6x;", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class BduiStateManagerImpl implements sh5 {
    private final k6x jasonStateStore;

    public BduiStateManagerImpl(k6x k6xVar) {
        this.jasonStateStore = k6xVar;
    }

    private final Object extractValueRecursive(m5x obj, List<String> path) {
        if (path.isEmpty()) {
            return obj;
        }
        j5x j5xVar = (j5x) obj.a.get(path.get(0));
        if (j5xVar != null) {
            List<String> J = a.J(path, 1);
            if (J.isEmpty()) {
                if (j5xVar instanceof o6x) {
                    return ((o6x) j5xVar).a;
                }
                if (j5xVar instanceof i5x) {
                    return Long.valueOf(((i5x) j5xVar).a);
                }
                if (j5xVar instanceof h5x) {
                    return Double.valueOf(((h5x) j5xVar).a);
                }
                if (j5xVar instanceof w4x) {
                    return Boolean.valueOf(((w4x) j5xVar).a);
                }
                if (j5xVar instanceof m5x) {
                    return JasonStateExtKt.objectContent((m5x) j5xVar);
                }
                if (j5xVar instanceof v4x) {
                    return JasonStateExtKt.arrayContent((v4x) j5xVar);
                }
                w511.b();
                return null;
            }
            if (j5xVar instanceof m5x) {
                return extractValueRecursive((m5x) j5xVar, J);
            }
        }
        return null;
    }

    private final j5x getJasonNode(Object value) {
        if (value == null) {
            return null;
        }
        if (value instanceof Boolean) {
            return new w4x(((Boolean) value).booleanValue());
        }
        if (value instanceof String) {
            return new o6x((String) value);
        }
        if (value instanceof Long) {
            return new i5x(((Number) value).longValue());
        }
        if (value instanceof Integer) {
            return new i5x(((Number) value).intValue());
        }
        if (value instanceof Double) {
            return new h5x(((Number) value).doubleValue());
        }
        if (value instanceof byte[]) {
            return new o6x(new String((byte[]) value, uza.a));
        }
        if (value instanceof List) {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((Iterable) value).iterator();
            while (it.hasNext()) {
                j5x jasonNode = getJasonNode(it.next());
                if (jasonNode != null) {
                    arrayList.add(jasonNode);
                }
            }
            return new v4x(arrayList);
        }
        if (value instanceof Map) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((Map) value).entrySet()) {
                Object key = entry.getKey();
                j5x jasonNode2 = getJasonNode(entry.getValue());
                if (jasonNode2 != null) {
                    linkedHashMap.put(String.valueOf(key), jasonNode2);
                }
            }
            return new m5x(linkedHashMap);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Field[] declaredFields = value.getClass().getDeclaredFields();
        int i = 0;
        while (true) {
            if (!(i < declaredFields.length)) {
                return new m5x(linkedHashMap2);
            }
            int i2 = i + 1;
            try {
                Field field = declaredFields[i];
                if (!Modifier.isStatic(field.getModifiers()) && !field.isAnnotationPresent(zw01.class)) {
                    field.setAccessible(true);
                    j5x jasonNode3 = getJasonNode(field.get(value));
                    if (jasonNode3 != null) {
                        linkedHashMap2.put(field.getName(), jasonNode3);
                    }
                }
                i = i2;
            } catch (ArrayIndexOutOfBoundsException e) {
                w511.i(e.getMessage());
                return null;
            }
        }
    }

    private final q6x getNewTagsScreenState(Map<String, ? extends Object> screenStates) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends Object> entry : screenStates.entrySet()) {
            q6x tagsNode = getTagsNode(entry.getValue());
            if (tagsNode != null) {
                linkedHashMap.put(entry.getKey(), tagsNode);
            }
        }
        return new r6x(linkedHashMap);
    }

    private final j5x getNewValueScreenState(Map<String, ? extends Object> keyValues, String screenStateName, d6x state) {
        Object obj = (j5x) state.a.a.a.get(screenStateName);
        if (obj == null) {
            obj = new m5x(b.f());
        }
        m5x m5xVar = obj instanceof m5x ? (m5x) obj : null;
        if (m5xVar == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(m5xVar.a);
        for (Map.Entry<String, ? extends Object> entry : keyValues.entrySet()) {
            String key = entry.getKey();
            j5x jasonNode = getJasonNode(entry.getValue());
            if (jasonNode != null) {
                linkedHashMap.put(key, jasonNode);
            }
        }
        return new m5x(b.t(linkedHashMap));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final q6x getTagsNode(Object value) {
        if (value == null) {
            return null;
        }
        if (!(value instanceof Map)) {
            return new p6x("*");
        }
        final MapBuilder mapBuilder = new MapBuilder();
        ((Map) value).forEach(new th5(0, new wls() { // from class: com.yandex.fintechsdk.adapters.flex.sdk.impl.state.BduiStateManagerImpl$getTagsNode$1$1
            /* JADX WARN: Code restructure failed: missing block: B:3:0x0004, code lost:
            
                r3 = r1.this$0.getTagsNode(r3);
             */
            /* renamed from: invoke, reason: collision with other method in class */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void m170invoke(Object obj, Object obj2) {
                q6x tagsNode;
                if (!(obj instanceof String) || tagsNode == null) {
                    return;
                }
                mapBuilder.put(obj, tagsNode);
            }

            @Override // defpackage.wls
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                m170invoke(obj, obj2);
                return zy11.a;
            }
        }));
        return new r6x(mapBuilder.j());
    }

    private final q6x merge(q6x last, q6x r3) {
        return (last != null && (last instanceof r6x) && (r3 instanceof r6x)) ? new r6x(mergeTree(((r6x) last).a, ((r6x) r3).a)) : r3;
    }

    private final Map<String, q6x> mergeTree(Map<String, ? extends q6x> last, Map<String, ? extends q6x> r4) {
        final LinkedHashMap linkedHashMap = new LinkedHashMap(last);
        r4.forEach(new th5(1, new wls() { // from class: uh5
            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                zy11 mergeTree$lambda$18;
                mergeTree$lambda$18 = BduiStateManagerImpl.mergeTree$lambda$18(linkedHashMap, this, (String) obj, (q6x) obj2);
                return mergeTree$lambda$18;
            }
        }));
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 mergeTree$lambda$18(Map map, BduiStateManagerImpl bduiStateManagerImpl, String str, q6x q6xVar) {
        map.put(str, bduiStateManagerImpl.merge((q6x) map.get(str), q6xVar));
        return zy11.a;
    }

    private static final d6x update$lambda$4(BduiStateManagerImpl bduiStateManagerImpl, Map map, List list, d6x d6xVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(d6xVar.b.a);
        bduiStateManagerImpl.updateTags(linkedHashMap, map, list);
        s6x s6xVar = new s6x(linkedHashMap);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(d6xVar.a.a.a);
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            j5x newValueScreenState = bduiStateManagerImpl.getNewValueScreenState((Map) entry.getValue(), str, d6xVar);
            if (newValueScreenState != null) {
                linkedHashMap2.put(str, newValueScreenState);
            }
        }
        return new d6x(new v6x(new m5x(linkedHashMap2)), s6xVar);
    }

    private final Map<String, q6x> updateTags(Map<String, q6x> map, Map<String, ? extends Map<String, ? extends Object>> map2, List<? extends BduiStateTag> list) {
        for (BduiStateTag bduiStateTag : list) {
            map.put(bduiStateTag.getKey(), merge(map.get(bduiStateTag.getKey()), getNewTagsScreenState(map2)));
        }
        return map;
    }

    @Override // defpackage.sh5
    public Object getValue(List<String> path) {
        return extractValueRecursive(this.jasonStateStore.b.a.a, path);
    }

    @Override // defpackage.sh5
    public void update(Map<String, ? extends Map<String, ? extends Object>> payload, List<? extends BduiStateTag> tags) {
        k6x k6xVar = this.jasonStateStore;
        if (k6xVar.a()) {
            d6x update$lambda$4 = update$lambda$4(this, payload, tags, k6xVar.b());
            if (jl40.l(update$lambda$4, k6xVar.b())) {
                return;
            }
            k6xVar.e(update$lambda$4);
        }
    }

    public void update(Map<String, ? extends Map<String, ? extends Object>> payload) {
        update(payload, Collections.singletonList(BduiStateTag.SEND_TO_BACKEND));
    }
}
