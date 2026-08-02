package xsna;

import com.vk.device.store.AppStore;
import java.util.EnumMap;
import org.json.JSONObject;

/* compiled from: AppStoreLinksConfig.kt */
/* loaded from: classes18.dex */
public final class aa3 {
    public final EnumMap<AppStore, String> a;

    /* compiled from: AppStoreLinksConfig.kt */
    public static final class a {
        public static aa3 a(JSONObject jSONObject) {
            EnumMap enumMap = new EnumMap(AppStore.class);
            enumMap.put((EnumMap) AppStore.GOOGLE, (AppStore) jSONObject.optString("link"));
            enumMap.put((EnumMap) AppStore.HUAWEI, (AppStore) jSONObject.optString("huawei_link"));
            enumMap.put((EnumMap) AppStore.RUSTORE, (AppStore) jSONObject.optString("rustore_link"));
            enumMap.put((EnumMap) AppStore.SAMSUNG, (AppStore) jSONObject.optString("samsung_link"));
            enumMap.put((EnumMap) AppStore.XIAOMI, (AppStore) jSONObject.optString("xiaomi_link"));
            return new aa3(enumMap);
        }
    }

    public aa3(EnumMap<AppStore, String> enumMap) {
        this.a = enumMap;
    }
}
