package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lpu70;", "", "Companion", "nu70", "ou70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class pu70 {
    public static final ou70 Companion = new ou70();
    public final String a;

    public /* synthetic */ pu70(int i, String str) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
    }

    public final String toString() {
        return oyr.p("OrderDraftResponse(orderId='", this.a, "')");
    }

    public pu70() {
        this.a = "";
    }
}
