package com.ybsdk.widgets.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import defpackage.aks;
import defpackage.bks;
import defpackage.cma1;
import defpackage.fch0;
import defpackage.g8e;
import defpackage.ibv;
import defpackage.njb;
import defpackage.ny61;
import defpackage.p161;
import defpackage.poh0;
import defpackage.sls;
import defpackage.sm91;
import defpackage.v4b1;
import defpackage.w3i0;
import defpackage.zvr;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\u00020\f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000f¢\u0006\u0004\b\u0013\u0010\u0012J\u001d\u0010\u0014\u001a\u00020\f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000f¢\u0006\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/ybsdk/widgets/common/FullscreenStatusView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/ybsdk/widgets/common/e;", "newState", "Lzy11;", "render", "(Lcom/ybsdk/widgets/common/e;)Lzy11;", "Lkotlin/Function0;", "action", "setPrimaryButtonAction", "(Lsls;)V", "setSecondaryButtonAction", "setCloseButtonAction", "Lp161;", "binding", "Lp161;", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FullscreenStatusView extends ConstraintLayout {
    private final p161 binding;

    public FullscreenStatusView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        e cVar;
        LayoutInflater.from(context).inflate(poh0.ybsdk_fullscreen_status_view, this);
        int i2 = fch0.buttonClose;
        CloseButtonView closeButtonView = (CloseButtonView) cma1.O(i2, this);
        if (closeButtonView != null) {
            i2 = fch0.buttonsGroup;
            YbButtonViewGroup ybButtonViewGroup = (YbButtonViewGroup) cma1.O(i2, this);
            if (ybButtonViewGroup != null) {
                i2 = fch0.image;
                AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i2, this);
                if (appCompatImageView != null) {
                    i2 = fch0.imageBottomGuideline;
                    if (((Guideline) cma1.O(i2, this)) != null) {
                        i2 = fch0.progress;
                        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) cma1.O(i2, this);
                        if (circularProgressIndicator != null) {
                            i2 = fch0.subtitle;
                            AppCompatTextView appCompatTextView = (AppCompatTextView) cma1.O(i2, this);
                            if (appCompatTextView != null) {
                                i2 = fch0.textBarrier;
                                if (((Barrier) cma1.O(i2, this)) != null) {
                                    i2 = fch0.title;
                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) cma1.O(i2, this);
                                    if (appCompatTextView2 != null) {
                                        this.binding = new p161(this, closeButtonView, ybButtonViewGroup, appCompatImageView, circularProgressIndicator, appCompatTextView, appCompatTextView2);
                                        setClickable(true);
                                        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w3i0.YbSdkFullscreenStatusView, i, 0);
                                        String string = obtainStyledAttributes.getString(w3i0.YbSdkFullscreenStatusView_ybsdk_title);
                                        Text.Constant i3 = string != null ? g8e.i(Text.Companion, string) : null;
                                        String string2 = obtainStyledAttributes.getString(w3i0.YbSdkFullscreenStatusView_ybsdk_subtitle);
                                        Text.Constant i4 = string2 != null ? g8e.i(Text.Companion, string2) : null;
                                        boolean z = obtainStyledAttributes.getBoolean(w3i0.YbSdkFullscreenStatusView_ybsdk_close_button_visible, false);
                                        if (obtainStyledAttributes.getBoolean(w3i0.YbSdkFullscreenStatusView_ybsdk_progress_visible, false)) {
                                            cVar = new d(i3, i4, z);
                                        } else {
                                            Drawable drawable = obtainStyledAttributes.getDrawable(w3i0.YbSdkFullscreenStatusView_ybsdk_icon);
                                            bks bksVar = drawable != null ? new bks(new ibv(drawable), null, 6) : null;
                                            String string3 = obtainStyledAttributes.getString(w3i0.YbSdkFullscreenStatusView_ybsdk_primary_button_text);
                                            Text.Constant i5 = string3 != null ? g8e.i(Text.Companion, string3) : null;
                                            String string4 = obtainStyledAttributes.getString(w3i0.YbSdkFullscreenStatusView_ybsdk_secondary_button_text);
                                            cVar = new c(i3, i4, bksVar, z, i5, string4 != null ? g8e.i(Text.Companion, string4) : null);
                                        }
                                        render(cVar);
                                        obtainStyledAttributes.recycle();
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setCloseButtonAction$lambda$13(sls slsVar, View view) {
        if (slsVar != null) {
            slsVar.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setPrimaryButtonAction$lambda$11(sls slsVar) {
        if (slsVar != null) {
            slsVar.invoke();
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setSecondaryButtonAction$lambda$12(sls slsVar) {
        if (slsVar != null) {
            slsVar.invoke();
        }
        return zy11.a;
    }

    public final zy11 render(e newState) {
        boolean z = newState.c;
        p161 p161Var = this.binding;
        AppCompatTextView appCompatTextView = p161Var.g;
        YbButtonViewGroup ybButtonViewGroup = p161Var.c;
        AppCompatTextView appCompatTextView2 = p161Var.f;
        appCompatTextView.setVisibility(newState.e() != null ? 0 : 8);
        appCompatTextView2.setVisibility(newState.d() != null ? 0 : 8);
        p161Var.d.setVisibility((z || newState.c() == null) ? 8 : 0);
        p161Var.e.setVisibility(z ? 0 : 8);
        p161Var.b.setVisibility(newState.b() ? 0 : 8);
        ybButtonViewGroup.setVisibility(newState.a() != null ? 0 : 8);
        AppCompatTextView appCompatTextView3 = p161Var.g;
        Text e = newState.e();
        appCompatTextView3.setText(e != null ? com.ybsdk.core.utils.text.d.a(sm91.c(p161Var), e) : null);
        Text d = newState.d();
        appCompatTextView2.setText(d != null ? com.ybsdk.core.utils.text.d.a(sm91.c(p161Var), d) : null);
        bks c = newState.c();
        if (c != null) {
            if (z) {
                c = null;
            }
            if (c != null) {
                aks aksVar = c.b;
                this.binding.d.setScaleType(c.c);
                if (aksVar != null) {
                    AppCompatImageView appCompatImageView = this.binding.d;
                    ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
                    if (layoutParams == null) {
                        ny61.t("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        return null;
                    }
                    layoutParams.width = aksVar.a;
                    layoutParams.height = aksVar.b;
                    appCompatImageView.setLayoutParams(layoutParams);
                }
                v4b1.k(c.a, this.binding.d, null, null, 6);
            }
        }
        YbButtonViewGroup.b a = newState.a();
        if (a == null) {
            return null;
        }
        ybButtonViewGroup.render(a);
        return zy11.a;
    }

    public final void setCloseButtonAction(sls action) {
        this.binding.b.setOnClickListener(new njb(9, action));
    }

    public final void setPrimaryButtonAction(sls action) {
        this.binding.c.setPrimaryButtonOnClickListener(new zvr(3, action));
    }

    public final void setSecondaryButtonAction(sls action) {
        this.binding.c.setSecondaryButtonClickListener(new zvr(2, action));
    }

    public FullscreenStatusView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ FullscreenStatusView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public FullscreenStatusView(Context context) {
        this(context, null, 0, 6, null);
    }
}
