package com.yandex.div.internal.parser;

import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.j5g;
import xsna.pr;

/* compiled from: JsonTopologicalSorting.kt */
/* loaded from: classes7.dex */
public final class JsonTopologicalSorting {
    public static final JsonTopologicalSorting INSTANCE = new JsonTopologicalSorting();
    private static final ValueValidator<String> TYPE_VALIDATOR = new pr(19);

    private JsonTopologicalSorting() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean TYPE_VALIDATOR$lambda$0(String str) {
        return str.length() > 0;
    }

    private final Map<String, List<String>> parseTypeDependencies(ParsingContext parsingContext, JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(jSONObject.length());
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONObject) {
                ArrayList arrayList = new ArrayList();
                INSTANCE.readObjectDependencies(parsingContext, new TemplateParsingErrorLogger(parsingContext.getLogger(), next), (JSONObject) obj, true, arrayList);
                linkedHashMap.put(next, arrayList);
            }
        }
        return linkedHashMap;
    }

    private final void processType(String str, Map<String, List<String>> map, Set<String> set, Set<String> set2, LinkedHashMap<String, Set<String>> linkedHashMap) {
        List list;
        Set<String> set3;
        LinkedHashMap<String, Set<String>> linkedHashMap2;
        if (set.contains(str)) {
            throwCyclicDependency(j5g.O0(set), str);
            throw new KotlinNothingValueException();
        }
        if (set2.contains(str)) {
            return;
        }
        List<String> list2 = map.get(str);
        if (list2 != null) {
            list = new ArrayList();
            for (Object obj : list2) {
                if (map.containsKey((String) obj)) {
                    list.add(obj);
                }
            }
        } else {
            list = null;
        }
        if (list == null || list.isEmpty()) {
            set3 = set2;
            linkedHashMap2 = linkedHashMap;
        } else {
            set.add(str);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                processType((String) it.next(), map, set, set2, linkedHashMap);
            }
            set3 = set2;
            linkedHashMap2 = linkedHashMap;
            set.remove(str);
        }
        set3.add(str);
        if (list == null) {
            list = EmptyList.b;
        }
        linkedHashMap2.put(str, j5g.S0(list));
    }

    private final void readObjectDependencies(ParsingContext parsingContext, ParsingErrorLogger parsingErrorLogger, JSONObject jSONObject, boolean z, List<String> list) {
        String readParent = z ? readParent(parsingContext, jSONObject) : readOptionalParent(parsingContext, jSONObject);
        List<String> list2 = list;
        if (readParent != null) {
            list.add(readParent);
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            Object obj = jSONObject.get(keys.next());
            if (obj instanceof JSONObject) {
                INSTANCE.readObjectDependencies(parsingContext, parsingErrorLogger, (JSONObject) obj, false, list2);
            }
            list2 = list;
        }
        Iterator<String> keys2 = jSONObject.keys();
        while (keys2.hasNext()) {
            Object obj2 = jSONObject.get(keys2.next());
            if (obj2 instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj2;
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    Object obj3 = jSONArray.get(i);
                    if (obj3 instanceof JSONObject) {
                        INSTANCE.readObjectDependencies(parsingContext, parsingErrorLogger, (JSONObject) obj3, false, list);
                    }
                }
            }
        }
    }

    private final String readOptionalParent(ParsingContext parsingContext, JSONObject jSONObject) {
        return (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "type", TYPE_VALIDATOR);
    }

    private final String readParent(ParsingContext parsingContext, JSONObject jSONObject) {
        return (String) JsonPropertyParser.read(parsingContext, jSONObject, "type", TYPE_VALIDATOR);
    }

    private final Void throwCyclicDependency(List<String> list, String str) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int indexOf = list.indexOf(str); indexOf < size; indexOf++) {
            sb.append(list.get(indexOf));
            sb.append(" -> ");
        }
        sb.append(str);
        throw new CyclicDependencyException(sb.toString());
    }

    public final Map<String, Set<String>> sort(ParsingContext parsingContext, JSONObject jSONObject) throws JSONException, ParsingException, CyclicDependencyException {
        Map<String, List<String>> parseTypeDependencies = parseTypeDependencies(parsingContext, jSONObject);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        LinkedHashMap<String, Set<String>> linkedHashMap = new LinkedHashMap<>();
        Iterator<String> it = parseTypeDependencies.keySet().iterator();
        while (it.hasNext()) {
            processType(it.next(), parseTypeDependencies, linkedHashSet, linkedHashSet2, linkedHashMap);
        }
        return linkedHashMap;
    }
}
