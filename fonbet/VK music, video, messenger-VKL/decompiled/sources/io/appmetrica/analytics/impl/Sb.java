package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;

/* loaded from: classes8.dex */
public final class Sb implements InterfaceC5234v2 {
    public final C5311y4 a;

    public Sb(@NonNull C5311y4 c5311y4) {
        this.a = c5311y4;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5234v2
    @Nullable
    public final C5102po a(@NonNull C5050no c5050no, @NonNull C5102po c5102po) {
        int i = c5050no.b;
        int i2 = this.a.a;
        if (i == i2) {
            if (((C5102po) ((HashMap) c5050no.a.get(c5102po.b)).get(new String(c5102po.a))) != null) {
                ((HashMap) c5050no.a.get(c5102po.b)).put(new String(c5102po.a), c5102po);
                return c5102po;
            }
        } else if (i < i2) {
            ((HashMap) c5050no.a.get(c5102po.b)).put(new String(c5102po.a), c5102po);
            c5050no.b++;
        }
        return c5102po;
    }
}
