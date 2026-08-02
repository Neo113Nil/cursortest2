package xsna;

import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.g8i;

/* compiled from: CompletionMarkerUtils.kt */
/* loaded from: classes2.dex */
public final class e8i implements g8i {
    public final String a;

    public e8i(String str) {
        this.a = str;
    }

    @Override // xsna.g8i
    public final g8i.a a(long j, TimeUnit timeUnit) {
        return new g8i.a(true, timeUnit.toMillis(j), 0L, null, on00.f(new Pair(this, 0L)), EmptyList.b);
    }

    @Override // xsna.g8i
    public final boolean b(long j) {
        return true;
    }

    @Override // xsna.g8i
    public final String id() {
        return this.a;
    }

    public final String toString() {
        return ho8.a(new StringBuilder("CompletedMarker("), this.a, ')');
    }

    @Override // xsna.g8i
    public final void await() {
    }
}
