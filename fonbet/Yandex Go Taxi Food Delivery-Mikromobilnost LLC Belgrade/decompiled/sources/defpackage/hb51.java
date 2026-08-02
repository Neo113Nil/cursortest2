package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div2.DivPager$ItemAlignment;

/* loaded from: classes11.dex */
public final class hb51 extends p2l {
    public final RecyclerView d;
    public final boolean e;

    public hb51(RecyclerView recyclerView, boolean z, int i, l2l l2lVar, DivPager$ItemAlignment divPager$ItemAlignment) {
        super(i, l2lVar, divPager$ItemAlignment);
        this.d = recyclerView;
        this.e = z;
    }

    @Override // defpackage.p2l
    public final Float f(int i) {
        View X;
        RecyclerView.e layoutManager = this.d.getLayoutManager();
        if (layoutManager == null || (X = layoutManager.X(i)) == null) {
            return null;
        }
        return Float.valueOf(this.e ? X.getWidth() : X.getHeight());
    }
}
