package xsna;

import com.google.android.gms.common.api.Status;
import java.util.Objects;
import xsna.lvf0;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class q201 implements lvf0.c {
    public final /* synthetic */ Status b;

    public q201(w201 w201Var, Status status) {
        this.b = status;
        Objects.requireNonNull(w201Var);
    }

    @Override // xsna.qdg0
    public final Status getStatus() {
        return this.b;
    }
}
