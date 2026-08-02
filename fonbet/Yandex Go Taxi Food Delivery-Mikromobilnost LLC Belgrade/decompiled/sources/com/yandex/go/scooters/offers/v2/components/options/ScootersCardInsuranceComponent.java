package com.yandex.go.scooters.offers.v2.components.options;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import android.widget.FrameLayout;
import com.yandex.go.scooters.api.domain.model.ScootersInsuranceType;
import defpackage.fcl0;
import defpackage.h5n0;
import defpackage.i3y;
import defpackage.j5n0;
import defpackage.jl40;
import defpackage.kok0;
import defpackage.mrg0;
import defpackage.otn0;
import defpackage.qfh0;
import defpackage.s8o;
import defpackage.sls;
import defpackage.tje;
import defpackage.tmm0;
import defpackage.w511;
import defpackage.x7n0;
import defpackage.xng0;
import defpackage.xw31;
import kotlin.Metadata;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u000eR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/yandex/go/scooters/offers/v2/components/options/ScootersCardInsuranceComponent;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Lkotlin/Function0;", "Lzy11;", "onInsuranceSettingsClickListener", "<init>", "(Landroid/content/Context;Lsls;)V", "applyV2", "()V", "Lj5n0;", "insurance", "applyV3", "(Lj5n0;)V", "Landroid/view/View;", "item", "changeItemTo", "(Landroid/view/View;)V", "setInsurance", "Lsls;", "Lru/yandex/taxi/widget/RobotoTextView;", "insuranceV3TrailLabel$delegate", "Li3y;", "getInsuranceV3TrailLabel", "()Lru/yandex/taxi/widget/RobotoTextView;", "insuranceV3TrailLabel", "Lru/yandex/taxi/design/ListItemComponent;", "insuranceV3ItemWithTrailButton$delegate", "getInsuranceV3ItemWithTrailButton", "()Lru/yandex/taxi/design/ListItemComponent;", "insuranceV3ItemWithTrailButton", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersCardInsuranceComponent extends FrameLayout {
    public static final int $stable = 8;

    /* renamed from: insuranceV3ItemWithTrailButton$delegate, reason: from kotlin metadata */
    private final i3y insuranceV3ItemWithTrailButton;

    /* renamed from: insuranceV3TrailLabel$delegate, reason: from kotlin metadata */
    private final i3y insuranceV3TrailLabel;
    private final sls onInsuranceSettingsClickListener;

    public ScootersCardInsuranceComponent(Context context, sls slsVar) {
        super(context);
        this.onInsuranceSettingsClickListener = slsVar;
        this.insuranceV3TrailLabel = kotlin.a.a(new kok0(context, 4));
        this.insuranceV3ItemWithTrailButton = kotlin.a.a(new tmm0(12, context, this));
        setId(qfh0.scooters_component_option_insurance);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        setMinimumHeight(tje.u(56, getContext()));
        setVisibility(8);
    }

    private final void applyV2() {
        setVisibility(8);
    }

    private final void applyV3(j5n0 insurance) {
        float[] fArr;
        otn0 otn0Var = insurance.c;
        if (otn0Var == null) {
            setVisibility(8);
            return;
        }
        if (!(otn0Var instanceof otn0)) {
            w511.b();
            return;
        }
        changeItemTo(getInsuranceV3ItemWithTrailButton());
        RobotoTextView insuranceV3TrailLabel = getInsuranceV3TrailLabel();
        insuranceV3TrailLabel.setText(otn0Var.c);
        int m = s8o.m(otn0Var.d, insuranceV3TrailLabel.getContext());
        float w = tje.w(200, insuranceV3TrailLabel.getContext());
        if (w == 0.0f || Float.isNaN(w) || Float.isInfinite(w)) {
            fArr = null;
        } else {
            fArr = new float[8];
            for (int i = 0; i < 8; i++) {
                fArr[i] = w;
            }
        }
        RoundRectShape roundRectShape = new RoundRectShape(fArr, null, null);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setShape(roundRectShape);
        shapeDrawable.getPaint().setColor(m);
        insuranceV3TrailLabel.setBackground(shapeDrawable);
        ListItemComponent insuranceV3ItemWithTrailButton = getInsuranceV3ItemWithTrailButton();
        insuranceV3ItemWithTrailButton.setTitle(otn0Var.a);
        insuranceV3ItemWithTrailButton.setSubtitle(otn0Var.b);
        insuranceV3ItemWithTrailButton.setDebounceClickListener(new fcl0(5, this.onInsuranceSettingsClickListener));
        setVisibility(0);
    }

    private final void changeItemTo(View item) {
        if (jl40.l(item.getParent(), this)) {
            return;
        }
        removeAllViews();
        addView(item);
    }

    private final ListItemComponent getInsuranceV3ItemWithTrailButton() {
        return (ListItemComponent) this.insuranceV3ItemWithTrailButton.getValue();
    }

    private final RobotoTextView getInsuranceV3TrailLabel() {
        return (RobotoTextView) this.insuranceV3TrailLabel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ListItemComponent insuranceV3ItemWithTrailButton_delegate$lambda$0(Context context, ScootersCardInsuranceComponent scootersCardInsuranceComponent) {
        ListItemComponent listItemComponent = new ListItemComponent(context, null, 0, 6, null);
        listItemComponent.setMinimumHeight(tje.u(56, listItemComponent.getContext()));
        listItemComponent.setTitleTextSizePx(tje.r(mrg0.component_text_size_body, listItemComponent.getContext()));
        listItemComponent.setFitTitleWordsEnabled(true);
        listItemComponent.setSubtitleTextSizePx(tje.r(mrg0.component_text_size_caption, listItemComponent.getContext()));
        listItemComponent.setSubtitleColorAttr(xng0.textMinor);
        listItemComponent.setSubtitleTypeface(0);
        listItemComponent.setDebounceClickListener(new fcl0(6, scootersCardInsuranceComponent.onInsuranceSettingsClickListener));
        listItemComponent.setTrailView(scootersCardInsuranceComponent.getInsuranceV3TrailLabel());
        listItemComponent.setBackgroundResource(x7n0.a);
        listItemComponent.invalidateComponent();
        return listItemComponent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RobotoTextView insuranceV3TrailLabel_delegate$lambda$0(Context context) {
        RobotoTextView robotoTextView = new RobotoTextView(context, null, 0, 6, null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        if (xw31.n(context)) {
            layoutParams.setMargins(tje.r(mrg0.go_design_m_space, robotoTextView.getContext()), 0, 0, 0);
        } else {
            layoutParams.setMargins(0, 0, tje.r(mrg0.go_design_m_space, robotoTextView.getContext()), 0);
        }
        robotoTextView.setLayoutParams(layoutParams);
        robotoTextView.setGravity(17);
        int u = tje.u(12, robotoTextView.getContext());
        int r = tje.r(mrg0.go_design_s_space, robotoTextView.getContext());
        robotoTextView.setPadding(u, r, u, r);
        robotoTextView.setTextColorAttr(xng0.textMain);
        robotoTextView.setTextSize(tje.s(mrg0.component_text_size_caption, robotoTextView.getContext()));
        return robotoTextView;
    }

    public final void setInsurance(j5n0 insurance) {
        if (insurance.a == ScootersInsuranceType.NO_INSURANCE) {
            setVisibility(8);
            return;
        }
        int i = h5n0.a[insurance.b.ordinal()];
        if (i == 1) {
            applyV2();
        } else if (i == 2) {
            applyV3(insurance);
        } else {
            w511.b();
        }
    }
}
