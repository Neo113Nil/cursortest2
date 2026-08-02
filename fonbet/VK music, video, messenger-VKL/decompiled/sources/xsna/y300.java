package xsna;

import com.vk.api.internal.LongPollCall;
import kotlin.Pair;

/* compiled from: LongPollChainCall.kt */
/* loaded from: classes15.dex */
public final class y300<T> extends ara<T> {
    public final mkx b;
    public final LongPollCall c;
    public final long d;
    public final k7r0<T> e;

    public y300(wy2 wy2Var, mkx mkxVar, LongPollCall longPollCall, long j, k7r0 k7r0Var) {
        super(wy2Var);
        this.b = mkxVar;
        this.c = longPollCall;
        this.d = j;
        this.e = k7r0Var;
    }

    @Override // xsna.ara
    public final T a(zqa zqaVar) throws Exception {
        m63.j(m63.c(), new Pair("longpoll.wait_sec", Long.valueOf(this.c.c / 1000)));
        String str = "longpoll";
        boolean z = false;
        int[] iArr = null;
        per0 e = this.e.e(new qrj0(new wg9(new tbh(this, 29), 4), new iej(5), new jom0(str, z, iArr)), new qrj0(new yg9(new btm(this, 20), 8), new kom0(str, z, iArr), new prj0()));
        if (e != null) {
            return (T) e.a();
        }
        return null;
    }
}
