package defpackage;

import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.yandex.taxi.object.DriveState;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lpz1;", "Ltsa0;", "Companion", "nz1", "oz1", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class pz1 implements tsa0 {
    public static final oz1 Companion = new oz1();
    public final String a;

    public /* synthetic */ pz1(int i, String str) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
    }

    public static final void c(pz1 pz1Var, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (!yjdVar.F() && jl40.l(pz1Var.a, "")) {
            return;
        }
        yjdVar.o(serialDescriptor, 0, pz1Var.a);
    }

    @Override // defpackage.tsa0
    /* renamed from: a, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public final rvx b() {
        return new rvx(12, this.a, DriveState.COMPLETE);
    }

    public pz1() {
        this.a = "";
    }
}
