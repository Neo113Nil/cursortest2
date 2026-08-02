package yads;

import android.content.Context;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class vh3 {
    public final Context a;
    public final jq3 b;
    public final th3 c;
    public final ArrayList d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ vh3(Context context, d4 d4Var, ov2 ov2Var, jh3 jh3Var, vd3 vd3Var) {
        this(r1, new jq3(r1, d4Var, ov2Var, vd3Var, jh3Var), new th3());
        Context applicationContext = context.getApplicationContext();
    }

    public vh3(Context context, jq3 jq3Var, th3 th3Var) {
        this.a = context;
        this.b = jq3Var;
        this.c = th3Var;
        this.d = new ArrayList();
    }
}
