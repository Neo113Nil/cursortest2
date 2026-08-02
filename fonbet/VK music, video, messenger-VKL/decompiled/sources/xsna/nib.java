package xsna;

import com.huawei.hms.api.ConnectionResult;
import com.ironsource.O6;
import com.vk.api.generated.channels.dto.ChannelsCreateCreateTypeDto;
import com.vk.api.generated.channels.dto.ChannelsDeleteReactionItemTypeDto;
import com.vk.api.generated.channels.dto.ChannelsSendReactionItemTypeDto;
import com.vk.dto.common.id.UserId;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;

/* compiled from: ChannelsService.kt */
/* loaded from: classes2.dex */
public interface nib {
    static xy2 a(oib oibVar, UserId userId) {
        oibVar.getClass();
        tfx tfxVar = new tfx("channels.pin", new io.reactivex.rxjava3.internal.operators.observable.q1(11), new hr(6));
        tfx.n(tfxVar, "channel_id", userId, 0L, -1L, 4);
        return tfxVar;
    }

    static /* synthetic */ xy2 d(nib nibVar, String str, ChannelsCreateCreateTypeDto channelsCreateCreateTypeDto, UserId userId, String str2, Boolean bool, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 64) != 0) {
            channelsCreateCreateTypeDto = null;
        }
        if ((131072 & i) != 0) {
            str2 = null;
        }
        if ((i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0) {
            bool = null;
        }
        return nibVar.f(str, channelsCreateCreateTypeDto, userId, str2, bool);
    }

    static xy2 e(oib oibVar, UserId userId, Boolean bool, String str, ArrayList arrayList, Boolean bool2, Integer num, Float f, Float f2, Integer num2, String str2, Boolean bool3, Boolean bool4, Boolean bool5, Integer num3, Boolean bool6, String str3, String str4, String str5, Boolean bool7, String str6, String str7, int i, int i2) {
        Boolean bool8 = (i & 8) != 0 ? null : bool;
        String str8 = (i & 16) != 0 ? null : str;
        ArrayList arrayList2 = (i & 32) != 0 ? null : arrayList;
        Boolean bool9 = (i & 256) != 0 ? null : bool2;
        Integer num4 = (i & 512) != 0 ? null : num;
        Float f3 = (i & 1024) != 0 ? null : f;
        Float f4 = (i & 2048) != 0 ? null : f2;
        Integer num5 = (i & 8192) != 0 ? null : num2;
        String str9 = (i & 16384) != 0 ? null : str2;
        Boolean bool10 = (i & 32768) != 0 ? null : bool3;
        Boolean bool11 = (1048576 & i) != 0 ? null : bool4;
        Boolean bool12 = (33554432 & i) != 0 ? null : bool5;
        Integer num6 = (i & 67108864) != 0 ? null : num3;
        Boolean bool13 = (i & 134217728) != 0 ? null : bool6;
        String str10 = (i2 & 64) != 0 ? null : str3;
        String str11 = (i2 & 128) != 0 ? null : str4;
        String str12 = (i2 & 4096) != 0 ? null : str5;
        Boolean bool14 = bool13;
        Boolean bool15 = (i2 & 8192) != 0 ? null : bool7;
        String str13 = (i2 & 16384) != 0 ? null : str6;
        String str14 = (i2 & 32768) != 0 ? null : str7;
        oibVar.getClass();
        String str15 = str13;
        Boolean bool16 = bool8;
        String str16 = str11;
        tfx tfxVar = new tfx("channels.sendMessage", new vp(8), new wp(6));
        tfx.n(tfxVar, "channel_id", userId, 0L, 0L, 12);
        s3q0 s3q0Var = s3q0.a;
        if (bool16 != null) {
            tfxVar.j("from_group", bool16.booleanValue());
        }
        if (str8 != null) {
            tfx.o(tfxVar, "message", str8, 0, 0, 12);
        }
        if (arrayList2 != null) {
            tfxVar.i("attachments", arrayList2);
        }
        if (bool9 != null) {
            tfxVar.j("signed", bool9.booleanValue());
        }
        if (num4 != null) {
            tfx.l(tfxVar, "publish_date", num4.intValue(), 0, 0, 8);
        }
        if (f3 != null) {
            tfxVar.h(O6.s, f3.floatValue(), -1.7976931348623157E308d, Double.MAX_VALUE);
        }
        if (f4 != null) {
            tfxVar.h("long", f4.floatValue(), -1.7976931348623157E308d, Double.MAX_VALUE);
        }
        if (num5 != null) {
            tfx.l(tfxVar, "post_id", num5.intValue(), 0, 0, 8);
        }
        if (str9 != null) {
            tfx.o(tfxVar, "guid", str9, 0, 0, 12);
        }
        if (bool10 != null) {
            tfxVar.j("mark_as_ads", bool10.booleanValue());
        }
        if (bool11 != null) {
            tfxVar.j("is_story_on", bool11.booleanValue());
        }
        if (bool12 != null) {
            tfxVar.j("close_comments", bool12.booleanValue());
        }
        if (num6 != null) {
            tfx.l(tfxVar, "donut_paid_duration", num6.intValue(), 0, 0, 12);
        }
        if (bool14 != null) {
            tfxVar.j("mute_notifications", bool14.booleanValue());
        }
        if (str10 != null) {
            tfx.o(tfxVar, "ord_erid", str10, 0, 0, 12);
        }
        if (str16 != null) {
            tfx.o(tfxVar, "ord_external_id", str16, 0, 0, 12);
        }
        if (str12 != null) {
            tfx.o(tfxVar, "format_data", str12, 0, ConnectionResult.NETWORK_ERROR, 4);
        }
        if (bool15 != null) {
            tfxVar.j("is_donut_photos", bool15.booleanValue());
        }
        if (str15 != null) {
            tfx.o(tfxVar, "attachment_properties", str15, 0, ConnectionResult.NETWORK_ERROR, 4);
        }
        if (str14 != null) {
            tfx.o(tfxVar, "entrypoint", str14, 0, 100, 4);
        }
        return tfxVar;
    }

    default tfx b(UserId userId, ChannelsDeleteReactionItemTypeDto channelsDeleteReactionItemTypeDto, int i) {
        tfx tfxVar = new tfx("channels.deleteReaction", new kr(10), new lr(9));
        tfx.n(tfxVar, "channel_id", userId, 0L, 0L, 12);
        tfx.o(tfxVar, "item_type", channelsDeleteReactionItemTypeDto.i(), 0, 0, 12);
        tfx.l(tfxVar, "item_id", i, 0, 0, 8);
        return tfxVar;
    }

    default tfx c(UserId userId, ChannelsSendReactionItemTypeDto channelsSendReactionItemTypeDto, int i, int i2) {
        tfx tfxVar = new tfx("channels.sendReaction", new dn(8), new en(12));
        tfx.n(tfxVar, "channel_id", userId, 0L, 0L, 12);
        tfx.o(tfxVar, "item_type", channelsSendReactionItemTypeDto.i(), 0, 0, 12);
        tfx.l(tfxVar, "item_id", i, 0, 0, 8);
        tfx.l(tfxVar, "reaction_id", i2, 0, 0, 8);
        return tfxVar;
    }

    default tfx f(String str, ChannelsCreateCreateTypeDto channelsCreateCreateTypeDto, UserId userId, String str2, Boolean bool) {
        tfx tfxVar = new tfx("channels.create", new ir(8), new jr(7));
        if (str != null) {
            tfx.o(tfxVar, "title", str, 0, 0, 12);
        }
        if (channelsCreateCreateTypeDto != null) {
            tfx.o(tfxVar, "create_type", channelsCreateCreateTypeDto.i(), 0, 0, 12);
        }
        if (userId != null) {
            tfx.n(tfxVar, "parent_id", userId, 0L, 0L, 12);
        }
        if (str2 != null) {
            tfx.o(tfxVar, "photo", str2, 0, 0, 12);
        }
        if (bool != null) {
            tfxVar.j("can_comment", bool.booleanValue());
        }
        return tfxVar;
    }
}
