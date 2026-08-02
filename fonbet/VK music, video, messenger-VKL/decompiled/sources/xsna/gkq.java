package xsna;

import java.security.SecureRandom;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: FamilyDayController.kt */
/* loaded from: classes4.dex */
public final class gkq {
    public final fkq a;
    public final SecureRandom b = new SecureRandom();
    public final AtomicBoolean c = new AtomicBoolean(false);
    public iur d;

    public gkq(fkq fkqVar) {
        this.a = fkqVar;
    }

    public final boolean a() {
        int i;
        fkq fkqVar = this.a;
        boolean z = false;
        if (fkqVar.a() && (i = fkqVar.a) > 0 && ((i >= 100 && !fkqVar.d) || this.b.nextInt(100) < fkqVar.a)) {
            z = true;
        }
        this.c.set(z);
        return z;
    }
}
