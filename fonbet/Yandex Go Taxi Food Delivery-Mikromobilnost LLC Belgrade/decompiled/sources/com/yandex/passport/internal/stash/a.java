package com.yandex.passport.internal.stash;

import com.yandex.passport.api.KPassportStashCell;
import com.yandex.passport.internal.LegacyExtraData;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class a {
    public static Stash a() {
        return new Stash(kotlin.collections.b.f());
    }

    public static Stash b(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!jSONObject.isNull(next)) {
                hashMap.put(next, jSONObject.getString(next));
            }
        }
        return new Stash(hashMap);
    }

    public static Stash c(LegacyExtraData legacyExtraData) {
        if (legacyExtraData == null) {
            return a();
        }
        String str = legacyExtraData.diskPinCode;
        String str2 = legacyExtraData.mailPinCode;
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put(KPassportStashCell.DISK_PIN_CODE.getValue(), str);
        }
        if (str2 != null) {
            hashMap.put(KPassportStashCell.MAIL_PIN_CODE.getValue(), str2);
        }
        return new Stash(hashMap);
    }
}
