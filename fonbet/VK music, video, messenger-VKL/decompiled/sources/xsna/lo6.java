package xsna;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.stickers.api.styles.ServiceStickerStyle;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import xsna.lri0;

/* compiled from: BaseStickerStyleSwitchingView.kt */
/* loaded from: classes6.dex */
public abstract class lo6<Style, StickerInfo> extends FrameLayout {
    public final Style b;
    public final lri0 c;
    public boolean d;
    public boolean e;
    public StickerInfo f;
    public List<? extends Style> g;
    public Style h;
    public final LinkedHashMap i;
    public c8l0<StickerInfo> j;

    /* JADX WARN: Multi-variable type inference failed */
    public lo6(Context context, AttributeSet attributeSet, Object obj, lri0 lri0Var) {
        super(context, attributeSet, 0);
        this.b = obj;
        this.c = lri0Var;
        this.g = getAllStyles();
        this.h = obj;
        this.i = new LinkedHashMap();
        this.j = b(this.h);
        bwt0.b0(17, this);
    }

    public static ValueAnimator a(lo6 lo6Var, View view) {
        new zj(3);
        view.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        view.setVisibility(0);
        ValueAnimator duration = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f).setDuration(100L);
        duration.addUpdateListener(new io6(view, 0));
        duration.addListener(new jo6());
        return duration;
    }

    private final void setCurrentView(c8l0<StickerInfo> c8l0Var) {
        if (this.d || this.e) {
            View view = this.j.getView();
            View view2 = c8l0Var.getView();
            if (epx.f(view, view2)) {
                if (view2.getParent() == null) {
                    addView(view2);
                }
                a(this, view2).start();
            } else {
                int i = 0;
                go6 go6Var = new go6(this, view, view2, i);
                view.setAlpha(1.0f);
                ValueAnimator duration = ValueAnimator.ofFloat(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(100L);
                duration.addUpdateListener(new ho6(view, i));
                duration.addListener(new ko6(view, go6Var));
                ValueAnimator a = a(this, view2);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playSequentially(duration, a);
                animatorSet.start();
            }
            performHapticFeedback(16, 1);
        } else {
            removeAllViews();
            bwt0.p0(c8l0Var.getView(), true);
            addView(c8l0Var.getView());
        }
        this.j = c8l0Var;
        c8l0Var.update(this.f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final c8l0<StickerInfo> b(Style style) {
        LinkedHashMap linkedHashMap = this.i;
        c8l0<StickerInfo> c8l0Var = (c8l0) linkedHashMap.get(style);
        if (c8l0Var != null) {
            return c8l0Var;
        }
        Context context = getContext();
        this.c.getClass();
        ServiceStickerStyle serviceStickerStyle = (ServiceStickerStyle) style;
        if (lri0.a.$EnumSwitchMapping$0[serviceStickerStyle.ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        kdm0 kdm0Var = new kdm0(context);
        bwt0.Q(kdm0Var, R.id.service_sticker_style_auto_test, serviceStickerStyle);
        kdm0Var.getView().setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        f4m.m(17, kdm0Var.getView());
        kdm0Var.getView().setVisibility(8);
        linkedHashMap.put(style, kdm0Var);
        return kdm0Var;
    }

    public abstract List<Style> getAllStyles();

    public final boolean getAnimateChanges() {
        return this.d;
    }

    public final List<Style> getAvailableStyles() {
        return this.g;
    }

    public final StickerInfo getCurrentInfo() {
        return this.f;
    }

    public final Style getCurrentStyle() {
        return this.h;
    }

    public final Map<Style, c8l0<StickerInfo>> getViewsCache() {
        return this.i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.i.clear();
    }

    public final void setAnimateChanges(boolean z) {
        this.d = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setAvailableStyles(List<? extends Style> list) {
        List<? extends Style> list2 = list;
        if (list2.isEmpty()) {
            list2 = Collections.singletonList(this.b);
        }
        this.g = list2;
        if (this.e) {
            removeAllViews();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                c8l0 b = b(it.next());
                addView(b.getView());
                b.update(this.f);
            }
        }
        setCurrentStyle(this.g.contains(this.h) ? this.h : (Style) j5g.Y(this.g));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setCurrentInfo(StickerInfo stickerinfo) {
        this.f = stickerinfo;
        if (!this.e) {
            this.j.update(stickerinfo);
            return;
        }
        Iterator<T> it = this.g.iterator();
        while (it.hasNext()) {
            b(it.next()).update(stickerinfo);
        }
    }

    public final void setCurrentStyle(Style style) {
        if (this.g.contains(this.h)) {
            this.h = style;
            setCurrentView(b(style));
            announceForAccessibility(this.j.getView().getContentDescription());
        }
    }

    public final void setPreloadStyles(boolean z) {
        if (this.e == z) {
            return;
        }
        this.e = z;
        setAvailableStyles(this.g);
    }
}
