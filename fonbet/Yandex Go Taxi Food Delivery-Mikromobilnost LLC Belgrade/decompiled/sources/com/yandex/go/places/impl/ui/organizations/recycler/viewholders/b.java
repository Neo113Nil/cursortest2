package com.yandex.go.places.impl.ui.organizations.recycler.viewholders;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.widget.LinearLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.yandex.go.design.view.GoView;
import com.yandex.go.places.common.ui.indicator.DotsIndicatorComponent;
import com.yandex.go.places.impl.ui.common.compression_resistant.CompressionResistantListComponent;
import com.yandex.go.places.impl.ui.organizations.recycler.viewholders.b;
import defpackage.a65;
import defpackage.bm50;
import defpackage.dy4;
import defpackage.i3y;
import defpackage.kw00;
import defpackage.m2y;
import defpackage.nj4;
import defpackage.ny61;
import defpackage.pav;
import defpackage.pj80;
import defpackage.qw8;
import defpackage.scc;
import defpackage.sjh;
import defpackage.sls;
import defpackage.so80;
import defpackage.tje;
import defpackage.tt2;
import defpackage.ub60;
import defpackage.uyj;
import defpackage.vbb;
import defpackage.wh91;
import defpackage.zo31;
import defpackage.zy11;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.design.utils.TopRoundRectBackgroundHelper$makeViewRounded$1;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.PlaceholderView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class b extends dy4 {
    public static final /* synthetic */ int f0 = 0;
    public final m2y T;
    public final pav U;
    public final tt2 V;
    public final ru.yandex.taxi.design.utils.a W;
    public final ub60 Z;
    public final i3y a0;
    public final i3y b0;
    public final i3y c0;
    public final i3y d0;
    public final i3y e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(so80 so80Var, m2y m2yVar, pav pavVar, tt2 tt2Var, int i, int i2, ru.yandex.taxi.design.utils.a aVar, ub60 ub60Var) {
        super(so80Var, 0);
        final int i3 = 0;
        this.T = m2yVar;
        this.U = pavVar;
        this.V = tt2Var;
        this.W = aVar;
        this.Z = ub60Var;
        sls slsVar = new sls(this) { // from class: jk80
            public final /* synthetic */ b b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int h;
                int i4 = i3;
                b bVar = this.b;
                switch (i4) {
                    case 0:
                        h = c.h(1, bVar.a);
                        break;
                    case 1:
                        h = c.d(dug0.discovery_organizations_organization_preview_image_slider_corner_round_size, bVar.a);
                        break;
                    case 2:
                        h = c.d(dug0.discovery_organization_preview_badge_background_round_size, bVar.a);
                        break;
                    case 3:
                        h = c.d(dug0.discovery_organizations_badge_shadow_dy, bVar.a);
                        break;
                    case 4:
                        h = c.d(dug0.discovery_organizations_badge_shadow_blur, bVar.a);
                        break;
                    default:
                        ShapeDrawable shapeDrawable = new ShapeDrawable();
                        float[] fArr = new float[8];
                        for (int i5 = 0; i5 < 8; i5++) {
                            fArr[i5] = ((Number) bVar.b0.getValue()).intValue();
                        }
                        shapeDrawable.setShape(new RoundRectShape(fArr, null, null));
                        return shapeDrawable;
                }
                return Integer.valueOf(h);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.a0 = kotlin.a.b(lazyThreadSafetyMode, slsVar);
        final int i4 = 1;
        i3y b = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: jk80
            public final /* synthetic */ b b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int h;
                int i42 = i4;
                b bVar = this.b;
                switch (i42) {
                    case 0:
                        h = c.h(1, bVar.a);
                        break;
                    case 1:
                        h = c.d(dug0.discovery_organizations_organization_preview_image_slider_corner_round_size, bVar.a);
                        break;
                    case 2:
                        h = c.d(dug0.discovery_organization_preview_badge_background_round_size, bVar.a);
                        break;
                    case 3:
                        h = c.d(dug0.discovery_organizations_badge_shadow_dy, bVar.a);
                        break;
                    case 4:
                        h = c.d(dug0.discovery_organizations_badge_shadow_blur, bVar.a);
                        break;
                    default:
                        ShapeDrawable shapeDrawable = new ShapeDrawable();
                        float[] fArr = new float[8];
                        for (int i5 = 0; i5 < 8; i5++) {
                            fArr[i5] = ((Number) bVar.b0.getValue()).intValue();
                        }
                        shapeDrawable.setShape(new RoundRectShape(fArr, null, null));
                        return shapeDrawable;
                }
                return Integer.valueOf(h);
            }
        });
        final int i5 = 2;
        this.b0 = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: jk80
            public final /* synthetic */ b b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int h;
                int i42 = i5;
                b bVar = this.b;
                switch (i42) {
                    case 0:
                        h = c.h(1, bVar.a);
                        break;
                    case 1:
                        h = c.d(dug0.discovery_organizations_organization_preview_image_slider_corner_round_size, bVar.a);
                        break;
                    case 2:
                        h = c.d(dug0.discovery_organization_preview_badge_background_round_size, bVar.a);
                        break;
                    case 3:
                        h = c.d(dug0.discovery_organizations_badge_shadow_dy, bVar.a);
                        break;
                    case 4:
                        h = c.d(dug0.discovery_organizations_badge_shadow_blur, bVar.a);
                        break;
                    default:
                        ShapeDrawable shapeDrawable = new ShapeDrawable();
                        float[] fArr = new float[8];
                        for (int i52 = 0; i52 < 8; i52++) {
                            fArr[i52] = ((Number) bVar.b0.getValue()).intValue();
                        }
                        shapeDrawable.setShape(new RoundRectShape(fArr, null, null));
                        return shapeDrawable;
                }
                return Integer.valueOf(h);
            }
        });
        final int i6 = 3;
        this.c0 = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: jk80
            public final /* synthetic */ b b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int h;
                int i42 = i6;
                b bVar = this.b;
                switch (i42) {
                    case 0:
                        h = c.h(1, bVar.a);
                        break;
                    case 1:
                        h = c.d(dug0.discovery_organizations_organization_preview_image_slider_corner_round_size, bVar.a);
                        break;
                    case 2:
                        h = c.d(dug0.discovery_organization_preview_badge_background_round_size, bVar.a);
                        break;
                    case 3:
                        h = c.d(dug0.discovery_organizations_badge_shadow_dy, bVar.a);
                        break;
                    case 4:
                        h = c.d(dug0.discovery_organizations_badge_shadow_blur, bVar.a);
                        break;
                    default:
                        ShapeDrawable shapeDrawable = new ShapeDrawable();
                        float[] fArr = new float[8];
                        for (int i52 = 0; i52 < 8; i52++) {
                            fArr[i52] = ((Number) bVar.b0.getValue()).intValue();
                        }
                        shapeDrawable.setShape(new RoundRectShape(fArr, null, null));
                        return shapeDrawable;
                }
                return Integer.valueOf(h);
            }
        });
        final int i7 = 4;
        this.d0 = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: jk80
            public final /* synthetic */ b b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int h;
                int i42 = i7;
                b bVar = this.b;
                switch (i42) {
                    case 0:
                        h = c.h(1, bVar.a);
                        break;
                    case 1:
                        h = c.d(dug0.discovery_organizations_organization_preview_image_slider_corner_round_size, bVar.a);
                        break;
                    case 2:
                        h = c.d(dug0.discovery_organization_preview_badge_background_round_size, bVar.a);
                        break;
                    case 3:
                        h = c.d(dug0.discovery_organizations_badge_shadow_dy, bVar.a);
                        break;
                    case 4:
                        h = c.d(dug0.discovery_organizations_badge_shadow_blur, bVar.a);
                        break;
                    default:
                        ShapeDrawable shapeDrawable = new ShapeDrawable();
                        float[] fArr = new float[8];
                        for (int i52 = 0; i52 < 8; i52++) {
                            fArr[i52] = ((Number) bVar.b0.getValue()).intValue();
                        }
                        shapeDrawable.setShape(new RoundRectShape(fArr, null, null));
                        return shapeDrawable;
                }
                return Integer.valueOf(h);
            }
        });
        final int i8 = 5;
        this.e0 = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: jk80
            public final /* synthetic */ b b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int h;
                int i42 = i8;
                b bVar = this.b;
                switch (i42) {
                    case 0:
                        h = c.h(1, bVar.a);
                        break;
                    case 1:
                        h = c.d(dug0.discovery_organizations_organization_preview_image_slider_corner_round_size, bVar.a);
                        break;
                    case 2:
                        h = c.d(dug0.discovery_organization_preview_badge_background_round_size, bVar.a);
                        break;
                    case 3:
                        h = c.d(dug0.discovery_organizations_badge_shadow_dy, bVar.a);
                        break;
                    case 4:
                        h = c.d(dug0.discovery_organizations_badge_shadow_blur, bVar.a);
                        break;
                    default:
                        ShapeDrawable shapeDrawable = new ShapeDrawable();
                        float[] fArr = new float[8];
                        for (int i52 = 0; i52 < 8; i52++) {
                            fArr[i52] = ((Number) bVar.b0.getValue()).intValue();
                        }
                        shapeDrawable.setShape(new RoundRectShape(fArr, null, null));
                        return shapeDrawable;
                }
                return Integer.valueOf(h);
            }
        });
        ViewPager2 viewPager2 = so80Var.f;
        wh91.a(viewPager2);
        c.D(i, i2, viewPager2);
        viewPager2.setClipToOutline(true);
        viewPager2.setOutlineProvider(new TopRoundRectBackgroundHelper$makeViewRounded$1(((Number) b.getValue()).intValue()));
        viewPager2.setClipToOutline(true);
        c.D(i, i2, (PlaceholderView) m2yVar.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c0(b bVar, CompressionResistantListComponent compressionResistantListComponent, List list, ContinuationImpl continuationImpl) {
        OrganizationPreviewViewHolder$bindResistantAttributedText$1 organizationPreviewViewHolder$bindResistantAttributedText$1;
        int i;
        bVar.getClass();
        if (continuationImpl instanceof OrganizationPreviewViewHolder$bindResistantAttributedText$1) {
            organizationPreviewViewHolder$bindResistantAttributedText$1 = (OrganizationPreviewViewHolder$bindResistantAttributedText$1) continuationImpl;
            int i2 = organizationPreviewViewHolder$bindResistantAttributedText$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                organizationPreviewViewHolder$bindResistantAttributedText$1.label = i2 - Integer.MIN_VALUE;
                Object obj = organizationPreviewViewHolder$bindResistantAttributedText$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = organizationPreviewViewHolder$bindResistantAttributedText$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (list == null) {
                        return zy11Var;
                    }
                    tt2 tt2Var = bVar.V;
                    organizationPreviewViewHolder$bindResistantAttributedText$1.L$0 = compressionResistantListComponent;
                    organizationPreviewViewHolder$bindResistantAttributedText$1.L$1 = null;
                    organizationPreviewViewHolder$bindResistantAttributedText$1.label = 1;
                    if (compressionResistantListComponent.setTexts$impl(list, tt2Var, organizationPreviewViewHolder$bindResistantAttributedText$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    compressionResistantListComponent = (CompressionResistantListComponent) organizationPreviewViewHolder$bindResistantAttributedText$1.L$0;
                    kotlin.b.b(obj);
                }
                compressionResistantListComponent.setVisibility(0);
                return zy11Var;
            }
        }
        organizationPreviewViewHolder$bindResistantAttributedText$1 = new OrganizationPreviewViewHolder$bindResistantAttributedText$1(bVar, continuationImpl);
        Object obj2 = organizationPreviewViewHolder$bindResistantAttributedText$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = organizationPreviewViewHolder$bindResistantAttributedText$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        compressionResistantListComponent.setVisibility(0);
        return zy11Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d0(b bVar, so80 so80Var, ContinuationImpl continuationImpl) {
        OrganizationPreviewViewHolder$setupBadgeShadow$1 organizationPreviewViewHolder$setupBadgeShadow$1;
        int i;
        bVar.getClass();
        if (continuationImpl instanceof OrganizationPreviewViewHolder$setupBadgeShadow$1) {
            organizationPreviewViewHolder$setupBadgeShadow$1 = (OrganizationPreviewViewHolder$setupBadgeShadow$1) continuationImpl;
            int i2 = organizationPreviewViewHolder$setupBadgeShadow$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                organizationPreviewViewHolder$setupBadgeShadow$1.label = i2 - Integer.MIN_VALUE;
                Object obj = organizationPreviewViewHolder$setupBadgeShadow$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = organizationPreviewViewHolder$setupBadgeShadow$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    bVar.V.getClass();
                    sjh sjhVar = uyj.a;
                    OrganizationPreviewViewHolder$setupBadgeShadow$shadowedBg$1 organizationPreviewViewHolder$setupBadgeShadow$shadowedBg$1 = new OrganizationPreviewViewHolder$setupBadgeShadow$shadowedBg$1(bVar, so80Var, null);
                    organizationPreviewViewHolder$setupBadgeShadow$1.L$0 = so80Var;
                    organizationPreviewViewHolder$setupBadgeShadow$1.label = 1;
                    obj = tje.k0(sjhVar, organizationPreviewViewHolder$setupBadgeShadow$shadowedBg$1, organizationPreviewViewHolder$setupBadgeShadow$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    so80Var = (so80) organizationPreviewViewHolder$setupBadgeShadow$1.L$0;
                    kotlin.b.b(obj);
                }
                LayerDrawable layerDrawable = (LayerDrawable) obj;
                GoView goView = so80Var.c;
                goView.setBackground(layerDrawable);
                c.D(layerDrawable.getIntrinsicWidth(), layerDrawable.getIntrinsicHeight(), goView);
                goView.setVisibility(0);
                return zy11.a;
            }
        }
        organizationPreviewViewHolder$setupBadgeShadow$1 = new OrganizationPreviewViewHolder$setupBadgeShadow$1(bVar, continuationImpl);
        Object obj2 = organizationPreviewViewHolder$setupBadgeShadow$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = organizationPreviewViewHolder$setupBadgeShadow$1.label;
        if (i != 0) {
        }
        LayerDrawable layerDrawable2 = (LayerDrawable) obj2;
        GoView goView2 = so80Var.c;
        goView2.setBackground(layerDrawable2);
        c.D(layerDrawable2.getIntrinsicWidth(), layerDrawable2.getIntrinsicHeight(), goView2);
        goView2.setVisibility(0);
        return zy11.a;
    }

    @Override // defpackage.wys
    public final void Y() {
        super.Y();
        so80 so80Var = (so80) ((zo31) this.R);
        so80Var.f.setAdapter(null);
        so80Var.i.setText((CharSequence) null);
        CompressionResistantListComponent compressionResistantListComponent = so80Var.h;
        compressionResistantListComponent.removeAllViews();
        compressionResistantListComponent.setVisibility(8);
        CompressionResistantListComponent compressionResistantListComponent2 = so80Var.e;
        compressionResistantListComponent2.removeAllViews();
        compressionResistantListComponent2.setVisibility(8);
    }

    @Override // defpackage.dy4, defpackage.wys
    public final void c(Object obj) {
        a65 a65Var = (a65) obj;
        zo31 zo31Var = (zo31) this.R;
        boolean z = a65Var.h;
        List list = a65Var.c;
        if (z) {
            e0(false);
            f0(true);
            return;
        }
        f0(false);
        e0(true);
        b0(new OrganizationPreviewViewHolder$bind$1(this, a65Var, null));
        qw8 qw8Var = new qw8(this.U, this.Z, null, null, null, 60);
        so80 so80Var = (so80) zo31Var;
        ViewPager2 viewPager2 = so80Var.f;
        RobotoTextView robotoTextView = so80Var.b;
        LinearLayout linearLayout = so80Var.a;
        DotsIndicatorComponent dotsIndicatorComponent = so80Var.d;
        viewPager2.setAdapter(qw8Var);
        ViewPager2 viewPager22 = so80Var.f;
        viewPager22.registerOnPageChangeCallback(new pj80(scc.f(list), dotsIndicatorComponent));
        viewPager22.setPageTransformer(new kw00(((Number) this.a0.getValue()).intValue(), 0));
        qw8Var.submitList(list, null);
        dotsIndicatorComponent.setVisibility(list.size() > 1 ? 0 : 8);
        so80Var.i.setText(a65Var.b);
        c.z(new bm50(17, a65Var, this), linearLayout);
        nj4 nj4Var = a65Var.f;
        if (nj4Var == null) {
            robotoTextView.setVisibility(8);
            so80Var.c.setVisibility(8);
        } else {
            robotoTextView.setText(nj4Var.a);
            robotoTextView.setBackground((Drawable) new vbb(c.b(linearLayout, nj4Var.b), ((Number) this.b0.getValue()).intValue()).b);
            robotoTextView.setVisibility(0);
            b0(new OrganizationPreviewViewHolder$bindBadge$1$1(this, so80Var, null));
        }
    }

    public final void e0(boolean z) {
        so80 so80Var = (so80) ((zo31) this.R);
        so80Var.g.setVisibility(z ? 0 : 8);
        so80Var.i.setVisibility(z ? 0 : 8);
        so80Var.h.setVisibility(z ? 0 : 8);
        so80Var.e.setVisibility(z ? 0 : 8);
    }

    public final void f0(boolean z) {
        m2y m2yVar = this.T;
        ((PlaceholderView) m2yVar.d).setVisibility(z ? 0 : 8);
        ((PlaceholderView) m2yVar.e).setVisibility(z ? 0 : 8);
        ((PlaceholderView) m2yVar.b).setVisibility(z ? 0 : 8);
    }
}
