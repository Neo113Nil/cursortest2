package xsna;

import com.vk.posting.presentation.model.PickerRootParams;
import kotlin.NoWhenBranchMatchedException;
import xsna.lia0;

/* compiled from: PickerRootReducer.kt */
/* loaded from: classes5.dex */
public final class nia0 extends dm50<ria0, lia0, oia0> {
    public nia0(PickerRootParams pickerRootParams) {
        super(new oia0(pickerRootParams.c != null, pickerRootParams, 0));
    }

    @Override // xsna.dm50
    public final oia0 c(oia0 oia0Var, lia0 lia0Var) {
        oia0 oia0Var2 = oia0Var;
        lia0 lia0Var2 = lia0Var;
        if (!(lia0Var2 instanceof lia0.a)) {
            throw new NoWhenBranchMatchedException();
        }
        return new oia0(oia0Var2.b, oia0Var2.c, ((lia0.a) lia0Var2).b);
    }

    @Override // xsna.dm50
    public final ria0 d() {
        return new ria0(e(new u620(10)));
    }

    @Override // xsna.dm50
    public final void h(oia0 oia0Var, ria0 ria0Var) {
        f(ria0Var.a, oia0Var);
    }
}
