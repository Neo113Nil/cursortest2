package xsna;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import java.util.Map;

/* compiled from: SwapItemDecoration.kt */
/* loaded from: classes4.dex */
public final class kln0 extends RecyclerView.n implements too0 {
    public String b;
    public final HashMap<String, RecyclerView.n> c = new HashMap<>();

    public kln0() {
        dhr0.M();
    }

    @Override // xsna.too0
    public final void Ng() {
        dhr0.M();
        for (Map.Entry<String, RecyclerView.n> entry : this.c.entrySet()) {
            entry.getKey();
            Object obj = (RecyclerView.n) entry.getValue();
            if (obj instanceof too0) {
                ((too0) obj).Ng();
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        String str = this.b;
        RecyclerView.n nVar = str != null ? this.c.get(str) : null;
        if (nVar != null) {
            nVar.getItemOffsets(rect, view, recyclerView, a0Var);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        String str = this.b;
        RecyclerView.n nVar = str != null ? this.c.get(str) : null;
        if (nVar != null) {
            nVar.onDraw(canvas, recyclerView, a0Var);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        String str = this.b;
        RecyclerView.n nVar = str != null ? this.c.get(str) : null;
        if (nVar != null) {
            nVar.onDrawOver(canvas, recyclerView, a0Var);
        }
    }
}
