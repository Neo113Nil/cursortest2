package com.yandex.go.ultima_mode.ui.progress_bar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.Barrier;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.ultima_mode.ui.progress_bar.UltimaModeProgressBarView;
import defpackage.cma1;
import defpackage.d6w;
import defpackage.i3y;
import defpackage.ilh0;
import defpackage.lhc;
import defpackage.mqg0;
import defpackage.nv11;
import defpackage.ny61;
import defpackage.ov11;
import defpackage.pv11;
import defpackage.qje;
import defpackage.qv11;
import defpackage.sls;
import defpackage.sv11;
import defpackage.w511;
import defpackage.y6i0;
import defpackage.y8h0;
import kotlin.Metadata;
import kotlin.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001b\u0010$\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001b\u0010'\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010#R\u001b\u0010*\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010!\u001a\u0004\b)\u0010#¨\u0006+"}, d2 = {"Lcom/yandex/go/ultima_mode/ui/progress_bar/UltimaModeProgressBarView;", "Lcom/yandex/go/design/view/GoConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lov11;", "uiState", "Lzy11;", "renderContent", "(Lov11;)V", "percent", "renderProgressBarView", "(I)V", "renderEmpty", "()V", "updateProgressBarColors", "Lqv11;", "render", "(Lqv11;)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Lnv11;", "binding", "Lnv11;", "progressBarFillColorLight$delegate", "Li3y;", "getProgressBarFillColorLight", "()I", "progressBarFillColorLight", "progressBarFillColorDark$delegate", "getProgressBarFillColorDark", "progressBarFillColorDark", "progressBarEmptyColor$delegate", "getProgressBarEmptyColor", "progressBarEmptyColor", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class UltimaModeProgressBarView extends GoConstraintLayout {
    private final nv11 binding;

    /* renamed from: progressBarEmptyColor$delegate, reason: from kotlin metadata */
    private final i3y progressBarEmptyColor;

    /* renamed from: progressBarFillColorDark$delegate, reason: from kotlin metadata */
    private final i3y progressBarFillColorDark;

    /* renamed from: progressBarFillColorLight$delegate, reason: from kotlin metadata */
    private final i3y progressBarFillColorLight;

    public UltimaModeProgressBarView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        LayoutInflater.from(context).inflate(ilh0.ultima_mode_progress_bar_layout, this);
        int i3 = y8h0.bottom_text_barrier;
        if (((Barrier) cma1.O(i3, this)) != null) {
            i3 = y8h0.flow_helper;
            if (((Flow) cma1.O(i3, this)) != null) {
                i3 = y8h0.progress_bar_bottom_text;
                RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i3, this);
                if (robotoTextView != null) {
                    i3 = y8h0.progress_bar_text;
                    RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i3, this);
                    if (robotoTextView2 != null) {
                        i3 = y8h0.progress_bar_trail;
                        RobotoTextView robotoTextView3 = (RobotoTextView) cma1.O(i3, this);
                        if (robotoTextView3 != null) {
                            i3 = y8h0.progress_bar_view;
                            SimpleProgressBarView simpleProgressBarView = (SimpleProgressBarView) cma1.O(i3, this);
                            if (simpleProgressBarView != null) {
                                this.binding = new nv11(this, robotoTextView, robotoTextView2, robotoTextView3, simpleProgressBarView);
                                final int i4 = 0;
                                this.progressBarFillColorLight = a.a(new sls(this) { // from class: rv11
                                    public final /* synthetic */ UltimaModeProgressBarView b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // defpackage.sls
                                    public final Object invoke() {
                                        int progressBarFillColorLight_delegate$lambda$0;
                                        int i5 = i4;
                                        UltimaModeProgressBarView ultimaModeProgressBarView = this.b;
                                        switch (i5) {
                                            case 0:
                                                progressBarFillColorLight_delegate$lambda$0 = UltimaModeProgressBarView.progressBarFillColorLight_delegate$lambda$0(ultimaModeProgressBarView);
                                                break;
                                            case 1:
                                                progressBarFillColorLight_delegate$lambda$0 = UltimaModeProgressBarView.progressBarFillColorDark_delegate$lambda$0(ultimaModeProgressBarView);
                                                break;
                                            default:
                                                progressBarFillColorLight_delegate$lambda$0 = UltimaModeProgressBarView.progressBarEmptyColor_delegate$lambda$0(ultimaModeProgressBarView);
                                                break;
                                        }
                                        return Integer.valueOf(progressBarFillColorLight_delegate$lambda$0);
                                    }
                                });
                                final int i5 = 1;
                                this.progressBarFillColorDark = a.a(new sls(this) { // from class: rv11
                                    public final /* synthetic */ UltimaModeProgressBarView b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // defpackage.sls
                                    public final Object invoke() {
                                        int progressBarFillColorLight_delegate$lambda$0;
                                        int i52 = i5;
                                        UltimaModeProgressBarView ultimaModeProgressBarView = this.b;
                                        switch (i52) {
                                            case 0:
                                                progressBarFillColorLight_delegate$lambda$0 = UltimaModeProgressBarView.progressBarFillColorLight_delegate$lambda$0(ultimaModeProgressBarView);
                                                break;
                                            case 1:
                                                progressBarFillColorLight_delegate$lambda$0 = UltimaModeProgressBarView.progressBarFillColorDark_delegate$lambda$0(ultimaModeProgressBarView);
                                                break;
                                            default:
                                                progressBarFillColorLight_delegate$lambda$0 = UltimaModeProgressBarView.progressBarEmptyColor_delegate$lambda$0(ultimaModeProgressBarView);
                                                break;
                                        }
                                        return Integer.valueOf(progressBarFillColorLight_delegate$lambda$0);
                                    }
                                });
                                final int i6 = 2;
                                this.progressBarEmptyColor = a.a(new sls(this) { // from class: rv11
                                    public final /* synthetic */ UltimaModeProgressBarView b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // defpackage.sls
                                    public final Object invoke() {
                                        int progressBarFillColorLight_delegate$lambda$0;
                                        int i52 = i6;
                                        UltimaModeProgressBarView ultimaModeProgressBarView = this.b;
                                        switch (i52) {
                                            case 0:
                                                progressBarFillColorLight_delegate$lambda$0 = UltimaModeProgressBarView.progressBarFillColorLight_delegate$lambda$0(ultimaModeProgressBarView);
                                                break;
                                            case 1:
                                                progressBarFillColorLight_delegate$lambda$0 = UltimaModeProgressBarView.progressBarFillColorDark_delegate$lambda$0(ultimaModeProgressBarView);
                                                break;
                                            default:
                                                progressBarFillColorLight_delegate$lambda$0 = UltimaModeProgressBarView.progressBarEmptyColor_delegate$lambda$0(ultimaModeProgressBarView);
                                                break;
                                        }
                                        return Integer.valueOf(progressBarFillColorLight_delegate$lambda$0);
                                    }
                                });
                                updateProgressBarColors();
                                return;
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i3)));
        throw null;
    }

    private final int getProgressBarEmptyColor() {
        return ((Number) this.progressBarEmptyColor.getValue()).intValue();
    }

    private final int getProgressBarFillColorDark() {
        return ((Number) this.progressBarFillColorDark.getValue()).intValue();
    }

    private final int getProgressBarFillColorLight() {
        return ((Number) this.progressBarFillColorLight.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int progressBarEmptyColor_delegate$lambda$0(UltimaModeProgressBarView ultimaModeProgressBarView) {
        return lhc.f(c.a(mqg0.component_gray_350, ultimaModeProgressBarView), Math.abs((int) (255.0f * 0.4f)) & 255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int progressBarFillColorDark_delegate$lambda$0(UltimaModeProgressBarView ultimaModeProgressBarView) {
        return c.a(mqg0.component_gray_200, ultimaModeProgressBarView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int progressBarFillColorLight_delegate$lambda$0(UltimaModeProgressBarView ultimaModeProgressBarView) {
        return c.a(mqg0.component_cold_yellow_pastel_550, ultimaModeProgressBarView);
    }

    private final void renderContent(ov11 uiState) {
        setVisibility(0);
        renderProgressBarView(uiState.a);
        nv11 nv11Var = this.binding;
        nv11Var.e.setAccessibilityDescription(uiState.e);
        RobotoTextView robotoTextView = nv11Var.c;
        robotoTextView.setText(uiState.b);
        robotoTextView.setContentDescription(uiState.f);
        nv11Var.d.setText(uiState.c);
        RobotoTextView robotoTextView2 = nv11Var.b;
        robotoTextView2.setText(uiState.d);
        robotoTextView2.setContentDescription(uiState.g);
        robotoTextView2.setAlpha(0.5f);
    }

    private final void renderEmpty() {
        setVisibility(8);
    }

    private final void renderProgressBarView(int percent) {
        this.binding.e.setProgress(y6i0.e(percent, new d6w(0, 100, 1)) / 100.0f);
    }

    private final void updateProgressBarColors() {
        int progressBarFillColorLight;
        int i = sv11.a[qje.X(getContext()).ordinal()];
        if (i == 1) {
            progressBarFillColorLight = getProgressBarFillColorLight();
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            progressBarFillColorLight = getProgressBarFillColorDark();
        }
        this.binding.e.setColors(progressBarFillColorLight, getProgressBarEmptyColor());
    }

    @Override // com.yandex.go.design.view.GoConstraintLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        updateProgressBarColors();
    }

    public final void render(qv11 uiState) {
        if (uiState instanceof ov11) {
            renderContent((ov11) uiState);
        } else if (uiState instanceof pv11) {
            renderEmpty();
        } else {
            w511.b();
        }
    }

    public UltimaModeProgressBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public UltimaModeProgressBarView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public UltimaModeProgressBarView(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public /* synthetic */ UltimaModeProgressBarView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
