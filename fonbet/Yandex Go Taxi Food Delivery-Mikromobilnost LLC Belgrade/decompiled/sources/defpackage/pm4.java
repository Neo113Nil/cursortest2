package defpackage;

import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lpm4;", "", "Companion", "nm4", "om4", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class pm4 {
    public static final om4 Companion = new om4();
    public final String a;

    public /* synthetic */ pm4(int i, String str) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
    }

    public static final /* synthetic */ void a(pm4 pm4Var, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (!yjdVar.F() && pm4Var.a == null) {
            return;
        }
        yjdVar.g(serialDescriptor, 0, auu0.a, pm4Var.a);
    }

    public pm4() {
        this.a = null;
    }
}
