package yads;

import android.graphics.Bitmap;
import java.util.Map;

/* loaded from: classes10.dex */
public final class z31 implements m41 {
    public final /* synthetic */ a41 a;
    public final /* synthetic */ Map b;
    public final /* synthetic */ x41 c;

    public z31(a41 a41Var, Map map, x41 x41Var) {
        this.a = a41Var;
        this.b = map;
        this.c = x41Var;
    }

    @Override // yads.uq2
    public final void a(mn3 mn3Var) {
        this.a.a(this.b);
    }

    @Override // yads.m41
    public final void a(l41 l41Var, boolean z) {
        String str = this.c.c;
        Bitmap bitmap = l41Var.a;
        if (bitmap != null) {
            if (str != null) {
                this.b.put(str, bitmap);
                this.a.c.a(str, bitmap);
            }
            this.a.a(this.b);
        }
    }
}
