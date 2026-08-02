package xsna;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.Size;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.vk.clips.playlists.folders.root.ClipsPlaylistsFoldersRootFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.fgg0;
import xsna.ikv0;

/* compiled from: ClipsPlaylistsSnackbarLauncher.kt */
/* loaded from: classes16.dex */
public final class vve {
    public static final int a = iah0.a(64);
    public static final int b = iah0.a(8);

    public static ikv0.c.C3058c a() {
        return new ikv0.c.C3058c(R.drawable.vk_icon_warning_triangle_outline_28, Integer.valueOf(R.attr.vk_ui_icon_warning), (Size) null, 12);
    }

    public static ikv0.c.C3058c b() {
        return new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_outline_28, Integer.valueOf(R.attr.vk_ui_icon_positive), (Size) null, 12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void c(ikv0.a aVar, String str) {
        aVar.u = new ikv0.d(new ikv0.d.c(str, 5), (ikv0.d.b) null, (ikv0.d.a) (null == true ? 1 : 0), 6);
    }

    public static void d(uve uveVar, boolean z, boolean z2) {
        ArrayList arrayList;
        Fragment fragment;
        Object obj;
        FragmentManager supportFragmentManager;
        List<Fragment> f;
        c63 c63Var = c63.a;
        Activity b2 = c63.b();
        FragmentActivity fragmentActivity = b2 instanceof FragmentActivity ? (FragmentActivity) b2 : null;
        if (fragmentActivity == null || (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) == null || (f = supportFragmentManager.c.f()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (Object obj2 : f) {
                Fragment fragment2 = (Fragment) obj2;
                if (fragment2.isVisible() || ((fragment2 instanceof androidx.fragment.app.d) && ((androidx.fragment.app.d) fragment2).o)) {
                    arrayList.add(obj2);
                }
            }
        }
        Fragment fragment3 = arrayList != null ? (Fragment) j5g.k0(arrayList) : null;
        Window g = fragment3 != null ? g(fragment3) : null;
        if (arrayList != null) {
            fgg0 fgg0Var = new fgg0(arrayList);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = fgg0Var.iterator();
            while (true) {
                ListIterator<T> listIterator = ((fgg0.a) it).b;
                if (!listIterator.hasPrevious()) {
                    break;
                }
                Object previous = listIterator.previous();
                if (!(((Fragment) previous) instanceof ClipsPlaylistsFoldersRootFragment)) {
                    arrayList2.add(previous);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj = it2.next();
                    if (!epx.f(g((Fragment) obj), g)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            fragment = (Fragment) obj;
        } else {
            fragment = null;
        }
        Window g2 = fragment != null ? g(fragment) : null;
        if (g == null || z2) {
            if (g2 != null) {
                f(fragment, g2, uveVar, z);
            }
        } else {
            f(fragment3, g, uveVar, z);
        }
    }

    public static /* synthetic */ void e(vve vveVar, uve uveVar, boolean z, boolean z2, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        vveVar.getClass();
        d(uveVar, z, z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void f(Fragment fragment, Window window, uve uveVar, boolean z) {
        Pair pair;
        Pair pair2;
        Fragment fragment2;
        View view;
        Context context;
        Dialog dialog;
        boolean z2;
        Bundle arguments;
        FragmentManager childFragmentManager;
        List<Fragment> f;
        Integer num = null;
        ClipsPlaylistsFoldersRootFragment clipsPlaylistsFoldersRootFragment = fragment instanceof ClipsPlaylistsFoldersRootFragment ? (ClipsPlaylistsFoldersRootFragment) fragment : null;
        if (clipsPlaylistsFoldersRootFragment == null || (childFragmentManager = clipsPlaylistsFoldersRootFragment.getChildFragmentManager()) == null || (f = childFragmentManager.c.f()) == null || !(!f.isEmpty())) {
            pair = new Pair(fragment, window);
        } else {
            Fragment fragment3 = (Fragment) j5g.i0(((ClipsPlaylistsFoldersRootFragment) fragment).getChildFragmentManager().c.f());
            Window g = g(fragment3);
            if (g != null) {
                pair2 = new Pair(fragment3, g);
                fragment2 = (Fragment) pair2.d();
                Window window2 = (Window) pair2.g();
                view = fragment2.getView();
                if (view != null || (context = view.getContext()) == null) {
                    androidx.fragment.app.d dVar = !(fragment2 instanceof androidx.fragment.app.d) ? (androidx.fragment.app.d) fragment2 : null;
                    context = (dVar != null || (dialog = dVar.s) == null) ? null : dialog.getContext();
                    if (context == null && (context = e43.a) == null) {
                        context = null;
                    }
                }
                if (z) {
                    context = bwt0.u(context);
                }
                ikv0.a aVar = new ikv0.a(context);
                aVar.d = true;
                aVar.e = 4000L;
                z2 = !(fragment2 instanceof tl50) && ((tl50) fragment2).o;
                if (z2 && ((arguments = fragment2.getArguments()) == null || !arguments.getBoolean("no_bottom_navigation"))) {
                    aVar.e(a);
                } else if (z2) {
                    aVar.e(b);
                }
                if (!(uveVar instanceof sve)) {
                    c(aVar, context.getString(R.string.clips_playlists_playlist_deletion_error));
                    aVar.t = a();
                } else if (uveVar instanceof tve) {
                    c(aVar, context.getString(R.string.clips_playlists_playlist_deletion_success));
                    aVar.t = b();
                } else if (uveVar instanceof rve) {
                    c(aVar, context.getString(R.string.clips_playlists_playlist_max_size_reached));
                } else if (uveVar instanceof qve) {
                    c(aVar, context.getString(R.string.clips_playlist_actions_not_supported));
                    float f2 = 40;
                    aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_new_vk_logo_color_48, num, new Size(iah0.a(f2), iah0.a(f2)), 10);
                } else if (uveVar instanceof nve) {
                    c(aVar, context.getString(R.string.clips_playlist_limit_n_add_clips, Integer.valueOf(((nve) uveVar).a)));
                } else if (uveVar instanceof lve) {
                    lve lveVar = (lve) uveVar;
                    String str = lveVar.a;
                    jl4 jl4Var = lveVar.b;
                    c(aVar, context.getString(R.string.clips_playlist_success_add_clip, str));
                    aVar.t = b();
                    aVar.g = new w0y0(jl4Var, 1);
                } else if (uveVar instanceof ove) {
                    c(aVar, context.getString(R.string.clips_playlist_success_remove_clip, ((ove) uveVar).a));
                    aVar.t = b();
                } else if (uveVar instanceof mve) {
                    c(aVar, context.getString(R.string.clips_playlist_error_add_clips));
                    aVar.t = a();
                } else {
                    if (!(uveVar instanceof pve)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c(aVar, context.getString(R.string.clips_playlist_error_remove_clips));
                    aVar.t = a();
                }
                aVar.d = true;
                aVar.p(window2);
            }
            pair = new Pair(fragment, window);
        }
        pair2 = pair;
        fragment2 = (Fragment) pair2.d();
        Window window22 = (Window) pair2.g();
        view = fragment2.getView();
        if (view != null) {
        }
        if (!(fragment2 instanceof androidx.fragment.app.d)) {
        }
        if (dVar != null) {
        }
        if (context == null) {
            context = null;
        }
        if (z) {
        }
        ikv0.a aVar2 = new ikv0.a(context);
        aVar2.d = true;
        aVar2.e = 4000L;
        if (fragment2 instanceof tl50) {
        }
        if (z2) {
        }
        if (z2) {
        }
        if (!(uveVar instanceof sve)) {
        }
        aVar2.d = true;
        aVar2.p(window22);
    }

    public static Window g(Fragment fragment) {
        Dialog dialog;
        Window window;
        androidx.fragment.app.d dVar = fragment instanceof androidx.fragment.app.d ? (androidx.fragment.app.d) fragment : null;
        if (dVar != null && (dialog = dVar.s) != null && (window = dialog.getWindow()) != null) {
            return window;
        }
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            return activity.getWindow();
        }
        return null;
    }
}
