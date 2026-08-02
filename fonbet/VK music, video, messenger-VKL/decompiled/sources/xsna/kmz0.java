package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.a;
import java.util.Objects;
import java.util.Set;
import xsna.rd6;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes.dex */
public final class kmz0 implements rd6.c {
    public final a.f a;
    public final ty2 b;

    @Nullable
    public com.google.android.gms.common.internal.b c;

    @Nullable
    public Set d;
    public boolean e;
    public final /* synthetic */ d9u f;

    public kmz0(d9u d9uVar, a.f fVar, ty2 ty2Var) {
        Objects.requireNonNull(d9uVar);
        this.f = d9uVar;
        this.c = null;
        this.d = null;
        this.e = false;
        this.a = fVar;
        this.b = ty2Var;
    }

    @Override // xsna.rd6.c
    public final void a(@NonNull ConnectionResult connectionResult) {
        this.f.o.post(new jmz0(this, connectionResult));
    }

    public final void b(ConnectionResult connectionResult) {
        hmz0 hmz0Var = (hmz0) this.f.k.get(this.b);
        if (hmz0Var != null) {
            hmz0Var.n(connectionResult);
        }
    }
}
