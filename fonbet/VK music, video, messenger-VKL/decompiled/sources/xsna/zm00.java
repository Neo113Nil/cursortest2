package xsna;

import androidx.core.app.NotificationCompat;
import com.huawei.hms.framework.common.BundleUtil;
import com.vk.api.generated.groups.dto.GroupsGroupTypeDto;
import com.vk.api.generated.video.dto.VideoNavigationDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vkontakte.android.data.groups.FullSourceJoinApi;
import java.util.List;
import org.json.JSONObject;

/* compiled from: MapperExt.kt */
/* loaded from: classes3.dex */
public final class zm00 {

    /* compiled from: MapperExt.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GroupsGroupTypeDto.values().length];
            try {
                iArr[GroupsGroupTypeDto.EVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GroupsGroupTypeDto.GROUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GroupsGroupTypeDto.PAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Image a(String str, String str2, String str3, String str4, String str5) {
        String a2 = cqm0.a(str);
        if (a2 != null) {
            Serializer.c<Image> cVar = Image.CREATOR;
            return Image.b.a(a2);
        }
        List x = rdi.x(rl3.I(new ImageSize[]{e(50, str2), e(100, str3), e(200, str4), e(400, str5)}));
        if (x != null) {
            return new Image((List<ImageSize>) x);
        }
        return null;
    }

    public static /* synthetic */ Image b(int i, String str, String str2, String str3, String str4) {
        if ((i & 8) != 0) {
            str4 = null;
        }
        return a(str, str2, str3, str4, null);
    }

    @ozl
    public static final String c(String str, String str2, String str3, String str4) {
        String a2;
        float b = z230.b.b();
        int i = (b >= 2.0f || z230.a) ? 200 : b > 1.0f ? 100 : 50;
        if (cqm0.a(str) != null && (a2 = js5.a(i, str)) != null) {
            return a2;
        }
        String str5 = i != 50 ? i != 100 ? i != 200 ? null : str4 : str3 : str2;
        String a3 = str5 != null ? cqm0.a(str5) : null;
        return (a3 == null && (a3 = cqm0.a(str4)) == null && (a3 = cqm0.a(str3)) == null) ? str2 : a3;
    }

    public static final int d(GroupsGroupTypeDto groupsGroupTypeDto) {
        int i = groupsGroupTypeDto == null ? -1 : a.$EnumSwitchMapping$0[groupsGroupTypeDto.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 0;
            if (i != 2) {
                return i != 3 ? 0 : 2;
            }
        }
        return i2;
    }

    public static final ImageSize e(int i, String str) {
        String a2 = cqm0.a(str);
        if (a2 == null) {
            return null;
        }
        return new ImageSize(a2, i, i, null, (char) 0, false, 56, null);
    }

    public static final FullSourceJoinApi f(FullSourceJoinApi.EntryServiceType entryServiceType, String str, String str2) {
        String str3;
        String d;
        VideoNavigationDto j = str2 != null ? j(str2) : null;
        String str4 = "";
        if (j == null || (str3 = j.f()) == null) {
            str3 = "";
        }
        if (j != null && (d = j.d()) != null) {
            str4 = d;
        }
        String i = entryServiceType != null ? entryServiceType.i() : null;
        return new FullSourceJoinApi(cqm0.m(str), cqm0.m(str3), cqm0.m("video_discovery"), cqm0.m(str4), i != null ? cqm0.m(i) : null, null);
    }

    public static final String g(boolean z) {
        if (z) {
            return "1";
        }
        return null;
    }

    public static final yxs0 h(String str) {
        String str2 = null;
        if (str == null) {
            return null;
        }
        VideoNavigationDto j = j(str);
        String f = j.f();
        if (f == null || drm0.N(f)) {
            f = null;
        }
        String d = j.d();
        if (d != null && !drm0.N(d)) {
            str2 = d;
        }
        return new yxs0(f, str2);
    }

    public static final boolean i(String str, String str2) {
        return str.equals(str2) || brm0.B(str, str2.concat(BundleUtil.UNDERLINE_TAG), false);
    }

    public static final VideoNavigationDto j(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject(NotificationCompat.CATEGORY_NAVIGATION);
            return new VideoNavigationDto(jSONObject.optString("source_screen"), jSONObject.optString("source_block"), jSONObject.optString("source_prev_screen"));
        } catch (Exception unused) {
            return new VideoNavigationDto(null, null, null, 7, null);
        }
    }
}
