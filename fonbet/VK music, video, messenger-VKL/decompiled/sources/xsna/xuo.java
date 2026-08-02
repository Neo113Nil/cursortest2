package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.stat.scheme.SchemeStat$TypeEasterEggsItem;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.collections.EmptyList;
import xsna.b25;
import xsna.ruo;

/* compiled from: EasterEggsModel.kt */
/* loaded from: classes14.dex */
public final class xuo {
    public static final long e = TimeUnit.MILLISECONDS.convert(10, TimeUnit.MINUTES);
    public final ruo.a a;
    public final cbb b;
    public final vuo c = new b25.a() { // from class: xsna.vuo
        @Override // xsna.b25.a
        public final void d(tbu0 tbu0Var) {
            pro0.f(new a34(xuo.this, 2));
        }
    };
    public final io.reactivex.rxjava3.subjects.d<List<muo>> d = io.reactivex.rxjava3.subjects.d.O0(EmptyList.b);

    /* JADX WARN: Type inference failed for: r1v1, types: [xsna.vuo] */
    public xuo(ruo.a aVar, cbb cbbVar) {
        this.a = aVar;
        this.b = cbbVar;
        c63 c63Var = c63.a;
        c63.a(new wuo(this));
    }

    public static void a(SchemeStat$TypeEasterEggsItem.EventType eventType, muo muoVar, ouo ouoVar) {
        UiTracker uiTracker = UiTracker.a;
        new tuo(UiTracker.c(), SchemeStat$TypeAction.a.b(null, null, new SchemeStat$TypeEasterEggsItem(muoVar.a, muoVar.b, ouoVar.d, eventType), 3)).q();
    }

    public final void b(muo muoVar, ouo ouoVar) {
        this.d.onNext(EmptyList.b);
        int i = muoVar.a;
        int i2 = ouoVar.d;
        ((ivo) this.b.c).a.getClass();
        tfx tfxVar = new tfx("specials.easterEggFound", new fbj0(2), new nq(24));
        tfx.l(tfxVar, "egg_id", i, 0, 0, 12);
        tfx.l(tfxVar, "position_id", i2, 0, 0, 12);
        io.reactivex.rxjava3.internal.operators.observable.b1 Z = rsg0.Z(yfb.x(tfxVar));
        asu0 asu0Var = asu0.a;
        asu0Var.getClass();
        itg0.g(Z.q(asu0.r()).o(asu0Var.d()), new z3i(this, 10), new wh1(16));
    }

    public final void c() {
        boolean z;
        if (!((Boolean) this.a.invoke()).booleanValue() || !o25.a().b()) {
            this.d.onNext(EmptyList.b);
            return;
        }
        ivo ivoVar = (ivo) this.b.c;
        try {
            z = pvo0.f(o25.a().o().e);
        } catch (Throwable th) {
            com.vk.metrics.eventtracking.b.a.q(th);
            z = false;
        }
        Boolean valueOf = Boolean.valueOf(z);
        ivoVar.a.getClass();
        tfx tfxVar = new tfx("specials.getEasterEggs", new qjk0(0), new rjk0(0));
        tfxVar.j("is_birthday", valueOf.booleanValue());
        itg0.h(rsg0.w0(yfb.x(tfxVar)).l(new x34(new s55(ivoVar.b, 6), 13)).m(asu0.a.d()), new pcg(this, 18), new ob(23));
    }
}
