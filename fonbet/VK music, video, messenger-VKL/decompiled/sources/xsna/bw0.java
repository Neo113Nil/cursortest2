package xsna;

import com.vk.api.generated.ads.dto.AdsChoicesDto;
import com.vk.api.generated.ads.dto.AdsChoicesOptionsDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.video.dto.VideoAdsInfoDto;
import com.vk.dto.common.AdsChoices;
import com.vk.dto.common.AdsChoicesOptions;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoAdInfo;
import com.vk.dto.common.VideoAdsType;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;

/* compiled from: AdsInfoToAdsDataMapper.kt */
/* loaded from: classes3.dex */
public final class bw0 {
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0038, code lost:
    
        if (r7 == null) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static VideoAdInfo a(VideoAdsInfoDto videoAdsInfoDto, Map map) {
        VideoAdsType videoAdsType;
        ArrayList arrayList;
        AdsChoices adsChoices;
        List list;
        String title = videoAdsInfoDto.getTitle();
        String i = videoAdsInfoDto.i();
        String g = videoAdsInfoDto.g();
        UserId o = videoAdsInfoDto.o();
        Owner owner = map != null ? (Owner) map.get(videoAdsInfoDto.o()) : null;
        String k = videoAdsInfoDto.k();
        VideoAdsInfoDto.TypeDto p = videoAdsInfoDto.p();
        if (p != null) {
            VideoAdsType.a aVar = VideoAdsType.Companion;
            String i2 = p.i();
            aVar.getClass();
            videoAdsType = VideoAdsType.a.a(i2);
        }
        videoAdsType = VideoAdsType.UNKNOWN;
        boolean f = epx.f(videoAdsInfoDto.j(), Boolean.TRUE);
        String f2 = videoAdsInfoDto.f();
        String e = videoAdsInfoDto.e();
        VideoAdsInfoDto.PatternDto l = videoAdsInfoDto.l();
        String i3 = l != null ? l.i() : null;
        List<BaseImageDto> n = videoAdsInfoDto.n();
        if (n != null) {
            List<BaseImageDto> list2 = n;
            arrayList = new ArrayList(c5g.u(list2, 10));
            for (BaseImageDto baseImageDto : list2) {
                arrayList.add(new ImageSize(baseImageDto.getUrl(), baseImageDto.getWidth(), baseImageDto.getHeight(), baseImageDto.e(), (char) 0, false, 48, null));
            }
        } else {
            arrayList = null;
        }
        Image image = new Image(arrayList);
        AdsChoicesDto d = videoAdsInfoDto.d();
        if (d != null) {
            String g2 = d.g();
            String d2 = d.d();
            String f3 = d.f();
            String e2 = d.e();
            List<AdsChoicesOptionsDto> i4 = d.i();
            if (i4 != null) {
                List<AdsChoicesOptionsDto> list3 = i4;
                list = new ArrayList(c5g.u(list3, 10));
                for (AdsChoicesOptionsDto adsChoicesOptionsDto : list3) {
                    list.add(new AdsChoicesOptions(adsChoicesOptionsDto.d(), adsChoicesOptionsDto.getType(), adsChoicesOptionsDto.i(), adsChoicesOptionsDto.e(), adsChoicesOptionsDto.j(), adsChoicesOptionsDto.f(), adsChoicesOptionsDto.g()));
                }
            } else {
                list = EmptyList.b;
            }
            adsChoices = new AdsChoices(g2, d2, f3, e2, list);
        } else {
            adsChoices = null;
        }
        return new VideoAdInfo(title, i, g, o, owner, k, videoAdsType, f, f2, e, i3, image, adsChoices);
    }
}
