package yads;

import android.app.Dialog;
import android.os.Handler;
import java.util.concurrent.TimeUnit;

/* loaded from: classes10.dex */
public final class xc {
    public static final long e = TimeUnit.SECONDS.toMillis(5);
    public final Dialog a;
    public final vm0 b;
    public final pb2 c;
    public final Handler d;

    public xc(Dialog dialog, kd kdVar, vm0 vm0Var, pb2 pb2Var, Handler handler) {
        this.a = dialog;
        this.b = vm0Var;
        this.c = pb2Var;
        this.d = handler;
    }
}
