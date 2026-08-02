package yads;

import android.os.Handler;
import android.os.Looper;
import java.util.List;

/* loaded from: classes10.dex */
public final class o61 {
    public final p61 a;
    public final Handler b;
    public final ym3 c;
    public final rc1 d;

    public o61(p61 p61Var, Handler handler, ym3 ym3Var, rc1 rc1Var) {
        this.a = p61Var;
        this.b = handler;
        this.c = ym3Var;
        this.d = rc1Var;
    }

    public /* synthetic */ o61(k62 k62Var, List list) {
        this(new p61(), new Handler(Looper.getMainLooper()), new ym3(), sc1.a(k62Var, list));
    }
}
