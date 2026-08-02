package xsna;

import android.content.Context;
import java.io.File;
import java.util.List;

/* compiled from: SingleSharedPrefsRepositoryImpl.kt */
/* loaded from: classes5.dex */
public final class awj0 extends xh {
    public final List<n0d0> d;

    public awj0(Context context, iz3 iz3Var) {
        super(context, iz3Var);
        this.d = e43.l(new n0d0(new File(this.b, "marker"), new nvj0(new File(this.b, "singlePrefToggleFileAccountIds")), new nof0(2), new ku70(9)), new n0d0(new File(this.b, "markerV2"), new nvj0(new File(this.b, "singlePrefFullToggleFileAccountIds")), new daz(19), new jo60(9)));
    }

    @Override // xsna.xh
    public final List<n0d0> h() {
        return this.d;
    }
}
