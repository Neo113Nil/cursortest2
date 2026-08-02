package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vkontakte.android.R;
import xsna.q630;
import xsna.wkj;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class kgi implements a0t {
    public final /* synthetic */ int b;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.a0t
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        switch (this.b) {
            case 0:
                ButtonSize buttonSize = (ButtonSize) obj2;
                lgu0 lgu0Var = (lgu0) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj4;
                int intValue = ((Integer) obj5).intValue();
                if ((intValue & 48) == 0) {
                    i = (aVar.o(buttonSize.ordinal()) ? 32 : 16) | intValue;
                } else {
                    i = intValue;
                }
                if ((intValue & 384) == 0) {
                    i |= aVar.J(lgu0Var) ? 256 : 128;
                }
                if (aVar.t(i & 1, (i & 1169) != 1168)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-178640084, i, -1, "com.vk.search.communities.map.impl.ui.details.compose.component.ComposableSingletons$GroupDetailsActionButtonsKt.lambda$-178640084.<anonymous> (GroupDetailsActionButtons.kt:109)");
                    }
                    qzu0.a.getClass();
                    int i2 = i >> 3;
                    vqv.a(qzu0.E0(aVar), d370.N(R.string.search_action_button_show_on_map, 0, aVar), txj0.q(q630.a.a, hr80.z().v(buttonSize, aVar, i2 & 14)), ((l5g) lgu0Var.d(true, aVar, (i2 & 112) | 6).getValue()).a, aVar, 8, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                lg90 lg90Var = (lg90) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj4;
                int intValue2 = ((Integer) obj5).intValue();
                if ((intValue2 & 384) == 0) {
                    intValue2 |= (intValue2 & 512) == 0 ? aVar2.J(lg90Var) : aVar2.y(lg90Var) ? 256 : 128;
                }
                if (aVar2.t(intValue2 & 1, (intValue2 & 1153) != 1152)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1523001286, intValue2, -1, "com.vk.ecomm.verifiedseller.impl.screens.obtainverification.ui.ComposableSingletons$ObtainVerificationContentKt.lambda$1523001286.<anonymous> (ObtainVerificationContent.kt:52)");
                    }
                    vjw.a(lg90Var, null, txj0.f(q630.a.a, 1.0f), null, wkj.a.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, aVar2, 25016 | ((intValue2 >> 6) & 14), 104);
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
