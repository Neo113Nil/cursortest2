package com.ybsdk.widgets.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import com.ybsdk.core.utils.ColorModel;
import defpackage.ams0;
import defpackage.kp50;
import defpackage.rje;
import defpackage.tls;
import defpackage.ung0;
import defpackage.w3i0;
import defpackage.yls0;
import defpackage.zls0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u001b2\u00020\u0001:\u0002\u000b\u001cB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000e\u001a\u00020\r2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/ybsdk/widgets/common/SkeletonView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/Function1;", "Lams0;", "update", "Lzy11;", "render", "(Ltls;)V", "Landroid/graphics/drawable/GradientDrawable;", "createBackground", "()Landroid/graphics/drawable/GradientDrawable;", "Lcom/ybsdk/core/utils/ColorModel;", "color", "setColor", "(Lcom/ybsdk/core/utils/ColorModel;)V", "defaultBackgroundColor", CA20Status.STATUS_USER_I, ClidProvider.STATE, "Lams0;", "Companion", "zls0", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SkeletonView extends View {
    private static final zls0 Companion = new zls0();
    private static final float defaultCornerRadius = kp50.r(4);
    private final int defaultBackgroundColor;
    private ams0 state;

    public SkeletonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int a = rje.a(context, ung0.ybColor_fill_default_100);
        this.defaultBackgroundColor = a;
        this.state = new ams0(defaultCornerRadius, 0, a);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, w3i0.YbSdkSkeletonView, 0, 0);
        render(new yls0(new ams0(com.ybsdk.core.utils.ext.view.b.v(obtainStyledAttributes, w3i0.YbSdkSkeletonView_ybsdk_cornerRadius, defaultCornerRadius), obtainStyledAttributes.getInt(w3i0.YbSdkSkeletonView_android_shape, 0), obtainStyledAttributes.getColor(w3i0.YbSdkSkeletonView_ybsdk_backgroundColor, a)), 1));
        obtainStyledAttributes.recycle();
    }

    private final GradientDrawable createBackground() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(this.state.a);
        gradientDrawable.setCornerRadius(this.state.b);
        gradientDrawable.setColor(this.state.c);
        return gradientDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ams0 lambda$1$lambda$0(ams0 ams0Var, ams0 ams0Var2) {
        return ams0Var;
    }

    private final void render(tls update) {
        this.state = (ams0) update.invoke(this.state);
        setBackground(createBackground());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ams0 setColor$lambda$2(ams0 ams0Var, ams0 ams0Var2) {
        return ams0Var;
    }

    public final void setColor(ColorModel color) {
        ams0 ams0Var = this.state;
        int i = color.get(getContext());
        render(new yls0(new ams0(ams0Var.b, ams0Var.a, i), 0));
    }

    public SkeletonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ SkeletonView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public SkeletonView(Context context) {
        this(context, null, 0, 6, null);
    }
}
