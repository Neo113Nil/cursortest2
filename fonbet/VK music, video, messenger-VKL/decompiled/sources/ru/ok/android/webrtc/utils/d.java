package ru.ok.android.webrtc.utils;

import com.ironsource.B5;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import ru.ok.android.webrtc.RTCLog;
import xsna.zr;

/* loaded from: classes9.dex */
public final class d {
    public final String a;
    public final LinkedHashMap b;

    public d(String str, LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        this.b = linkedHashMap2;
        this.a = str;
        if (linkedHashMap != null) {
            linkedHashMap2.putAll(linkedHashMap);
        }
    }

    public final boolean a(String str, String str2, boolean z, RTCLog rTCLog) {
        if (str == null) {
            rTCLog.log("CodecPrefUtil", "parameter name is null, ignore");
            return false;
        }
        boolean containsKey = this.b.containsKey(str);
        if (containsKey && !z) {
            String a = zr.a("parameter ", str, " already added to SDP");
            rTCLog.reportException("CodecPrefUtil", a, new IllegalStateException(a));
            return false;
        }
        String str3 = (String) this.b.put(str, str2);
        if (!containsKey || !Objects.equals(str3, str2)) {
            return true;
        }
        rTCLog.log("CodecPrefUtil", "parameter " + str + " value did not change");
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        if (this.b.isEmpty()) {
            return sb.toString();
        }
        sb.append(' ');
        boolean z = true;
        for (Map.Entry entry : this.b.entrySet()) {
            if (z) {
                z = false;
            } else {
                sb.append(';');
            }
            sb.append((String) entry.getKey());
            String str = (String) entry.getValue();
            if (str != null) {
                sb.append(B5.U);
                sb.append(str);
            }
        }
        return sb.toString();
    }
}
