package xsna;

import com.vk.api.generated.market.dto.MarketMarketAlbumDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;

/* compiled from: CommunityProfilePriorityBlockGoodsAlbumModel.kt */
/* loaded from: classes5.dex */
public final class lsh {
    public final MarketMarketAlbumDto a;
    public final boolean b;
    public final int c;
    public final UserId d;
    public final String e;
    public final int f;
    public final Photo g;

    public lsh(MarketMarketAlbumDto marketMarketAlbumDto, boolean z) {
        this.a = marketMarketAlbumDto;
        this.b = z;
        this.c = marketMarketAlbumDto.getId();
        this.d = marketMarketAlbumDto.q();
        this.e = marketMarketAlbumDto.getTitle();
        this.f = marketMarketAlbumDto.getCount();
        PhotosPhotoDto e = marketMarketAlbumDto.e();
        this.g = e != null ? xfa0.a(e) : null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lsh)) {
            return false;
        }
        lsh lshVar = (lsh) obj;
        return epx.f(this.a, lshVar.a) && this.b == lshVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityProfilePriorityBlockGoodsAlbumModel(album=");
        sb.append(this.a);
        sb.append(", isViewed=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
