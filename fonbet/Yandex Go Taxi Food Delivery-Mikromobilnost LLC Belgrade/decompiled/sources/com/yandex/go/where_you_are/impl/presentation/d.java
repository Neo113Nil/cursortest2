package com.yandex.go.where_you_are.impl.presentation;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.a3v;
import defpackage.az41;
import defpackage.cma1;
import defpackage.czo0;
import defpackage.ffx;
import defpackage.fvg0;
import defpackage.hbp0;
import defpackage.i3y;
import defpackage.jy31;
import defpackage.o7r0;
import defpackage.qeh0;
import defpackage.sls;
import defpackage.tje;
import defpackage.yy41;
import java.util.HashMap;
import kotlin.LazyThreadSafetyMode;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes11.dex */
public final class d {
    public final Activity a;
    public final a3v b;
    public final yy41 c;
    public final com.yandex.go.navigation.screen.c d;
    public final com.yandex.go.where_you_are.impl.router.a e;
    public boolean f;
    public final ViewGroup h;
    public final hbp0 g = new hbp0(new czo0(14), "", null);
    public final i3y i = kotlin.a.b(LazyThreadSafetyMode.NONE, new sls() { // from class: com.yandex.go.where_you_are.impl.presentation.a
        @Override // defpackage.sls
        public final Object invoke() {
            d dVar = d.this;
            return new WhereYouAreBubble(dVar.a, new WhereYouAreBubbleHolder$bubbleView$2$1(1, dVar, d.class, "editBubbleClick", "editBubbleClick(Lcom/yandex/go/where_you_are/impl/model/WhereYouAreParams;)V", 0), new WhereYouAreBubbleHolder$bubbleView$2$2(0, dVar, d.class, "skipBubbleClick", "skipBubbleClick()V", 0), new WhereYouAreBubbleHolder$bubbleView$2$3(0, dVar, d.class, "bubbleSizeChanged", "bubbleSizeChanged()V", 0));
        }
    });
    public final n0 j = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);

    public d(Activity activity, a3v a3vVar, yy41 yy41Var, com.yandex.go.navigation.screen.c cVar, com.yandex.go.where_you_are.impl.router.a aVar) {
        this.a = activity;
        this.b = a3vVar;
        this.c = yy41Var;
        this.d = cVar;
        this.e = aVar;
        this.h = (ViewGroup) activity.findViewById(qeh0.view_on_map_container);
    }

    public final void a() {
        if (this.f) {
            this.f = false;
            this.g.b();
            WhereYouAreBubble b = b();
            cma1.b(0.0f, b).withEndAction(new jy31(6, this));
            this.b.t4(d.class);
        }
    }

    public final WhereYouAreBubble b() {
        return (WhereYouAreBubble) this.i.getValue();
    }

    public final void c(az41 az41Var) {
        if (!this.f) {
            this.f = true;
            hbp0 hbp0Var = this.g;
            hbp0Var.a();
            this.h.addView(b(), new FrameLayout.LayoutParams(-2, -2, 49));
            tje.N(hbp0Var.c(), null, null, new WhereYouAreBubbleHolder$show$1(this, null), 3);
            tje.N(hbp0Var.c(), null, null, new WhereYouAreBubbleHolder$show$2(this, null), 3);
            this.b.q3(d.class, 0, ru.yandex.taxi.design.utils.c.d(fvg0.where_you_are_bubble_height, b()), 0, 0);
            cma1.I(b());
            o7r0 o7r0Var = this.c.b;
            o7r0Var.getClass();
            o7r0Var.a.a("Main.WhereAreYouBubble.Shown", new HashMap(), 1, new HashMap());
        }
        b().render(az41Var);
    }
}
