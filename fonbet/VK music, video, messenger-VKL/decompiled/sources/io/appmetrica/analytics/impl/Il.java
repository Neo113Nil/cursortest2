package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;

/* loaded from: classes8.dex */
public final class Il implements InterfaceC5234v2 {
    @Override // io.appmetrica.analytics.impl.InterfaceC5234v2
    @Nullable
    public final C5102po a(@NonNull C5050no c5050no, @NonNull C5102po c5102po) {
        ((HashMap) c5050no.a.get(c5102po.b)).put(new String(c5102po.a), c5102po);
        return c5102po;
    }
}
