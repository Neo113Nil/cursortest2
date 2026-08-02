package xsna;

import com.vk.api.generated.base.dto.BaseLinkProductDto;
import com.vk.api.generated.base.dto.BaseOwnerButtonActionTargetDto;
import com.vk.api.generated.market.dto.MarketPriceDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.api.generated.tags.dto.TagsGetListResponseDto;
import com.vk.api.generated.tags.dto.TagsObjectTagDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import java.util.ArrayList;
import java.util.List;
import xsna.l1o0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class k1o0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ k1o0(l1o0 l1o0Var, int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String str;
        String i;
        MarketPriceDto k;
        MarketPriceDto k2;
        MarketPriceDto k3;
        TagsGetListResponseDto tagsGetListResponseDto = (TagsGetListResponseDto) obj;
        List<TagsObjectTagDto> d = tagsGetListResponseDto.d();
        ArrayList arrayList = new ArrayList(c5g.u(d, 10));
        for (TagsObjectTagDto tagsObjectTagDto : d) {
            long g = tagsObjectTagDto.g();
            UserId q = tagsObjectTagDto.q();
            String title = tagsObjectTagDto.f().getTitle();
            String str2 = title == null ? "" : title;
            BaseLinkProductDto l = tagsObjectTagDto.f().l();
            String j = (l == null || (k3 = l.k()) == null) ? null : k3.j();
            BaseLinkProductDto l2 = tagsObjectTagDto.f().l();
            String l3 = (l2 == null || (k2 = l2.k()) == null) ? null : k2.l();
            BaseLinkProductDto l4 = tagsObjectTagDto.f().l();
            if (l4 == null || (k = l4.k()) == null || (str = k.n()) == null) {
                str = "";
            }
            PhotosPhotoDto i2 = tagsObjectTagDto.f().i();
            Photo a = i2 != null ? xfa0.a(i2) : null;
            String url = tagsObjectTagDto.f().getUrl();
            BaseOwnerButtonActionTargetDto p = tagsObjectTagDto.f().p();
            String str3 = (p == null || (i = p.i()) == null) ? "" : i;
            BaseLinkProductDto l5 = tagsObjectTagDto.f().l();
            String d2 = l5 != null ? l5.d() : null;
            Boolean n = tagsObjectTagDto.n();
            boolean z = false;
            boolean booleanValue = n != null ? n.booleanValue() : false;
            Boolean l6 = tagsObjectTagDto.l();
            boolean booleanValue2 = l6 != null ? l6.booleanValue() : false;
            Boolean C = tagsObjectTagDto.f().C();
            if (C != null) {
                z = C.booleanValue();
            }
            arrayList.add(new a210(g, q, str2, j, l3, str, a, booleanValue, booleanValue2, z, url, str3, d2));
        }
        return new l1o0.a(arrayList, tagsGetListResponseDto.d().size() + this.b, tagsGetListResponseDto.d().size() + this.c);
    }
}
