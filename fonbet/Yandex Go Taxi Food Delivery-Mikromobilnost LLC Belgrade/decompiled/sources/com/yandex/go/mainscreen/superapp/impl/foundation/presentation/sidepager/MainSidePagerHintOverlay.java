package com.yandex.go.mainscreen.superapp.impl.foundation.presentation.sidepager;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.mrg0;
import defpackage.ntg0;
import defpackage.ny61;
import defpackage.qje;
import defpackage.uc00;
import defpackage.xng0;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 #2\u00020\u0001:\u0001$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/yandex/go/mainscreen/superapp/impl/foundation/presentation/sidepager/MainSidePagerHintOverlay;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lzy11;", "applyThemeColors", "()V", "", "text", "setPullHint", "(Ljava/lang/CharSequence;)V", "", "headerHeight", "setHeaderHeight", "(I)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "", "overlayPhase", "applyOverlayPhase", "(F)V", "Landroid/view/View;", "scrimView", "Landroid/view/View;", "Lru/yandex/taxi/widget/RobotoTextView;", "hintTextView", "Lru/yandex/taxi/widget/RobotoTextView;", "hintContainer", "Landroid/widget/FrameLayout;", "toolbarHeight", CA20Status.STATUS_USER_I, "Companion", "uc00", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MainSidePagerHintOverlay extends FrameLayout {
    private static final uc00 Companion = new uc00();
    private static final float MAX_SCRIM_ALPHA = 0.8f;
    private final FrameLayout hintContainer;
    private final RobotoTextView hintTextView;
    private final View scrimView;
    private final int toolbarHeight;

    public MainSidePagerHintOverlay(Context context) {
        super(context);
        View view = new View(context);
        this.scrimView = view;
        RobotoTextView robotoTextView = new RobotoTextView(context, null, 0, 6, null);
        robotoTextView.setTextSize(0, robotoTextView.getResources().getDimension(mrg0.component_text_size_caption));
        robotoTextView.setMaxWidth(robotoTextView.getResources().getDimensionPixelSize(ntg0.superapp_main_screen_side_pager_hint_max_width));
        robotoTextView.setGravity(17);
        robotoTextView.setImportantForAccessibility(1);
        this.hintTextView = robotoTextView;
        FrameLayout frameLayout = new FrameLayout(context);
        this.hintContainer = frameLayout;
        int dimensionPixelSize = getResources().getDimensionPixelSize(ntg0.superapp_main_screen_toolbar_height);
        this.toolbarHeight = dimensionPixelSize;
        applyThemeColors();
        setVisibility(8);
        setClickable(false);
        setFocusable(false);
        addView(view, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(robotoTextView, new FrameLayout.LayoutParams(-2, -2, 17));
        addView(frameLayout, new FrameLayout.LayoutParams(-1, dimensionPixelSize));
    }

    private final void applyThemeColors() {
        this.scrimView.setBackgroundColor(qje.t(xng0.bgMain, getContext()));
        this.hintTextView.setTextColor(qje.t(xng0.textMinor, getContext()));
    }

    public final void applyOverlayPhase(float overlayPhase) {
        if (overlayPhase <= 0.0f) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        this.scrimView.setAlpha(0.8f);
        this.hintTextView.setAlpha(1.0f);
    }

    public final void applyTheme(ThemeType themeType) {
        applyThemeColors();
    }

    public final void setHeaderHeight(int headerHeight) {
        int i = headerHeight - this.toolbarHeight;
        if (i < 0) {
            i = 0;
        }
        if (((FrameLayout.LayoutParams) this.hintContainer.getLayoutParams()).topMargin != i) {
            FrameLayout frameLayout = this.hintContainer;
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            if (layoutParams == null) {
                ny61.t("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                return;
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.topMargin = i;
            frameLayout.setLayoutParams(layoutParams2);
        }
    }

    public final void setPullHint(CharSequence text) {
        this.hintTextView.setText(text);
        this.hintTextView.setContentDescription(text);
    }
}
