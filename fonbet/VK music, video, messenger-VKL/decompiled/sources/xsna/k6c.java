package xsna;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import xsna.bbv0;

/* compiled from: CheckoutOnboardingFragment.kt */
/* loaded from: classes6.dex */
public final class k6c extends bb6<i6c> implements iv5 {
    public l6c i;
    public ViewPager2 j;
    public View k;
    public AppCompatCheckBox l;
    public TabLayout m;
    public TextView n;
    public View o;
    public final a p = new a();

    /* compiled from: CheckoutOnboardingFragment.kt */
    public static final class a extends ViewPager2.g {
        public a() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void onPageSelected(int i) {
            k6c k6cVar = k6c.this;
            TabLayout tabLayout = k6cVar.m;
            if (tabLayout == null) {
                tabLayout = null;
            }
            boolean z = i == tabLayout.getTabCount() - 1;
            i6c i6cVar = (i6c) k6cVar.h;
            if (i6cVar != null) {
                i6cVar.p0(z);
            }
        }
    }

    @Override // xsna.gi6, xsna.iv5
    public final boolean a0() {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return true;
        }
        activity.setRequestedOrientation(-1);
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.h = new n6c(this, new l2l0());
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.vk_pay_checkout_onboarding_fragment, viewGroup, false);
    }

    @Override // xsna.gi6, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ebv0 ebv0Var;
        View view;
        ViewPager2 viewPager2 = this.j;
        if (viewPager2 == null) {
            viewPager2 = null;
        }
        viewPager2.g(this.p);
        super.onDestroyView();
        bbv0.g.getClass();
        gbv0 gbv0Var = bbv0.a.f().d;
        if (gbv0Var == null || (ebv0Var = gbv0Var.a.get()) == null || (view = ebv0Var.E) == null) {
            return;
        }
        uwt0.a(iah0.a(56), view);
    }

    @Override // xsna.gi6, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setRequestedOrientation(1);
        }
    }

    @Override // xsna.gi6, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ebv0 ebv0Var;
        View view2;
        super.onViewCreated(view, bundle);
        this.o = view.findViewById(R.id.rootOnboarding);
        this.j = (ViewPager2) view.findViewById(R.id.vpOnboarding);
        this.l = (AppCompatCheckBox) view.findViewById(R.id.cbOnboarding);
        this.m = (TabLayout) view.findViewById(R.id.tlOnboarding);
        this.n = (TextView) view.findViewById(R.id.btnOnboarding);
        this.k = view.findViewById(R.id.fullSizeBack);
        View view3 = this.o;
        if (view3 == null) {
            view3 = null;
        }
        view3.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, Math.min(iah0.z(view3.getContext()), 1073741823)), 1073741824), tr.a(0, 1073741823, 0, 0));
        view3.getMeasuredHeight();
        i6c i6cVar = (i6c) this.h;
        if (i6cVar != null) {
            i6cVar.h0();
        }
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(krv0.f(R.drawable.vk_icon_arrow_left_outline_28, R.attr.vk_legacy_header_tint, toolbar.getContext()));
        toolbar.setNavigationOnClickListener(new j6c());
        bbv0.g.getClass();
        gbv0 gbv0Var = bbv0.a.f().d;
        if (gbv0Var != null && (ebv0Var = gbv0Var.a.get()) != null && (view2 = ebv0Var.E) != null) {
            uwt0.a(0, view2);
        }
        View view4 = this.k;
        View view5 = view4 == null ? null : view4;
        ViewGroup.LayoutParams layoutParams = (view4 != null ? view4 : null).getLayoutParams();
        layoutParams.height = iah0.f().heightPixels;
        view5.setLayoutParams(layoutParams);
    }

    public final void un() {
        TextView textView = this.n;
        if (textView == null) {
            textView = null;
        }
        textView.setOnClickListener(new um3(this, 1));
        View view = (View) new WeakReference(textView).get();
        if (view != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 1.0f);
            ofFloat.setDuration(450L);
            ofFloat.start();
        }
    }
}
