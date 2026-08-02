package com.yandex.go.places.common.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.dzg0;
import defpackage.nwy0;
import defpackage.qje;
import defpackage.sls;
import defpackage.vng;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.ytg0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0019\u001a\u00020\u000b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\rJ\u0017\u0010\u001d\u001a\u00020\u000b2\b\b\u0001\u0010\u001c\u001a\u00020\u0007¢\u0006\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/yandex/go/places/common/ui/ControlButtonView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Lnwy0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "applyThemeBackground", "()V", "updateIconTint", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Lkotlin/Function0;", "listener", "setOnControlButtonClicked", "(Lsls;)V", "setMirrorForRtl", "tintAttr", "setIconTintAttr", "(I)V", "iconTintAttr", CA20Status.STATUS_USER_I, "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ControlButtonView extends AppCompatImageView implements nwy0 {
    private int iconTintAttr;

    public ControlButtonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.iconTintAttr = xng0.textMain;
        setScaleType(ImageView.ScaleType.FIT_CENTER);
        int dimensionPixelSize = getResources().getDimensionPixelSize(ytg0.discovery_map_control_button_padding);
        setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        applyThemeBackground();
        updateIconTint();
    }

    private final void applyThemeBackground() {
        setBackground(vng.t(dzg0.fab_component, getContext()));
        setBackgroundTintList(ColorStateList.valueOf(qje.t(xng0.bgFloating, getContext())));
    }

    private final void updateIconTint() {
        setImageTintList(ColorStateList.valueOf(qje.t(this.iconTintAttr, getContext())));
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        applyThemeBackground();
        updateIconTint();
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getResources().getDimensionPixelSize(ytg0.discovery_map_control_button_size), 1073741824);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public final void setIconTintAttr(int tintAttr) {
        this.iconTintAttr = tintAttr;
        updateIconTint();
    }

    public final void setMirrorForRtl() {
        setScaleX(xw31.n(getContext()) ? -1.0f : 1.0f);
    }

    public final void setOnControlButtonClicked(sls listener) {
        c.z(listener, this);
    }

    public ControlButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ControlButtonView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ ControlButtonView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
