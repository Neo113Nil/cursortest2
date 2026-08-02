package xsna;

import com.vk.dto.common.id.UserId;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: TagsService.kt */
/* loaded from: classes2.dex */
public interface n2o0 {
    default tfx a(int i, int i2, UserId userId, String str, String str2) {
        tfx tfxVar = new tfx("tags.delete", new r11(29), new sf3(27));
        tfx.o(tfxVar, "type", str, 0, 0, 12);
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfx.l(tfxVar, "item_id", i, 0, 0, 8);
        tfx.l(tfxVar, "tag_id", i2, 0, 0, 8);
        if (str2 != null) {
            tfx.o(tfxVar, "access_key", str2, 0, 0, 12);
        }
        return tfxVar;
    }

    default tfx b(int i, UserId userId, String str, String str2) {
        tfx tfxVar = new tfx("tags.getList", new p11(28), new m2o0(0));
        tfx.o(tfxVar, "type", str, 0, 0, 12);
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfx.l(tfxVar, "item_id", i, 0, 0, 8);
        if (str2 != null) {
            tfx.o(tfxVar, "access_key", str2, 0, 0, 12);
        }
        return tfxVar;
    }

    default tfx c(String str, UserId userId, int i, String str2, String str3, Float f, Float f2) {
        tfx tfxVar = new tfx("tags.add", new ly80(7), new bjl0(2));
        tfx.o(tfxVar, "type", str, 0, 0, 12);
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfx.l(tfxVar, "item_id", i, 0, 0, 8);
        tfx.o(tfxVar, "object", str2, 0, 0, 12);
        if (str3 != null) {
            tfx.o(tfxVar, "access_key", str3, 0, 0, 12);
        }
        tfxVar.h("x", f.floatValue(), ConnectivityTracker.DEFAULT_UPLINK_BITRATE, 1.0d);
        tfxVar.h("y", f2.floatValue(), ConnectivityTracker.DEFAULT_UPLINK_BITRATE, 1.0d);
        return tfxVar;
    }
}
