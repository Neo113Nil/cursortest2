package com.yandex.passport.internal.ui.sloth.webcard;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import com.yandex.passport.common.ui.AppTheme;
import com.yandex.passport.sloth.data.SlothParams;
import defpackage.d6z;
import defpackage.jl40;
import defpackage.mkn;
import defpackage.v0d;
import defpackage.x40;
import kotlin.Metadata;
import kotlin.Result;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/yandex/passport/internal/ui/sloth/webcard/WebCardComposeActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onCreate", "(Landroid/os/Bundle;)V", "a", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WebCardComposeActivity extends ComponentActivity {
    public static final int $stable = 0;

    public static final class a extends x40 {
        @Override // defpackage.x40
        public final Intent a(Context context, Object obj) {
            Bundle[] bundleArr = {((SlothParams) obj).toBundle()};
            Bundle bundle = new Bundle();
            bundle.putAll(bundleArr[0]);
            return d6z.B(context, WebCardComposeActivity.class, bundle);
        }

        @Override // defpackage.x40
        public final Object c(int i, Intent intent) {
            return v.b(i, intent);
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        Object failure;
        Bundle extras;
        super.onCreate(savedInstanceState);
        try {
            extras = getIntent().getExtras();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (extras == null) {
            throw new IllegalStateException("no extras data");
        }
        if (jl40.l(getIntent().getAction(), "com.yandex.passport.action.DISPLAY_CODE")) {
            failure = new i0(extras);
        } else {
            SlothParams.Companion.getClass();
            failure = new j0(com.yandex.passport.sloth.data.c.a(extras));
        }
        Throwable a2 = Result.a(failure);
        if (a2 != null) {
            com.yandex.passport.internal.ui.c.k(this, com.yandex.passport.internal.ui.sloth.e.p(new n0(a2)));
            return;
        }
        AppTheme appTheme = AppTheme.FOLLOW_SYSTEM;
        mkn.a(this, com.yandex.passport.common.ui.compose.d.d(appTheme), com.yandex.passport.common.ui.compose.d.d(appTheme));
        int i = 5;
        v0d.a(this, new androidx.compose.runtime.internal.a(-80602397, new com.yandex.passport.internal.ui.challenge.logout.bottomsheet.q(i, appTheme, com.yandex.passport.internal.di.a.a().createWebCardComposeComponentBuilder().setInputParams((k0) failure).setActivity(this).build(), this), true));
    }
}
