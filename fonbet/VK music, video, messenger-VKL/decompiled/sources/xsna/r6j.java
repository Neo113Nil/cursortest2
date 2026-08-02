package xsna;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.impl.constraints.WorkConstraintsTracker;

/* compiled from: ConstraintsCommandHandler.java */
/* loaded from: classes12.dex */
public final class r6j {
    public final i7o0 a;
    public final int b;
    public final WorkConstraintsTracker c;

    static {
        m100.d("ConstraintsCmdHandler");
    }

    public r6j(@NonNull Context context, i7o0 i7o0Var, int i, @NonNull kpn0 kpn0Var) {
        this.a = i7o0Var;
        this.b = i;
        this.c = new WorkConstraintsTracker(kpn0Var.f.j);
    }
}
