package com.yandex.go.masstransit.design.snippet;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.widget.ImageView;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import defpackage.auh0;
import defpackage.bdc;
import defpackage.cjh0;
import defpackage.cma1;
import defpackage.fb11;
import defpackage.fh4;
import defpackage.gb11;
import defpackage.gj40;
import defpackage.hb11;
import defpackage.jb11;
import defpackage.kdc;
import defpackage.ny61;
import defpackage.s8o;
import defpackage.w3t0;
import defpackage.w511;
import defpackage.xng0;
import kotlin.Metadata;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t*\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0011\u001a\u00020\t*\u00020\f2\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0015\u001a\u00020\t*\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/yandex/go/masstransit/design/snippet/MtTransportSnippetView;", "Lcom/yandex/go/design/view/GoLinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lgj40;", "Ljb11;", "variant", "Lzy11;", "renderVariant", "(Lgj40;Ljb11;)V", "Landroid/widget/ImageView;", "", "iconRes", "Lkdc;", "iconColor", "setIcon", "(Landroid/widget/ImageView;ILkdc;)V", "Lw3t0;", ClidProvider.STATE, "renderOtherVariants", "(Lgj40;Lw3t0;)V", "", "selected", "setSelected", "(Z)V", "render", "(Lw3t0;)V", "binding", "Lgj40;", "currentState", "Lw3t0;", "design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MtTransportSnippetView extends GoLinearLayout {
    public static final int $stable = 8;
    private final gj40 binding;
    private w3t0 currentState;

    public MtTransportSnippetView(Context context) {
        super(context, null, 0, 0, 14, null);
        LayoutInflater.from(context).inflate(auh0.mt_transport_snippet_view, this);
        int i = cjh0.icon;
        GoImageView goImageView = (GoImageView) cma1.O(i, this);
        if (goImageView != null) {
            i = cjh0.num_others;
            RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, this);
            if (robotoTextView != null) {
                i = cjh0.transport_num;
                RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, this);
                if (robotoTextView2 != null) {
                    this.binding = new gj40(this, goImageView, robotoTextView, robotoTextView2);
                    setOrientation(0);
                    return;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    private final void renderOtherVariants(gj40 gj40Var, w3t0 w3t0Var) {
        gj40Var.c.setVisibility(w3t0Var.d != null ? 0 : 8);
        gj40Var.c.setText(fh4.h(getContext(), w3t0Var.d, isSelected() ? w3t0Var.f : w3t0Var.e, new bdc(xng0.textMinor)));
    }

    private final void renderVariant(gj40 gj40Var, jb11 jb11Var) {
        CharSequence h;
        gj40Var.d.setVisibility(jb11Var != null ? 0 : 8);
        if (jb11Var != null) {
            bdc bdcVar = jb11Var.c;
            kdc kdcVar = jb11Var.b;
            String str = jb11Var.a;
            RobotoTextView robotoTextView = gj40Var.d;
            if (jb11Var instanceof fb11) {
                h = fh4.f(getContext(), str, kdcVar, bdcVar);
            } else if (jb11Var instanceof hb11) {
                h = ((hb11) jb11Var).d ? fh4.i(getContext(), str, kdcVar, new bdc(xng0.everFront)) : fh4.f(getContext(), str, kdcVar, bdcVar);
            } else {
                if (!(jb11Var instanceof gb11)) {
                    w511.b();
                    return;
                }
                h = fh4.h(getContext(), str, kdcVar, bdcVar);
            }
            robotoTextView.setText(h);
        }
    }

    private final void setIcon(ImageView imageView, int i, kdc kdcVar) {
        Drawable drawable;
        Drawable k = c.k(i, imageView);
        if (k == null || (drawable = k.mutate()) == null) {
            drawable = null;
        } else {
            drawable.setTint(kdcVar != null ? s8o.m(kdcVar, imageView.getContext()) : s8o.m(new bdc(xng0.textMinor), imageView.getContext()));
        }
        imageView.setImageDrawable(drawable);
    }

    public final void render(w3t0 state) {
        gj40 gj40Var = this.binding;
        this.currentState = state;
        int i = state.a;
        if (i == 0) {
            gj40Var.b.setImageDrawable(null);
        } else {
            setIcon(gj40Var.b, i, state.b);
        }
        renderVariant(gj40Var, state.c);
        renderOtherVariants(gj40Var, state);
    }

    @Override // android.view.View
    public void setSelected(boolean selected) {
        super.setSelected(selected);
        w3t0 w3t0Var = this.currentState;
        if (w3t0Var != null) {
            renderOtherVariants(this.binding, w3t0Var);
        }
    }
}
