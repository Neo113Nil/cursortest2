package com.yandex.go.delivery.rental_duration_selector.requirement;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import defpackage.ami;
import defpackage.bmi;
import defpackage.cmi;
import defpackage.dmi;
import defpackage.dr7;
import defpackage.gmi;
import defpackage.hxx;
import defpackage.jqr;
import defpackage.k7x0;
import defpackage.kdc;
import defpackage.m7x0;
import defpackage.nac;
import defpackage.pav;
import defpackage.pdc;
import defpackage.pep0;
import defpackage.pex0;
import defpackage.qje;
import defpackage.rj4;
import defpackage.s8o;
import defpackage.tje;
import defpackage.ufu;
import defpackage.vng;
import defpackage.w511;
import defpackage.wth;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.z1h0;
import defpackage.zli;
import defpackage.zvg;
import defpackage.zy11;
import kotlin.Metadata;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.design.BadgeView;
import ru.yandex.taxi.design.ListItemWithBadgeComponent;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B3\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0011J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u001c\u0010\u0011J\u000f\u0010\u001d\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u001d\u0010\u0011J\u0017\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001e\u0010\u0017J\u0017\u0010!\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010'R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010(R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010)R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010*R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010+R\u0018\u0010-\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010.¨\u00060"}, d2 = {"Lcom/yandex/go/delivery/rental_duration_selector/requirement/DeliveryRentRequirementView;", "Lru/yandex/taxi/design/ListItemWithBadgeComponent;", "Lami;", "Landroid/content/Context;", "context", "Lpav;", "imageLoader", "Lk7x0;", "tagUrlFormatter", "Lpdc;", "colorConverter", "Lbmi;", "presenter", "<init>", "(Landroid/content/Context;Lpav;Lk7x0;Lpdc;Lbmi;)V", "Lzy11;", "applyLeadTheme", "()V", "applyTrailTheme", "applyBadgeTheme", "Lzli;", "model", "bindTrail", "(Lzli;)V", "Lrj4;", "badge", "bindBadge", "(Lrj4;)V", "onAttachedToWindow", "onDetachedFromWindow", "bind", "", "isVisible", "setVisibility", "(Z)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "setTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Landroid/content/Context;", "Lpav;", "Lk7x0;", "Lpdc;", "Lbmi;", "Lkdc;", "badgeTextColor", "Lkdc;", "badgeBackgroundColor", "rental_duration_selector"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DeliveryRentRequirementView extends ListItemWithBadgeComponent implements ami {
    private kdc badgeBackgroundColor;
    private kdc badgeTextColor;
    private final pdc colorConverter;
    private final Context context;
    private final pav imageLoader;
    private final bmi presenter;
    private final k7x0 tagUrlFormatter;

    public DeliveryRentRequirementView(Context context, pav pavVar, k7x0 k7x0Var, pdc pdcVar, bmi bmiVar) {
        super(context, null, 0, 6, null);
        this.context = context;
        this.imageLoader = pavVar;
        this.tagUrlFormatter = k7x0Var;
        this.colorConverter = pdcVar;
        this.presenter = bmiVar;
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
    }

    private final void applyBadgeTheme() {
        kdc kdcVar = this.badgeTextColor;
        if (kdcVar != null) {
            getTitleBadge().setTextColor(s8o.m(kdcVar, this.context));
        }
        kdc kdcVar2 = this.badgeBackgroundColor;
        if (kdcVar2 != null) {
            getTitleBadge().setTintColor(s8o.m(kdcVar2, this.context));
        }
    }

    private final void applyLeadTheme() {
        setLeadTint(qje.t(xng0.textMain, getContext()));
    }

    private final void applyTrailTheme() {
        setTrailTint(qje.t(xng0.textMain, getContext()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$2(DeliveryRentRequirementView deliveryRentRequirementView, View view) {
        bmi bmiVar = deliveryRentRequirementView.presenter;
        gmi gmiVar = bmiVar.B;
        pex0 m = ((k) bmiVar.z).m();
        gmiVar.b(m != null ? m.b : null);
        ((pep0) bmiVar.D).f((dr7) bmiVar.A.b.j, zy11.a, hxx.a);
    }

    private final void bindBadge(rj4 badge) {
        kdc i;
        kdc i2;
        BadgeView titleBadge = getTitleBadge();
        titleBadge.setVisibility(0);
        xw31.E(titleBadge, Integer.valueOf((int) ru.yandex.taxi.design.utils.c.i(5.0f, titleBadge)), 0, 0, 0);
        titleBadge.setPadding((int) ru.yandex.taxi.design.utils.c.i(6.0f, titleBadge), (int) ru.yandex.taxi.design.utils.c.i(1.0f, titleBadge), (int) ru.yandex.taxi.design.utils.c.i(6.0f, titleBadge), (int) ru.yandex.taxi.design.utils.c.i(2.0f, titleBadge));
        titleBadge.setBackground(vng.t(z1h0.rent_badge_bg, titleBadge.getContext()));
        titleBadge.setText(badge.a);
        titleBadge.setTextTypeface(3, 0);
        titleBadge.setTextSize(tje.b0(titleBadge.getContext(), 14.0f));
        String str = badge.b;
        if (str != null && (i2 = ((ufu) this.colorConverter).i(str)) != null) {
            titleBadge.setTextColor(s8o.m(i2, titleBadge.getContext()));
        }
        String str2 = badge.c;
        if (str2 == null || (i = ((ufu) this.colorConverter).i(str2)) == null) {
            return;
        }
        titleBadge.setTintColor(s8o.m(i, titleBadge.getContext()));
    }

    private final void bindTrail(zli model) {
        setTrailMode(1);
        setTrailCompanionMode(0);
        setTrailImage(model.g);
        setTrailCompanionText(model.f);
        setTrailCompanionTextColor(model.h);
        int i = dmi.a[model.i.ordinal()];
        if (i == 1) {
            setTrailImageSize(tje.u(56, getContext()));
            setTrailImagePadding(0, 0, 0, 0);
            setTrailContainerClickListener(new zvg(20, this, model));
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            setTrailImageSize(tje.u(32, getContext()));
            setTrailImagePadding(0, 0, tje.u(8, getContext()), 0);
            setTrailContainerClickListener(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindTrail$lambda$0(DeliveryRentRequirementView deliveryRentRequirementView, zli zliVar) {
        bmi bmiVar = deliveryRentRequirementView.presenter;
        int i = zliVar.e;
        gmi gmiVar = bmiVar.B;
        pex0 m = ((k) bmiVar.z).m();
        String str = m != null ? m.b : null;
        i d = ((j) gmiVar.a).d("DeliveryCargoHour.TimeCard.ResetButton.Tapped");
        d.a.put(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, str);
        d.b(i, "selected_time_option");
        d.m();
        bmiVar.y.a.l(null);
    }

    @Override // defpackage.ami
    public void bind(zli model) {
        setTitle(model.b);
        String str = model.c;
        if (str != null) {
            setSubtitle(str);
        }
        String str2 = model.d;
        if (str2 != null) {
            ((nac) this.imageLoader.a(getLeadImageView())).c(((m7x0) this.tagUrlFormatter).a(str2));
        }
        bindTrail(model);
        setClickable(true);
        setOnClickListener(new cmi(0, this));
        rj4 rj4Var = model.a;
        if (rj4Var != null) {
            bindBadge(rj4Var);
        } else {
            getTitleBadge().setVisibility(8);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        bmi bmiVar = this.presenter;
        bmiVar.Bg(this);
        e.H(bmiVar.Jg(), new m0(vng.l(((k) bmiVar.z).j.b(), new wth(28), vng.c), bmiVar.x.a(), new DeliveryRentRequirementPresenter$attachView$2(this, bmiVar, null)));
        e.H(bmiVar.Jg(), new jqr(bmiVar.C.a(), new DeliveryRentRequirementPresenter$attachView$3(this, null), 3));
    }

    @Override // ru.yandex.taxi.design.ListItemComponent, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.presenter.Cg();
        super.onDetachedFromWindow();
    }

    @Override // defpackage.ami
    public void setTheme(ThemeType themeType) {
        applyTheme(themeType);
        applyLeadTheme();
        applyTrailTheme();
        applyBadgeTheme();
    }

    @Override // defpackage.ami
    public void setVisibility(boolean isVisible) {
        setVisibility(isVisible ? 0 : 8);
    }
}
