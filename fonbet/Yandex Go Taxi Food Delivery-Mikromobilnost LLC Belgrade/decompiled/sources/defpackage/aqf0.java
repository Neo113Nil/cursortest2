package defpackage;

import android.net.Uri;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes12.dex */
public final class aqf0 implements fgp0 {
    public final n0 a;
    public final eci0 b;

    public aqf0() {
        n0 c = ffx.c(0, 0, null, 7);
        this.a = c;
        this.b = e.c(c);
    }

    @Override // defpackage.fgp0
    public final Object a(Uri uri, Continuation continuation) {
        return this.a.emit(zy11.a, continuation);
    }
}
