package xsna;

import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;

/* compiled from: QualityAssessmentFragment.kt */
/* loaded from: classes7.dex */
public final class woe0 extends j56 {
    public RatingBar h;
    public View i;
    public View j;

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        this.h = (RatingBar) view.findViewById(R.id.rating_bar);
        this.i = view.findViewById(R.id.send_button);
        this.j = view.findViewById(R.id.skip_button);
        RatingBar ratingBar = this.h;
        if (ratingBar == null) {
            ratingBar = null;
        }
        ratingBar.setNumStars(5);
        RatingBar ratingBar2 = this.h;
        if (ratingBar2 == null) {
            ratingBar2 = null;
        }
        ratingBar2.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() { // from class: xsna.voe0
            @Override // android.widget.RatingBar.OnRatingBarChangeListener
            public final void onRatingChanged(RatingBar ratingBar3, float f, boolean z) {
                woe0 woe0Var = woe0.this;
                View view2 = woe0Var.i;
                if (view2 == null) {
                    view2 = null;
                }
                RatingBar ratingBar4 = woe0Var.h;
                view2.setEnabled((ratingBar4 != null ? ratingBar4 : null).getRating() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
        });
        View view2 = this.i;
        if (view2 == null) {
            view2 = null;
        }
        bwt0.i0(view2, new rj60(this, 15));
        View view3 = this.i;
        if (view3 == null) {
            view3 = null;
        }
        RatingBar ratingBar3 = this.h;
        if (ratingBar3 == null) {
            ratingBar3 = null;
        }
        view3.setEnabled(ratingBar3.getRating() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        View view4 = this.j;
        bwt0.i0(view4 != null ? view4 : null, new gj80(this, 9));
    }

    @Override // xsna.j56
    public final int tn() {
        return R.layout.voip_call_quality_assessment_fragment;
    }
}
