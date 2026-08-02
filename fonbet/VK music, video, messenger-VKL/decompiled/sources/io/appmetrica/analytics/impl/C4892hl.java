package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: io.appmetrica.analytics.impl.hl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4892hl extends V2 {
    public C4892hl(@NonNull InterfaceC5234v2 interfaceC5234v2) {
        super(interfaceC5234v2);
    }

    @Override // io.appmetrica.analytics.impl.V2
    public final C5102po a(@NonNull C5050no c5050no, @Nullable C5102po c5102po, @NonNull InterfaceC5209u2 interfaceC5209u2) {
        if (c5102po != null && !c5102po.c.b) {
            return null;
        }
        C5102po a = ((Ld) interfaceC5209u2).a();
        a.c.a = true;
        return this.a.a(c5050no, a);
    }
}
