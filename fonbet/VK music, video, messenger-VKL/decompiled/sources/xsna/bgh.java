package xsna;

import com.vk.api.generated.groups.dto.GroupsContentTypesDto;
import com.vk.api.generated.groups.dto.GroupsGetByIdObjectResponseDto;
import com.vk.api.generated.groups.dto.GroupsGetContentForTabsResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.groups.dto.GroupsTabCollectionDto;
import com.vk.api.generated.groups.dto.GroupsTabSettingsDto;
import com.vk.api.generated.groups.dto.GroupsTabSpecialValuesDto;
import com.vk.profile.core.tabs.ui.clips.Clips;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import xsna.ggh;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class bgh implements zzs {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.zzs
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        Clips.ContentTabCollection contentTabCollection;
        GroupsTabSpecialValuesDto f;
        List<GroupsTabCollectionDto> d;
        Object obj5;
        List<GroupsGroupFullDto> d2;
        GroupsGroupFullDto groupsGroupFullDto;
        List<GroupsTabSettingsDto> E2;
        it80 it80Var = (it80) obj;
        it80 it80Var2 = (it80) obj2;
        it80 it80Var3 = (it80) obj4;
        GroupsGetByIdObjectResponseDto groupsGetByIdObjectResponseDto = (GroupsGetByIdObjectResponseDto) ((it80) obj3).a;
        Integer num = null;
        if (groupsGetByIdObjectResponseDto != null && (d2 = groupsGetByIdObjectResponseDto.d()) != null && (groupsGroupFullDto = (GroupsGroupFullDto) j5g.Y(d2)) != null && (E2 = groupsGroupFullDto.E2()) != null) {
            for (GroupsTabSettingsDto groupsTabSettingsDto : E2) {
                if (groupsTabSettingsDto.e() == GroupsContentTypesDto.SHORT_VIDEOS) {
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        groupsTabSettingsDto = null;
        if (groupsTabSettingsDto == null || (d = groupsTabSettingsDto.d()) == null) {
            contentTabCollection = null;
        } else {
            List<GroupsTabCollectionDto> list = d;
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Clips.a.a((GroupsTabCollectionDto) it.next()));
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj5 = null;
                    break;
                }
                obj5 = it2.next();
                if (((Clips.ContentTabCollection) obj5).a == Clips.ContentTabCollection.ContentTabCollectionType.SCHEDULED) {
                    break;
                }
            }
            contentTabCollection = (Clips.ContentTabCollection) obj5;
        }
        if (groupsTabSettingsDto != null && (f = groupsTabSettingsDto.f()) != null) {
            num = f.d();
        }
        return new ggh.a((GroupsGetContentForTabsResponseDto) it80Var.a, (GroupsGetContentForTabsResponseDto) it80Var2.a, (gud) it80Var3.a, contentTabCollection, num);
    }
}
