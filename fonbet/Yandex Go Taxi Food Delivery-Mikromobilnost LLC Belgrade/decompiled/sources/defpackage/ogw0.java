package defpackage;

import com.yandex.go.suggest.impl.router.e;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes8.dex */
public final class ogw0 {
    public final n0 a;
    public final eci0 b;
    public final /* synthetic */ e c;

    public ogw0(e eVar) {
        this.c = eVar;
        n0 c = ffx.c(0, 1, BufferOverflow.DROP_OLDEST, 1);
        this.a = c;
        this.b = kotlinx.coroutines.flow.e.c(c);
    }
}
