package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lo9u0;", "", "Companion", "m9u0", "n9u0", "old"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class o9u0 {
    public static final n9u0 Companion = new n9u0();
    public static final i3y[] b = {a.b(LazyThreadSafetyMode.PUBLICATION, new fet0(24))};
    public final List a;

    public /* synthetic */ o9u0(int i, List list) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = list;
        }
    }

    public static final /* synthetic */ void c(o9u0 o9u0Var, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (!yjdVar.F() && o9u0Var.a == null) {
            return;
        }
        yjdVar.g(serialDescriptor, 0, (KSerializer) b[0].getValue(), o9u0Var.a);
    }

    /* renamed from: b, reason: from getter */
    public final List getA() {
        return this.a;
    }

    public o9u0() {
        this.a = null;
    }
}
