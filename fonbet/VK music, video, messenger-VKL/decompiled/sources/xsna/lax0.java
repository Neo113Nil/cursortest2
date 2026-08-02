package xsna;

import com.ironsource.O6;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.api.generated.base.dto.BaseUserGroupFieldsDto;
import com.vk.api.generated.wall.dto.WallEditPrimaryAttachmentsModeDto;
import com.vk.api.generated.wall.dto.WallGetCommentsExtendedSortDto;
import com.vk.api.generated.wall.dto.WallPostPrimaryAttachmentsModeDto;
import com.vk.dto.common.id.UserId;
import com.vk.internal.api.GsonHolder;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: WallService.kt */
/* loaded from: classes2.dex */
public interface lax0 {
    static xy2 a(max0 max0Var, int i, UserId userId, List list, int i2) {
        ArrayList arrayList;
        Boolean bool = Boolean.TRUE;
        if ((i2 & 4) != 0) {
            bool = null;
        }
        if ((i2 & 8) != 0) {
            list = null;
        }
        max0Var.getClass();
        tfx tfxVar = new tfx("wall.getComment", new jgj0(9), new zjh0(10));
        tfx.l(tfxVar, "comment_id", i, 0, 0, 8);
        if (userId != null) {
            tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        }
        if (bool != null) {
            tfxVar.j("extended", bool.booleanValue());
        }
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((BaseUserGroupFieldsDto) it.next()).i());
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            tfxVar.i("fields", arrayList);
        }
        return tfxVar;
    }

    static xy2 c(max0 max0Var, List list, List list2, String str, int i) {
        ArrayList arrayList;
        Boolean bool = Boolean.TRUE;
        if ((i & 2) != 0) {
            bool = null;
        }
        Integer num = (i & 4) != 0 ? null : 1;
        List list3 = (i & 8) != 0 ? null : list2;
        String str2 = (i & 16) != 0 ? null : str;
        max0Var.getClass();
        tfx tfxVar = new tfx("wall.getById", new lrw0(), new pft0(3));
        tfxVar.i("posts", list);
        if (bool != null) {
            tfxVar.j("extended", bool.booleanValue());
        }
        if (num != null) {
            tfx.l(tfxVar, "copy_history_depth", num.intValue(), 0, 0, 12);
        }
        if (list3 != null) {
            List list4 = list3;
            arrayList = new ArrayList(c5g.u(list4, 10));
            Iterator it = list4.iterator();
            while (it.hasNext()) {
                arrayList.add(((BaseUserGroupFieldsDto) it.next()).i());
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            tfxVar.i("fields", arrayList);
        }
        if (str2 != null) {
            tfx.o(tfxVar, "track_code", str2, 0, 0, 12);
        }
        return tfxVar;
    }

    static xy2 g(max0 max0Var, UserId userId, String str, int i) {
        if ((i & 2) != 0) {
            str = null;
        }
        String str2 = str;
        max0Var.getClass();
        tfx tfxVar = new tfx("wall.unsubscribe", new k2s0(6), new g7r0(5));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        if (str2 != null) {
            tfx.o(tfxVar, "track_code", str2, 0, 0, 12);
        }
        return tfxVar;
    }

    static xy2 j(max0 max0Var, UserId userId, String str, int i) {
        Boolean bool = Boolean.FALSE;
        Integer num = (i & 2) != 0 ? null : 0;
        if ((i & 16) != 0) {
            bool = null;
        }
        max0Var.getClass();
        tfx tfxVar = new tfx("wall.get", new hun0(7), new jax0());
        if (userId != null) {
            tfx.n(tfxVar, X3.j.D, userId, 0L, 0L, 12);
        }
        if (num != null) {
            tfx.l(tfxVar, SignalingProtocol.KEY_OFFSET, num.intValue(), 0, 0, 8);
        }
        tfx.l(tfxVar, "count", 1, 0, 0, 8);
        tfx.o(tfxVar, "filter", str, 0, 0, 12);
        if (bool != null) {
            tfxVar.j("extended", bool.booleanValue());
        }
        return tfxVar;
    }

    static xy2 k(max0 max0Var, UserId userId, Integer num, int i) {
        Boolean bool = Boolean.TRUE;
        if ((i & 2) != 0) {
            bool = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        max0Var.getClass();
        tfx tfxVar = new tfx("wall.getPostingSettings", new kft0(2), new m2o0(5));
        if (userId != null) {
            tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        }
        if (bool != null) {
            tfxVar.j("new_posting", bool.booleanValue());
        }
        if (num != null) {
            tfx.l(tfxVar, "post_id", num.intValue(), 0, 0, 8);
        }
        return tfxVar;
    }

    static xy2 l(max0 max0Var, int i, UserId userId, Boolean bool, Boolean bool2, String str, List list, List list2, String str2, String str3, Boolean bool3, Boolean bool4, Integer num, Float f, Float f2, Integer num2, Boolean bool5, String str4, String str5, Boolean bool6, Integer num3, Integer num4, Integer num5, String str6, Integer num6, UserId userId2, String str7, String str8, String str9, WallEditPrimaryAttachmentsModeDto wallEditPrimaryAttachmentsModeDto, String str10, String str11, String str12, String str13, List list3, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Integer num7, int i2, int i3) {
        Boolean bool11 = (i2 & 4) != 0 ? null : bool;
        Boolean bool12 = (i2 & 8) != 0 ? null : bool2;
        List list4 = (i2 & 32) != 0 ? null : list;
        List list5 = (i2 & 128) != 0 ? null : list2;
        String str14 = (i2 & 256) != 0 ? null : str2;
        String str15 = (i2 & 512) != 0 ? null : str3;
        Boolean bool13 = (i2 & 1024) != 0 ? null : bool3;
        Boolean bool14 = (i2 & 2048) != 0 ? null : bool4;
        Float f3 = (i2 & 8192) != 0 ? null : f;
        Float f4 = (i2 & 16384) != 0 ? null : f2;
        Integer num8 = (32768 & i2) != 0 ? null : num2;
        Boolean bool15 = (65536 & i2) != 0 ? null : bool5;
        String str16 = (131072 & i2) != 0 ? null : str4;
        String str17 = (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : str5;
        Boolean bool16 = (i2 & 524288) != 0 ? null : bool6;
        Integer num9 = (i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : num3;
        Integer num10 = (i2 & 2097152) != 0 ? null : num4;
        Integer num11 = (i2 & 4194304) != 0 ? null : num5;
        String str18 = (i2 & 8388608) != 0 ? null : str6;
        Integer num12 = (i2 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : num6;
        UserId userId3 = (i2 & 33554432) != 0 ? null : userId2;
        String str19 = (i2 & 67108864) != 0 ? null : str7;
        String str20 = (i2 & 134217728) != 0 ? null : str8;
        String str21 = (i2 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : str9;
        WallEditPrimaryAttachmentsModeDto wallEditPrimaryAttachmentsModeDto2 = (i2 & 1073741824) != 0 ? null : wallEditPrimaryAttachmentsModeDto;
        String str22 = (i2 & Integer.MIN_VALUE) != 0 ? null : str10;
        String str23 = (i3 & 2) != 0 ? null : str12;
        String str24 = (i3 & 4) != 0 ? null : str13;
        List list6 = (i3 & 8) != 0 ? null : list3;
        Boolean bool17 = (i3 & 16) != 0 ? null : bool7;
        Boolean bool18 = (i3 & 32) != 0 ? null : bool8;
        Boolean bool19 = (i3 & 64) != 0 ? null : bool9;
        Boolean bool20 = (i3 & 128) != 0 ? null : bool10;
        Integer num13 = (i3 & 256) != 0 ? null : num7;
        max0Var.getClass();
        String str25 = str22;
        Boolean bool21 = bool11;
        Boolean bool22 = bool20;
        tfx tfxVar = new tfx("wall.edit", new ky80(14), new ajl0(6));
        tfx.l(tfxVar, "post_id", i, 0, 0, 8);
        if (userId != null) {
            tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
            s3q0 s3q0Var = s3q0.a;
        }
        if (bool21 != null) {
            tfxVar.j("friends_only", bool21.booleanValue());
            s3q0 s3q0Var2 = s3q0.a;
        }
        if (bool12 != null) {
            tfxVar.j("best_friends_only", bool12.booleanValue());
            s3q0 s3q0Var3 = s3q0.a;
        }
        if (str != null) {
            tfx.o(tfxVar, "message", str, 0, 0, 12);
            s3q0 s3q0Var4 = s3q0.a;
        }
        if (list4 != null) {
            tfxVar.i("attachments", list4);
            s3q0 s3q0Var5 = s3q0.a;
        }
        if (list5 != null) {
            tfx.o(tfxVar, "attachments_list", GsonHolder.a().toJson(list5), 0, 0, 12);
            s3q0 s3q0Var6 = s3q0.a;
        }
        if (str14 != null) {
            tfx.o(tfxVar, "photo_attachments_crop", str14, 0, 0, 12);
            s3q0 s3q0Var7 = s3q0.a;
        }
        if (str15 != null) {
            tfx.o(tfxVar, "services", str15, 0, 0, 12);
            s3q0 s3q0Var8 = s3q0.a;
        }
        if (bool13 != null) {
            tfxVar.j("signed", bool13.booleanValue());
            s3q0 s3q0Var9 = s3q0.a;
        }
        if (bool14 != null) {
            tfxVar.j("check_sign", bool14.booleanValue());
            s3q0 s3q0Var10 = s3q0.a;
        }
        if (num != null) {
            tfx.l(tfxVar, "publish_date", num.intValue(), 0, 0, 8);
            s3q0 s3q0Var11 = s3q0.a;
        }
        if (f3 != null) {
            tfxVar.h(O6.s, f3.floatValue(), -1.7976931348623157E308d, Double.MAX_VALUE);
            s3q0 s3q0Var12 = s3q0.a;
        }
        if (f4 != null) {
            tfxVar.h("long", f4.floatValue(), -1.7976931348623157E308d, Double.MAX_VALUE);
            s3q0 s3q0Var13 = s3q0.a;
        }
        if (num8 != null) {
            tfx.l(tfxVar, "place_id", num8.intValue(), 0, 0, 8);
            s3q0 s3q0Var14 = s3q0.a;
        }
        if (bool15 != null) {
            tfxVar.j("mark_as_ads", bool15.booleanValue());
            s3q0 s3q0Var15 = s3q0.a;
        }
        if (str16 != null) {
            tfx.o(tfxVar, "ord_external_id", str16, 0, 0, 12);
            s3q0 s3q0Var16 = s3q0.a;
        }
        if (str17 != null) {
            tfx.o(tfxVar, "ord_erid", str17, 0, 100, 4);
            s3q0 s3q0Var17 = s3q0.a;
        }
        if (bool16 != null) {
            tfxVar.j("close_comments", bool16.booleanValue());
            s3q0 s3q0Var18 = s3q0.a;
        }
        if (num9 != null) {
            tfx.l(tfxVar, "donut_paid_duration", num9.intValue(), 0, 0, 12);
            s3q0 s3q0Var19 = s3q0.a;
        }
        if (num10 != null) {
            tfx.l(tfxVar, "donut_paid_until", num10.intValue(), 0, 0, 12);
            s3q0 s3q0Var20 = s3q0.a;
        }
        if (num11 != null) {
            tfx.l(tfxVar, "donut_level_id", num11.intValue(), 0, 0, 12);
            s3q0 s3q0Var21 = s3q0.a;
        }
        if (str18 != null) {
            tfx.o(tfxVar, "donut_teaser_text", str18, 0, 0, 12);
            s3q0 s3q0Var22 = s3q0.a;
        }
        if (num12 != null) {
            tfx.l(tfxVar, "poster_bkg_id", num12.intValue(), 0, 0, 8);
            s3q0 s3q0Var23 = s3q0.a;
        }
        if (userId3 != null) {
            tfx.n(tfxVar, "poster_bkg_owner_id", userId3, 0L, 0L, 12);
            s3q0 s3q0Var24 = s3q0.a;
        }
        if (str19 != null) {
            tfx.o(tfxVar, "poster_bkg_access_hash", str19, 0, 0, 12);
            s3q0 s3q0Var25 = s3q0.a;
        }
        if (str20 != null) {
            tfx.o(tfxVar, "copyright", str20, 0, 0, 12);
            s3q0 s3q0Var26 = s3q0.a;
        }
        if (str21 != null) {
            tfx.o(tfxVar, "primary_attachments_ratio", str21, 0, 0, 12);
            s3q0 s3q0Var27 = s3q0.a;
        }
        if (wallEditPrimaryAttachmentsModeDto2 != null) {
            tfx.o(tfxVar, "primary_attachments_mode", wallEditPrimaryAttachmentsModeDto2.i(), 0, 0, 12);
            s3q0 s3q0Var28 = s3q0.a;
        }
        if (str25 != null) {
            tfx.o(tfxVar, "ref", str25, 0, 0, 12);
            s3q0 s3q0Var29 = s3q0.a;
        }
        if (str11 != null) {
            tfx.o(tfxVar, "entry_point", str11, 0, 0, 12);
            s3q0 s3q0Var30 = s3q0.a;
        }
        if (str23 != null) {
            tfx.o(tfxVar, "link_title", str23, 0, 0, 12);
            s3q0 s3q0Var31 = s3q0.a;
        }
        if (str24 != null) {
            tfx.o(tfxVar, "link_photo_id", str24, 0, 0, 12);
            s3q0 s3q0Var32 = s3q0.a;
        }
        if (list6 != null) {
            tfx.p(tfxVar, "co_owner_ids", list6, 0L, 12);
            s3q0 s3q0Var33 = s3q0.a;
        }
        if (bool17 != null) {
            tfxVar.j("new_posting", bool17.booleanValue());
            s3q0 s3q0Var34 = s3q0.a;
        }
        if (bool18 != null) {
            tfxVar.j("mute_notifications", bool18.booleanValue());
            s3q0 s3q0Var35 = s3q0.a;
        }
        if (bool19 != null) {
            tfxVar.j("is_action_button_remembered", bool19.booleanValue());
            s3q0 s3q0Var36 = s3q0.a;
        }
        if (bool22 != null) {
            tfxVar.j("draft", bool22.booleanValue());
            s3q0 s3q0Var37 = s3q0.a;
        }
        if (num13 != null) {
            tfx.l(tfxVar, "creation_session_id", num13.intValue(), 0, 0, 12);
            s3q0 s3q0Var38 = s3q0.a;
        }
        return tfxVar;
    }

    static xy2 n(max0 max0Var, UserId userId, Boolean bool, Boolean bool2, Boolean bool3, String str, List list, List list2, String str2, String str3, WallPostPrimaryAttachmentsModeDto wallPostPrimaryAttachmentsModeDto, String str4, Boolean bool4, Boolean bool5, Integer num, Float f, Float f2, Integer num2, Integer num3, String str5, Boolean bool6, String str6, Integer num4, String str7, String str8, String str9, String str10, Boolean bool7, Integer num5, Integer num6, Integer num7, String str11, Boolean bool8, Integer num8, UserId userId2, String str12, String str13, String str14, String str15, String str16, List list3, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Integer num9, int i, int i2) {
        tfx tfxVar;
        Boolean bool13 = (i & 2) != 0 ? null : bool;
        Boolean bool14 = (i & 4) != 0 ? null : bool2;
        Boolean bool15 = (i & 8) != 0 ? null : bool3;
        String str17 = (i & 16) != 0 ? null : str;
        List list4 = (i & 32) != 0 ? null : list;
        List list5 = (i & 128) != 0 ? null : list2;
        String str18 = (i & 256) != 0 ? null : str2;
        String str19 = (i & 512) != 0 ? null : str3;
        WallPostPrimaryAttachmentsModeDto wallPostPrimaryAttachmentsModeDto2 = (i & 1024) != 0 ? null : wallPostPrimaryAttachmentsModeDto;
        String str20 = (i & 2048) != 0 ? null : str4;
        Boolean bool16 = (i & 8192) != 0 ? null : bool4;
        Boolean bool17 = (i & 16384) != 0 ? null : bool5;
        Integer num10 = (i & 32768) != 0 ? null : num;
        Float f3 = (i & 65536) != 0 ? null : f;
        Float f4 = (i & 131072) != 0 ? null : f2;
        Integer num11 = (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : num2;
        String str21 = (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : str5;
        Boolean bool18 = (i & 2097152) != 0 ? null : bool6;
        String str22 = (i & 8388608) != 0 ? null : str6;
        Integer num12 = (i & 33554432) != 0 ? null : num4;
        String str23 = (i & 67108864) != 0 ? null : str7;
        String str24 = (i & 134217728) != 0 ? null : str8;
        String str25 = (i & 268435456) != 0 ? null : str9;
        String str26 = (i & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : str10;
        Boolean bool19 = (i & 1073741824) != 0 ? null : bool7;
        Integer num13 = (i & Integer.MIN_VALUE) != 0 ? null : num5;
        Integer num14 = (i2 & 1) != 0 ? null : num6;
        Integer num15 = (i2 & 2) != 0 ? null : num7;
        String str27 = (i2 & 4) != 0 ? null : str11;
        Boolean bool20 = (i2 & 8) != 0 ? null : bool8;
        Integer num16 = (i2 & 16) != 0 ? null : num8;
        UserId userId3 = (i2 & 32) != 0 ? null : userId2;
        String str28 = (i2 & 64) != 0 ? null : str12;
        String str29 = (i2 & 128) != 0 ? null : str13;
        String str30 = (i2 & 4096) != 0 ? null : str15;
        Integer num17 = num13;
        String str31 = (i2 & 8192) != 0 ? null : str16;
        List list6 = (i2 & 16384) != 0 ? null : list3;
        Boolean bool21 = (i2 & 32768) != 0 ? null : bool9;
        Boolean bool22 = (i2 & 65536) != 0 ? null : bool10;
        Boolean bool23 = (i2 & 131072) != 0 ? null : bool11;
        Boolean bool24 = (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : bool12;
        Integer num18 = (i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : num9;
        max0Var.getClass();
        List list7 = list6;
        Boolean bool25 = bool13;
        String str32 = str29;
        tfx tfxVar2 = new tfx("wall.post", new qjk0(10), new rjk0(10));
        if (userId != null) {
            tfx.n(tfxVar2, "owner_id", userId, 0L, 0L, 12);
            tfxVar = tfxVar2;
            s3q0 s3q0Var = s3q0.a;
        } else {
            tfxVar = tfxVar2;
        }
        if (bool25 != null) {
            tfxVar.j("friends_only", bool25.booleanValue());
            s3q0 s3q0Var2 = s3q0.a;
        }
        if (bool14 != null) {
            tfxVar.j("best_friends_only", bool14.booleanValue());
            s3q0 s3q0Var3 = s3q0.a;
        }
        if (bool15 != null) {
            tfxVar.j("from_group", bool15.booleanValue());
            s3q0 s3q0Var4 = s3q0.a;
        }
        if (str17 != null) {
            tfx.o(tfxVar, "message", str17, 0, 0, 12);
            s3q0 s3q0Var5 = s3q0.a;
        }
        if (list4 != null) {
            tfxVar.i("attachments", list4);
            s3q0 s3q0Var6 = s3q0.a;
        }
        if (list5 != null) {
            tfx.o(tfxVar, "attachments_list", GsonHolder.a().toJson(list5), 0, 0, 12);
            s3q0 s3q0Var7 = s3q0.a;
        }
        if (str18 != null) {
            tfx.o(tfxVar, "photo_attachments_crop", str18, 0, 0, 12);
            s3q0 s3q0Var8 = s3q0.a;
        }
        if (str19 != null) {
            tfx.o(tfxVar, "primary_attachments_ratio", str19, 0, 0, 12);
            s3q0 s3q0Var9 = s3q0.a;
        }
        if (wallPostPrimaryAttachmentsModeDto2 != null) {
            tfx.o(tfxVar, "primary_attachments_mode", wallPostPrimaryAttachmentsModeDto2.i(), 0, 0, 12);
            s3q0 s3q0Var10 = s3q0.a;
        }
        if (str20 != null) {
            tfx.o(tfxVar, "services", str20, 0, 0, 12);
            s3q0 s3q0Var11 = s3q0.a;
        }
        if (bool16 != null) {
            tfxVar.j("signed", bool16.booleanValue());
            s3q0 s3q0Var12 = s3q0.a;
        }
        if (bool17 != null) {
            tfxVar.j("check_sign", bool17.booleanValue());
            s3q0 s3q0Var13 = s3q0.a;
        }
        if (num10 != null) {
            tfx.l(tfxVar, "publish_date", num10.intValue(), 0, 0, 8);
            s3q0 s3q0Var14 = s3q0.a;
        }
        if (f3 != null) {
            tfxVar.h(O6.s, f3.floatValue(), -1.7976931348623157E308d, Double.MAX_VALUE);
            s3q0 s3q0Var15 = s3q0.a;
        }
        if (f4 != null) {
            tfxVar.h("long", f4.floatValue(), -1.7976931348623157E308d, Double.MAX_VALUE);
            s3q0 s3q0Var16 = s3q0.a;
        }
        if (num11 != null) {
            tfx.l(tfxVar, "place_id", num11.intValue(), 0, 0, 8);
            s3q0 s3q0Var17 = s3q0.a;
        }
        if (num3 != null) {
            tfx.l(tfxVar, "post_id", num3.intValue(), 0, 0, 8);
            s3q0 s3q0Var18 = s3q0.a;
        }
        if (str21 != null) {
            tfx.o(tfxVar, "guid", str21, 0, 0, 12);
            s3q0 s3q0Var19 = s3q0.a;
        }
        if (bool18 != null) {
            tfxVar.j("mark_as_ads", bool18.booleanValue());
            s3q0 s3q0Var20 = s3q0.a;
        }
        if (str22 != null) {
            tfx.o(tfxVar, "ref", str22, 0, 0, 12);
            s3q0 s3q0Var21 = s3q0.a;
        }
        if (num12 != null) {
            tfx.l(tfxVar, "situational_suggest_id", num12.intValue(), 0, 0, 8);
            s3q0 s3q0Var22 = s3q0.a;
        }
        if (str23 != null) {
            tfx.o(tfxVar, "link_title", str23, 0, 0, 12);
            s3q0 s3q0Var23 = s3q0.a;
        }
        if (str24 != null) {
            tfx.o(tfxVar, "link_image", str24, 0, 0, 12);
            s3q0 s3q0Var24 = s3q0.a;
        }
        if (str25 != null) {
            tfx.o(tfxVar, "link_button", str25, 0, 0, 12);
            s3q0 s3q0Var25 = s3q0.a;
        }
        if (str26 != null) {
            tfx.o(tfxVar, "link_photo_id", str26, 0, 0, 12);
            s3q0 s3q0Var26 = s3q0.a;
        }
        if (bool19 != null) {
            tfxVar.j("close_comments", bool19.booleanValue());
            s3q0 s3q0Var27 = s3q0.a;
        }
        if (num17 != null) {
            tfx.l(tfxVar, "donut_paid_duration", num17.intValue(), 0, 0, 12);
            s3q0 s3q0Var28 = s3q0.a;
        }
        if (num14 != null) {
            tfx.l(tfxVar, "donut_paid_until", num14.intValue(), 0, 0, 12);
            s3q0 s3q0Var29 = s3q0.a;
        }
        if (num15 != null) {
            tfx.l(tfxVar, "donut_level_id", num15.intValue(), 0, 0, 12);
            s3q0 s3q0Var30 = s3q0.a;
        }
        if (str27 != null) {
            tfx.o(tfxVar, "donut_teaser_text", str27, 0, 0, 12);
            s3q0 s3q0Var31 = s3q0.a;
        }
        if (bool20 != null) {
            tfxVar.j("mute_notifications", bool20.booleanValue());
            s3q0 s3q0Var32 = s3q0.a;
        }
        if (num16 != null) {
            tfx.l(tfxVar, "poster_bkg_id", num16.intValue(), 0, 0, 8);
            s3q0 s3q0Var33 = s3q0.a;
        }
        if (userId3 != null) {
            tfx.n(tfxVar, "poster_bkg_owner_id", userId3, 0L, 0L, 12);
            s3q0 s3q0Var34 = s3q0.a;
        }
        if (str28 != null) {
            tfx.o(tfxVar, "poster_bkg_access_hash", str28, 0, 0, 12);
            s3q0 s3q0Var35 = s3q0.a;
        }
        if (str32 != null) {
            tfx.o(tfxVar, "copyright", str32, 0, 0, 12);
            s3q0 s3q0Var36 = s3q0.a;
        }
        if (str14 != null) {
            tfx.o(tfxVar, "entry_point", str14, 0, 0, 12);
            s3q0 s3q0Var37 = s3q0.a;
        }
        if (str30 != null) {
            tfx.o(tfxVar, "ord_external_id", str30, 0, 0, 12);
            s3q0 s3q0Var38 = s3q0.a;
        }
        if (str31 != null) {
            tfx.o(tfxVar, "ord_erid", str31, 0, 100, 4);
            s3q0 s3q0Var39 = s3q0.a;
        }
        if (list7 != null) {
            tfx.p(tfxVar, "co_owner_ids", list7, 0L, 12);
            s3q0 s3q0Var40 = s3q0.a;
        }
        if (bool21 != null) {
            tfxVar.j("new_posting", bool21.booleanValue());
            s3q0 s3q0Var41 = s3q0.a;
        }
        if (bool22 != null) {
            tfxVar.j("is_action_button_remembered", bool22.booleanValue());
            s3q0 s3q0Var42 = s3q0.a;
        }
        if (bool23 != null) {
            tfxVar.j("draft", bool23.booleanValue());
            s3q0 s3q0Var43 = s3q0.a;
        }
        if (bool24 != null) {
            tfxVar.j("skip_repost_to_story", bool24.booleanValue());
            s3q0 s3q0Var44 = s3q0.a;
        }
        if (num18 != null) {
            tfx.l(tfxVar, "creation_session_id", num18.intValue(), 0, 0, 12);
            s3q0 s3q0Var45 = s3q0.a;
        }
        return tfxVar;
    }

    default tfx b(UserId userId, String str) {
        tfx tfxVar = new tfx("wall.subscribe", new bbs0(3), new zzq0(6));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        if (str != null) {
            tfx.o(tfxVar, "track_code", str, 0, 0, 12);
        }
        return tfxVar;
    }

    default tfx d(int i, UserId userId) {
        tfx tfxVar = new tfx("wall.restoreThread", new y5r0(3), new kgj0(7));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfx.l(tfxVar, "reply_id", i, 1, 0, 8);
        return tfxVar;
    }

    default tfx e(UserId userId, Integer num, Boolean bool) {
        tfx tfxVar = new tfx("wall.restoreAll", new umq0(5), new itj0(11));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfx.l(tfxVar, "post_id", num.intValue(), 0, 0, 8);
        tfxVar.j("with_parent", bool.booleanValue());
        return tfxVar;
    }

    default tfx f(UserId userId, Integer num) {
        tfx tfxVar = new tfx("wall.deleteAll", new az60(12), new yil0(5));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfx.l(tfxVar, "post_id", num.intValue(), 0, 0, 8);
        return tfxVar;
    }

    default tfx h(List list, List list2) {
        ArrayList arrayList;
        tfx tfxVar = new tfx("wall.getById", new iun0(10), new fyp0(6));
        tfxVar.i("posts", list);
        tfxVar.j("extended", true);
        if (list2 != null) {
            List list3 = list2;
            arrayList = new ArrayList(c5g.u(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(((BaseUserGroupFieldsDto) it.next()).i());
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            tfxVar.i("fields", arrayList);
        }
        return tfxVar;
    }

    default tfx i(int i, UserId userId) {
        tfx tfxVar = new tfx("wall.deleteThread", new hub0(10), new zy60(18));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfx.l(tfxVar, "reply_id", i, 1, 0, 8);
        return tfxVar;
    }

    default tfx m(UserId userId, Integer num, Integer num2, Integer num3, Integer num4, WallGetCommentsExtendedSortDto wallGetCommentsExtendedSortDto, String str, String str2, Boolean bool, List list, Integer num5, Boolean bool2, Boolean bool3) {
        ArrayList arrayList;
        tfx tfxVar = new tfx("wall.getComments", new qmk0(6), new wcl0(5));
        if (userId != null) {
            tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        }
        tfx.l(tfxVar, "post_id", num.intValue(), 0, 0, 8);
        tfxVar.j("need_likes", true);
        if (num2 != null) {
            tfx.l(tfxVar, "start_comment_id", num2.intValue(), 0, 0, 8);
        }
        if (num3 != null) {
            tfx.l(tfxVar, SignalingProtocol.KEY_OFFSET, num3.intValue(), 0, 0, 12);
        }
        tfx.l(tfxVar, "count", num4.intValue(), 0, 0, 8);
        if (wallGetCommentsExtendedSortDto != null) {
            tfx.o(tfxVar, "sort", wallGetCommentsExtendedSortDto.i(), 0, 0, 12);
        }
        if (str != null) {
            tfx.o(tfxVar, "next_from", str, 0, 0, 12);
        }
        if (str2 != null) {
            tfx.o(tfxVar, "prev_from", str2, 0, 0, 12);
        }
        if (bool != null) {
            tfxVar.j("tail", bool.booleanValue());
        }
        tfxVar.j("extended", true);
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((BaseUserGroupFieldsDto) it.next()).i());
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            tfxVar.i("fields", arrayList);
        }
        if (num5 != null) {
            tfx.l(tfxVar, "comment_id", num5.intValue(), 0, 0, 8);
        }
        tfxVar.f(2, 0, 10, "thread_items_count");
        if (bool2 != null) {
            tfxVar.j("hide_negative_replies", bool2.booleanValue());
        }
        if (bool3 != null) {
            tfxVar.j("need_blacklisted_info", bool3.booleanValue());
        }
        return tfxVar;
    }
}
