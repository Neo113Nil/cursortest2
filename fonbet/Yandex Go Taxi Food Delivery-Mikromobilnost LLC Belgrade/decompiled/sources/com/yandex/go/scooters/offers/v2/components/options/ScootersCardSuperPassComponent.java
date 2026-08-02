package com.yandex.go.scooters.offers.v2.components.options;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.scooters.offers.v2.components.options.ScootersCardSuperPassComponent;
import com.yandex.go.scooters.offers.v2.domain.model.ScootersOfferSuperPassComponentLocation;
import defpackage.a3o;
import defpackage.c6n0;
import defpackage.d3o;
import defpackage.dzg0;
import defpackage.gdc;
import defpackage.i3y;
import defpackage.mqg0;
import defpackage.mrg0;
import defpackage.q0h0;
import defpackage.qco0;
import defpackage.qfh0;
import defpackage.rco0;
import defpackage.s8o;
import defpackage.sco0;
import defpackage.tje;
import defpackage.tls;
import defpackage.tmm0;
import defpackage.vng;
import defpackage.w511;
import defpackage.x1p0;
import defpackage.x7n0;
import defpackage.xw31;
import java.util.ArrayList;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.yandex.taxi.design.BadgeView;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.scooters.domain.model.SuperPassesDisplayVersion;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0011R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/yandex/go/scooters/offers/v2/components/options/ScootersCardSuperPassComponent;", "Lru/yandex/taxi/design/ListItemComponent;", "Landroid/content/Context;", "context", "Lkotlin/Function1;", "Lrco0;", "Lzy11;", "onPurchasePassClickListener", "onActivePassesClickListener", "Lcom/yandex/go/scooters/offers/v2/domain/model/ScootersOfferSuperPassComponentLocation;", "itemLocation", "<init>", "(Landroid/content/Context;Ltls;Ltls;Lcom/yandex/go/scooters/offers/v2/domain/model/ScootersOfferSuperPassComponentLocation;)V", "Lsco0;", "scootersPasses", "setSuperPasses", "(Lsco0;)V", "Ltls;", "Lcom/yandex/go/scooters/offers/v2/domain/model/ScootersOfferSuperPassComponentLocation;", "Lcom/yandex/go/design/view/GoImageView;", "navigationIconImageView", "Lcom/yandex/go/design/view/GoImageView;", "Lcom/yandex/go/design/view/GoLinearLayout;", "trailLinearLayout", "Lcom/yandex/go/design/view/GoLinearLayout;", "Li3y;", "Lru/yandex/taxi/design/BadgeView;", "badgeViewLazy", "Li3y;", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersCardSuperPassComponent extends ListItemComponent {
    public static final int $stable = 8;
    private final i3y badgeViewLazy;
    private final ScootersOfferSuperPassComponentLocation itemLocation;
    private final GoImageView navigationIconImageView;
    private final tls onActivePassesClickListener;
    private final tls onPurchasePassClickListener;
    private final GoLinearLayout trailLinearLayout;

    public ScootersCardSuperPassComponent(Context context, tls tlsVar, tls tlsVar2, ScootersOfferSuperPassComponentLocation scootersOfferSuperPassComponentLocation) {
        super(context, null, 0, 6, null);
        this.onPurchasePassClickListener = tlsVar;
        this.onActivePassesClickListener = tlsVar2;
        this.itemLocation = scootersOfferSuperPassComponentLocation;
        int r = tje.r(mrg0.go_design_l_space, getContext());
        GoImageView goImageView = new GoImageView(context, null, 0, 6, null);
        goImageView.setLayoutParams(new ViewGroup.MarginLayoutParams(r, r));
        goImageView.setImageResource(ListItemComponent.DEFAULT_NAVIGATION_ICON);
        goImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.navigationIconImageView = goImageView;
        GoLinearLayout goLinearLayout = new GoLinearLayout(context, null, 0, 0, 14, null);
        goLinearLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        goLinearLayout.setOrientation(0);
        goLinearLayout.setGravity(16);
        goLinearLayout.addView(goImageView);
        this.trailLinearLayout = goLinearLayout;
        this.badgeViewLazy = kotlin.a.b(LazyThreadSafetyMode.NONE, new tmm0(13, context, this));
        setId(qfh0.scooters_component_option_super_pass);
        setTrailView(goLinearLayout);
        setVisibility(8);
        setBackgroundResource(x7n0.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BadgeView badgeViewLazy$lambda$0(Context context, ScootersCardSuperPassComponent scootersCardSuperPassComponent) {
        BadgeView badgeView = new BadgeView(context, null, 0, 6, null);
        badgeView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        xw31.I(badgeView, null, Integer.valueOf(tje.u(1, badgeView.getContext())), null, null);
        xw31.I(badgeView, null, null, null, Integer.valueOf(tje.u(2, badgeView.getContext())));
        xw31.F(badgeView, Integer.valueOf(tje.r(mrg0.go_design_s_space, badgeView.getContext())), null, null, null);
        int r = tje.r(mrg0.go_design_s_space, badgeView.getContext());
        xw31.E(badgeView, null, Integer.valueOf(r), null, Integer.valueOf(r));
        badgeView.setBackground(vng.t(q0h0.scooters_badge_bg, badgeView.getContext()));
        badgeView.setTextColor(badgeView.getContext().getColor(mqg0.white));
        badgeView.setTextSize(tje.b0(badgeView.getContext(), 14.0f));
        badgeView.setElevation(tje.x(badgeView.getContext(), 3.0f));
        scootersCardSuperPassComponent.trailLinearLayout.addView(badgeView, 0);
        return badgeView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setSuperPasses$lambda$0(ScootersCardSuperPassComponent scootersCardSuperPassComponent, rco0 rco0Var) {
        scootersCardSuperPassComponent.onPurchasePassClickListener.invoke(rco0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setSuperPasses$lambda$1(ScootersCardSuperPassComponent scootersCardSuperPassComponent, rco0 rco0Var) {
        scootersCardSuperPassComponent.onActivePassesClickListener.invoke(rco0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
    
        if (r3 == ru.yandex.taxi.scooters.domain.model.SuperPassesDisplayVersion.V2) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0040, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0042, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x004a, code lost:
    
        if (r3 == ru.yandex.taxi.scooters.domain.model.SuperPassesDisplayVersion.V1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setSuperPasses(sco0 scootersPasses) {
        final rco0 rco0Var;
        boolean z;
        gdc gdcVar;
        a3o a3oVar;
        qco0 qco0Var = scootersPasses instanceof qco0 ? (qco0) scootersPasses : null;
        if (qco0Var == null || (rco0Var = qco0Var.i) == null) {
            rco0Var = scootersPasses instanceof rco0 ? (rco0) scootersPasses : null;
        }
        if (rco0Var == null) {
            setVisibility(8);
            return;
        }
        d3o d3oVar = rco0Var.b;
        if (d3oVar == null) {
            setVisibility(8);
            return;
        }
        SuperPassesDisplayVersion superPassesDisplayVersion = d3oVar.f;
        int i = c6n0.a[this.itemLocation.ordinal()];
        final int i2 = 1;
        final int i3 = 0;
        if (i != 1) {
            if (i != 2) {
                w511.b();
                return;
            }
        }
        setVisibility(z ? 0 : 8);
        if (!z) {
            return;
        }
        int i4 = ListItemComponent.DEFAULT_NAVIGATION_ICON;
        int u = tje.u(8, getContext());
        boolean z2 = rco0Var.g != null;
        x1p0 x1p0Var = rco0Var.h;
        ArrayList arrayList = x1p0Var != null ? (ArrayList) x1p0Var.d.c : null;
        if (arrayList != null && !arrayList.isEmpty()) {
            setDebounceClickListener(new Runnable(this) { // from class: b6n0
                public final /* synthetic */ ScootersCardSuperPassComponent b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i5 = i3;
                    rco0 rco0Var2 = rco0Var;
                    ScootersCardSuperPassComponent scootersCardSuperPassComponent = this.b;
                    switch (i5) {
                        case 0:
                            ScootersCardSuperPassComponent.setSuperPasses$lambda$0(scootersCardSuperPassComponent, rco0Var2);
                            break;
                        default:
                            ScootersCardSuperPassComponent.setSuperPasses$lambda$1(scootersCardSuperPassComponent, rco0Var2);
                            break;
                    }
                }
            });
        } else {
            if (!z2) {
                i4 = dzg0.ic_done_mark;
                gdcVar = new gdc(mqg0.component_green_normal);
                u = tje.u(16, getContext());
                setDebounceClickListener(null);
                this.navigationIconImageView.setImageResource(i4);
                this.navigationIconImageView.setImageTintList(gdcVar == null ? ColorStateList.valueOf(s8o.m(gdcVar, getContext())) : null);
                xw31.J(this.trailLinearLayout, null, null, Integer.valueOf(u), null);
                setTitle(d3oVar.a);
                setSubtitle(d3oVar.b);
                setLeadImage(d3oVar.c);
                a3oVar = d3oVar.e;
                i3y i3yVar = this.badgeViewLazy;
                if (a3oVar != null) {
                    if (i3yVar.isInitialized()) {
                        ((View) this.badgeViewLazy.getValue()).setVisibility(8);
                        return;
                    }
                    return;
                } else {
                    BadgeView badgeView = (BadgeView) i3yVar.getValue();
                    int m = s8o.m(a3oVar.b, badgeView.getContext());
                    badgeView.setText(a3oVar.a);
                    badgeView.setTintColor(m);
                    badgeView.setOutlineSpotShadowColor(m);
                    badgeView.setVisibility(0);
                    return;
                }
            }
            setDebounceClickListener(new Runnable(this) { // from class: b6n0
                public final /* synthetic */ ScootersCardSuperPassComponent b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i5 = i2;
                    rco0 rco0Var2 = rco0Var;
                    ScootersCardSuperPassComponent scootersCardSuperPassComponent = this.b;
                    switch (i5) {
                        case 0:
                            ScootersCardSuperPassComponent.setSuperPasses$lambda$0(scootersCardSuperPassComponent, rco0Var2);
                            break;
                        default:
                            ScootersCardSuperPassComponent.setSuperPasses$lambda$1(scootersCardSuperPassComponent, rco0Var2);
                            break;
                    }
                }
            });
        }
        gdcVar = null;
        this.navigationIconImageView.setImageResource(i4);
        this.navigationIconImageView.setImageTintList(gdcVar == null ? ColorStateList.valueOf(s8o.m(gdcVar, getContext())) : null);
        xw31.J(this.trailLinearLayout, null, null, Integer.valueOf(u), null);
        setTitle(d3oVar.a);
        setSubtitle(d3oVar.b);
        setLeadImage(d3oVar.c);
        a3oVar = d3oVar.e;
        i3y i3yVar2 = this.badgeViewLazy;
        if (a3oVar != null) {
        }
    }
}
