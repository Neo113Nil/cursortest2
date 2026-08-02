package xsna;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Objects;
import xsna.cv90;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes12.dex */
public final class gqz0 implements cv90.a {
    public final /* synthetic */ BasePendingResult a;
    public final /* synthetic */ qkz0 b;

    public gqz0(qkz0 qkz0Var, BasePendingResult basePendingResult) {
        this.a = basePendingResult;
        Objects.requireNonNull(qkz0Var);
        this.b = qkz0Var;
    }

    @Override // xsna.cv90.a
    public final void a(Status status) {
        this.b.a.remove(this.a);
    }
}
