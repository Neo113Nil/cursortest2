package xsna;

import android.text.TextUtils;
import com.huawei.hms.common.data.DataBufferUtils;
import com.vk.api.generated.base.dto.BaseUserGroupFieldsDto;
import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedGetFeedConnectionTypeDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedGetFeedFiltersDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedGetFeedIntentDto;
import com.vk.core.utils.newtork.NetworkState;
import com.vk.newsfeed.api.data.NewsfeedGetResponse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import org.json.JSONObject;

/* compiled from: CodegenFeedDataSource.kt */
/* loaded from: classes4.dex */
public final class xzf implements yxq {
    public final bpn0 b;
    public final Object c = msy.a(LazyThreadSafetyMode.NONE, new t61(15));

    public xzf(bpn0 bpn0Var) {
        this.b = bpn0Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01d6  */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.yxq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final io.reactivex.rxjava3.core.x<NewsfeedGetResponse> g(iw60 iw60Var) {
        List list;
        NewsfeedGetFeedIntentDto newsfeedGetFeedIntentDto;
        int i;
        int i2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        NewsfeedGetFeedConnectionTypeDto newsfeedGetFeedConnectionTypeDto;
        String str6;
        boolean z = iw60Var.d;
        String g = gcd0.g(iw60Var.a);
        bm01 bm01Var = new bm01(this.b);
        cz60 cz60Var = (cz60) this.c.getValue();
        int i3 = iw60Var.c;
        if (i3 == -5) {
            list = Collections.singletonList(NewsfeedGetFeedFiltersDto.VIDEO);
        } else if (i3 != -4) {
            ArrayList o = e43.o(NewsfeedGetFeedFiltersDto.POST, NewsfeedGetFeedFiltersDto.PHOTO, NewsfeedGetFeedFiltersDto.PHOTO_TAG, NewsfeedGetFeedFiltersDto.PROMO_BUTTON, NewsfeedGetFeedFiltersDto.ADS_APP, NewsfeedGetFeedFiltersDto.ADS_SITE, NewsfeedGetFeedFiltersDto.ADS_POST, NewsfeedGetFeedFiltersDto.ADS_APP_SLIDER, NewsfeedGetFeedFiltersDto.ADS_SITE_SLIDER, NewsfeedGetFeedFiltersDto.ADS_APP_VIDEO, NewsfeedGetFeedFiltersDto.ADS_POST_PRETTY_CARDS, NewsfeedGetFeedFiltersDto.ADS_POST_SNIPPET_VIDEO);
            if (!TextUtils.isEmpty(hd60.a().a().m())) {
                o.add(NewsfeedGetFeedFiltersDto.ADS_APPLOVIN);
            }
            list = o;
            if (hd60.a().a1()) {
                list = j5g.u0(o, Collections.singletonList(NewsfeedGetFeedFiltersDto.ADS_DISABLED));
            }
        } else {
            list = e43.l(NewsfeedGetFeedFiltersDto.PHOTO, NewsfeedGetFeedFiltersDto.PHOTO_TAG, NewsfeedGetFeedFiltersDto.WALL_PHOTO);
        }
        List l = e43.l(BaseUserGroupFieldsDto.VIDEO_FILES.i(), GroupsFieldsDto.TRUST_MARK.k(), jy2.a);
        String str7 = iw60Var.e;
        String b = com.vk.core.utils.newtork.b.c().b();
        NewsfeedGetFeedConnectionTypeDto newsfeedGetFeedConnectionTypeDto2 = b.equals(NetworkState.ConnectionType.MOBILE.h()) ? NewsfeedGetFeedConnectionTypeDto.MOBILE : b.equals(NetworkState.ConnectionType.WIFI.h()) ? NewsfeedGetFeedConnectionTypeDto.WIFI : b.equals(NetworkState.ConnectionType.UNKNOWN.h()) ? NewsfeedGetFeedConnectionTypeDto.UNKNOWN : b.equals(NetworkState.ConnectionType.ETHERNET.h()) ? NewsfeedGetFeedConnectionTypeDto.ETHERNET : b.equals(NetworkState.ConnectionType.OTHER.h()) ? NewsfeedGetFeedConnectionTypeDto.OTHER : NewsfeedGetFeedConnectionTypeDto.OTHER;
        String a = com.vk.core.utils.newtork.b.c().a();
        String e = zeq0.e();
        List list2 = list;
        NewsfeedGetFeedConnectionTypeDto newsfeedGetFeedConnectionTypeDto3 = newsfeedGetFeedConnectionTypeDto2;
        Boolean bool = iw60Var.k;
        String str8 = iw60Var.i;
        ce60 ce60Var = ce60.b;
        ce60Var.getClass();
        if (ce60.o.compareAndSet(true, false)) {
            newsfeedGetFeedIntentDto = NewsfeedGetFeedIntentDto.INITIAL;
        } else {
            if (str8 != null) {
                switch (str8.hashCode()) {
                    case -934641255:
                        if (str8.equals("reload")) {
                            newsfeedGetFeedIntentDto = NewsfeedGetFeedIntentDto.RELOAD;
                            break;
                        }
                        break;
                    case -318476791:
                        if (str8.equals("preload")) {
                            newsfeedGetFeedIntentDto = NewsfeedGetFeedIntentDto.PRELOAD;
                            break;
                        }
                        break;
                    case 111342:
                        if (str8.equals("ptr")) {
                            newsfeedGetFeedIntentDto = NewsfeedGetFeedIntentDto.PTR;
                            break;
                        }
                        break;
                    case 97696046:
                        if (str8.equals("fresh")) {
                            newsfeedGetFeedIntentDto = NewsfeedGetFeedIntentDto.FRESH;
                            break;
                        }
                        break;
                    case 1217097819:
                        if (str8.equals(DataBufferUtils.NEXT_PAGE)) {
                            newsfeedGetFeedIntentDto = NewsfeedGetFeedIntentDto.NEXT_PAGE;
                            break;
                        }
                        break;
                    case 1948342084:
                        if (str8.equals("initial")) {
                            newsfeedGetFeedIntentDto = NewsfeedGetFeedIntentDto.INITIAL;
                            break;
                        }
                        break;
                }
            }
            newsfeedGetFeedIntentDto = NewsfeedGetFeedIntentDto.NEXT_PAGE;
        }
        JSONObject jSONObject = iw60Var.j;
        String jSONObject2 = jSONObject != null ? jSONObject.toString() : null;
        Long valueOf = Long.valueOf(iw60Var.f);
        String str9 = "list";
        String str10 = "friends,following";
        if (i3 == -2) {
            i = -4;
        } else {
            i = -4;
            if (i3 != -4) {
                str10 = i3 > 0 ? lhg.a(i3, "list") : null;
            }
        }
        if (i3 == -2) {
            str9 = "friends";
        } else {
            if (i3 != i) {
                i2 = -5;
                if (i3 == -5) {
                    str9 = "videos";
                } else if (i3 == 0) {
                    str9 = "news";
                } else if (i3 <= 0) {
                    str9 = null;
                }
                str = "top";
                if (i3 != 0 || ((!TextUtils.isEmpty(g) && !TextUtils.equals(g, "0")) || !ce60Var.e())) {
                    str2 = "top";
                    str = null;
                } else if (z) {
                    str2 = "top";
                    str = "recent";
                } else {
                    str2 = "top";
                }
                if (i3 != 0 || TextUtils.isEmpty(g) || TextUtils.equals(g, "0")) {
                    str3 = str9;
                    str4 = str7;
                    newsfeedGetFeedConnectionTypeDto = newsfeedGetFeedConnectionTypeDto3;
                    str6 = str10;
                    str5 = null;
                } else if (z) {
                    str3 = str9;
                    str4 = str7;
                    str5 = "recent";
                    newsfeedGetFeedConnectionTypeDto = newsfeedGetFeedConnectionTypeDto3;
                    str6 = str10;
                } else {
                    str5 = str2;
                    newsfeedGetFeedConnectionTypeDto = newsfeedGetFeedConnectionTypeDto3;
                    str6 = str10;
                    str3 = str9;
                    str4 = str7;
                }
                dz2 x = yfb.x(cz60Var.d(list2, g, l, str4, newsfeedGetFeedConnectionTypeDto, a, e, bool, newsfeedGetFeedIntentDto, jSONObject2, valueOf, str6, str3, str, str5));
                if (i3 == i2) {
                    x.g(1, "extended");
                }
                return rsg0.w0(x).l(new nm3(new wzf(bm01Var, 0), 8));
            }
            str9 = "photos";
        }
        i2 = -5;
        str = "top";
        if (i3 != 0) {
            if (z) {
            }
            if (i3 != 0) {
                if (z) {
                }
                dz2 x2 = yfb.x(cz60Var.d(list2, g, l, str4, newsfeedGetFeedConnectionTypeDto, a, e, bool, newsfeedGetFeedIntentDto, jSONObject2, valueOf, str6, str3, str, str5));
                if (i3 == i2) {
                }
                return rsg0.w0(x2).l(new nm3(new wzf(bm01Var, 0), 8));
            }
            str3 = str9;
            str4 = str7;
            newsfeedGetFeedConnectionTypeDto = newsfeedGetFeedConnectionTypeDto3;
            str6 = str10;
            str5 = null;
            dz2 x22 = yfb.x(cz60Var.d(list2, g, l, str4, newsfeedGetFeedConnectionTypeDto, a, e, bool, newsfeedGetFeedIntentDto, jSONObject2, valueOf, str6, str3, str, str5));
            if (i3 == i2) {
            }
            return rsg0.w0(x22).l(new nm3(new wzf(bm01Var, 0), 8));
        }
        str2 = "top";
        str = null;
        if (i3 != 0) {
        }
        str3 = str9;
        str4 = str7;
        newsfeedGetFeedConnectionTypeDto = newsfeedGetFeedConnectionTypeDto3;
        str6 = str10;
        str5 = null;
        dz2 x222 = yfb.x(cz60Var.d(list2, g, l, str4, newsfeedGetFeedConnectionTypeDto, a, e, bool, newsfeedGetFeedIntentDto, jSONObject2, valueOf, str6, str3, str, str5));
        if (i3 == i2) {
        }
        return rsg0.w0(x222).l(new nm3(new wzf(bm01Var, 0), 8));
    }
}
