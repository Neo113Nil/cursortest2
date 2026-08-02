package defpackage;

import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lhl60;", "", "Companion", "gl60", "fl60", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class hl60 {
    public static final gl60 Companion = new gl60();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ hl60(int i, String str, String str2, String str3) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
    }

    public static final /* synthetic */ void a(hl60 hl60Var, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || hl60Var.a != null) {
            yjdVar.g(serialDescriptor, 0, auu0.a, hl60Var.a);
        }
        if (yjdVar.F() || hl60Var.b != null) {
            yjdVar.g(serialDescriptor, 1, auu0.a, hl60Var.b);
        }
        if (!yjdVar.F() && hl60Var.c == null) {
            return;
        }
        yjdVar.g(serialDescriptor, 2, auu0.a, hl60Var.c);
    }

    public final String toString() {
        return oyr.t(b64.v("NotifyMessage{type='", this.a, "', title='", this.b, "', body='"), this.c, "'}");
    }

    public hl60() {
        this.a = null;
        this.b = null;
        this.c = null;
    }
}
