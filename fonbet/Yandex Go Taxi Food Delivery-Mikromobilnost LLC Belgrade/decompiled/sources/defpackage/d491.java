package defpackage;

import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* loaded from: classes11.dex */
public abstract class d491 extends ust {
    public static final ngz k;

    static {
        new pm2();
        new esw(12);
        k = new ngz("Auth", new String[]{"GoogleAuthServiceClient"});
    }

    public static void e(Status status, Parcelable parcelable, atx0 atx0Var) {
        if (ntx0.b(status, parcelable, atx0Var)) {
            return;
        }
        k.a("The task is already complete.", new Object[0]);
    }
}
