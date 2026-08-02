package xsna;

import android.content.Context;
import com.vkontakte.android.R;

/* compiled from: BlackParams.kt */
/* loaded from: classes6.dex */
public final class yd7 extends gpg0 {
    public final int k;
    public final int l;

    public yd7(m0g0 m0g0Var) {
        super(m0g0Var);
        Context context = e43.a;
        this.k = (context == null ? null : context).getColor(R.color.vk_black);
        Context context2 = e43.a;
        this.l = (context2 != null ? context2 : null).getColor(R.color.vk_white);
    }

    @Override // xsna.ovo0
    public final Integer b() {
        return Integer.valueOf(this.l);
    }

    @Override // xsna.ovo0
    public final int n() {
        return this.k;
    }
}
