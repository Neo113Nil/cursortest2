package xsna;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public final class ce01 extends wvz0 {
    public final /* synthetic */ TaskCompletionSource a;

    public ce01(cm01 cm01Var, TaskCompletionSource taskCompletionSource) {
        this.a = taskCompletionSource;
        Objects.requireNonNull(cm01Var);
    }

    @Override // xsna.fwz0
    public final void j(Bundle bundle) {
        this.a.setResult(bundle);
    }
}
