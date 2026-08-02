package yads;

import android.content.Context;
import java.util.List;

/* loaded from: classes10.dex */
public final class jo2 {
    public final f5 a;
    public final oo2 b;
    public final lo2 c;
    public final io2 d;
    public final go2 e;
    public boolean f;

    public /* synthetic */ jo2(Context context, e9 e9Var, v9 v9Var, d4 d4Var, ov2 ov2Var, va vaVar, f5 f5Var, oo2 oo2Var, lo2 lo2Var, List list) {
        this(e9Var, f5Var, oo2Var, lo2Var, new io2(context, v9Var, d4Var, ov2Var, vaVar, list));
    }

    public jo2(e9 e9Var, f5 f5Var, oo2 oo2Var, lo2 lo2Var, io2 io2Var) {
        this.a = f5Var;
        this.b = oo2Var;
        this.c = lo2Var;
        this.d = io2Var;
        this.e = new go2(e9Var, this);
    }
}
