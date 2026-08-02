package xsna;

import com.ironsource.C4504q2;
import com.ironsource.X3;
import com.vk.toggle.data.BannerScheduleLocation;
import com.vk.toggle.data.Repeat;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.Pair;
import kotlin.collections.builders.ListBuilder;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: NotificationResubscribeBannerScheduleConfig.kt */
/* loaded from: classes11.dex */
public final class ie70 {
    public static final a b = new a();
    public final LinkedHashMap a;

    /* compiled from: NotificationResubscribeBannerScheduleConfig.kt */
    public static final class a {
        /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x00ea A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:58:0x00eb  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static ie70 a(JSONObject jSONObject) {
            LinkedHashMap linkedHashMap;
            BannerScheduleLocation bannerScheduleLocation;
            ListBuilder g;
            Pair pair;
            JSONArray optJSONArray = jSONObject.optJSONArray("rules");
            if (optJSONArray != null && optJSONArray.length() != 0) {
                linkedHashMap = new LinkedHashMap();
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        String lowerCase = optJSONObject.optString("location").toLowerCase(Locale.ROOT);
                        int hashCode = lowerCase.hashCode();
                        if (hashCode == 3052376) {
                            if (lowerCase.equals("chat")) {
                                bannerScheduleLocation = BannerScheduleLocation.CHAT;
                                if (bannerScheduleLocation != null) {
                                }
                            }
                            bannerScheduleLocation = null;
                            if (bannerScheduleLocation != null) {
                            }
                        } else if (hashCode != 1272354024) {
                            if (hashCode == 1619864869 && lowerCase.equals("chat_list")) {
                                bannerScheduleLocation = BannerScheduleLocation.CHAT_LIST;
                                if (bannerScheduleLocation != null) {
                                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("days");
                                    if (optJSONArray2 == null) {
                                        g = null;
                                    } else {
                                        ListBuilder e = e43.e();
                                        int length2 = optJSONArray2.length();
                                        for (int i2 = 0; i2 < length2; i2++) {
                                            e.add(Integer.valueOf(optJSONArray2.getInt(i2)));
                                        }
                                        g = e.g();
                                    }
                                    if (g != null) {
                                        if (g.isEmpty()) {
                                            g = null;
                                        }
                                        if (g != null) {
                                            String lowerCase2 = optJSONObject.optString(X3.a.t, "stop").toLowerCase(Locale.ROOT);
                                            pair = new Pair(bannerScheduleLocation, new l26(g, lowerCase2.equals("repeat_last") ? Repeat.REPEAT_LAST : lowerCase2.equals("cycle") ? Repeat.CYCLE : Repeat.STOP));
                                            if (pair != null && linkedHashMap.put(pair.i(), pair.j()) == null) {
                                            }
                                        }
                                    }
                                }
                            }
                            bannerScheduleLocation = null;
                            if (bannerScheduleLocation != null) {
                            }
                        } else {
                            if (lowerCase.equals(C4504q2.x)) {
                                bannerScheduleLocation = BannerScheduleLocation.NOTIFICATIONS;
                                if (bannerScheduleLocation != null) {
                                }
                            }
                            bannerScheduleLocation = null;
                            if (bannerScheduleLocation != null) {
                            }
                        }
                    }
                    pair = null;
                    if (pair != null) {
                    }
                }
                if (linkedHashMap != null) {
                    return null;
                }
                return new ie70(linkedHashMap);
            }
            linkedHashMap = null;
            if (linkedHashMap != null) {
            }
        }
    }

    public ie70(LinkedHashMap linkedHashMap) {
        this.a = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ie70) && this.a.equals(((ie70) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NotificationResubscribeBannerScheduleConfig(rules=" + this.a + ')';
    }
}
