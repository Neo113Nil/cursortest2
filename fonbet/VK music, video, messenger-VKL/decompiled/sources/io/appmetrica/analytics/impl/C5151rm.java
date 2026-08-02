package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: io.appmetrica.analytics.impl.rm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5151rm implements InterfaceC5229um {
    public volatile C5100pm a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();

    @Override // io.appmetrica.analytics.impl.InterfaceC5229um
    public final void a(C5100pm c5100pm) {
        this.a = c5100pm;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((InterfaceC5229um) it.next()).a(c5100pm);
        }
    }

    public final C5100pm b() {
        C5100pm c5100pm = this.a;
        if (c5100pm == null) {
            return null;
        }
        return c5100pm;
    }

    public final void b(InterfaceC5229um interfaceC5229um) {
        this.b.remove(interfaceC5229um);
    }

    public final void a(InterfaceC5229um interfaceC5229um) {
        this.b.add(interfaceC5229um);
        if (this.a != null) {
            C5100pm c5100pm = this.a;
            if (c5100pm == null) {
                c5100pm = null;
            }
            interfaceC5229um.a(c5100pm);
        }
    }

    public final void a(Context context) {
        String optStringOrNull;
        ProtobufStateStorage<Object> create = ((AbstractC4739bn) Zm.a(C5203tm.class)).create(context);
        Go a = C5342za.k().D().a();
        synchronized (a) {
            optStringOrNull = JsonUtils.optStringOrNull(a.a.a(), "device_id");
        }
        a(new C5100pm(optStringOrNull, a.a(), (C5203tm) create.read()));
    }
}
