package defpackage;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import java.util.List;

/* loaded from: classes7.dex */
public final class gx71 extends ia71 {
    public final v881 c;
    public final ge71 d;
    public final d881 e;

    public gx71(ViewPager2 viewPager2, v881 v881Var, ge71 ge71Var, d881 d881Var) {
        super(viewPager2);
        this.c = v881Var;
        this.d = ge71Var;
        this.e = d881Var;
    }

    @Override // defpackage.ia71
    public final boolean c(View view, Object obj) {
        return ((ViewPager2) view).getAdapter() instanceof ao71;
    }

    @Override // defpackage.ia71
    public final void e(View view, Object obj) {
        try {
            ((ViewPager2) view).setAdapter(new ao71(this.c, (List) obj, this.e));
        } catch (IllegalArgumentException e) {
            String message = e.getMessage();
            if (message == null) {
                message = "IllegalArgumentException: set adapter exception";
            }
            this.d.d(message, e);
        }
    }
}
