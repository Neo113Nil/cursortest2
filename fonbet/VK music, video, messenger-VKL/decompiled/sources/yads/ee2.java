package yads;

import android.content.Context;
import java.util.Map;

/* loaded from: classes10.dex */
public final class ee2 implements ac3 {
    public final o93 a;
    public final j93 b;
    public final yp2 c;
    public final be0 d;
    public final Context e;

    public /* synthetic */ ee2(Context context, d4 d4Var, ov2 ov2Var, o93 o93Var) {
        this(context, o93Var, new j93(context, d4Var, ov2Var), xp2.a(), new be0());
    }

    @Override // yads.ac3
    public final void a(String str, Map map) {
        ce2 ce2Var = new ce2(this.e, this.d.a(str, map), new de2(str, gx2.a().a(this.e), this.b, this.a));
        yp2 yp2Var = this.c;
        Context context = this.e;
        synchronized (yp2Var) {
            t92.a(context).a(ce2Var);
        }
    }

    public ee2(Context context, o93 o93Var, j93 j93Var, yp2 yp2Var, be0 be0Var) {
        this.a = o93Var;
        this.b = j93Var;
        this.c = yp2Var;
        this.d = be0Var;
        this.e = context.getApplicationContext();
    }
}
