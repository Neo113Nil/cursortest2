package xsna;

import com.vk.posting.presentation.model.PickerRootParams;
import kotlin.NoWhenBranchMatchedException;
import xsna.fhc0;
import xsna.fia0;
import xsna.jia0;
import xsna.lia0;

/* compiled from: PickerRootFeature.kt */
/* loaded from: classes18.dex */
public final class hia0 extends wk50<ria0, oia0, fia0, lia0> {
    public final fhc0.b f;
    public final f4z g;

    public hia0(nia0 nia0Var, fhc0.b bVar) {
        super(fia0.a.b, nia0Var);
        this.f = bVar;
        this.g = new f4z();
    }

    @Override // xsna.wk50
    public final void N(oia0 oia0Var, fia0 fia0Var) {
        oia0 oia0Var2 = oia0Var;
        fia0 fia0Var2 = fia0Var;
        PickerRootParams pickerRootParams = oia0Var2.c;
        if (fia0Var2.equals(fia0.a.b)) {
            return;
        }
        if (fia0Var2.equals(fia0.b.b)) {
            int i = oia0Var2.d;
            this.g.b(new jia0.b(pickerRootParams.d, i != 0 ? i != 1 ? pickerRootParams.b : pickerRootParams.c : pickerRootParams.b));
            return;
        }
        if (!(fia0Var2 instanceof fia0.c)) {
            throw new NoWhenBranchMatchedException();
        }
        fia0.c cVar = (fia0.c) fia0Var2;
        T(new lia0.a(cVar.b));
        Boolean bool = cVar.c;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            fhc0.b bVar = this.f;
            if (booleanValue) {
                bVar.h();
            } else {
                bVar.a();
            }
        }
    }

    public final wj50<jia0> U() {
        return this.g;
    }
}
