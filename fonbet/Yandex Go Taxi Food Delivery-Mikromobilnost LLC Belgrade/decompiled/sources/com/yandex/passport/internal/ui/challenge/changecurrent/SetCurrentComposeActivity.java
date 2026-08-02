package com.yandex.passport.internal.ui.challenge.changecurrent;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.ui.AppTheme;
import com.yandex.passport.internal.properties.SetCurrentAccountPropertiesImpl;
import defpackage.mkn;
import defpackage.v0d;
import kotlin.Metadata;
import kotlin.Result;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/yandex/passport/internal/ui/challenge/changecurrent/SetCurrentComposeActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onCreate", "(Landroid/os/Bundle;)V", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SetCurrentComposeActivity extends ComponentActivity {
    public static final int $stable = 0;

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        Object b = com.yandex.passport.common.ui.compose.d.b(this, "SetCurrentAccountProperties", new SetCurrentComposeActivity$onCreate$propertiesImpl$1(1, SetCurrentAccountPropertiesImpl.Companion, com.yandex.passport.internal.properties.s.class, "from", "from(Landroid/os/Bundle;)Lcom/yandex/passport/internal/properties/SetCurrentAccountPropertiesImpl;", 0));
        Throwable a = Result.a(b);
        if (a != null) {
            Exception exc = a instanceof Exception ? (Exception) a : null;
            if (exc == null) {
                exc = new RuntimeException(a);
            }
            com.yandex.passport.internal.util.p.c(this, exc);
            return;
        }
        SetCurrentAccountPropertiesImpl setCurrentAccountPropertiesImpl = (SetCurrentAccountPropertiesImpl) b;
        PassportUidImpl uid = setCurrentAccountPropertiesImpl.getUid();
        Uid B = uid != null ? com.yandex.passport.internal.util.p.B(uid) : null;
        com.yandex.passport.common.ui.progress.g a2 = com.yandex.passport.api.mapper.b.a(setCurrentAccountPropertiesImpl.getProgressProperties());
        AppTheme t = com.yandex.passport.internal.util.p.t(setCurrentAccountPropertiesImpl.getTheme());
        g gVar = new g(B, a2, t);
        mkn.a(this, com.yandex.passport.common.ui.compose.d.d(t), com.yandex.passport.common.ui.compose.d.d(t));
        super.onCreate(savedInstanceState);
        v0d.a(this, new androidx.compose.runtime.internal.a(2005074581, new j(1, gVar, this), true));
    }
}
