package xsna;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.vk.clips.viewer.impl.feed.wrapper.domain.model.ClipsWrapperHeaderMode;
import com.vk.core.view.components.skeleton.VkSkeleton;
import com.vk.core.view.components.text.VkText;
import com.vk.core.view.shimmer.ThemableShimmer;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: ClipsHeaderView.kt */
/* loaded from: classes16.dex */
public final class ife extends FrameLayout {
    public final FrameLayout b;
    public final HorizontalScrollView c;
    public final LinearLayout d;
    public final VkText e;
    public final LinearLayout f;
    public final int g;
    public final int h;
    public ClipsWrapperHeaderMode i;
    public izs<? super Integer, s3q0> j;
    public List<String> k;
    public int l;
    public int m;
    public jfe n;
    public ThemableShimmer o;

    /* compiled from: ClipsHeaderView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClipsWrapperHeaderMode.values().length];
            try {
                iArr[ClipsWrapperHeaderMode.TABS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipsWrapperHeaderMode.SINGLE_TITLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClipsWrapperHeaderMode.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ife(Context context) {
        super(context, null, 0);
        this.i = ClipsWrapperHeaderMode.NONE;
        this.k = EmptyList.b;
        this.l = -1;
        LayoutInflater.from(context).inflate(R.layout.clips_header_view, (ViewGroup) this, true);
        this.b = (FrameLayout) findViewById(R.id.clips_header_before);
        this.c = (HorizontalScrollView) findViewById(R.id.clips_header_tabs_container);
        this.d = (LinearLayout) findViewById(R.id.clips_header_tabs);
        this.e = (VkText) findViewById(R.id.clips_header_title);
        this.f = (LinearLayout) findViewById(R.id.clips_header_after);
        this.g = e3m.f(R.attr.vk_ui_text_contrast, context);
        this.h = e3m.f(R.attr.vk_ui_text_primary_alpha, context);
        dhr0.a.getClass();
        this.o = new ThemableShimmer.a(dhr0.y()).a();
    }

    public final izs<Integer, s3q0> getOnTabClicked() {
        return this.j;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ValueAnimator valueAnimator;
        super.onDetachedFromWindow();
        ThemableShimmer themableShimmer = this.o;
        if (themableShimmer != null && (valueAnimator = themableShimmer.u) != null) {
            valueAnimator.cancel();
            valueAnimator.removeAllUpdateListeners();
        }
        this.o = null;
        jfe jfeVar = this.n;
        if (jfeVar != null) {
            this.c.getViewTreeObserver().removeOnPreDrawListener(jfeVar);
        }
        this.n = null;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        ThemableShimmer themableShimmer;
        super.onVisibilityChanged(view, i);
        if (view.equals(this) && this.i == ClipsWrapperHeaderMode.TABS) {
            LinearLayout linearLayout = this.d;
            if (linearLayout.getChildCount() == 0 || !(linearLayout.getChildAt(0) instanceof VkSkeleton)) {
                return;
            }
            if (i == 0) {
                ThemableShimmer themableShimmer2 = this.o;
                if (themableShimmer2 != null) {
                    themableShimmer2.b();
                    return;
                }
                return;
            }
            if ((i == 4 || i == 8) && (themableShimmer = this.o) != null) {
                themableShimmer.c();
            }
        }
    }

    public final void setOnTabClicked(izs<? super Integer, s3q0> izsVar) {
        this.j = izsVar;
    }
}
