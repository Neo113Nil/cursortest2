package com.yandex.go.payments.cards.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.payments.paymentlist.ui.PaymentOptionState;
import defpackage.bdc;
import defpackage.cf70;
import defpackage.eja1;
import defpackage.evz;
import defpackage.fbz;
import defpackage.hba0;
import defpackage.ijs;
import defpackage.kdc;
import defpackage.kvz;
import defpackage.kyh0;
import defpackage.ny61;
import defpackage.rxz;
import defpackage.sls;
import defpackage.svz;
import defpackage.t5d0;
import defpackage.tje;
import defpackage.tz5;
import defpackage.up11;
import defpackage.vng;
import defpackage.w511;
import defpackage.xng0;
import defpackage.y2h0;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListItemSwitchComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/yandex/go/payments/cards/ui/LoyaltyProgramView;", "Lcom/yandex/go/design/view/GoLinearLayout;", "Landroid/content/Context;", "context", "Lrxz;", "loyaltyTabletFactory", "Lhba0;", "paymentMethodsItemClickListener", "<init>", "(Landroid/content/Context;Lrxz;Lhba0;)V", "Lkvz;", Constants.KEY_DATA, "", "isLoading", "Lzy11;", "setupProgramSection", "(Lkvz;Z)V", "setupToggleSection", "bindDeletableState", "(Lkvz;)V", "Lru/yandex/taxi/design/ListItemComponent;", "listItemComponent", "setTrailAsTablet", "(Lru/yandex/taxi/design/ListItemComponent;)V", "Lkotlin/Function0;", "clickAction", "setTrailAsLogOutButton", "(Lru/yandex/taxi/design/ListItemComponent;Lsls;)V", "bind", "Lhba0;", "Lcom/yandex/go/payments/cards/ui/LoyaltyProgramTrailView;", "loyaltyTrail", "Lcom/yandex/go/payments/cards/ui/LoyaltyProgramTrailView;", "programSection", "Lru/yandex/taxi/design/ListItemComponent;", "Lru/yandex/taxi/design/ListItemSwitchComponent;", "toggleSection", "Lru/yandex/taxi/design/ListItemSwitchComponent;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class LoyaltyProgramView extends GoLinearLayout {
    public static final int $stable = 8;
    private final LoyaltyProgramTrailView loyaltyTrail;
    private final hba0 paymentMethodsItemClickListener;
    private final ListItemComponent programSection;
    private final ListItemSwitchComponent toggleSection;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LoyaltyProgramView(Context context, rxz rxzVar, hba0 hba0Var) {
        super(context, null, 0, r4, 14, r6);
        DefaultConstructorMarker defaultConstructorMarker = null;
        int i = 0;
        this.paymentMethodsItemClickListener = hba0Var;
        this.loyaltyTrail = new LoyaltyProgramTrailView(context, rxzVar);
        int i2 = 6;
        AttributeSet attributeSet = null;
        ListItemComponent listItemComponent = new ListItemComponent(context, attributeSet, i, i2, defaultConstructorMarker);
        listItemComponent.setTitle(listItemComponent.getContext().getString(kyh0.loyalty_program_headline));
        setTrailAsTablet(listItemComponent);
        this.programSection = listItemComponent;
        ListItemSwitchComponent listItemSwitchComponent = new ListItemSwitchComponent(context, attributeSet, i, i2, defaultConstructorMarker);
        this.toggleSection = listItemSwitchComponent;
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setOrientation(1);
        addView(listItemComponent);
        addView(listItemSwitchComponent);
    }

    private final void bindDeletableState(kvz data) {
        this.toggleSection.setVisibility(8);
        ListItemComponent listItemComponent = this.programSection;
        evz evzVar = data.e;
        Drawable drawable = null;
        listItemComponent.setTitle(evzVar != null ? evzVar.getHeader() : null);
        this.programSection.setSubtitle((CharSequence) null);
        this.programSection.setDebounceClickListener(null);
        this.programSection.setDividers(DividerPosition.BOTTOM, data.c);
        setTrailAsLogOutButton(this.programSection, new svz(data, this));
        evz evzVar2 = data.e;
        if (evzVar2 instanceof tz5) {
            drawable = vng.t(y2h0.ic_payment_birbonus, getContext());
        } else if (evzVar2 instanceof t5d0) {
            drawable = vng.t(y2h0.ic_payment_yandex_plus, getContext());
        } else if (evzVar2 != null) {
            w511.b();
            return;
        }
        this.programSection.setLeadImage(drawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 bindDeletableState$lambda$0(kvz kvzVar, LoyaltyProgramView loyaltyProgramView) {
        evz evzVar = kvzVar.e;
        if (evzVar != null) {
            loyaltyProgramView.paymentMethodsItemClickListener.a7(kvzVar.l, evzVar);
        }
        return zy11.a;
    }

    private final void setTrailAsLogOutButton(ListItemComponent listItemComponent, sls clickAction) {
        if (listItemComponent.getTrailViewAs(ButtonComponent.class) != null) {
            return;
        }
        ButtonComponent buttonComponent = new ButtonComponent(listItemComponent.getContext(), null, 0, 6, null);
        buttonComponent.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        ViewGroup.LayoutParams layoutParams = buttonComponent.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(tje.u(16, buttonComponent.getContext()), 0, tje.u(16, buttonComponent.getContext()), 0);
        buttonComponent.setLayoutParams(marginLayoutParams);
        buttonComponent.setText(buttonComponent.getContext().getString(kyh0.loyalty_program_logout), TextView.BufferType.NORMAL);
        buttonComponent.setButtonSize(0);
        buttonComponent.setButtonBackground(new bdc(xng0.controlMinor));
        buttonComponent.setButtonTitleColor(new bdc(xng0.textOnControlMinor));
        buttonComponent.setTextSize(13.0f);
        buttonComponent.setLineHeight(tje.u(14, buttonComponent.getContext()));
        int[] iArr = up11.a;
        buttonComponent.setTypeface(eja1.w(0, 0));
        listItemComponent.setTrailView(buttonComponent);
        buttonComponent.setDebounceClickListener(new ijs(9, clickAction));
    }

    private final void setTrailAsTablet(ListItemComponent listItemComponent) {
        if (listItemComponent.getTrailViewAs(LoyaltyProgramTrailView.class) != null) {
            return;
        }
        listItemComponent.setTrailView(this.loyaltyTrail);
    }

    private final void setupProgramSection(kvz data, boolean isLoading) {
        if (isLoading) {
            this.programSection.startProgressAnimation();
        } else {
            this.paymentMethodsItemClickListener.Hc(data.e);
            this.programSection.stopProgressAnimation();
        }
        this.programSection.setTitle(getContext().getString(kyh0.loyalty_program_headline));
        this.programSection.setSubtitle(data.d.a);
        this.programSection.setSubtitleTextColor(data.d.b);
        this.programSection.setLeadImage((Drawable) null);
        this.programSection.setDividers(DividerPosition.BOTTOM, DividerType.MARGIN);
        svz svzVar = isLoading ? null : new svz(this, data, 2);
        this.programSection.setDebounceClickListener(svzVar != null ? new fbz(10, svzVar) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setupProgramSection$lambda$0(LoyaltyProgramView loyaltyProgramView, kvz kvzVar) {
        loyaltyProgramView.paymentMethodsItemClickListener.Bc(kvzVar.e);
        return zy11.a;
    }

    private final void setupToggleSection(kvz data, boolean isLoading) {
        this.toggleSection.setVisibility(0);
        ListItemSwitchComponent listItemSwitchComponent = this.toggleSection;
        kdc kdcVar = data.g;
        evz evzVar = data.e;
        listItemSwitchComponent.setTitleTextColor(kdcVar);
        this.toggleSection.setTitle(data.f);
        ListItemSwitchComponent listItemSwitchComponent2 = this.toggleSection;
        cf70 cf70Var = data.h;
        listItemSwitchComponent2.setSubtitle(cf70Var.a);
        this.toggleSection.setSubtitleTextColor(cf70Var.b);
        this.toggleSection.setChecked(data.i);
        boolean z = data.j;
        int i = 1;
        this.toggleSection.setEnabled(z && !isLoading);
        svz svzVar = z ? new svz(this, data, i) : null;
        this.toggleSection.setDebounceClickListener(svzVar != null ? new fbz(9, svzVar) : null);
        this.loyaltyTrail.setVisibility(evzVar == null ? 8 : 0);
        if (evzVar != null) {
            this.loyaltyTrail.updateLoyaltyProgram(evzVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setupToggleSection$lambda$0(LoyaltyProgramView loyaltyProgramView, kvz kvzVar) {
        loyaltyProgramView.paymentMethodsItemClickListener.Q2(kvzVar.k);
        return zy11.a;
    }

    public final void bind(kvz data) {
        PaymentOptionState paymentOptionState = data.b;
        evz evzVar = data.e;
        if (paymentOptionState == PaymentOptionState.DELETABLE_WITH_EDIT_NAME || paymentOptionState == PaymentOptionState.DELETABLE) {
            bindDeletableState(data);
            return;
        }
        boolean z = evzVar == null;
        setupProgramSection(data, z);
        setupToggleSection(data, z);
        setTrailAsTablet(this.programSection);
        this.loyaltyTrail.setVisibility(z ? 8 : 0);
        if (evzVar != null) {
            this.loyaltyTrail.updateLoyaltyProgram(evzVar);
        }
    }
}
