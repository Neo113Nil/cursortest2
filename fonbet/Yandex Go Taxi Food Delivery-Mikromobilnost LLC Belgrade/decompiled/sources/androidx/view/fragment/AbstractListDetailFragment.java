package androidx.view.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.b;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.a;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import defpackage.h550;
import defpackage.jl40;
import defpackage.k2i0;
import defpackage.l8;
import defpackage.mx60;
import defpackage.qah0;
import defpackage.uvg0;
import defpackage.yci0;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001:\u0001.B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0017¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00112\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00112\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u0019\u0010\u001c\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\bH\u0017¢\u0006\u0004\b\u001f\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010#\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0011\u0010+\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0011\u0010-\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b,\u0010\u0017¨\u0006/"}, d2 = {"Landroidx/navigation/fragment/AbstractListDetailFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onInflate", "(Landroid/content/Context;Landroid/util/AttributeSet;Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onCreateListPaneView", "Landroidx/navigation/fragment/NavHostFragment;", "onCreateDetailPaneNavHostFragment", "()Landroidx/navigation/fragment/NavHostFragment;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onListPaneViewCreated", "onViewStateRestored", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "Lmx60;", "onBackPressedCallback", "Lmx60;", "_detailPaneNavHostFragment", "Landroidx/navigation/fragment/NavHostFragment;", "", "graphId", CA20Status.STATUS_USER_I, "Landroidx/slidingpanelayout/widget/SlidingPaneLayout;", "getSlidingPaneLayout", "()Landroidx/slidingpanelayout/widget/SlidingPaneLayout;", "slidingPaneLayout", "getDetailPaneNavHostFragment", "detailPaneNavHostFragment", "l8", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class AbstractListDetailFragment extends Fragment {
    private NavHostFragment _detailPaneNavHostFragment;
    private int graphId;
    private mx60 onBackPressedCallback;

    public final NavHostFragment getDetailPaneNavHostFragment() {
        NavHostFragment navHostFragment = this._detailPaneNavHostFragment;
        if (navHostFragment != null) {
            return navHostFragment;
        }
        yci0.n("Fragment ", this, " was called before onCreateView().");
        return null;
    }

    public final SlidingPaneLayout getSlidingPaneLayout() {
        return (SlidingPaneLayout) requireView();
    }

    public NavHostFragment onCreateDetailPaneNavHostFragment() {
        int i = this.graphId;
        if (i == 0) {
            return new NavHostFragment();
        }
        NavHostFragment.Companion.getClass();
        return h550.a(i, null);
    }

    public abstract View onCreateListPaneView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState);

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        NavHostFragment onCreateDetailPaneNavHostFragment;
        if (savedInstanceState != null) {
            this.graphId = savedInstanceState.getInt(NavHostFragment.KEY_GRAPH_ID);
        }
        final SlidingPaneLayout slidingPaneLayout = new SlidingPaneLayout(inflater.getContext());
        slidingPaneLayout.setId(qah0.sliding_pane_layout);
        View onCreateListPaneView = onCreateListPaneView(inflater, slidingPaneLayout, savedInstanceState);
        if (!jl40.l(onCreateListPaneView, slidingPaneLayout) && !jl40.l(onCreateListPaneView.getParent(), slidingPaneLayout)) {
            slidingPaneLayout.addView(onCreateListPaneView);
        }
        FragmentContainerView fragmentContainerView = new FragmentContainerView(inflater.getContext());
        fragmentContainerView.setId(qah0.sliding_pane_detail_container);
        SlidingPaneLayout.LayoutParams layoutParams = new SlidingPaneLayout.LayoutParams(inflater.getContext().getResources().getDimensionPixelSize(uvg0.sliding_pane_detail_pane_width), -1);
        layoutParams.weight = 1.0f;
        slidingPaneLayout.addView(fragmentContainerView, layoutParams);
        Fragment E = getChildFragmentManager().E(qah0.sliding_pane_detail_container);
        if (E != null) {
            onCreateDetailPaneNavHostFragment = (NavHostFragment) E;
        } else {
            onCreateDetailPaneNavHostFragment = onCreateDetailPaneNavHostFragment();
            a aVar = new a(getChildFragmentManager());
            aVar.p = true;
            aVar.f(qah0.sliding_pane_detail_container, onCreateDetailPaneNavHostFragment, null, 1);
            aVar.d();
        }
        this._detailPaneNavHostFragment = onCreateDetailPaneNavHostFragment;
        this.onBackPressedCallback = new l8(slidingPaneLayout);
        WeakHashMap weakHashMap = b.a;
        if (!slidingPaneLayout.isLaidOut() || slidingPaneLayout.isLayoutRequested()) {
            slidingPaneLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: androidx.navigation.fragment.AbstractListDetailFragment$onCreateView$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    AbstractListDetailFragment.this.onBackPressedCallback.h(slidingPaneLayout.isSlideable() && slidingPaneLayout.isOpen());
                }
            });
        } else {
            this.onBackPressedCallback.h(slidingPaneLayout.isSlideable() && slidingPaneLayout.isOpen());
        }
        requireActivity().getOnBackPressedDispatcher().a(getViewLifecycleOwner(), this.onBackPressedCallback);
        return slidingPaneLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public void onInflate(Context context, AttributeSet attrs, Bundle savedInstanceState) {
        super.onInflate(context, attrs, savedInstanceState);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, k2i0.NavHost);
        int resourceId = obtainStyledAttributes.getResourceId(k2i0.NavHost_navGraph, 0);
        if (resourceId != 0) {
            this.graphId = resourceId;
        }
        obtainStyledAttributes.recycle();
    }

    public void onListPaneViewCreated(View view, Bundle savedInstanceState) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        int i = this.graphId;
        if (i != 0) {
            outState.putInt(NavHostFragment.KEY_GRAPH_ID, i);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        onListPaneViewCreated(getSlidingPaneLayout().getChildAt(0), savedInstanceState);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        this.onBackPressedCallback.h(getSlidingPaneLayout().isSlideable() && getSlidingPaneLayout().isOpen());
    }
}
