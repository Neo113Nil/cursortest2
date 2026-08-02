package com.yandex.passport.internal.ui.sloth.plusdevices;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import com.yandex.passport.api.exception.PassportAccountNotAuthorizedException;
import com.yandex.passport.api.exception.PassportDeviceValidationException;
import com.yandex.passport.api.exception.PassportRuntimeUnknownException;
import com.yandex.passport.api.l1;
import com.yandex.passport.api.m1;
import com.yandex.passport.api.n1;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.ui.AppTheme;
import com.yandex.passport.internal.properties.ManagingPlusDevicesPropertiesImpl;
import defpackage.mkn;
import defpackage.v0d;
import defpackage.x40;
import kotlin.Metadata;
import kotlin.Result;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/yandex/passport/internal/ui/sloth/plusdevices/ManagingPlusDevicesActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onCreate", "(Landroid/os/Bundle;)V", "a", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ManagingPlusDevicesActivity extends ComponentActivity {
    public static final int $stable = 0;

    /* loaded from: classes8.dex */
    public static final class a extends x40 {
        @Override // defpackage.x40
        public final Intent a(Context context, Object obj) {
            Intent intent = new Intent(context, (Class<?>) ManagingPlusDevicesActivity.class);
            intent.putExtras(com.yandex.passport.internal.a0.c0((l1) obj).toBundle());
            return intent;
        }

        @Override // defpackage.x40
        public final Object c(int i, Intent intent) {
            return i != -1 ? i != 0 ? i != 401 ? i != 1111 ? new n1(new PassportRuntimeUnknownException("Unexpected error")) : new n1(new PassportDeviceValidationException()) : new n1(new PassportAccountNotAuthorizedException()) : m1.a : m1.b;
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Object b = com.yandex.passport.common.ui.compose.d.b(this, "PassportManagingPlusDevicesProperties", new ManagingPlusDevicesActivity$onCreate$propertiesImpl$1(1, ManagingPlusDevicesPropertiesImpl.Companion, com.yandex.passport.internal.properties.j.class, "from", "from(Landroid/os/Bundle;)Lcom/yandex/passport/internal/properties/ManagingPlusDevicesPropertiesImpl;", 0));
        Throwable a2 = Result.a(b);
        if (a2 != null) {
            com.yandex.passport.internal.ui.c.j(this, a2);
            return;
        }
        ManagingPlusDevicesPropertiesImpl managingPlusDevicesPropertiesImpl = (ManagingPlusDevicesPropertiesImpl) b;
        Uid B = com.yandex.passport.internal.util.p.B(managingPlusDevicesPropertiesImpl.getUid());
        AppTheme t = com.yandex.passport.internal.util.p.t(managingPlusDevicesPropertiesImpl.getTheme());
        o oVar = new o(B, t, managingPlusDevicesPropertiesImpl.getService(), managingPlusDevicesPropertiesImpl.getBrand(), managingPlusDevicesPropertiesImpl.isForceShowManagingPlusDevices());
        mkn.a(this, com.yandex.passport.common.ui.compose.d.d(t), com.yandex.passport.common.ui.compose.d.d(t));
        v0d.a(this, new androidx.compose.runtime.internal.a(207206102, new com.yandex.passport.internal.ui.challenge.logout.bottomsheet.q(3, t, com.yandex.passport.internal.di.a.a().createManagingPlusDevicesComponentBuilder().setProperties(oVar).setProgressProperties(com.yandex.passport.common.ui.progress.g.e).setActivity(this).build(), this), true));
    }
}
