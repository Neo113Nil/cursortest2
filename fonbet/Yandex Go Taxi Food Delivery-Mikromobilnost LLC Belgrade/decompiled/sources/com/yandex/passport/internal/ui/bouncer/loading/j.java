package com.yandex.passport.internal.ui.bouncer.loading;

import android.view.View;
import android.widget.TextView;
import com.yandex.passport.internal.properties.u;
import com.yandex.passport.internal.sloth.l;
import com.yandex.passport.internal.ui.bouncer.model.a2;
import com.yandex.passport.internal.ui.bouncer.t;
import defpackage.bvf0;
import defpackage.rs11;
import defpackage.tje;
import defpackage.uc20;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes2.dex */
public final class j extends com.lightside.slab.a {
    public final k E;
    public final t F;
    public final l G;

    public j(k kVar, t tVar, l lVar) {
        this.E = kVar;
        this.F = tVar;
        this.G = lVar;
    }

    @Override // defpackage.nt11
    public final rs11 l() {
        return this.E;
    }

    @Override // com.lightside.slab.a
    public final Object m(Object obj, Continuation continuation) {
        a2 a2Var = (a2) obj;
        k kVar = this.E;
        View view = kVar.w;
        if (view.getVisibility() == 0) {
            view.setAlpha(0.0f);
            u.j(view);
        }
        TextView textView = kVar.y;
        if (textView.getVisibility() == 0) {
            textView.setAlpha(0.0f);
            textView.setPadding(0, (int) (17.0f * uc20.a.density), 0, 0);
            u.j(textView);
        }
        tje.N(bvf0.a(continuation.get_context()), null, null, new WaitConnectionSlab$performBind$$inlined$collectOn$1(kotlinx.coroutines.flow.e.t((n0) a2Var.b.b), null, this, a2Var), 3);
        tje.N(bvf0.a(continuation.get_context()), null, null, new WaitConnectionSlab$performBind$$inlined$collectOn$2(this.G.a, null, this), 3);
        return zy11.a;
    }
}
