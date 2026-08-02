package xsna;

import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.c;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes12.dex */
public final class voz0 implements c.InterfaceC0114c {
    public final int a;
    public final nlz0 b;
    public final /* synthetic */ yoz0 e;

    public voz0(yoz0 yoz0Var, int i, nlz0 nlz0Var) {
        this.e = yoz0Var;
        this.a = i;
        this.b = nlz0Var;
    }

    @Override // xsna.i380
    public final void g(@NonNull ConnectionResult connectionResult) {
        "beginFailureResolution for ".concat(String.valueOf(connectionResult));
        this.e.d(connectionResult, this.a);
    }
}
