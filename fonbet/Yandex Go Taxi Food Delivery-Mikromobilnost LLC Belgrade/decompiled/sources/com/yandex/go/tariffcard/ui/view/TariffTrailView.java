package com.yandex.go.tariffcard.ui.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.LayoutInflater;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import androidx.core.view.b;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.tariffcard.ui.view.TariffTrailView;
import defpackage.bdc;
import defpackage.cma1;
import defpackage.cn40;
import defpackage.d1h0;
import defpackage.dn40;
import defpackage.fn40;
import defpackage.gn40;
import defpackage.hn40;
import defpackage.i3y;
import defpackage.jq40;
import defpackage.kok0;
import defpackage.mfb;
import defpackage.ny61;
import defpackage.sls;
import defpackage.sox0;
import defpackage.tje;
import defpackage.vng;
import defpackage.xng0;
import defpackage.xrh0;
import defpackage.yfh0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.design.CheckBoxComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000 E2\u00020\u00012\u00020\u0002:\u0001FB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\tJ!\u0010\u000f\u001a\u00020\u0007*\u00060\u000bj\u0002`\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u0019¢\u0006\u0004\b!\u0010\"J\u0019\u0010%\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001b\u00104\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010,\u001a\u0004\b2\u00103R\u001b\u00107\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u0010,\u001a\u0004\b6\u00103R\u001b\u0010:\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u0010,\u001a\u0004\b9\u00103R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010;R\u0018\u0010=\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010?R*\u0010A\u001a\u00020\u00192\u0006\u0010@\u001a\u00020\u00198\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010;\u001a\u0004\bA\u0010\"\"\u0004\bB\u0010\u001cR\u0016\u0010D\u001a\u0004\u0018\u0001008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bC\u00103¨\u0006G"}, d2 = {"Lcom/yandex/go/tariffcard/ui/view/TariffTrailView;", "Lcom/yandex/go/design/view/GoConstraintLayout;", "Lnwy0;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lzy11;", "setCheckboxImage", "()V", "setupAccessibility", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "", "contentDescription", "appendContentDescription", "(Ljava/lang/StringBuilder;Ljava/lang/CharSequence;)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Lhn40;", "priceInfoState", "setPriceInfo", "(Lhn40;)V", "", "checkToggleByClickEnabled", "setCheckboxToggleOnClickEnabled", "(Z)V", "Ldn40;", "checkedCheckboxColors", "setCheckedCheckboxTint", "(Ldn40;)V", "toggleCheckbox", "()Z", "Landroid/view/accessibility/AccessibilityEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onInitializeAccessibilityEvent", "(Landroid/view/accessibility/AccessibilityEvent;)V", "Ljq40;", "binding", "Ljq40;", "Lmfb;", "checkDrawableProvider$delegate", "Li3y;", "getCheckDrawableProvider", "()Lmfb;", "checkDrawableProvider", "Landroid/graphics/drawable/Drawable;", "checkedCheckboxBg$delegate", "getCheckedCheckboxBg", "()Landroid/graphics/drawable/Drawable;", "checkedCheckboxBg", "checkIcon$delegate", "getCheckIcon", "checkIcon", "checkedCheckbox$delegate", "getCheckedCheckbox", "checkedCheckbox", "Z", "", "cashBackValue", "Ljava/lang/String;", "Ljava/lang/CharSequence;", "value", "isChecked", "setChecked", "getUncheckedCheckbox", "uncheckedCheckbox", "Companion", "sox0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TariffTrailView extends GoConstraintLayout {
    public static final sox0 Companion = new sox0();
    private static final String DECIMAL_DIVIDER_COMMA = ",";
    private static final String DECIMAL_DIVIDER_POINT = ".";
    private final jq40 binding;
    private String cashBackValue;

    /* renamed from: checkDrawableProvider$delegate, reason: from kotlin metadata */
    private final i3y checkDrawableProvider;

    /* renamed from: checkIcon$delegate, reason: from kotlin metadata */
    private final i3y checkIcon;
    private boolean checkToggleByClickEnabled;

    /* renamed from: checkedCheckbox$delegate, reason: from kotlin metadata */
    private final i3y checkedCheckbox;

    /* renamed from: checkedCheckboxBg$delegate, reason: from kotlin metadata */
    private final i3y checkedCheckboxBg;
    private CharSequence contentDescription;
    private boolean isChecked;

    public TariffTrailView(Context context) {
        super(context, null, 0, 0, 14, null);
        LayoutInflater.from(context).inflate(xrh0.multiclass_tariff_page_trail_view, this);
        int i = yfh0.additionalTextView;
        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, this);
        if (robotoTextView != null) {
            i = yfh0.additionalViewContainer;
            FrameLayout frameLayout = (FrameLayout) cma1.O(i, this);
            if (frameLayout != null) {
                i = yfh0.cashbackView;
                MulticlassCashbackView multiclassCashbackView = (MulticlassCashbackView) cma1.O(i, this);
                if (multiclassCashbackView != null) {
                    i = yfh0.check_box;
                    CheckBoxComponent checkBoxComponent = (CheckBoxComponent) cma1.O(i, this);
                    if (checkBoxComponent != null) {
                        i = yfh0.mainTextView;
                        RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, this);
                        if (robotoTextView2 != null) {
                            this.binding = new jq40(this, robotoTextView, frameLayout, multiclassCashbackView, checkBoxComponent, robotoTextView2);
                            kok0 kok0Var = new kok0(context, 12);
                            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
                            this.checkDrawableProvider = a.b(lazyThreadSafetyMode, kok0Var);
                            final int i2 = 0;
                            this.checkedCheckboxBg = a.b(lazyThreadSafetyMode, new sls(this) { // from class: rox0
                                public final /* synthetic */ TariffTrailView b;

                                {
                                    this.b = this;
                                }

                                @Override // defpackage.sls
                                public final Object invoke() {
                                    Drawable checkedCheckboxBg_delegate$lambda$0;
                                    Drawable checkIcon_delegate$lambda$0;
                                    LayerDrawable checkedCheckbox_delegate$lambda$0;
                                    int i3 = i2;
                                    TariffTrailView tariffTrailView = this.b;
                                    switch (i3) {
                                        case 0:
                                            checkedCheckboxBg_delegate$lambda$0 = TariffTrailView.checkedCheckboxBg_delegate$lambda$0(tariffTrailView);
                                            return checkedCheckboxBg_delegate$lambda$0;
                                        case 1:
                                            checkIcon_delegate$lambda$0 = TariffTrailView.checkIcon_delegate$lambda$0(tariffTrailView);
                                            return checkIcon_delegate$lambda$0;
                                        default:
                                            checkedCheckbox_delegate$lambda$0 = TariffTrailView.checkedCheckbox_delegate$lambda$0(tariffTrailView);
                                            return checkedCheckbox_delegate$lambda$0;
                                    }
                                }
                            });
                            final int i3 = 1;
                            this.checkIcon = a.b(lazyThreadSafetyMode, new sls(this) { // from class: rox0
                                public final /* synthetic */ TariffTrailView b;

                                {
                                    this.b = this;
                                }

                                @Override // defpackage.sls
                                public final Object invoke() {
                                    Drawable checkedCheckboxBg_delegate$lambda$0;
                                    Drawable checkIcon_delegate$lambda$0;
                                    LayerDrawable checkedCheckbox_delegate$lambda$0;
                                    int i32 = i3;
                                    TariffTrailView tariffTrailView = this.b;
                                    switch (i32) {
                                        case 0:
                                            checkedCheckboxBg_delegate$lambda$0 = TariffTrailView.checkedCheckboxBg_delegate$lambda$0(tariffTrailView);
                                            return checkedCheckboxBg_delegate$lambda$0;
                                        case 1:
                                            checkIcon_delegate$lambda$0 = TariffTrailView.checkIcon_delegate$lambda$0(tariffTrailView);
                                            return checkIcon_delegate$lambda$0;
                                        default:
                                            checkedCheckbox_delegate$lambda$0 = TariffTrailView.checkedCheckbox_delegate$lambda$0(tariffTrailView);
                                            return checkedCheckbox_delegate$lambda$0;
                                    }
                                }
                            });
                            final int i4 = 2;
                            this.checkedCheckbox = a.b(lazyThreadSafetyMode, new sls(this) { // from class: rox0
                                public final /* synthetic */ TariffTrailView b;

                                {
                                    this.b = this;
                                }

                                @Override // defpackage.sls
                                public final Object invoke() {
                                    Drawable checkedCheckboxBg_delegate$lambda$0;
                                    Drawable checkIcon_delegate$lambda$0;
                                    LayerDrawable checkedCheckbox_delegate$lambda$0;
                                    int i32 = i4;
                                    TariffTrailView tariffTrailView = this.b;
                                    switch (i32) {
                                        case 0:
                                            checkedCheckboxBg_delegate$lambda$0 = TariffTrailView.checkedCheckboxBg_delegate$lambda$0(tariffTrailView);
                                            return checkedCheckboxBg_delegate$lambda$0;
                                        case 1:
                                            checkIcon_delegate$lambda$0 = TariffTrailView.checkIcon_delegate$lambda$0(tariffTrailView);
                                            return checkIcon_delegate$lambda$0;
                                        default:
                                            checkedCheckbox_delegate$lambda$0 = TariffTrailView.checkedCheckbox_delegate$lambda$0(tariffTrailView);
                                            return checkedCheckbox_delegate$lambda$0;
                                    }
                                }
                            });
                            multiclassCashbackView.setVisibility(8);
                            setupAccessibility();
                            return;
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void appendContentDescription(StringBuilder sb, CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return;
        }
        if (sb != null && sb.length() != 0) {
            sb.append(Extension.FIX_SPACE);
        }
        sb.append(charSequence);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mfb checkDrawableProvider_delegate$lambda$0(Context context) {
        return new mfb(context, null, xng0.listCheckBoxComponentStyle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Drawable checkIcon_delegate$lambda$0(TariffTrailView tariffTrailView) {
        return c.l(d1h0.checkbox_checked_icon, tariffTrailView).mutate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Drawable checkedCheckboxBg_delegate$lambda$0(TariffTrailView tariffTrailView) {
        mfb checkDrawableProvider = tariffTrailView.getCheckDrawableProvider();
        vng.t(checkDrawableProvider.d, checkDrawableProvider.a);
        return tje.y(d1h0.checkbox_checked_rectangle_bg, tariffTrailView.getContext()).mutate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LayerDrawable checkedCheckbox_delegate$lambda$0(TariffTrailView tariffTrailView) {
        return new LayerDrawable(new Drawable[]{tariffTrailView.getCheckedCheckboxBg(), tariffTrailView.getCheckIcon()});
    }

    private final mfb getCheckDrawableProvider() {
        return (mfb) this.checkDrawableProvider.getValue();
    }

    private final Drawable getCheckIcon() {
        return (Drawable) this.checkIcon.getValue();
    }

    private final Drawable getCheckedCheckbox() {
        return (Drawable) this.checkedCheckbox.getValue();
    }

    private final Drawable getCheckedCheckboxBg() {
        return (Drawable) this.checkedCheckboxBg.getValue();
    }

    private final Drawable getUncheckedCheckbox() {
        mfb checkDrawableProvider = getCheckDrawableProvider();
        return vng.t(checkDrawableProvider.h, checkDrawableProvider.a);
    }

    private final void setCheckboxImage() {
        this.binding.e.setImageDrawable(this.isChecked ? getCheckedCheckbox() : getUncheckedCheckbox());
    }

    private final void setupAccessibility() {
        b.p(this, new cn40(this, 1));
    }

    @Override // com.yandex.go.design.view.GoConstraintLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        this.binding.f.setTextColor(new bdc(xng0.textMain));
        this.binding.b.setTextColor(new bdc(xng0.textMinor));
        this.binding.d.invalidateCashbackColor();
    }

    /* renamed from: isChecked, reason: from getter */
    public final boolean getIsChecked() {
        return this.isChecked;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent event) {
        super.onInitializeAccessibilityEvent(event);
        if (event != null) {
            event.setChecked(this.isChecked);
        }
    }

    public final void setCheckboxToggleOnClickEnabled(boolean checkToggleByClickEnabled) {
        this.checkToggleByClickEnabled = checkToggleByClickEnabled;
        setCheckboxImage();
    }

    public final void setChecked(boolean z) {
        this.isChecked = z;
        setCheckboxImage();
    }

    public final void setCheckedCheckboxTint(dn40 checkedCheckboxColors) {
        getCheckedCheckboxBg().setTint(checkedCheckboxColors.b.a);
        getCheckIcon().setTint(checkedCheckboxColors.a.a);
    }

    public final void setPriceInfo(hn40 priceInfoState) {
        this.binding.f.setText(priceInfoState.a);
        this.contentDescription = priceInfoState.d;
        gn40 gn40Var = priceInfoState.c;
        fn40 fn40Var = priceInfoState.b;
        jq40 jq40Var = this.binding;
        if (gn40Var != null) {
            jq40Var.c.setVisibility(0);
            this.binding.d.setVisibility(8);
            this.binding.d.setCashbackValue(null);
            this.cashBackValue = null;
            this.binding.b.setVisibility(0);
            this.binding.b.setText(gn40Var.a);
            return;
        }
        if (fn40Var == null) {
            jq40Var.c.setVisibility(8);
            this.binding.d.setCashbackValue(null);
            this.cashBackValue = null;
            this.binding.b.setText((CharSequence) null);
            return;
        }
        String str = fn40Var.a;
        jq40Var.c.setVisibility(0);
        this.binding.d.setVisibility(0);
        this.binding.d.setCashbackValue(str);
        this.cashBackValue = str;
        this.binding.b.setVisibility(8);
        this.binding.b.setText((CharSequence) null);
    }

    public final boolean toggleCheckbox() {
        setChecked(!this.isChecked);
        return this.isChecked;
    }
}
