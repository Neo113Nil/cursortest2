package xsna;

import androidx.viewpager2.widget.ViewPager2;
import com.vk.dto.common.id.UserId;
import com.vk.posting.presentation.model.PickerRootParams;
import xsna.fia0;

/* compiled from: PickerRootView.kt */
/* loaded from: classes5.dex */
public final class pia0 extends ViewPager2.g {
    public final /* synthetic */ qia0 d;

    public pia0(qia0 qia0Var) {
        this.d = qia0Var;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public final void onPageSelected(int i) {
        qia0 qia0Var = this.d;
        rop ropVar = qia0Var.e;
        PickerRootParams pickerRootParams = qia0Var.b;
        UserId userId = i != 0 ? i != 1 ? null : pickerRootParams.c : pickerRootParams.b;
        ropVar.invoke(new fia0.c(i, userId != null ? Boolean.valueOf(fkq0.d(userId)) : null));
    }
}
