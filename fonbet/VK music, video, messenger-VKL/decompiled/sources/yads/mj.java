package yads;

import android.view.View;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Collection;
import kotlin.collections.EmptyList;
import xsna.jgp;

/* loaded from: classes10.dex */
public final class mj {
    public final Collection a;

    public mj(Collection collection) {
        this.a = collection;
    }

    public final s22 a(View view, jz1 jz1Var) {
        r22 r22Var = new r22(view, r32.c, jgp.b);
        r22Var.e.put("age", jz1Var.h(view));
        r22Var.e.put("body", jz1Var.a(view));
        r22Var.e.put("call_to_action", jz1Var.e(view));
        r22Var.e.put(X3.j.D, jz1Var.n(view));
        r22Var.e.put("favicon", jz1Var.g(view));
        r22Var.e.put("feedback", jz1Var.l(view));
        r22Var.e.put("icon", jz1Var.o(view));
        r22Var.e.put(X3.i.I0, jz1Var.c(view));
        r22Var.c = jz1Var.b(view);
        r22Var.d = jz1Var.k(view);
        r22Var.e.put("price", jz1Var.d(view));
        View i = jz1Var.i(view);
        if (!(i instanceof um2)) {
            i = null;
        }
        r22Var.e.put(CampaignEx.JSON_KEY_STAR, i);
        r22Var.e.put("review_count", jz1Var.p(view));
        r22Var.e.put("sponsored", jz1Var.m(view));
        r22Var.e.put("title", jz1Var.j(view));
        r22Var.e.put("warning", jz1Var.f(view));
        for (String str : this.a) {
            View a = jz1Var.a(view, str);
            if (a != null) {
                r22Var.e.put(str, a);
            }
        }
        return new s22(r22Var);
    }

    public mj() {
        this(EmptyList.b);
    }
}
