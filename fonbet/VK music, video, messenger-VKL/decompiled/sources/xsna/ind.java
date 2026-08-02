package xsna;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.util.Size;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.vk.core.apps.BuildInfo;
import com.vk.toggle.features.ClipsFeatures;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.hnd;
import xsna.ikv0;

/* compiled from: ClipsCoauthorsSnackbarLauncher.kt */
/* loaded from: classes16.dex */
public final class ind {
    public final int a = iah0.a(96);

    public static void a(ikv0.a aVar) {
        float f = 28;
        aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_lock_outline_28, Integer.valueOf(R.attr.vk_ui_icon_secondary), new Size(iah0.a(f), iah0.a(f)), 8);
    }

    public static void b(ikv0.a aVar, String str) {
        ClipsFeatures clipsFeatures = ClipsFeatures.COAUTHORS_REDESIGN;
        clipsFeatures.getClass();
        if (com.vk.toggle.b.A.a(clipsFeatures)) {
            aVar.u = new ikv0.d(new ikv0.d.c(str), (ikv0.d.b) null, (ikv0.d.a) null, 6);
        } else {
            aVar.u = new ikv0.d((ikv0.d.c) null, new ikv0.d.b(str), (ikv0.d.a) null, 5);
        }
    }

    public static Window d(Fragment fragment) {
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

    /* JADX WARN: Removed duplicated region for block: B:104:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(hnd hndVar, boolean z) {
        ArrayList arrayList;
        Window window;
        Pair pair;
        Pair pair2;
        Fragment fragment;
        Context context;
        Dialog dialog;
        String string;
        View view;
        FragmentManager childFragmentManager;
        List<Fragment> f;
        FragmentManager supportFragmentManager;
        List<Fragment> f2;
        Activity b = c63.b();
        FragmentActivity fragmentActivity = b instanceof FragmentActivity ? (FragmentActivity) b : null;
        if (fragmentActivity == null || (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) == null || (f2 = supportFragmentManager.c.f()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (Object obj : f2) {
                Fragment fragment2 = (Fragment) obj;
                if (fragment2.isVisible() || ((fragment2 instanceof androidx.fragment.app.d) && ((androidx.fragment.app.d) fragment2).o && !(fragment2 instanceof ces))) {
                    arrayList.add(obj);
                }
            }
        }
        Fragment fragment3 = arrayList != null ? (Fragment) j5g.k0(arrayList) : null;
        if (fragment3 == null || (window = d(fragment3)) == null) {
            Activity b2 = c63.b();
            FragmentActivity fragmentActivity2 = b2 instanceof FragmentActivity ? (FragmentActivity) b2 : null;
            window = fragmentActivity2 != null ? fragmentActivity2.getWindow() : null;
        }
        if (window != null) {
            dw20 dw20Var = fragment3 instanceof dw20 ? (dw20) fragment3 : null;
            if (dw20Var == null || (childFragmentManager = dw20Var.getChildFragmentManager()) == null || (f = childFragmentManager.c.f()) == null || !(!f.isEmpty())) {
                pair = new Pair(fragment3, window);
            } else {
                Fragment fragment4 = (Fragment) j5g.i0(((dw20) fragment3).getChildFragmentManager().c.f());
                Window d = d(fragment4);
                if (d != null) {
                    pair2 = new Pair(fragment4, d);
                    fragment = (Fragment) pair2.d();
                    Window window2 = (Window) pair2.g();
                    if (fragment != null || (view = fragment.getView()) == null || (context = view.getContext()) == null) {
                        androidx.fragment.app.d dVar = !(fragment instanceof androidx.fragment.app.d) ? (androidx.fragment.app.d) fragment : null;
                        context = (dVar != null || (dialog = dVar.s) == null) ? null : dialog.getContext();
                        if (context == null) {
                            Context context2 = e43.a;
                            context = context2 != null ? context2 : null;
                        }
                    }
                    l7s u = !z ? bwt0.u(context) : new l7s(context, dhr0.C().c);
                    ikv0.a aVar = new ikv0.a(u);
                    aVar.e = 4000L;
                    if (!(hndVar instanceof hnd.c)) {
                        aVar.e(iah0.a(94));
                        b(aVar, u.getString(R.string.clips_coauthors_max_items_chosen));
                    } else if (hndVar instanceof hnd.b) {
                        hnd.b bVar = (hnd.b) hndVar;
                        boolean z2 = bVar.a;
                        int i = bVar.c;
                        int i2 = bVar.b;
                        if (z2) {
                            ClipsFeatures clipsFeatures = ClipsFeatures.COAUTHORS_REDESIGN;
                            clipsFeatures.getClass();
                            string = (com.vk.toggle.b.A.a(clipsFeatures) && BuildInfo.q()) ? i2 == i ? u.getString(R.string.clips_coauthors_invite_accepted_all) : enj.f(R.plurals.clips_coauthors_invite_accepted_partly, i2, u) : u.getString(R.string.clips_coauthors_invite_accepted);
                        } else {
                            ClipsFeatures clipsFeatures2 = ClipsFeatures.COAUTHORS_REDESIGN;
                            clipsFeatures2.getClass();
                            string = (com.vk.toggle.b.A.a(clipsFeatures2) && BuildInfo.q()) ? i2 == i ? u.getString(R.string.clips_coauthors_invite_declined_all) : enj.f(R.plurals.clips_coauthors_invite_declined_partly, i2, u) : u.getString(R.string.clips_coauthors_invite_declined);
                        }
                        b(aVar, string);
                    } else {
                        boolean z3 = hndVar instanceof hnd.d;
                        int i3 = this.a;
                        if (z3) {
                            aVar.u = new ikv0.d(new ikv0.d.c(u.getString(R.string.clips_coauthors_publish_closed_clip)), (ikv0.d.b) null, new ikv0.d.a(u.getString(R.string.clips_coauthors_publish_closed_clip_subtitle), null, new lz0((hnd.d) hndVar, 18), Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), 2);
                            a(aVar);
                            aVar.e(i3);
                        } else if (hndVar instanceof hnd.f) {
                            aVar.u = new ikv0.d((ikv0.d.c) null, new ikv0.d.b(u.getString(R.string.clips_coauthors_publish_closed_profile_title)), new ikv0.d.a(u.getString(R.string.clips_coauthors_publish_closed_profile_subtitle), null, new defpackage.s(4, (hnd.f) hndVar, window2), Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), 1);
                            a(aVar);
                            aVar.e(i3);
                        } else if (hndVar instanceof hnd.e) {
                            aVar.u = new ikv0.d((ikv0.d.c) null, new ikv0.d.b(u.getString(R.string.clips_coauthors_publish_closed_group_title)), new ikv0.d.a(u.getString(R.string.clips_coauthors_publish_closed_group_subtitle), null, new sh3(8, (hnd.e) hndVar, window2), Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), 1);
                            a(aVar);
                            aVar.e(i3);
                        } else {
                            if (!(hndVar instanceof hnd.a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            hnd.a aVar2 = (hnd.a) hndVar;
                            ClipsFeatures clipsFeatures3 = ClipsFeatures.COAUTHORS_REDESIGN;
                            clipsFeatures3.getClass();
                            b(aVar, com.vk.toggle.b.A.a(clipsFeatures3) ? enj.f(R.plurals.clips_coauthors_clip_deleted_channels, aVar2.a, u) : u.getString(R.string.clips_coauthors_clip_deleted));
                        }
                    }
                    aVar.d = true;
                    aVar.p(window2);
                }
                pair = new Pair(fragment3, window);
            }
            pair2 = pair;
            fragment = (Fragment) pair2.d();
            Window window22 = (Window) pair2.g();
            if (fragment != null) {
            }
            if (!(fragment instanceof androidx.fragment.app.d)) {
            }
            if (dVar != null) {
            }
            if (context == null) {
            }
            if (!z) {
            }
            ikv0.a aVar3 = new ikv0.a(u);
            aVar3.e = 4000L;
            if (!(hndVar instanceof hnd.c)) {
            }
            aVar3.d = true;
            aVar3.p(window22);
        }
    }
}
