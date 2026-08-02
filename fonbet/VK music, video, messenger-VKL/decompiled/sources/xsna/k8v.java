package xsna;

import com.ironsource.X3;
import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import com.vk.dto.attaches.AttachSyncState;
import com.vk.dto.attaches.AttachUnsupported;
import com.vk.dto.attaches.AttachWithId;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.attaches.AttachVideo;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.sdk.SharedKt;
import xsna.af20;

/* compiled from: HistoryClipsApiParser.kt */
/* loaded from: classes2.dex */
public final class k8v {
    public static final af20.a a(JSONObject jSONObject) throws VKApiIllegalResponseException {
        int i;
        AttachWithId attachWithId;
        JSONArray jSONArray = jSONObject.getJSONArray("items");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int length = jSONArray.length();
        boolean z = false;
        int i2 = 0;
        while (i2 < length) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
            int i3 = jSONObject2.getInt("cmid");
            long j = jSONObject2.getLong("from_id");
            long j2 = jSONObject2.getLong("date");
            int i4 = jSONObject2.has(X3.i.L) ? jSONObject2.getInt(X3.i.L) : 1;
            int i5 = jSONObject2.getInt("message_id");
            boolean optBoolean = jSONObject2.optBoolean("was_played", z);
            JSONObject jSONObject3 = jSONObject2.getJSONObject(SharedKt.PARAM_ATTACHMENT);
            if (epx.f(jSONObject3.optString("type"), "video")) {
                JSONObject jSONObject4 = jSONObject3.getJSONObject("video");
                i = i2;
                long optLong = jSONObject4.optLong("id", 0L);
                long optLong2 = jSONObject4.optLong("owner_id", 0L);
                VideoFileOld videoFileOld = new VideoFileOld();
                videoFileOld.c = (int) optLong;
                videoFileOld.b = new UserId(optLong2);
                videoFileOld.p = "short_video";
                attachWithId = new AttachVideo(videoFileOld, null, null, 0L, null, 0, 0, 0L, 0, 0L, null, null, null, null, null, 32766, null);
                z = false;
            } else {
                i = i2;
                AttachUnsupported attachUnsupported = new AttachUnsupported(cq.c("Unknown attach: ", jSONObject2));
                z = false;
                attachUnsupported.b = 0;
                attachUnsupported.c = AttachSyncState.DONE;
                attachWithId = attachUnsupported;
            }
            arrayList.add(new j8v(i3, j, attachWithId, j2, i5, optBoolean, i4));
            i2 = i + 1;
        }
        return new af20.a(arrayList);
    }
}
