package xsna;

import com.huawei.hms.support.api.entity.core.CommonCode;
import com.vk.api.generated.base.dto.BaseUserGroupFieldsDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedGetCustomConnectionTypeDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedGetCustomIntentDto;
import com.vk.core.serialize.Serializer;
import com.vk.newsfeed.api.data.discover.NewsEntriesContainer;
import com.vk.newsfeed.domain.model.DiscoverCustomIntent;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: NewsfeedCustomGetRequest.kt */
/* loaded from: classes4.dex */
public final class kf60 {
    public final String a;
    public final String b;
    public final String c;
    public final DiscoverCustomIntent d;
    public final Integer e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public Long k;
    public awq l = new zvq();

    public kf60(String str, String str2, String str3, DiscoverCustomIntent discoverCustomIntent, Integer num) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = discoverCustomIntent;
        this.e = num;
    }

    public final hz2 a() {
        Object obj;
        NewsfeedGetCustomIntentDto newsfeedGetCustomIntentDto;
        tfx tfxVar;
        Long l;
        String str;
        ArrayList arrayList;
        NewsfeedGetCustomIntentDto newsfeedGetCustomIntentDto2;
        xuo0.a.getClass();
        final long a = xuo0.a();
        izs izsVar = new izs() { // from class: xsna.jf60
            @Override // xsna.izs
            public final Object invoke(Object obj2) {
                NewsEntriesContainer.NewsPageCacheConfig newsPageCacheConfig;
                JSONObject optJSONObject = ((JSONObject) obj2).optJSONObject("response");
                if (optJSONObject == null) {
                    throw new NullPointerException("response is null");
                }
                kf60 kf60Var = kf60.this;
                kf60Var.l.g();
                String a2 = cqm0.a(optJSONObject.optString("next_from"));
                String optString = optJSONObject.optString("news_custom_title");
                String optString2 = optJSONObject.optString("referer", kf60Var.c);
                String str2 = kf60Var.b;
                String str3 = kf60Var.a;
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("cache_config");
                if (optJSONObject2 != null) {
                    Serializer.c<NewsEntriesContainer.NewsPageCacheConfig> cVar = NewsEntriesContainer.NewsPageCacheConfig.CREATOR;
                    newsPageCacheConfig = NewsEntriesContainer.NewsPageCacheConfig.a.a(optJSONObject2);
                } else {
                    newsPageCacheConfig = null;
                }
                NewsEntriesContainer newsEntriesContainer = new NewsEntriesContainer(new NewsEntriesContainer.Info(a2, optString, str2, optString2, 0L, false, 0L, 0L, a, 0L, str3, newsPageCacheConfig, 752, null), null, 2, null);
                com.vk.dto.newsfeed.a.b(optJSONObject, null, newsEntriesContainer.c, new qus(kf60Var.l), 2);
                kf60Var.l.c();
                return newsEntriesContainer;
            }
        };
        String str2 = this.f;
        List O0 = str2 != null ? j5g.O0(drm0.c0(str2, new String[]{StringUtils.COMMA}, 0, 6)) : null;
        String str3 = this.h;
        Iterator<E> it = NewsfeedGetCustomConnectionTypeDto.i().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (epx.f(((NewsfeedGetCustomConnectionTypeDto) obj).j(), com.vk.core.utils.newtork.b.c().b())) {
                break;
            }
        }
        NewsfeedGetCustomConnectionTypeDto newsfeedGetCustomConnectionTypeDto = (NewsfeedGetCustomConnectionTypeDto) obj;
        String a2 = com.vk.core.utils.newtork.b.c().a();
        String str4 = this.g;
        DiscoverCustomIntent discoverCustomIntent = this.d;
        if (discoverCustomIntent != null) {
            int i = lf60.$EnumSwitchMapping$0[discoverCustomIntent.ordinal()];
            if (i == 1) {
                newsfeedGetCustomIntentDto2 = NewsfeedGetCustomIntentDto.PRELOAD;
            } else if (i == 2) {
                newsfeedGetCustomIntentDto2 = NewsfeedGetCustomIntentDto.INITIAL;
            } else if (i == 3) {
                newsfeedGetCustomIntentDto2 = NewsfeedGetCustomIntentDto.PTR;
            } else if (i == 4) {
                newsfeedGetCustomIntentDto2 = NewsfeedGetCustomIntentDto.NEXT_PAGE;
            } else {
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                newsfeedGetCustomIntentDto2 = NewsfeedGetCustomIntentDto.FEED_BLOCK;
            }
            newsfeedGetCustomIntentDto = newsfeedGetCustomIntentDto2;
        } else {
            newsfeedGetCustomIntentDto = null;
        }
        List<BaseUserGroupFieldsDto> list = gw60.a;
        String str5 = this.i;
        Long l2 = this.k;
        String str6 = this.j;
        tfx tfxVar2 = new tfx("newsfeed.getCustom", new bz60(0), new lr(25));
        tfx.o(tfxVar2, "feed_id", this.b, 0, 0, 12);
        Integer num = this.e;
        if (num != null) {
            tfxVar2.f(num.intValue(), 0, 50, "count");
        }
        String str7 = this.a;
        if (str7 != null) {
            tfx.o(tfxVar2, "start_from", str7, 0, 0, 12);
        }
        if (O0 != null) {
            tfxVar2.i("filters", O0);
        }
        if (str3 != null) {
            l = l2;
            str = str6;
            tfx.o(tfxVar2, "device_info", str3, 0, 0, 12);
            tfxVar = tfxVar2;
        } else {
            tfxVar = tfxVar2;
            l = l2;
            str = str6;
        }
        if (newsfeedGetCustomConnectionTypeDto != null) {
            tfx.o(tfxVar, "connection_type", newsfeedGetCustomConnectionTypeDto.j(), 0, 0, 12);
        }
        tfx.o(tfxVar, "connection_subtype", a2, 0, 0, 12);
        if (str4 != null) {
            tfx.o(tfxVar, "user_options", str4, 0, 0, 12);
        }
        if (newsfeedGetCustomIntentDto != null) {
            tfx.o(tfxVar, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, newsfeedGetCustomIntentDto.i(), 0, 0, 12);
        }
        tfx tfxVar3 = tfxVar;
        if (list != null) {
            List<BaseUserGroupFieldsDto> list2 = list;
            ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((BaseUserGroupFieldsDto) it2.next()).i());
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            tfxVar3.i("fields", arrayList);
        }
        if (str5 != null) {
            tfx.o(tfxVar3, "track_code", str5, 0, 0, 12);
        }
        if (l != null) {
            tfx.m(tfxVar3, CommonUrlParts.REQUEST_ID, l.longValue(), 0L, 12);
        }
        if (str != null) {
            tfx.o(tfxVar3, "geo_data", str, 0, 0, 12);
        }
        tfxVar3.j("extended", true);
        return yfb.z(tfxVar3, izsVar);
    }
}
