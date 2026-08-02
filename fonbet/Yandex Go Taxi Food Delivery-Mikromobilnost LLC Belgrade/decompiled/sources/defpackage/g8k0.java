package defpackage;

import java.util.HashMap;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes14.dex */
public final class g8k0 {
    public final f8k0 a;

    public g8k0(f8k0 f8k0Var) {
        this.a = f8k0Var;
    }

    public final void a(String str, String str2) {
        f8k0 f8k0Var = this.a;
        f8k0Var.getClass();
        HashMap h = b.h(new Pair("button", str2));
        if (str != null) {
            h.put("payment_type", str);
        }
        x4e.B(f8k0Var.a, "Ride.SuggestChangePayment.Tapped", h, 1);
    }
}
