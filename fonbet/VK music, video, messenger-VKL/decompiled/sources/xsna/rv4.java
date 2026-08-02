package xsna;

import com.android.billingclient.api.Purchase;
import com.vk.catalog2.common.ui.holders.friend.FriendsRequestsIncomingVh;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.userstack.VkUserStack;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.us2;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class rv4 implements wzs {
    public final /* synthetic */ int b;

    public /* synthetic */ rv4(byte b, int i) {
        this.b = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return Double.valueOf(Math.max((int) ((Double) obj).doubleValue(), ((Integer) obj2).intValue()));
            case 1:
                ((Integer) obj).intValue();
                return ((jis) obj2).a;
            case 2:
                VkUserStack vkUserStack = (VkUserStack) obj;
                VkCell.f fVar = (VkCell.f) obj2;
                FriendsRequestsIncomingVh.a aVar = fVar instanceof FriendsRequestsIncomingVh.a ? (FriendsRequestsIncomingVh.a) fVar : null;
                if (aVar != null) {
                    ArrayList arrayList = aVar.a;
                    ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        itj0.d((String) it.next(), arrayList2);
                    }
                    vkUserStack.setAvatars(arrayList2);
                }
                return s3q0.a;
            case 3:
                List list = (List) obj;
                list.addAll((List) obj2);
                return list;
            case 4:
                ((Integer) obj2).getClass();
                kdd0.d(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 5:
                return Integer.valueOf(epx.h(((Purchase) obj).getPurchaseTime(), ((Purchase) obj2).getPurchaseTime()));
            case 6:
                f2h0 f2h0Var = (f2h0) obj;
                List list2 = (List) obj2;
                ArrayList arrayList3 = new ArrayList(list2.size());
                int size = list2.size();
                for (int i = 0; i < size; i++) {
                    arrayList3.add(i2h0.a((us2.d) list2.get(i), i2h0.c, f2h0Var));
                }
                return arrayList3;
            case 7:
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken = VkTypographyToken.DisplayTitle1;
                aVar2.K(1747841381);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1747841381, intValue, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:227)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) aVar2.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.M0;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2.j();
                return frv0Var;
            default:
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken2 = VkTypographyToken.DisplayTitle1;
                aVar3.K(1312973442);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1312973442, intValue2, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:208)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var2 = (wuv0) aVar3.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var2 = wuv0Var2.t0;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar3.j();
                return frv0Var2;
        }
    }
}
