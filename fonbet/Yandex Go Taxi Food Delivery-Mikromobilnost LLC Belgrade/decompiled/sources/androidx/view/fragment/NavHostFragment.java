package androidx.view.fragment;

import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.view.NavBackStackEntryState;
import androidx.view.d;
import androidx.view.i;
import androidx.view.j;
import defpackage.a550;
import defpackage.cej;
import defpackage.eah0;
import defpackage.g550;
import defpackage.h550;
import defpackage.i3y;
import defpackage.i550;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.k2i0;
import defpackage.ke50;
import defpackage.ls31;
import defpackage.m2i0;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.pey;
import defpackage.qah0;
import defpackage.qs31;
import defpackage.sls;
import defpackage.w511;
import defpackage.wj6;
import defpackage.x43;
import defpackage.yci0;
import defpackage.z450;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0016\u0018\u0000 <2\u00020\u00012\u00020\u0002:\u0001=B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0017¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0015¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0015¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00170\u0016H\u0015¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u001f\u0010 J!\u0010\"\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u001e2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\"\u0010#J)\u0010&\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010%\u001a\u00020$2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0017¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\nH\u0017¢\u0006\u0004\b)\u0010\rJ\u000f\u0010*\u001a\u00020\u0007H\u0016¢\u0006\u0004\b*\u0010\u0004R\u001b\u0010\u000f\u001a\u00020\u000e8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0018\u0010/\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00102\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00105\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00109\u001a\u0002018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0011\u0010\u0013\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006>"}, d2 = {"Landroidx/navigation/fragment/NavHostFragment;", "Landroidx/fragment/app/Fragment;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lzy11;", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lg550;", "navHostController", "onCreateNavHostController", "(Lg550;)V", "Landroidx/navigation/d;", "navController", "onCreateNavController", "(Landroidx/navigation/d;)V", "Landroidx/navigation/j;", "Leds;", "createFragmentNavigator", "()Landroidx/navigation/j;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/util/AttributeSet;", "attrs", "onInflate", "(Landroid/content/Context;Landroid/util/AttributeSet;Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "onDestroyView", "navHostController$delegate", "Li3y;", "getNavHostController$navigation_fragment_release", "()Lg550;", "viewParent", "Landroid/view/View;", "", "graphId", CA20Status.STATUS_USER_I, "", "defaultNavHost", "Z", "getContainerId", "()I", "containerId", "getNavController", "()Landroidx/navigation/d;", "Companion", "h550", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public class NavHostFragment extends Fragment {
    public static final h550 Companion = new h550();
    private static final String KEY_DEFAULT_NAV_HOST = "android-support-nav:fragment:defaultHost";
    public static final String KEY_GRAPH_ID = "android-support-nav:fragment:graphId";
    private static final String KEY_NAV_CONTROLLER_STATE = "android-support-nav:fragment:navControllerState";
    public static final String KEY_START_DESTINATION_ARGS = "android-support-nav:fragment:startDestinationArgs";
    private boolean defaultNavHost;
    private int graphId;

    /* renamed from: navHostController$delegate, reason: from kotlin metadata */
    private final i3y navHostController = a.a(new sls() { // from class: androidx.navigation.fragment.NavHostFragment$navHostController$2
        {
            super(0);
        }

        @Override // defpackage.sls
        public final Object invoke() {
            int i;
            int i2;
            Lifecycle lifecycle;
            Context context = NavHostFragment.this.getContext();
            if (context == null) {
                ny61.r("NavController cannot be created before the fragment is attached");
                return null;
            }
            g550 g550Var = new g550(context);
            NavHostFragment navHostFragment = NavHostFragment.this;
            if (!navHostFragment.equals(g550Var.n)) {
                pey peyVar = g550Var.n;
                wj6 wj6Var = g550Var.r;
                if (peyVar != null && (lifecycle = peyVar.getLifecycle()) != null) {
                    lifecycle.d(wj6Var);
                }
                g550Var.n = navHostFragment;
                navHostFragment.getLifecycle().a(wj6Var);
            }
            qs31 viewModelStore = navHostFragment.getViewModelStore();
            a550 a550Var = g550Var.o;
            z450 z450Var = a550.c;
            z450 z450Var2 = a550.c;
            if (!jl40.l(a550Var, (a550) new ls31(viewModelStore, z450Var2, 0).b(a550.class))) {
                if (!g550Var.g.isEmpty()) {
                    ny61.r("ViewModelStore should be set before setGraph call");
                    return null;
                }
                g550Var.o = (a550) new ls31(viewModelStore, z450Var2, 0).b(a550.class);
            }
            navHostFragment.onCreateNavHostController(g550Var);
            Bundle a = navHostFragment.getSavedStateRegistry().a("android-support-nav:fragment:navControllerState");
            if (a != null) {
                a.setClassLoader(context.getClassLoader());
                g550Var.d = a.getBundle("android-support-nav:controller:navigatorState");
                g550Var.e = a.getParcelableArray("android-support-nav:controller:backStack");
                LinkedHashMap linkedHashMap = g550Var.m;
                linkedHashMap.clear();
                int[] intArray = a.getIntArray("android-support-nav:controller:backStackDestIds");
                ArrayList<String> stringArrayList = a.getStringArrayList("android-support-nav:controller:backStackIds");
                if (intArray != null && stringArrayList != null) {
                    int length = intArray.length;
                    int i3 = 0;
                    int i4 = 0;
                    while (i3 < length) {
                        g550Var.l.put(Integer.valueOf(intArray[i3]), stringArrayList.get(i4));
                        i3++;
                        i4++;
                    }
                }
                ArrayList<String> stringArrayList2 = a.getStringArrayList("android-support-nav:controller:backStackStates");
                if (stringArrayList2 != null) {
                    for (String str : stringArrayList2) {
                        Parcelable[] parcelableArray = a.getParcelableArray("android-support-nav:controller:backStackStates:" + str);
                        if (parcelableArray != null) {
                            x43 x43Var = new x43(parcelableArray.length);
                            int i5 = 0;
                            while (i5 < parcelableArray.length) {
                                int i6 = i5 + 1;
                                try {
                                    x43Var.addLast((NavBackStackEntryState) parcelableArray[i5]);
                                    i5 = i6;
                                } catch (ArrayIndexOutOfBoundsException e) {
                                    w511.i(e.getMessage());
                                    return null;
                                }
                            }
                            linkedHashMap.put(str, x43Var);
                        }
                    }
                }
                g550Var.f = a.getBoolean("android-support-nav:controller:deepLinkHandled");
            }
            navHostFragment.getSavedStateRegistry().c("android-support-nav:fragment:navControllerState", new i550(0, g550Var));
            Bundle a2 = navHostFragment.getSavedStateRegistry().a(NavHostFragment.KEY_GRAPH_ID);
            if (a2 != null) {
                navHostFragment.graphId = a2.getInt(NavHostFragment.KEY_GRAPH_ID);
            }
            navHostFragment.getSavedStateRegistry().c(NavHostFragment.KEY_GRAPH_ID, new i550(1, navHostFragment));
            i = navHostFragment.graphId;
            if (i != 0) {
                i2 = navHostFragment.graphId;
                g550Var.r(g550Var.i().a(i2), null);
                return g550Var;
            }
            Bundle arguments = navHostFragment.getArguments();
            int i7 = arguments != null ? arguments.getInt(NavHostFragment.KEY_GRAPH_ID) : 0;
            Bundle bundle = arguments != null ? arguments.getBundle(NavHostFragment.KEY_START_DESTINATION_ARGS) : null;
            if (i7 != 0) {
                g550Var.r(g550Var.i().a(i7), bundle);
            }
            return g550Var;
        }
    });
    private View viewParent;

    public static final NavHostFragment create(int i) {
        Companion.getClass();
        return h550.a(i, null);
    }

    public static final d findNavController(Fragment fragment) {
        Dialog dialog;
        Window window;
        Companion.getClass();
        for (Fragment fragment2 = fragment; fragment2 != null; fragment2 = fragment2.getParentFragment()) {
            if (fragment2 instanceof NavHostFragment) {
                return ((NavHostFragment) fragment2).getNavHostController$navigation_fragment_release();
            }
            Fragment fragment3 = fragment2.getParentFragmentManager().A;
            if (fragment3 instanceof NavHostFragment) {
                return ((NavHostFragment) fragment3).getNavHostController$navigation_fragment_release();
            }
        }
        View view = fragment.getView();
        if (view != null) {
            return i.a(view);
        }
        DialogFragment dialogFragment = fragment instanceof DialogFragment ? (DialogFragment) fragment : null;
        View decorView = (dialogFragment == null || (dialog = dialogFragment.getDialog()) == null || (window = dialog.getWindow()) == null) ? null : window.getDecorView();
        if (decorView != null) {
            return i.a(decorView);
        }
        ny61.r(oyr.o("Fragment ", fragment, " does not have a NavController set"));
        return null;
    }

    private final int getContainerId() {
        int id = getId();
        return (id == 0 || id == -1) ? qah0.nav_host_fragment_container : id;
    }

    @jxi
    public j createFragmentNavigator() {
        return new b(requireContext(), getChildFragmentManager(), getContainerId());
    }

    public final d getNavController() {
        return getNavHostController$navigation_fragment_release();
    }

    public final g550 getNavHostController$navigation_fragment_release() {
        return (g550) this.navHostController.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (this.defaultNavHost) {
            FragmentManager parentFragmentManager = getParentFragmentManager();
            parentFragmentManager.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(parentFragmentManager);
            aVar.r(this);
            aVar.d();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        getNavHostController$navigation_fragment_release();
        if (savedInstanceState != null && savedInstanceState.getBoolean(KEY_DEFAULT_NAV_HOST, false)) {
            this.defaultNavHost = true;
            FragmentManager parentFragmentManager = getParentFragmentManager();
            parentFragmentManager.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(parentFragmentManager);
            aVar.r(this);
            aVar.d();
        }
        super.onCreate(savedInstanceState);
    }

    @jxi
    public void onCreateNavController(d navController) {
        ke50 ke50Var = navController.u;
        ke50Var.a(new cej(requireContext(), getChildFragmentManager()));
        ke50Var.a(createFragmentNavigator());
    }

    public void onCreateNavHostController(g550 navHostController) {
        onCreateNavController(navHostController);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        FragmentContainerView fragmentContainerView = new FragmentContainerView(inflater.getContext());
        fragmentContainerView.setId(getContainerId());
        return fragmentContainerView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        View view = this.viewParent;
        if (view != null && i.a(view) == getNavHostController$navigation_fragment_release()) {
            view.setTag(eah0.nav_controller_view_tag, null);
        }
        this.viewParent = null;
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
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attrs, m2i0.NavHostFragment);
        if (obtainStyledAttributes2.getBoolean(m2i0.NavHostFragment_defaultNavHost, false)) {
            this.defaultNavHost = true;
        }
        obtainStyledAttributes2.recycle();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        if (this.defaultNavHost) {
            outState.putBoolean(KEY_DEFAULT_NAV_HOST, true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (!(view instanceof ViewGroup)) {
            yci0.n("created host view ", view, " is not a ViewGroup");
            return;
        }
        view.setTag(eah0.nav_controller_view_tag, getNavHostController$navigation_fragment_release());
        if (view.getParent() != null) {
            View view2 = (View) view.getParent();
            this.viewParent = view2;
            if (view2.getId() == getId()) {
                this.viewParent.setTag(eah0.nav_controller_view_tag, getNavHostController$navigation_fragment_release());
            }
        }
    }

    public static final NavHostFragment create(int i, Bundle bundle) {
        Companion.getClass();
        return h550.a(i, bundle);
    }
}
