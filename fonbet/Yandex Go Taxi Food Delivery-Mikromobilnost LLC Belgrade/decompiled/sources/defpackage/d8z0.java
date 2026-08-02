package defpackage;

import java.util.Calendar;

/* loaded from: classes12.dex */
public final class d8z0 implements e8z0, u190 {
    public final Calendar a;
    public final Calendar b;
    public final e2n c;
    public final String d;

    public d8z0(Calendar calendar, Calendar calendar2, e2n e2nVar) {
        this.a = calendar;
        this.b = calendar2;
        this.c = e2nVar;
        this.d = vpb1.l(new ve7(calendar));
    }

    @Override // defpackage.u190
    public final e2n c() {
        return this.c;
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.d;
    }
}
