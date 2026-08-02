package xsna;

import android.accounts.AccountAuthenticatorResponse;
import android.content.Context;
import android.os.Bundle;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.vk.auth.main.AuthActivity;
import com.vk.dto.common.id.UserId;
import java.io.File;
import kotlin.text.Regex;
import xsna.i9r0;

/* compiled from: VKAccountManagerInteractorImpl.kt */
/* loaded from: classes11.dex */
public final class r6r0 implements kp {
    @Override // xsna.kp
    public final Bundle a(AccountAuthenticatorResponse accountAuthenticatorResponse) {
        Bundle bundle = new Bundle(1);
        int i = AuthActivity.W;
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        bundle.putParcelable(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, AuthActivity.a.a(context).putExtra("accountAuthenticatorResponse", accountAuthenticatorResponse));
        return bundle;
    }

    @Override // xsna.kp
    public final void b(UserId userId) {
        synchronized (i9r0.a) {
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            m6r0 f = q6r0.f();
            r55 r55Var = r55.a;
            ((yui) r55.j()).b(context, userId);
            File a = i9r0.a.a(userId);
            Regex regex = com.vk.core.files.a.a;
            vhk0.b(a);
            if (epx.f(f.y(), userId)) {
                obu0.c(context);
            }
        }
        o25.a().O(new t200(76, userId, "user", null, true, false, false));
        ((com.vk.superapp.multiaccount.api.d) i9r0.b.getValue()).c();
    }
}
