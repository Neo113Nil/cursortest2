package xsna;

import com.vk.core.preference.Preference;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.PredictiveSearchConfig;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stickers.StickersDictionaryItemLight;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.kbl0;
import xsna.kcl0;

/* compiled from: PredictiveSuggestionInteractor.kt */
/* loaded from: classes6.dex */
public final class nxc0 {
    public final kcl0 a;
    public final kcl0.c b;
    public String c;
    public boolean d;
    public StickersDictionaryItemLight e;
    public HashMap<String, StickersDictionaryItemLight> f;
    public final k9x g;
    public final k9x h;
    public final List<String> i;

    public nxc0(kcl0 kcl0Var) {
        PredictiveSearchConfig predictiveSearchConfig;
        this.a = kcl0Var;
        s6n0 o = kcl0Var.o();
        this.b = o;
        this.c = "";
        this.f = new HashMap<>();
        o.getClass();
        HashMap<UserId, kbl0> hashMap = kbl0.b;
        String s = Preference.s(kbl0.a.b().a, "stickers_predictive_search_config", "");
        if (s.length() == 0) {
            predictiveSearchConfig = new PredictiveSearchConfig(0, 0, 0, 0, null, 31, null);
        } else {
            try {
                Serializer.c<PredictiveSearchConfig> cVar = PredictiveSearchConfig.CREATOR;
                JSONObject jSONObject = new JSONObject(s);
                int optInt = jSONObject.optInt("search_min_length", 2);
                int optInt2 = jSONObject.optInt("search_max_length", 15);
                int optInt3 = jSONObject.optInt("fuzzy_search_min_length", 4);
                int optInt4 = jSONObject.optInt("fuzzy_search_max_length", 10);
                JSONArray optJSONArray = jSONObject.optJSONArray("word_hashes");
                predictiveSearchConfig = new PredictiveSearchConfig(optInt, optInt2, optInt3, optInt4, optJSONArray != null ? f370.O(optJSONArray) : EmptyList.b);
            } catch (Throwable unused) {
                predictiveSearchConfig = new PredictiveSearchConfig(0, 0, 0, 0, null, 31, null);
            }
        }
        this.g = new k9x(predictiveSearchConfig.b, predictiveSearchConfig.c, 1);
        this.h = new k9x(predictiveSearchConfig.d, predictiveSearchConfig.e, 1);
        this.i = predictiveSearchConfig.f;
    }

    public static void a(TreeMap treeMap, Map.Entry entry, int i, HashMap hashMap) {
        int i2 = 100 - i;
        if (treeMap.get(Integer.valueOf(i2)) == null) {
            treeMap.put(Integer.valueOf(i2), new LinkedHashMap());
        }
        Map map = (Map) treeMap.get(Integer.valueOf(i2));
        if (map != null) {
        }
        hashMap.put(entry.getKey(), entry.getValue());
    }

