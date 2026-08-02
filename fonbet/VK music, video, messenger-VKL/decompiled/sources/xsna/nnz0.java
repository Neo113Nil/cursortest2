package xsna;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import xsna.qdg0;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes12.dex */
public final class nnz0<R extends qdg0> extends BasePendingResult<R> {
    public final AbstractSafeParcelable a;

    /* JADX WARN: Multi-variable type inference failed */
    public nnz0(com.google.android.gms.common.api.c cVar, qdg0 qdg0Var) {
        super(cVar);
        this.a = (AbstractSafeParcelable) qdg0Var;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final R createFailedResult(Status status) {
        return (R) this.a;
    }
}
