package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
public final class j071 {
    public static final AtomicBoolean d = new AtomicBoolean(false);
    public final om71 a;
    public final gg71 b;
    public final rr41 c;

    public j071(Context context) {
        om71 om71Var = new om71();
        gg71 gg71Var = new gg71(context);
        rr41 rr41Var = new rr41(context, 7);
        this.a = om71Var;
        this.b = gg71Var;
        this.c = rr41Var;
    }

    public final void a(Context context) {
        if (this.b.b() && d.compareAndSet(false, true)) {
            this.a.a.getClass();
            boolean z = !fw81.b(context);
            rr41 rr41Var = this.c;
            if (((gg71) rr41Var.b).b()) {
                try {
                    ((os71) rr41Var.c).F(new w7o(z));
                } catch (Throwable unused) {
                }
            }
        }
    }
}
