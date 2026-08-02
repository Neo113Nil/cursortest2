package defpackage;

import com.squareup.moshi.JsonAdapter;
import kotlin.Result;

/* loaded from: classes.dex */
public final class o1r implements m1r {
    public final sb3 a;
    public final au50 b;

    public o1r(sb3 sb3Var, au50 au50Var) {
        this.a = sb3Var;
        this.b = au50Var;
    }

    @Override // defpackage.m1r
    public final Object a(Object obj) {
        Object failure;
        Object failure2;
        Object obj2 = null;
        try {
            sb3 sb3Var = this.a;
            synchronized (sb3Var) {
                failure = sb3Var.c.exists() ? g3r.e(sb3Var.c) : null;
            }
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            jgz.a.h("FileStorageImpl");
            jgz.d(a, "Failed to read from " + this.a, new Object[0]);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        String str = (String) failure;
        if (str != null && !evu0.J(str)) {
            try {
                failure2 = ((JsonAdapter) this.b.b).fromJson(str);
            } catch (Throwable th2) {
                failure2 = new Result.Failure(th2);
            }
            if (failure2 == null) {
                throw new IllegalArgumentException("Failed to parse '" + str + "'");
            }
            Throwable a2 = Result.a(failure2);
            if (a2 != null) {
                jgz.a.h("FileStorageImpl");
                jgz.d(a2, "Failed to deserialize '" + str + "'", new Object[0]);
            }
            if (!(failure2 instanceof Result.Failure)) {
                obj2 = failure2;
            }
        }
        return obj2 == null ? obj : obj2;
    }

    @Override // defpackage.m1r
    public final void set(Object obj) {
        Object failure;
        sb3 sb3Var = this.a;
        try {
            sb3Var.a(((JsonAdapter) this.b.b).toJson(obj));
            failure = zy11.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            jgz.a.h("FileStorageImpl");
            jgz.d(a, "Failed to write to " + sb3Var, new Object[0]);
        }
    }
}
