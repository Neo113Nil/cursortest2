package com.yandex.passport.internal.ui.challenge.delete;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.common.ui.AppTheme;
import com.yandex.passport.internal.properties.PassportDeleteAccountPropertiesImpl;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import defpackage.d6z;
import defpackage.mkn;
import defpackage.v0d;
import defpackage.w511;
import defpackage.x40;
import kotlin.Metadata;
import kotlin.Result;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0011\u001a\u00020\u00108\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/yandex/passport/internal/ui/challenge/delete/DeleteAccountActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "Lcom/yandex/passport/internal/ui/challenge/delete/k1;", TarifficatorScenarioActivity.RESULT_KEY, "Lzy11;", "finishWithResult", "(Lcom/yandex/passport/internal/ui/challenge/delete/k1;)V", "", "resultCodeFor", "(Lcom/yandex/passport/internal/ui/challenge/delete/k1;)I", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/yandex/passport/internal/ui/challenge/delete/b;", "component", "Lcom/yandex/passport/internal/ui/challenge/delete/b;", "getComponent$passport_release", "()Lcom/yandex/passport/internal/ui/challenge/delete/b;", "setComponent$passport_release", "(Lcom/yandex/passport/internal/ui/challenge/delete/b;)V", "a", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DeleteAccountActivity extends ComponentActivity {
    public static final int $stable = 8;
    public b component;

    public static final class a extends x40 {
        @Override // defpackage.x40
        public final Intent a(Context context, Object obj) {
            Bundle[] bundleArr = {((PassportDeleteAccountPropertiesImpl) obj).toBundle()};
            Bundle bundle = new Bundle();
            bundle.putAll(bundleArr[0]);
            return d6z.B(context, DeleteAccountActivity.class, bundle);
        }

        @Override // defpackage.x40
        public final Object c(int i, Intent intent) {
            return com.yandex.passport.api.r.f(i, intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishWithResult(k1 result) {
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "activity finishWithResult " + result, 8);
        }
        setResult(resultCodeFor(result), new Intent());
        finish();
    }

    private final int resultCodeFor(k1 result) {
        if (result instanceof j1) {
            return -1;
        }
        if (result instanceof g1) {
            return 0;
        }
        if (result instanceof i1) {
            return 6;
        }
        if (result instanceof h1) {
            return 13;
        }
        w511.b();
        return 0;
    }

    public final b getComponent$passport_release() {
        b bVar = this.component;
        if (bVar != null) {
            return bVar;
        }
        return null;
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Object b = com.yandex.passport.common.ui.compose.d.b(this, "PassportDeleteAccountProperties", new DeleteAccountActivity$onCreate$propertiesImpl$1(1, PassportDeleteAccountPropertiesImpl.Companion, com.yandex.passport.internal.properties.k.class, "from", "from(Landroid/os/Bundle;)Lcom/yandex/passport/internal/properties/PassportDeleteAccountPropertiesImpl;", 0));
        Throwable a2 = Result.a(b);
        if (a2 != null) {
            com.yandex.passport.internal.ui.c.j(this, a2);
            return;
        }
        PassportDeleteAccountPropertiesImpl passportDeleteAccountPropertiesImpl = (PassportDeleteAccountPropertiesImpl) b;
        Uid B = com.yandex.passport.internal.util.p.B(passportDeleteAccountPropertiesImpl.getUid());
        com.yandex.passport.common.ui.progress.g a3 = com.yandex.passport.api.mapper.b.a(passportDeleteAccountPropertiesImpl.getProgressProperties());
        AppTheme t = com.yandex.passport.internal.util.p.t(passportDeleteAccountPropertiesImpl.getTheme());
        d dVar = new d(B, a3, t, passportDeleteAccountPropertiesImpl.getHeaders());
        mkn.a(this, com.yandex.passport.common.ui.compose.d.d(t), com.yandex.passport.common.ui.compose.d.d(t));
        setComponent$passport_release(com.yandex.passport.internal.di.a.a().createDeleteAccountComponentBuilder().setActivity(this).setDeleteAccountProperties(dVar).build());
        v0d.a(this, new androidx.compose.runtime.internal.a(1884757135, new com.yandex.passport.internal.flags.presentation.f1(3, t, this), true));
    }

    public final void setComponent$passport_release(b bVar) {
        this.component = bVar;
    }
}
