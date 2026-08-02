package com.ybsdk.widgets.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.ybsdk.core.utils.text.Text;
import defpackage.a161;
import defpackage.cma1;
import defpackage.fch0;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.poh0;
import defpackage.rbv;
import defpackage.v4b1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/ybsdk/widgets/common/DashboardDrawableTextView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "getOrientation", "()I", "Lrbv;", "imageModel", "Lzy11;", "setImage", "(Lrbv;)V", "Lcom/ybsdk/core/utils/text/Text;", "text", "setText", "(Lcom/ybsdk/core/utils/text/Text;)V", "La161;", "binding", "La161;", "getBinding", "()La161;", "lastImageModel", "Lrbv;", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DashboardDrawableTextView extends LinearLayout {
    private final a161 binding;
    private rbv lastImageModel;

    public DashboardDrawableTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(poh0.ybsdk_dashboard_drawable_text_view, this);
        int i = fch0.image;
        AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i, this);
        if (appCompatImageView != null) {
            i = fch0.productTitle;
            AppCompatTextView appCompatTextView = (AppCompatTextView) cma1.O(i, this);
            if (appCompatTextView != null) {
                this.binding = new a161(this, appCompatImageView, appCompatTextView);
                return;
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    public final a161 getBinding() {
        return this.binding;
    }

    @Override // android.widget.LinearLayout
    public int getOrientation() {
        return 0;
    }

    public final void setImage(rbv imageModel) {
        if (jl40.l(this.lastImageModel, imageModel)) {
            return;
        }
        this.lastImageModel = imageModel;
        v4b1.k(imageModel, this.binding.b, null, null, 6);
    }

    public final void setText(Text text) {
        this.binding.c.setText(com.ybsdk.core.utils.text.d.a(getContext(), text));
    }

    public /* synthetic */ DashboardDrawableTextView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DashboardDrawableTextView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }
}
