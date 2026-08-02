package xsna;

import com.vk.api.generated.base.dto.BaseUserGroupFieldsDto;
import com.vk.api.generated.stories.dto.StoriesGetPhotoUploadServerAttachTypeDto;
import com.vk.api.generated.stories.dto.StoriesGetPhotoUploadServerCameraTypeDto;
import com.vk.api.generated.stories.dto.StoriesGetPhotoUploadServerEffectDto;
import com.vk.api.generated.stories.dto.StoriesGetPhotoUploadServerFilterPhotoDto;
import com.vk.api.generated.stories.dto.StoriesGetPhotoUploadServerLifetimeDto;
import com.vk.api.generated.stories.dto.StoriesGetPhotoUploadServerMemoryTypeDto;
import com.vk.api.generated.stories.dto.StoriesGetVideoUploadServerAttachTypeDto;
import com.vk.api.generated.stories.dto.StoriesGetVideoUploadServerCameraTypeDto;
import com.vk.api.generated.stories.dto.StoriesGetVideoUploadServerEffectDto;
import com.vk.api.generated.stories.dto.StoriesGetVideoUploadServerLifetimeDto;
import com.vk.api.generated.stories.dto.StoriesGetVideoUploadServerMemoryTypeDto;
import com.vk.api.generated.stories.dto.StoriesSetPrivacyPrivacyDto;
import com.vk.dto.common.id.UserId;
import com.vk.internal.api.GsonHolder;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: StoriesService.kt */
/* loaded from: classes.dex */
public interface zul0 {
    static xy2 b(avl0 avl0Var, List list, List list2, Boolean bool, int i) {
        ArrayList arrayList;
        Boolean bool2 = Boolean.TRUE;
        if ((i & 2) != 0) {
            bool2 = null;
        }
        if ((i & 4) != 0) {
            list2 = null;
        }
        if ((i & 8) != 0) {
            bool = null;
        }
        avl0Var.getClass();
        tfx tfxVar = new tfx("stories.getById", new xul0(0), new com.vk.movika.sdk.base.model.history.b(28));
        tfxVar.i("stories", list);
        if (bool2 != null) {
            tfxVar.j("extended", bool2.booleanValue());
        }
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
        if (bool != null) {
            tfxVar.j("with_context", bool.booleanValue());
        }
        return tfxVar;
    }

    static /* synthetic */ xy2 c(zul0 zul0Var, List list, List list2, int i) {
        Boolean bool = Boolean.TRUE;
        if ((i & 4) != 0) {
            bool = null;
        }
        if ((i & 8) != 0) {
            list2 = null;
        }
        return zul0Var.d(list, list2, bool);
    }

