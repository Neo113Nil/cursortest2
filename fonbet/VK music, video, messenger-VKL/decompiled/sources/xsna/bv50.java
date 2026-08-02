package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.my.target.nativeads.views.IconAdView;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.common.presentation.model.items.MyTargetNativeAdSinglePartUiDto;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.DisclaimerData;
import com.vkontakte.android.attachments.DisclaimerType;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;

/* compiled from: NativeAdCarouselDelegate.kt */
/* loaded from: classes4.dex */
public final class bv50 implements ii6 {
    public final View b;
    public final IconAdView c;
    public final FrameLayout d;
    public final FrameLayout e;
    public final ViewGroup f;
    public final s4e0 g;
    public final g11 h;
    public boolean i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final Object n;
    public final int o;

    /* compiled from: NativeAdCarouselDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DisclaimerType.values().length];
            try {
                iArr[DisclaimerType.DRUG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DisclaimerType.SUPPLEMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DisclaimerType.CREDITS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DisclaimerType.BANKRUPTCY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DisclaimerType.ENERGETICS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public bv50(View view) {
        this.b = view;
        IconAdView iconAdView = (IconAdView) view.findViewById(R.id.icon);
        this.c = iconAdView;
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.mediaViewContainer);
        this.d = frameLayout;
        this.e = (FrameLayout) view.findViewById(R.id.disclaimer_container);
        this.f = (ViewGroup) view.findViewById(R.id.description_container);
        s4e0 s4e0Var = new s4e0(view.getContext(), iah0.a(4));
        this.g = s4e0Var;
        g11 g11Var = new g11(view.getContext());
        this.h = g11Var;
        v100 v100Var = new v100(this, 6);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.j = msy.a(lazyThreadSafetyMode, v100Var);
        this.k = msy.a(lazyThreadSafetyMode, new fr20(this, 3));
        this.l = msy.a(lazyThreadSafetyMode, new odm(this, 29));
        this.m = msy.a(lazyThreadSafetyMode, new w100(this, 4));
        this.n = msy.a(lazyThreadSafetyMode, new a040(this, 4));
        this.o = dhr0.t.c(R.attr.vk_ui_text_secondary);
        iconAdView.setVisibility(0);
        s4e0Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        awt0.x(s4e0Var, e3m.a(R.dimen.post_side_padding, s4e0Var.getContext()), 0, e3m.a(R.dimen.post_side_padding, s4e0Var.getContext()), 0, 10);
        s4e0Var.setClipToPadding(false);
        s4e0Var.setPromoCardAdapter(g11Var);
        frameLayout.addView(s4e0Var);
        s4e0Var.setVisibility(8);
    }

    @Override // xsna.t0n
    public final View R0() {
        return this.d;
    }

    @Override // xsna.a1n
    public final void U5() {
        this.i = true;
    }

    @Override // xsna.ii6
    public final void dispose() {
        this.c.setVisibility(8);
        this.g.setVisibility(8);
        this.h.y0(EmptyList.b);
        this.e.setVisibility(8);
    }

    @Override // xsna.ii6
    public final s4e0 j0() {
        return this.g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.ii6
    public final void j2(NewsEntry newsEntry, MyTargetNativeAdSinglePartUiDto myTargetNativeAdSinglePartUiDto) {
        tsx0 tsx0Var = newsEntry instanceof tsx0 ? (tsx0) newsEntry : null;
        DisclaimerData N3 = tsx0Var != null ? tsx0Var.N3() : null;
        this.c.setVisibility(0);
        this.g.setVisibility(0);
        this.h.A0(myTargetNativeAdSinglePartUiDto.q, N3);
        this.b.post(new zs6(2, N3, this));
    }

    @Override // xsna.a1n
    public final boolean o5() {
        return this.i;
    }

    @Override // xsna.a1n
    public final void E2(DisclaimerData disclaimerData) {
    }
}
