package yads;

import android.content.Context;
import xsna.s3q0;

/* loaded from: classes10.dex */
public final class iv0 {
    public final w5 a;
    public final b72 b;
    public final f82 c;
    public final Object d;

    public /* synthetic */ iv0(Context context, w5 w5Var) {
        this(w5Var, new b72(context), new f82());
    }

    public final void a() {
        synchronized (this.d) {
            this.b.a();
            s3q0 s3q0Var = s3q0.a;
        }
    }

    public iv0(w5 w5Var, b72 b72Var, f82 f82Var) {
        this.a = w5Var;
        this.b = b72Var;
        this.c = f82Var;
        this.d = new Object();
    }
}
