package xsna;

import android.content.Context;
import com.vkontakte.android.R;
import xsna.eeu0;

/* compiled from: UseCredentialRequester.kt */
/* loaded from: classes15.dex */
public final class zfq0 {
    public final Context a;

    public zfq0(Context context) {
        this.a = context;
    }

    public final void a(fg1 fg1Var, myh myhVar) {
        eeu0.a aVar = new eeu0.a(hnj.a(this.a), R.style.VkAlertDialogNewTheme);
        aVar.q(R.string.vk_auth_use_smart_lock_data);
        aVar.setPositiveButton(R.string.vk_auth_use_smart_lock_data_positive, new w4p(fg1Var, 3));
        aVar.setNegativeButton(R.string.vk_auth_use_smart_lock_data_negative, new iwd(myhVar, 1));
        aVar.a.n = new ryb0(1, myhVar);
        aVar.a(true);
        aVar.create().show();
    }
}
