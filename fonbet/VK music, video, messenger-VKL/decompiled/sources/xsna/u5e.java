package xsna;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.vk.clips.favorites.impl.ui.folders.picker.ClipsFavoritesFoldersPickerFragment;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.NoWhenBranchMatchedException;
import xsna.fgg0;
import xsna.ikv0;
import xsna.t5e;

/* compiled from: ClipsFavoritesSnackbarLauncher.kt */
/* loaded from: classes16.dex */
public final class u5e {
    public final j5e a;
    public final m5e b;

    public u5e(j5e j5eVar, m5e m5eVar) {
        this.a = j5eVar;
        this.b = m5eVar;
    }

    public static void a(ikv0.a aVar, int i, izs izsVar) {
        aVar.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, aVar.a.getString(i), izsVar);
    }

    public static void b(ikv0.a aVar, int i) {
        aVar.i(new ikv0.d(new ikv0.d.c(aVar.a.getString(i)), (ikv0.d.b) null, (ikv0.d.a) null, 6));
    }

    public static void c(ikv0.a aVar, String str) {
        aVar.u = new ikv0.d(new ikv0.d.c(str), (ikv0.d.b) null, (ikv0.d.a) null, 6);
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(t5e t5eVar, Context context) {
        ArrayList arrayList;
        Fragment fragment;
        boolean z;
        Context context2;
        Dialog dialog;
        ikv0.a aVar;
        Bundle arguments;
        boolean z2;
        Activity h;
        Window window;
        Dialog dialog2;
        View view;
        Object obj;
        FragmentManager supportFragmentManager;
        List<Fragment> f;
        Activity b = c63.b();
        Window window2 = null;
        FragmentActivity fragmentActivity = b instanceof FragmentActivity ? (FragmentActivity) b : null;
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
        int i = 1;
        boolean z3 = false;
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
                if (!(((Fragment) previous) instanceof ClipsFavoritesFoldersPickerFragment)) {
                    arrayList2.add(previous);
                }
            }
            Iterator it2 = arrayList2.iterator();
            z = false;
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                z1h0 z1h0Var = (Fragment) obj;
                if (((z1h0Var instanceof wds) && (z = ((wds) z1h0Var).e9(t5eVar))) ? false : true) {
                    break;
                }
            }
            fragment = (Fragment) obj;
        } else {
            fragment = null;
            z = false;
        }
        if (fragment == null || (view = fragment.getView()) == null || (context2 = view.getContext()) == null) {
            androidx.fragment.app.d dVar = fragment instanceof androidx.fragment.app.d ? (androidx.fragment.app.d) fragment : null;
            context2 = (dVar == null || (dialog = dVar.s) == null) ? null : dialog.getContext();
            if (context2 == null) {
                if (context == null) {
                    dhr0.a.getClass();
                    context = dhr0.E();
                }
                aVar = new ikv0.a(context);
                if ((fragment instanceof androidx.fragment.app.d) && ((androidx.fragment.app.d) fragment).o) {
                    z3 = true;
                }
                int i2 = ify.a;
                if (!ify.e(ify.c) && !z) {
                    aVar.e(ify.d(3, null));
                } else if (!z3 || (fragment != null && (arguments = fragment.getArguments()) != null && arguments.getBoolean("no_bottom_navigation"))) {
                    aVar.e(context.getResources().getDimensionPixelSize(R.dimen.clips_favorites_snackbar_margin));
                }
                z2 = t5eVar instanceof t5e.b;
                ikv0.c.f fVar = ikv0.c.f.a;
                if (z2) {
                    boolean z4 = t5eVar instanceof t5e.a;
                    ikv0.c.b bVar = ikv0.c.b.a;
                    if (z4) {
                        b(aVar, R.string.clips_favorites_clip_added_to_all_clips_error);
                        aVar.t = bVar;
                    } else if (t5eVar instanceof t5e.d) {
                        b(aVar, R.string.clips_favorites_clip_removed_from_all_clips_success);
                        aVar.t = fVar;
                    } else if (t5eVar instanceof t5e.c) {
                        b(aVar, R.string.clips_favorites_clip_removed_from_all_clips_error);
                        aVar.t = bVar;
                    } else if (t5eVar instanceof t5e.h) {
                        t5e.h hVar = (t5e.h) t5eVar;
                        int i3 = hVar.d;
                        String str = hVar.c;
                        c(aVar, i3 == 1 ? context.getString(R.string.clips_favorites_clip_added_to_folder_single_success, str) : context.getResources().getQuantityString(R.plurals.clips_favorites_clip_added_to_folder_multiple_success, i3, Integer.valueOf(i3), str));
                        aVar.t = fVar;
                        if (hVar.e) {
                            a(aVar, R.string.clips_favorites_snackbar_open_folder, new iea(aVar, this, hVar, i));
                        }
                    } else if (t5eVar instanceof t5e.g) {
                        b(aVar, ((t5e.g) t5eVar).a == 1 ? R.string.clips_favorites_clip_added_to_folder_single_error : R.string.clips_favorites_clip_added_to_folder_multiple_error);
                        aVar.t = bVar;
                    } else if (t5eVar instanceof t5e.f) {
                        t5e.f fVar2 = (t5e.f) t5eVar;
                        int i4 = fVar2.b;
                        String str2 = fVar2.a;
                        c(aVar, i4 == 1 ? context.getString(R.string.clips_favorites_clip_removed_from_folder_single_success, str2) : context.getString(R.string.clips_favorites_clip_removed_from_folder_multiple_success, str2));
                        aVar.t = fVar;
                    } else if (t5eVar instanceof t5e.e) {
                        c(aVar, ((t5e.e) t5eVar).a == 1 ? context.getString(R.string.clips_favorites_clip_removed_from_folder_single_error) : context.getString(R.string.clips_favorites_clip_removed_from_folder_multiple_error));
                        aVar.t = bVar;
                    } else if (t5eVar instanceof t5e.j) {
                        t5e.j jVar = (t5e.j) t5eVar;
                        int i5 = jVar.d;
                        String str3 = jVar.c;
                        c(aVar, i5 == 1 ? context.getString(R.string.clips_favorites_clip_moved_to_folder_success, str3) : context.getResources().getQuantityString(R.plurals.clips_favorites_clips_moved_to_folder, i5, Integer.valueOf(i5), str3));
                        aVar.t = fVar;
                        a(aVar, R.string.clips_favorites_snackbar_open_folder, new jl6(aVar, this, jVar, 2));
                    } else if (t5eVar instanceof t5e.i) {
                        c(aVar, ((t5e.i) t5eVar).a == 1 ? context.getString(R.string.clips_favorites_clip_moved_to_folder_single_error) : context.getString(R.string.clips_favorites_clip_moved_to_folder_multiple_error));
                        aVar.t = bVar;
                    } else if (t5eVar instanceof t5e.l) {
                        t5e.l lVar = (t5e.l) t5eVar;
                        c(aVar, context.getString(R.string.clips_favorites_folder_created_success, lVar.c));
                        aVar.t = fVar;
                        a(aVar, R.string.clips_favorites_snackbar_open_folder, new ysd(aVar, this, lVar, i));
                    } else if (t5eVar instanceof t5e.k) {
                        b(aVar, R.string.clips_favorites_folder_created_error);
                        aVar.t = bVar;
                    } else if (t5eVar instanceof t5e.p) {
                        b(aVar, R.string.clips_favorites_folder_renamed_success);
                        aVar.t = fVar;
                    } else if (t5eVar instanceof t5e.o) {
                        b(aVar, R.string.clips_favorites_folder_renamed_error);
                        aVar.t = bVar;
                    } else if (t5eVar instanceof t5e.n) {
                        c(aVar, context.getString(R.string.clips_favorites_folder_deleted_success, ((t5e.n) t5eVar).a));
                        aVar.t = fVar;
                    } else if (t5eVar instanceof t5e.m) {
                        b(aVar, R.string.clips_favorites_folder_deleted_error);
                        aVar.t = bVar;
                    } else if (t5eVar instanceof t5e.r) {
                        b(aVar, R.string.clips_favorites_folder_max_folders_error);
                    } else {
                        if (!(t5eVar instanceof t5e.q)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        b(aVar, R.string.clips_favorites_folder_max_clips_in_folder_error);
                        aVar.t = bVar;
                    }
                } else {
                    b(aVar, R.string.clips_favorites_clip_added_to_all_clips_success);
                    aVar.t = fVar;
                    a(aVar, R.string.clips_favorites_snackbar_add_to_folder, new q45(this, aVar, (t5e.b) t5eVar, i));
                }
                aVar.d = true;
                ikv0 b2 = aVar.b();
                if (fragment != null) {
                    androidx.fragment.app.d dVar2 = fragment instanceof androidx.fragment.app.d ? (androidx.fragment.app.d) fragment : null;
                    if (dVar2 == null || (dialog2 = dVar2.s) == null || (window = dialog2.getWindow()) == null) {
                        FragmentActivity activity = fragment.getActivity();
                        window = activity != null ? activity.getWindow() : null;
                    }
                    if (window != null) {
                        window2 = window;
                        if (window2 != null) {
                            b2.d(window2);
                            return;
                        } else {
                            b2.c();
                            return;
                        }
                    }
                }
                h = e3m.h(context);
                if (h != null) {
                    window2 = h.getWindow();
                }
                if (window2 != null) {
                }
            }
        }
        context = context2;
        aVar = new ikv0.a(context);
        if (fragment instanceof androidx.fragment.app.d) {
            z3 = true;
        }
        int i22 = ify.a;
        if (!ify.e(ify.c)) {
        }
        if (!z3) {
        }
        aVar.e(context.getResources().getDimensionPixelSize(R.dimen.clips_favorites_snackbar_margin));
        z2 = t5eVar instanceof t5e.b;
        ikv0.c.f fVar3 = ikv0.c.f.a;
        if (z2) {
        }
        aVar.d = true;
        ikv0 b22 = aVar.b();
        if (fragment != null) {
        }
        h = e3m.h(context);
        if (h != null) {
        }
        if (window2 != null) {
        }
    }
}