    static xy2 f(avl0 avl0Var, Boolean bool, ArrayList arrayList, String str, ArrayList arrayList2, String str2, String str3, String str4, StoriesGetPhotoUploadServerMemoryTypeDto storiesGetPhotoUploadServerMemoryTypeDto, String str5, UserId userId, Integer num, StoriesGetPhotoUploadServerCameraTypeDto storiesGetPhotoUploadServerCameraTypeDto, StoriesGetPhotoUploadServerEffectDto storiesGetPhotoUploadServerEffectDto, StoriesGetPhotoUploadServerFilterPhotoDto storiesGetPhotoUploadServerFilterPhotoDto, String str6, Float f, Float f2, StoriesGetPhotoUploadServerAttachTypeDto storiesGetPhotoUploadServerAttachTypeDto, Integer num2, Integer num3, String str7, Boolean bool2, String str8, ArrayList arrayList3, String str9, String str10, String str11, Boolean bool3, Boolean bool4, Integer num4, Integer num5, Integer num6, String str12, List list, List list2, String str13, String str14, Boolean bool5, StoriesGetPhotoUploadServerLifetimeDto storiesGetPhotoUploadServerLifetimeDto, Boolean bool6, String str15, int i) {
        String str16 = (i & 8192) != 0 ? null : str13;
        String str17 = (i & 16384) != 0 ? null : str14;
        Boolean bool7 = (32768 & i) != 0 ? null : bool5;
        Boolean bool8 = (131072 & i) != 0 ? null : bool6;
        String str18 = (i & SQLiteDatabase.OPEN_PRIVATECACHE) == 0 ? str15 : null;
        avl0Var.getClass();
        tfx tfxVar = new tfx("stories.getPhotoUploadServer", new t3j0(3), new com.vk.movika.sdk.base.model.n(27));
        if (bool != null) {
            tfxVar.j("add_to_news", bool.booleanValue());
            s3q0 s3q0Var = s3q0.a;
        }
        if (arrayList != null) {
            tfx.p(tfxVar, "peer_ids", arrayList, 0L, 12);
            s3q0 s3q0Var2 = s3q0.a;
        }
        if (str != null) {
            tfx.o(tfxVar, "reply_to_story", str, 0, 0, 12);
            s3q0 s3q0Var3 = s3q0.a;
        }
        if (arrayList2 != null) {
            tfxVar.i("reply_to_questions", arrayList2);
            s3q0 s3q0Var4 = s3q0.a;
        }
        if (str2 != null) {
            tfx.o(tfxVar, "link_text", str2, 0, 0, 12);
            s3q0 s3q0Var5 = s3q0.a;
        }
        if (str3 != null) {
            tfx.o(tfxVar, "link_url", str3, 0, 2048, 4);
            s3q0 s3q0Var6 = s3q0.a;
        }
        if (str4 != null) {
            tfx.o(tfxVar, "mask_id", str4, 0, 0, 12);
            s3q0 s3q0Var7 = s3q0.a;
        }
        if (storiesGetPhotoUploadServerMemoryTypeDto != null) {
            tfx.o(tfxVar, "memory_type", storiesGetPhotoUploadServerMemoryTypeDto.j(), 0, 0, 12);
            s3q0 s3q0Var8 = s3q0.a;
        }
        if (str5 != null) {
            tfx.o(tfxVar, "memory_date", str5, 0, 0, 12);
            s3q0 s3q0Var9 = s3q0.a;
        }
        if (userId != null) {
            tfx.n(tfxVar, "group_id", userId, 0L, 0L, 8);
            s3q0 s3q0Var10 = s3q0.a;
        }
        if (num != null) {
            tfx.l(tfxVar, "section_id", num.intValue(), 0, 0, 12);
            s3q0 s3q0Var11 = s3q0.a;
        }
        if (storiesGetPhotoUploadServerCameraTypeDto != null) {
            tfx.o(tfxVar, "camera_type", storiesGetPhotoUploadServerCameraTypeDto.i(), 0, 0, 12);
            s3q0 s3q0Var12 = s3q0.a;
        }
        if (storiesGetPhotoUploadServerEffectDto != null) {
            tfx.o(tfxVar, "effect", storiesGetPhotoUploadServerEffectDto.j(), 0, 0, 12);
            s3q0 s3q0Var13 = s3q0.a;
        }
        if (storiesGetPhotoUploadServerFilterPhotoDto != null) {
            tfx.o(tfxVar, "filter_photo", storiesGetPhotoUploadServerFilterPhotoDto.j(), 0, 0, 12);
            s3q0 s3q0Var14 = s3q0.a;
        }
        if (str6 != null) {
            tfx.o(tfxVar, "texts_info", str6, 0, 0, 12);
            s3q0 s3q0Var15 = s3q0.a;
        }
        if (f != null) {
            tfxVar.h("latitude", f.floatValue(), -90.0d, 90.0d);
            s3q0 s3q0Var16 = s3q0.a;
        }
        if (f2 != null) {
            tfxVar.h("longitude", f2.floatValue(), -180.0d, 180.0d);
            s3q0 s3q0Var17 = s3q0.a;
        }
        if (storiesGetPhotoUploadServerAttachTypeDto != null) {
            tfx.o(tfxVar, "attach_type", storiesGetPhotoUploadServerAttachTypeDto.i(), 0, 0, 12);
            s3q0 s3q0Var18 = s3q0.a;
        }
        if (num2 != null) {
            tfx.l(tfxVar, "attach_owner_id", num2.intValue(), 0, 0, 12);
            s3q0 s3q0Var19 = s3q0.a;
        }
        if (num3 != null) {
            tfx.l(tfxVar, "attach_id", num3.intValue(), 0, 0, 8);
            s3q0 s3q0Var20 = s3q0.a;
        }
        if (str7 != null) {
            tfx.o(tfxVar, "attach_access_key", str7, 0, 0, 12);
            s3q0 s3q0Var21 = s3q0.a;
        }
        if (bool2 != null) {
            tfxVar.j("live_cover", bool2.booleanValue());
            s3q0 s3q0Var22 = s3q0.a;
        }
        if (str8 != null) {
            tfx.o(tfxVar, "clickable_stickers", str8, 0, 0, 12);
            s3q0 s3q0Var23 = s3q0.a;
        }
        if (arrayList3 != null) {
            tfxVar.i("sticker_ids", arrayList3);
            s3q0 s3q0Var24 = s3q0.a;
        }
        if (str9 != null) {
            tfx.o(tfxVar, "ref", str9, 0, 0, 12);
            s3q0 s3q0Var25 = s3q0.a;
        }
        if (str10 != null) {
            tfx.o(tfxVar, "entry_point", str10, 0, 0, 12);
            s3q0 s3q0Var26 = s3q0.a;
        }
        if (str11 != null) {
            tfx.o(tfxVar, "analytics", str11, 0, 0, 12);
            s3q0 s3q0Var27 = s3q0.a;
        }
        if (bool3 != null) {
            tfxVar.j("no_sound", bool3.booleanValue());
            s3q0 s3q0Var28 = s3q0.a;
        }
        if (bool4 != null) {
            tfxVar.j("is_one_time", bool4.booleanValue());
            s3q0 s3q0Var29 = s3q0.a;
        }
        if (num4 != null) {
            tfx.l(tfxVar, "mini_app_id", num4.intValue(), 0, 0, 8);
            s3q0 s3q0Var30 = s3q0.a;
        }
        if (num5 != null) {
            tfx.l(tfxVar, "situational_suggest_id", num5.intValue(), 0, 0, 8);
            s3q0 s3q0Var31 = s3q0.a;
        }
        if (num6 != null) {
            tfx.l(tfxVar, "question_id", num6.intValue(), 0, 0, 8);
            s3q0 s3q0Var32 = s3q0.a;
        }
        if (str12 != null) {
            tfx.o(tfxVar, "music_from_story", str12, 0, 0, 12);
            s3q0 s3q0Var33 = s3q0.a;
        }
        if (list != null) {
            tfxVar.i("narrative_ids", list);
            s3q0 s3q0Var34 = s3q0.a;
        }
        tfxVar.j("upload_v2", true);
        s3q0 s3q0Var35 = s3q0.a;
        if (list2 != null) {
            tfxVar.i("privacy", list2);
        }
        if (str16 != null) {
            tfx.o(tfxVar, "ord_external_id", str16, 0, 0, 12);
        }
        if (str17 != null) {
            tfx.o(tfxVar, "ord_erid", str17, 0, 0, 12);
        }
        if (bool7 != null) {
            tfxVar.j("is_authors_ads", bool7.booleanValue());
        }
        if (storiesGetPhotoUploadServerLifetimeDto != null) {
            tfx.l(tfxVar, "lifetime", storiesGetPhotoUploadServerLifetimeDto.i(), 0, 0, 12);
        }
        if (bool8 != null) {
            tfxVar.j("is_market_online_booking_enabled", bool8.booleanValue());
        }
        if (str18 != null) {
            tfx.o(tfxVar, "thumb_hash", str18, 0, 34, 4);
        }
        return tfxVar;
    }

