package xsna;

import android.R;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import com.vk.newsfeed.impl.explore.ExploreFragment;
import xsna.rd0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class pd0 implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pd0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int bottom;
        switch (this.b) {
            case 0:
                rd0 rd0Var = (rd0) this.c;
                ((Integer) obj3).getClass();
                rd0Var.b.invoke(((rd0.a) obj2).a);
                ((View) obj).postDelayed(new qd0(rd0Var, 0), r5.getContext().getResources().getInteger(R.integer.config_shortAnimTime));
                break;
            case 1:
                ExploreFragment exploreFragment = (ExploreFragment) this.c;
                ((Integer) obj2).getClass();
                ((Integer) obj3).getClass();
                AppBarLayout appBarLayout = exploreFragment.O;
                int i = 0;
                if (appBarLayout != null && (bottom = appBarLayout.getBottom()) >= 0) {
                    i = bottom;
                }
                exploreFragment.ho(i);
                break;
            default:
                wvq wvqVar = (wvq) this.c;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-841048791, intValue, -1, "com.vk.design.demo.presentation.screens.feed.FeedActionButtonsScreenContent.ButtonsList.<anonymous>.<anonymous>.<anonymous> (FeedActionButtonsScreenContent.kt:96)");
                    }
                    wvqVar.f(0, aVar);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
        }
        return s3q0.a;
    }
}
