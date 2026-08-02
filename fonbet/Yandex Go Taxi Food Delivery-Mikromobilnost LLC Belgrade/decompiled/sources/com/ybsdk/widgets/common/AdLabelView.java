package com.ybsdk.widgets.common;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.core.utils.ColorModel;
import defpackage.cma1;
import defpackage.cz2;
import defpackage.fch0;
import defpackage.k5;
import defpackage.lwg0;
import defpackage.ny61;
import defpackage.nyg0;
import defpackage.p60;
import defpackage.poh0;
import defpackage.rbv;
import defpackage.sm91;
import defpackage.sz51;
import defpackage.tls;
import defpackage.v4b1;
import defpackage.xty0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u00020\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f0\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/ybsdk/widgets/common/AdLabelView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lp60;", ClidProvider.STATE, "Lzy11;", "render", "(Lp60;)Lzy11;", "Lkotlin/Function1;", "", "listener", "setOnAdLabelClickListener", "(Ltls;)V", "Lsz51;", "binding", "Lsz51;", "currentState", "Lp60;", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AdLabelView extends ConstraintLayout {
    private final sz51 binding;
    private p60 currentState;

    public AdLabelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(poh0.ybsdk_ad_label_view, this);
        int i2 = fch0.adLabelIcon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i2, this);
        if (appCompatImageView != null) {
            i2 = fch0.adLabelText;
            TextView textView = (TextView) cma1.O(i2, this);
            if (textView != null) {
                this.binding = new sz51(this, appCompatImageView, textView);
                setMinHeight(getResources().getDimensionPixelSize(lwg0.ybsdk_ad_label_height));
                setBackground(context.getDrawable(nyg0.ybsdk_ad_label_background));
                setImportantForAccessibility(1);
                return;
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setOnAdLabelClickListener$lambda$3(AdLabelView adLabelView, tls tlsVar, View view) {
        String str;
        p60 p60Var = adLabelView.currentState;
        if (p60Var == null || (str = p60Var.b) == null) {
            return;
        }
        tlsVar.invoke(str);
    }

    public final zy11 render(p60 state) {
        sz51 sz51Var = this.binding;
        this.currentState = state;
        TextView textView = sz51Var.c;
        String str = state.a;
        textView.setText(str);
        setContentDescription(str);
        AppCompatImageView appCompatImageView = sz51Var.b;
        rbv rbvVar = state.c;
        appCompatImageView.setVisibility(rbvVar != null ? 0 : 8);
        if (rbvVar != null) {
            v4b1.k(rbvVar, appCompatImageView, null, null, 6);
        }
        ColorModel colorModel = state.d;
        if (colorModel != null) {
            xty0.e(sz51Var.c, colorModel);
            com.ybsdk.core.utils.ext.view.b.z(appCompatImageView, colorModel.get(sm91.c(sz51Var)));
        }
        ColorModel colorModel2 = state.e;
        if (colorModel2 != null) {
            int i = colorModel2.get(sm91.c(sz51Var));
            Drawable background = getBackground();
            GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
            if (gradientDrawable != null) {
                gradientDrawable.setColor(i);
                return zy11.a;
            }
        }
        return null;
    }

    public final void setOnAdLabelClickListener(tls listener) {
        setOnClickListener(new k5(3, this, listener));
        setOnTouchListener(new cz2(14));
    }

    public AdLabelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ AdLabelView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public AdLabelView(Context context) {
        this(context, null, 0, 6, null);
    }
}
