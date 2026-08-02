package xsna;

import com.vk.api.generated.shortVideo.dto.ShortVideoGetRecomResponseDto;
import com.vk.clips.sdk.shared.api.recom.ShortVideoMyTargetMapperTracker;
import com.vk.clips.sdk.shared.paging.PaginationKey;
import java.util.ArrayList;
import xsna.g0f;

/* compiled from: ClipsRecomResponseAdapter.kt */
/* loaded from: classes17.dex */
public final class i0f {
    public static final qih0 a(ShortVideoGetRecomResponseDto shortVideoGetRecomResponseDto, ShortVideoMyTargetMapperTracker shortVideoMyTargetMapperTracker) {
        g0f.a a = h0f.b.a(shortVideoGetRecomResponseDto.f().d(), shortVideoGetRecomResponseDto.k(), shortVideoGetRecomResponseDto.g(), shortVideoGetRecomResponseDto.d(), shortVideoGetRecomResponseDto.e(), shortVideoGetRecomResponseDto.H2(), shortVideoGetRecomResponseDto.i(), shortVideoGetRecomResponseDto.H4(), shortVideoGetRecomResponseDto.j(), shortVideoMyTargetMapperTracker);
        ArrayList arrayList = a.a;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!epx.f(xih0.a((wih0) obj), "0_0")) {
                arrayList2.add(obj);
            }
        }
        int size = shortVideoGetRecomResponseDto.f().d().size();
        int size2 = shortVideoGetRecomResponseDto.f().d().size() - arrayList2.size();
        PaginationKey paginationKey = PaginationKey.LoadedFull.b;
        String e = shortVideoGetRecomResponseDto.f().e();
        return new qih0(arrayList2, size, size2, paginationKey, (e == null || e.length() == 0 || e.equals("null")) ? paginationKey : new PaginationKey.Next(e), null, a.b, a.c);
    }
}
