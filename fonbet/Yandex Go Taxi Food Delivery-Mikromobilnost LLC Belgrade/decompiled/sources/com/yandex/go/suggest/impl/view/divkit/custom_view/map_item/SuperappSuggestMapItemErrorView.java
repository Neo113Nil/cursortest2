package com.yandex.go.suggest.impl.view.divkit.custom_view.map_item;

import android.content.Context;
import android.widget.LinearLayout;
import com.yandex.go.design.view.GoLinearLayout;
import defpackage.avj0;
import defpackage.kyh0;
import defpackage.oug0;
import defpackage.qje;
import defpackage.sls;
import defpackage.tje;
import defpackage.tpt0;
import defpackage.xng0;
import defpackage.zuj0;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\r\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/yandex/go/suggest/impl/view/divkit/custom_view/map_item/SuperappSuggestMapItemErrorView;", "Lcom/yandex/go/design/view/GoLinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "isSmall", "Lzuj0;", "resourceProxy", "Lkotlin/Function0;", "Lzy11;", "clickListener", "setData", "(ZLzuj0;Lsls;)Lcom/yandex/go/suggest/impl/view/divkit/custom_view/map_item/SuperappSuggestMapItemErrorView;", "", "contentPadding", CA20Status.STATUS_USER_I, "buttonPadding", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SuperappSuggestMapItemErrorView extends GoLinearLayout {
    private final int buttonPadding;
    private final int contentPadding;

    public SuperappSuggestMapItemErrorView(Context context) {
        super(context, null, 0, 0, 14, null);
        this.contentPadding = tje.r(oug0.superapp_suggest_map_text_padding_hrz, getContext());
        this.buttonPadding = tje.r(oug0.superapp_suggest_map_button_padding_hrz, getContext());
        setOrientation(1);
        setGravity(17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setData$lambda$2$1(SuperappSuggestMapItemErrorView superappSuggestMapItemErrorView, sls slsVar) {
        superappSuggestMapItemErrorView.setVisibility(8);
        slsVar.invoke();
    }

    public final SuperappSuggestMapItemErrorView setData(boolean isSmall, zuj0 resourceProxy, sls clickListener) {
        RobotoTextView robotoTextView = new RobotoTextView(getContext(), null, 0, 6, null);
        robotoTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        avj0 avj0Var = (avj0) resourceProxy;
        robotoTextView.setText(avj0Var.h(kyh0.superapp_suggest_map_item_wrong));
        robotoTextView.setTextAlignment(4);
        robotoTextView.setTextSize(tje.s(isSmall ? oug0.superapp_suggest_map_title_text_size_small : oug0.superapp_suggest_map_title_text_size, robotoTextView.getContext()));
        robotoTextView.setLineHeight(tje.r(isSmall ? oug0.superapp_suggest_map_title_text_line_height_small : oug0.superapp_suggest_map_title_text_line_height, robotoTextView.getContext()));
        robotoTextView.setTextTypeface(3);
        robotoTextView.setTextColor(qje.t(xng0.textMain, robotoTextView.getContext()));
        int i = this.contentPadding;
        robotoTextView.setPadding(i, 0, i, 0);
        addView(robotoTextView);
        if (!isSmall) {
            RobotoTextView robotoTextView2 = new RobotoTextView(getContext(), null, 0, 6, null);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.topMargin = tje.r(oug0.superapp_suggest_map_subtitle_margin_top, robotoTextView2.getContext());
            robotoTextView2.setLayoutParams(layoutParams);
            robotoTextView2.setText(avj0Var.h(kyh0.superapp_suggest_map_item_try_again));
            robotoTextView2.setTextAlignment(4);
            robotoTextView2.setTextSize(tje.s(oug0.superapp_suggest_map_subtitle_text_size, robotoTextView2.getContext()));
            robotoTextView2.setLineHeight(tje.r(oug0.superapp_suggest_map_subtitle_text_line_height, robotoTextView2.getContext()));
            robotoTextView2.setTextTypeface(0);
            robotoTextView2.setTextColor(qje.t(xng0.textMinor, robotoTextView2.getContext()));
            int i2 = this.contentPadding;
            robotoTextView2.setPadding(i2, 0, i2, 0);
            addView(robotoTextView2);
        }
        ButtonComponent buttonComponent = new ButtonComponent(getContext(), null, 0, 6, null);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = tje.r(oug0.superapp_suggest_map_button_margin_top, buttonComponent.getContext());
        buttonComponent.setLayoutParams(layoutParams2);
        buttonComponent.setText(avj0Var.h(kyh0.superapp_suggest_map_item_reload));
        buttonComponent.setTextSize(tje.s(oug0.superapp_suggest_map_button_text_size, buttonComponent.getContext()));
        buttonComponent.setLineHeight(tje.r(oug0.superapp_suggest_map_button_text_line_height, buttonComponent.getContext()));
        buttonComponent.setTextTypeface(3);
        buttonComponent.setButtonTitleColor(qje.t(xng0.textMain, buttonComponent.getContext()));
        int i3 = this.buttonPadding;
        buttonComponent.setPadding(i3, 0, i3, 0);
        buttonComponent.setButtonSize(0);
        buttonComponent.setButtonBackground(qje.t(xng0.controlMinor, buttonComponent.getContext()));
        buttonComponent.setDebounceClickListener(new tpt0(23, this, clickListener));
        addView(buttonComponent);
        return this;
    }
}
