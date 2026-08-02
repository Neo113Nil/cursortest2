package com.yandex.div.core.timer;

import com.yandex.div.core.c;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.Expression;
import defpackage.l6o;
import defpackage.rvo;
import defpackage.t0z0;
import defpackage.tls;
import defpackage.vhl;
import defpackage.zy11;
import java.util.List;

/* loaded from: classes11.dex */
public final class b {
    public final vhl a;
    public final c b;
    public final l6o c;
    public final rvo d;
    public Div2View e;
    public final String f;
    public final List g;
    public final List h;
    public boolean i;
    public final a j;

    public b(vhl vhlVar, c cVar, l6o l6oVar, rvo rvoVar) {
        this.a = vhlVar;
        this.b = cVar;
        this.c = l6oVar;
        this.d = rvoVar;
        String str = vhlVar.c;
        this.f = vhlVar.f;
        this.g = vhlVar.b;
        this.h = vhlVar.d;
        this.j = new a(str, new TimerController$ticker$1(1, this, b.class, "updateTimerVariable", "updateTimerVariable(J)V", 0), new TimerController$ticker$2(1, this, b.class, "updateTimerVariable", "updateTimerVariable(J)V", 0), new TimerController$ticker$3(1, this, b.class, "onEnd", "onEnd(J)V", 0), new TimerController$ticker$4(1, this, b.class, "onTick", "onTick(J)V", 0), l6oVar);
        vhlVar.a.d(rvoVar, new tls() { // from class: com.yandex.div.core.timer.TimerController$1
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                ((Number) obj).longValue();
                b.a(b.this);
                return zy11.a;
            }
        });
        Expression expression = vhlVar.e;
        if (expression != null) {
            expression.d(rvoVar, new tls() { // from class: com.yandex.div.core.timer.TimerController$2
                {
                    super(1);
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    ((Number) obj).longValue();
                    b.a(b.this);
                    return zy11.a;
                }
            });
        }
    }

    public static final void a(b bVar) {
        a aVar = bVar.j;
        vhl vhlVar = bVar.a;
        Expression expression = vhlVar.a;
        rvo rvoVar = bVar.d;
        long longValue = ((Number) expression.a(rvoVar)).longValue();
        Expression expression2 = vhlVar.e;
        aVar.h = expression2 != null ? (Long) expression2.a(rvoVar) : null;
        aVar.g = longValue != 0 ? Long.valueOf(longValue) : null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void b(String str) {
        int hashCode = str.hashCode();
        a aVar = this.j;
        switch (hashCode) {
            case -1367724422:
                if (str.equals("cancel")) {
                    aVar.a();
                    return;
                }
                break;
            case -934426579:
                if (str.equals("resume")) {
                    String str2 = aVar.a;
                    int i = t0z0.a[aVar.k.ordinal()];
                    if (i == 1) {
                        aVar.e("The timer '" + str2 + "' is stopped!");
                        return;
                    }
                    if (i == 2) {
                        aVar.e("The timer '" + str2 + "' already working!");
                        return;
                    }
                    if (i != 3) {
                        return;
                    }
                    aVar.k = Ticker$State.WORKING;
                    aVar.n = -1L;
                    aVar.g();
                    return;
                }
                break;
            case 3540994:
                if (str.equals("stop")) {
                    int i2 = t0z0.a[aVar.k.ordinal()];
                    if (i2 == 1) {
                        aVar.e("The timer '" + aVar.a + "' already stopped!");
                        return;
                    }
                    if (i2 == 2 || i2 == 3) {
                        aVar.k = Ticker$State.STOPPED;
                        ((TimerController$ticker$3) aVar.d).invoke(Long.valueOf(aVar.d()));
                        aVar.b();
                        aVar.f();
                        return;
                    }
                    return;
                }
                break;
            case 106440182:
                if (str.equals("pause")) {
                    String str3 = aVar.a;
                    int i3 = t0z0.a[aVar.k.ordinal()];
                    if (i3 == 1) {
                        aVar.e("The timer '" + str3 + "' already stopped!");
                        return;
                    }
                    if (i3 != 2) {
                        if (i3 != 3) {
                            return;
                        }
                        aVar.e("The timer '" + str3 + "' already paused!");
                        return;
                    }
                    aVar.k = Ticker$State.PAUSED;
                    ((TimerController$ticker$1) aVar.b).invoke(Long.valueOf(aVar.d()));
                    aVar.h();
                    aVar.m = -1L;
                    return;
                }
                break;
            case 108404047:
                if (str.equals("reset")) {
                    aVar.a();
                    aVar.j();
                    return;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    aVar.j();
                    return;
                }
                break;
        }
        this.c.e(new IllegalArgumentException(str.concat(" is unsupported timer command!")));
    }

    public final vhl c() {
        return this.a;
    }

    public final boolean d(Div2View div2View) {
        return div2View.equals(this.e);
    }

    public final void e(Div2View div2View) {
        this.e = div2View;
        if (this.i) {
            this.j.g();
            this.i = false;
        }
    }

    public final void f(Div2View div2View) {
        if (div2View.equals(this.e)) {
            g();
        }
    }

    public final void g() {
        this.e = null;
        this.j.h();
        this.i = true;
    }

    public final void h(long j) {
        Div2View div2View;
        String str = this.f;
        if (str == null || (div2View = this.e) == null) {
            return;
        }
        div2View.setVariable(str, String.valueOf(j));
    }
}
