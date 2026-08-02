package xsna;

import com.huawei.hms.support.api.entity.core.CommonCode;
import com.ironsource.X3;
import com.vk.api.generated.likes.dto.LikesTypeDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedAddBanTypeDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedGetBannedExtendedFilterDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedGetFeedConnectionTypeDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedGetFeedFiltersDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedGetFeedIntentDto;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.dto.common.id.UserId;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: NewsfeedService.kt */
/* loaded from: classes2.dex */
public interface cz60 {
    static xy2 a(dz60 dz60Var, List list, List list2, int i) {
        List list3 = (i & 1) != 0 ? null : list;
        if ((i & 2) != 0) {
            list2 = null;
        }
        dz60Var.getClass();
        tfx tfxVar = new tfx("newsfeed.deleteBan", new gr(24), new dn(26));
        if (list3 != null) {
            tfx.p(tfxVar, "user_ids", list3, 1L, 8);
        }
        if (list2 != null) {
            tfx.p(tfxVar, "group_ids", list2, 1L, 8);
        }
        return tfxVar;
    }

    static /* synthetic */ xy2 b(cz60 cz60Var, UserId userId, Integer num, String str, Integer num2, String str2, String str3, int i) {
        if ((i & 1) != 0) {
            userId = null;
        }
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 16) != 0) {
            str2 = null;
        }
        if ((i & 32) != 0) {
            str3 = null;
        }
        return cz60Var.e(userId, num, str, num2, str2, str3);
    }

    static xy2 g(dz60 dz60Var, String str, List list, List list2, int i) {
        ArrayList arrayList;
        Integer num = (i & 2) != 0 ? null : 9;
        String str2 = (i & 4) != 0 ? null : str;
        dz60Var.getClass();
        tfx tfxVar = new tfx("newsfeed.getLikesFeed", new wr(28), new xr(24));
        if (num != null) {
            tfxVar.f(num.intValue(), 0, 50, "count");
        }
        if (str2 != null) {
            tfx.o(tfxVar, "start_from", str2, 0, 0, 12);
        }
        if (list != null) {
            tfxVar.i("fields", list);
        }
        if (list2 != null) {
            List list3 = list2;
            arrayList = new ArrayList(c5g.u(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(((LikesTypeDto) it.next()).j());
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            tfxVar.i("like_types", arrayList);
        }
        return tfxVar;
    }

    static /* synthetic */ xy2 h(cz60 cz60Var, UserId userId, Integer num, String str, Integer num2, String str2, Integer num3, Integer num4, String str3, String str4, int i) {
        if ((i & 1) != 0) {
            userId = null;
        }
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 16) != 0) {
            str2 = null;
        }
        if ((i & 32) != 0) {
            num3 = null;
        }
        if ((i & 64) != 0) {
            num4 = null;
        }
        if ((i & 128) != 0) {
            str3 = null;
        }
        if ((i & 256) != 0) {
            str4 = null;
        }
        return cz60Var.i(userId, num, str, num2, str2, num3, num4, str3, str4);
    }

    default tfx c(List list, NewsfeedGetBannedExtendedFilterDto newsfeedGetBannedExtendedFilterDto, Integer num, String str) {
        ArrayList arrayList;
        tfx tfxVar = new tfx("newsfeed.getBanned", new yu50(1), new nr(23));
        tfxVar.j("extended", true);
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((UsersFieldsDto) it.next()).i());
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            tfxVar.i("fields", arrayList);
        }
        if (newsfeedGetBannedExtendedFilterDto != null) {
            tfx.o(tfxVar, "filter", newsfeedGetBannedExtendedFilterDto.i(), 0, 0, 12);
        }
        tfx.l(tfxVar, "count", num.intValue(), 0, 0, 8);
        if (str != null) {
            tfx.o(tfxVar, "start_from", str, 0, 0, 12);
        }
        return tfxVar;
    }

    default tfx d(List list, String str, List list2, String str2, NewsfeedGetFeedConnectionTypeDto newsfeedGetFeedConnectionTypeDto, String str3, String str4, Boolean bool, NewsfeedGetFeedIntentDto newsfeedGetFeedIntentDto, String str5, Long l, String str6, String str7, String str8, String str9) {
        ArrayList arrayList;
        tfx tfxVar = new tfx("newsfeed.getFeed", new hr(25), new az60(0));
        if (list != null) {
            List list3 = list;
            arrayList = new ArrayList(c5g.u(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(((NewsfeedGetFeedFiltersDto) it.next()).i());
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            tfxVar.i("filters", arrayList);
        }
        if (str != null) {
            tfx.o(tfxVar, "start_from", str, 0, 0, 12);
        }
        if (list2 != null) {
            tfxVar.i("fields", list2);
        }
        if (str2 != null) {
            tfx.o(tfxVar, "device_info", str2, 0, 0, 12);
        }
        if (newsfeedGetFeedConnectionTypeDto != null) {
            tfx.o(tfxVar, "connection_type", newsfeedGetFeedConnectionTypeDto.i(), 0, 0, 12);
        }
        tfx.o(tfxVar, "connection_subtype", str3, 0, 0, 12);
        if (str4 != null) {
            tfx.o(tfxVar, "user_options", str4, 0, 0, 12);
        }
        if (bool != null) {
            tfxVar.j("has_cached_items", bool.booleanValue());
        }
        if (newsfeedGetFeedIntentDto != null) {
            tfx.o(tfxVar, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, newsfeedGetFeedIntentDto.i(), 0, 0, 12);
        }
        if (str5 != null) {
            tfx.o(tfxVar, "geo_data", str5, 0, 0, 12);
        }
        tfx.m(tfxVar, CommonUrlParts.REQUEST_ID, l.longValue(), 0L, 12);
        if (str6 != null) {
            tfx.o(tfxVar, "source_ids", str6, 0, 0, 12);
        }
        if (str7 != null) {
            tfx.o(tfxVar, "section", str7, 0, 0, 12);
        }
        if (str8 != null) {
            tfx.o(tfxVar, "forced_feed_type", str8, 0, 0, 12);
        }
        if (str9 != null) {
            tfx.o(tfxVar, "feed_type", str9, 0, 0, 12);
        }
        return tfxVar;
    }

    default tfx e(UserId userId, Integer num, String str, Integer num2, String str2, String str3) {
        tfx tfxVar = new tfx("newsfeed.hideFeedback", new er(26), new fr(27));
        if (userId != null) {
            tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        }
        if (num != null) {
            tfx.l(tfxVar, "post_id", num.intValue(), 1, 0, 8);
        }
        if (str != null) {
            tfx.o(tfxVar, "track_code", str, 0, 0, 12);
        }
        tfx.l(tfxVar, X3.i.L, num2.intValue(), 0, 0, 8);
        if (str2 != null) {
            tfx.o(tfxVar, "news_item_type", str2, 0, 0, 12);
        }
        if (str3 != null) {
            tfx.o(tfxVar, "feedback_track_code", str3, 0, 0, 12);
        }
        return tfxVar;
    }

    default tfx i(UserId userId, Integer num, String str, Integer num2, String str2, Integer num3, Integer num4, String str3, String str4) {
        tfx tfxVar = new tfx("newsfeed.sendFeedback", new defpackage.j0(28), new or(25));
        if (userId != null) {
            tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        }
        if (num != null) {
            tfx.l(tfxVar, "post_id", num.intValue(), 1, 0, 8);
        }
        if (str != null) {
            tfx.o(tfxVar, "track_code", str, 0, 0, 12);
        }
        tfx.l(tfxVar, X3.i.L, num2.intValue(), 0, 0, 8);
        if (str2 != null) {
            tfx.o(tfxVar, "answer_id", str2, 0, 0, 12);
        }
        if (num3 != null) {
            tfxVar.f(num3.intValue(), 0, 5, "stars");
        }
        if (num4 != null) {
            tfxVar.f(num4.intValue(), 2, 5, "stars_count");
        }
        if (str3 != null) {
            tfx.o(tfxVar, "news_item_type", str3, 0, 0, 12);
        }
        if (str4 != null) {
            tfx.o(tfxVar, "feedback_track_code", str4, 0, 0, 12);
        }
        return tfxVar;
    }

    default tfx j(List list, List list2, String str, String str2, NewsfeedAddBanTypeDto newsfeedAddBanTypeDto) {
        tfx tfxVar = new tfx("newsfeed.addBan", new zy60(0), new wd10(5));
        if (list != null) {
            tfx.p(tfxVar, "user_ids", list, 1L, 8);
        }
        if (list2 != null) {
            tfx.p(tfxVar, "group_ids", list2, 1L, 8);
        }
        if (str != null) {
            tfx.o(tfxVar, "ref", str, 0, 0, 12);
        }
        if (str2 != null) {
            tfx.o(tfxVar, "track_code", str2, 0, 0, 12);
        }
        if (newsfeedAddBanTypeDto != null) {
            tfx.o(tfxVar, "type", newsfeedAddBanTypeDto.i(), 0, 0, 12);
        }
        return tfxVar;
    }
}
