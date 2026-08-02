package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.mzx;
import xsna.vzx;

/* compiled from: JoinCallFeature.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class jzx extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(Throwable th) {
        Throwable th2 = th;
        kzx kzxVar = (kzx) this.receiver;
        if (th2 instanceof VKApiExecutionException) {
            kzxVar.getClass();
            if (((VKApiExecutionException) th2).s() == 960) {
                kzxVar.n.b(mzx.g.a);
                return s3q0.a;
            }
        }
        kzxVar.o.b(new vzx.a(th2));
        return s3q0.a;
    }
}
