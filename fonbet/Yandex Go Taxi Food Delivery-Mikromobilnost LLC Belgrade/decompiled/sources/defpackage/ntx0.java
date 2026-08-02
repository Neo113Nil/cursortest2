package defpackage;

import com.google.android.gms.common.api.Status;

/* loaded from: classes11.dex */
public class ntx0 {
    public static void a(Status status, Object obj, atx0 atx0Var) {
        if (status.isSuccess()) {
            atx0Var.a(obj);
        } else {
            atx0Var.a.r(sn2.a(status));
        }
    }

    public static boolean b(Status status, Object obj, atx0 atx0Var) {
        return status.isSuccess() ? atx0Var.a.u(obj) : atx0Var.b(sn2.a(status));
    }
}
