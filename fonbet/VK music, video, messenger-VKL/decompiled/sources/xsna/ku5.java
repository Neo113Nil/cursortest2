package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.ironsource.B;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.tabs.SkeletonTabLayout;
import com.vk.home.HomeFragment2;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class ku5 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ku5(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                B.a((B) this.c, (Map) this.d);
                break;
            case 1:
                ((izs) this.c).invoke((v940) this.d);
                break;
            case 2:
                HomeFragment2 homeFragment2 = (HomeFragment2) this.c;
                ViewPager viewPager = (ViewPager) this.d;
                SkeletonTabLayout skeletonTabLayout = homeFragment2.T;
                if (skeletonTabLayout != null) {
                    skeletonTabLayout.d(viewPager.getCurrentItem(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, true, true);
                    break;
                }
                break;
            case 3:
                ((opl0) this.c).K0((gzs) this.d);
                break;
            case 4:
                RecyclerView recyclerView = (RecyclerView) this.c;
                View view = (View) this.d;
                int width = (recyclerView.getWidth() - recyclerView.getPaddingLeft()) - recyclerView.getPaddingRight();
                if (width < 0) {
                    width = 0;
                }
                if (width != 0) {
                    view.measure(View.MeasureSpec.makeMeasureSpec(width, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                    int measuredHeight = view.getMeasuredHeight();
                    if (measuredHeight > 0 && recyclerView.getLayoutParams().height != measuredHeight) {
                        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
                        layoutParams.height = measuredHeight;
                        recyclerView.setLayoutParams(layoutParams);
                        recyclerView.requestLayout();
                        break;
                    }
                }
                break;
            case 5:
                yads.jm.a((yads.jm) this.c, (yads.j5) this.d);
                break;
            default:
                yads.vl2.a((yads.l4) this.c, (yads.vl2) this.d);
                break;
        }
    }
}
