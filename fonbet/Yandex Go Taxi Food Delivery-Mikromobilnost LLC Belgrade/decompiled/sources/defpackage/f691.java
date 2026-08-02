package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final class f691 {
    public final Context a;
    public final ndi0 b;
    public final ofa0 c;
    public final Executor d;

    public f691(Context context, ThreadPoolExecutor threadPoolExecutor, ofa0 ofa0Var, ndi0 ndi0Var) {
        this.a = context;
        this.b = ndi0Var;
        this.c = ofa0Var;
        this.d = threadPoolExecutor;
    }
}
