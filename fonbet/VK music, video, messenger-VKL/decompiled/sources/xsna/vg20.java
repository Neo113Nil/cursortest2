package xsna;

import com.vk.api.generated.messages.dto.MessagesSendReactionSourceDto;
import com.vk.dto.common.id.UserId;
import xsna.sg20;

/* compiled from: MessagesService.kt */
/* loaded from: classes.dex */
public final class vg20 implements sg20 {
    @Override // xsna.tg20
    public final ufx l(Integer num, UserId userId, String str, String str2, Float f, Float f2, String str3, String str4, Integer num2, String str5, UserId userId2, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Integer num3, Boolean bool, String str13, String str14) {
        return sg20.a.a(num, userId, str, str2, f, f2, str3, str4, num2, str5, userId2, str6, str7, str8, str9, str10, str11, str12, num3, bool, str13, str14);
    }

    public final tfx s(UserId userId, int i, int i2, UserId userId2, MessagesSendReactionSourceDto messagesSendReactionSourceDto) {
        tfx tfxVar = new tfx("messages.sendReaction", new rr(22), new zn(19));
        tfx.n(tfxVar, "peer_id", userId, 0L, 0L, 12);
        tfx.l(tfxVar, "cmid", i, 0, 0, 8);
        tfx.l(tfxVar, "reaction_id", i2, 0, 0, 8);
        if (userId2 != null) {
            tfx.n(tfxVar, "group_id", userId2, 0L, 0L, 8);
        }
        if (messagesSendReactionSourceDto != null) {
            tfx.o(tfxVar, "source", messagesSendReactionSourceDto.j(), 0, 0, 12);
        }
        return tfxVar;
    }

    public final tfx t(String str, String str2) {
        tfx tfxVar = new tfx("messages.vkRoomsJoinCall", new et(23), new gp(23));
        tfx.o(tfxVar, "vk_join_link", str, 0, 0, 12);
        tfx.o(tfxVar, "vk_rooms_link", str2, 0, 0, 12);
        return tfxVar;
    }
}
