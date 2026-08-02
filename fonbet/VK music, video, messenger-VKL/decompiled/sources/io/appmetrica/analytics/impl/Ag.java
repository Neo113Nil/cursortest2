package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class Ag implements InterfaceC5223ug {
    public final HashSet a;
    public boolean b;
    public C5298xg c;

    public Ag() {
        this(C5342za.k().u());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5223ug
    public final synchronized void a(@Nullable C5298xg c5298xg) {
        if (c5298xg != null) {
            try {
                LoggerStorage.getMainPublicOrAnonymousLogger().info("Received referrer from source %s: %s", c5298xg.d.a, c5298xg.a);
            } catch (Throwable th) {
                throw th;
            }
        }
        this.c = c5298xg;
        this.b = true;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((InterfaceC5094pg) it.next()).a(this.c);
        }
        this.a.clear();
    }

    public Ag(C5248vg c5248vg) {
        this.a = new HashSet();
        c5248vg.a(new Hl(this));
        c5248vg.a();
    }

    public final synchronized void a(@NonNull InterfaceC5094pg interfaceC5094pg) {
        this.a.add(interfaceC5094pg);
        if (this.b) {
            interfaceC5094pg.a(this.c);
            this.a.remove(interfaceC5094pg);
        }
    }
}
