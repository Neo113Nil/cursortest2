package xsna;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import xsna.mov;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes12.dex */
public final class ezk0 extends mov.a {
    public final ue6<Status> a;

    public ezk0(@NonNull ue6<Status> ue6Var) {
        this.a = ue6Var;
    }

    @Override // xsna.mov
    public final void onResult(@NonNull Status status) {
        this.a.setResult(status);
    }
}
