package defpackage;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.EmptyCoroutineContext;

/* loaded from: classes10.dex */
public abstract class a7y {
    public static final s6y a = new s6y(null, 0, false, 0.0f, new o4y(1), 0.0f, false, bvf0.a(EmptyCoroutineContext.a), vng.a(), p8e.b(0, 0, 0, 0, 15), EmptyList.a, 0, 0, 0, Orientation.Vertical, 0, 0);

    public static final b a(int i, int i2, fid fidVar) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Object[] objArr = new Object[0];
        tig0 tig0Var = b.y;
        boolean c = fidVar.c(i) | fidVar.c(0);
        bts btsVar = (bts) fidVar;
        Object Q = btsVar.Q();
        if (c || Q == did.a) {
            Q = new gac(i, 3);
            btsVar.o0(Q);
        }
        return (b) cvw.W(objArr, tig0Var, (sls) Q, btsVar, 0);
    }
}
