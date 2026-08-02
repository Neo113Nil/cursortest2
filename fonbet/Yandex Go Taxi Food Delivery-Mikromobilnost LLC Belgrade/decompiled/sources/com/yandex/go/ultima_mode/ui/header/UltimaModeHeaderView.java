package com.yandex.go.ultima_mode.ui.header;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.core.view.b;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import defpackage.cma1;
import defpackage.cv11;
import defpackage.dv11;
import defpackage.ev11;
import defpackage.fv11;
import defpackage.gv11;
import defpackage.ifq0;
import defpackage.ilh0;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.su11;
import defpackage.tls;
import defpackage.vu11;
import defpackage.w511;
import defpackage.y8h0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ?\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ=\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u001c2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/yandex/go/ultima_mode/ui/header/UltimaModeHeaderView;", "Lcom/yandex/go/design/view/GoLinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Ldv11;", "uiState", "Lkotlin/Function1;", "Lnqs0;", "Lzy11;", "onSubtitleClick", "onTrailClick", "renderContent", "(Ldv11;Ltls;Ltls;)V", "renderEmpty", "()V", "Lvu11;", "action", "onClick", "updateSubtitleAction", "(Lvu11;Ltls;)V", "updateTrailAction", "Lfv11;", "render", "(Lfv11;Ltls;Ltls;)V", "Lcv11;", "binding", "Lcv11;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class UltimaModeHeaderView extends GoLinearLayout {
    private final cv11 binding;

    public UltimaModeHeaderView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        LayoutInflater.from(context).inflate(ilh0.ultima_mode_header, this);
        int i3 = y8h0.ultima_subtitle;
        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i3, this);
        if (robotoTextView != null) {
            i3 = y8h0.ultima_title_icon;
            GoImageView goImageView = (GoImageView) cma1.O(i3, this);
            if (goImageView != null) {
                i3 = y8h0.ultima_trail;
                RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i3, this);
                if (robotoTextView2 != null) {
                    this.binding = new cv11(this, robotoTextView, goImageView, robotoTextView2);
                    return;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i3)));
        throw null;
    }

    private final void renderContent(dv11 uiState, tls onSubtitleClick, tls onTrailClick) {
        setVisibility(0);
        cv11 cv11Var = this.binding;
        GoImageView goImageView = cv11Var.c;
        RobotoTextView robotoTextView = cv11Var.d;
        goImageView.setImageDrawable(uiState.a);
        b.p(cv11Var.c, new ifq0(15, uiState));
        RobotoTextView robotoTextView2 = cv11Var.b;
        CharSequence charSequence = uiState.e;
        robotoTextView2.setVisibility((charSequence == null || charSequence.length() == 0) ? 8 : 0);
        robotoTextView2.setText(charSequence);
        robotoTextView2.setAlpha(0.5f);
        updateSubtitleAction(uiState.f, onSubtitleClick);
        robotoTextView.setText(uiState.c);
        robotoTextView.setAlpha(0.5f);
        updateTrailAction(uiState.d, onTrailClick);
    }

    private final void renderEmpty() {
        setVisibility(8);
        cv11 cv11Var = this.binding;
        cv11Var.c.setImageDrawable(null);
        cv11Var.b.setText((CharSequence) null);
    }

    private final void updateSubtitleAction(vu11 action, tls onClick) {
        boolean l = jl40.l(action, su11.a);
        cv11 cv11Var = this.binding;
        if (l) {
            cv11Var.b.setOnClickListener(null);
        } else {
            c.z(new gv11(onClick, action, 1), cv11Var.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 updateSubtitleAction$lambda$0(tls tlsVar, vu11 vu11Var) {
        tlsVar.invoke(vu11Var);
        return zy11.a;
    }

    private final void updateTrailAction(vu11 action, tls onClick) {
        boolean l = jl40.l(action, su11.a);
        cv11 cv11Var = this.binding;
        if (l) {
            cv11Var.d.setOnClickListener(null);
        } else {
            c.z(new gv11(onClick, action, 0), cv11Var.d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 updateTrailAction$lambda$0(tls tlsVar, vu11 vu11Var) {
        tlsVar.invoke(vu11Var);
        return zy11.a;
    }

    public final void render(fv11 uiState, tls onSubtitleClick, tls onTrailClick) {
        if (uiState instanceof dv11) {
            renderContent((dv11) uiState, onSubtitleClick, onTrailClick);
        } else if (uiState instanceof ev11) {
            renderEmpty();
        } else {
            w511.b();
        }
    }

    public UltimaModeHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public UltimaModeHeaderView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public UltimaModeHeaderView(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public /* synthetic */ UltimaModeHeaderView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
