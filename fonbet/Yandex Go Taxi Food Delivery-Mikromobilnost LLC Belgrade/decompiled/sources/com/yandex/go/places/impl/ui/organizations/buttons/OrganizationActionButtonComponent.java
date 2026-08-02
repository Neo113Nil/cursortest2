package com.yandex.go.places.impl.ui.organizations.buttons;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.places.impl.domain.entities.organizations.OrganizationPreviewCardButtonType;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.bm50;
import defpackage.eja1;
import defpackage.fk1;
import defpackage.g18;
import defpackage.k4o;
import defpackage.k7v;
import defpackage.kdc;
import defpackage.lhc;
import defpackage.mia1;
import defpackage.mrg0;
import defpackage.nac;
import defpackage.ofv;
import defpackage.pav;
import defpackage.qje;
import defpackage.s8o;
import defpackage.sj80;
import defpackage.tje;
import defpackage.tls;
import defpackage.up11;
import defpackage.w511;
import defpackage.xng0;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001/B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001b\u001a\u00020\u001a2\b\b\u0001\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010\"\u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001e2\b\b\u0001\u0010 \u001a\u00020\bH\u0002¢\u0006\u0004\b\"\u0010#J)\u0010)\u001a\u00020\f2\u0006\u0010%\u001a\u00020$2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\f0&¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+R\u0018\u0010-\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, d2 = {"Lcom/yandex/go/places/impl/ui/organizations/buttons/OrganizationActionButtonComponent;", "Lcom/yandex/go/design/view/GoLinearLayout;", "Landroid/content/Context;", "context", "Lpav;", "imageLoader", "<init>", "(Landroid/content/Context;Lpav;)V", "", "baseColor", "", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "Lzy11;", "applyRippleBackground", "(IF)V", "color", "Landroid/graphics/drawable/Drawable;", "createDrawable", "(FI)Landroid/graphics/drawable/Drawable;", "Lcom/yandex/go/places/impl/ui/organizations/buttons/OrganizationActionButtonComponent$ButtonStyle;", "style", "applyDimensions", "(Lcom/yandex/go/places/impl/ui/organizations/buttons/OrganizationActionButtonComponent$ButtonStyle;)V", "tintColor", "", "imageUrl", "Landroid/widget/ImageView;", "createIconView", "(ILjava/lang/String;)Landroid/widget/ImageView;", "title", "", "hasIcon", "textColor", "Lru/yandex/taxi/widget/RobotoTextView;", "createTextView", "(Ljava/lang/String;ZI)Lru/yandex/taxi/widget/RobotoTextView;", "Lsj80;", Constants.KEY_DATA, "Lkotlin/Function1;", "Lfr;", "actionHandler", "bind", "(Lsj80;Ltls;)V", "Lpav;", "Lg18;", "iconLoadCancellable", "Lg18;", "ButtonStyle", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OrganizationActionButtonComponent extends GoLinearLayout {
    public static final int $stable = 8;
    private g18 iconLoadCancellable;
    private final pav imageLoader;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006j\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/yandex/go/places/impl/ui/organizations/buttons/OrganizationActionButtonComponent$ButtonStyle;", "", "", "backgroundAttr", CA20Status.STATUS_USER_I, "a", "()I", "textColorAttr", "c", "horizontalPaddingRes", "b", "LEAD", "SECONDARY", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class ButtonStyle {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ButtonStyle[] $VALUES;
        public static final ButtonStyle LEAD;
        public static final ButtonStyle SECONDARY;
        private final int backgroundAttr;
        private final int horizontalPaddingRes;
        private final int textColorAttr;

        static {
            ButtonStyle buttonStyle = new ButtonStyle(0, xng0.controlMain, xng0.textOnControl, mrg0.go_design_m_space, "LEAD");
            LEAD = buttonStyle;
            ButtonStyle buttonStyle2 = new ButtonStyle(1, xng0.controlMinor, xng0.textMain, mrg0.go_design_s_space, "SECONDARY");
            SECONDARY = buttonStyle2;
            ButtonStyle[] buttonStyleArr = {buttonStyle, buttonStyle2};
            $VALUES = buttonStyleArr;
            $ENTRIES = kotlin.enums.a.a(buttonStyleArr);
        }

        public ButtonStyle(int i, int i2, int i3, int i4, String str) {
            this.backgroundAttr = i2;
            this.textColorAttr = i3;
            this.horizontalPaddingRes = i4;
        }

        public static ButtonStyle valueOf(String str) {
            return (ButtonStyle) Enum.valueOf(ButtonStyle.class, str);
        }

        public static ButtonStyle[] values() {
            return (ButtonStyle[]) $VALUES.clone();
        }

        /* renamed from: a, reason: from getter */
        public final int getBackgroundAttr() {
            return this.backgroundAttr;
        }

        /* renamed from: b, reason: from getter */
        public final int getHorizontalPaddingRes() {
            return this.horizontalPaddingRes;
        }

        /* renamed from: c, reason: from getter */
        public final int getTextColorAttr() {
            return this.textColorAttr;
        }
    }

    public OrganizationActionButtonComponent(Context context, pav pavVar) {
        super(context, null, 0, 0, 14, null);
        this.imageLoader = pavVar;
        setOrientation(0);
        setGravity(17);
        setLayoutParams(new LinearLayout.LayoutParams(-2, tje.u(40, getContext())));
    }

    private final void applyDimensions(ButtonStyle style) {
        int i = a.b[style.ordinal()];
        if (i == 1) {
            setMinimumWidth(tje.u(SubsamplingScaleImageView.ORIENTATION_180, getContext()));
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            c.D(tje.u(40, getContext()), getLayoutParams().height, this);
        }
        int r = tje.r(style.getHorizontalPaddingRes(), getContext());
        int r2 = tje.r(mrg0.go_design_s_space, getContext());
        setPadding(r, r2, r, r2);
    }

    private final void applyRippleBackground(int baseColor, float cornerRadius) {
        setBackground(new RippleDrawable(ColorStateList.valueOf(lhc.c(baseColor) < 0.75d ? Color.argb(225, 255, 255, 255) : Color.argb(225, 0, 0, 0)), createDrawable(cornerRadius, baseColor), createDrawable(cornerRadius, -1)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 bind$lambda$2(tls tlsVar, sj80 sj80Var) {
        tlsVar.invoke(sj80Var.g);
        return zy11.a;
    }

    private final Drawable createDrawable(float cornerRadius, int color) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(color);
        gradientDrawable.setCornerRadius(cornerRadius);
        return gradientDrawable;
    }

    private final ImageView createIconView(int tintColor, String imageUrl) {
        ImageView imageView = new ImageView(getContext());
        int u = tje.u(20, imageView.getContext());
        imageView.setLayoutParams(new LinearLayout.LayoutParams(u, u));
        imageView.setColorFilter(tintColor);
        nac nacVar = (nac) this.imageLoader.a(imageView);
        nacVar.f(u, u);
        nacVar.g(ofv.a);
        nacVar.i = new fk1(imageView, 1);
        this.iconLoadCancellable = nacVar.c(imageUrl);
        return imageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 createIconView$lambda$0$0(ImageView imageView) {
        imageView.setVisibility(8);
        return zy11.a;
    }

    private final RobotoTextView createTextView(String title, boolean hasIcon, int textColor) {
        RobotoTextView robotoTextView = new RobotoTextView(getContext(), null, 0, 6, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        if (hasIcon) {
            layoutParams.setMarginStart(tje.r(mrg0.go_design_s_space, robotoTextView.getContext()));
        }
        robotoTextView.setLayoutParams(layoutParams);
        robotoTextView.setText(title);
        robotoTextView.setTextSize(13.0f);
        int[] iArr = up11.a;
        robotoTextView.setTypeface(eja1.w(3, 0));
        robotoTextView.setTextColor(textColor);
        return robotoTextView;
    }

    public final void bind(sj80 data, tls actionHandler) {
        ButtonStyle buttonStyle;
        g18 g18Var = this.iconLoadCancellable;
        if (g18Var != null) {
            g18Var.cancel();
        }
        removeAllViews();
        OrganizationPreviewCardButtonType organizationPreviewCardButtonType = data.f;
        k7v k7vVar = data.b;
        int i = a.a[organizationPreviewCardButtonType.ordinal()];
        if (i == 1) {
            buttonStyle = ButtonStyle.LEAD;
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            buttonStyle = ButtonStyle.SECONDARY;
        }
        kdc kdcVar = data.c;
        applyRippleBackground(kdcVar != null ? s8o.m(kdcVar, getContext()) : qje.t(buttonStyle.getBackgroundAttr(), getContext()), tje.u(13, getContext()));
        applyDimensions(buttonStyle);
        int t = qje.t(buttonStyle.getTextColorAttr(), getContext());
        if (k7vVar != null) {
            addView(createIconView(t, k7vVar.a));
        }
        String str = data.a;
        if (str != null) {
            addView(createTextView(str, k7vVar != null, t));
        }
        c.z(new bm50(10, actionHandler, data), this);
        setEnabled(data.e);
        setContentDescription(data.d);
        mia1.c(this);
    }
}
