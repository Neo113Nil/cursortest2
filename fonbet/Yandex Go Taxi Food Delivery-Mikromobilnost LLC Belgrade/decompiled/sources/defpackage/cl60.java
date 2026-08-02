package defpackage;

import android.net.Uri;
import com.ybsdk.feature.deeplink.api.actions.LocalVariable;
import com.ybsdk.feature.deeplink.api.actions.NotifyLocalVariablesChanged;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public final class cl60 {
    public static NotifyLocalVariablesChanged a(Uri uri) {
        Map d = sd90.d(uri);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : d.entrySet()) {
            if (!jl40.l(entry.getKey(), "div_log_id") && !jl40.l(entry.getKey(), "call_source")) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            arrayList.add(new LocalVariable((String) entry2.getKey(), (String) entry2.getValue()));
        }
        return new NotifyLocalVariablesChanged(uri, arrayList);
    }
}
