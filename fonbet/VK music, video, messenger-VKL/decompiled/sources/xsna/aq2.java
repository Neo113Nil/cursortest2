package xsna;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import me.grishka.appkit.views.UsableRecyclerPaginatedView;
import me.grishka.appkit.views.UsableRecyclerView;

/* compiled from: AnimationPaginatedView.kt */
/* loaded from: classes7.dex */
public class aq2 extends UsableRecyclerPaginatedView {
    public aq2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    @Override // com.vk.lists.AbstractPaginatedView
    public final void p(int i, View... viewArr) {
        j6r0.a(viewArr[0]);
        j6r0.c(0, viewArr[0]);
        int length = viewArr.length;
        for (int i2 = 1; i2 < length; i2++) {
            j6r0.a(viewArr[i2]);
            if (epx.f(this.b, viewArr[i2]) || epx.f(this.d, viewArr[i2]) || epx.f(this.c, viewArr[i2])) {
                viewArr[i2].setVisibility(8);
            } else {
                j6r0.c(8, viewArr[i2]);
            }
        }
    }

    public /* synthetic */ aq2(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    public aq2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        ((androidx.recyclerview.widget.n0) this.x.getItemAnimator()).g = false;
        RecyclerView recyclerView = this.x;
        UsableRecyclerView usableRecyclerView = recyclerView instanceof UsableRecyclerView ? (UsableRecyclerView) recyclerView : null;
        if (usableRecyclerView != null) {
            usableRecyclerView.setInterceptHorizontalScrollTouches(false);
        }
    }
}
