package defpackage;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;

/* loaded from: classes.dex */
public final class j3x0 {
    public final ComponentName a;
    public final n2x0 b;
    public final boolean c;

    static {
        hgz.o("SystemJobInfoConverter");
    }

    public j3x0(Context context, n2x0 n2x0Var, boolean z) {
        this.b = n2x0Var;
        this.a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
        this.c = z;
    }
}
