package xsna;

import com.vk.core.compose.component.defaults.SpinnerState;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class jgi implements a0t {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.a0t
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        lgu0 lgu0Var = (lgu0) obj3;
        androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj4;
        int intValue = ((Integer) obj5).intValue();
        if ((intValue & 384) == 0) {
            intValue |= aVar.J(lgu0Var) ? 256 : 128;
        }
        if (aVar.t(intValue & 1, (intValue & 1153) != 1152)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1797412481, intValue, -1, "com.vk.search.communities.map.impl.ui.details.compose.component.ComposableSingletons$GroupDetailsActionButtonsKt.lambda$1797412481.<anonymous> (GroupDetailsActionButtons.kt:70)");
            }
            zfr0.f(SpinnerState.Loading, null, null, ((l5g) lgu0Var.d(true, aVar, ((intValue >> 3) & 112) | 6).getValue()).a, null, null, aVar, 6, 54);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar.h();
        }
        return s3q0.a;
    }
}
