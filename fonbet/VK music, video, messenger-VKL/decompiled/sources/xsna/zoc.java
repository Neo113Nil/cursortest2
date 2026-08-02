package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.attachments.impl.publish.cta.ActionButtonsPickerTestTags;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vkontakte.android.R;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class zoc implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ zoc(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1691247583, intValue, -1, "com.vk.clips.attachments.impl.publish.cta.donut.presentation.compose.ClipCtaWithDonutScreen.<anonymous> (ClipCtaWithDonutComposeContent.kt:107)");
                    }
                    String N = d370.N(R.string.close, 0, aVar);
                    izs izsVar = this.c;
                    boolean J = aVar.J(izsVar);
                    Object x = aVar.x();
                    if (J || x == a.C0011a.a) {
                        x = new sv7(izsVar, 2);
                        aVar.R(x);
                    }
                    muv0.h(TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(d370.N(R.string.clips_involvement_title, 0, aVar), null, null, null, null, aVar, 196608, 30), null, null, null, aVar, 14), ahn.E(q630.a.a, ActionButtonsPickerTestTags.ActionButtonsPickerTopBar.h()), null, null, null, TopBar$Before.d.a.a(N, (gzs) x, null, null, aVar, 24576, 12), null, null, true, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar, 100663344, 0, 7900);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1461277098, intValue2, -1, "com.vk.ecomm.configureitemlist.presentation.composeview.ConfigureItemListComposeView.ThemedContent.<anonymous> (ConfigureItemListComposeView.kt:46)");
                    }
                    mzi.a(384, aVar2, d370.N(R.string.configure_item_list_title, 0, aVar2), this.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
        }
        return s3q0.a;
    }
}
