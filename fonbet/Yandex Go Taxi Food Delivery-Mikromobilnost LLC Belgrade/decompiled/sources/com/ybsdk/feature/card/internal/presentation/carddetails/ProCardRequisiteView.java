package com.ybsdk.feature.card.internal.presentation.carddetails;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.widgets.tooltip.TooltipCommon$PreferredGravity;
import com.ybsdk.widgets.tooltip.TooltipCommon$PreferredPosition;
import defpackage.a5f0;
import defpackage.anh0;
import defpackage.b5f0;
import defpackage.bgc;
import defpackage.cma1;
import defpackage.cuz0;
import defpackage.d5b0;
import defpackage.dzh0;
import defpackage.f0z0;
import defpackage.g8e;
import defpackage.h461;
import defpackage.nbv;
import defpackage.ny61;
import defpackage.rje;
import defpackage.sah0;
import defpackage.sls;
import defpackage.ung0;
import defpackage.zxg0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 12\u00020\u0001:\u0002\u001e2B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010%\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R*\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u00063"}, d2 = {"Lcom/ybsdk/feature/card/internal/presentation/carddetails/ProCardRequisiteView;", "Landroidx/cardview/widget/CardView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lnbv;", "getShowHideDetailsImage", "()Lnbv;", "Lcom/ybsdk/core/utils/text/Text;", "getA11yDescription", "()Lcom/ybsdk/core/utils/text/Text;", "", "text", "label", "Landroid/view/View;", "anchorView", "tooltipText", "Lzy11;", "setupClickListener", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/view/View;Lcom/ybsdk/core/utils/text/Text;)V", "", "hiddenValue", "shownText", "getVisibleDetailText", "(Ljava/lang/String;Lcom/ybsdk/core/utils/text/Text;)Lcom/ybsdk/core/utils/text/Text;", "Lb5f0;", ClidProvider.STATE, "render", "(Lb5f0;)V", "Lh461;", "binding", "Lh461;", "lastState", "Lb5f0;", "", "isHiddenValue", "Z", "Lkotlin/Function0;", "onShowDetailsSwitchHandled", "Lsls;", "getOnShowDetailsSwitchHandled", "()Lsls;", "setOnShowDetailsSwitchHandled", "(Lsls;)V", "Companion", "a5f0", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProCardRequisiteView extends CardView {
    private static final a5f0 Companion = new a5f0();

    @Deprecated
    public static final int TAKE_LAST_PAN_DIGITS = 4;
    private final h461 binding;
    private boolean isHiddenValue;
    private b5f0 lastState;
    private sls onShowDetailsSwitchHandled;

    public ProCardRequisiteView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View inflate = LayoutInflater.from(context).inflate(anh0.ybsdk_pro_card_details, (ViewGroup) this, false);
        addView(inflate);
        int i2 = sah0.buttonShowHideRequisites;
        AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i2, inflate);
        if (appCompatImageView != null) {
            i2 = sah0.requisiteCardCvv;
            CardRequisiteFieldView cardRequisiteFieldView = (CardRequisiteFieldView) cma1.O(i2, inflate);
            if (cardRequisiteFieldView != null) {
                i2 = sah0.requisiteCardExpire;
                CardRequisiteFieldView cardRequisiteFieldView2 = (CardRequisiteFieldView) cma1.O(i2, inflate);
                if (cardRequisiteFieldView2 != null) {
                    i2 = sah0.requisiteCardNumber;
                    CardRequisiteFieldView cardRequisiteFieldView3 = (CardRequisiteFieldView) cma1.O(i2, inflate);
                    if (cardRequisiteFieldView3 != null) {
                        i2 = sah0.textCardRequisites;
                        if (((TextView) cma1.O(i2, inflate)) != null) {
                            this.binding = new h461((ConstraintLayout) inflate, appCompatImageView, cardRequisiteFieldView, cardRequisiteFieldView2, cardRequisiteFieldView3);
                            this.isHiddenValue = true;
                            appCompatImageView.setOnClickListener(new d5b0(19, this));
                            return;
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(ProCardRequisiteView proCardRequisiteView, View view) {
        proCardRequisiteView.isHiddenValue = !proCardRequisiteView.isHiddenValue;
        sls slsVar = proCardRequisiteView.onShowDetailsSwitchHandled;
        if (slsVar != null) {
            slsVar.invoke();
        }
    }

    private final Text getA11yDescription() {
        return this.isHiddenValue ? new Text.Resource(dzh0.ybsdk_card_accessibility_details_show_requisites_description) : new Text.Resource(dzh0.ybsdk_card_accessibility_details_hide_requisites_description);
    }

    private final nbv getShowHideDetailsImage() {
        return this.isHiddenValue ? new nbv(zxg0.ybsdk_ic_eye_outline, null) : new nbv(zxg0.ybsdk_ic_eye_crossed_outline, null);
    }

    private final Text getVisibleDetailText(String hiddenValue, Text shownText) {
        return this.isHiddenValue ? g8e.i(Text.Companion, hiddenValue) : shownText;
    }

    private static final void render$lambda$2(ProCardRequisiteView proCardRequisiteView, b5f0 b5f0Var, View view) {
        throw null;
    }

    private static final void render$lambda$3(ProCardRequisiteView proCardRequisiteView, b5f0 b5f0Var, View view) {
        throw null;
    }

    private static final void render$lambda$4(ProCardRequisiteView proCardRequisiteView, b5f0 b5f0Var, View view) {
        throw null;
    }

    private final void setupClickListener(CharSequence text, CharSequence label, View anchorView, Text tooltipText) {
        rje.b(getContext(), text, label);
        Context context = getContext();
        int i = 12;
        new cuz0(rje.a(context, ung0.ybColor_button_primaryNormal), rje.a(context, ung0.ybColor_textIcon_primaryInverted), 0, 0, 10, new bgc(i), new bgc(i), new f0z0(19), null, context, TooltipCommon$PreferredGravity.CENTER, TooltipCommon$PreferredPosition.AUTO, null, null, null, null, d.a(context, tooltipText).toString(), null, true, true).f(anchorView, 0L);
    }

    public final sls getOnShowDetailsSwitchHandled() {
        return this.onShowDetailsSwitchHandled;
    }

    public final void render(b5f0 state) {
        throw null;
    }

    public final void setOnShowDetailsSwitchHandled(sls slsVar) {
        this.onShowDetailsSwitchHandled = slsVar;
    }

    public ProCardRequisiteView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ ProCardRequisiteView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public ProCardRequisiteView(Context context) {
        this(context, null, 0, 6, null);
    }
}
