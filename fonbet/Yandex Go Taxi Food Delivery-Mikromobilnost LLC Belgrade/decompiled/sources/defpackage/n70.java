package defpackage;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.x0;

/* loaded from: classes10.dex */
public final class n70 extends x0 {
    public final zo31 N;
    public Object O;
    public final Context P;
    public tls Q;
    public sls R;
    public sls S;
    public sls T;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n70(zo31 zo31Var) {
        super(r0);
        View root = zo31Var.getRoot();
        this.N = zo31Var;
        this.O = wfz.w;
        this.P = root.getContext();
    }

    public final void W(tls tlsVar) {
        if (this.Q == null) {
            this.Q = tlsVar;
        } else {
            ny61.r("bind { ... } is already defined. Only one bind { ... } is allowed.");
        }
    }

    public final zo31 X() {
        return this.N;
    }

    public final Context Y() {
        return this.P;
    }

    public final Object Z() {
        Object obj = this.O;
        if (obj != wfz.w) {
            return obj;
        }
        ny61.g("Item has not been set yet. That is an internal issue. Please report at https://github.com/sockeqwe/AdapterDelegates");
        return null;
    }

    public final void a0(sls slsVar) {
        if (this.S == null) {
            this.S = slsVar;
        } else {
            ny61.r("onViewAttachedToWindow { ... } is already defined. Only one onViewAttachedToWindow { ... } is allowed.");
        }
    }

    public final void b0(sls slsVar) {
        if (this.R == null) {
            this.R = slsVar;
        } else {
            ny61.r("onViewRecycled { ... } is already defined. Only one onViewRecycled { ... } is allowed.");
        }
    }
}
