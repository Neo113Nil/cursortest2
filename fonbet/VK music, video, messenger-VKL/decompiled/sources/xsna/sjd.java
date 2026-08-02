package xsna;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.appbar.NonBouncedAppBarLayout;
import com.google.android.material.appbar.NonBouncedCollapsingToolbarLayout;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vkontakte.android.R;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.a3p0;
import xsna.iut0;

/* compiled from: ClipsBaseGridToolbar.kt */
/* loaded from: classes17.dex */
public abstract class sjd implements d3p0 {
    public static final float n = iah0.b(20.0f);
    public final fee a;
    public final View b;
    public final ree c;
    public final VkTopBar d;
    public final NonBouncedAppBarLayout e;
    public final View f;
    public final NonBouncedCollapsingToolbarLayout g;
    public final Context h;
    public CharSequence i;
    public String j;
    public final see k;
    public final q13 l;
    public int m;

    public sjd(fee feeVar, View view, ree reeVar) {
        this.a = feeVar;
        this.b = view;
        this.c = reeVar;
        VkTopBar vkTopBar = (VkTopBar) view.findViewById(R.id.toolbar);
        this.d = vkTopBar;
        NonBouncedAppBarLayout nonBouncedAppBarLayout = (NonBouncedAppBarLayout) view.findViewById(R.id.clips_grid_non_bounced_app_bar_layout);
        this.e = nonBouncedAppBarLayout;
        View findViewById = view.findViewById(R.id.clip_feed_top_tab_padding);
        this.f = findViewById;
        this.g = (NonBouncedCollapsingToolbarLayout) view.findViewById(R.id.collapsing_layout);
        Context context = view.getContext();
        this.h = context;
        this.k = new see(findViewById, !reeVar.c);
        q13 q13Var = new q13(context.getResources().getDimensionPixelSize(R.dimen.clips_grid_appbar_height), context, EmptyList.b);
        this.l = q13Var;
        vkTopBar.setInitialMode(VkTopBar.j.a.a);
        boolean z = reeVar.b;
        VkTopBar.b bVar = null;
        if (z) {
            bVar = new VkTopBar.b(new rjd(0, feeVar, fee.class, "onNavigationClicked", "onNavigationClicked()V", 0, 0), tq.h(tlo0.Companion, R.string.clips_grid_talkback_go_back), null, null, com.vk.core.compose.component.semantics.b.a(null, new b40(8), 3), 12);
        } else if (z) {
            throw new NoWhenBranchMatchedException();
        }
        vkTopBar.setBack(bVar);
        nonBouncedAppBarLayout.setBackgroundColor(0);
        nonBouncedAppBarLayout.h(true, false, true);
        nonBouncedAppBarLayout.setExpandingBlocked(false);
        nonBouncedAppBarLayout.a(new NonBouncedAppBarLayout.d() { // from class: xsna.qjd
            @Override // com.google.android.material.appbar.NonBouncedAppBarLayout.d
            public final void a(NonBouncedAppBarLayout nonBouncedAppBarLayout2, int i) {
                int totalScrollRange = nonBouncedAppBarLayout2.getTotalScrollRange();
                sjd sjdVar = sjd.this;
                VkTopBar vkTopBar2 = sjdVar.d;
                vkTopBar2.setShowBottomDivider(!(sjdVar instanceof ebd) && ((double) Math.abs(i)) < ((double) totalScrollRange) * 0.95d);
                q13 q13Var2 = sjdVar.l;
                q13Var2.h = vkTopBar2.getHeight() + nonBouncedAppBarLayout2.getTotalScrollRange() + sjdVar.m;
                q13Var2.a(q13Var2.a);
                Object obj = (((double) Math.abs(i)) <= ((double) totalScrollRange) * 0.95d && (Math.abs(i) < (totalScrollRange - sjdVar.m) / 2 || sjdVar.j())) ? sjdVar.j : sjdVar.i;
                if (obj != null) {
                    vkTopBar2.post(new zq5(1, sjdVar, obj));
                }
            }
        });
        q13Var.b(nonBouncedAppBarLayout, fnj.d(nonBouncedAppBarLayout.getContext()));
        z9c z9cVar = new z9c(this, 2);
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        iut0.d.c(view, z9cVar);
    }

    @Override // xsna.d3p0
    public void a() {
        this.d.setShowBottomDivider(true);
        l().setVisibility(0);
        k().setVisibility(8);
    }

    @Override // xsna.d3p0
    public void e() {
        this.d.setShowBottomDivider(false);
    }

    @Override // xsna.d3p0
    public void h(a3p0.c cVar) {
        l().setVisibility(8);
        k().setVisibility(0);
    }

    public boolean j() {
        return false;
    }

    public abstract View k();

    public abstract FrameLayout l();

    @Override // xsna.d3p0
    public void d(v9f v9fVar) {
    }
}
