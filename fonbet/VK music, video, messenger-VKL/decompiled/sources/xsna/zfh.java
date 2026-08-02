package xsna;

import android.graphics.Rect;
import com.vk.api.generated.groups.dto.GroupsGetContentForTabsResponseDto;
import com.vk.api.generated.owners.dto.OwnersGetContentTabsResponseDto;
import com.vk.dto.group.GroupContentTabSetting;
import com.vk.dto.group.GroupContentTabType;
import com.vk.profile.core.tabs.ui.clips.Clips;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ggh;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class zfh implements zzs {
    public final /* synthetic */ int b;

    public /* synthetic */ zfh(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.zzs
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        Integer num;
        Object obj5;
        Clips.ContentTabCollection contentTabCollection;
        GroupContentTabSetting.GroupContentTabSpecialValues groupContentTabSpecialValues;
        List<GroupContentTabSetting.GroupContentTabCollection> list;
        Object obj6;
        long j;
        switch (this.b) {
            case 0:
                it80 it80Var = (it80) obj;
                it80 it80Var2 = (it80) obj2;
                it80 it80Var3 = (it80) obj4;
                Iterator it = r3i.c((OwnersGetContentTabsResponseDto) ((it80) obj3).a).iterator();
                while (true) {
                    num = null;
                    if (it.hasNext()) {
                        obj5 = it.next();
                        if (((GroupContentTabSetting) obj5).b == GroupContentTabType.SHORT_VIDEOS) {
                        }
                    } else {
                        obj5 = null;
                    }
                }
                GroupContentTabSetting groupContentTabSetting = (GroupContentTabSetting) obj5;
                if (groupContentTabSetting == null || (list = groupContentTabSetting.g) == null) {
                    contentTabCollection = null;
                } else {
                    List<GroupContentTabSetting.GroupContentTabCollection> list2 = list;
                    ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                    Iterator<T> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(Clips.a.c((GroupContentTabSetting.GroupContentTabCollection) it2.next()));
                    }
                    Iterator it3 = arrayList.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            obj6 = it3.next();
                            if (((Clips.ContentTabCollection) obj6).a == Clips.ContentTabCollection.ContentTabCollectionType.SCHEDULED) {
                            }
                        } else {
                            obj6 = null;
                        }
                    }
                    contentTabCollection = (Clips.ContentTabCollection) obj6;
                }
                if (groupContentTabSetting != null && (groupContentTabSpecialValues = groupContentTabSetting.h) != null) {
                    num = groupContentTabSpecialValues.b;
                }
                return new ggh.a((GroupsGetContentForTabsResponseDto) it80Var.a, (GroupsGetContentForTabsResponseDto) it80Var2.a, (gud) it80Var3.a, contentTabCollection, num);
            case 1:
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj3;
                int intValue = ((Integer) obj4).intValue();
                if ((intValue & 48) == 0) {
                    intValue |= aVar.l(booleanValue) ? 32 : 16;
                }
                if (aVar.t(intValue & 1, (intValue & 145) != 144)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1524493719, intValue, -1, "com.vk.core.compose.component.ComposableSingletons$VkAccentTabRowKt.lambda$1524493719.<anonymous> (VkAccentTabRow.kt:680)");
                    }
                    if (booleanValue) {
                        aVar.K(454621538);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        j = ylu0Var.getText().m;
                    } else {
                        aVar.K(454622724);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var2 = (ylu0) aVar.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        j = ylu0Var2.getText().p;
                    }
                    aVar.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var = (wuv0) aVar.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    yqv0.c("Tab 2", null, j, null, null, 0, 0, null, 0, false, 0, 0, null, wuv0Var.P, aVar, 6, 0, 8186);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            default:
                int intValue2 = ((Integer) obj).intValue();
                ((Integer) obj2).intValue();
                return new Rect(intValue2, ((Integer) obj3).intValue(), intValue2, ((Integer) obj4).intValue());
        }
    }
}
