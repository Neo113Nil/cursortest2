package yads;

import android.content.Context;
import java.util.concurrent.TimeUnit;

/* loaded from: classes10.dex */
public abstract class po extends qp2 {
    public static final int v = (int) TimeUnit.SECONDS.toMillis(10);
    public final Context s;
    public final oo t;
    public final vp2 u;

    public po(Context context, int i, String str, oo ooVar, vp2 vp2Var) {
        super(i, no.a(str), ooVar);
        this.s = context;
        this.t = ooVar;
        this.u = vp2Var;
        k();
        a(new qe0(1.0f, v, 0));
    }

    @Override // yads.qp2
    public mn3 a(mn3 mn3Var) {
        return mn3Var;
    }

    @Override // yads.qp2
    public final void a(Object obj) {
        this.t.a(obj);
    }

    public /* synthetic */ po(Context context, String str, oo ooVar) {
        this(context, 0, str, ooVar, null);
    }
}
