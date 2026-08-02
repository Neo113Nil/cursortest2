package xsna;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: CrashlyticsOriginAnalyticsEventLogger.java */
/* loaded from: classes.dex */
public final class i5k implements ux1 {

    @NonNull
    public final ex1 b;

    public i5k(@NonNull ex1 ex1Var) {
        this.b = ex1Var;
    }

    @Override // xsna.ux1
    public final void a(@Nullable Bundle bundle) {
        this.b.d("clx", "_ae", bundle);
    }
}
