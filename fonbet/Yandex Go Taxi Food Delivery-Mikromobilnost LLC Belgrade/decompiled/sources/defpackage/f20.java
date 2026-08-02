package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.yandex.taxi.object.DriveState;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lf20;", "Ltsa0;", "Companion", "d20", "e20", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class f20 implements tsa0 {
    public static final e20 Companion = new e20();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new c20(0))};
    public final String a;
    public final DriveState b;

    public /* synthetic */ f20(int i, String str, DriveState driveState) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = DriveState.SEARCH;
        } else {
            this.b = driveState;
        }
    }

    public static final void d(f20 f20Var, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || !jl40.l(f20Var.a, "")) {
            yjdVar.o(serialDescriptor, 0, f20Var.a);
        }
        if (!yjdVar.F() && f20Var.b == DriveState.SEARCH) {
            return;
        }
        yjdVar.e(serialDescriptor, 1, (KSerializer) c[1].getValue(), f20Var.b);
    }

    @Override // defpackage.tsa0
    /* renamed from: a, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public final rvx c() {
        return new rvx(12, this.a, this.b);
    }

    public f20() {
        DriveState driveState = DriveState.SEARCH;
        this.a = "";
        this.b = driveState;
    }
}
