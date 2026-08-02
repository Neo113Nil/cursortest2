package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ln8s0;", "", "Companion", "h8s0", "k8s0", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class n8s0 {
    public static final k8s0 Companion = new k8s0();
    public final String a;
    public final int b;

    public /* synthetic */ n8s0(int i, String str, int i2) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = 0;
        } else {
            this.b = i2;
        }
    }

    public n8s0() {
        this.a = "";
        this.b = 0;
    }
}
