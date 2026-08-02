package com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.state;

import android.os.Bundle;
import android.util.Log;
import defpackage.d6x;
import defpackage.g8e;
import defpackage.h5x;
import defpackage.i5x;
import defpackage.j5x;
import defpackage.jl40;
import defpackage.k6x;
import defpackage.m5x;
import defpackage.ny61;
import defpackage.o6x;
import defpackage.p6x;
import defpackage.q6x;
import defpackage.r6x;
import defpackage.s6x;
import defpackage.v4x;
import defpackage.v6x;
import defpackage.w4x;
import defpackage.w511;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\r\u001a\u00020\t*\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\u000fH\u0002¢\u0006\u0004\b\u000b\u0010\u0010\u001a\u0013\u0010\u0011\u001a\u00020\u000f*\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0013\u0010\u000b\u001a\u00020\u0014*\u00020\u0013H\u0002¢\u0006\u0004\b\u000b\u0010\u0015\u001a\u0013\u0010\u0017\u001a\u00020\n*\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0013\u0010\u001b\u001a\u00020\u001a*\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0013\u0010\u001d\u001a\u00020\u0013*\u00020\nH\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0013\u0010\u001f\u001a\u00020\u0016*\u00020\nH\u0002¢\u0006\u0004\b\u001f\u0010 \u001a\u0013\u0010!\u001a\u00020\u0019*\u00020\u001aH\u0002¢\u0006\u0004\b!\u0010\"\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020#H\u0002¢\u0006\u0004\b\u000b\u0010$\u001a#\u0010)\u001a\u00020\n2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%H\u0002¢\u0006\u0004\b)\u0010*\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020'H\u0002¢\u0006\u0004\b\u000b\u0010+\u001a\u0013\u0010,\u001a\u00020#*\u00020\nH\u0002¢\u0006\u0004\b,\u0010-\u001a\u001f\u0010.\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%*\u00020\nH\u0002¢\u0006\u0004\b.\u0010/\u001a\u0013\u00100\u001a\u00020'*\u00020\nH\u0002¢\u0006\u0004\b0\u00101\"\u0014\u00102\u001a\u00020&8\u0002X\u0082T¢\u0006\u0006\n\u0004\b2\u00103¨\u00064"}, d2 = {"Lk6x;", "Landroid/os/Bundle;", "bundle", "Lzy11;", "saveToBundle", "(Lk6x;Landroid/os/Bundle;)V", "", "restoreFromBundle", "(Lk6x;Landroid/os/Bundle;)Z", "Ld6x;", "Lorg/json/JSONObject;", "toJson", "(Ld6x;)Lorg/json/JSONObject;", "toJasonState", "(Lorg/json/JSONObject;)Ld6x;", "Lv6x;", "(Lv6x;)Lorg/json/JSONObject;", "toJasonValue", "(Lorg/json/JSONObject;)Lv6x;", "Lj5x;", "", "(Lj5x;)Ljava/lang/Object;", "Lm5x;", "toJsonContent", "(Lm5x;)Lorg/json/JSONObject;", "Lv4x;", "Lorg/json/JSONArray;", "toJsonArray", "(Lv4x;)Lorg/json/JSONArray;", "toJasonNode", "(Lorg/json/JSONObject;)Lj5x;", "toJasonObject", "(Lorg/json/JSONObject;)Lm5x;", "toJasonArray", "(Lorg/json/JSONArray;)Lv4x;", "Ls6x;", "(Ls6x;)Lorg/json/JSONObject;", "", "", "Lq6x;", "tags", "tagsMapToJson", "(Ljava/util/Map;)Lorg/json/JSONObject;", "(Lq6x;)Lorg/json/JSONObject;", "toJasonTags", "(Lorg/json/JSONObject;)Ls6x;", "toTagsMap", "(Lorg/json/JSONObject;)Ljava/util/Map;", "toTagsNode", "(Lorg/json/JSONObject;)Lq6x;", "KEY_JASON_STATE", "Ljava/lang/String;", "impl-18-1-0_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class JasonStateSerializerKt {
    private static final String KEY_JASON_STATE = "flex_jason_state";

    public static final boolean restoreFromBundle(k6x k6xVar, Bundle bundle) {
        String string;
        if (bundle != null && (string = bundle.getString(KEY_JASON_STATE)) != null) {
            try {
                d6x jasonState = toJasonState(new JSONObject(string));
                if (!k6xVar.a()) {
                    return true;
                }
                d6x restoreFromBundle$lambda$0 = restoreFromBundle$lambda$0(jasonState, k6xVar.b());
                if (jl40.l(restoreFromBundle$lambda$0, k6xVar.b())) {
                    return true;
                }
                k6xVar.e(restoreFromBundle$lambda$0);
                return true;
            } catch (Exception e) {
                Log.e("JasonStateSerializer", "Failed to restore JasonState from bundle", e);
            }
        }
        return false;
    }

    private static final d6x restoreFromBundle$lambda$0(d6x d6xVar, d6x d6xVar2) {
        return d6xVar;
    }

    public static final void saveToBundle(k6x k6xVar, Bundle bundle) {
        bundle.putString(KEY_JASON_STATE, toJson(k6xVar.b).toString());
    }

    private static final JSONObject tagsMapToJson(Map<String, ? extends q6x> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ? extends q6x> entry : map.entrySet()) {
            jSONObject.put(entry.getKey(), toJson(entry.getValue()));
        }
        return jSONObject;
    }

    private static final v4x toJasonArray(JSONArray jSONArray) {
        Object o6xVar;
        Object jasonArray;
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONObject) {
                jasonArray = toJasonNode((JSONObject) obj);
            } else {
                if (obj instanceof String) {
                    o6xVar = new o6x((String) obj);
                } else if (obj instanceof Long) {
                    o6xVar = new i5x(((Number) obj).longValue());
                } else if (obj instanceof Integer) {
                    o6xVar = new i5x(((Number) obj).intValue());
                } else if (obj instanceof Double) {
                    o6xVar = new h5x(((Number) obj).doubleValue());
                } else if (obj instanceof Boolean) {
                    o6xVar = new w4x(((Boolean) obj).booleanValue());
                } else if (obj instanceof JSONArray) {
                    jasonArray = toJasonArray((JSONArray) obj);
                } else {
                    o6xVar = new o6x(obj.toString());
                }
                jasonArray = o6xVar;
            }
            arrayList.add(jasonArray);
        }
        return new v4x(arrayList);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    private static final j5x toJasonNode(JSONObject jSONObject) {
        String string = jSONObject.getString("type");
        if (string != null) {
            switch (string.hashCode()) {
                case -1023368385:
                    if (string.equals("object")) {
                        return toJasonObject(jSONObject.getJSONObject("content"));
                    }
                    break;
                case -891985903:
                    if (string.equals("string")) {
                        return new o6x(jSONObject.getString("content"));
                    }
                    break;
                case -766442982:
                    if (string.equals("float64")) {
                        return new h5x(jSONObject.getDouble("content"));
                    }
                    break;
                case 64711720:
                    if (string.equals("boolean")) {
                        return new w4x(jSONObject.getBoolean("content"));
                    }
                    break;
                case 93090393:
                    if (string.equals("array")) {
                        return toJasonArray(jSONObject.getJSONArray("content"));
                    }
                    break;
                case 100359917:
                    if (string.equals("int64")) {
                        return new i5x(jSONObject.getLong("content"));
                    }
                    break;
            }
        }
        ny61.g(g8e.o("Unknown JasonNode type: ", string));
        return null;
    }

    private static final m5x toJasonObject(JSONObject jSONObject) {
        Object o6xVar;
        Object jasonArray;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONObject) {
                jasonArray = toJasonNode((JSONObject) obj);
            } else {
                if (obj instanceof String) {
                    o6xVar = new o6x((String) obj);
                } else if (obj instanceof Long) {
                    o6xVar = new i5x(((Number) obj).longValue());
                } else if (obj instanceof Integer) {
                    o6xVar = new i5x(((Number) obj).intValue());
                } else if (obj instanceof Double) {
                    o6xVar = new h5x(((Number) obj).doubleValue());
                } else if (obj instanceof Boolean) {
                    o6xVar = new w4x(((Boolean) obj).booleanValue());
                } else if (obj instanceof JSONArray) {
                    jasonArray = toJasonArray((JSONArray) obj);
                } else {
                    o6xVar = new o6x(obj.toString());
                }
                jasonArray = o6xVar;
            }
            linkedHashMap.put(next, jasonArray);
        }
        return new m5x(linkedHashMap);
    }

    public static final d6x toJasonState(JSONObject jSONObject) {
        return new d6x(toJasonValue(jSONObject.getJSONObject("value")), toJasonTags(jSONObject.getJSONObject("tags")));
    }

    private static final s6x toJasonTags(JSONObject jSONObject) {
        return new s6x(toTagsMap(jSONObject.getJSONObject("tags")));
    }

    private static final v6x toJasonValue(JSONObject jSONObject) {
        return new v6x(toJasonObject(jSONObject.getJSONObject("content")));
    }

    private static final Object toJson(j5x j5xVar) {
        if (j5xVar instanceof o6x) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "string");
            jSONObject.put("content", ((o6x) j5xVar).a);
            return jSONObject;
        }
        if (j5xVar instanceof i5x) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("type", "int64");
            jSONObject2.put("content", ((i5x) j5xVar).a);
            return jSONObject2;
        }
        if (j5xVar instanceof h5x) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("type", "float64");
            jSONObject3.put("content", ((h5x) j5xVar).a);
            return jSONObject3;
        }
        if (j5xVar instanceof w4x) {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("type", "boolean");
            jSONObject4.put("content", ((w4x) j5xVar).a);
            return jSONObject4;
        }
        if (j5xVar instanceof m5x) {
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("type", "object");
            jSONObject5.put("content", toJsonContent((m5x) j5xVar));
            return jSONObject5;
        }
        if (!(j5xVar instanceof v4x)) {
            w511.b();
            return null;
        }
        JSONObject jSONObject6 = new JSONObject();
        jSONObject6.put("type", "array");
        jSONObject6.put("content", toJsonArray((v4x) j5xVar));
        return jSONObject6;
    }

    private static final JSONArray toJsonArray(v4x v4xVar) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = v4xVar.a.iterator();
        while (it.hasNext()) {
            jSONArray.put(toJson((j5x) it.next()));
        }
        return jSONArray;
    }

    private static final JSONObject toJsonContent(m5x m5xVar) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : m5xVar.a.entrySet()) {
            jSONObject.put((String) entry.getKey(), toJson((j5x) entry.getValue()));
        }
        return jSONObject;
    }

    private static final Map<String, q6x> toTagsMap(JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            linkedHashMap.put(next, toTagsNode(jSONObject.getJSONObject(next)));
        }
        return linkedHashMap;
    }

    private static final q6x toTagsNode(JSONObject jSONObject) {
        String string = jSONObject.getString("type");
        if (jl40.l(string, "leaf")) {
            return new p6x(jSONObject.getString("content"));
        }
        if (jl40.l(string, "tree")) {
            return new r6x(toTagsMap(jSONObject.getJSONObject("content")));
        }
        ny61.g(g8e.o("Unknown JasonTags.Node type: ", string));
        return null;
    }

    private static final JSONObject toJson(v6x v6xVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("content", toJsonContent(v6xVar.a));
        return jSONObject;
    }

    public static final JSONObject toJson(d6x d6xVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("value", toJson(d6xVar.a));
        jSONObject.put("tags", toJson(d6xVar.b));
        return jSONObject;
    }

    private static final JSONObject toJson(s6x s6xVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("tags", tagsMapToJson(s6xVar.a));
        return jSONObject;
    }

    private static final JSONObject toJson(q6x q6xVar) {
        if (q6xVar instanceof p6x) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "leaf");
            jSONObject.put("content", ((p6x) q6xVar).a);
            return jSONObject;
        }
        if (q6xVar instanceof r6x) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("type", "tree");
            jSONObject2.put("content", tagsMapToJson(((r6x) q6xVar).a));
            return jSONObject2;
        }
        w511.b();
        return null;
    }
}
