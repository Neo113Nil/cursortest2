package xsna;

import android.content.Context;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vkontakte.android.ChangePasswordActivity;
import com.vkontakte.android.R;
import xsna.mn;

/* compiled from: ChangePasswordActivity.java */
/* loaded from: classes7.dex */
public final class msa extends rpj0<mn.a> {
    public final /* synthetic */ ChangePasswordActivity d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public msa(ChangePasswordActivity changePasswordActivity, Context context) {
        super(context);
        this.d = changePasswordActivity;
    }

    @Override // xsna.hx2
    public final void b(Object obj) {
        mn.a aVar = (mn.a) obj;
        b25 a = o25.a();
        String str = aVar.a;
        String str2 = aVar.b;
        a.t(new h7r0(o25.a().I(), System.currentTimeMillis(), o25.a().v(), o25.a().c(), str, str2));
        cvk.u(R.string.password_changed, false);
        this.d.runOnUiThread(new z27(this, 1));
    }

    @Override // xsna.rpj0, xsna.q76, xsna.hx2
    public final void e(VKApiExecutionException vKApiExecutionException) {
        if (vKApiExecutionException.s() == 15) {
            cvk.u(R.string.old_password_incorrect, false);
        } else if (vKApiExecutionException.s() == 100) {
            cvk.u(R.string.password_error_so_easy, false);
        } else {
            super.e(vKApiExecutionException);
        }
    }
}
