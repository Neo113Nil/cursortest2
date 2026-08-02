package defpackage;

import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lmpj0;", "", "Companion", "kpj0", "lpj0", "go-client-android.features.requirements:models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class mpj0 {
    public static final lpj0 Companion = new lpj0();
    public final String a;
    public final cwi0 b;

    public /* synthetic */ mpj0(int i, String str, cwi0 cwi0Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = cwi0Var;
        }
    }

    public static final /* synthetic */ void a(mpj0 mpj0Var, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || mpj0Var.a != null) {
            yjdVar.g(serialDescriptor, 0, auu0.a, mpj0Var.a);
        }
        if (!yjdVar.F() && mpj0Var.b == null) {
            return;
        }
        yjdVar.g(serialDescriptor, 1, awi0.a, mpj0Var.b);
    }

    public mpj0() {
        this.a = null;
        this.b = null;
    }
}
