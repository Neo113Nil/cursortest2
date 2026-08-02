package one.video.ad.ux.postview;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.movika.sdk.android.defaultplayer.utils.c;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.builders.ListBuilder;
import one.video.ad.ux.AdRedirectView;
import xsna.asp;
import xsna.bk80;
import xsna.ck80;
import xsna.e43;
import xsna.gq9;
import xsna.ih7;
import xsna.k9q0;
import xsna.kiw;
import xsna.n9c0;
import xsna.sc0;
import xsna.x5r0;
import xsna.zjw;
import xsna.zrp;

/* compiled from: AdPostView.kt */
/* loaded from: classes8.dex */
public final class AdPostView extends ConstraintLayout implements n9c0 {
    public final bk80 t;
    public zjw u;
    public gq9 v;
    public final AnimatorSet w;
    public final AdPostView x;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AdPostView.kt */
    public static final class ViewType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ViewType[] $VALUES;
        public static final ViewType LARGE;
        public static final ViewType SMALL;

        static {
            ViewType viewType = new ViewType("SMALL", 0);
            SMALL = viewType;
            ViewType viewType2 = new ViewType("LARGE", 1);
            LARGE = viewType2;
            ViewType[] viewTypeArr = {viewType, viewType2};
            $VALUES = viewTypeArr;
            $ENTRIES = new asp(viewTypeArr);
        }

        public ViewType() {
            throw null;
        }

        public static ViewType valueOf(String str) {
            return (ViewType) Enum.valueOf(ViewType.class, str);
        }

        public static ViewType[] values() {
            return (ViewType[]) $VALUES.clone();
        }
    }

    /* compiled from: AdPostView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ViewType.values().length];
            try {
                iArr[ViewType.SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ViewType.LARGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: AdPostView.kt */
    public static final class b implements zjw.a {
        public b() {
        }

        @Override // xsna.zjw.a
        public final void a(Bitmap bitmap) {
            AdPostView adPostView = AdPostView.this;
            adPostView.setBackground(new BitmapDrawable(adPostView.getResources(), bitmap));
        }

        @Override // xsna.zjw.a
        public final void onError() {
            AdPostView.this.setBackground(null);
        }
    }

    public AdPostView(Context context) {
        this(context, null, 0, 14, 0);
    }

    @Override // xsna.n9c0
    public final void N2(int i) {
        this.t.c.b.d.setProgress(i);
    }

    @Override // xsna.n9c0
    public ViewGroup getView() {
        return this.x;
    }

    @Override // xsna.n9c0
    public final void h0(boolean z) {
        setVisibility(0);
        AnimatorSet animatorSet = this.w;
        animatorSet.cancel();
        ck80 ck80Var = this.t.c.b;
        ck80Var.c.setVisibility(0);
        ck80Var.d.setVisibility(0);
        if (z) {
            animatorSet.start();
        }
    }

    @Override // xsna.n9c0
    public final void hide() {
        this.w.cancel();
        ck80 ck80Var = this.t.c.b;
        ck80Var.d.setProgress(0);
        ck80Var.d.setVisibility(8);
        setVisibility(8);
    }

    @Override // xsna.n9c0
    public final void n4(sc0 sc0Var, c cVar) {
        String str;
        bk80 bk80Var = this.t;
        bk80Var.c.a(sc0Var.h, AdRedirectView.Type.POST_VIEW);
        bk80Var.d.setText((String) cVar.b);
        Integer num = (Integer) cVar.c;
        if (num != null) {
            bk80Var.b.setBackgroundColor(num.intValue());
        }
        kiw kiwVar = (kiw) cVar.a;
        if (kiwVar == null || (str = kiwVar.a) == null) {
            return;
        }
        gq9 gq9Var = this.v;
        if (gq9Var != null) {
            gq9Var.cancel();
        }
        zjw zjwVar = this.u;
        if (zjwVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.v = zjwVar.a(Uri.parse(str), new b(), new ih7());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        gq9 gq9Var = this.v;
        if (gq9Var != null) {
            gq9Var.cancel();
        }
        this.v = null;
    }

    @Override // xsna.n9c0
    public final void pause() {
        this.w.pause();
    }

    @Override // xsna.n9c0
    public final void resume() {
        this.w.resume();
    }

    public final void setBtnClickListener(View.OnClickListener onClickListener) {
        this.t.c.setBtnClickListener(onClickListener);
    }

    public void setImageLoader(zjw zjwVar) {
        this.u = zjwVar;
        this.t.c.setImageLoader(zjwVar);
    }

    public final void setViewType(ViewType viewType) {
        float f;
        int i;
        bk80 bk80Var = this.t;
        AppCompatTextView appCompatTextView = bk80Var.d;
        int[] iArr = a.$EnumSwitchMapping$0;
        int i2 = iArr[viewType.ordinal()];
        if (i2 == 1) {
            f = 16.0f;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f = 22.0f;
        }
        appCompatTextView.setTextSize(f);
        Object obj = x5r0.a;
        int i3 = iArr[viewType.ordinal()];
        if (i3 == 1) {
            i = 8;
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = 10;
        }
        int a2 = (int) x5r0.a(i, 1);
        x5r0.d(a2, bk80Var.d);
        x5r0.g(a2, bk80Var.c);
    }

    public AdPostView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public AdPostView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ AdPostView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    public AdPostView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        LayoutInflater.from(context).inflate(R.layout.one_video_ad_post_view, this);
        int i3 = R.id.cover;
        FrameLayout frameLayout = (FrameLayout) k9q0.j(R.id.cover, this);
        if (frameLayout != null) {
            i3 = R.id.redirect;
            AdRedirectView adRedirectView = (AdRedirectView) k9q0.j(R.id.redirect, this);
            if (adRedirectView != null) {
                i3 = R.id.title;
                AppCompatTextView appCompatTextView = (AppCompatTextView) k9q0.j(R.id.title, this);
                if (appCompatTextView != null) {
                    this.t = new bk80(this, frameLayout, adRedirectView, appCompatTextView);
                    AnimatorSet animatorSet = new AnimatorSet();
                    this.w = animatorSet;
                    ListBuilder e = e43.e();
                    float[] fArr = {150.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
                    Property property = View.TRANSLATION_Y;
                    e.add(ObjectAnimator.ofFloat(adRedirectView, (Property<AdRedirectView, Float>) property, fArr));
                    e.add(ObjectAnimator.ofFloat(appCompatTextView, (Property<AppCompatTextView, Float>) property, 150.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                    float[] fArr2 = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f};
                    Property property2 = View.ALPHA;
                    e.add(ObjectAnimator.ofFloat(adRedirectView, (Property<AdRedirectView, Float>) property2, fArr2));
                    e.add(ObjectAnimator.ofFloat(appCompatTextView, (Property<AppCompatTextView, Float>) property2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f));
                    ListBuilder g = e.g();
                    animatorSet.setDuration(500L);
                    animatorSet.playTogether(g);
                    animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
                    this.x = this;
                    return;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i3)));
    }
}
