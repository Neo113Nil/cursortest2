package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.yandex.bricks.BrickSlotView;
import com.yandex.bricks.c;
import com.yandex.messaging.miniapps.js.listeners.b;
import com.yandex.messaging.miniapps.size.PredefinedSizeValue;
import com.yandex.messaging.miniapps.view.a;
import java.util.Locale;
import java.util.UUID;
import kotlin.Pair;

/* loaded from: classes15.dex */
public final class ph20 implements nh20 {
    public final b a;
    public final x22 b;
    public final Resources c;
    public final oh20 d;
    public final pzf e;
    public final wh20 f;
    public String g;
    public final i3y h;
    public final BottomSheetDialog i;
    public final c j;
    public a k;

    public ph20(Activity activity, r8g r8gVar, kse kseVar, b bVar, x22 x22Var) {
        this.a = bVar;
        this.b = x22Var;
        this.c = activity.getResources();
        String uuid = UUID.randomUUID().toString();
        String language = Locale.getDefault().getLanguage();
        oh20 oh20Var = new oh20(kseVar.a.plus(jl40.a()));
        this.d = oh20Var;
        int i = olh0.msg_b_miniapp_bottomsheet;
        int i2 = kng0.messagingIsLightTheme;
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(i2, typedValue, true);
        r8gVar.e = new lh20(false, i, uuid, language, !(typedValue.data != 0));
        r8gVar.f = this;
        r8gVar.g = oh20Var;
        pzf a = r8gVar.a();
        this.e = a;
        this.f = (wh20) ((xvf0) a.c).get();
        int i3 = w0i0.Messaging_Theme_BottomSheetDialog_Miniapp;
        this.h = kotlin.a.a(new m020(5, this));
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(activity, i3);
        bottomSheetDialog.setContentView(olh0.msg_d_bottom_sheet_miniapp);
        bottomSheetDialog.setCanceledOnTouchOutside(true);
        bottomSheetDialog.getBehavior().Q(true);
        bottomSheetDialog.getBehavior().g0 = false;
        bottomSheetDialog.getBehavior().f0 = true;
        bottomSheetDialog.getBehavior().W(3);
        bottomSheetDialog.setOnKeyListener(new eb3(4, this));
        bottomSheetDialog.setOnDismissListener(new zf6(4, this));
        this.i = bottomSheetDialog;
        BrickSlotView brickSlotView = (BrickSlotView) bottomSheetDialog.findViewById(e9h0.miniapp_container);
        if (brickSlotView != null) {
            this.j = new c(brickSlotView);
        } else {
            ny61.r("container required");
            throw null;
        }
    }

    @Override // defpackage.nh20
    public final void a(int i) {
        int min = Math.min(i, e() - this.c.getDimensionPixelSize(gvg0.messaging_toolbar_size));
        View view = this.j.a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null && layoutParams.height != min) {
            layoutParams.height = min;
            view.requestLayout();
        }
        f(min);
    }

    @Override // defpackage.nh20
    public final void b() {
        dismiss();
    }

    @Override // defpackage.nh20
    public final void c(String str) {
        BottomSheetDialog bottomSheetDialog = this.i;
        boolean isShowing = bottomSheetDialog.isShowing();
        wh20 wh20Var = this.f;
        x22 x22Var = this.b;
        if (isShowing) {
            x22Var.reportEvent("csat_error_already_shown", kotlin.collections.b.i(new Pair("currentUrl", wh20Var.c), new Pair("newUrl", str)));
            return;
        }
        x22Var.reportEvent("csat_show", gw00.e(new Pair("url", str)));
        wh20Var.c = null;
        wh20Var.b = str;
        String a = wh20Var.a();
        if (a == null) {
            ny61.r("miniappUrl wasn't built");
            return;
        }
        this.g = a;
        a aVar = (a) ((nt0) this.e.m).get();
        this.k = aVar;
        this.j.a(aVar);
        a aVar2 = this.k;
        if (aVar2 != null) {
            aVar2.q(a);
        }
        bottomSheetDialog.getBehavior().Q(true);
        bottomSheetDialog.getBehavior().W(3);
        bottomSheetDialog.show();
    }

    @Override // defpackage.nh20
    public final void d(jjs0 jjs0Var) {
        int e;
        hdb1 hdb1Var = jjs0Var.a;
        boolean z = hdb1Var instanceof sjs0;
        Resources resources = this.c;
        if (z) {
            e = Math.min(m810.b(((sjs0) hdb1Var).a * kjs0.a.density), e() - resources.getDimensionPixelSize(gvg0.messaging_toolbar_size));
        } else if (!(hdb1Var instanceof tjs0)) {
            if (hdb1Var == null) {
                return;
            }
            w511.b();
            return;
        } else if (((tjs0) hdb1Var).a != PredefinedSizeValue.MatchSafeViewportArea) {
            return;
        } else {
            e = e() - resources.getDimensionPixelSize(gvg0.messaging_toolbar_size);
        }
        View view = this.j.a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null && layoutParams.height != e) {
            layoutParams.height = e;
            view.requestLayout();
        }
        f(e);
    }

    @Override // defpackage.nh20
    public final void dismiss() {
        this.i.dismiss();
        a aVar = this.k;
        if (aVar != null) {
            aVar.C.setVisibility(8);
            aVar.D.destroy();
        }
        this.k = null;
        kotlinx.coroutines.a.g(this.d.a, null);
    }

    public final int e() {
        ViewParent parent = this.j.a.getParent();
        while (true) {
            if (parent == null) {
                parent = null;
                break;
            }
            if (parent instanceof CoordinatorLayout) {
                break;
            }
            parent = parent.getParent();
        }
        CoordinatorLayout coordinatorLayout = parent instanceof CoordinatorLayout ? (CoordinatorLayout) parent : null;
        return (coordinatorLayout == null || coordinatorLayout.getHeight() <= 0) ? ((Number) this.h.getValue()).intValue() : coordinatorLayout.getHeight();
    }

    public final void f(int i) {
        BottomSheetDialog bottomSheetDialog = this.i;
        bottomSheetDialog.getBehavior().Q(false);
        int e = e() - i;
        bottomSheetDialog.getBehavior().P(e >= 0 ? e : 0);
        bottomSheetDialog.getBehavior().W(3);
    }

    @Override // defpackage.nh20
    public final boolean isShowing() {
        return this.i.isShowing();
    }
}
