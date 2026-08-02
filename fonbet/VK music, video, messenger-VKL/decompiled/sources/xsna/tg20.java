package xsna;

import androidx.core.app.NotificationCompat;
import com.huawei.hms.api.ConnectionResult;
import com.ironsource.O6;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.vk.api.generated.messages.dto.MessagesAllowMessagesFromGroupTypeDto;
import com.vk.dto.common.id.UserId;
import java.util.List;
import ru.ok.android.sdk.SharedKt;

/* compiled from: MessagesService.kt */
/* loaded from: classes11.dex */
public interface tg20 {

    /* compiled from: MessagesService.kt */
    /* loaded from: classes6.dex */
    public static final class a {
        public static ufx a(UserId userId, UserId userId2, String str, Integer num, List list, List list2, MessagesAllowMessagesFromGroupTypeDto messagesAllowMessagesFromGroupTypeDto) {
            ufx ufxVar = new ufx("messages.allowMessagesFromGroup", new ir(28), new jr(22));
            ufx.m(ufxVar, "group_id", userId, 1L, 8);
            if (userId2 != null) {
                ufx.m(ufxVar, "user_id", userId2, 0L, 8);
            }
            if (str != null) {
                ufx.n(ufxVar, "key", str, 256, 4);
            }
            if (num != null) {
                ufx.k(ufxVar, "app_id", num.intValue(), 0, 8);
            }
            if (list != null) {
                ufxVar.h("intents", list);
            }
            if (list2 != null) {
                ufxVar.h("subscribe_ids", list2);
            }
            if (messagesAllowMessagesFromGroupTypeDto != null) {
                ufx.n(ufxVar, "type", messagesAllowMessagesFromGroupTypeDto.i(), 0, 12);
            }
            return ufxVar;
        }

        public static ufx b(Integer num, UserId userId, String str, String str2, Float f, Float f2, String str3, String str4, Integer num2, String str5, UserId userId2, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Integer num3, Boolean bool, String str13, String str14) {
            int i;
            ufx ufxVar = new ufx("messages.send", new wd10(2), new hr(23));
            if (num != null) {
                ufx.k(ufxVar, "random_id", num.intValue(), 0, 12);
                s3q0 s3q0Var = s3q0.a;
            }
            if (userId != null) {
                ufx.m(ufxVar, "peer_id", userId, 0L, 12);
                s3q0 s3q0Var2 = s3q0.a;
            }
            if (str != null) {
                ufx.n(ufxVar, "message", str, ConnectionResult.NETWORK_ERROR, 4);
                s3q0 s3q0Var3 = s3q0.a;
            }
            if (str2 != null) {
                ufx.n(ufxVar, "format_data", str2, ConnectionResult.NETWORK_ERROR, 4);
                s3q0 s3q0Var4 = s3q0.a;
            }
            if (f != null) {
                ufx.j(ufxVar, O6.s, f.floatValue());
                s3q0 s3q0Var5 = s3q0.a;
            }
            if (f2 != null) {
                ufx.j(ufxVar, "long", f2.floatValue());
                s3q0 s3q0Var6 = s3q0.a;
            }
            if (str3 != null) {
                ufx.n(ufxVar, SharedKt.PARAM_ATTACHMENT, str3, ConnectionResult.NETWORK_ERROR, 4);
                s3q0 s3q0Var7 = s3q0.a;
            }
            if (str4 != null) {
                ufx.n(ufxVar, ToolBar.FORWARD, str4, 0, 12);
                s3q0 s3q0Var8 = s3q0.a;
            }
            if (num2 != null) {
                ufx.k(ufxVar, "sticker_id", num2.intValue(), 0, 8);
                s3q0 s3q0Var9 = s3q0.a;
            }
            if (str5 != null) {
                ufx.n(ufxVar, "sticker_referrer", str5, 0, 12);
                s3q0 s3q0Var10 = s3q0.a;
            }
            if (userId2 != null) {
                ufx.m(ufxVar, "group_id", userId2, 0L, 8);
                s3q0 s3q0Var11 = s3q0.a;
            }
            if (str6 != null) {
                ufx.n(ufxVar, "template", str6, 0, 12);
                s3q0 s3q0Var12 = s3q0.a;
            }
            if (str7 != null) {
                ufx.n(ufxVar, "payload", str7, 1000, 4);
                s3q0 s3q0Var13 = s3q0.a;
            }
            if (str8 != null) {
                ufx.n(ufxVar, "ref_source", str8, 100, 4);
                s3q0 s3q0Var14 = s3q0.a;
            }
            if (str9 != null) {
                ufx.n(ufxVar, "ref", str9, 100, 4);
                s3q0 s3q0Var15 = s3q0.a;
            }
            if (str10 != null) {
                ufx.n(ufxVar, "entrypoint", str10, 100, 4);
                s3q0 s3q0Var16 = s3q0.a;
            }
            if (str11 != null) {
                ufx.n(ufxVar, "marusya_skill", str11, 100, 4);
                s3q0 s3q0Var17 = s3q0.a;
            }
            if (str12 != null) {
                ufx.n(ufxVar, "marusya_intent", str12, 100, 4);
                s3q0 s3q0Var18 = s3q0.a;
            }
            if (num3 != null) {
                ufxVar.f(num3.intValue(), 0, 86400, "expire_ttl");
                s3q0 s3q0Var19 = s3q0.a;
            }
            if (bool != null) {
                ufxVar.i(NotificationCompat.GROUP_KEY_SILENT, bool.booleanValue());
                s3q0 s3q0Var20 = s3q0.a;
            }
            if (str13 != null) {
                i = 12;
                ufx.n(ufxVar, "track_code", str13, 0, 12);
                s3q0 s3q0Var21 = s3q0.a;
            } else {
                i = 12;
            }
            if (str14 != null) {
                ufx.n(ufxVar, "linked_cmids", str14, 0, i);
                s3q0 s3q0Var22 = s3q0.a;
            }
            return ufxVar;
        }
    }

    ufx l(Integer num, UserId userId, String str, String str2, Float f, Float f2, String str3, String str4, Integer num2, String str5, UserId userId2, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Integer num3, Boolean bool, String str13, String str14);
}
