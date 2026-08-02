package xsna;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.vk.dto.live.LiveEventModel;
import com.vk.log.L;
import com.vk.toggle.Features;
import java.util.ArrayList;

/* compiled from: LogHelper.kt */
/* loaded from: classes3.dex */
public final class i000 {
    public final boolean a = com.vk.toggle.b.A.a(Features.Type.FEATURE_CLIPS_LIVES_DEBUG_LOG);

    public static String b(LiveEventModel liveEventModel) {
        String str;
        if (liveEventModel == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder("LiveEventModel(type: ");
        switch (liveEventModel.c) {
            case 1:
                str = "FRIENED_ENTER";
                break;
            case 2:
                str = "COMMENT";
                break;
            case 3:
                str = "VIEW";
                break;
            case 4:
                str = "PRESENT";
                break;
            case 5:
                str = "LIKE";
                break;
            case 6:
                str = "ANNOUNCE";
                break;
            case 7:
                str = "EMPTY";
                break;
            case 8:
                str = "SUBSCRIBE";
                break;
            case 9:
                str = "FOLLOW";
                break;
            case 10:
                str = "STICKER";
                break;
            case 11:
                str = "SHARE";
                break;
            case 12:
                str = "ACTION_BUTTON";
                break;
            case 13:
                str = "CLICK_ACTION_BUTTON";
                break;
            case 14:
                str = "DELETE_COMMENT";
                break;
            case 15:
                str = "LIVE_MIDROLL_ADS";
                break;
            case 16:
                str = "LIVE_SET_MARKET_ITEMS";
                break;
            default:
                str = GrsBaseInfo.CountryCodeSource.UNKNOWN;
                break;
        }
        sb.append(str);
        sb.append(", ts: ");
        sb.append(liveEventModel.C);
        sb.append(", commentId: ");
        sb.append(liveEventModel.m);
        sb.append(", commentDate: ");
        sb.append(liveEventModel.p);
        sb.append(", commentText: ");
        sb.append(liveEventModel.n);
        sb.append(", stickerId: ");
        sb.append(liveEventModel.t);
        sb.append(", stickerItem: ");
        sb.append(liveEventModel.B);
        sb.append(')');
        return sb.toString();
    }

    public final void a(Object... objArr) {
        if (this.a) {
            rmk0 rmk0Var = new rmk0(2);
            rmk0Var.a("LIVE_LONG_POLL");
            rmk0Var.b(objArr);
            ArrayList<Object> arrayList = rmk0Var.a;
            L.e(arrayList.toArray(new Object[arrayList.size()]));
        }
    }
}
