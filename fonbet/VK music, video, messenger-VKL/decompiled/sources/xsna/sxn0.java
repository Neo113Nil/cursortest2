package xsna;

import androidx.recyclerview.widget.GridLayoutManager;
import com.vk.superapp.ui.uniwidgets.dto.TableUniWidget;

/* compiled from: TableUniConstructor.kt */
/* loaded from: classes6.dex */
public final class sxn0 extends GridLayoutManager.c {
    public final /* synthetic */ int d;
    public final /* synthetic */ rxn0 e;

    public sxn0(int i, rxn0 rxn0Var) {
        this.d = i;
        this.e = rxn0Var;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.c
    public final int c(int i) {
        int i2 = i % this.d;
        Object obj = this.e.b;
        if (obj == null) {
            obj = null;
        }
        return ((TableUniWidget) obj).s.c.get(i2).intValue();
    }
}
