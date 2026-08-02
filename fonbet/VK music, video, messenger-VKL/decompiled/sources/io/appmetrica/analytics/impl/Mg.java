package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public final class Mg implements InterfaceC4698a8 {
    public final InterfaceC4953k5 a;

    public Mg(@NonNull InterfaceC4953k5 interfaceC4953k5) {
        this.a = interfaceC4953k5;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4698a8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Lg a(@NonNull Context context, @NonNull C4747c5 c4747c5, @NonNull B4 b4) {
        return new Lg(context, c4747c5, b4, this.a, new C4773d5(), Rl.a());
    }

    @NonNull
    public final InterfaceC4953k5 a() {
        return this.a;
    }
}
