package com.yandex.passport.internal.ui.challenge.logout;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import com.yandex.passport.common.ui.AppTheme;
import com.yandex.passport.internal.properties.PassportLogoutPropertiesImpl;
import defpackage.mkn;
import defpackage.v0d;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Result;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \t2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/yandex/passport/internal/ui/challenge/logout/LogoutComposeActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onCreate", "(Landroid/os/Bundle;)V", "Companion", "com/yandex/passport/internal/ui/challenge/logout/g", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LogoutComposeActivity extends ComponentActivity {
    public static final int $stable = 0;
    public static final g Companion = new g();

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0057, code lost:
    
        if (r2 == null) goto L10;
     */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreate(Bundle savedInstanceState) {
        LogoutBehaviour logoutBehaviour;
        Object b = com.yandex.passport.common.ui.compose.d.b(this, "LogoutProperties", new LogoutComposeActivity$onCreate$propertiesImpl$1(1, PassportLogoutPropertiesImpl.Companion, com.yandex.passport.internal.properties.l.class, "from", "from(Landroid/os/Bundle;)Lcom/yandex/passport/internal/properties/PassportLogoutPropertiesImpl;", 0));
        Throwable a = Result.a(b);
        if (a != null) {
            Exception exc = a instanceof Exception ? (Exception) a : null;
            if (exc == null) {
                exc = new RuntimeException(a);
            }
            com.yandex.passport.internal.util.p.c(this, exc);
            return;
        }
        v b2 = m.b((PassportLogoutPropertiesImpl) b);
        AppTheme appTheme = b2.b;
        mkn.a(this, com.yandex.passport.common.ui.compose.d.d(appTheme), com.yandex.passport.common.ui.compose.d.d(appTheme));
        super.onCreate(savedInstanceState);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            LogoutBehaviour.Companion.getClass();
            extras.setClassLoader(com.yandex.passport.internal.util.p.class.getClassLoader());
            Serializable serializable = extras.getSerializable("passport-logout-behaviour");
            logoutBehaviour = serializable instanceof LogoutBehaviour ? (LogoutBehaviour) serializable : null;
        }
        logoutBehaviour = LogoutBehaviour.DROP_CLIENT_TOKEN;
        v0d.a(this, new androidx.compose.runtime.internal.a(-198413470, new i(b2, com.yandex.passport.internal.di.a.a().createLogoutComposeComponentBuilder().setUid(b2.a).setTheme(appTheme).setProgressProperties(b2.e).setLogoutBehaviour(logoutBehaviour).build(), this), true));
    }
}
