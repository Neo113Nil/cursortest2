package xsna;

import com.ironsource.X3;
import com.vk.voip.dto.broadcast.VoipBroadcastStatus;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: VoipBroadcastParser.kt */
/* loaded from: classes7.dex */
public final class efw0 {

    /* compiled from: VoipBroadcastParser.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VoipBroadcastStatus.values().length];
            try {
                iArr[VoipBroadcastStatus.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VoipBroadcastStatus.LIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v6, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v7 */
    public static dfw0 a(JSONObject jSONObject) {
        VoipBroadcastStatus voipBroadcastStatus;
        ?? r3;
        long j;
        if (f370.w(jSONObject, 0, "upcoming") != 1) {
            String string = jSONObject.has("live_status") ? jSONObject.getString("live_status") : "";
            switch (string.hashCode()) {
                case -1897185151:
                    if (string.equals(X3.i.d0)) {
                        voipBroadcastStatus = VoipBroadcastStatus.STARTED;
                        break;
                    }
                    voipBroadcastStatus = VoipBroadcastStatus.FINISHED;
                    break;
                case -1281977283:
                    if (string.equals("failed")) {
                        voipBroadcastStatus = VoipBroadcastStatus.FAILED;
                        break;
                    }
                    voipBroadcastStatus = VoipBroadcastStatus.FINISHED;
                    break;
                case -673660814:
                    if (string.equals("finished")) {
                        voipBroadcastStatus = VoipBroadcastStatus.FINISHED;
                        break;
                    }
                    voipBroadcastStatus = VoipBroadcastStatus.FINISHED;
                    break;
                case 3322092:
                    if (string.equals("live")) {
                        voipBroadcastStatus = VoipBroadcastStatus.LIVE;
                        break;
                    }
                    voipBroadcastStatus = VoipBroadcastStatus.FINISHED;
                    break;
                case 1116313165:
                    if (string.equals("waiting")) {
                        voipBroadcastStatus = VoipBroadcastStatus.WAITING;
                        break;
                    }
                    voipBroadcastStatus = VoipBroadcastStatus.FINISHED;
                    break;
                case 1306691868:
                    if (string.equals("upcoming")) {
                        voipBroadcastStatus = VoipBroadcastStatus.UPCOMING;
                        break;
                    }
                    voipBroadcastStatus = VoipBroadcastStatus.FINISHED;
                    break;
                default:
                    voipBroadcastStatus = VoipBroadcastStatus.FINISHED;
                    break;
            }
        } else {
            voipBroadcastStatus = VoipBroadcastStatus.UPCOMING;
        }
        VoipBroadcastStatus voipBroadcastStatus2 = voipBroadcastStatus;
        String string2 = jSONObject.getString("id");
        String string3 = jSONObject.getString("owner_id");
        String string4 = jSONObject.getString("ov_id");
        boolean has = jSONObject.has("image");
        if (has) {
            JSONArray jSONArray = jSONObject.getJSONArray("image");
            r3 = new ArrayList(jSONArray.length());
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                r3.add(new eqw0(jSONObject2.getInt("width"), jSONObject2.getInt("height"), jSONObject2.has("url") ? jSONObject2.getString("url") : ""));
            }
        } else {
            if (has) {
                throw new NoWhenBranchMatchedException();
            }
            r3 = EmptyList.b;
        }
        Collection collection = r3;
        String string5 = jSONObject.has("title") ? jSONObject.getString("title") : "";
        boolean has2 = jSONObject.has("live_start_time");
        if (has2) {
            if (jSONObject.has("live_start_time")) {
                j = jSONObject.getLong("live_start_time");
            }
            j = 0;
        } else {
            if (has2) {
                throw new NoWhenBranchMatchedException();
            }
            if (jSONObject.has("date")) {
                j = jSONObject.getLong("date");
            }
            j = 0;
        }
        long j2 = j * 1000;
        int[] iArr = a.$EnumSwitchMapping$0;
        long j3 = iArr[voipBroadcastStatus2.ordinal()] == 1 ? (jSONObject.has("duration") ? jSONObject.getLong("duration") : 0L) * 1000 : 0L;
        int i2 = jSONObject.has("views") ? jSONObject.getInt("views") : 0;
        JSONObject optJSONObject = jSONObject.optJSONObject("likes");
        int i3 = optJSONObject != null ? optJSONObject.has("count") ? optJSONObject.getInt("count") : 0 : 0;
        int i4 = jSONObject.has("comments") ? jSONObject.getInt("comments") : 0;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("reposts");
        return new dfw0(string2, string3, string4, voipBroadcastStatus2, collection, string5, j2, j3, i2, null, null, i3, i4, optJSONObject2 != null ? optJSONObject2.has("count") ? optJSONObject2.getInt("count") : 0 : 0, EmptyList.b, iArr[voipBroadcastStatus2.ordinal()] == 2 ? jSONObject.has("spectators") ? jSONObject.getInt("spectators") : 0 : 0, (jSONObject.has("can_repost") ? jSONObject.getInt("can_repost") : 0) == 1, (jSONObject.has("can_attach_link") ? jSONObject.getInt("can_attach_link") : 0) == 1);
    }
}
