package xsna;

import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import com.vk.api.generated.catalog.dto.CatalogHintDto;
import com.vk.catalog2.common.dto.api.CatalogButton;
import com.vk.catalog2.common.dto.api.hint.CatalogHint;
import com.vk.catalog2.common.dto.api.hint.CatalogHintType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: CatalogHintMapper.kt */
/* loaded from: classes16.dex */
public final class z6a {
    public static CatalogHint a(CatalogHintDto catalogHintDto) {
        ArrayList arrayList;
        new t2a();
        String id = catalogHintDto.getId();
        String str = id == null ? "" : id;
        String title = catalogHintDto.getTitle();
        String str2 = title == null ? "" : title;
        String f = catalogHintDto.f();
        String str3 = f == null ? "" : f;
        CatalogHintType.a aVar = CatalogHintType.Companion;
        String type = catalogHintDto.getType();
        String str4 = type != null ? type : "";
        aVar.getClass();
        CatalogHintType a = CatalogHintType.a.a(str4);
        Boolean g = catalogHintDto.g();
        boolean booleanValue = g != null ? g.booleanValue() : false;
        List<BaseLinkButtonDto> d = catalogHintDto.d();
        if (d != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it = d.iterator();
            while (it.hasNext()) {
                CatalogButton b = t2a.b((BaseLinkButtonDto) it.next());
                if (b != null) {
                    arrayList2.add(b);
                }
            }
            arrayList = p4g.q(arrayList2);
        } else {
            arrayList = new ArrayList();
        }
        return new CatalogHint(str, str2, str3, a, booleanValue, arrayList, catalogHintDto.e());
    }
}
