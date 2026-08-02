package yads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import xsna.bpn0;
import xsna.jgp;

/* loaded from: classes10.dex */
public final class f41 {
    public final Context a;
    public final Lazy b = new bpn0(new e41(this));

    public f41(Context context) {
        this.a = context;
    }

    public final void a(Set set, g51 g51Var) {
        if (set.isEmpty()) {
            g51Var.a(jgp.b);
        } else {
            new a41(((x92) this.b.getValue()).a, set, g51Var, new Handler(Looper.getMainLooper()), new AtomicInteger(set.size()), new kt1()).a();
        }
    }
}
