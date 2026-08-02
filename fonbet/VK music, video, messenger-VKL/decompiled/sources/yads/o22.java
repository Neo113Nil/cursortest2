package yads;

import android.view.View;
import java.util.Map;
import xsna.s3q0;

/* loaded from: classes10.dex */
public final class o22 {
    public static final Object b = new Object();
    public static volatile o22 c;
    public final Map a;

    public o22(Map map) {
        this.a = map;
    }

    public final void a(View view, q42 q42Var) {
        synchronized (b) {
            this.a.put(view, q42Var);
            s3q0 s3q0Var = s3q0.a;
        }
    }
}
