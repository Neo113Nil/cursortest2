package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.taxi.experiments.ShowPolicyDto;

/* loaded from: classes6.dex */
public final class km4 {
    public final kv5 a;

    public km4(kv5 kv5Var) {
        this.a = kv5Var;
    }

    public final void a(RecyclerView recyclerView) {
        vl4 vl4Var;
        ShowPolicyDto showPolicyDto;
        String str;
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
            Integer valueOf = Integer.valueOf(childAdapterPosition);
            if (childAdapterPosition == -1) {
                valueOf = null;
            }
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                RecyclerView.Adapter adapter = recyclerView.getAdapter();
                bys bysVar = adapter instanceof bys ? (bys) adapter : null;
                Object item = bysVar != null ? bysVar.getItem(intValue) : null;
                ob31 ob31Var = item instanceof ob31 ? (ob31) item : null;
                if (ob31Var != null && (vl4Var = ob31Var.e) != null && (showPolicyDto = vl4Var.i) != null && (str = showPolicyDto.a) != null) {
                    boolean z = childAt.getLeft() >= 0 && childAt.getLeft() < recyclerView.getWidth();
                    boolean z2 = childAt.getRight() > 0 && childAt.getRight() <= recyclerView.getWidth();
                    if (z || z2) {
                        this.a.invoke(str);
                    }
                }
            }
        }
    }
}
