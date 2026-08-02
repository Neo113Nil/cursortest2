package defpackage;

import androidx.core.app.s0;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* loaded from: classes8.dex */
public final class d2g0 extends nwl {
    public final i3y b;

    public d2g0(h3y h3yVar, h3y h3yVar2) {
        super(h3yVar2);
        this.b = a.b(LazyThreadSafetyMode.NONE, new mj(h3yVar, 13));
    }

    @Override // defpackage.nwl
    public final void a(tse tseVar) {
    }

    @Override // defpackage.nwl
    public final void c() {
        b(new u131("superapp.profile.notifications_available", ((s0) this.b.getValue()).b.areNotificationsEnabled()));
    }
}
