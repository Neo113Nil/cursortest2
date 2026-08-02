package defpackage;

import android.app.Activity;
import android.content.res.Resources;

/* loaded from: classes15.dex */
public final class nvy0 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public nvy0(qh41 qh41Var, Activity activity) {
        mvy0 mvy0Var;
        Resources resources = activity.getResources();
        if (jl40.l(null, j720.a)) {
            mvy0Var = new mvy0(resources.getColor(jpg0.msg_dark_accent), resources.getColor(jpg0.msg_dark_primaryText), resources.getColor(jpg0.msg_dark_secondaryText), resources.getColor(jpg0.msg_dark_background));
        } else {
            jl40.l(null, j720.b);
            mvy0Var = new mvy0(resources.getColor(jpg0.msg_light_accent), resources.getColor(jpg0.msg_light_primaryText), resources.getColor(jpg0.msg_light_secondaryText), resources.getColor(jpg0.msg_light_background));
        }
        this.a = mvy0Var.a;
        this.b = mvy0Var.b;
        this.c = mvy0Var.c;
        this.d = mvy0Var.d;
    }
}
