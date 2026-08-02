package xsna;

import android.content.Context;
import java.io.File;
import java.util.List;

/* compiled from: VkSingleSharedPrefsRepositoryImpl.kt */
/* loaded from: classes11.dex */
public final class zjv0 extends xh {
    public final List<n0d0> d;

    public zjv0(Context context, lq6 lq6Var) {
        super(context, lq6Var);
        this.d = e43.l(new n0d0(new File(this.b, "marker"), new nvj0(new File(this.b, "singlePrefToggleFileAccountIds")), new xu2(16), new mb3(23)), new n0d0(new File(this.b, "markerV2"), new nvj0(new File(this.b, "singlePrefFullToggleFileAccountIds")), new ox4(16), new jvg(15)));
    }

    @Override // xsna.xh
    public final List<n0d0> h() {
        return this.d;
    }
}
