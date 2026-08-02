package com.ybsdk.feature.qr.payments.internal.screens.presentation.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.ybsdk.core.design.spoiler.SpoilerTextView;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.widgets.common.CloseButtonView;
import defpackage.cma1;
import defpackage.hbv;
import defpackage.lfv;
import defpackage.njb;
import defpackage.ny61;
import defpackage.pbh0;
import defpackage.q161;
import defpackage.sls;
import defpackage.v4b1;
import defpackage.znh0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0012\u001a\u00020\u00102\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/screens/presentation/view/ImageToolbarView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Llfv;", ClidProvider.STATE, "Lhbv;", "render", "(Llfv;)Lhbv;", "Lkotlin/Function0;", "Lzy11;", "listener", "setOnCloseButtonClickListener", "(Lsls;)V", "Lq161;", "getBinding", "()Lq161;", "binding", "Lq161;", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ImageToolbarView extends ConstraintLayout {
    private final q161 binding;

    public ImageToolbarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(znh0.ybsdk_image_toolbar_view, this);
        int i2 = pbh0.imageToolbarCloseButton;
        CloseButtonView closeButtonView = (CloseButtonView) cma1.O(i2, this);
        if (closeButtonView != null) {
            i2 = pbh0.imageToolbarLeftImage;
            ImageView imageView = (ImageView) cma1.O(i2, this);
            if (imageView != null) {
                i2 = pbh0.imageToolbarSubtitleText;
                AppCompatTextView appCompatTextView = (AppCompatTextView) cma1.O(i2, this);
                if (appCompatTextView != null) {
                    i2 = pbh0.imageToolbarTitleImage;
                    ImageView imageView2 = (ImageView) cma1.O(i2, this);
                    if (imageView2 != null) {
                        i2 = pbh0.imageToolbarTitleText;
                        SpoilerTextView spoilerTextView = (SpoilerTextView) cma1.O(i2, this);
                        if (spoilerTextView != null) {
                            i2 = pbh0.toolbarTitleLeftImage;
                            ImageView imageView3 = (ImageView) cma1.O(i2, this);
                            if (imageView3 != null) {
                                i2 = pbh0.ybSdkGuideline;
                                if (((Guideline) cma1.O(i2, this)) != null) {
                                    this.binding = new q161(this, closeButtonView, imageView, appCompatTextView, imageView2, spoilerTextView, imageView3);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setOnCloseButtonClickListener$lambda$3(sls slsVar, View view) {
        if (slsVar != null) {
            slsVar.invoke();
        }
    }

    public final q161 getBinding() {
        return this.binding;
    }

    public final hbv render(lfv state) {
        CharSequence a;
        CharSequence a2;
        q161 q161Var = this.binding;
        v4b1.k(state.b, q161Var.c, null, null, 6);
        v4b1.k(state.a, q161Var.e, null, null, 6);
        Text text = state.c;
        if (text != null && (a2 = d.a(getContext(), text)) != null) {
            q161Var.f.setText(a2);
        }
        Text text2 = state.e;
        if (text2 != null && (a = d.a(getContext(), text2)) != null) {
            q161Var.d.setText(a);
        }
        return v4b1.k(state.d, q161Var.g, null, null, 6);
    }

    public final void setOnCloseButtonClickListener(sls listener) {
        this.binding.b.setOnClickListener(new njb(13, listener));
    }

    public ImageToolbarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ ImageToolbarView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public ImageToolbarView(Context context) {
        this(context, null, 0, 6, null);
    }
}
