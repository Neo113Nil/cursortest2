package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import defpackage.fwg0;
import defpackage.ijh0;
import defpackage.l8;
import defpackage.mbh0;
import defpackage.mx60;
import defpackage.ny61;
import defpackage.qw4;
import defpackage.qx60;
import defpackage.rx60;
import defpackage.wwg;
import java.util.WeakHashMap;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001:\u00011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\tH\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010 \u001a\u00020\u001f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0017¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0011H&¢\u0006\u0004\b\"\u0010#J!\u0010%\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0017¢\u0006\u0004\b%\u0010&J\u0019\u0010'\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b'\u0010(J\u0011\u0010)\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b)\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0011\u00100\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00062"}, d2 = {"Landroidx/preference/PreferenceHeaderFragmentCompat;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroidx/slidingpanelayout/widget/SlidingPaneLayout;", "buildContentView", "(Landroid/view/LayoutInflater;)Landroidx/slidingpanelayout/widget/SlidingPaneLayout;", "Landroidx/preference/Preference;", "header", "Lzy11;", "openPreferenceHeader", "(Landroidx/preference/Preference;)V", "Landroid/content/Intent;", "intent", "(Landroid/content/Intent;)V", "Landroidx/preference/PreferenceFragmentCompat;", "caller", "pref", "", "onPreferenceStartFragment", "(Landroidx/preference/PreferenceFragmentCompat;Landroidx/preference/Preference;)Z", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onCreatePreferenceHeader", "()Landroidx/preference/PreferenceFragmentCompat;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onViewStateRestored", "(Landroid/os/Bundle;)V", "onCreateInitialDetailFragment", "()Landroidx/fragment/app/Fragment;", "Lmx60;", "onBackPressedCallback", "Lmx60;", "getSlidingPaneLayout", "()Landroidx/slidingpanelayout/widget/SlidingPaneLayout;", "slidingPaneLayout", "l8", "preference_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class PreferenceHeaderFragmentCompat extends Fragment {
    private mx60 onBackPressedCallback;

    private final SlidingPaneLayout buildContentView(LayoutInflater inflater) {
        SlidingPaneLayout slidingPaneLayout = new SlidingPaneLayout(inflater.getContext());
        slidingPaneLayout.setId(mbh0.preferences_sliding_pane_layout);
        FragmentContainerView fragmentContainerView = new FragmentContainerView(inflater.getContext());
        fragmentContainerView.setId(mbh0.preferences_header);
        SlidingPaneLayout.LayoutParams layoutParams = new SlidingPaneLayout.LayoutParams(getResources().getDimensionPixelSize(fwg0.preferences_header_width), -1);
        layoutParams.weight = getResources().getInteger(ijh0.preferences_header_pane_weight);
        slidingPaneLayout.addView(fragmentContainerView, layoutParams);
        FragmentContainerView fragmentContainerView2 = new FragmentContainerView(inflater.getContext());
        fragmentContainerView2.setId(mbh0.preferences_detail);
        SlidingPaneLayout.LayoutParams layoutParams2 = new SlidingPaneLayout.LayoutParams(getResources().getDimensionPixelSize(fwg0.preferences_detail_width), -1);
        layoutParams2.weight = getResources().getInteger(ijh0.preferences_detail_pane_weight);
        slidingPaneLayout.addView(fragmentContainerView2, layoutParams2);
        return slidingPaneLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-10, reason: not valid java name */
    public static final void m101onViewCreated$lambda10(PreferenceHeaderFragmentCompat preferenceHeaderFragmentCompat) {
        preferenceHeaderFragmentCompat.onBackPressedCallback.h(preferenceHeaderFragmentCompat.getChildFragmentManager().K() == 0);
    }

    private final void openPreferenceHeader(Preference header) {
        String str = header.F;
        if (str == null) {
            openPreferenceHeader(header.E);
            return;
        }
        Fragment a = getChildFragmentManager().M().a(requireContext().getClassLoader(), str);
        if (a != null) {
            a.setArguments(header.d());
        }
        if (getChildFragmentManager().K() > 0) {
            getChildFragmentManager().X(((androidx.fragment.app.a) getChildFragmentManager().J(0)).t, false);
        }
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(getChildFragmentManager());
        aVar.p = true;
        aVar.h(mbh0.preferences_detail, a, null);
        if (getSlidingPaneLayout().isOpen()) {
            aVar.f = 4099;
        }
        getSlidingPaneLayout().openPane();
        aVar.d();
    }

    public final SlidingPaneLayout getSlidingPaneLayout() {
        return (SlidingPaneLayout) requireView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(getParentFragmentManager());
        aVar.r(this);
        aVar.d();
    }

    public Fragment onCreateInitialDetailFragment() {
        Fragment E = getChildFragmentManager().E(mbh0.preferences_header);
        if (E == null) {
            ny61.t("null cannot be cast to non-null type androidx.preference.PreferenceFragmentCompat");
            return null;
        }
        PreferenceFragmentCompat preferenceFragmentCompat = (PreferenceFragmentCompat) E;
        if (preferenceFragmentCompat.getPreferenceScreen().j0.size() > 0) {
            int size = preferenceFragmentCompat.getPreferenceScreen().j0.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                Preference B = preferenceFragmentCompat.getPreferenceScreen().B(i);
                String str = B.F;
                if (str != null) {
                    Fragment a = getChildFragmentManager().M().a(requireContext().getClassLoader(), str);
                    if (a == null) {
                        return a;
                    }
                    a.setArguments(B.d());
                    return a;
                }
                i = i2;
            }
        }
        return null;
    }

    public abstract PreferenceFragmentCompat onCreatePreferenceHeader();

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        SlidingPaneLayout buildContentView = buildContentView(inflater);
        if (getChildFragmentManager().E(mbh0.preferences_header) == null) {
            PreferenceFragmentCompat onCreatePreferenceHeader = onCreatePreferenceHeader();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(getChildFragmentManager());
            aVar.p = true;
            aVar.f(mbh0.preferences_header, onCreatePreferenceHeader, null, 1);
            aVar.d();
        }
        buildContentView.setLockMode(3);
        return buildContentView;
    }

    public boolean onPreferenceStartFragment(PreferenceFragmentCompat caller, Preference pref) {
        if (caller.getId() == mbh0.preferences_header) {
            openPreferenceHeader(pref);
            return true;
        }
        if (caller.getId() != mbh0.preferences_detail) {
            return false;
        }
        Fragment a = getChildFragmentManager().M().a(requireContext().getClassLoader(), pref.F);
        a.setArguments(pref.d());
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(getChildFragmentManager());
        aVar.p = true;
        aVar.h(mbh0.preferences_detail, a, null);
        aVar.f = 4099;
        aVar.c(null);
        aVar.d();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        qx60 onBackPressedDispatcher;
        super.onViewCreated(view, savedInstanceState);
        this.onBackPressedCallback = new l8(this);
        SlidingPaneLayout slidingPaneLayout = getSlidingPaneLayout();
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        int i = 1;
        if (!slidingPaneLayout.isLaidOut() || slidingPaneLayout.isLayoutRequested()) {
            slidingPaneLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: androidx.preference.PreferenceHeaderFragmentCompat$onViewCreated$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view2.removeOnLayoutChangeListener(this);
                    PreferenceHeaderFragmentCompat.this.onBackPressedCallback.h(PreferenceHeaderFragmentCompat.this.getSlidingPaneLayout().isSlideable() && PreferenceHeaderFragmentCompat.this.getSlidingPaneLayout().isOpen());
                }
            });
        } else {
            this.onBackPressedCallback.h(getSlidingPaneLayout().isSlideable() && getSlidingPaneLayout().isOpen());
        }
        getChildFragmentManager().o.add(new qw4(i, this));
        rx60 r = wwg.r(view);
        if (r == null || (onBackPressedDispatcher = r.getOnBackPressedDispatcher()) == null) {
            return;
        }
        onBackPressedDispatcher.a(getViewLifecycleOwner(), this.onBackPressedCallback);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(Bundle savedInstanceState) {
        Fragment onCreateInitialDetailFragment;
        super.onViewStateRestored(savedInstanceState);
        if (savedInstanceState != null || (onCreateInitialDetailFragment = onCreateInitialDetailFragment()) == null) {
            return;
        }
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(getChildFragmentManager());
        aVar.p = true;
        aVar.h(mbh0.preferences_detail, onCreateInitialDetailFragment, null);
        aVar.d();
    }

    private final void openPreferenceHeader(Intent intent) {
        if (intent == null) {
            return;
        }
        startActivity(intent);
    }
}
