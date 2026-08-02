package com.ybsdk.feature.kyc.internal.screens.photo.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.anq0;
import defpackage.cbh0;
import defpackage.cma1;
import defpackage.jnh0;
import defpackage.ny61;
import defpackage.v4b1;
import defpackage.va61;
import defpackage.xty0;
import defpackage.zmq0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/ybsdk/feature/kyc/internal/screens/photo/views/SelfieGuideView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lanq0;", ClidProvider.STATE, "Lzy11;", "render", "(Lanq0;)V", "Lva61;", "binding", "Lva61;", "feature-kyc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SelfieGuideView extends ConstraintLayout {
    private final va61 binding;

    public SelfieGuideView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(jnh0.ybsdk_view_selfie_guide, this);
        int i2 = cbh0.description;
        TextView textView = (TextView) cma1.O(i2, this);
        if (textView != null) {
            i2 = cbh0.image;
            AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i2, this);
            if (appCompatImageView != null) {
                i2 = cbh0.infoList;
                LinearLayout linearLayout = (LinearLayout) cma1.O(i2, this);
                if (linearLayout != null) {
                    i2 = cbh0.title;
                    TextView textView2 = (TextView) cma1.O(i2, this);
                    if (textView2 != null) {
                        this.binding = new va61(this, textView, appCompatImageView, linearLayout, textView2);
                        return;
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public final void render(anq0 state) {
        xty0.d(this.binding.e, state.c);
        xty0.d(this.binding.b, state.d);
        v4b1.k(state.a, this.binding.c, null, null, 6);
        this.binding.d.removeAllViews();
        for (zmq0 zmq0Var : state.b) {
            LayoutInflater from = LayoutInflater.from(getContext());
            LinearLayout linearLayout = this.binding.d;
            View inflate = from.inflate(jnh0.ybsdk_view_info_point, (ViewGroup) linearLayout, false);
            linearLayout.addView(inflate);
            int i = cbh0.image;
            ImageView imageView = (ImageView) cma1.O(i, inflate);
            if (imageView != null) {
                i = cbh0.title;
                TextView textView = (TextView) cma1.O(i, inflate);
                if (textView != null) {
                    v4b1.k(zmq0Var.a, imageView, null, null, 6);
                    xty0.d(textView, zmq0Var.b);
                }
            }
            ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
            return;
        }
    }

    public SelfieGuideView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ SelfieGuideView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public SelfieGuideView(Context context) {
        this(context, null, 0, 6, null);
    }
}
