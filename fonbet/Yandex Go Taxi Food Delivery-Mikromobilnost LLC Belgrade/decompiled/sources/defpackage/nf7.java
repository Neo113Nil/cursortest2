package defpackage;

import java.util.Calendar;

/* loaded from: classes10.dex */
public final class nf7 {
    public final jtq0 a;

    public nf7(jtq0 jtq0Var) {
        this.a = jtq0Var;
    }

    public final int a(Calendar calendar) {
        return (int) ((calendar.getTimeInMillis() - this.a.a(calendar.getTimeZone()).getTimeInMillis()) / 3600000);
    }

    public final boolean b(Calendar calendar) {
        return calendar.getTimeInMillis() < this.a.a(calendar.getTimeZone()).getTimeInMillis();
    }

    public final boolean c(Calendar calendar) {
        return this.a.a(calendar.getTimeZone()).get(5) == calendar.get(5);
    }

    public final boolean d(Calendar calendar) {
        Calendar a = this.a.a(calendar.getTimeZone());
        int i = calendar.get(5);
        Calendar a2 = wf7.a(a);
        a2.add(6, 1);
        a2.getTimeInMillis();
        return i == a2.get(5);
    }

    public final int e(Calendar calendar) {
        return (int) ((calendar.getTimeInMillis() - this.a.a(calendar.getTimeZone()).getTimeInMillis()) / 60000);
    }
}
