package xsna;

import kotlin.jvm.internal.Lambda;

/* compiled from: EnterExitTransition.kt */
/* loaded from: classes11.dex */
public final class ynp extends Lambda implements izs {
    public static final ynp j;
    public static final ynp k;
    public final /* synthetic */ int i;

    static {
        int i = 1;
        j = new ynp(i, 0);
        k = new ynp(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ynp(int i, int i2) {
        super(i);
        this.i = i2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.i) {
            case 0:
                return Integer.valueOf((-((Number) obj).intValue()) / 2);
            default:
                return s3q0.a;
        }
    }
}
