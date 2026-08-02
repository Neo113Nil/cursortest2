package yads;

import android.content.Context;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes10.dex */
public final class p12 implements r12 {
    public final Context a;
    public final ov2 b;
    public final e00 c;
    public final List d;
    public final si1 e;
    public c10 f;
    public zu3 g;

    public /* synthetic */ p12(Context context, mv3 mv3Var, e00 e00Var) {
        this(context, mv3Var, e00Var, new CopyOnWriteArrayList(), new si1(context), null, null, null);
    }

    public p12(Context context, mv3 mv3Var, e00 e00Var, List list, si1 si1Var, c10 c10Var, zu3 zu3Var, rv3 rv3Var) {
        this.a = context;
        this.b = mv3Var;
        this.c = e00Var;
        this.d = list;
        this.e = si1Var;
        this.f = c10Var;
        this.g = zu3Var;
        si1Var.a();
    }
}
