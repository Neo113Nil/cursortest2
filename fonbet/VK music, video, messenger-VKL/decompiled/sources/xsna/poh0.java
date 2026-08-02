package xsna;

import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.catalog2.common.dto.api.section.CatalogSection;
import com.vk.core.serialize.Serializer;
import com.vk.dto.group.Group;
import com.vk.dto.group.GroupCatalogItem;
import com.vk.geo.api.data.GeoStaticPreviewInput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: SearchCommunitiesOnMapGeoDataSource.kt */
/* loaded from: classes5.dex */
public final class poh0 implements izs<hda, Pair<? extends List<? extends GeoStaticPreviewInput.Item>, ? extends Map<Long, ? extends Group>>> {
    public final /* synthetic */ double b;
    public final /* synthetic */ double c;
    public final /* synthetic */ double d;
    public final /* synthetic */ double e;

    public poh0(com.vk.search.communities.map.impl.ui.map.d dVar, double d, double d2, double d3, double d4) {
        this.b = d;
        this.c = d2;
        this.d = d3;
        this.e = d4;
    }

    @Override // xsna.izs
    public final Pair<? extends List<? extends GeoStaticPreviewInput.Item>, ? extends Map<Long, ? extends Group>> invoke(hda hdaVar) {
        Object obj;
        hda hdaVar2 = hdaVar;
        Iterator<T> it = ((CatalogSection) hdaVar2.a).i.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((CatalogBlock) obj).c == CatalogDataType.DATA_TYPE_GROUPS_ITEMS) {
                break;
            }
        }
        CatalogBlock catalogBlock = (CatalogBlock) obj;
        if (catalogBlock == null) {
            return new Pair<>(EmptyList.b, jgp.b);
        }
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = catalogBlock.Gb(hdaVar2.b).iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            Group group = next instanceof Group ? (Group) next : null;
            if (group != null) {
                Object zb = catalogBlock.m.zb(group.c);
                GroupCatalogItem groupCatalogItem = zb instanceof GroupCatalogItem ? (GroupCatalogItem) zb : null;
                if (groupCatalogItem != null) {
                    long j = groupCatalogItem.b;
                    group.O = groupCatalogItem.e;
                    double d = groupCatalogItem.h;
                    if (d >= this.d && d <= this.b) {
                        double d2 = groupCatalogItem.i;
                        if (d2 >= this.c && d2 <= this.e) {
                            Serializer.c<GroupCatalogItem> cVar = GroupCatalogItem.CREATOR;
                            float f = (float) d2;
                            StringBuilder sb = new StringBuilder();
                            sb.append(j);
                            sb.append('_');
                            sb.append((float) d);
                            sb.append('_');
                            sb.append(f);
                            String sb2 = sb.toString();
                            String str = group.d;
                            if (str == null) {
                                str = "";
                            }
                            String str2 = str;
                            double d3 = groupCatalogItem.h;
                            double d4 = groupCatalogItem.i;
                            LinkedHashMap linkedHashMap2 = linkedHashMap;
                            double d5 = groupCatalogItem.j;
                            Double valueOf = Double.valueOf(d5);
                            if (Double.isNaN(d5)) {
                                valueOf = null;
                            }
                            arrayList.add(new GeoStaticPreviewInput.Item(sb2, str2, d3, d4, valueOf != null ? valueOf.doubleValue() : ConnectivityTracker.DEFAULT_UPLINK_BITRATE, group.e));
                            linkedHashMap = linkedHashMap2;
                            linkedHashMap.put(Long.valueOf(j), group);
                        }
                    }
                }
            }
        }
        return new Pair<>(arrayList, linkedHashMap);
    }
}
