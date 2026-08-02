package com.yandex.go.promocodes.referral.impl.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.yandex.mapkit.ScreenRect;
import defpackage.a7h0;
import defpackage.b7p0;
import defpackage.cma1;
import defpackage.czo0;
import defpackage.ffx;
import defpackage.fvh0;
import defpackage.hbp0;
import defpackage.j73;
import defpackage.joi0;
import defpackage.k4o;
import defpackage.koi0;
import defpackage.mmp0;
import defpackage.n3h0;
import defpackage.nac;
import defpackage.obv;
import defpackage.rp31;
import defpackage.sls;
import defpackage.sni0;
import defpackage.tje;
import defpackage.uni0;
import defpackage.w511;
import defpackage.xni0;
import defpackage.xw31;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;
import ru.yandex.taxi.utils.c;

/* loaded from: classes13.dex */
public final class b implements uni0, sni0 {
    public final xni0 a;
    public final c b;
    public ViewGroup e;
    public b7p0 f;
    public ViewGroup g;
    public sls h;
    public View i;
    public ReferralMainScreenButton j;
    public View k;
    public View l;
    public View m;
    public final hbp0 c = new hbp0(new czo0(14), "", null);
    public int d = -1;
    public final n0 n = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);

    public b(xni0 xni0Var, c cVar) {
        this.a = xni0Var;
        this.b = cVar;
    }

    public static Integer b(View view, ScreenRect screenRect) {
        if (view == null || screenRect == null) {
            return null;
        }
        return Integer.valueOf(((int) (((screenRect.getBottomRight().getY() - screenRect.getTopLeft().getY()) / 2.0f) - (view.getHeight() / 2))) + ((int) screenRect.getTopLeft().getY()));
    }

    public final void a(ReferralGiftViewHolder$ButtonType... referralGiftViewHolder$ButtonTypeArr) {
        k4o a = ReferralGiftViewHolder$ButtonType.a();
        ArrayList arrayList = new ArrayList();
        for (Object obj : a) {
            if (!j73.y(referralGiftViewHolder$ButtonTypeArr, (ReferralGiftViewHolder$ButtonType) obj)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int i = koi0.a[((ReferralGiftViewHolder$ButtonType) it.next()).ordinal()];
            if (i == 1) {
                View view = this.i;
                if (view != null) {
                    xw31.a(view);
                    cma1.L(view);
                    this.i = null;
                }
            } else if (i == 2) {
                ReferralMainScreenButton referralMainScreenButton = this.j;
                if (referralMainScreenButton != null) {
                    cma1.L(referralMainScreenButton);
                }
            } else if (i == 3) {
                View view2 = this.k;
                if (view2 != null) {
                    xw31.a(view2);
                    this.k = null;
                }
            } else if (i == 4) {
                View view3 = this.l;
                if (view3 != null) {
                    xw31.a(view3);
                    this.l = null;
                }
            } else {
                if (i != 5) {
                    w511.b();
                    return;
                }
                View view4 = this.m;
                if (view4 != null) {
                    xw31.a(view4);
                    cma1.L(view4);
                    this.m = null;
                }
            }
        }
    }

    public final View c(View view, ViewGroup viewGroup) {
        if (viewGroup == null) {
            return null;
        }
        if (view != null) {
            return view;
        }
        View.inflate(viewGroup.getContext(), fvh0.source_point_referral_gift, viewGroup);
        int i = a7h0.referral_gift_button_main;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        View view2 = (View) rp31.d(viewGroup, i);
        view2.setOnClickListener(new a(this, 0));
        return view2;
    }

    public final void d(View view, String str) {
        if (str == null) {
            return;
        }
        if (!(view instanceof ReferralMainScreenButton)) {
            if (view instanceof ImageView) {
                e((ImageView) view, str);
            }
        } else {
            ImageView imageView = ((ReferralMainScreenButton) view).getImageView();
            if (imageView != null) {
                e(imageView, str);
            }
        }
    }

    public final void e(ImageView imageView, String str) {
        nac nacVar = (nac) this.b.a.a(imageView);
        nacVar.e(n3h0.ic_gift_box);
        nacVar.b(new obv(str, null, 6, 0));
    }

    public final void f() {
        joi0 joi0Var = new joi0(this);
        xni0 xni0Var = this.a;
        xni0Var.Bg(joi0Var);
        tje.N(xni0Var.Jg(), null, null, new ReferralGiftPresenter$attachView$1(xni0Var, null), 3);
        hbp0 hbp0Var = this.c;
        hbp0Var.a();
        tje.N(hbp0Var.c(), null, null, new ReferralGiftViewHolder$onCreate$1(this, null), 3);
    }

    public final void g() {
        this.c.b();
        this.a.Cg();
        a(new ReferralGiftViewHolder$ButtonType[0]);
        this.e = null;
        this.d = -1;
        this.f = null;
        this.g = null;
        View view = this.m;
        if (view != null) {
            xw31.a(view);
        }
        this.g = null;
        this.l = null;
        this.m = null;
        this.i = null;
        this.j = null;
        this.k = null;
    }

    public final void h(mmp0 mmp0Var) {
        this.h = mmp0Var != null ? new ReferralGiftViewHolder$setOnClickListener$1$1(0, mmp0Var, Runnable.class, "run", "run()V", 0) : null;
    }
}
