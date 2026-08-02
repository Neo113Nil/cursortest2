package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes11.dex */
public final class ms91 extends dn91 {
    public wp91 A;
    public ScheduledFuture B;

    @Override // defpackage.ql91
    public final String a() {
        wp91 wp91Var = this.A;
        ScheduledFuture scheduledFuture = this.B;
        if (wp91Var == null) {
            return null;
        }
        String p = oyr.p("inputFuture=[", wp91Var.toString(), "]");
        if (scheduledFuture != null) {
            long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
            if (delay > 0) {
                return p + ", remaining delay=[" + delay + " ms]";
            }
        }
        return p;
    }

    @Override // defpackage.ql91
    public final void b() {
        wp91 wp91Var = this.A;
        if ((wp91Var != null) & (this.a instanceof dl91)) {
            Object obj = this.a;
            wp91Var.cancel((obj instanceof dl91) && ((dl91) obj).a);
        }
        ScheduledFuture scheduledFuture = this.B;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.A = null;
        this.B = null;
    }
}
