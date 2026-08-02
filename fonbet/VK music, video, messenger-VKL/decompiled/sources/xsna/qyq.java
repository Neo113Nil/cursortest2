package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class qyq implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qyq(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                tyq tyqVar = (tyq) this.c;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1930402, intValue, -1, "com.vk.design.demo.presentation.screens.feed.FeedEnhancedLinkCardScreenContent.ItemList.<anonymous>.<anonymous>.<anonymous> (FeedEnhancedLinkCardScreenContent.kt:108)");
                    }
                    tyqVar.j("Full Configuration", aVar, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                ogr ogrVar = (ogr) this.c;
                String str = (String) obj;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                aVar2.K(1058581221);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1058581221, intValue2, -1, "com.vk.ecomm.storefrontservices.impl.presentation.ui.FiltersBottomSheet.<anonymous>.<anonymous> (FiltersBottomSheet.kt:108)");
                }
                String str2 = (String) ogrVar.f.get(str);
                if (str2 == null) {
                    str2 = zq.a(aVar2, -610694716, R.string.storefront_services_filter_section_all, aVar2, 0);
                } else {
                    aVar2.K(-610695615);
                    aVar2.j();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2.j();
                return str2;
            case 2:
                ArrayList arrayList = (ArrayList) this.c;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(633972196, intValue3, -1, "com.vk.ecomm.market.good.ui.holder.description.ui.GoodCharacteristicsContent.<anonymous>.<anonymous> (GoodCharacteristicsContent.kt:59)");
                }
                a.m mVar = androidx.compose.foundation.layout.a.c;
                dt1.a.getClass();
                androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar3, 0);
                int hashCode = Long.hashCode(n34.n(aVar3));
                sy90 D = aVar3.D();
                q630 c = qri.c(aVar3, q630.a.a);
                cri.h7.getClass();
                LayoutNode.a aVar4 = cri.a.b;
                if (aVar3.N() == null) {
                    n34.r();
                    throw null;
                }
                aVar3.H();
                if (aVar3.L()) {
                    aVar3.I(aVar4);
                } else {
                    aVar3.f();
                }
                k9q0.w(aVar3, a, cri.a.f);
                k9q0.w(aVar3, D, cri.a.e);
                k9q0.w(aVar3, Integer.valueOf(hashCode), cri.a.g);
                k9q0.t(aVar3, cri.a.h);
                k9q0.w(aVar3, c, cri.a.d);
                aVar3.K(24755015);
                List S = j5g.S(new wow(arrayList), 5);
                int size = S.size();
                for (int i = 0; i < size; i++) {
                    w3u w3uVar = (w3u) S.get(i);
                    md10.a(0, aVar3, w3uVar.a, w3uVar.b, null);
                }
                if (gp.d(aVar3)) {
                    androidx.compose.runtime.b.e();
                }
                return s3q0.a;
            default:
                yzs yzsVar = (yzs) this.c;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-227526668, intValue4, -1, "com.vk.core.compose.component.internal.DropdownOverlayContent.<anonymous> (InternalDropdown.kt:327)");
                }
                yzsVar.invoke(r9g.a, aVar5, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return s3q0.a;
        }
    }
}
