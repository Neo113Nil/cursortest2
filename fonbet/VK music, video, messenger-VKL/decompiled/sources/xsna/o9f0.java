package xsna;

import android.content.Context;
import android.content.SharedPreferences;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;

/* compiled from: RecentItemStore.kt */
/* loaded from: classes18.dex */
public final class o9f0 {
    public static final String[] e = {"😂", "😘", "❤", "😍", "😊", "😁", "👍", "☺", "😔", "😄", "😭", "💋", "😒", "😳", "😜", "🙈", "😉", "😃", "😢", "😝", "😱", "😡", "😏", "😞", "😅", "😚", "🙊", "😌", "😀", "😋", "😆", "👌", "😐", "😕"};
    public final bpn0 a;
    public final HashMap<String, Pair<Long, Long>> b = new HashMap<>();
    public final HashMap<String, String[][]> c = new HashMap<>();
    public final HashMap<String, String> d = new HashMap<>();

    public o9f0(Context context) {
        this.a = new bpn0(new bi30(context, 1));
    }

    public final void a(String str) {
        HashMap<String, Pair<Long, Long>> hashMap = this.b;
        if (hashMap.containsKey(str)) {
            Pair<Long, Long> pair = hashMap.get(str);
            if (pair != null) {
                hashMap.put(str, new Pair<>(Long.valueOf(pair.i().longValue() + 1), Long.valueOf(System.currentTimeMillis())));
            }
        } else {
            hashMap.put(str, new Pair<>(1L, Long.valueOf(System.currentTimeMillis())));
        }
        ArrayList arrayList = new ArrayList();
        int i = 10;
        for (Map.Entry entry : j5g.H0(j5g.D0(new n9f0(), j5g.D0(new m9f0(), hashMap.entrySet())), 50)) {
            int longValue = (int) ((Number) ((Pair) entry.getValue()).i()).longValue();
            if (longValue > i) {
                longValue = i;
            }
            arrayList.add(longValue + '\t' + ((String) entry.getKey()));
            if (i > 1) {
                i--;
            }
        }
        ((SharedPreferences) this.a.getValue()).edit().putString("recents_v3", j5g.g0(arrayList, StringUtils.COMMA, null, null, 0, null, 62)).apply();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String[][] b(String str) {
        String[][] strArr;
        HashMap<String, String[][]> hashMap = this.c;
        if (hashMap.containsKey(str)) {
            return hashMap.get(str);
        }
        Object[][] objArr = hpt0.b;
        Object[][] objArr2 = hpt0.b;
        int i = 0;
        int i2 = 0;
        loop0: while (i2 < 9) {
            Object[] objArr3 = objArr2[i2];
            int length = objArr3.length;
            int i3 = i;
            while (i3 < length) {
                Object obj = objArr3[i3];
                if ((obj instanceof String) && epx.f(obj, str)) {
                    break loop0;
                }
                if (obj instanceof Object[]) {
                    Object[] objArr4 = (Object[]) obj;
                    int length2 = objArr4.length;
                    int i4 = i;
                    while (i4 < length2) {
                        Object obj2 = objArr4[i4];
                        if ((obj2 instanceof String) && epx.f(obj2, str)) {
                            String[][] strArr2 = new String[1][];
                            strArr2[i] = obj;
                            strArr = strArr2;
                            break loop0;
                        }
                        if (obj2 instanceof Object[]) {
                            Object[] objArr5 = (Object[]) obj2;
                            int length3 = objArr5.length;
                            while (i < length3) {
                                if (epx.f(objArr5[i], str)) {
                                    strArr = (String[][]) obj;
                                    break loop0;
                                }
                                i++;
                            }
                        }
                        i4++;
                        i = 0;
                    }
                }
                i3++;
                i = 0;
            }
            i2++;
            i = 0;
        }
        strArr = null;
        hashMap.put(str, strArr);
        return strArr;
    }
}
