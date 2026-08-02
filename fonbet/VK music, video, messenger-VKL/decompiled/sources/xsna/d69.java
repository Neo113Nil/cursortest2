package xsna;

import androidx.compose.foundation.gestures.Orientation;
import com.vk.catalog2.common.ui.holders.group.GroupsPreviewVh;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.picture.c;
import com.vk.core.view.components.userstack.VkDiagonalUserStack;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import ru.ok.android.webrtc.CallEvents;
import ru.ok.android.webrtc.di.CallModuleImpl;
import xsna.ece;
import xsna.wwi0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class d69 implements wzs {
    public final /* synthetic */ int b;

    public /* synthetic */ d69(byte b, int i) {
        this.b = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        List<String> list;
        switch (this.b) {
            case 0:
                return CallModuleImpl.a((CallEvents) obj, obj2);
            case 1:
                VkAvatar vkAvatar = (VkAvatar) obj;
                vrr vrrVar = (vrr) obj2;
                if (!(vrrVar instanceof ece.a)) {
                    return s3q0.a;
                }
                vkAvatar.setContent(new c.d(((ece.a) vrrVar).a, null));
                return s3q0.a;
            case 2:
                VkDiagonalUserStack vkDiagonalUserStack = (VkDiagonalUserStack) obj;
                VkCell.f fVar = (VkCell.f) obj2;
                GroupsPreviewVh.a aVar = fVar instanceof GroupsPreviewVh.a ? (GroupsPreviewVh.a) fVar : null;
                if (aVar != null && (list = aVar.a) != null) {
                    List<String> list2 = list;
                    ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        itj0.d((String) it.next(), arrayList);
                    }
                    vkDiagonalUserStack.setAvatars(arrayList);
                }
                return s3q0.a;
            case 3:
                ((Long) obj).longValue();
                ((Integer) obj2).intValue();
                return s3q0.a;
            case 4:
                ((jid0) ((hnd0) obj).a.getAdapter()).A0(hld0.a((eld0) obj2, 0));
                return s3q0.a;
            case 5:
                ((Integer) obj2).getClass();
                soj0.a(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 6:
                int i = hem0.y1;
                return Boolean.FALSE;
            case 7:
                xgo0 xgo0Var = (xgo0) obj2;
                return e43.l(Float.valueOf(((vak0) xgo0Var.a).getFloatValue()), Boolean.valueOf(((Orientation) ((zak0) xgo0Var.f).getValue()) == Orientation.Vertical));
            case 8:
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken = VkTypographyToken.DisplayTitle1;
                aVar2.K(76763552);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(76763552, intValue, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:221)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) aVar2.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.G0;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2.j();
                return frv0Var;
            case 9:
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken2 = VkTypographyToken.DisplayTitle1;
                aVar3.K(57222430);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(57222430, intValue2, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:201)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var2 = (wuv0) aVar3.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var2 = wuv0Var2.m0;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar3.j();
                return frv0Var2;
            default:
                return new Pair((wwi0.a) obj, (Float) obj2);
        }
    }

    public /* synthetic */ d69(int i) {
        this.b = 5;
    }
}
