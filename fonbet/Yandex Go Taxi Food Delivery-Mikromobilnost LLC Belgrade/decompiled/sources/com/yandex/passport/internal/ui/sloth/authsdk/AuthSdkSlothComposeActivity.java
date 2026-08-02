package com.yandex.passport.internal.ui.sloth.authsdk;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import com.yandex.passport.common.ui.AppTheme;
import com.yandex.passport.sloth.data.SlothParams;
import defpackage.d6z;
import defpackage.mkn;
import defpackage.v0d;
import defpackage.x40;
import kotlin.Metadata;
import kotlin.Result;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/yandex/passport/internal/ui/sloth/authsdk/AuthSdkSlothComposeActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onCreate", "(Landroid/os/Bundle;)V", "a", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AuthSdkSlothComposeActivity extends ComponentActivity {
    public static final int $stable = 0;

    public static final class a extends x40 {
        @Override // defpackage.x40
        public final Intent a(Context context, Object obj) {
            Bundle[] bundleArr = {((SlothParams) obj).toBundle()};
            Bundle bundle = new Bundle();
            bundle.putAll(bundleArr[0]);
            return d6z.B(context, AuthSdkSlothComposeActivity.class, bundle);
        }

        @Override // defpackage.x40
        public final Object c(int i, Intent intent) {
            return c.c(i, intent);
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Object b = com.yandex.passport.common.ui.compose.d.b(this, SlothParams.KEY_SLOTH_PARAMS, new AuthSdkSlothComposeActivity$onCreate$slothParams$1(1, SlothParams.Companion, com.yandex.passport.sloth.data.c.class, "from", "from(Landroid/os/Bundle;)Lcom/yandex/passport/sloth/data/SlothParams;", 0));
        Throwable a2 = Result.a(b);
        if (a2 != null) {
            com.yandex.passport.internal.ui.c.j(this, a2);
            return;
        }
        AppTheme appTheme = AppTheme.FOLLOW_SYSTEM;
        mkn.a(this, com.yandex.passport.common.ui.compose.d.d(appTheme), com.yandex.passport.common.ui.compose.d.d(appTheme));
        int i = 2;
        v0d.a(this, new androidx.compose.runtime.internal.a(1736812677, new com.yandex.passport.internal.ui.challenge.logout.bottomsheet.q(i, appTheme, com.yandex.passport.internal.di.a.a().createAuthSdkSlothComposeComponentBuilder().setSlothParams((SlothParams) b).setProgressProperties(com.yandex.passport.common.ui.progress.g.e).setActivity(this).build(), this), true));
    }
}
