package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.messaging.internal.urlpreview.a;
import com.yandex.messaging.internal.view.timeline.d;
import java.util.List;

/* loaded from: classes15.dex */
public final class dx10 {
    public final a a;
    public final fn6 b;
    public final sh21 c;
    public d d;
    public uds0 e;
    public x3 f;
    public View g;
    public gl h;
    public String i;
    public long j;
    public String k;
    public List l;
    public int m;
    public boolean n;
    public boolean o;
    public boolean p;

    public dx10(a aVar, fn6 fn6Var, sh21 sh21Var) {
        this.a = aVar;
        this.b = fn6Var;
        this.c = sh21Var;
    }

    public final void a() {
        ViewGroup.LayoutParams layoutParams;
        View view = this.g;
        if (view != null && (layoutParams = view.getLayoutParams()) != null) {
            layoutParams.width = -2;
        }
        View view2 = this.g;
        if (view2 != null) {
            zoy0 zoy0Var = com.yandex.messaging.internal.view.timeline.a.i;
            Object parent = view2.getParent();
            View view3 = parent instanceof View ? (View) parent : null;
            if (view3 != null) {
                if (view3.getId() != e9h0.ai_bot_interactions_wrap) {
                    view3 = null;
                }
                if (view3 != null) {
                    ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
                    layoutParams2.width = -2;
                    view3.setLayoutParams(layoutParams2);
                }
            }
        }
        x3 x3Var = this.f;
        if (x3Var != null) {
            x3Var.Dg();
        }
        this.f = null;
        uds0 uds0Var = this.e;
        if (uds0Var != null) {
            uds0Var.close();
        }
        this.e = null;
        this.p = false;
    }
}
