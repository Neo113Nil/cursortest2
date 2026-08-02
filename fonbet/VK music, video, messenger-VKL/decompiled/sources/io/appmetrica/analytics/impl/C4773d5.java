package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: io.appmetrica.analytics.impl.d5, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4773d5 {
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    public final void a(@NonNull InterfaceC5133r4 interfaceC5133r4) {
        this.a.add(interfaceC5133r4);
    }

    public final void b(@NonNull InterfaceC5133r4 interfaceC5133r4) {
        this.a.remove(interfaceC5133r4);
    }

    public final List<InterfaceC5133r4> a() {
        return this.a;
    }
}
