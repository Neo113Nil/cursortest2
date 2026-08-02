package yads;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import java.util.List;

/* loaded from: classes10.dex */
public final class ly1 extends ll3 {
    public final nj2 c;
    public final jp2 d;
    public final v9 e;

    public ly1(ViewPager2 viewPager2, nj2 nj2Var, bu1 bu1Var, v9 v9Var) {
        super(viewPager2);
        this.c = nj2Var;
        this.d = bu1Var;
        this.e = v9Var;
    }

    @Override // yads.ll3
    public final boolean a(View view, Object obj) {
        return ((ViewPager2) view).getAdapter() instanceof iy1;
    }

    @Override // yads.ll3
    public final void b(View view, Object obj) {
        try {
            ((ViewPager2) view).setAdapter(new iy1(this.c, (List) obj, this.e));
        } catch (IllegalArgumentException e) {
            jp2 jp2Var = this.d;
            String message = e.getMessage();
            if (message == null) {
                message = "IllegalArgumentException: set adapter exception";
            }
            jp2Var.reportError(message, e);
        }
    }
}
