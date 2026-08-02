package xsna;

import android.content.Context;
import android.view.ViewGroup;
import com.vkontakte.android.R;

/* compiled from: FooterErrorProvider.kt */
/* loaded from: classes6.dex */
public final class m6s extends n6s {
    public final uho0 b;

    public m6s(uho0 uho0Var) {
        this.b = uho0Var;
    }

    @Override // xsna.n6s
    public final ee a(Context context, ViewGroup viewGroup) {
        rhl rhlVar = new rhl(context);
        rhlVar.setActionTitle(R.string.vk_common_retry_redesign);
        rhlVar.setRetryClickListener(new l6s(this, 0));
        return rhlVar;
    }
}
