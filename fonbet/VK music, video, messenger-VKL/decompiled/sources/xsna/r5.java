package xsna;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.likes.LikesGetList;
import com.vk.bridges.di.InfoBridgeComponent;
import com.vk.core.apps.BuildInfo;
import com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior;
import com.vk.core.ui.bottomsheet.internal.e;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.VideoFile;
import com.vk.ecomm.moderation.api.di.ModerationComponent;
import com.vk.libvideo.api.NotificationsPermission;
import com.vk.libvideo.autoplay.b;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoViewerItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import xsna.dw20;
import xsna.e3m;
import xsna.nw20;
import xsna.nzl;
import xsna.toj0;
import xsna.tzp0;
import xsna.uxn0;

/* compiled from: AboutVideoBottomSheet.kt */
/* loaded from: classes2.dex */
public final class r5 extends dw20 implements fcn, l6s0, e88, m0q0 {
    public static final int k1 = iah0.a(360);
    public static final nzl.a l1 = new nzl.a(0.75f);
    public uxn0 f1;
    public final Object g1;
    public final Object h1;
    public final Object i1;
    public final Object j1;

    /* compiled from: AboutVideoBottomSheet.kt */
    public static final class a extends dw20.b {
        public final n4 e;
        public final sim f;
        public final hvz g;
        public final r5 h;
        public final h88 i;
        public final com.vk.core.ui.bottomsheet.internal.b j;
        public final n5 k;
        public final q530 l;
        public final com.vk.libvideo.bottomsheet.about.delegate.c m;
        public final e9 n;
        public final io.reactivex.rxjava3.disposables.c o;
        public gzs<s3q0> p;
        public boolean q;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v7, types: [io.reactivex.rxjava3.core.q, io.reactivex.rxjava3.internal.operators.observable.u0] */
        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r5v26, types: [io.reactivex.rxjava3.internal.operators.observable.g0] */
        /* JADX WARN: Type inference failed for: r5v47, types: [io.reactivex.rxjava3.core.q, io.reactivex.rxjava3.internal.operators.observable.j1] */
        /* JADX WARN: Type inference failed for: r8v1 */
        /* JADX WARN: Type inference failed for: r8v2, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r8v3 */
        /* JADX WARN: Type inference failed for: r9v1 */
        /* JADX WARN: Type inference failed for: r9v2, types: [boolean] */
        /* JADX WARN: Type inference failed for: r9v3 */
        public a(FragmentActivity fragmentActivity, VideoFile videoFile, n4 n4Var, NotificationsPermission notificationsPermission, vit0 vit0Var, yks0 yks0Var, sim simVar, hvz hvzVar, rcg0 rcg0Var) {
            super(fragmentActivity, null);
            ?? r9;
            boolean z;
            ?? r8;
            io.reactivex.rxjava3.internal.operators.observable.p1 p1Var;
            String j1;
            this.e = n4Var;
            this.f = simVar;
            this.g = hvzVar;
            r5 r5Var = new r5();
            this.h = r5Var;
            q5 q5Var = new q5(this);
            h88 k = n34.k(fragmentActivity);
            this.i = k;
            com.vk.core.ui.bottomsheet.internal.b nzlVar = new nzl(fragmentActivity, r5.l1);
            this.j = k != null ? ((bus0) k).c(fragmentActivity, nzlVar) : nzlVar;
            int i = 1;
            this.k = new n5(this, new l6s0[]{new fyy(new i5(0, fragmentActivity, this))});
            q530 b = ((ModerationComponent) r5Var.h1.getValue()).pa().b(fragmentActivity, (AppCompatActivity) fragmentActivity, false);
            this.l = b;
            this.m = new com.vk.libvideo.bottomsheet.about.delegate.c(((InfoBridgeComponent) r5Var.i1.getValue()).t().b(), q5Var, notificationsPermission, BuildInfo.q() && fnj.d(fragmentActivity), new defpackage.r(rcg0Var, i), new sni(15), fxc0.B().s(), b);
            ezs0 s = fxc0.B().s();
            if (BuildInfo.q() && fnj.d(fragmentActivity)) {
                z = true;
                r9 = 1;
                r8 = 0;
            } else {
                r9 = 1;
                z = false;
                r8 = 0;
            }
            e9 e9Var = new e9(videoFile, yks0Var, vit0Var, s, z);
            boolean z2 = z;
            this.n = e9Var;
            ListBuilder e = e43.e();
            e.add(e9Var.c.b(videoFile));
            if (!fxc0.B().J().a2() || !videoFile.T1()) {
                if (fxc0.B().J().J1()) {
                    e.add(e9Var.c.e(videoFile));
                } else {
                    t8 t8Var = e9Var.c;
                    t8Var.getClass();
                    if (videoFile.l1() == 0) {
                        p1Var = io.reactivex.rxjava3.internal.operators.observable.g0.b;
                    } else {
                        io.reactivex.rxjava3.internal.operators.observable.g1 T = io.reactivex.rxjava3.core.q.T(AboutVideoItem.p.b);
                        LikesGetList.Type type = LikesGetList.Type.VIDEO;
                        LikesGetList likesGetList = new LikesGetList(type, type, videoFile.I0(), videoFile.o0(), 3, LikesGetList.LikesOrder.ALL_USERS_FRIENDS_FIRST, e43.l("is_friend", "first_name_dat", "last_name_dat"));
                        if (((o25.a().b() ? 1 : 0) ^ r9) == r9) {
                            likesGetList.d = r9;
                            likesGetList.c = r9;
                        }
                        p1Var = io.reactivex.rxjava3.core.q.q(T, rsg0.a0(likesGetList).U(new s7(new r7(videoFile, r8), r8))).U(new t7(new o8(1, t8Var, t8.class, "toBlock", "toBlock(Lcom/vk/core/ui/adapter_delegate/ListItem;)Ljava/util/List;", 0, 0), r8)).d0(EmptyList.b);
                    }
                    e.add(p1Var);
                    t8 t8Var2 = e9Var.c;
                    t8Var2.getClass();
                    e.add(io.reactivex.rxjava3.core.q.q(io.reactivex.rxjava3.core.q.T(videoFile), new io.reactivex.rxjava3.internal.operators.observable.q(new z7(videoFile, r8))).U(new n7(new m7(t8Var2, r8), r8)).U(new o7(new r8(1, t8Var2, t8.class, "toBlock", "toBlock(Lcom/vk/core/ui/adapter_delegate/ListItem;)Ljava/util/List;", 0, 0), r8)));
                    if (videoFile.Y3().size() > 0) {
                        e.add(e9Var.c.c(videoFile));
                    }
                }
            }
            if (fxc0.B().J().J1() && (j1 = videoFile.j1()) != null && !drm0.N(j1)) {
                t8 t8Var3 = e9Var.c;
                t8Var3.getClass();
                e.add(new io.reactivex.rxjava3.internal.operators.observable.s0(new f7(videoFile, r8)).U(new g7(new n8(1, t8Var3, t8.class, "toBlock", "toBlock(Lcom/vk/core/ui/adapter_delegate/ListItem;)Ljava/util/List;", 0, 0), r8)));
            }
            if (fxc0.B().J().J1() && com.vk.toggle.b.A.a(VideoFeatures.VIDEO_HELPER_CODEGEN_API)) {
                e.add(e9Var.c.d(videoFile));
            }
            if ((!fxc0.B().J().a2() || !videoFile.T1()) && fxc0.B().J().J1() && videoFile.Y3().size() > 0) {
                e.add(e9Var.c.c(videoFile));
            }
            if (z2) {
                e.add(e9Var.c.d(videoFile));
            }
            if (!fxc0.B().J().a2() || !videoFile.T1()) {
                t8 t8Var4 = e9Var.c;
                t8Var4.getClass();
                String a = com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.VIDEO_ABOUT);
                io.reactivex.rxjava3.internal.operators.observable.j1 U = rsg0.T(new dfs0(videoFile.o0(), 15, videoFile.I0(), a, videoFile.r())).U(new j8(new i8((int) r8), r8)).L(new l8(new k8(r8, t8Var4, a), r8), r8).U(new c7(new b7((int) r8, t8Var4, videoFile), r8));
                AboutVideoItem[] aboutVideoItemArr = new AboutVideoItem[2];
                aboutVideoItemArr[r8] = AboutVideoItem.k.b;
                aboutVideoItemArr[r9] = AboutVideoItem.w.c.b;
                e.add(t8Var4.c.s0(new e7(new d7(U.d0(e43.l(aboutVideoItemArr)), (int) r8), r8)));
            }
            ListBuilder g = e.g();
            int size = g.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i2 = r8; i2 < size; i2++) {
                arrayList.add(null);
            }
            io.reactivex.rxjava3.core.q L = io.reactivex.rxjava3.core.q.O(j5g.W0(g)).L(new z8(new y8(r8), r8), r8);
            asu0 asu0Var = asu0.a;
            asu0Var.getClass();
            this.o = L.a0(asu0.w()).U(new b9(new a9(arrayList, r8), r8)).r0(asu0.r()).a0(asu0Var.d()).subscribe(new k5(new j5(this, (int) r8), r8), new m5(new l5(this, (int) r8), r8));
        }

        public final void S0(h88 h88Var) {
            boolean r = iah0.r(this.c);
            Integer a = h88Var != null ? h88Var.a() : null;
            int intValue = a != null ? a.intValue() : (!fnj.d(this.c) || r) ? r ? r5.k1 : dw20.e1 : iah0.f().widthPixels;
            this.d.A0 = intValue;
            this.h.J0 = intValue;
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            Context context;
            if (this.q) {
                throw new IllegalArgumentException("don't reuse builder for creating about bottom sheet");
            }
            this.q = true;
            v0(fxc0.B().J().J1() ? R.string.video_about_title_redesign : R.string.video_about_title);
            if (fxc0.B().J().J1()) {
                Context context2 = this.c;
                e3m.a aVar = e3m.a;
                y0(context2.getColor(R.color.vk_gray_100));
            }
            i(this.m, (r3 & 2) == 0, false);
            dhr0.a.getClass();
            gpu0 gpu0Var = new gpu0(dhr0.s());
            gpu0Var.j = new o5();
            int i = 0;
            gpu0Var.e = 0;
            context = this.c;
            HashSet hashSet = iah0.a;
            if (fnj.d(context)) {
                float f = 16;
                gpu0Var.i = iah0.a(f);
                gpu0Var.h = iah0.a(f);
            }
            l0(gpu0Var);
            c(this.j);
            u0(dhr0.u().c);
            Context context3 = this.c;
            lpj lpjVar = context3 instanceof lpj ? (lpj) context3 : null;
            Integer valueOf = lpjVar != null ? Integer.valueOf(lpjVar.getThemeResId()) : null;
            int i2 = dhr0.u().c;
            if (valueOf == null || valueOf.intValue() != i2) {
                context3 = new l7s(context3, dhr0.u().c);
            }
            int f2 = e3m.f(R.attr.vk_ui_background_content, context3);
            l(f2);
            S(f2);
            e5 e5Var = new e5(this, i);
            e.a aVar2 = this.d;
            aVar2.b1 = e5Var;
            S0(this.i);
            d0(new f5(this, 0));
            a0(new g5(this, i));
            f0(new h5(this, i));
            n(this.k);
            J();
            q0(false);
            R0(false);
            v(0);
            aVar2.u1 = false;
            androidx.recyclerview.widget.g gVar = new androidx.recyclerview.widget.g();
            gVar.g = false;
            aVar2.t1 = gVar;
            E0(true);
            aVar2.B1 = true;
            return this.h;
        }
    }

    /* compiled from: AboutVideoBottomSheet.kt */
    public static final class b extends nw20 {
        @Override // xsna.nw20, xsna.b33, android.app.Dialog, android.content.DialogInterface
        public final void dismiss() {
            Activity ownerActivity = getOwnerActivity();
            if (ownerActivity == null) {
                return;
            }
            if (ownerActivity.isFinishing() || ownerActivity.isDestroyed()) {
                super.dismiss();
                return;
            }
            ModalBottomSheetBehavior<ViewGroup> modalBottomSheetBehavior = this.i;
            if (modalBottomSheetBehavior != null) {
                int i = modalBottomSheetBehavior.k;
                int i2 = this.Y;
                if (i2 <= 0) {
                    i2 = 5;
                }
                if (i == i2) {
                    super.dismiss();
                    return;
                }
            }
            nw20.c cVar = this.V0;
            if (cVar != null) {
                this.D0.removeCallbacks(cVar);
                this.V0 = null;
            }
            ModalBottomSheetBehavior<ViewGroup> modalBottomSheetBehavior2 = this.i;
            if (modalBottomSheetBehavior2 != null) {
                modalBottomSheetBehavior2.O(5);
            }
            this.O0 = true;
        }
    }

    public r5() {
        this.x = new tzp0.c.a(this, true);
        defpackage.h hVar = new defpackage.h(this, 1);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.g1 = msy.a(lazyThreadSafetyMode, hVar);
        this.h1 = msy.a(lazyThreadSafetyMode, new defpackage.i(this, 1));
        this.i1 = msy.a(lazyThreadSafetyMode, new defpackage.j(this, 2));
        this.j1 = msy.a(lazyThreadSafetyMode, new defpackage.k(this, 2));
    }

    @Override // xsna.dw20
    public final nw20 Fn(int i, Context context) {
        return new b(context, i);
    }

    @Override // xsna.fcn
    public final boolean M4() {
        return true;
    }

    @Override // xsna.fcn
    public final boolean N8() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.l6s0
    public final k6s0 Y4() {
        return (k6s0) this.j1.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Yn(Dialog dialog) {
        Context context;
        Context requireContext = requireContext();
        HashSet hashSet = iah0.a;
        if (fnj.d(requireContext)) {
            if (this.f1 == null) {
                this.f1 = new uxn0(dialog);
            }
            uxn0 uxn0Var = this.f1;
            if (uxn0Var != null) {
                uxn0.a.b bVar = uxn0Var.c;
                uxn0.a.C3849a c3849a = uxn0Var.d;
                RecyclerView recyclerView = uxn0Var.b;
                if (recyclerView == null || (context = recyclerView.getContext()) == null) {
                    return;
                }
                uxn0.a.b bVar2 = !iah0.s(context) ? c3849a : bVar;
                recyclerView.setLayoutManager(bVar2 != null ? bVar2.b() : null);
                RecyclerView.n a2 = bVar2 != null ? bVar2.a() : null;
                toj0.b bVar3 = bVar != null ? bVar.b : null;
                toj0.a aVar = c3849a != 0 ? c3849a.b : null;
                if (bVar3 != null) {
                    recyclerView.removeItemDecoration(bVar3);
                }
                if (aVar != null) {
                    recyclerView.removeItemDecoration(aVar);
                }
                if (a2 != null) {
                    recyclerView.addItemDecoration(a2);
                }
                Dialog dialog2 = uxn0Var.a;
                View findViewById = dialog2.findViewById(R.id.ivClose);
                View findViewById2 = dialog2.findViewById(R.id.llTitleContainer);
                int a3 = iah0.r(dialog2.getContext()) ? iah0.a(4) : iah0.a(16);
                int a4 = iah0.a(12);
                if (findViewById != null) {
                    f4m.s(a3, findViewById);
                }
                if (findViewById2 != null) {
                    f4m.s(a4 + a3, findViewById2);
                }
            }
        }
    }

    @Override // xsna.fcn
    public final void b(boolean z) {
        Dialog dialog = this.s;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    @Override // xsna.dw20, xsna.dh6, androidx.fragment.app.d
    public final void dismiss() {
        b(false);
    }

    @Override // xsna.dw20, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Dialog dialog = this.s;
        Context requireContext = requireContext();
        HashSet hashSet = iah0.a;
        if (!fnj.d(requireContext) || dialog == null) {
            return;
        }
        Yn(dialog);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f1 = null;
    }

    @Override // xsna.fcn
    public final boolean v6() {
        return false;
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        yg5 yg5Var;
        VideoFile A;
        uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.VIDEO_ABOUT;
        bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
        xh5 xh5Var = b.C1208b.a().c;
        if (xh5Var == null || (yg5Var = xh5Var.a) == null || (A = yg5Var.A()) == null) {
            return;
        }
        uiTrackingScreen.f = new SchemeStat$EventItem(SchemeStat$EventItem.Type.VIDEO, Long.valueOf(A.o0()), Long.valueOf(A.I0().b), null, A.r(), null, 40, null);
        uiTrackingScreen.a(new MobileOfficialAppsVideoStat$TypeVideoViewerItem(MobileOfficialAppsVideoStat$TypeVideoViewerItem.TypeScreen.TYPE_VIDEO_ABOUT));
    }

    @Override // xsna.dw20, xsna.c33, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        Dialog yn = super.yn(bundle);
        Yn(yn);
        return yn;
    }
}
