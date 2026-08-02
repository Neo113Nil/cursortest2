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
import defpackage.fh4;
import defpackage.mj40;
import defpackage.ny61;
import defpackage.s8o;
import defpackage.vng;
import defpackage.x3t0;
import defpackage.xng0;
import kotlin.Metadata;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/yandex/go/masstransit/design/snippet/MtUndergroundSnippetView;", "Lcom/yandex/go/design/view/GoLinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lx3t0;", ClidProvider.STATE, "Lzy11;", "render", "(Lx3t0;)V", "Lmj40;", "binding", "Lmj40;", "design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MtUndergroundSnippetView extends GoLinearLayout {
    public static final int $stable = 8;
    private final mj40 binding;

    public MtUndergroundSnippetView(Context context) {
        super(context, null, 0, 0, 14, null);
        LayoutInflater.from(context).inflate(auh0.mt_underground_snippet_view, this);
        int i = cjh0.icon;
        GoImageView goImageView = (GoImageView) cma1.O(i, this);
        if (goImageView != null) {
            i = cjh0.underground_num;
            RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, this);
            if (robotoTextView != null) {
                this.binding = new mj40(this, goImageView, robotoTextView);
                setOrientation(0);
                return;
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    public final void render(x3t0 state) {
        Drawable drawable;
        mj40 mj40Var = this.binding;
        int i = state.c;
        if (i != 0) {
            mj40Var.b.setImageResource(i);
        } else {
            Drawable t = vng.t(state.d, getContext());
            if (t == null || (drawable = t.mutate()) == null) {
                drawable = null;
            } else {
                drawable.setTint(s8o.m(new bdc(xng0.textMinor), getContext()));
            }
            mj40Var.b.setImageDrawable(drawable);
        }
        mj40Var.c.setText(fh4.h(getContext(), state.b, state.a, new bdc(xng0.everFront)));
    }
}
