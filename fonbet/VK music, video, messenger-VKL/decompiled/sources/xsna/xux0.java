package xsna;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.work.ExistingWorkPolicy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* compiled from: WorkContinuationImpl.java */
/* loaded from: classes.dex */
public final class xux0 extends q5q0 {
    public final dwx0 a;
    public final String b;
    public final ExistingWorkPolicy c;
    public final List<? extends androidx.work.e> d;
    public final ArrayList e;
    public final ArrayList f;
    public boolean g;
    public ws80 h;

    static {
        m100.d("WorkContinuationImpl");
    }

    public xux0() {
        throw null;
    }

    public xux0(@NonNull dwx0 dwx0Var, @Nullable String str, @NonNull ExistingWorkPolicy existingWorkPolicy, @NonNull List list) {
        this.a = dwx0Var;
        this.b = str;
        this.c = existingWorkPolicy;
        this.d = list;
        this.e = new ArrayList(list.size());
        this.f = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            if (existingWorkPolicy == ExistingWorkPolicy.REPLACE && ((androidx.work.e) list.get(i)).b.u != Long.MAX_VALUE) {
                throw new IllegalArgumentException("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
            }
            String uuid = ((androidx.work.e) list.get(i)).a.toString();
            this.e.add(uuid);
            this.f.add(uuid);
        }
    }

    @NonNull
    public static HashSet d(@NonNull xux0 xux0Var) {
        HashSet hashSet = new HashSet();
        xux0Var.getClass();
        return hashSet;
    }

    @NonNull
    public final ts80 c() {
        if (this.g) {
            m100 c = m100.c();
            TextUtils.join(", ", this.e);
            c.getClass();
        } else {
            dwx0 dwx0Var = this.a;
            this.h = zs80.a(dwx0Var.b.m, "EnqueueRunnable_" + this.c.name(), dwx0Var.d.a, new jb3(this, 11));
        }
        return this.h;
    }
}
