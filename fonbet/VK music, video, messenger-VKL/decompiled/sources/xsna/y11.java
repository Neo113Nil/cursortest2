package xsna;

import com.ironsource.X3;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.vk.dto.common.id.UserId;

/* compiled from: AdsService.kt */
/* loaded from: classes2.dex */
public interface y11 {
    default tfx a(Integer num, String str, String str2) {
        tfx tfxVar = new tfx("ads.sendFeedback", new r11(0), new s11(0));
        if (str != null) {
            tfx.o(tfxVar, "ad_data", str, 0, 0, 12);
        }
        tfx.l(tfxVar, X3.i.L, num.intValue(), 0, 0, 8);
        if (str2 != null) {
            tfx.o(tfxVar, "answer_id", str2, 0, 0, 12);
        }
        return tfxVar;
    }

    default tfx b(UserId userId, String str) {
        tfx tfxVar = new tfx("ads.checkJoinByUrl", new to(1), new t11(0));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfx.o(tfxVar, InAppPurchaseMetaData.KEY_SIGNATURE, str, 0, 0, 12);
        return tfxVar;
    }

    default tfx c(Integer num, String str) {
        tfx tfxVar = new tfx("ads.hideFeedback", new io.reactivex.rxjava3.subjects.c(2), new p11(0));
        if (str != null) {
            tfx.o(tfxVar, "ad_data", str, 0, 0, 12);
        }
        tfx.l(tfxVar, X3.i.L, num.intValue(), 0, 0, 8);
        return tfxVar;
    }
}
