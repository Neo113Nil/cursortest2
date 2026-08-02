package com.yandex.go.flex.main_screen.data.widgets.plaque;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import defpackage.b700;
import defpackage.bdc;
import defpackage.d6z;
import defpackage.e37;
import defpackage.f4w0;
import defpackage.ffx;
import defpackage.g4w0;
import defpackage.h2h0;
import defpackage.h4w0;
import defpackage.hzx;
import defpackage.ip11;
import defpackage.ljc0;
import defpackage.lkn;
import defpackage.lz40;
import defpackage.m810;
import defpackage.mqg0;
import defpackage.mrg0;
import defpackage.ny61;
import defpackage.o00;
import defpackage.otc0;
import defpackage.owz0;
import defpackage.ptc0;
import defpackage.pwz0;
import defpackage.tje;
import defpackage.ttc0;
import defpackage.ud30;
import defpackage.utc0;
import defpackage.vng;
import defpackage.w27;
import defpackage.w511;
import defpackage.wju;
import defpackage.x27;
import defpackage.xng0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.channels.BufferOverflow;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000¯\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004*\u0001R\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0019\u0010\u000bJ\u001f\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001a\u0010\u0018J\u000f\u0010\u001b\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001b\u0010\u000bJ\u000f\u0010\u001c\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001c\u0010\u000bJ\u0017\u0010\u001d\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001d\u0010\u000fJ'\u0010\"\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\t2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u0019\u0010+\u001a\u00020*2\b\b\u0001\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020-2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0010H\u0016¢\u0006\u0004\b0\u0010\u0012J\u0017\u00103\u001a\u00020\t2\b\u00102\u001a\u0004\u0018\u000101¢\u0006\u0004\b3\u00104R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00105R \u00108\u001a\b\u0012\u0004\u0012\u000207068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0018\u0010=\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010B\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010H\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010J\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010L\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010KR\u0014\u0010N\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010P\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010S\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010T¨\u0006U"}, d2 = {"Lcom/yandex/go/flex/main_screen/data/widgets/plaque/PlaqueWidgetItemView;", "Landroid/widget/LinearLayout;", "Lptc0;", "Landroid/content/Context;", "context", "Lip11;", "typefaceDelegate", "<init>", "(Landroid/content/Context;Lip11;)V", "Lzy11;", "applyHiddenState", "()V", "Lg4w0;", "uiState", "applyVisibleState", "(Lg4w0;)V", "Lh4w0;", "updatePaddings", "(Lh4w0;)V", "Lwju;", "hintState", "Lpwz0;", CRLReasonCodeExtension.REASON, "showHeader", "(Lwju;Lpwz0;)V", "hideHeader", "initHint", "hideHint", "hideButtons", "showButtons", "Lru/yandex/taxi/design/ButtonComponent;", "button", "Le37;", ClidProvider.STATE, "initButton", "(Lru/yandex/taxi/design/ButtonComponent;Le37;Lpwz0;)V", "Lo00;", "actionsState", "resolveActionsAlignment", "(Lo00;)V", "", "color", "Landroid/graphics/drawable/Drawable;", "createHintLeadViewBackground", "(I)Landroid/graphics/drawable/Drawable;", "", "shouldUseBigHeaderWithSingleButtonStyle", "(Lg4w0;)Z", "render", "Lhzx;", "layout", "bind", "(Lhzx;)V", "Lip11;", "Llz40;", "Lotc0;", "events", "Llz40;", "getEvents", "()Llz40;", "Llkn;", "layoutPaddings", "Llkn;", "Lru/yandex/taxi/widget/RobotoTextView;", "headerView", "Lru/yandex/taxi/widget/RobotoTextView;", "hintLeadViewDefaultBackground", "Landroid/graphics/drawable/Drawable;", "Landroid/widget/ImageView;", "hintLeadView", "Landroid/widget/ImageView;", "Lru/yandex/taxi/design/ListItemComponent;", "hintView", "Lru/yandex/taxi/design/ListItemComponent;", "minorButton", "Lru/yandex/taxi/design/ButtonComponent;", "majorButton", "Landroid/widget/Space;", "buttonsSpacing", "Landroid/widget/Space;", "buttonsBlock", "Landroid/widget/LinearLayout;", "utc0", "hintAccessibilityDelegate", "Lutc0;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PlaqueWidgetItemView extends LinearLayout implements ptc0 {
    private final LinearLayout buttonsBlock;
    private final Space buttonsSpacing;
    private final lz40 events;
    private final RobotoTextView headerView;
    private final utc0 hintAccessibilityDelegate;
    private final ImageView hintLeadView;
    private final Drawable hintLeadViewDefaultBackground;
    private final ListItemComponent hintView;
    private lkn layoutPaddings;
    private final ButtonComponent majorButton;
    private final ButtonComponent minorButton;
    private final ip11 typefaceDelegate;

    public PlaqueWidgetItemView(Context context, ip11 ip11Var) {
        super(context);
        this.typefaceDelegate = ip11Var;
        this.events = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
        DefaultConstructorMarker defaultConstructorMarker = null;
        RobotoTextView robotoTextView = new RobotoTextView(context, null, 0, 6, null);
        float dimension = robotoTextView.getResources().getDimension(mrg0.component_text_size_header);
        robotoTextView.setTextSize(0, dimension);
        robotoTextView.setTypeface(ip11Var.c(context));
        robotoTextView.setLetterSpacing(-0.015625f);
        robotoTextView.setLineHeight(m810.b(dimension));
        robotoTextView.setPadding(robotoTextView.getPaddingLeft(), robotoTextView.getPaddingTop(), robotoTextView.getPaddingRight(), tje.u(12, robotoTextView.getContext()));
        this.headerView = robotoTextView;
        Drawable createHintLeadViewBackground = createHintLeadViewBackground(getContext().getColor(mqg0.component_orange_toxic));
        this.hintLeadViewDefaultBackground = createHintLeadViewBackground;
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setBackground(createHintLeadViewBackground);
        int u = tje.u(40, imageView.getContext());
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(u, u);
        setGravity(16);
        imageView.setLayoutParams(marginLayoutParams);
        this.hintLeadView = imageView;
        int i = 6;
        AttributeSet attributeSet = null;
        int i2 = 0;
        ListItemComponent listItemComponent = new ListItemComponent(context, attributeSet, i2, i, defaultConstructorMarker);
        listItemComponent.setTitleTypeface(3);
        listItemComponent.setTitleMaxLines(2);
        listItemComponent.setSubtitleMaxLines(1);
        listItemComponent.setLeadView(imageView);
        listItemComponent.setMinHeight(tje.u(40, listItemComponent.getContext()));
        listItemComponent.setCenterFramePaddingStart(tje.u(8, listItemComponent.getContext()));
        listItemComponent.setTrailView(null);
        listItemComponent.setTrailMode(2);
        this.hintView = listItemComponent;
        ButtonComponent buttonComponent = new ButtonComponent(context, attributeSet, i2, i, defaultConstructorMarker);
        buttonComponent.setButtonSize(2);
        buttonComponent.setButtonBackground(new bdc(xng0.controlMinor));
        buttonComponent.setButtonTitleColor(new bdc(xng0.textOnControlMinor));
        this.minorButton = buttonComponent;
        ButtonComponent buttonComponent2 = new ButtonComponent(context, attributeSet, i2, i, defaultConstructorMarker);
        buttonComponent2.setAccent(true);
        buttonComponent2.setButtonSize(2);
        buttonComponent2.setRoundedCornersRadius(tje.r(mrg0.button_component_default_rounded_corners_radius, buttonComponent2.getContext()));
        this.majorButton = buttonComponent2;
        Space space = new Space(context);
        this.buttonsSpacing = space;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.addView(buttonComponent);
        linearLayout.addView(space, tje.u(4, linearLayout.getContext()), tje.u(4, linearLayout.getContext()));
        linearLayout.addView(buttonComponent2);
        this.buttonsBlock = linearLayout;
        setOrientation(1);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams2.bottomMargin = tje.u(8, getContext());
        addView(robotoTextView, marginLayoutParams2);
        ViewGroup.MarginLayoutParams marginLayoutParams3 = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams3.bottomMargin = tje.u(8, getContext());
        addView(listItemComponent, marginLayoutParams3);
        addView(linearLayout, -1, -2);
        render(f4w0.a);
        this.hintAccessibilityDelegate = new utc0();
    }

    private final void applyHiddenState() {
        hideHint();
        hideHeader();
        hideButtons();
        setPadding(0, 0, 0, 0);
    }

    private final void applyVisibleState(g4w0 uiState) {
        if (shouldUseBigHeaderWithSingleButtonStyle(uiState)) {
            showHeader(uiState.a, uiState.c);
            hideHint();
            ButtonComponent buttonComponent = this.minorButton;
            buttonComponent.setRoundedCornersRadius(ru.yandex.taxi.design.utils.c.h(100, buttonComponent));
            buttonComponent.setButtonSize(3);
        } else {
            hideHeader();
            initHint(uiState.a, uiState.c);
            ButtonComponent buttonComponent2 = this.minorButton;
            buttonComponent2.setRoundedCornersRadius(ru.yandex.taxi.design.utils.c.d(mrg0.button_component_default_rounded_corners_radius, buttonComponent2));
            buttonComponent2.setButtonSize(2);
        }
        showButtons(uiState);
        updatePaddings(uiState);
    }

    private final Drawable createHintLeadViewBackground(int color) {
        return d6z.W(color, tje.u(12, getContext()));
    }

    private final void hideButtons() {
        this.buttonsBlock.setVisibility(8);
    }

    private final void hideHeader() {
        this.headerView.setVisibility(8);
        this.headerView.setOnClickListener(null);
    }

    private final void hideHint() {
        this.hintView.setVisibility(8);
        this.hintView.setOnClickListener(null);
    }

    private final void initButton(ButtonComponent button, e37 state, pwz0 reason) {
        boolean z = state instanceof x27;
        button.setVisibility(z ? 0 : 8);
        if (!z) {
            button.setOnClickListener((Runnable) null);
            return;
        }
        x27 x27Var = (x27) state;
        button.setText(x27Var.a);
        button.setButtonBackground(button == this.minorButton ? new bdc(xng0.controlMinor) : null);
        button.setOnClickListener(new ud30(13, this, x27Var, reason));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initButton$lambda$0(PlaqueWidgetItemView plaqueWidgetItemView, e37 e37Var, pwz0 pwz0Var) {
        plaqueWidgetItemView.getEvents().g(new otc0(((x27) e37Var).b, pwz0Var));
    }

    private final void initHint(wju hintState, pwz0 reason) {
        this.hintView.setSubtitleAboveTitle(false);
        this.hintView.setVisibility(0);
        this.hintView.setTitle(hintState.a);
        this.hintView.setSubtitle(hintState.b);
        this.hintView.setTrailVisibility(hintState.c instanceof ljc0 ? 8 : 0);
        this.hintView.setDebounceClickListener(new ud30(14, this, hintState, reason));
        this.hintLeadView.setImageDrawable(vng.t(h2h0.ic_superapp_plaque_widget_location_off_fill_24dp, getContext()));
        this.hintLeadView.setBackground(this.hintLeadViewDefaultBackground);
        androidx.core.view.b.p(this.hintView, this.hintAccessibilityDelegate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initHint$lambda$0(PlaqueWidgetItemView plaqueWidgetItemView, wju wjuVar, pwz0 pwz0Var) {
        plaqueWidgetItemView.getEvents().g(new otc0(wjuVar.c, pwz0Var));
    }

    private final void resolveActionsAlignment(o00 actionsState) {
        Space space = this.buttonsSpacing;
        x27 x27Var = actionsState.a;
        space.setVisibility(actionsState.b instanceof x27 ? 0 : 8);
        ButtonComponent[] buttonComponentArr = {this.minorButton, this.majorButton};
        int i = ttc0.a[actionsState.c.ordinal()];
        if (i == 1) {
            this.buttonsBlock.setOrientation(1);
            for (int i2 = 0; i2 < 2; i2++) {
                ButtonComponent buttonComponent = buttonComponentArr[i2];
                ViewGroup.LayoutParams layoutParams = buttonComponent.getLayoutParams();
                if (layoutParams == null) {
                    ny61.t("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    return;
                }
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.width = -1;
                layoutParams2.weight = 1.0f;
                buttonComponent.setLayoutParams(layoutParams2);
            }
            return;
        }
        if (i != 2) {
            w511.b();
            return;
        }
        this.buttonsBlock.setOrientation(0);
        for (int i3 = 0; i3 < 2; i3++) {
            ButtonComponent buttonComponent2 = buttonComponentArr[i3];
            ViewGroup.LayoutParams layoutParams3 = buttonComponent2.getLayoutParams();
            if (layoutParams3 == null) {
                ny61.t("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                return;
            }
            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
            layoutParams4.width = 0;
            layoutParams4.weight = 1.0f;
            buttonComponent2.setLayoutParams(layoutParams4);
        }
    }

    private final boolean shouldUseBigHeaderWithSingleButtonStyle(g4w0 uiState) {
        return (uiState.c instanceof owz0) && (uiState.b.b instanceof w27);
    }

    private final void showButtons(g4w0 uiState) {
        this.buttonsBlock.setVisibility(0);
        resolveActionsAlignment(uiState.b);
        ButtonComponent buttonComponent = this.minorButton;
        o00 o00Var = uiState.b;
        x27 x27Var = o00Var.a;
        pwz0 pwz0Var = uiState.c;
        initButton(buttonComponent, x27Var, pwz0Var);
        initButton(this.majorButton, o00Var.b, pwz0Var);
    }

    private final void showHeader(wju hintState, pwz0 reason) {
        this.headerView.setVisibility(0);
        this.headerView.setText(hintState.a);
        ru.yandex.taxi.design.utils.c.z(new b700(27, this, hintState, reason), this.headerView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 showHeader$lambda$0(PlaqueWidgetItemView plaqueWidgetItemView, wju wjuVar, pwz0 pwz0Var) {
        plaqueWidgetItemView.getEvents().g(new otc0(wjuVar.c, pwz0Var));
        return zy11.a;
    }

    private final void updatePaddings(h4w0 uiState) {
        lkn lknVar = this.layoutPaddings;
        if ((uiState instanceof g4w0) && shouldUseBigHeaderWithSingleButtonStyle((g4w0) uiState)) {
            int r = tje.r(mrg0.go_design_s_space, getContext());
            int u = tje.u(36, getContext());
            setPadding(u, r, u, tje.u(4, getContext()));
        } else {
            if (lknVar == null) {
                int r2 = tje.r(mrg0.go_design_s_space, getContext());
                int r3 = tje.r(mrg0.go_design_m_space, getContext());
                setPadding(r3, r2, r3, tje.r(mrg0.go_design_m_space, getContext()));
                return;
            }
            int v = tje.v(getContext(), lknVar.c);
            setPaddingRelative(tje.v(getContext(), lknVar.a), v, tje.v(getContext(), lknVar.b), tje.v(getContext(), lknVar.d));
        }
    }

    public final void bind(hzx layout) {
        this.layoutPaddings = layout != null ? layout.a : null;
    }

    @Override // defpackage.eyi0
    public void render(h4w0 uiState) {
        if (uiState instanceof f4w0) {
            applyHiddenState();
        } else if (uiState instanceof g4w0) {
            applyVisibleState((g4w0) uiState);
        } else {
            w511.b();
        }
    }

    @Override // defpackage.ptc0
    public lz40 getEvents() {
        return this.events;
    }
}
