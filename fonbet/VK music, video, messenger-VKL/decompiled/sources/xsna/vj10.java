package xsna;

import androidx.work.Data;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;

/* compiled from: MasterIPCClient.kt */
/* loaded from: classes5.dex */
public final class vj10 extends Lambda implements izs {
    public static final vj10 j;
    public static final vj10 k;
    public final /* synthetic */ int i;

    static {
        int i = 1;
        j = new vj10(i, 0);
        k = new vj10(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vj10(int i, int i2) {
        super(i);
        this.i = i2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.i) {
            case 0:
                return new Result(new Result.Failure((Exception) obj));
            default:
                return (Data.a) obj;
        }
    }
}
