package defpackage;

import androidx.recyclerview.widget.GridLayoutManager;
import java.util.List;

/* loaded from: classes.dex */
public final class amt0 extends GridLayoutManager.b {
    public final cfx d;
    public final int e = 2;

    public amt0(cfx cfxVar) {
        this.d = cfxVar;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.b
    public final int c(int i) {
        int i2 = this.e;
        if (i >= 0) {
            List f = this.d.f();
            if (i < f.size()) {
                u0x u0xVar = (u0x) f.get(i);
                if (u0xVar instanceof aul) {
                    return y6i0.d((((aul) u0xVar).h().a * i2) / 60, 1, i2);
                }
            }
        }
        return i2;
    }
}
