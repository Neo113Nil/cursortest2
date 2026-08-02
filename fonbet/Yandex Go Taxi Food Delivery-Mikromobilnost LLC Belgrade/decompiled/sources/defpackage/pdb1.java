package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.foundation.gestures.snapping.a;
import androidx.compose.foundation.lazy.b;

/* loaded from: classes11.dex */
public abstract class pdb1 {
    public static final String a(int i) {
        if (i == 0) {
            return "DECLINED";
        }
        if (i == 1) {
            return "CANCELED_BY_CALLER";
        }
        if (i == 2) {
            return "USER_DISCONNECTED";
        }
        if (i == 3) {
            return "TIMEOUT";
        }
        if (i == 4) {
            return "EMPTY";
        }
        if (i == 5) {
            return "ABANDONED";
        }
        z83.i();
        return null;
    }

    public static Activity b(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return b(((ContextWrapper) context).getBaseContext());
        }
        kbs.f(context, "Unsupported context ");
        return null;
    }

    public static final a c(b bVar, fid fidVar) {
        xpb1 xpb1Var = xpb1.R;
        boolean k = ((bts) fidVar).k(bVar);
        bts btsVar = (bts) fidVar;
        Object Q = btsVar.Q();
        if (k || Q == did.a) {
            Q = new z6y(bVar, xpb1Var);
            btsVar.o0(Q);
        }
        return androidx.compose.foundation.gestures.snapping.b.e((j1t0) Q, btsVar);
    }
}
