package xsna;

import com.huawei.hms.api.ConnectionResult;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: SearchService.kt */
/* loaded from: classes2.dex */
public interface pyh0 {
    static xy2 c(qyh0 qyh0Var, String str, Integer num, List list, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        String str2 = str;
        qyh0Var.getClass();
        tfx tfxVar = new tfx("search.getHints", new sqe0(1), new hub0(2));
        if (str2 != null) {
            tfx.o(tfxVar, CampaignEx.JSON_KEY_AD_Q, str2, 0, ConnectionResult.NETWORK_ERROR, 4);
        }
        tfxVar.f(num.intValue(), 0, 200, SignalingProtocol.KEY_LIMIT);
        if (list != null) {
            tfxVar.i("fields", list);
        }
        return tfxVar;
    }

    default tfx a(String str) {
        tfx tfxVar = new tfx("search.removeVideoSearchRecentQuery", new iub0(2), new uga0(2));
        if (str != null) {
            tfx.o(tfxVar, "query_id", str, 0, 0, 12);
        }
        return tfxVar;
    }

    default tfx b(String str, String str2) {
        tfx tfxVar = new tfx("search.removeSearchRecentQuery", new wd10(10), new nyh0(0));
        if (str != null) {
            tfx.o(tfxVar, "track_code", str, 0, 0, 12);
        }
        if (str2 != null) {
            tfx.o(tfxVar, "item_id", str2, 0, 0, 12);
        }
        return tfxVar;
    }
}
