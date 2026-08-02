package xsna;

import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.catalog.dto.CatalogBlockDto;
import com.vk.api.generated.catalog.dto.CatalogGroupsItemDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.video.impl.channel.AuthorsChannelSliderView$AuthorsChannelState;
import com.vk.catalog.mvi.dto.CatalogExtraResponseObjectDto;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class le5 implements f2a {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object] */
    @Override // xsna.f2a
    public final List a(CatalogExtraResponseObjectDto catalogExtraResponseObjectDto, CatalogBlockDto catalogBlockDto, CatalogBlockVariant catalogBlockVariant) {
        ?? r1;
        boolean z;
        boolean z2;
        String str;
        int i;
        List<CatalogGroupsItemDto> V0 = catalogBlockDto.V0();
        if (V0 != null) {
            r1 = new ArrayList();
            for (CatalogGroupsItemDto catalogGroupsItemDto : V0) {
                List<GroupsGroupFullDto> g = catalogExtraResponseObjectDto.g();
                GroupsGroupFullDto groupsGroupFullDto = null;
                if (g != null) {
                    Iterator it = g.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        ?? next = it.next();
                        if (epx.f(catalogGroupsItemDto.i(), ((GroupsGroupFullDto) next).P0())) {
                            groupsGroupFullDto = next;
                            break;
                        }
                    }
                    groupsGroupFullDto = groupsGroupFullDto;
                }
                if (groupsGroupFullDto != null) {
                    r1.add(groupsGroupFullDto);
                }
            }
        } else {
            r1 = EmptyList.b;
        }
        Iterable<GroupsGroupFullDto> iterable = (Iterable) r1;
        ArrayList arrayList = new ArrayList(c5g.u(iterable, 10));
        for (GroupsGroupFullDto groupsGroupFullDto2 : iterable) {
            UserId e = fkq0.e(groupsGroupFullDto2.P0());
            BlockId.CompositeId c = com.vk.catalog.mvi.block.a.c(catalogBlockDto.getId(), String.valueOf(groupsGroupFullDto2.P0().b));
            String V1 = groupsGroupFullDto2.V1();
            BaseBoolIntDto I3 = groupsGroupFullDto2.I3();
            BaseBoolIntDto baseBoolIntDto = BaseBoolIntDto.YES;
            boolean z3 = true;
            if (I3 == baseBoolIntDto) {
                z = true;
            } else {
                z = true;
                z3 = false;
            }
            String y1 = groupsGroupFullDto2.y1();
            if (y1 == null) {
                y1 = "";
            }
            Integer o1 = groupsGroupFullDto2.o1();
            int intValue = o1 != null ? o1.intValue() : 0;
            if (groupsGroupFullDto2.O2() == baseBoolIntDto) {
                str = y1;
                i = intValue;
                z2 = z;
            } else {
                int i2 = intValue;
                z2 = false;
                str = y1;
                i = i2;
            }
            CatalogBlockVariant catalogBlockVariant2 = catalogBlockVariant;
            arrayList.add(new AuthorsChannelSliderView$AuthorsChannelState(c, catalogBlockVariant2, e, V1, z3, str, i, z2));
            catalogBlockVariant = catalogBlockVariant2;
        }
        return arrayList;
    }
}
