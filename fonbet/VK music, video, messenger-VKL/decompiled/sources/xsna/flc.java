package xsna;

import java.util.Collections;
import kotlin.Pair;
import xsna.zjv;

/* compiled from: ClientAgentInterceptor.kt */
/* loaded from: classes.dex */
public final class flc implements ojv {
    public final String a;

    public flc(String str) {
        this.a = str;
    }

    @Override // xsna.ojv
    public final mkv a(zjv.a aVar) {
        ckv b = aVar.b();
        return aVar.c(ckv.a(b, null, pn00.o(b.e(), new Pair("Client-Agent", Collections.singletonList(this.a))), null, null, 27));
    }

    public final String toString() {
        return i5s.a(new StringBuilder("ClientAgentInterceptor(\""), this.a, "\")");
    }
}
