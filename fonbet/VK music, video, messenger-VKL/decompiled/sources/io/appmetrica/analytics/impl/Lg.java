package io.appmetrica.analytics.impl;

import android.content.Context;

/* loaded from: classes8.dex */
public final class Lg implements InterfaceC4712am, Sa {
    public final Context a;
    public final C4747c5 b;
    public final C4773d5 c;
    public final Km d;
    public final InterfaceC4727bb e;

    public Lg(Context context, C4747c5 c4747c5, B4 b4, InterfaceC4953k5 interfaceC4953k5, C4773d5 c4773d5, Rl rl) {
        this.a = context;
        this.b = c4747c5;
        this.c = c4773d5;
        Km a = rl.a(context, c4747c5, b4.a);
        this.d = a;
        this.e = interfaceC4953k5.a(context, c4747c5, b4.b, a);
        rl.a(c4747c5, this);
    }

    public final C4747c5 a() {
        return this.b;
    }

    public final Context b() {
        return this.a;
    }

    public final void a(InterfaceC5133r4 interfaceC5133r4) {
        this.c.a.add(interfaceC5133r4);
    }

    public final void b(InterfaceC5133r4 interfaceC5133r4) {
        this.c.a.remove(interfaceC5133r4);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4712am
    public final void a(C5100pm c5100pm) {
        ((C4927j5) this.e).a(c5100pm);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4712am
    public final void a(Tl tl, C5100pm c5100pm) {
        ((C4927j5) this.e).getClass();
    }

    @Override // io.appmetrica.analytics.impl.Sa
    public final void a(B4 b4) {
        this.d.a(b4.a);
        this.e.a(b4.b);
    }

    public Lg(Context context, C4747c5 c4747c5, B4 b4, InterfaceC4953k5 interfaceC4953k5) {
        this(context, c4747c5, b4, interfaceC4953k5, new C4773d5(), Rl.a());
    }

    public final void a(C4722b6 c4722b6, B4 b4) {
        if (!I9.c.contains(EnumC5037nb.a(c4722b6.d))) {
            this.e.a(b4.b);
        }
        ((C4927j5) this.e).a(c4722b6);
    }
}
