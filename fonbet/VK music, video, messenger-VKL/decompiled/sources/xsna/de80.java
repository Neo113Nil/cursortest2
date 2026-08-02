package xsna;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.vk.superapp.base.js.bridge.data.OnboardingModalArguments;
import com.vk.superapp.base.js.bridge.data.OnboardingStep;
import com.vk.superapp.common.js.bridge.api.events.ShowSlidesSheet$Response;
import com.vkontakte.android.R;
import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.dw20;

/* compiled from: OnboardingModalBottomSheet.kt */
/* loaded from: classes6.dex */
public final class de80 extends dw20 {
    public static final /* synthetic */ int p1 = 0;
    public final bpn0 f1 = new bpn0(new l500(this, 19));
    public final bpn0 g1 = new bpn0(new os30(this, 10));
    public int h1;
    public TextView i1;
    public TextView j1;
    public ViewPager2 k1;
    public TabLayout l1;
    public final jzt0 m1;
    public defpackage.n0 n1;
    public boolean o1;

    /* compiled from: OnboardingModalBottomSheet.kt */
    public static final class a extends dw20.b {
        public final OnboardingModalArguments e;
        public final defpackage.n0 f;

        public a(OnboardingModalArguments onboardingModalArguments, Context context, defpackage.n0 n0Var) {
            super(context, null);
            this.e = onboardingModalArguments;
            this.f = n0Var;
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            View inflate = LayoutInflater.from(this.c).inflate(R.layout.vk_universal_onboarding_view, (ViewGroup) null, false);
            Bundle bundle = new Bundle();
            bundle.putParcelable(fpf0.a(OnboardingModalArguments.class).l(), this.e);
            Context context = this.c;
            y(enj.c(R.drawable.vk_bg_radius_12, e3m.f(R.attr.vk_ui_background_modal, context), context));
            ((dw20.b) D0(inflate, false).P0().J()).F0(true).q0(false).x(0).u(0).I(true).c(new d5j(inflate)).e0(new ce80()).f0(new dl70(1));
            de80 de80Var = new de80();
            de80Var.setArguments(bundle);
            de80Var.n1 = this.f;
            return de80Var;
        }
    }

    public de80() {
        jzt0 jzt0Var = new jzt0();
        jzt0Var.c = EmptyList.b;
        this.m1 = jzt0Var;
    }

    public final void Yn() {
        int i = this.h1;
        bpn0 bpn0Var = this.g1;
        if (i >= ((List) bpn0Var.getValue()).size()) {
            this.o1 = true;
            defpackage.n0 n0Var = this.n1;
            if (n0Var != null) {
                n0Var.a.X0(ShowSlidesSheet$Response.Data.Action.CONFIRM, null);
            }
            dismiss();
            return;
        }
        OnboardingStep onboardingStep = (OnboardingStep) ((List) bpn0Var.getValue()).get(i);
        ViewPager2 viewPager2 = this.k1;
        if (viewPager2 != null) {
            viewPager2.e(i, true);
        }
        TextView textView = this.i1;
        if (textView != null) {
            textView.setText(onboardingStep.d);
        }
        TextView textView2 = this.j1;
        if (textView2 != null) {
            textView2.setText(onboardingStep.f);
        }
    }

    @Override // xsna.dw20, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        dismiss();
    }

    @Override // xsna.dw20, xsna.dh6, androidx.fragment.app.d, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        defpackage.n0 n0Var;
        super.onDismiss(dialogInterface);
        if (this.o1 || (n0Var = this.n1) == null) {
            return;
        }
        n0Var.a();
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        OnboardingModalArguments onboardingModalArguments;
        super.onViewStateRestored(bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (onboardingModalArguments = (OnboardingModalArguments) arguments.getParcelable(fpf0.a(OnboardingModalArguments.class).l())) == null) {
            return;
        }
        List<OnboardingStep> list = onboardingModalArguments.b;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (OnboardingStep onboardingStep : list) {
                if (onboardingStep.h == null && onboardingStep.g == null) {
                    return;
                }
            }
        }
        defpackage.n0 n0Var = this.n1;
        if (n0Var != null) {
            n0Var.a();
        }
        dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.dw20, xsna.c33, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        q0o0 q0o0Var = this instanceof q0o0 ? (q0o0) this : null;
        prw.h(this, q0o0Var != null ? q0o0Var.tag() : "VkSdkDialogFragment", null);
        Dialog yn = super.yn(bundle);
        this.l1 = (TabLayout) yn.findViewById(R.id.tab_layout);
        ViewPager2 viewPager2 = (ViewPager2) yn.findViewById(R.id.view_pager);
        jzt0 jzt0Var = this.m1;
        viewPager2.setAdapter(jzt0Var);
        viewPager2.setOffscreenPageLimit(2);
        bpn0 bpn0Var = this.g1;
        jzt0Var.c = (List) bpn0Var.getValue();
        jzt0Var.notifyDataSetChanged();
        viewPager2.setUserInputEnabled(false);
        TabLayout tabLayout = this.l1;
        if (tabLayout != null) {
            new com.google.android.material.tabs.c(tabLayout, viewPager2, new ar(25)).a();
        }
        this.k1 = viewPager2;
        TabLayout tabLayout2 = this.l1;
        if (tabLayout2 != null) {
            tabLayout2.g(new b());
        }
        TabLayout tabLayout3 = this.l1;
        if (tabLayout3 != null) {
            tabLayout3.setVisibility(((List) bpn0Var.getValue()).size() <= 1 ? 8 : 0);
        }
        TextView textView = (TextView) yn.findViewById(R.id.button_positive);
        jjc.g(textView, new l6u(this, 24));
        this.i1 = textView;
        TextView textView2 = (TextView) yn.findViewById(R.id.button_negative);
        jjc.g(textView2, new tn0(21, this, (b33) yn));
        this.j1 = textView2;
        Yn();
        return yn;
    }

    /* compiled from: OnboardingModalBottomSheet.kt */
    public static final class b implements TabLayout.d {
        public b() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void Wd(TabLayout.g gVar) {
            de80 de80Var = de80.this;
            TabLayout tabLayout = de80Var.l1;
            de80Var.h1 = tabLayout != null ? tabLayout.getSelectedTabPosition() : 0;
            de80Var.Yn();
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void hl(TabLayout.g gVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void za(TabLayout.g gVar) {
        }
    }
}
