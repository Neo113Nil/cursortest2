package com.yandex.go.tariffcard.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import com.yandex.go.design.view.GoFrameLayout;
import defpackage.cma1;
import defpackage.ddx0;
import defpackage.edx0;
import defpackage.fdx0;
import defpackage.gdx0;
import defpackage.hdx0;
import defpackage.idx0;
import defpackage.jdx0;
import defpackage.jl40;
import defpackage.kdx0;
import defpackage.ldx0;
import defpackage.lnv0;
import defpackage.ny61;
import defpackage.qje;
import defpackage.ssg0;
import defpackage.tje;
import defpackage.w0d;
import defpackage.w511;
import defpackage.xng0;
import defpackage.xrh0;
import defpackage.yfh0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0017\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0018\u0010\u0015J\u000f\u0010\u0019\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0019\u0010\u0015J/\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\r2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0015\u0010&\u001a\u00020\r2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010.\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u00103¨\u00064"}, d2 = {"Lcom/yandex/go/tariffcard/ui/view/TariffCardScrollButtonView;", "Lcom/yandex/go/design/view/GoFrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "title", "Lzy11;", "setTitle", "(Ljava/lang/String;)V", "Lddx0;", ConfigConstants.CONFIG, "setAnimationConfig", "(Lddx0;)V", "startJumping", "()V", "stopJumping", "hide", "invalidateComponent", "onAttachedToWindow", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Lldx0;", ClidProvider.STATE, "setState", "(Lldx0;)V", "Lfdx0;", "binding", "Lfdx0;", "Lru/yandex/taxi/widget/RobotoTextView;", "titleTextView", "Lru/yandex/taxi/widget/RobotoTextView;", "animationConfig", "Lddx0;", "Ledx0;", "jumpAnimator", "Ledx0;", "Lldx0;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TariffCardScrollButtonView extends GoFrameLayout {
    private ddx0 animationConfig;
    private final fdx0 binding;
    private edx0 jumpAnimator;
    private ldx0 state;
    private final RobotoTextView titleTextView;

    public TariffCardScrollButtonView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        LayoutInflater.from(context).inflate(xrh0.tariff_card_scroll_button_view, this);
        int i3 = yfh0.title;
        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i3, this);
        if (robotoTextView == null) {
            ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i3)));
            throw null;
        }
        this.binding = new fdx0(this, robotoTextView);
        this.titleTextView = robotoTextView;
        this.animationConfig = new ddx0(0, 0);
        this.state = hdx0.a;
        setClickable(true);
        setVisibility(8);
    }

    private final void hide() {
        if (getVisibility() == 0) {
            animate().alpha(0.0f).setDuration(200L).withEndAction(new lnv0(24, this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hide$lambda$0(TariffCardScrollButtonView tariffCardScrollButtonView) {
        tariffCardScrollButtonView.setVisibility(8);
        tariffCardScrollButtonView.setAlpha(1.0f);
    }

    private final void invalidateComponent() {
        w0d w0dVar = new w0d();
        w0dVar.h = getMeasuredHeight() / 2.0f;
        w0dVar.a = qje.t(xng0.bgInvert, getContext());
        setBackground(w0dVar.a());
    }

    private final void setAnimationConfig(ddx0 config) {
        this.animationConfig = config;
    }

    private final void setTitle(String title) {
        this.titleTextView.setText(title);
    }

    private final void startJumping() {
        edx0 edx0Var = this.jumpAnimator;
        if (edx0Var != null) {
            edx0Var.b.set(false);
        }
        edx0 edx0Var2 = new edx0(this, this.animationConfig);
        edx0Var2.b.set(true);
        edx0Var2.c.start();
        this.jumpAnimator = edx0Var2;
    }

    private final void stopJumping() {
        edx0 edx0Var = this.jumpAnimator;
        if (edx0Var != null) {
            edx0Var.b.set(false);
        }
        this.jumpAnimator = null;
    }

    @Override // com.yandex.go.design.view.GoFrameLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        invalidateComponent();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getLayoutParams().height = tje.r(ssg0.requirement_scroll_button_height, getContext());
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        invalidateComponent();
    }

    public final void setState(ldx0 state) {
        if (jl40.l(this.state, state)) {
            return;
        }
        this.state = state;
        if (jl40.l(state, gdx0.a)) {
            hide();
            stopJumping();
            return;
        }
        if (jl40.l(state, hdx0.a)) {
            hide();
            stopJumping();
            return;
        }
        if (state instanceof idx0) {
            setTitle(((idx0) state).a);
            hide();
            stopJumping();
        } else if (state instanceof jdx0) {
            setTitle(((jdx0) state).a);
            setVisibility(0);
            stopJumping();
        } else {
            if (!(state instanceof kdx0)) {
                w511.b();
                return;
            }
            kdx0 kdx0Var = (kdx0) state;
            setTitle(kdx0Var.a);
            setAnimationConfig(new ddx0(kdx0Var.b, kdx0Var.c));
            setVisibility(0);
            startJumping();
        }
    }

    public TariffCardScrollButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public TariffCardScrollButtonView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public TariffCardScrollButtonView(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public /* synthetic */ TariffCardScrollButtonView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
