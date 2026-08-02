package yads;

import android.content.Context;
import xsna.s3q0;

/* loaded from: classes10.dex */
public final class hx2 {
    public static final Object j = new Object();
    public static volatile hx2 k;
    public volatile qu2 a;
    public Boolean b;
    public Boolean c;
    public boolean d;
    public boolean e;
    public boolean f = true;
    public boolean g = true;
    public Integer h;
    public boolean i;

    public final boolean a() {
        boolean z;
        synchronized (j) {
            z = this.i;
        }
        return z;
    }

    public final Boolean b() {
        Boolean bool;
        synchronized (j) {
            bool = this.c;
        }
        return bool;
    }

    public final boolean c() {
        boolean z;
        synchronized (j) {
            z = this.e;
        }
        return z;
    }

    public final Boolean d() {
        Boolean bool;
        synchronized (j) {
            bool = this.b;
        }
        return bool;
    }

    public final qu2 a(Context context) {
        qu2 qu2Var;
        qu2 qu2Var2 = this.a;
        if (qu2Var2 != null) {
            return qu2Var2;
        }
        synchronized (j) {
            qu2Var = this.a;
            if (qu2Var == null) {
                zy.a.getClass();
                qu2Var = ((cz) yy.a(context)).a();
                this.a = qu2Var;
            }
        }
        return qu2Var;
    }

    public final void a(Context context, qu2 qu2Var) {
        synchronized (j) {
            this.a = qu2Var;
            zy.a.getClass();
            ((cz) yy.a(context)).a(qu2Var);
            s3q0 s3q0Var = s3q0.a;
        }
    }
}
