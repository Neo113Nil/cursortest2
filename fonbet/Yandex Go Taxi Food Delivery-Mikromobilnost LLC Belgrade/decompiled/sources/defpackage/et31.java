package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class et31 implements uji0 {
    @Override // defpackage.uji0
    public final void a(View view) {
    }

    @Override // defpackage.uji0
    public final void b(View view) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (((ViewGroup.MarginLayoutParams) layoutParams).width == -1 && ((ViewGroup.MarginLayoutParams) layoutParams).height == -1) {
            return;
        }
        ny61.r("Pages must fill the whole ViewPager2 (use match_parent)");
    }
}
