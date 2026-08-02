package com.ybsdk.widgets.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.ybsdk.core.utils.text.Text;
import defpackage.cma1;
import defpackage.fch0;
import defpackage.ntb;
import defpackage.ny61;
import defpackage.otb;
import defpackage.poh0;
import defpackage.r061;
import defpackage.sm91;
import defpackage.tja1;
import defpackage.v4b1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00142\u00020\u0001:\u0002\u0015\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/widgets/common/CircleButtonView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lotb;", ClidProvider.STATE, "Lzy11;", "configureTitle", "(Lotb;)V", "configureButtonContent", "render", "Lr061;", "binding", "Lr061;", "Companion", "ntb", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CircleButtonView extends ConstraintLayout {
    private static final ntb Companion = new ntb();

    @Deprecated
    public static final float DISABLED_ALPHA = 0.2f;

    @Deprecated
    public static final float ENABLED_ALPHA = 1.0f;
    private final r061 binding;

    public CircleButtonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(poh0.ybsdk_circle_button, this);
        int i2 = fch0.buttonTitle;
        AppCompatTextView appCompatTextView = (AppCompatTextView) cma1.O(i2, this);
        if (appCompatTextView != null) {
            i2 = fch0.circleButton;
            AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i2, this);
            if (appCompatImageView != null) {
                i2 = fch0.successState;
                if (((Group) cma1.O(i2, this)) != null) {
                    i2 = fch0.topTextLabel;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) cma1.O(i2, this);
                    if (appCompatTextView2 != null) {
                        this.binding = new r061(this, appCompatTextView, appCompatImageView, appCompatTextView2);
                        tja1.b(this);
                        return;
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    private final void configureButtonContent(otb state) {
        r061 r061Var = this.binding;
        v4b1.k(state.b, r061Var.c, null, null, 6);
        ntb ntbVar = Companion;
        AppCompatImageView appCompatImageView = r061Var.c;
        boolean z = state.d;
        ntbVar.getClass();
        appCompatImageView.setAlpha(z ? 1.0f : 0.2f);
    }

    private final void configureTitle(otb state) {
        AppCompatTextView appCompatTextView = this.binding.b;
        appCompatTextView.setText(com.ybsdk.core.utils.text.d.a(appCompatTextView.getContext(), state.c));
        ntb ntbVar = Companion;
        boolean z = state.d;
        ntbVar.getClass();
        appCompatTextView.setAlpha(z ? 1.0f : 0.2f);
    }

    public final void render(otb state) {
        r061 r061Var = this.binding;
        AppCompatTextView appCompatTextView = r061Var.d;
        Text.Constant constant = state.e;
        appCompatTextView.setText(constant != null ? com.ybsdk.core.utils.text.d.a(appCompatTextView.getContext(), constant) : null);
        appCompatTextView.setVisibility(constant != null ? 0 : 8);
        setContentDescription(com.ybsdk.core.utils.text.d.a(sm91.c(r061Var), state.c));
        configureTitle(state);
        configureButtonContent(state);
    }

    public CircleButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ CircleButtonView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public CircleButtonView(Context context) {
        this(context, null, 0, 6, null);
    }
}
