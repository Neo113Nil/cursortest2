package com.yandex.go.places.impl.ui.organizations.recycler.viewholders;

import android.os.SystemClock;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.places.common.ui.indicator.DotsIndicatorComponent;
import com.yandex.go.places.impl.ui.common.compression_resistant.CompressionResistantListComponent;
import com.yandex.go.places.impl.ui.organizations.recycler.viewholders.a;
import defpackage.a4j0;
import defpackage.ae80;
import defpackage.ak80;
import defpackage.b65;
import defpackage.bm50;
import defpackage.dy4;
import defpackage.fr;
import defpackage.gk80;
import defpackage.i3y;
import defpackage.j73;
import defpackage.kw00;
import defpackage.m810;
import defpackage.mqg0;
import defpackage.mrg0;
import defpackage.ny61;
import defpackage.pav;
import defpackage.pj80;
import defpackage.qp80;
import defpackage.qw8;
import defpackage.rcc;
import defpackage.scc;
import defpackage.sls;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tls;
import defpackage.to80;
import defpackage.tt2;
import defpackage.ub60;
import defpackage.wh91;
import defpackage.wls;
import defpackage.xj80;
import defpackage.xng0;
import defpackage.ymg0;
import defpackage.zo31;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.design.RatingBarComponent;
import ru.yandex.taxi.design.utils.TopRoundRectBackgroundHelper$makeViewRounded$1;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class a extends dy4 {
    public static final /* synthetic */ int h0 = 0;
    public final qp80 T;
    public final pav U;
    public final tt2 V;
    public final int W;
    public final a4j0 Z;
    public final ub60 a0;
    public final wls b0;
    public final ak80 c0;
    public final i3y d0;
    public final i3y e0;
    public final i3y f0;
    public ae80 g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(to80 to80Var, qp80 qp80Var, pav pavVar, tt2 tt2Var, int i, int i2, a4j0 a4j0Var, ub60 ub60Var, wls wlsVar, ak80 ak80Var) {
        super(to80Var, 0);
        final int i3 = 0;
        this.T = qp80Var;
        this.U = pavVar;
        this.V = tt2Var;
        this.W = i2;
        this.Z = a4j0Var;
        this.a0 = ub60Var;
        this.b0 = wlsVar;
        this.c0 = ak80Var;
        sls slsVar = new sls(this) { // from class: ik80
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int h;
                int i4 = i3;
                a aVar = this.b;
                switch (i4) {
                    case 0:
                        h = c.h(1, aVar.a);
                        break;
                    case 1:
                        h = c.d(mrg0.go_design_m_space, aVar.a);
                        break;
                    case 2:
                        h = c.d(dug0.organization_snippet_tag_corner_radius, aVar.a);
                        break;
                    default:
                        h = c.d(dug0.organization_snippet_dots_corner_radius, aVar.a);
                        break;
                }
                return Integer.valueOf(h);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.d0 = kotlin.a.b(lazyThreadSafetyMode, slsVar);
        final int i4 = 1;
        i3y b = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: ik80
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int h;
                int i42 = i4;
                a aVar = this.b;
                switch (i42) {
                    case 0:
                        h = c.h(1, aVar.a);
                        break;
                    case 1:
                        h = c.d(mrg0.go_design_m_space, aVar.a);
                        break;
                    case 2:
                        h = c.d(dug0.organization_snippet_tag_corner_radius, aVar.a);
                        break;
                    default:
                        h = c.d(dug0.organization_snippet_dots_corner_radius, aVar.a);
                        break;
                }
                return Integer.valueOf(h);
            }
        });
        this.e0 = b;
        final int i5 = 2;
        this.f0 = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: ik80
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int h;
                int i42 = i5;
                a aVar = this.b;
                switch (i42) {
                    case 0:
                        h = c.h(1, aVar.a);
                        break;
                    case 1:
                        h = c.d(mrg0.go_design_m_space, aVar.a);
                        break;
                    case 2:
                        h = c.d(dug0.organization_snippet_tag_corner_radius, aVar.a);
                        break;
                    default:
                        h = c.d(dug0.organization_snippet_dots_corner_radius, aVar.a);
                        break;
                }
                return Integer.valueOf(h);
            }
        });
        final int i6 = 3;
        i3y b2 = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: ik80
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int h;
                int i42 = i6;
                a aVar = this.b;
                switch (i42) {
                    case 0:
                        h = c.h(1, aVar.a);
                        break;
                    case 1:
                        h = c.d(mrg0.go_design_m_space, aVar.a);
                        break;
                    case 2:
                        h = c.d(dug0.organization_snippet_tag_corner_radius, aVar.a);
                        break;
                    default:
                        h = c.d(dug0.organization_snippet_dots_corner_radius, aVar.a);
                        break;
                }
                return Integer.valueOf(h);
            }
        });
        c.D(i2, i2, qp80Var.d);
        c.D(i2, i2, qp80Var.e);
        c.D(i2, i2, qp80Var.f);
        DotsIndicatorComponent dotsIndicatorComponent = to80Var.e;
        dotsIndicatorComponent.setSelectedDotColor(c.a(mqg0.white, this.a));
        dotsIndicatorComponent.setDotColor(c.a(mqg0.white, this.a));
        View view = to80Var.d;
        view.setOutlineProvider(new TopRoundRectBackgroundHelper$makeViewRounded$1(((Number) b2.getValue()).intValue()));
        view.setClipToOutline(true);
        ViewPager2 viewPager2 = to80Var.g;
        wh91.a(viewPager2);
        c.D(i, i2, viewPager2);
        viewPager2.setClipToOutline(true);
        viewPager2.setOutlineProvider(new TopRoundRectBackgroundHelper$makeViewRounded$1(((Number) b.getValue()).intValue()));
        viewPager2.setClipToOutline(true);
        RecyclerView recyclerView = to80Var.i;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        recyclerView.addItemDecoration(new xj80(recyclerView.getContext()));
        recyclerView.setClipToOutline(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c0(a aVar, CompressionResistantListComponent compressionResistantListComponent, List list, ContinuationImpl continuationImpl) {
        OrganizationPreviewV2ViewHolder$bindResistantAttributedText$1 organizationPreviewV2ViewHolder$bindResistantAttributedText$1;
        int i;
        aVar.getClass();
        if (continuationImpl instanceof OrganizationPreviewV2ViewHolder$bindResistantAttributedText$1) {
            organizationPreviewV2ViewHolder$bindResistantAttributedText$1 = (OrganizationPreviewV2ViewHolder$bindResistantAttributedText$1) continuationImpl;
            int i2 = organizationPreviewV2ViewHolder$bindResistantAttributedText$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                organizationPreviewV2ViewHolder$bindResistantAttributedText$1.label = i2 - Integer.MIN_VALUE;
                Object obj = organizationPreviewV2ViewHolder$bindResistantAttributedText$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = organizationPreviewV2ViewHolder$bindResistantAttributedText$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List list2 = list;
                    if (list2 == null || list2.isEmpty()) {
                        compressionResistantListComponent.setVisibility(8);
                        return zy11Var;
                    }
                    tt2 tt2Var = aVar.V;
                    organizationPreviewV2ViewHolder$bindResistantAttributedText$1.L$0 = compressionResistantListComponent;
                    organizationPreviewV2ViewHolder$bindResistantAttributedText$1.L$1 = null;
                    organizationPreviewV2ViewHolder$bindResistantAttributedText$1.label = 1;
                    if (compressionResistantListComponent.setTexts$impl(list, tt2Var, organizationPreviewV2ViewHolder$bindResistantAttributedText$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    compressionResistantListComponent = (CompressionResistantListComponent) organizationPreviewV2ViewHolder$bindResistantAttributedText$1.L$0;
                    kotlin.b.b(obj);
                }
                compressionResistantListComponent.setVisibility(0);
                return zy11Var;
            }
        }
        organizationPreviewV2ViewHolder$bindResistantAttributedText$1 = new OrganizationPreviewV2ViewHolder$bindResistantAttributedText$1(aVar, continuationImpl);
        Object obj2 = organizationPreviewV2ViewHolder$bindResistantAttributedText$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = organizationPreviewV2ViewHolder$bindResistantAttributedText$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        compressionResistantListComponent.setVisibility(0);
        return zy11Var2;
    }

    @Override // defpackage.wys
    public final void Y() {
        super.Y();
        to80 to80Var = (to80) ((zo31) this.R);
        to80Var.g.setAdapter(null);
        to80Var.i.setAdapter(null);
        to80Var.q.setText((CharSequence) null);
        CompressionResistantListComponent compressionResistantListComponent = to80Var.n;
        compressionResistantListComponent.removeAllViews();
        compressionResistantListComponent.setVisibility(8);
        ae80 ae80Var = this.g0;
        if (ae80Var != null) {
            ae80Var.a();
        }
        this.g0 = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v34, types: [android.view.Choreographer$FrameCallback, com.yandex.go.places.impl.ui.organizations.recycler.OrganisationsVisibilityTracker$start$cb$1] */
    @Override // defpackage.dy4, defpackage.wys
    public final void c(Object obj) {
        b65 b65Var = (b65) obj;
        zo31 zo31Var = (zo31) this.R;
        boolean z = b65Var.j;
        CharSequence charSequence = b65Var.c;
        if (z) {
            e0(false);
            f0(true);
            return;
        }
        f0(false);
        e0(true);
        String str = null;
        b0(new OrganizationPreviewV2ViewHolder$bind$1(this, b65Var, null));
        List list = b65Var.b;
        if (list.isEmpty()) {
            to80 to80Var = (to80) zo31Var;
            to80Var.i.setVisibility(8);
            to80Var.h.setVisibility(8);
        } else if (list.size() <= 2) {
            qw8 qw8Var = new qw8(this.U, this.a0, null, null, null, 60);
            to80 to80Var2 = (to80) zo31Var;
            RecyclerView recyclerView = to80Var2.i;
            DotsIndicatorComponent dotsIndicatorComponent = to80Var2.e;
            recyclerView.setVisibility(8);
            ViewPager2 viewPager2 = to80Var2.g;
            viewPager2.setAdapter(qw8Var);
            viewPager2.registerOnPageChangeCallback(new pj80(scc.f(list), dotsIndicatorComponent));
            viewPager2.setPageTransformer(new kw00(((Number) this.d0.getValue()).intValue(), 0));
            viewPager2.setVisibility(0);
            qw8Var.submitList(list, null);
            boolean z2 = list.size() == 2;
            dotsIndicatorComponent.setVisibility(z2 ? 0 : 8);
            to80Var2.d.setVisibility(z2 ? 0 : 8);
            to80Var2.h.setVisibility(0);
        } else if (list.size() > 2) {
            int i = this.W;
            qw8 qw8Var2 = new qw8(this.U, this.a0, Integer.valueOf(i), Integer.valueOf(i), Integer.valueOf(((Number) this.e0.getValue()).intValue()), 4);
            to80 to80Var3 = (to80) zo31Var;
            to80Var3.h.setVisibility(8);
            RecyclerView recyclerView2 = to80Var3.i;
            recyclerView2.setAdapter(qw8Var2);
            recyclerView2.setVisibility(0);
            qw8Var2.submitList(list, null);
        }
        gk80 gk80Var = b65Var.f;
        to80 to80Var4 = (to80) zo31Var;
        if (gk80Var == null) {
            to80Var4.m.setVisibility(8);
            to80Var4.k.setVisibility(8);
            to80Var4.j.setVisibility(8);
            to80Var4.f.setVisibility(8);
        } else {
            String str2 = gk80Var.b;
            Double d = gk80Var.a;
            if (d != null) {
                String format = String.format("%.1f", Arrays.copyOf(new Object[]{d}, 1));
                RobotoTextView robotoTextView = to80Var4.m;
                RatingBarComponent ratingBarComponent = to80Var4.k;
                robotoTextView.setText(format);
                robotoTextView.setVisibility(format.length() > 0 ? 0 : 8);
                to80Var4.f.setVisibility(8);
                ratingBarComponent.setStarsClickable(false);
                ratingBarComponent.setSelectedColor(c.a(mqg0.component_amber_dark, this.a));
                ratingBarComponent.setStarColor(xng0.line);
                int a = m810.a(d.doubleValue());
                ratingBarComponent.setRating(a);
                LinearLayout linearLayout = to80Var4.l;
                String str3 = (String) j73.G(a - 1, ratingBarComponent.getResources().getStringArray(ymg0.rating_view_titles));
                if (str3 != null) {
                    str = ((Object) to80Var4.m.getText()) + " " + str3;
                }
                linearLayout.setContentDescription(str);
                ratingBarComponent.setVisibility(0);
            } else {
                to80Var4.m.setVisibility(8);
                to80Var4.k.setVisibility(8);
                to80Var4.f.setVisibility(0);
            }
            to80Var4.j.setText(str2);
            to80Var4.k.setContentDescription(str2);
        }
        RobotoTextView robotoTextView2 = to80Var4.q;
        RobotoTextView robotoTextView3 = to80Var4.q;
        robotoTextView2.setText(charSequence);
        robotoTextView3.setContentDescription(charSequence);
        c.z(new bm50(14, b65Var, this), to80Var4.a);
        g0(to80Var4.p, to80Var4.o, b65Var.e, new OrganizationPreviewV2ViewHolder$bind$2$2(1, this, a.class, "createTagView", "createTagView(Lcom/yandex/go/places/impl/domain/entities/organizations/OrganizationPreviewTag;)Landroid/view/View;", 0));
        g0(to80Var4.c, to80Var4.b, b65Var.g, new OrganizationPreviewV2ViewHolder$bind$2$3(1, this, a.class, "createActionButton", "createActionButton(Lcom/yandex/go/places/impl/domain/entities/organizations/OrganizationPreviewCardButton;)Landroid/view/View;", 0));
        fr frVar = b65Var.h;
        if (frVar != null) {
            this.g0 = new ae80(robotoTextView3, b65Var.a, this.Z, new bm50(15, this, frVar));
        }
        final ae80 ae80Var = this.g0;
        if (ae80Var == null || ae80Var.h || ae80Var.f != null) {
            return;
        }
        if (ae80Var.b.a.a.contains(ae80Var.a) || ((View) ae80Var.d.get()) == null) {
            return;
        }
        ae80Var.e = Choreographer.getInstance();
        ?? r1 = new Choreographer.FrameCallback() { // from class: com.yandex.go.places.impl.ui.organizations.recycler.OrganisationsVisibilityTracker$start$cb$1
            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long frameTimeNanos) {
                float f;
                View view = (View) ae80.this.d.get();
                if (view == null) {
                    ae80.this.a();
                    return;
                }
                if (!view.isShown() || view.getWidth() == 0 || view.getHeight() == 0) {
                    ae80.this.g = -1L;
                } else {
                    if (view.getGlobalVisibleRect(ae80.this.i)) {
                        long width = r9.width() * r9.height();
                        long width2 = view.getWidth() * view.getHeight();
                        if (width2 < 1) {
                            width2 = 1;
                        }
                        f = width / width2;
                    } else {
                        f = 0.0f;
                    }
                    ae80 ae80Var2 = ae80.this;
                    ae80Var2.getClass();
                    if (f >= 1.0f) {
                        if (ae80Var2.g < 0) {
                            ae80Var2.g = SystemClock.uptimeMillis();
                        }
                        long uptimeMillis = SystemClock.uptimeMillis();
                        ae80 ae80Var3 = ae80.this;
                        if (uptimeMillis - ae80Var3.g >= 1000) {
                            ae80Var3.h = true;
                            ae80Var3.c.invoke();
                            ae80 ae80Var4 = ae80.this;
                            ae80Var4.b.a.a.add(ae80Var4.a);
                            ae80.this.a();
                            return;
                        }
                    } else {
                        ae80Var2.g = -1L;
                    }
                }
                Choreographer choreographer = ae80.this.e;
                if (choreographer != null) {
                    choreographer.postFrameCallback(this);
                }
            }
        };
        ae80Var.f = r1;
        Choreographer choreographer = ae80Var.e;
        if (choreographer != 0) {
            choreographer.postFrameCallback(r1);
        }
    }

    public final Space d0(int i) {
        Space space = new Space(((to80) ((zo31) this.R)).a.getContext());
        space.setLayoutParams(new ViewGroup.LayoutParams(i, -1));
        return space;
    }

    public final void e0(boolean z) {
        to80 to80Var = (to80) ((zo31) this.R);
        to80Var.i.setVisibility(z ? 0 : 8);
        to80Var.h.setVisibility(z ? 0 : 8);
        to80Var.q.setVisibility(z ? 0 : 8);
        to80Var.n.setVisibility(z ? 0 : 8);
        to80Var.m.setVisibility(z ? 0 : 8);
        to80Var.k.setVisibility(z ? 0 : 8);
        to80Var.f.setVisibility(z ? 0 : 8);
        to80Var.j.setVisibility(z ? 0 : 8);
        to80Var.p.setVisibility(z ? 0 : 8);
        to80Var.c.setVisibility(z ? 0 : 8);
    }

    public final void f0(boolean z) {
        qp80 qp80Var = this.T;
        qp80Var.g.setVisibility(z ? 0 : 8);
        qp80Var.j.setVisibility(z ? 0 : 8);
        qp80Var.h.setVisibility(z ? 0 : 8);
        qp80Var.b.setVisibility(z ? 0 : 8);
        qp80Var.i.setVisibility(z ? 0 : 8);
        qp80Var.c.setVisibility(z ? 0 : 8);
    }

    public final void g0(HorizontalScrollView horizontalScrollView, GoLinearLayout goLinearLayout, List list, tls tlsVar) {
        Iterable j;
        goLinearLayout.removeAllViews();
        List list2 = list;
        horizontalScrollView.setVisibility((list2 == null || list2.isEmpty()) ? 8 : 0);
        if (list != null) {
            List list3 = list;
            ArrayList arrayList = new ArrayList(tcc.n(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(tlsVar.invoke(it.next()));
            }
            int i = mrg0.go_design_m_space;
            View view = this.a;
            int d = c.d(i, view);
            int u = tje.u(4, view.getContext());
            if (arrayList.isEmpty()) {
                j = EmptyList.a;
            } else {
                Iterator it2 = arrayList.iterator();
                ListBuilder a = rcc.a();
                a.add(d0(d));
                a.add(it2.next());
                while (it2.hasNext()) {
                    a.add(d0(u));
                    a.add(it2.next());
                }
                a.add(d0(d));
                j = a.j();
            }
            if (j != null) {
                Iterator it3 = j.iterator();
                while (it3.hasNext()) {
                    goLinearLayout.addView((View) it3.next());
                }
            }
        }
    }
}
