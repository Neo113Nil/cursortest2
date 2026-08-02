package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f0;
import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes.dex */
public final class kt31 extends f0 {
    public final /* synthetic */ ViewPager2 f;

    public kt31(ViewPager2 viewPager2) {
        this.f = viewPager2;
    }

    @Override // androidx.recyclerview.widget.f0, androidx.recyclerview.widget.e1
    public final View e(RecyclerView.e eVar) {
        if (this.f.isFakeDragging()) {
            return null;
        }
        return super.e(eVar);
    }
}
