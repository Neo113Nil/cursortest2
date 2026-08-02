package one.video.ad.ux;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.e9i0;
import xsna.epx;
import xsna.exi0;
import xsna.izs;
import xsna.k9q0;
import xsna.ln80;
import xsna.mh0;
import xsna.mn9;
import xsna.nej0;
import xsna.oej0;
import xsna.or50;
import xsna.pej0;
import xsna.qej0;
import xsna.qhg0;
import xsna.zjw;

/* compiled from: ShoppableAdView.kt */
/* loaded from: classes8.dex */
public final class ShoppableAdView extends FrameLayout {
    public static final /* synthetic */ int i = 0;
    public final ln80 b;
    public int c;
    public List<nej0> d;
    public ShoppableCardView e;
    public ShoppableCardView f;
    public AnimatorSet g;
    public qej0 h;

    /* compiled from: View.kt */
    public static final class a implements View.OnLayoutChangeListener {
        public a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            ShoppableAdView shoppableAdView = ShoppableAdView.this;
            AnimatorSet animatorSet = shoppableAdView.g;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet a = ShoppableAdView.a(shoppableAdView);
            shoppableAdView.g = a;
            a.start();
        }
    }

    public ShoppableAdView(Context context) {
        this(context, null, 0, 14, 0);
    }

    public static final AnimatorSet a(ShoppableAdView shoppableAdView) {
        if (shoppableAdView.d.size() < 2) {
            return new AnimatorSet();
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setStartDelay(3000L);
        animatorSet.setDuration(400L);
        animatorSet.addListener(new pej0(shoppableAdView));
        animatorSet.playTogether(b(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new e9i0(shoppableAdView, 5)), b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (-shoppableAdView.getMeasuredWidth()) * 0.2f, new exi0(shoppableAdView, 1)), b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, new qhg0(shoppableAdView, 3)), b(shoppableAdView.getMeasuredWidth() * 0.2f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new or50(shoppableAdView, 22)));
        return animatorSet;
    }

    public static ValueAnimator b(float f, float f2, izs izsVar) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        ofFloat.addUpdateListener(new oej0(izsVar, 0));
        return ofFloat;
    }

    public final qej0 getListener() {
        return this.h;
    }

    public final void setCardsList(List<nej0> list) {
        AnimatorSet animatorSet;
        if (epx.f(this.d, list)) {
            AnimatorSet animatorSet2 = this.g;
            if (animatorSet2 == null || !animatorSet2.isPaused() || (animatorSet = this.g) == null) {
                return;
            }
            animatorSet.resume();
            return;
        }
        AnimatorSet animatorSet3 = this.g;
        if (animatorSet3 != null) {
            animatorSet3.cancel();
        }
        this.d = list;
        this.c = 0;
        if (list.isEmpty()) {
            return;
        }
        ln80 ln80Var = this.b;
        ShoppableCardView shoppableCardView = ln80Var.b;
        this.e = shoppableCardView;
        this.f = ln80Var.c;
        shoppableCardView.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        shoppableCardView.setAlpha(1.0f);
        ShoppableCardView shoppableCardView2 = this.f;
        shoppableCardView2.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        shoppableCardView2.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.e.P4(mh0.a(list.get(0)));
        qej0 qej0Var = this.h;
        if (qej0Var != null) {
            qej0Var.b(list.get(0));
        }
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new a());
            return;
        }
        AnimatorSet animatorSet4 = this.g;
        if (animatorSet4 != null) {
            animatorSet4.cancel();
        }
        AnimatorSet a2 = a(this);
        this.g = a2;
        a2.start();
    }

    public final void setImageLoader(zjw zjwVar) {
        ln80 ln80Var = this.b;
        ln80Var.b.setImageLoader(zjwVar);
        ln80Var.c.setImageLoader(zjwVar);
    }

    public final void setListener(qej0 qej0Var) {
        this.h = qej0Var;
    }

    public ShoppableAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public ShoppableAdView(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 8, 0);
    }

    public /* synthetic */ ShoppableAdView(Context context, AttributeSet attributeSet, int i2, int i3, int i4) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2, 0);
    }

    public ShoppableAdView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        LayoutInflater.from(context).inflate(R.layout.one_video_shoppable_ad_view, this);
        int i4 = R.id.firstCard;
        ShoppableCardView shoppableCardView = (ShoppableCardView) k9q0.j(R.id.firstCard, this);
        if (shoppableCardView != null) {
            i4 = R.id.secondCard;
            ShoppableCardView shoppableCardView2 = (ShoppableCardView) k9q0.j(R.id.secondCard, this);
            if (shoppableCardView2 != null) {
                this.b = new ln80(this, shoppableCardView, shoppableCardView2);
                this.d = EmptyList.b;
                this.e = shoppableCardView;
                this.f = shoppableCardView2;
                setClipChildren(false);
                setOnClickListener(new mn9(this, 7));
                return;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i4)));
    }
}
