package xsna;

import com.google.gson.Gson;
import com.vk.api.generated.video.dto.VideoGetAdsResponseDto;
import com.vk.api.generated.video.dto.VideoVideoAdsBannersDto;
import com.vk.api.generated.video.dto.VideoVideoAdsMobileDto;
import com.vk.api.generated.video.dto.VideoVideoAdsOverlayDto;
import com.vk.api.generated.video.dto.VideoVideoAdsSportDto;
import com.vk.api.generated.video.dto.VideoVideoAdsSportSectionDto;
import com.vk.api.generated.video.dto.VideoVideoAdsSportSectionsDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class q11 implements izs {
    public final /* synthetic */ x11 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ long e;

    public /* synthetic */ q11(x11 x11Var, String str, String str2, long j) {
        this.b = x11Var;
        this.c = str;
        this.d = str2;
        this.e = j;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String str;
        ArrayList arrayList;
        List list;
        List<VideoVideoAdsOverlayDto> d;
        VideoVideoAdsSportSectionsDto d2;
        List<VideoVideoAdsSportSectionDto> d3;
        VideoVideoAdsSportSectionDto videoVideoAdsSportSectionDto;
        VideoGetAdsResponseDto videoGetAdsResponseDto = (VideoGetAdsResponseDto) obj;
        Long valueOf = Long.valueOf(this.e);
        VideoVideoAdsMobileDto e = videoGetAdsResponseDto.e();
        x11 x11Var = this.b;
        String json = ((Gson) x11Var.e.getValue()).toJson(e);
        VideoVideoAdsSportDto f = videoGetAdsResponseDto.f();
        if (f == null || (d2 = f.d()) == null || (d3 = d2.d()) == null || (videoVideoAdsSportSectionDto = (VideoVideoAdsSportSectionDto) j5g.a0(d3)) == null || (str = videoVideoAdsSportSectionDto.getUrl()) == null) {
            str = "";
        }
        String str2 = str;
        VideoVideoAdsBannersDto d4 = videoGetAdsResponseDto.d();
        if (((Boolean) x11Var.d.getValue()).booleanValue()) {
            if (d4 == null || (d = d4.d()) == null) {
                arrayList = null;
            } else {
                List<VideoVideoAdsOverlayDto> list2 = d;
                arrayList = new ArrayList(c5g.u(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(new d290(((VideoVideoAdsOverlayDto) it.next()).d(), r2.e() * 1000));
                }
            }
            list = arrayList == null ? EmptyList.b : arrayList;
        } else {
            list = EmptyList.b;
        }
        return new a21(this.c, this.d, valueOf, json, str2, list);
    }
}
