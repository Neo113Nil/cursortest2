package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes11.dex */
public final class btb1 {
    public final e091 a;
    public final AtomicLong b;

    public btb1(Context context, int i) {
        String str = "mlkit:vision";
        switch (i) {
            case 1:
                this.b = new AtomicLong(-1L);
                this.a = vez0.v(context, new qdy0(str));
                break;
            default:
                this.b = new AtomicLong(-1L);
                this.a = vez0.v(context, new qdy0(str));
                break;
        }
    }
}
