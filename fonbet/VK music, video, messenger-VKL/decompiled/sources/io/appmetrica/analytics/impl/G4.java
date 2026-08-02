package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public final class G4 implements InterfaceC5133r4 {
    public final Context a;
    public final J4 b;
    public final ResultReceiver c;

    public G4(@NonNull Context context, @NonNull J4 j4, @NonNull B4 b4) {
        this.a = context;
        this.b = j4;
        this.c = b4.c;
        j4.a(this);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5133r4
    public final void a(@NonNull C4722b6 c4722b6, @NonNull B4 b4) {
        this.b.a(b4.b);
        this.b.a(c4722b6, this);
    }

    @NonNull
    public final J4 b() {
        return this.b;
    }

    @NonNull
    public final Context c() {
        return this.a;
    }

    @NonNull
    public final ResultReceiver d() {
        return this.c;
    }

    public final void a(@NonNull C4797e4 c4797e4) {
        N6.a(this.c, c4797e4);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5133r4
    public final void a() {
        this.b.b(this);
    }
}
