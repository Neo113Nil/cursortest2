package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.impl.WorkDatabase;
import java.util.UUID;
import xsna.ub9;

/* compiled from: WorkForegroundUpdater.java */
/* loaded from: classes.dex */
public final class rvx0 implements v7s {
    public final hwx0 a;
    public final ohd0 b;
    public final gxx0 c;

    static {
        m100.d("WMFgUpdater");
    }

    @SuppressLint({"LambdaLast"})
    public rvx0(@NonNull WorkDatabase workDatabase, @NonNull ohd0 ohd0Var, @NonNull hwx0 hwx0Var) {
        this.b = ohd0Var;
        this.a = hwx0Var;
        this.c = workDatabase.D();
    }

    @Override // xsna.v7s
    @NonNull
    public final ub9.d a(@NonNull Context context, @NonNull UUID uuid, @NonNull n7s n7sVar) {
        return ub9.a(new xgz(this.a.a, "setForegroundAsync", new l9k(this, uuid, n7sVar, context, 1)));
    }
}
