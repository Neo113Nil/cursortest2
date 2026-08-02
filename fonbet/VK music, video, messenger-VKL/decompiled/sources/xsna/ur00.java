package xsna;

import com.vk.api.generated.market.dto.MarketMarketAlbumDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.dto.common.GoodAlbum;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MarketAlbumsMapper.kt */
/* loaded from: classes3.dex */
public final class ur00 {
    public static final ArrayList a(List list) {
        List<MarketMarketAlbumDto> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (MarketMarketAlbumDto marketMarketAlbumDto : list2) {
            int id = marketMarketAlbumDto.getId();
            UserId q = marketMarketAlbumDto.q();
            String title = marketMarketAlbumDto.getTitle();
            PhotosPhotoDto e = marketMarketAlbumDto.e();
            Photo a = e != null ? xfa0.a(e) : null;
            int count = marketMarketAlbumDto.getCount();
            int g = marketMarketAlbumDto.g();
            MarketMarketAlbumDto.TypeDto f = marketMarketAlbumDto.f();
            int i = f != null ? f.i() : 0;
            Boolean j = marketMarketAlbumDto.j();
            Boolean bool = Boolean.TRUE;
            arrayList.add(new GoodAlbum(id, q, title, a, count, g, i, epx.f(j, bool), epx.f(marketMarketAlbumDto.i(), bool)));
        }
        return arrayList;
    }
}
