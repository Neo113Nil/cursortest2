package com.ybsdk.widgets.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.cma1;
import defpackage.fch0;
import defpackage.jbs0;
import defpackage.kp50;
import defpackage.ny61;
import defpackage.nyg0;
import defpackage.poh0;
import defpackage.q861;
import defpackage.sm91;
import defpackage.tls;
import defpackage.v4b1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\r\u001a\u00020\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u000f¢\u0006\u0004\b\r\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/ybsdk/widgets/common/SignOutButton;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ljbs0;", ClidProvider.STATE, "Lzy11;", "render", "(Ljbs0;)V", "Lkotlin/Function1;", "update", "(Ltls;)V", "currentState", "Ljbs0;", "Lq861;", "binding", "Lq861;", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SignOutButton extends LinearLayout {
    private final q861 binding;
    private jbs0 currentState;

    public SignOutButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(poh0.ybsdk_sign_out_button_layout, this);
        int i2 = fch0.avatar;
        AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i2, this);
        if (appCompatImageView != null) {
            i2 = fch0.username;
            TextView textView = (TextView) cma1.O(i2, this);
            if (textView != null) {
                this.binding = new q861(this, appCompatImageView, textView);
                return;
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public final void render(jbs0 state) {
        q861 q861Var = this.binding;
        TextView textView = q861Var.c;
        AppCompatImageView appCompatImageView = q861Var.b;
        textView.setText(com.ybsdk.core.utils.text.d.a(textView.getContext(), state.a));
        textView.setTextAppearance(state.c);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(kp50.r(state.b), marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        textView.setLayoutParams(marginLayoutParams);
        v4b1.k(state.e, appCompatImageView, null, null, 6);
        ViewGroup.LayoutParams layoutParams2 = appCompatImageView.getLayoutParams();
        if (layoutParams2 == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            return;
        }
        int r = kp50.r(state.d);
        layoutParams2.width = r;
        layoutParams2.height = r;
        appCompatImageView.setLayoutParams(layoutParams2);
        setBackground(sm91.c(q861Var).getDrawable(nyg0.ybsdk_background_sign_out_button));
        this.currentState = state;
    }

    public SignOutButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ SignOutButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public SignOutButton(Context context) {
        this(context, null, 0, 6, null);
    }

    public final void render(tls update) {
        jbs0 jbs0Var = this.currentState;
        if (jbs0Var == null) {
            jbs0Var = null;
        }
        render((jbs0) update.invoke(jbs0Var));
    }
}
