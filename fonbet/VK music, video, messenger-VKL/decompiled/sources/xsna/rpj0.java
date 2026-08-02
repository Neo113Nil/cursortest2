package xsna;

import android.content.Context;
import com.vk.api.sdk.exceptions.VKApiExecutionException;

/* compiled from: SimpleCallback.java */
@Deprecated
/* loaded from: classes7.dex */
public abstract class rpj0<T> extends q76 {
    public final pbs c;

    public rpj0(pbs pbsVar) {
        this.c = pbsVar;
    }

    @Override // xsna.q76, xsna.hx2
    public void e(VKApiExecutionException vKApiExecutionException) {
        pbs pbsVar = this.c;
        if (pbsVar instanceof cbs) {
            ((cbs) pbsVar).onError(vKApiExecutionException);
            return;
        }
        if (pbsVar != null) {
            Context B = pbsVar.B();
            this.b = B;
            if (B != null) {
                h03.b(vKApiExecutionException);
                return;
            }
        }
        super.e(vKApiExecutionException);
    }
}
