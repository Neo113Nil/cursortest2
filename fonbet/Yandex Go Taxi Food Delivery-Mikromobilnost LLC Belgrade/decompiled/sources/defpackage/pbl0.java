package defpackage;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.network.mapi.MapiClientImpl;

/* loaded from: classes6.dex */
public final class pbl0 {
    public final jne0 a;
    public final noh b;
    public final lbl0 c;
    public final long d;

    public pbl0(jne0 jne0Var, noh nohVar, lbl0 lbl0Var) {
        long currentTimeMillis = System.currentTimeMillis();
        this.a = jne0Var;
        this.b = nohVar;
        this.c = lbl0Var;
        this.d = currentTimeMillis;
    }

    public final jne0 a() {
        return this.a;
    }

    public final lbl0 b() {
        return this.c;
    }

    public final noh c() {
        return this.b;
    }

    public final boolean d() {
        return System.currentTimeMillis() - this.d > MapiClientImpl.RETRIES_TIME_MILLIS;
    }
}
