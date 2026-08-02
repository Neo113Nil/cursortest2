package com.yandex.go.payments.yangopay.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import com.yandex.go.payments.yangopay.ui.YangoPayWidgetView;
import defpackage.b64;
import defpackage.cma1;
import defpackage.cp51;
import defpackage.e6h0;
import defpackage.evu0;
import defpackage.i3y;
import defpackage.jy31;
import defpackage.k4o;
import defpackage.kdc;
import defpackage.ko51;
import defpackage.lhc;
import defpackage.lo51;
import defpackage.luh0;
import defpackage.mfb;
import defpackage.nwy0;
import defpackage.ny61;
import defpackage.pav;
import defpackage.q501;
import defpackage.qje;
import defpackage.sls;
import defpackage.u0a0;
import defpackage.vql;
import defpackage.w0d;
import defpackage.w511;
import defpackage.xng0;
import defpackage.z0a0;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.JCP;
import ru.yandex.taxi.design.CheckBoxComponent;
import ru.yandex.taxi.design.SwitchComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0003vwxB'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0001\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001fH\u0014¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J/\u0010+\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020\u00112\u0006\u0010(\u001a\u00020\u00112\u0006\u0010)\u001a\u00020\u00112\u0006\u0010*\u001a\u00020\u0011H\u0014¢\u0006\u0004\b+\u0010,J\u0015\u0010/\u001a\u00020\u001c2\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020\u001c2\b\u00101\u001a\u0004\u0018\u00010-¢\u0006\u0004\b2\u00100J\u0015\u00105\u001a\u00020\u001c2\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00020\u001c2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b7\u00108J\u0017\u00109\u001a\u00020\u001c2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b9\u00108J\u0017\u0010;\u001a\u00020\u001c2\b\b\u0001\u0010:\u001a\u00020\u0011¢\u0006\u0004\b;\u0010<J\r\u0010=\u001a\u00020\u001c¢\u0006\u0004\b=\u0010>J3\u0010F\u001a\u00020\u001c2\u0006\u0010?\u001a\u00020\u00132\u0006\u0010A\u001a\u00020@2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u001c0B2\u0006\u0010E\u001a\u00020D¢\u0006\u0004\bF\u0010GJ\u001b\u0010K\u001a\u00020\u001c2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020I0H¢\u0006\u0004\bK\u0010LJ\u001d\u0010Q\u001a\u00020\u001c2\u0006\u0010N\u001a\u00020M2\u0006\u0010P\u001a\u00020O¢\u0006\u0004\bQ\u0010RJ\r\u0010S\u001a\u00020\u001c¢\u0006\u0004\bS\u0010>J\r\u0010T\u001a\u00020\u001c¢\u0006\u0004\bT\u0010>J%\u0010X\u001a\u00020\u001c2\b\u0010V\u001a\u0004\u0018\u00010U2\f\u0010W\u001a\b\u0012\u0004\u0012\u00020\u001c0B¢\u0006\u0004\bX\u0010YR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010ZR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010[R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\\R\u0014\u0010^\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010a\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u001b\u0010g\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR\u001b\u0010j\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bh\u0010d\u001a\u0004\bi\u0010fR\u001b\u0010o\u001a\u00020k8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bl\u0010d\u001a\u0004\bm\u0010nR\u0014\u0010q\u001a\u00020p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0014\u0010t\u001a\u00020s8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010u¨\u0006y"}, d2 = {"Lcom/yandex/go/payments/yangopay/ui/YangoPayWidgetView;", "Landroid/widget/LinearLayout;", "Lnwy0;", "Landroid/content/Context;", "context", "Lpav;", "imageLoader", "Lz0a0;", "paymentImageLoader", "Lu0a0;", "paymentIconInfoFactory", "<init>", "(Landroid/content/Context;Lpav;Lz0a0;Lu0a0;)V", "Landroid/widget/ImageView;", "imageView", "Llo51;", "yangoPayImage", "", "tintColor", "", "setYangoPayImage", "(Landroid/widget/ImageView;Llo51;I)Z", "Landroid/view/View;", "buttonView", "Landroid/widget/TextView;", "titleView", "Lcom/yandex/go/payments/yangopay/ui/YangoPayWidgetView$ButtonStyle;", "buttonStyle", "Lzy11;", "updateButtonStyle", "(Landroid/view/View;Landroid/widget/TextView;Lcom/yandex/go/payments/yangopay/ui/YangoPayWidgetView$ButtonStyle;)V", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "", "title", "bindTitle", "(Ljava/lang/CharSequence;)V", "subtitle", "bindSubtitle", "Lkdc;", "color", "setSubtitleColor", "(Lkdc;)V", "bindLeadImage", "(Llo51;)V", "bindTrailImage", "horizontalPadding", "setHorizontalPadding", "(I)V", "hideActionsContainer", "()V", "isChecked", "Lcom/yandex/go/payments/yangopay/ui/YangoPayWidgetView$SwitchStyle;", "style", "Lkotlin/Function0;", "clickListener", "Lcom/yandex/go/payments/yangopay/ui/YangoPayWidgetView$CheckboxPosition;", "checkboxPosition", "bindPaymentMethodSelector", "(ZLcom/yandex/go/payments/yangopay/ui/YangoPayWidgetView$SwitchStyle;Lsls;Lcom/yandex/go/payments/yangopay/ui/YangoPayWidgetView$CheckboxPosition;)V", "", "", "actions", "bindActions", "(Ljava/util/List;)V", "Lru/yandex/taxi/design/utils/DividerPosition;", "position", "Lru/yandex/taxi/design/utils/DividerType;", "type", "setDividers", "(Lru/yandex/taxi/design/utils/DividerPosition;Lru/yandex/taxi/design/utils/DividerType;)V", "disableMainContainer", "enableMainContainer", "Lko51;", "trailButton", "onTrailButtonClick", "bindTrailButton", "(Lko51;Lsls;)V", "Lpav;", "Lz0a0;", "Lu0a0;", "Lmfb;", "checkDrawableProvider", "Lmfb;", "Lvql;", "dividerDrawDelegate", "Lvql;", "largeHorizontalMarginActionButtons$delegate", "Li3y;", "getLargeHorizontalMarginActionButtons", "()I", "largeHorizontalMarginActionButtons", "smallHorizontalMarginActionButtons$delegate", "getSmallHorizontalMarginActionButtons", "smallHorizontalMarginActionButtons", "", "trailButtonCornerRadius$delegate", "getTrailButtonCornerRadius", "()F", "trailButtonCornerRadius", "Lcp51;", "binding", "Lcp51;", "Landroidx/core/view/AccessibilityDelegateCompat;", "externalAccessibilityDelegate", "Landroidx/core/view/AccessibilityDelegateCompat;", "SwitchStyle", "CheckboxPosition", "ButtonStyle", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class YangoPayWidgetView extends LinearLayout implements nwy0 {
    public static final int $stable = 8;
    private final cp51 binding;
    private final mfb checkDrawableProvider;
    private final vql dividerDrawDelegate;
    private final AccessibilityDelegateCompat externalAccessibilityDelegate;
    private final pav imageLoader;

    /* renamed from: largeHorizontalMarginActionButtons$delegate, reason: from kotlin metadata */
    private final i3y largeHorizontalMarginActionButtons;
    private final u0a0 paymentIconInfoFactory;
    private final z0a0 paymentImageLoader;

    /* renamed from: smallHorizontalMarginActionButtons$delegate, reason: from kotlin metadata */
    private final i3y smallHorizontalMarginActionButtons;

    /* renamed from: trailButtonCornerRadius$delegate, reason: from kotlin metadata */
    private final i3y trailButtonCornerRadius;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/yangopay/ui/YangoPayWidgetView$ButtonStyle;", "", "OUTLINE", "CONTROL", "OUTLINE_DISABLED", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class ButtonStyle {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ButtonStyle[] $VALUES;
        public static final ButtonStyle CONTROL;
        public static final ButtonStyle OUTLINE;
        public static final ButtonStyle OUTLINE_DISABLED;

        static {
            ButtonStyle buttonStyle = new ButtonStyle("OUTLINE", 0);
            OUTLINE = buttonStyle;
            ButtonStyle buttonStyle2 = new ButtonStyle("CONTROL", 1);
            CONTROL = buttonStyle2;
            ButtonStyle buttonStyle3 = new ButtonStyle("OUTLINE_DISABLED", 2);
            OUTLINE_DISABLED = buttonStyle3;
            ButtonStyle[] buttonStyleArr = {buttonStyle, buttonStyle2, buttonStyle3};
            $VALUES = buttonStyleArr;
            $ENTRIES = kotlin.enums.a.a(buttonStyleArr);
        }

        public static ButtonStyle valueOf(String str) {
            return (ButtonStyle) Enum.valueOf(ButtonStyle.class, str);
        }

        public static ButtonStyle[] values() {
            return (ButtonStyle[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/payments/yangopay/ui/YangoPayWidgetView$CheckboxPosition;", "", "MAIN", JCP.RAW_PREFIX, "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class CheckboxPosition {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ CheckboxPosition[] $VALUES;
        public static final CheckboxPosition MAIN;
        public static final CheckboxPosition NONE;

        static {
            CheckboxPosition checkboxPosition = new CheckboxPosition("MAIN", 0);
            MAIN = checkboxPosition;
            CheckboxPosition checkboxPosition2 = new CheckboxPosition(JCP.RAW_PREFIX, 1);
            NONE = checkboxPosition2;
            CheckboxPosition[] checkboxPositionArr = {checkboxPosition, checkboxPosition2};
            $VALUES = checkboxPositionArr;
            $ENTRIES = kotlin.enums.a.a(checkboxPositionArr);
        }

        public static CheckboxPosition valueOf(String str) {
            return (CheckboxPosition) Enum.valueOf(CheckboxPosition.class, str);
        }

        public static CheckboxPosition[] values() {
            return (CheckboxPosition[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/payments/yangopay/ui/YangoPayWidgetView$SwitchStyle;", "", "TOGGLE", "CHECK", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class SwitchStyle {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ SwitchStyle[] $VALUES;
        public static final SwitchStyle CHECK;
        public static final SwitchStyle TOGGLE;

        static {
            SwitchStyle switchStyle = new SwitchStyle("TOGGLE", 0);
            TOGGLE = switchStyle;
            SwitchStyle switchStyle2 = new SwitchStyle("CHECK", 1);
            CHECK = switchStyle2;
            SwitchStyle[] switchStyleArr = {switchStyle, switchStyle2};
            $VALUES = switchStyleArr;
            $ENTRIES = kotlin.enums.a.a(switchStyleArr);
        }

        public static SwitchStyle valueOf(String str) {
            return (SwitchStyle) Enum.valueOf(SwitchStyle.class, str);
        }

        public static SwitchStyle[] values() {
            return (SwitchStyle[]) $VALUES.clone();
        }
    }

    public YangoPayWidgetView(Context context, pav pavVar, z0a0 z0a0Var, u0a0 u0a0Var) {
        super(context);
        this.imageLoader = pavVar;
        this.paymentImageLoader = z0a0Var;
        this.paymentIconInfoFactory = u0a0Var;
        this.checkDrawableProvider = new mfb(context, null, xng0.listCheckBoxComponentStyle);
        this.dividerDrawDelegate = new vql(context, null, new jy31(14, this));
        final int i = 0;
        this.largeHorizontalMarginActionButtons = kotlin.a.a(new sls(this) { // from class: bp51
            public final /* synthetic */ YangoPayWidgetView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int largeHorizontalMarginActionButtons_delegate$lambda$0;
                int smallHorizontalMarginActionButtons_delegate$lambda$0;
                float trailButtonCornerRadius_delegate$lambda$0;
                int i2 = i;
                YangoPayWidgetView yangoPayWidgetView = this.b;
                switch (i2) {
                    case 0:
                        largeHorizontalMarginActionButtons_delegate$lambda$0 = YangoPayWidgetView.largeHorizontalMarginActionButtons_delegate$lambda$0(yangoPayWidgetView);
                        return Integer.valueOf(largeHorizontalMarginActionButtons_delegate$lambda$0);
                    case 1:
                        smallHorizontalMarginActionButtons_delegate$lambda$0 = YangoPayWidgetView.smallHorizontalMarginActionButtons_delegate$lambda$0(yangoPayWidgetView);
                        return Integer.valueOf(smallHorizontalMarginActionButtons_delegate$lambda$0);
                    default:
                        trailButtonCornerRadius_delegate$lambda$0 = YangoPayWidgetView.trailButtonCornerRadius_delegate$lambda$0(yangoPayWidgetView);
                        return Float.valueOf(trailButtonCornerRadius_delegate$lambda$0);
                }
            }
        });
        final int i2 = 1;
        this.smallHorizontalMarginActionButtons = kotlin.a.a(new sls(this) { // from class: bp51
            public final /* synthetic */ YangoPayWidgetView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int largeHorizontalMarginActionButtons_delegate$lambda$0;
                int smallHorizontalMarginActionButtons_delegate$lambda$0;
                float trailButtonCornerRadius_delegate$lambda$0;
                int i22 = i2;
                YangoPayWidgetView yangoPayWidgetView = this.b;
                switch (i22) {
                    case 0:
                        largeHorizontalMarginActionButtons_delegate$lambda$0 = YangoPayWidgetView.largeHorizontalMarginActionButtons_delegate$lambda$0(yangoPayWidgetView);
                        return Integer.valueOf(largeHorizontalMarginActionButtons_delegate$lambda$0);
                    case 1:
                        smallHorizontalMarginActionButtons_delegate$lambda$0 = YangoPayWidgetView.smallHorizontalMarginActionButtons_delegate$lambda$0(yangoPayWidgetView);
                        return Integer.valueOf(smallHorizontalMarginActionButtons_delegate$lambda$0);
                    default:
                        trailButtonCornerRadius_delegate$lambda$0 = YangoPayWidgetView.trailButtonCornerRadius_delegate$lambda$0(yangoPayWidgetView);
                        return Float.valueOf(trailButtonCornerRadius_delegate$lambda$0);
                }
            }
        });
        final int i3 = 2;
        this.trailButtonCornerRadius = kotlin.a.a(new sls(this) { // from class: bp51
            public final /* synthetic */ YangoPayWidgetView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int largeHorizontalMarginActionButtons_delegate$lambda$0;
                int smallHorizontalMarginActionButtons_delegate$lambda$0;
                float trailButtonCornerRadius_delegate$lambda$0;
                int i22 = i3;
                YangoPayWidgetView yangoPayWidgetView = this.b;
                switch (i22) {
                    case 0:
                        largeHorizontalMarginActionButtons_delegate$lambda$0 = YangoPayWidgetView.largeHorizontalMarginActionButtons_delegate$lambda$0(yangoPayWidgetView);
                        return Integer.valueOf(largeHorizontalMarginActionButtons_delegate$lambda$0);
                    case 1:
                        smallHorizontalMarginActionButtons_delegate$lambda$0 = YangoPayWidgetView.smallHorizontalMarginActionButtons_delegate$lambda$0(yangoPayWidgetView);
                        return Integer.valueOf(smallHorizontalMarginActionButtons_delegate$lambda$0);
                    default:
                        trailButtonCornerRadius_delegate$lambda$0 = YangoPayWidgetView.trailButtonCornerRadius_delegate$lambda$0(yangoPayWidgetView);
                        return Float.valueOf(trailButtonCornerRadius_delegate$lambda$0);
                }
            }
        });
        LayoutInflater.from(context).inflate(luh0.yango_pay_widget_view, this);
        int i4 = e6h0.yango_pay_actions_container;
        GridLayout gridLayout = (GridLayout) cma1.O(i4, this);
        if (gridLayout != null) {
            i4 = e6h0.yango_pay_checkbox;
            CheckBoxComponent checkBoxComponent = (CheckBoxComponent) cma1.O(i4, this);
            if (checkBoxComponent != null) {
                i4 = e6h0.yango_pay_lead_image;
                ImageView imageView = (ImageView) cma1.O(i4, this);
                if (imageView != null) {
                    i4 = e6h0.yango_pay_main_container;
                    ConstraintLayout constraintLayout = (ConstraintLayout) cma1.O(i4, this);
                    if (constraintLayout != null) {
                        i4 = e6h0.yango_pay_subtitle;
                        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i4, this);
                        if (robotoTextView != null) {
                            i4 = e6h0.yango_pay_switch;
                            SwitchComponent switchComponent = (SwitchComponent) cma1.O(i4, this);
                            if (switchComponent != null) {
                                i4 = e6h0.yango_pay_title;
                                RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i4, this);
                                if (robotoTextView2 != null) {
                                    i4 = e6h0.yango_pay_trail_image;
                                    ImageView imageView2 = (ImageView) cma1.O(i4, this);
                                    if (imageView2 != null) {
                                        i4 = e6h0.yango_trail_button;
                                        RobotoTextView robotoTextView3 = (RobotoTextView) cma1.O(i4, this);
                                        if (robotoTextView3 != null) {
                                            this.binding = new cp51(this, gridLayout, checkBoxComponent, imageView, constraintLayout, robotoTextView, switchComponent, robotoTextView2, imageView2, robotoTextView3);
                                            AccessibilityDelegateCompat defaultAccessibilityDelegate = checkBoxComponent.getDefaultAccessibilityDelegate();
                                            this.externalAccessibilityDelegate = defaultAccessibilityDelegate;
                                            setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                                            setOrientation(1);
                                            androidx.core.view.b.p(this, defaultAccessibilityDelegate);
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i4)));
        throw null;
    }

    private final int getLargeHorizontalMarginActionButtons() {
        return ((Number) this.largeHorizontalMarginActionButtons.getValue()).intValue();
    }

    private final int getSmallHorizontalMarginActionButtons() {
        return ((Number) this.smallHorizontalMarginActionButtons.getValue()).intValue();
    }

    private final float getTrailButtonCornerRadius() {
        return ((Number) this.trailButtonCornerRadius.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int largeHorizontalMarginActionButtons_delegate$lambda$0(YangoPayWidgetView yangoPayWidgetView) {
        return (int) c.j(10, yangoPayWidgetView);
    }

    private final boolean setYangoPayImage(ImageView imageView, lo51 yangoPayImage, int tintColor) {
        if (yangoPayImage == null) {
            return false;
        }
        if (yangoPayImage.equals(q501.w)) {
            imageView.setImageDrawable(null);
            return false;
        }
        w511.b();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int smallHorizontalMarginActionButtons_delegate$lambda$0(YangoPayWidgetView yangoPayWidgetView) {
        return (int) c.j(4, yangoPayWidgetView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float trailButtonCornerRadius_delegate$lambda$0(YangoPayWidgetView yangoPayWidgetView) {
        return c.j(16, yangoPayWidgetView);
    }

    private final void updateButtonStyle(View buttonView, TextView titleView, ButtonStyle buttonStyle) {
        int t;
        int t2;
        Integer valueOf;
        int[] iArr = b.c;
        int i = iArr[buttonStyle.ordinal()];
        if (i == 1) {
            t = qje.t(xng0.textMain, getContext());
        } else if (i == 2) {
            t = qje.t(xng0.textOnControl, getContext());
        } else {
            if (i != 3) {
                w511.b();
                return;
            }
            t = lhc.f(qje.t(xng0.textOnControlMinor, getContext()), 29);
        }
        titleView.setTextColor(t);
        int i2 = iArr[buttonStyle.ordinal()];
        if (i2 == 1) {
            t2 = qje.t(xng0.controlMinor, getContext());
        } else if (i2 == 2) {
            t2 = qje.t(xng0.controlMain, getContext());
        } else {
            if (i2 != 3) {
                w511.b();
                return;
            }
            t2 = lhc.f(qje.t(xng0.controlMinor, getContext()), 13);
        }
        int i3 = iArr[buttonStyle.ordinal()];
        if (i3 != 1) {
            valueOf = null;
            if (i3 != 2 && i3 != 3) {
                w511.b();
                return;
            }
        } else {
            valueOf = Integer.valueOf(lhc.f(~t2, 26));
        }
        w0d w0dVar = new w0d();
        if (buttonStyle != ButtonStyle.OUTLINE_DISABLED) {
            w0dVar.g = true;
        }
        w0dVar.a = t2;
        w0dVar.h = getTrailButtonCornerRadius();
        w0dVar.b = qje.t(xng0.line, getContext());
        w0dVar.e = valueOf;
        buttonView.setBackground(w0dVar.a());
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        this.dividerDrawDelegate.b(getContext());
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    public final void bindActions(List<Object> actions) {
        this.binding.b.removeAllViewsInLayout();
        LayoutInflater from = LayoutInflater.from(getContext());
        Iterator<T> it = actions.iterator();
        if (it.hasNext()) {
            b64.D(it.next());
            from.inflate(luh0.yango_pay_widget_action_view, (ViewGroup) null);
            throw null;
        }
    }

    public final void bindLeadImage(lo51 yangoPayImage) {
        setYangoPayImage(this.binding.d, yangoPayImage, xng0.textMain);
    }

    public final void bindPaymentMethodSelector(boolean isChecked, SwitchStyle style, sls clickListener, CheckboxPosition checkboxPosition) {
        int i = b.b[checkboxPosition.ordinal()];
        if (i != 1) {
            if (i != 2) {
                w511.b();
                return;
            } else {
                this.binding.g.setVisibility(8);
                this.binding.c.setVisibility(8);
                return;
            }
        }
        int i2 = b.a[style.ordinal()];
        if (i2 == 1) {
            this.binding.g.setVisibility(0);
            c.z(clickListener, this.binding.g);
            this.binding.g.setChecked(isChecked);
        } else {
            if (i2 != 2) {
                w511.b();
                return;
            }
            this.binding.c.setVisibility(0);
            c.z(clickListener, this.binding.c);
            this.binding.c.setChecked(isChecked);
            mfb mfbVar = this.checkDrawableProvider;
            this.binding.c.setImageDrawable(isChecked ? mfbVar.a() : mfbVar.b());
        }
    }

    public final void bindSubtitle(CharSequence subtitle) {
        this.binding.f.setText(subtitle);
        this.binding.f.setVisibility((subtitle == null || evu0.J(subtitle)) ? 8 : 0);
    }

    public final void bindTitle(CharSequence title) {
        this.binding.h.setText(title);
    }

    public final void bindTrailButton(ko51 trailButton, sls onTrailButtonClick) {
        this.binding.j.setVisibility(8);
    }

    public final void bindTrailImage(lo51 yangoPayImage) {
        setYangoPayImage(this.binding.i, yangoPayImage, xng0.textMain);
    }

    public final void disableMainContainer() {
        this.binding.e.setAlpha(0.5f);
        this.binding.c.setEnabled(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.dividerDrawDelegate.a(canvas);
    }

    public final void enableMainContainer() {
        this.binding.e.setAlpha(1.0f);
        this.binding.c.setEnabled(true);
    }

    public final void hideActionsContainer() {
        this.binding.b.setVisibility(8);
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.dividerDrawDelegate.d(w, h);
    }

    public final void setDividers(DividerPosition position, DividerType type) {
        this.dividerDrawDelegate.e(position, type);
    }

    public final void setHorizontalPadding(int horizontalPadding) {
        this.binding.e.setPadding(horizontalPadding, 0, horizontalPadding, 0);
        this.binding.b.setPadding(horizontalPadding, 0, horizontalPadding, 0);
    }

    public final void setSubtitleColor(kdc color) {
        this.binding.f.setTextColor(color);
    }
}
