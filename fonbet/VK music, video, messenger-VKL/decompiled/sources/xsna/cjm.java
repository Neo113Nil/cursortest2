package xsna;

import kotlin.NoWhenBranchMatchedException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class cjm implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;

    public /* synthetic */ cjm(long j, int i) {
        this.b = i;
        this.c = j;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i;
        switch (this.b) {
            case 0:
                hpm e = ((xgl0) obj).b().e();
                long j = this.c;
                com.vk.im.engine.models.dialogs.b c = e.c(j);
                boolean z = false;
                if (c != null) {
                    Boolean bool = c.n;
                    boolean booleanValue = bool != null ? bool.booleanValue() : c.m;
                    boolean z2 = c.k > c.g;
                    if (z2) {
                        i = c.l;
                    } else {
                        if (z2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i = c.j;
                    }
                    if (!booleanValue && i <= 0) {
                        e.q(j, Boolean.TRUE);
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            default:
                return Boolean.valueOf(((Long) obj).longValue() <= this.c);
        }
    }
}
