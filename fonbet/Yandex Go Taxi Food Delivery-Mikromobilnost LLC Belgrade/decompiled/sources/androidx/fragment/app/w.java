package androidx.fragment.app;

import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.strictmode.WrongFragmentContainerViolation;
import androidx.fragment.app.strictmode.WrongNestedHierarchyViolation;
import defpackage.aes;
import defpackage.b8h0;
import defpackage.bes;
import defpackage.fot0;
import defpackage.gcs;
import defpackage.iot0;
import defpackage.jot0;
import defpackage.np31;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.rs31;
import defpackage.zds;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes.dex */
public final class w {
    public final o a;
    public final x b;
    public final Fragment c;
    public boolean d = false;
    public int e = -1;

    public w(o oVar, x xVar, ClassLoader classLoader, m mVar, Bundle bundle) {
        this.a = oVar;
        this.b = xVar;
        Fragment instantiate = ((FragmentState) bundle.getParcelable(ClidProvider.STATE)).instantiate(mVar, classLoader);
        this.c = instantiate;
        instantiate.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        instantiate.setArguments(bundle2);
        if (FragmentManager.O(2)) {
            Objects.toString(instantiate);
        }
    }

    public final void a() {
        View view;
        View view2;
        Fragment fragment = this.c;
        Fragment G = FragmentManager.G(fragment.mContainer);
        Fragment parentFragment = fragment.getParentFragment();
        if (G != null && !G.equals(parentFragment)) {
            int i = fragment.mContainerId;
            aes aesVar = bes.a;
            bes.b(new WrongNestedHierarchyViolation(fragment, G, i));
            bes.a(fragment).getClass();
        }
        ArrayList arrayList = this.b.a;
        ViewGroup viewGroup = fragment.mContainer;
        int i2 = -1;
        if (viewGroup != null) {
            int indexOf = arrayList.indexOf(fragment);
            int i3 = indexOf - 1;
            while (true) {
                if (i3 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        Fragment fragment2 = (Fragment) arrayList.get(indexOf);
                        if (fragment2.mContainer == viewGroup && (view = fragment2.mView) != null) {
                            i2 = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    Fragment fragment3 = (Fragment) arrayList.get(i3);
                    if (fragment3.mContainer == viewGroup && (view2 = fragment3.mView) != null) {
                        i2 = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i3--;
                }
            }
        }
        fragment.mContainer.addView(fragment.mView, i2);
    }

    public final void b() {
        boolean O = FragmentManager.O(3);
        Fragment fragment = this.c;
        if (O) {
            Objects.toString(fragment);
        }
        Fragment fragment2 = fragment.mTarget;
        w wVar = null;
        x xVar = this.b;
        if (fragment2 != null) {
            w wVar2 = (w) xVar.b.get(fragment2.mWho);
            if (wVar2 == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(fragment);
                Fragment fragment3 = fragment.mTarget;
                sb.append(" declared target fragment ");
                sb.append(fragment3);
                sb.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(sb.toString());
            }
            fragment.mTargetWho = fragment.mTarget.mWho;
            fragment.mTarget = null;
            wVar = wVar2;
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (wVar = (w) xVar.b.get(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(fragment);
                sb2.append(" declared target fragment ");
                ny61.r(oyr.t(sb2, fragment.mTargetWho, " that does not belong to this FragmentManager!"));
                return;
            }
        }
        if (wVar != null) {
            wVar.i();
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        fragment.mHost = fragmentManager.x;
        fragment.mParentFragment = fragmentManager.z;
        o oVar = this.a;
        oVar.g(fragment, false);
        fragment.performAttach();
        oVar.b(fragment, false);
    }

    public final int c() {
        Fragment fragment = this.c;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int i = this.e;
        int i2 = zds.a[fragment.mMaxState.ordinal()];
        if (i2 != 1) {
            i = i2 != 2 ? i2 != 3 ? i2 != 4 ? Math.min(i, -1) : Math.min(i, 0) : Math.min(i, 1) : Math.min(i, 5);
        }
        if (fragment.mFromLayout) {
            boolean z = fragment.mInLayout;
            int i3 = this.e;
            if (z) {
                i = Math.max(i3, 2);
                View view = fragment.mView;
                if (view != null && view.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = i3 < 4 ? Math.min(i, fragment.mState) : Math.min(i, 1);
            }
        }
        if (fragment.mInDynamicContainer && fragment.mContainer == null) {
            i = Math.min(i, 4);
        }
        if (!fragment.mAdded) {
            i = Math.min(i, 1);
        }
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            g j = g.j(viewGroup, fragment.getParentFragmentManager());
            iot0 g = j.g(fragment);
            SpecialEffectsController$Operation$LifecycleImpact specialEffectsController$Operation$LifecycleImpact = g != null ? g.b : null;
            iot0 h = j.h(fragment);
            r2 = h != null ? h.b : null;
            int i4 = specialEffectsController$Operation$LifecycleImpact == null ? -1 : jot0.a[specialEffectsController$Operation$LifecycleImpact.ordinal()];
            if (i4 != -1 && i4 != 1) {
                r2 = specialEffectsController$Operation$LifecycleImpact;
            }
        }
        if (r2 == SpecialEffectsController$Operation$LifecycleImpact.ADDING) {
            i = Math.min(i, 6);
        } else if (r2 == SpecialEffectsController$Operation$LifecycleImpact.REMOVING) {
            i = Math.max(i, 3);
        } else if (fragment.mRemoving) {
            i = fragment.isInBackStack() ? Math.min(i, 1) : Math.min(i, -1);
        }
        if (fragment.mDeferStart && fragment.mState < 5) {
            i = Math.min(i, 4);
        }
        if (fragment.mTransitioning) {
            i = Math.max(i, 3);
        }
        if (FragmentManager.O(2)) {
            Objects.toString(fragment);
        }
        return i;
    }

    public final void d() {
        String str;
        Fragment fragment = this.c;
        if (fragment.mFromLayout) {
            return;
        }
        if (FragmentManager.O(3)) {
            Objects.toString(fragment);
        }
        Bundle bundle = fragment.mSavedFragmentState;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater performGetLayoutInflater = fragment.performGetLayoutInflater(bundle2);
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = fragment.mContainerId;
            if (i != 0) {
                if (i == -1) {
                    ny61.g(oyr.o("Cannot create fragment ", fragment, " for a container view with no id"));
                    return;
                }
                viewGroup = (ViewGroup) fragment.mFragmentManager.y.b(i);
                if (viewGroup == null) {
                    if (!fragment.mRestored && !fragment.mInDynamicContainer) {
                        try {
                            str = fragment.getResources().getResourceName(fragment.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(fragment.mContainerId) + Extension.O_BRAKE_SPACE + str + ") for fragment " + fragment);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    aes aesVar = bes.a;
                    bes.b(new WrongFragmentContainerViolation(fragment, viewGroup));
                    bes.a(fragment).getClass();
                }
            }
        }
        fragment.mContainer = viewGroup;
        fragment.performCreateView(performGetLayoutInflater, viewGroup, bundle2);
        if (fragment.mView != null) {
            if (FragmentManager.O(3)) {
                Objects.toString(fragment);
            }
            fragment.mView.setSaveFromParentEnabled(false);
            fragment.mView.setTag(b8h0.fragment_container_view_tag, fragment);
            if (viewGroup != null) {
                a();
            }
            if (fragment.mHidden) {
                fragment.mView.setVisibility(8);
            }
            boolean isAttachedToWindow = fragment.mView.isAttachedToWindow();
            final View view = fragment.mView;
            if (isAttachedToWindow) {
                WeakHashMap weakHashMap = androidx.core.view.b.a;
                np31.c(view);
            } else {
                view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.fragment.app.FragmentStateManager$1
                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewAttachedToWindow(View view2) {
                        view.removeOnAttachStateChangeListener(this);
                        View view3 = view;
                        WeakHashMap weakHashMap2 = androidx.core.view.b.a;
                        np31.c(view3);
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(View view2) {
                    }
                });
            }
            fragment.performViewCreated();
            this.a.m(fragment, fragment.mView, bundle2, false);
            int visibility = fragment.mView.getVisibility();
            fragment.setPostOnViewCreatedAlpha(fragment.mView.getAlpha());
            if (fragment.mContainer != null && visibility == 0) {
                View findFocus = fragment.mView.findFocus();
                if (findFocus != null) {
                    fragment.setFocusedView(findFocus);
                    if (FragmentManager.O(2)) {
                        findFocus.toString();
                        Objects.toString(fragment);
                    }
                }
                fragment.mView.setAlpha(0.0f);
            }
        }
        fragment.mState = 2;
    }

    public final void e() {
        Fragment b;
        boolean O = FragmentManager.O(3);
        Fragment fragment = this.c;
        if (O) {
            Objects.toString(fragment);
        }
        boolean z = true;
        boolean z2 = fragment.mRemoving && !fragment.isInBackStack();
        x xVar = this.b;
        if (z2 && !fragment.mBeingSaved) {
            xVar.i(null, fragment.mWho);
        }
        if (!z2) {
            v vVar = xVar.d;
            if (!((vVar.b.containsKey(fragment.mWho) && vVar.x) ? vVar.y : true)) {
                String str = fragment.mTargetWho;
                if (str != null && (b = xVar.b(str)) != null && b.mRetainInstance) {
                    fragment.mTarget = b;
                }
                fragment.mState = 0;
                return;
            }
        }
        gcs gcsVar = fragment.mHost;
        if (gcsVar instanceof rs31) {
            z = xVar.d.y;
        } else {
            FragmentActivity fragmentActivity = gcsVar.b;
            if (fragmentActivity != null) {
                z = true ^ fragmentActivity.isChangingConfigurations();
            }
        }
        if ((z2 && !fragment.mBeingSaved) || z) {
            v vVar2 = xVar.d;
            vVar2.getClass();
            if (FragmentManager.O(3)) {
                Objects.toString(fragment);
            }
            vVar2.X(fragment.mWho, false);
        }
        fragment.performDestroy();
        this.a.d(fragment, false);
        Iterator it = xVar.d().iterator();
        while (it.hasNext()) {
            w wVar = (w) it.next();
            if (wVar != null) {
                Fragment fragment2 = wVar.c;
                if (fragment.mWho.equals(fragment2.mTargetWho)) {
                    fragment2.mTarget = fragment;
                    fragment2.mTargetWho = null;
                }
            }
        }
        String str2 = fragment.mTargetWho;
        if (str2 != null) {
            fragment.mTarget = xVar.b(str2);
        }
        xVar.h(this);
    }

    public final void f() {
        View view;
        boolean O = FragmentManager.O(3);
        Fragment fragment = this.c;
        if (O) {
            Objects.toString(fragment);
        }
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        fragment.performDestroyView();
        this.a.n(fragment, false);
        fragment.mContainer = null;
        fragment.mView = null;
        fragment.mViewLifecycleOwner = null;
        fragment.mViewLifecycleOwnerLiveData.l(null);
        fragment.mInLayout = false;
    }

    public final void g() {
        boolean O = FragmentManager.O(3);
        Fragment fragment = this.c;
        if (O) {
            Objects.toString(fragment);
        }
        fragment.performDetach();
        this.a.e(fragment, false);
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if (!fragment.mRemoving || fragment.isInBackStack()) {
            v vVar = this.b.d;
            if (!((vVar.b.containsKey(fragment.mWho) && vVar.x) ? vVar.y : true)) {
                return;
            }
        }
        if (FragmentManager.O(3)) {
            Objects.toString(fragment);
        }
        fragment.initState();
    }

    public final void h() {
        Fragment fragment = this.c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (FragmentManager.O(3)) {
                Objects.toString(fragment);
            }
            Bundle bundle = fragment.mSavedFragmentState;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            fragment.performCreateView(fragment.performGetLayoutInflater(bundle2), null, bundle2);
            View view = fragment.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                fragment.mView.setTag(b8h0.fragment_container_view_tag, fragment);
                if (fragment.mHidden) {
                    fragment.mView.setVisibility(8);
                }
                fragment.performViewCreated();
                this.a.m(fragment, fragment.mView, bundle2, false);
                fragment.mState = 2;
            }
        }
    }

    public final void i() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        Bundle bundle;
        ViewGroup viewGroup3;
        boolean z = this.d;
        Fragment fragment = this.c;
        if (z) {
            if (FragmentManager.O(2)) {
                Objects.toString(fragment);
                return;
            }
            return;
        }
        try {
            this.d = true;
            boolean z2 = false;
            while (true) {
                int c = c();
                int i = fragment.mState;
                x xVar = this.b;
                if (c == i) {
                    if (!z2 && i == -1 && fragment.mRemoving && !fragment.isInBackStack() && !fragment.mBeingSaved) {
                        if (FragmentManager.O(3)) {
                            Objects.toString(fragment);
                        }
                        v vVar = xVar.d;
                        vVar.getClass();
                        if (FragmentManager.O(3)) {
                            Objects.toString(fragment);
                        }
                        vVar.X(fragment.mWho, true);
                        xVar.h(this);
                        if (FragmentManager.O(3)) {
                            Objects.toString(fragment);
                        }
                        fragment.initState();
                    }
                    if (fragment.mHiddenChanged) {
                        if (fragment.mView != null && (viewGroup = fragment.mContainer) != null) {
                            g j = g.j(viewGroup, fragment.getParentFragmentManager());
                            if (fragment.mHidden) {
                                if (FragmentManager.O(2)) {
                                    Objects.toString(fragment);
                                }
                                j.d(SpecialEffectsController$Operation$State.GONE, SpecialEffectsController$Operation$LifecycleImpact.NONE, this);
                            } else {
                                if (FragmentManager.O(2)) {
                                    Objects.toString(fragment);
                                }
                                j.d(SpecialEffectsController$Operation$State.VISIBLE, SpecialEffectsController$Operation$LifecycleImpact.NONE, this);
                            }
                        }
                        FragmentManager fragmentManager = fragment.mFragmentManager;
                        if (fragmentManager != null && fragment.mAdded && FragmentManager.P(fragment)) {
                            fragmentManager.I = true;
                        }
                        fragment.mHiddenChanged = false;
                        fragment.onHiddenChanged(fragment.mHidden);
                        fragment.mChildFragmentManager.o();
                    }
                    this.d = false;
                    return;
                }
                o oVar = this.a;
                if (c <= i) {
                    switch (i - 1) {
                        case -1:
                            g();
                            break;
                        case 0:
                            if (fragment.mBeingSaved) {
                                if (((Bundle) xVar.c.get(fragment.mWho)) == null) {
                                    xVar.i(l(), fragment.mWho);
                                }
                            }
                            e();
                            break;
                        case 1:
                            f();
                            fragment.mState = 1;
                            break;
                        case 2:
                            fragment.mInLayout = false;
                            fragment.mState = 2;
                            break;
                        case 3:
                            if (FragmentManager.O(3)) {
                                Objects.toString(fragment);
                            }
                            if (fragment.mBeingSaved) {
                                xVar.i(l(), fragment.mWho);
                            } else if (fragment.mView != null && fragment.mSavedViewState == null) {
                                m();
                            }
                            if (fragment.mView != null && (viewGroup2 = fragment.mContainer) != null) {
                                g j2 = g.j(viewGroup2, fragment.getParentFragmentManager());
                                if (FragmentManager.O(2)) {
                                    Objects.toString(fragment);
                                }
                                j2.d(SpecialEffectsController$Operation$State.REMOVED, SpecialEffectsController$Operation$LifecycleImpact.REMOVING, this);
                            }
                            fragment.mState = 3;
                            break;
                        case 4:
                            if (FragmentManager.O(3)) {
                                Objects.toString(fragment);
                            }
                            fragment.performStop();
                            oVar.l(fragment, false);
                            break;
                        case 5:
                            fragment.mState = 5;
                            break;
                        case 6:
                            if (FragmentManager.O(3)) {
                                Objects.toString(fragment);
                            }
                            fragment.performPause();
                            oVar.f(fragment, false);
                            break;
                    }
                } else {
                    switch (i + 1) {
                        case 0:
                            b();
                            break;
                        case 1:
                            if (FragmentManager.O(3)) {
                                Objects.toString(fragment);
                            }
                            Bundle bundle2 = fragment.mSavedFragmentState;
                            bundle = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
                            if (!fragment.mIsCreated) {
                                oVar.h(fragment, bundle, false);
                                fragment.performCreate(bundle);
                                oVar.c(fragment, bundle, false);
                                break;
                            } else {
                                fragment.mState = 1;
                                fragment.restoreChildFragmentState();
                                break;
                            }
                        case 2:
                            h();
                            d();
                            break;
                        case 3:
                            if (FragmentManager.O(3)) {
                                Objects.toString(fragment);
                            }
                            Bundle bundle3 = fragment.mSavedFragmentState;
                            bundle = bundle3 != null ? bundle3.getBundle("savedInstanceState") : null;
                            fragment.performActivityCreated(bundle);
                            oVar.a(fragment, bundle, false);
                            break;
                        case 4:
                            if (fragment.mView != null && (viewGroup3 = fragment.mContainer) != null) {
                                g j3 = g.j(viewGroup3, fragment.getParentFragmentManager());
                                int visibility = fragment.mView.getVisibility();
                                SpecialEffectsController$Operation$State.Companion.getClass();
                                SpecialEffectsController$Operation$State b = fot0.b(visibility);
                                if (FragmentManager.O(2)) {
                                    Objects.toString(fragment);
                                }
                                j3.d(b, SpecialEffectsController$Operation$LifecycleImpact.ADDING, this);
                            }
                            fragment.mState = 4;
                            break;
                        case 5:
                            if (FragmentManager.O(3)) {
                                Objects.toString(fragment);
                            }
                            fragment.performStart();
                            oVar.k(fragment, false);
                            break;
                        case 6:
                            fragment.mState = 6;
                            break;
                        case 7:
                            k();
                            break;
                    }
                }
                z2 = true;
            }
        } catch (Throwable th) {
            this.d = false;
            throw th;
        }
    }

    public final void j(ClassLoader classLoader) {
        Fragment fragment = this.c;
        Bundle bundle = fragment.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (fragment.mSavedFragmentState.getBundle("savedInstanceState") == null) {
            fragment.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
        }
        try {
            fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("viewState");
            fragment.mSavedViewRegistryState = fragment.mSavedFragmentState.getBundle("viewRegistryState");
            FragmentState fragmentState = (FragmentState) fragment.mSavedFragmentState.getParcelable(ClidProvider.STATE);
            if (fragmentState != null) {
                fragment.mTargetWho = fragmentState.mTargetWho;
                fragment.mTargetRequestCode = fragmentState.mTargetRequestCode;
                Boolean bool = fragment.mSavedUserVisibleHint;
                if (bool != null) {
                    fragment.mUserVisibleHint = bool.booleanValue();
                    fragment.mSavedUserVisibleHint = null;
                } else {
                    fragment.mUserVisibleHint = fragmentState.mUserVisibleHint;
                }
            }
            if (fragment.mUserVisibleHint) {
                return;
            }
            fragment.mDeferStart = true;
        } catch (BadParcelableException e) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + fragment, e);
        }
    }

    public final void k() {
        boolean O = FragmentManager.O(3);
        Fragment fragment = this.c;
        if (O) {
            Objects.toString(fragment);
        }
        View focusedView = fragment.getFocusedView();
        if (focusedView != null) {
            if (focusedView != fragment.mView) {
                for (ViewParent parent = focusedView.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent != fragment.mView) {
                    }
                }
            }
            focusedView.requestFocus();
            if (FragmentManager.O(2)) {
                focusedView.toString();
                Objects.toString(fragment);
                Objects.toString(fragment.mView.findFocus());
            }
        }
        fragment.setFocusedView(null);
        fragment.performResume();
        this.a.i(fragment, false);
        this.b.i(null, fragment.mWho);
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    public final Bundle l() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        Fragment fragment = this.c;
        if (fragment.mState == -1 && (bundle = fragment.mSavedFragmentState) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable(ClidProvider.STATE, new FragmentState(fragment));
        if (fragment.mState > 0) {
            Bundle bundle3 = new Bundle();
            fragment.performSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.a.j(fragment, bundle3, false);
            Bundle bundle4 = new Bundle();
            fragment.mSavedStateRegistryController.b(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle h0 = fragment.mChildFragmentManager.h0();
            if (!h0.isEmpty()) {
                bundle2.putBundle("childFragmentManager", h0);
            }
            if (fragment.mView != null) {
                m();
            }
            SparseArray<Parcelable> sparseArray = fragment.mSavedViewState;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = fragment.mSavedViewRegistryState;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = fragment.mArguments;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public final void m() {
        Fragment fragment = this.c;
        if (fragment.mView == null) {
            return;
        }
        if (FragmentManager.O(2)) {
            Objects.toString(fragment);
            Objects.toString(fragment.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        fragment.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            fragment.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        fragment.mViewLifecycleOwner.y.b(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        fragment.mSavedViewRegistryState = bundle;
    }

    public w(o oVar, x xVar, Fragment fragment) {
        this.a = oVar;
        this.b = xVar;
        this.c = fragment;
    }

    public w(o oVar, x xVar, Fragment fragment, Bundle bundle) {
        this.a = oVar;
        this.b = xVar;
        this.c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        fragment.mSavedFragmentState = bundle;
        fragment.mArguments = bundle.getBundle("arguments");
    }
}
