package xsna;

import com.huawei.hms.api.ConnectionResult;
import com.ironsource.O6;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ChannelsService.kt */
/* loaded from: classes2.dex */
public final class oib implements nib {
    public final tfx g(int i, UserId userId, String str, ArrayList arrayList, Float f, Float f2, Boolean bool, Integer num, Boolean bool2, Integer num2, String str2, Boolean bool3, String str3) {
        tfx tfxVar = new tfx("channels.editMessage", new com.vk.movika.sdk.base.model.history.b(6), new fq(7));
        tfx.l(tfxVar, "cmid", i, 0, 0, 8);
        tfx.n(tfxVar, "channel_id", userId, 0L, 0L, 12);
        if (str != null) {
            tfx.o(tfxVar, "message", str, 0, 0, 12);
        }
        tfxVar.i("attachments", arrayList);
        if (f != null) {
            tfxVar.h(O6.s, f.floatValue(), -1.7976931348623157E308d, Double.MAX_VALUE);
        }
        if (f2 != null) {
            tfxVar.h("long", f2.floatValue(), -1.7976931348623157E308d, Double.MAX_VALUE);
        }
        tfxVar.j("signed", bool.booleanValue());
        if (num != null) {
            tfx.l(tfxVar, "publish_date", num.intValue(), 0, 0, 8);
        }
        tfxVar.j("close_comments", bool2.booleanValue());
        if (num2 != null) {
            tfx.l(tfxVar, "donut_paid_duration", num2.intValue(), 0, 0, 12);
        }
        if (str2 != null) {
            tfx.o(tfxVar, "format_data", str2, 0, ConnectionResult.NETWORK_ERROR, 4);
        }
        if (bool3 != null) {
            tfxVar.j("is_donut_photos", bool3.booleanValue());
        }
        if (str3 != null) {
            tfx.o(tfxVar, "attachment_properties", str3, 0, ConnectionResult.NETWORK_ERROR, 4);
        }
        return tfxVar;
    }

    public final tfx h(UserId userId, Boolean bool, String str, String str2, List list) {
        tfx tfxVar = new tfx("channels.join", new ar(7), new br(12));
        tfx.n(tfxVar, "channel_id", userId, 0L, -1L, 4);
        if (str != null) {
            tfx.o(tfxVar, "invite_code", str, 0, 0, 12);
        }
        if (list != null) {
            tfxVar.i("fields", list);
        }
        if (bool != null) {
            tfxVar.j("extended", bool.booleanValue());
        }
        if (str2 != null) {
            tfx.o(tfxVar, "source", str2, 0, 0, 12);
        }
        return tfxVar;
    }

    public final tfx i(Long l) {
        tfx tfxVar = new tfx("channels.setConfig", new nr(8), new defpackage.j0(12));
        tfx.m(tfxVar, "last_collapsed_recommendations_version", l.longValue(), 0L, 8);
        return tfxVar;
    }

    public final tfx j(UserId userId) {
        tfx tfxVar = new tfx("channels.unpin", new er(9), new fr(8));
        tfx.n(tfxVar, "channel_id", userId, 0L, -1L, 4);
        return tfxVar;
    }
}