    static xy2 h(avl0 avl0Var, UserId userId, Boolean bool, String str, UserId userId2, List list, String str2, List list2, String str3, Boolean bool2, int i) {
        tfx tfxVar;
        ArrayList arrayList;
        Boolean bool3 = Boolean.FALSE;
        UserId userId3 = (i & 1) != 0 ? null : userId;
        Boolean bool4 = (i & 2) != 0 ? null : bool;
        String str4 = (i & 4) != 0 ? null : str;
        UserId userId4 = (i & 8) != 0 ? null : userId2;
        String str5 = (i & 64) != 0 ? null : str2;
        List list3 = (i & 128) != 0 ? null : list2;
        if ((i & 256) != 0) {
            bool3 = null;
        }
        String str6 = (i & 1024) != 0 ? null : str3;
        Boolean bool5 = (i & 2048) == 0 ? bool2 : null;
        avl0Var.getClass();
        tfx tfxVar2 = new tfx("stories.get", new yga0(5), new hgj0(1));
        if (userId3 != null) {
            tfxVar = tfxVar2;
            tfx.n(tfxVar, "owner_id", userId3, 0L, 0L, 12);
        } else {
            tfxVar = tfxVar2;
        }
        if (bool4 != null) {
            tfxVar.j("with_lives", bool4.booleanValue());
        }
        if (str4 != null) {
            tfx.o(tfxVar, "ref", str4, 0, 0, 12);
        }
        if (userId4 != null) {
            tfx.n(tfxVar, "first_owner_id", userId4, 0L, 0L, 12);
        }
        tfxVar.j("extended", true);
        if (list != null) {
            List list4 = list;
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
        if (str5 != null) {
            tfx.o(tfxVar, "device_info", str5, 0, 0, 12);
        }
        if (list3 != null) {
            tfxVar.i("feed_item_ids", list3);
        }
        if (bool3 != null) {
            tfxVar.j("minimized", bool3.booleanValue());
        }
        if (str6 != null) {
            tfx.o(tfxVar, "track_code", str6, 0, 0, 12);
        }
        if (bool5 != null) {
            tfxVar.j("skip_ads", bool5.booleanValue());
        }
        return tfxVar;
    }

    default tfx a(UserId userId) {
        tfx tfxVar = new tfx("stories.unsubscribe", new p11(27), new rf3(29));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        return tfxVar;
    }

    default tfx d(List list, List list2, Boolean bool) {
        ArrayList arrayList;
        tfx tfxVar = new tfx("stories.save", new tq(26), new uq(29));
        if (list != null) {
            tfx.o(tfxVar, "upload_results_json", GsonHolder.a().toJson(list), 0, 0, 12);
        }
        if (bool != null) {
            tfxVar.j("extended", bool.booleanValue());
        }
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

    default tfx e(Boolean bool, List list, String str, List list2, String str2, String str3, String str4, StoriesGetVideoUploadServerMemoryTypeDto storiesGetVideoUploadServerMemoryTypeDto, String str5, UserId userId, Integer num, StoriesGetVideoUploadServerCameraTypeDto storiesGetVideoUploadServerCameraTypeDto, StoriesGetVideoUploadServerEffectDto storiesGetVideoUploadServerEffectDto, String str6, Float f, Float f2, StoriesGetVideoUploadServerAttachTypeDto storiesGetVideoUploadServerAttachTypeDto, UserId userId2, Integer num2, String str7, Boolean bool2, Boolean bool3, String str8, List list3, String str9, String str10, String str11, Boolean bool4, Boolean bool5, Integer num3, Integer num4, Integer num5, String str12, List list4, Integer num6, Integer num7, List list5, String str13, String str14, Boolean bool6, StoriesGetVideoUploadServerLifetimeDto storiesGetVideoUploadServerLifetimeDto, Boolean bool7, String str15) {
        tfx tfxVar;
        tfx tfxVar2 = new tfx("stories.getVideoUploadServer", new bxj0(3), new s11(29));
        if (bool != null) {
            tfxVar2.j("add_to_news", bool.booleanValue());
            s3q0 s3q0Var = s3q0.a;
        }
        if (list != null) {
            tfx.p(tfxVar2, "peer_ids", list, 0L, 12);
            tfxVar = tfxVar2;
            s3q0 s3q0Var2 = s3q0.a;
        } else {
            tfxVar = tfxVar2;
        }
        if (str != null) {
            tfx.o(tfxVar, "reply_to_story", str, 0, 0, 12);
            s3q0 s3q0Var3 = s3q0.a;
        }
        if (list2 != null) {
            tfxVar.i("reply_to_questions", list2);
            s3q0 s3q0Var4 = s3q0.a;
        }
        if (str2 != null) {
            tfx.o(tfxVar, "link_text", str2, 0, 0, 12);
            s3q0 s3q0Var5 = s3q0.a;
        }
        if (str3 != null) {
            tfx.o(tfxVar, "link_url", str3, 0, 2048, 4);
            s3q0 s3q0Var6 = s3q0.a;
        }
        if (str4 != null) {
            tfx.o(tfxVar, "mask_id", str4, 0, 0, 12);
            s3q0 s3q0Var7 = s3q0.a;
        }
        if (storiesGetVideoUploadServerMemoryTypeDto != null) {
            tfx.o(tfxVar, "memory_type", storiesGetVideoUploadServerMemoryTypeDto.j(), 0, 0, 12);
            s3q0 s3q0Var8 = s3q0.a;
        }
        if (str5 != null) {
            tfx.o(tfxVar, "memory_date", str5, 0, 0, 12);
            s3q0 s3q0Var9 = s3q0.a;
        }
        if (userId != null) {
            tfx.n(tfxVar, "group_id", userId, 0L, 0L, 8);
            s3q0 s3q0Var10 = s3q0.a;
        }
        if (num != null) {
            tfx.l(tfxVar, "section_id", num.intValue(), 0, 0, 12);
            s3q0 s3q0Var11 = s3q0.a;
        }
        if (storiesGetVideoUploadServerCameraTypeDto != null) {
            tfx.o(tfxVar, "camera_type", storiesGetVideoUploadServerCameraTypeDto.j(), 0, 0, 12);
            s3q0 s3q0Var12 = s3q0.a;
        }
        if (storiesGetVideoUploadServerEffectDto != null) {
            tfx.o(tfxVar, "effect", storiesGetVideoUploadServerEffectDto.j(), 0, 0, 12);
            s3q0 s3q0Var13 = s3q0.a;
        }
        if (str6 != null) {
            tfx.o(tfxVar, "texts_info", str6, 0, 0, 12);
            s3q0 s3q0Var14 = s3q0.a;
        }
        if (f != null) {
            tfxVar.h("latitude", f.floatValue(), -90.0d, 90.0d);
            s3q0 s3q0Var15 = s3q0.a;
        }
        if (f2 != null) {
            tfxVar.h("longitude", f2.floatValue(), -180.0d, 180.0d);
            s3q0 s3q0Var16 = s3q0.a;
        }
        if (storiesGetVideoUploadServerAttachTypeDto != null) {
            tfx.o(tfxVar, "attach_type", storiesGetVideoUploadServerAttachTypeDto.i(), 0, 0, 12);
            s3q0 s3q0Var17 = s3q0.a;
        }
        if (userId2 != null) {
            tfx.n(tfxVar, "attach_owner_id", userId2, 0L, 0L, 12);
            s3q0 s3q0Var18 = s3q0.a;
        }
        if (num2 != null) {
            tfx.l(tfxVar, "attach_id", num2.intValue(), 0, 0, 8);
            s3q0 s3q0Var19 = s3q0.a;
        }
        if (str7 != null) {
            tfx.o(tfxVar, "attach_access_key", str7, 0, 0, 12);
            s3q0 s3q0Var20 = s3q0.a;
        }
        if (bool2 != null) {
            tfxVar.j("live_cover", bool2.booleanValue());
            s3q0 s3q0Var21 = s3q0.a;
        }
        tfxVar.j("is_from_message", bool3.booleanValue());
        s3q0 s3q0Var22 = s3q0.a;
        if (str8 != null) {
            tfx.o(tfxVar, "clickable_stickers", str8, 0, 0, 12);
        }
        if (list3 != null) {
            tfxVar.i("sticker_ids", list3);
        }
        if (str9 != null) {
            tfx.o(tfxVar, "ref", str9, 0, 0, 12);
        }
        if (str10 != null) {
            tfx.o(tfxVar, "entry_point", str10, 0, 0, 12);
        }
        if (str11 != null) {
            tfx.o(tfxVar, "analytics", str11, 0, 0, 12);
        }
        if (bool4 != null) {
            tfxVar.j("no_sound", bool4.booleanValue());
        }
        if (bool5 != null) {
            tfxVar.j("is_one_time", bool5.booleanValue());
        }
        if (num3 != null) {
            tfx.l(tfxVar, "mini_app_id", num3.intValue(), 0, 0, 8);
        }
        if (num4 != null) {
            tfx.l(tfxVar, "situational_suggest_id", num4.intValue(), 0, 0, 8);
        }
        if (num5 != null) {
            tfx.l(tfxVar, "question_id", num5.intValue(), 0, 0, 8);
        }
        if (str12 != null) {
            tfx.o(tfxVar, "music_from_story", str12, 0, 0, 12);
        }
        if (list4 != null) {
            tfxVar.i("narrative_ids", list4);
        }
        if (num6 != null) {
            tfxVar.f(num6.intValue(), 0, 10000, "width");
        }
        if (num7 != null) {
            tfxVar.f(num7.intValue(), 0, 10000, "height");
        }
        if (list5 != null) {
            tfxVar.i("privacy", list5);
        }
        if (str13 != null) {
            tfx.o(tfxVar, "ord_external_id", str13, 0, 0, 12);
        }
        if (str14 != null) {
            tfx.o(tfxVar, "ord_erid", str14, 0, 0, 12);
        }
        if (bool6 != null) {
            tfxVar.j("is_authors_ads", bool6.booleanValue());
        }
        if (storiesGetVideoUploadServerLifetimeDto != null) {
            tfx.l(tfxVar, "lifetime", storiesGetVideoUploadServerLifetimeDto.i(), 0, 0, 12);
        }
        if (bool7 != null) {
            tfxVar.j("is_market_online_booking_enabled", bool7.booleanValue());
        }
        if (str15 != null) {
            tfx.o(tfxVar, "thumb_hash", str15, 0, 34, 4);
        }
        return tfxVar;
    }

    default tfx g(UserId userId, String str) {
        tfx tfxVar = new tfx("stories.subscribe", new ly80(5), new bjl0(1));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        if (str != null) {
            tfx.o(tfxVar, "track_code", str, 0, 0, 12);
        }
        return tfxVar;
    }

    default tfx i(int i, StoriesSetPrivacyPrivacyDto storiesSetPrivacyPrivacyDto) {
        tfx tfxVar = new tfx("stories.setPrivacy", new fbj0(3), new jgj0(2));
        tfx.l(tfxVar, "story_id", i, 0, 0, 8);
        tfx.o(tfxVar, "privacy", storiesSetPrivacyPrivacyDto.i(), 0, 0, 12);
        return tfxVar;
    }
}
