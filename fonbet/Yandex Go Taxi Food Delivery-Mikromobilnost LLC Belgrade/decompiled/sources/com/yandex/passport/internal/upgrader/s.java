package com.yandex.passport.internal.upgrader;

import defpackage.ffx;
import defpackage.tje;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes2.dex */
public final class s {
    public final t a;
    public final n0 b = ffx.c(0, 0, null, 7);
    public final CopyOnWriteArraySet c = new CopyOnWriteArraySet();

    public s(t tVar) {
        this.a = tVar;
    }

    public final void a() {
        if (this.c.size() > 0) {
            t tVar = this.a;
            CopyOnWriteArraySet copyOnWriteArraySet = this.c;
            UpgradeStatusUpdateScheduler$invalidateUpdaterStatus$1 upgradeStatusUpdateScheduler$invalidateUpdaterStatus$1 = new UpgradeStatusUpdateScheduler$invalidateUpdaterStatus$1(this, null);
            if (!tVar.g) {
                tVar.g = true;
                tVar.e = copyOnWriteArraySet;
                tVar.f = upgradeStatusUpdateScheduler$invalidateUpdaterStatus$1;
                tje.N(tVar.d, null, null, new UpgradeStatusUpdater$start$1(tVar, null), 3);
            }
        }
        if (this.c.size() <= 0) {
            t tVar2 = this.a;
            if (tVar2.g) {
                tVar2.g = false;
                kotlinx.coroutines.a.g(tVar2.d.a, null);
            }
        }
    }
}
