package xsna;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.vk.metrics.eventtracking.Event;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import ru.ok.android.utils.Logger;

/* compiled from: TrackEventsCodeBuilder.java */
/* loaded from: classes5.dex */
public final class nfp0 {
    public static final int[] a = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 43, 44, 47, 58, 59, 60, 61, 62, 63, 64, 91, 92, 93, 94, 96, 123, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, 125, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, 127};

    /* compiled from: TrackEventsCodeBuilder.java */
    public static class a {
        public final List<JSONObject> a;
        public final List<JSONObject> b;
        public final List<JSONObject> c;

        public a(List<JSONObject> list, List<JSONObject> list2, List<JSONObject> list3) {
            this.a = list;
            this.b = list2;
            this.c = list3;
        }
    }

    public static int a(StringBuilder sb, List<JSONObject> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int length = sb.length();
        sb.append(list.get(0));
        int c = c(0, sb);
        if (c > 126976) {
            sb.setLength(length);
            return 0;
        }
        for (int i = 1; i < size; i++) {
            int length2 = sb.length();
            sb.append(',');
            sb.append(list.get(i));
            c += c(length2, sb);
            if (c > 126976) {
                sb.setLength(length2);
                return i;
            }
        }
        return size;
    }

    public static a b(List<JSONObject> list) {
        if (list.isEmpty()) {
            List list2 = Collections.EMPTY_LIST;
            return new a(list, list2, list2);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        try {
            Iterator<JSONObject> it = list.iterator();
            while (it.hasNext()) {
                JSONObject next = it.next();
                JSONObject jSONObject = new JSONObject(next.toString());
                if (jSONObject.getString(Logger.METHOD_E).startsWith("ads/")) {
                    jSONObject.put("event_type", ((String) jSONObject.remove(Logger.METHOD_E)).split(DomExceptionUtils.SEPARATOR)[1]);
                    it.remove();
                    arrayList.add(jSONObject);
                    arrayList2.add(next);
                }
            }
        } catch (Exception e) {
            com.vk.metrics.eventtracking.b.a.a(e);
        }
        ArrayList arrayList3 = new ArrayList(arrayList.size() + list.size());
        List<JSONObject> arrayList4 = new ArrayList<>();
        List arrayList5 = new ArrayList();
        StringBuilder sb = new StringBuilder();
        int a2 = a(sb, list);
        if (a2 > 0) {
            arrayList4 = list.subList(0, a2);
            arrayList3.addAll(list.subList(0, a2));
        }
        int a3 = a(sb, arrayList);
        if (a3 > 0) {
            arrayList5 = arrayList.subList(0, a3);
            arrayList3.addAll(arrayList2.subList(0, a3));
        }
        if (sb.length() == 0) {
            com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
            el3 el3Var = Event.b;
            Event.a b = h5s.b("ERROR.STATS.EVENT_TOO_LONG");
            b.b("events_count", Integer.valueOf(arrayList.size() + list.size()));
            bVar.k(b.e());
        }
        return new a(arrayList3, arrayList4, arrayList5);
    }

    public static int c(int i, StringBuilder sb) {
        int length = sb.length();
        int i2 = 0;
        while (i < length) {
            int codePointAt = sb.codePointAt(i);
            i2 = codePointAt >= 128 ? i2 + 6 : (codePointAt < 32 || Arrays.binarySearch(a, codePointAt) >= 0) ? i2 + 3 : i2 + 1;
            i += Character.charCount(codePointAt);
        }
        return i2;
    }
}
