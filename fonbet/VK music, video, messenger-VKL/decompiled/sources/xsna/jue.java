package xsna;

import com.vk.api.generated.groups.dto.GroupsContentTypesDto;
import com.vk.api.generated.groups.dto.GroupsGetByIdObjectResponseDto;
import com.vk.api.generated.groups.dto.GroupsGetContentForTabsResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.groups.dto.GroupsTabCollectionDto;
import com.vk.api.generated.groups.dto.GroupsTabSettingsDto;
import com.vk.api.generated.groups.dto.GroupsTabSpecialValuesDto;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.profile.core.tabs.ui.clips.Clips;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Pair;
import xsna.ggh;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class jue implements wzs {
    public final /* synthetic */ int b;

    public /* synthetic */ jue(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        Clips.ContentTabCollection contentTabCollection;
        GroupsTabSpecialValuesDto f;
        List<GroupsTabCollectionDto> d;
        Object obj3;
        List<GroupsGroupFullDto> d2;
        GroupsGroupFullDto groupsGroupFullDto;
        List<GroupsTabSettingsDto> E2;
        switch (this.b) {
            case 0:
                return new Pair((e8b0) obj, (xpe) obj2);
            case 1:
                bv6 bv6Var = (bv6) obj;
                GroupsGetByIdObjectResponseDto groupsGetByIdObjectResponseDto = (GroupsGetByIdObjectResponseDto) ((bv6) obj2).a;
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
                        if (it2.hasNext()) {
                            obj3 = it2.next();
                            if (((Clips.ContentTabCollection) obj3).a == Clips.ContentTabCollection.ContentTabCollectionType.SCHEDULED) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    contentTabCollection = (Clips.ContentTabCollection) obj3;
                }
                if (groupsTabSettingsDto != null && (f = groupsTabSettingsDto.f()) != null) {
                    num = f.d();
                }
                return new ggh.a((GroupsGetContentForTabsResponseDto) bv6Var.a, null, null, contentTabCollection, num);
            case 2:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1452417671, intValue, -1, "com.vk.core.compose.component.context.menu.ComposableSingletons$ContextMenuItemKt.lambda$1452417671.<anonymous> (ContextMenuItem.kt:205)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 3:
                f2h0 f2h0Var = (f2h0) obj;
                List<kwz> list2 = ((lwz) obj2).b;
                ArrayList arrayList2 = new ArrayList(list2.size());
                int size = list2.size();
                for (int i = 0; i < size; i++) {
                    arrayList2.add(i2h0.a(list2.get(i), i2h0.B, f2h0Var));
                }
                return arrayList2;
            case 4:
                return Boolean.valueOf(((zux) obj).b instanceof String);
            case 5:
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(427137686, intValue2, -1, "com.vk.core.compose.component.VkDefaultScrollableTabRow.<anonymous>.<anonymous> (VkDefaultTabRow.kt:244)");
                    }
                    if (oq.h(-1138590452, aVar2)) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            default:
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken = VkTypographyToken.DisplayTitle1;
                aVar3.K(839023259);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(839023259, intValue3, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:149)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) aVar3.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.m;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar3.j();
                return frv0Var;
        }
    }
}
