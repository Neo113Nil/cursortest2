package com.yandex.go.masstransit.design.snippet;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import defpackage.auh0;
import defpackage.bdc;
import defpackage.cjh0;
import defpackage.cma1;
import defpackage.cs30;
import defpackage.ny61;
import defpackage.s8o;
import defpackage.v3t0;
import defpackage.vng;
import defpackage.xng0;
import kotlin.Metadata;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/yandex/go/masstransit/design/snippet/MtPedestrianSnippetView;", "Lcom/yandex/go/design/view/GoLinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lv3t0;", ClidProvider.STATE, "Lzy11;", "render", "(Lv3t0;)V", "Lcs30;", "binding", "Lcs30;", "design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MtPedestrianSnippetView extends GoLinearLayout {
    public static final int $stable = 8;
    private final cs30 binding;

    public MtPedestrianSnippetView(Context context) {
        super(context, null, 0, 0, 14, null);
        LayoutInflater.from(context).inflate(auh0.mt_pedestrian_snippet_view, this);
        int i = cjh0.icon;
        GoImageView goImageView = (GoImageView) cma1.O(i, this);
        if (goImageView != null) {
            i = cjh0.pedestrian_text;
            RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, this);
            if (robotoTextView != null) {
                this.binding = new cs30(this, goImageView, robotoTextView);
                return;
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    public final void render(v3t0 state) {
        Drawable drawable;
        cs30 cs30Var = this.binding;
        bdc bdcVar = state.d ? new bdc(xng0.textMain) : new bdc(xng0.textMinor);
        Drawable t = vng.t(state.a, getContext());
        if (t == null || (drawable = t.mutate()) == null) {
            drawable = null;
        } else {
            drawable.setTint(s8o.m(bdcVar, getContext()));
        }
        GoImageView goImageView = cs30Var.b;
        RobotoTextView robotoTextView = cs30Var.c;
        goImageView.setImageDrawable(drawable);
        robotoTextView.setText(state.c);
        robotoTextView.setTextColor(bdcVar);
        robotoTextView.setTextTypeface(3);
    }
}
