package xsna;

import androidx.work.Data;
import kotlin.jvm.internal.Lambda;

/* compiled from: ComposeScrollCaptureCallback.android.kt */
/* loaded from: classes11.dex */
public final class mqi extends Lambda implements izs {
    public static final mqi j;
    public static final mqi k;
    public final /* synthetic */ int i;

    static {
        int i = 1;
        j = new mqi(i, 0);
        k = new mqi(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mqi(int i, int i2) {
        super(i);
        this.i = i2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.i) {
            case 0:
                ((Number) obj).longValue();
                return s3q0.a;
            default:
                return (Data.a) obj;
        }
    }
}
