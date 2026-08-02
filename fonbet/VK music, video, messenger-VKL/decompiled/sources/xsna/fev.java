package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import com.unity3d.services.UnityAdsConstants;
import com.vk.newsfeed.common.recycler.holders.videos.clips.ClipsHolderViewImpl;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.oht0;

/* compiled from: HorizontalListHelper.kt */
/* loaded from: classes4.dex */
public final class fev {
    public View a;
    public final oht0 b;
    public final u060 c;

    /* compiled from: HorizontalListHelper.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements wzs<Integer, View, s3q0> {
        @Override // xsna.wzs
        public final s3q0 invoke(Integer num, View view) {
            num.intValue();
            View view2 = view;
            fev fevVar = (fev) this.receiver;
            if (!epx.f(fevVar.a, view2)) {
                View view3 = fevVar.a;
                ViewGroup viewGroup = view3 instanceof ViewGroup ? (ViewGroup) view3 : null;
                if (viewGroup != null) {
                    for (int i = 0; i < viewGroup.getChildCount(); i++) {
                        viewGroup.getChildAt(i).setActivated(false);
                    }
                }
                ViewGroup viewGroup2 = view2 instanceof ViewGroup ? (ViewGroup) view2 : null;
                if (viewGroup2 != null) {
                    for (int i2 = 0; i2 < viewGroup2.getChildCount(); i2++) {
                        viewGroup2.getChildAt(i2).setActivated(true);
                    }
                }
                fevVar.a = view2;
            }
            return s3q0.a;
        }
    }

    public fev(ai5 ai5Var, oht0.a aVar) {
        this.b = new oht0(new DecelerateInterpolator(1.0f), new a(2, this, fev.class, "activateView", "activateView(ILandroid/view/View;)V", 0), aVar, 32);
        tev tevVar = tev.a;
        this.c = new u060(ai5Var, new uah0(0.7f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 12));
    }

    public /* synthetic */ fev(ClipsHolderViewImpl clipsHolderViewImpl) {
        this(clipsHolderViewImpl, new oht0.a());
    }
}
