package xsna;

import android.animation.ValueAnimator;
import androidx.viewpager2.widget.ViewPager2;
import com.unity3d.services.UnityAdsConstants;
import com.vk.im.design.view.pagination.ImPaginationSegment;

/* compiled from: ImPinMediator.kt */
/* loaded from: classes2.dex */
public final class haw {
    public final ViewPager2 a;
    public final ImPaginationSegment b;
    public boolean c;
    public final a d = new a();

    /* compiled from: ImPinMediator.kt */
    public final class a {
        public final ValueAnimator a = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
    }

    public haw(ViewPager2 viewPager2, ImPaginationSegment imPaginationSegment) {
        this.a = viewPager2;
        this.b = imPaginationSegment;
    }

    public final void a() {
        if (this.c) {
            throw new IllegalStateException((fpf0.a(haw.class).l() + " is already attached").toString());
        }
        ViewPager2 viewPager2 = this.a;
        if (viewPager2.getAdapter() != null) {
            this.c = true;
            b(viewPager2.getCurrentItem());
        } else {
            throw new IllegalStateException((fpf0.a(haw.class).l() + " attached before ViewPager2 has an adapter").toString());
        }
    }

    public final void b(int i) {
        this.b.setCurrentItemIndex(i);
        j9k j9kVar = new j9k(this, 21);
        ValueAnimator valueAnimator = this.d.a;
        valueAnimator.addUpdateListener(new ho6(j9kVar, 2));
        valueAnimator.setDuration(200L);
        valueAnimator.start();
    }
}
