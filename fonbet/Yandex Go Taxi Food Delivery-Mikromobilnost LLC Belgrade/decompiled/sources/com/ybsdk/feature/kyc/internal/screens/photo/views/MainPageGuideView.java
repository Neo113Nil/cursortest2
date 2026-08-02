package com.ybsdk.feature.kyc.internal.screens.photo.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.a800;
import defpackage.b800;
import defpackage.cbh0;
import defpackage.cma1;
import defpackage.jnh0;
import defpackage.ny61;
import defpackage.ta61;
import defpackage.v4b1;
import defpackage.xty0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/ybsdk/feature/kyc/internal/screens/photo/views/MainPageGuideView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lb800;", ClidProvider.STATE, "Lzy11;", "render", "(Lb800;)V", "Lta61;", "binding", "Lta61;", "feature-kyc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MainPageGuideView extends ConstraintLayout {
    private final ta61 binding;

    public MainPageGuideView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(jnh0.ybsdk_view_double_photo_example, this);
        int i2 = cbh0.description;
        TextView textView = (TextView) cma1.O(i2, this);
        if (textView != null) {
            i2 = cbh0.imageLeft;
            AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i2, this);
            if (appCompatImageView != null) {
                i2 = cbh0.imageLeftDescription;
                TextView textView2 = (TextView) cma1.O(i2, this);
                if (textView2 != null) {
                    i2 = cbh0.imageLeftDescriptionIcon;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) cma1.O(i2, this);
                    if (appCompatImageView2 != null) {
                        i2 = cbh0.imageRight;
                        AppCompatImageView appCompatImageView3 = (AppCompatImageView) cma1.O(i2, this);
                        if (appCompatImageView3 != null) {
                            i2 = cbh0.imageRightDescription;
                            TextView textView3 = (TextView) cma1.O(i2, this);
                            if (textView3 != null) {
                                i2 = cbh0.imageRightDescriptionIcon;
                                AppCompatImageView appCompatImageView4 = (AppCompatImageView) cma1.O(i2, this);
                                if (appCompatImageView4 != null) {
                                    i2 = cbh0.title;
                                    TextView textView4 = (TextView) cma1.O(i2, this);
                                    if (textView4 != null) {
                                        this.binding = new ta61(this, textView, appCompatImageView, textView2, appCompatImageView2, appCompatImageView3, textView3, appCompatImageView4, textView4);
                                        return;
                                    }
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

    public final void render(b800 state) {
        xty0.d(this.binding.i, state.a);
        xty0.d(this.binding.b, state.b);
        TextView textView = this.binding.d;
        a800 a800Var = state.c;
        xty0.d(textView, a800Var.b);
        v4b1.k(a800Var.a, this.binding.c, null, null, 6);
        v4b1.k(a800Var.c, this.binding.e, null, null, 6);
        TextView textView2 = this.binding.g;
        a800 a800Var2 = state.d;
        xty0.d(textView2, a800Var2.b);
        v4b1.k(a800Var2.a, this.binding.f, null, null, 6);
        v4b1.k(a800Var2.c, this.binding.h, null, null, 6);
    }

    public MainPageGuideView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ MainPageGuideView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public MainPageGuideView(Context context) {
        this(context, null, 0, 6, null);
    }
}
