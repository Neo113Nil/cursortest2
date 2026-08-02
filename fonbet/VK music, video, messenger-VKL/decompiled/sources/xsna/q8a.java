package xsna;

import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.catalog.dto.CatalogBackgroundDto;
import com.vk.api.generated.catalog.dto.CatalogBadgeDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogLinkDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogLinkMetaDto;
import com.vk.catalog2.common.dto.api.ContentType;
import com.vk.catalog2.common.dto.api.Meta;
import com.vk.catalog2.common.dto.api.badge.CatalogBadge;
import com.vk.catalog2.common.dto.api.link.CatalogLink;
import com.vk.catalog2.common.dto.api.link.CatalogLinkImageStyle;
import com.vk.dto.common.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.gl.tf.Tensorflow;

/* compiled from: CatalogLinkToCatalogLinkMapper.kt */
/* loaded from: classes16.dex */
public final class q8a {
    public static CatalogLink a(CatalogCatalogLinkDto catalogCatalogLinkDto) {
        Meta meta;
        CatalogBadge catalogBadge;
        new ne6();
        String id = catalogCatalogLinkDto.getId();
        String str = id == null ? "" : id;
        String title = catalogCatalogLinkDto.getTitle();
        String str2 = title == null ? "" : title;
        String n = catalogCatalogLinkDto.n();
        String str3 = n == null ? "" : n;
        String url = catalogCatalogLinkDto.getUrl();
        String str4 = url == null ? "" : url;
        List<BaseImageDto> i = catalogCatalogLinkDto.i();
        Image a = i != null ? ne6.a(i) : Image.d;
        CatalogCatalogLinkMetaDto l = catalogCatalogLinkDto.l();
        ArrayList arrayList = null;
        if (l != null) {
            String r = l.r();
            String str5 = r == null ? "" : r;
            ContentType.a aVar = ContentType.Companion;
            CatalogCatalogLinkMetaDto.ContentTypeDto d = l.d();
            String i2 = d != null ? d.i() : null;
            aVar.getClass();
            ContentType a2 = ContentType.a.a(i2);
            Boolean e = l.e();
            meta = new Meta(null, a2, str5, null, null, null, e != null ? e.booleanValue() : false, null, null, null, Tensorflow.FRAME_HEIGHT, null);
        } else {
            meta = null;
        }
        CatalogBadgeDto g = catalogCatalogLinkDto.g();
        if (g != null) {
            String d2 = g.d();
            catalogBadge = new CatalogBadge(d2 != null ? d2 : "", g.e().i());
        } else {
            catalogBadge = null;
        }
        Boolean o = catalogCatalogLinkDto.o();
        boolean booleanValue = o != null ? o.booleanValue() : false;
        CatalogLinkImageStyle.a aVar2 = CatalogLinkImageStyle.Companion;
        CatalogCatalogLinkDto.ImageStyleDto j = catalogCatalogLinkDto.j();
        String i3 = j != null ? j.i() : null;
        aVar2.getClass();
        CatalogLinkImageStyle a3 = CatalogLinkImageStyle.a.a(i3);
        String e2 = catalogCatalogLinkDto.e();
        CatalogBackgroundDto f = catalogCatalogLinkDto.f();
        List<List<BaseImageDto>> k = catalogCatalogLinkDto.k();
        if (k != null) {
            List<List<BaseImageDto>> list = k;
            arrayList = new ArrayList(c5g.u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(ne6.a((List) it.next()));
            }
        }
        return new CatalogLink(str, str2, str3, str4, a, meta, catalogBadge, booleanValue, a3, e2, f, catalogCatalogLinkDto.d(), arrayList);
    }
}
