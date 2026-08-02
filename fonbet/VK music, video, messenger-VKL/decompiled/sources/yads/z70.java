package yads;

import android.widget.ImageView;
import java.util.List;

/* loaded from: classes10.dex */
public final class z70 {
    public final n41 a;
    public final List b;

    public z70(h13 h13Var, List list) {
        this.a = h13Var;
        this.b = list;
    }

    public final et a(String str, ImageView imageView) {
        final l41 a = this.a.a(str, new y70(imageView), 0, 0);
        et etVar = new et() { // from class: xsna.gkz0
            @Override // yads.et
            public final void cancel() {
                yads.z70.a(yads.l41.this);
            }
        };
        this.b.add(etVar);
        return etVar;
    }

    public static final void a(l41 l41Var) {
        l41Var.a();
    }
}
