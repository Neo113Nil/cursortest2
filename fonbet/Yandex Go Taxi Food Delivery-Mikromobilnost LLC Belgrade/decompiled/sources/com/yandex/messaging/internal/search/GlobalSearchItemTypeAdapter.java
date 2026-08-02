package com.yandex.messaging.internal.search;

import com.squareup.moshi.FromJson;
import com.squareup.moshi.ToJson;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.ojt;
import defpackage.sjt;
import defpackage.tjt;
import defpackage.z83;
import kotlin.Metadata;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/messaging/internal/search/GlobalSearchItemTypeAdapter;", "", "<init>", "()V", "", "json", "Ltjt;", "fromJson", "(Ljava/lang/String;)Ltjt;", "item", "toJson", "(Ltjt;)Ljava/lang/String;", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GlobalSearchItemTypeAdapter {
    @FromJson
    public final tjt fromJson(String json2) {
        JSONObject jSONObject = new JSONObject(json2);
        Object opt = jSONObject.opt("type");
        String str = opt instanceof String ? (String) opt : null;
        if (jl40.l(str, "chat")) {
            Object opt2 = jSONObject.opt("id");
            String str2 = opt2 instanceof String ? (String) opt2 : null;
            if (str2 != null) {
                return new ojt(str2);
            }
            ny61.r("id is missing");
            return null;
        }
        if (!jl40.l(str, "user")) {
            throw new IllegalStateException((str + " does not support deserialization").toString());
        }
        Object opt3 = jSONObject.opt("id");
        String str3 = opt3 instanceof String ? (String) opt3 : null;
        if (str3 != null) {
            return new sjt(str3);
        }
        ny61.r("id is missing");
        return null;
    }

    @ToJson
    public final String toJson(tjt item) {
        JSONObject jSONObject = new JSONObject();
        if (item instanceof ojt) {
            jSONObject.put("type", "chat");
            jSONObject.put("id", ((ojt) item).a);
        } else if (item instanceof sjt) {
            jSONObject.put("type", "user");
            jSONObject.put("id", ((sjt) item).a);
        } else {
            z83.i();
        }
        return jSONObject.toString();
    }
}