    public static List c(ArrayList arrayList, List list) {
        if (list.isEmpty() || arrayList.isEmpty()) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        int[] iArr = new int[arrayList.size()];
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (((StickersDictionaryItemLight.DictionaryStickerModel) arrayList.get(i2)).o2() == ((StickerItem) list.get(i)).b) {
                    arrayList2.add(arrayList.get(i2));
                    iArr[i2] = 1;
                }
            }
        }
        int size3 = arrayList.size();
        for (int i3 = 0; i3 < size3; i3++) {
            if (iArr[i3] != 1) {
                arrayList2.add(arrayList.get(i3));
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0037 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TreeMap<Integer, Map<String, StickersDictionaryItemLight>> b(String str, Map<String, StickersDictionaryItemLight> map) {
        Map t;
        int i;
        Map.Entry<String, StickersDictionaryItemLight> entry;
        Iterator<Map.Entry<String, StickersDictionaryItemLight>> it;
        double d;
        int i2;
        Iterator<Map.Entry<String, StickersDictionaryItemLight>> it2;
        int i3 = 0;
        this.d = false;
        int i4 = 1;
        if (!brm0.B(str, this.c, false) || this.f.isEmpty()) {
            t = pn00.t(map);
        } else {
            this.d = true;
            t = pn00.t(this.f);
        }
        HashMap hashMap = new HashMap();
        TreeMap<Integer, Map<String, StickersDictionaryItemLight>> treeMap = new TreeMap<>();
        Iterator it3 = t.entrySet().iterator();
        while (true) {
            i = 100;
            if (!it3.hasNext()) {
                break;
            }
            Map.Entry entry2 = (Map.Entry) it3.next();
            String str2 = (String) entry2.getKey();
            if (str2.length() != 0 && str.length() != 0 && str2.length() >= str.length()) {
                if (!str2.equals(str)) {
                    int length = this.d ? this.c.length() : 0;
                    while (length < str.length() && str.charAt(length) == str2.charAt(length)) {
                        length++;
                    }
                    if (length == str.length()) {
                        i = (int) ((length / str2.length()) * 100);
                    }
                }
                if (i == -1) {
                    a(treeMap, entry2, i, hashMap);
                }
            }
            i = -1;
            if (i == -1) {
            }
        }
        this.c = str;
        if (treeMap.isEmpty()) {
            k9x k9xVar = this.h;
            int i5 = k9xVar.b;
            int i6 = k9xVar.c;
            int length2 = str.length();
            if (i5 <= length2 && length2 <= i6) {
                int length3 = str.length();
                int i7 = length3 < 5 ? 82 : length3 < 8 ? 85 : 88;
                Iterator<Map.Entry<String, StickersDictionaryItemLight>> it4 = map.entrySet().iterator();
                while (it4.hasNext()) {
                    Map.Entry<String, StickersDictionaryItemLight> next = it4.next();
                    String key = next.getKey();
                    if (epx.f(key, str)) {
                        d = 1.0d;
                        it = it4;
                        i2 = i;
                        entry = next;
                    } else {
                        int length4 = key.length();
                        int length5 = str.length();
                        entry = next;
                        int floor = (int) (Math.floor(Integer.max(length4, length5) / 2) - i4);
                        int[] iArr = new int[key.length()];
                        int[] iArr2 = new int[str.length()];
                        int i8 = i3;
                        int i9 = i8;
                        while (i8 < length4) {
                            int i10 = i4;
                            int max = Integer.max(i3, i8 - floor);
                            int i11 = i8 + floor + 1;
                            if (length5 <= i11) {
                                i11 = length5;
                            }
                            while (true) {
                                if (max >= i11) {
                                    it2 = it4;
                                    break;
                                }
                                int i12 = i11;
                                it2 = it4;
                                if (key.charAt(i8) == str.charAt(max) && iArr2[max] == 0) {
                                    iArr[i8] = i10;
                                    iArr2[max] = i10;
                                    i9++;
                                    break;
                                }
                                max++;
                                i11 = i12;
                                it4 = it2;
                            }
                            i8++;
                            i4 = i10;
                            it4 = it2;
                            i3 = 0;
                        }
                        int i13 = i4;
                        it = it4;
                        if (i9 == 0) {
                            d = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
                        } else {
                            int i14 = 0;
                            int i15 = 0;
                            int i16 = 0;
                            while (i14 < length4) {
                                int i17 = i13;
                                if (iArr[i14] == i17) {
                                    while (iArr2[i16] == 0) {
                                        i16++;
                                    }
                                    int i18 = i16 + 1;
                                    if (key.charAt(i14) != str.charAt(i16)) {
                                        i15++;
                                    }
                                    i16 = i18;
                                }
                                i14++;
                                i13 = i17;
                            }
                            double d2 = i9;
                            d = (((d2 - (i15 / 2.0d)) / d2) + ((d2 / length5) + (d2 / length4))) / 3.0d;
                        }
                        i2 = 100;
                    }
                    int i19 = (int) (d * i2);
                    if (i19 > i7) {
                        a(treeMap, entry, i19, hashMap);
                    }
                    i = i2;
                    it4 = it;
                    i3 = 0;
                    i4 = 1;
                }
            }
        }
        this.f = new HashMap<>(hashMap);
        if (treeMap.isEmpty()) {
            return null;
        }
        return treeMap;
    }
}
