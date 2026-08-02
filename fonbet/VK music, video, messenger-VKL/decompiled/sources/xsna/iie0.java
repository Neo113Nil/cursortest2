package xsna;

import kotlin.Result;
import kotlin.jvm.internal.Lambda;

/* compiled from: PushIPCClientImpl.kt */
/* loaded from: classes5.dex */
public final class iie0 extends Lambda implements izs {
    public static final iie0 j;
    public static final iie0 k;
    public final /* synthetic */ int i;

    static {
        int i = 1;
        j = new iie0(i, 0);
        k = new iie0(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iie0(int i, int i2) {
        super(i);
        this.i = i2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.i) {
            case 0:
                return new Result(new Result.Failure((Exception) obj));
            default:
                return s3q0.a;
        }
    }
}
