package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import com.yandex.passport.common.ui.AppTheme;
import com.yandex.passport.internal.properties.PassportDeleteAccountPropertiesImpl;
import com.yandex.passport.internal.properties.PassportLogoutPropertiesImpl;
import com.yandex.passport.internal.ui.challenge.delete.DeleteAccountActivity;
import com.yandex.passport.internal.ui.challenge.delete.DeleteForeverActivity;
import com.yandex.passport.internal.ui.challenge.logout.LogoutActivity;
import com.yandex.passport.internal.ui.challenge.logout.LogoutBehaviour;
import com.yandex.passport.internal.ui.challenge.logout.LogoutComposeActivity;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import defpackage.d6z;
import defpackage.jl40;
import defpackage.m50;
import defpackage.mkn;
import defpackage.v0d;
import defpackage.x40;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0003\u001d\u001e\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R&\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R&\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018¨\u0006 "}, d2 = {"Lcom/yandex/passport/internal/ui/challenge/logout/bottomsheet/LogoutBottomSheetComposeActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "Lcom/yandex/passport/api/r0;", TarifficatorScenarioActivity.RESULT_KEY, "Lzy11;", "onDeleteResult", "(Lcom/yandex/passport/api/r0;)V", "", "onLogoutResult", "(I)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "", "shouldShowBottomSheet", "Z", "Lm50;", "Lkotlin/Pair;", "Lcom/yandex/passport/internal/properties/PassportLogoutPropertiesImpl;", "Lcom/yandex/passport/internal/ui/challenge/logout/LogoutBehaviour;", "logoutLauncher", "Lm50;", "composeLogoutLauncher", "Lcom/yandex/passport/internal/properties/PassportDeleteAccountPropertiesImpl;", "deleteLauncher", "composeDeleteLauncher", "b", "c", "a", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LogoutBottomSheetComposeActivity extends ComponentActivity {
    public static final int $stable = 8;
    private boolean shouldShowBottomSheet = true;
    private final m50 logoutLauncher = registerForActivityResult(new b(), new n(this, 3));
    private final m50 composeLogoutLauncher = registerForActivityResult(new c(), new n(this, 1));
    private final m50 deleteLauncher = registerForActivityResult(new a(), new n(this, 2));
    private final m50 composeDeleteLauncher = registerForActivityResult(new DeleteAccountActivity.a(), new n(this, 0));

    public static final class a extends x40 {
        @Override // defpackage.x40
        public final Intent a(Context context, Object obj) {
            DeleteForeverActivity.Companion.getClass();
            Bundle[] bundleArr = {((PassportDeleteAccountPropertiesImpl) obj).toBundle()};
            Bundle bundle = new Bundle();
            bundle.putAll(bundleArr[0]);
            return d6z.B(context, DeleteForeverActivity.class, bundle);
        }

        @Override // defpackage.x40
        public final Object c(int i, Intent intent) {
            return com.yandex.passport.api.r.f(i, intent);
        }
    }

    public static final class b extends x40 {
        @Override // defpackage.x40
        public final Intent a(Context context, Object obj) {
            Pair pair = (Pair) obj;
            com.yandex.passport.internal.ui.challenge.logout.a aVar = LogoutActivity.Companion;
            PassportLogoutPropertiesImpl passportLogoutPropertiesImpl = (PassportLogoutPropertiesImpl) pair.c();
            LogoutBehaviour logoutBehaviour = (LogoutBehaviour) pair.f();
            aVar.getClass();
            return com.yandex.passport.internal.ui.challenge.logout.a.a(context, passportLogoutPropertiesImpl, logoutBehaviour);
        }

        @Override // defpackage.x40
        public final Object c(int i, Intent intent) {
            return Integer.valueOf(i);
        }
    }

    public static final class c extends x40 {
        @Override // defpackage.x40
        public final Intent a(Context context, Object obj) {
            Pair pair = (Pair) obj;
            com.yandex.passport.internal.ui.challenge.logout.g gVar = LogoutComposeActivity.Companion;
            PassportLogoutPropertiesImpl passportLogoutPropertiesImpl = (PassportLogoutPropertiesImpl) pair.c();
            LogoutBehaviour logoutBehaviour = (LogoutBehaviour) pair.f();
            gVar.getClass();
            return com.yandex.passport.internal.ui.challenge.logout.g.a(context, passportLogoutPropertiesImpl, logoutBehaviour);
        }

        @Override // defpackage.x40
        public final Object c(int i, Intent intent) {
            return Integer.valueOf(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onDeleteResult(com.yandex.passport.api.r0 result) {
        if (jl40.l(result, com.yandex.passport.api.p0.a)) {
            return;
        }
        this.shouldShowBottomSheet = false;
        com.yandex.passport.internal.ui.c.k(this, com.yandex.passport.internal.ui.c.C(result));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onLogoutResult(int result) {
        this.shouldShowBottomSheet = false;
        setResult(result, new Intent());
        finish();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Object b2 = com.yandex.passport.common.ui.compose.d.b(this, "PassportLogoutProperties", new LogoutBottomSheetComposeActivity$onCreate$propertiesImpl$1(1, PassportLogoutPropertiesImpl.Companion, com.yandex.passport.internal.properties.l.class, "from", "from(Landroid/os/Bundle;)Lcom/yandex/passport/internal/properties/PassportLogoutPropertiesImpl;", 0));
        Throwable a2 = Result.a(b2);
        if (a2 != null) {
            com.yandex.passport.internal.ui.c.j(this, a2);
            return;
        }
        PassportLogoutPropertiesImpl passportLogoutPropertiesImpl = (PassportLogoutPropertiesImpl) b2;
        com.yandex.passport.internal.ui.challenge.logout.v b3 = com.yandex.passport.internal.ui.challenge.logout.m.b(passportLogoutPropertiesImpl);
        AppTheme appTheme = b3.b;
        mkn.a(this, com.yandex.passport.common.ui.compose.d.d(appTheme), com.yandex.passport.common.ui.compose.d.d(appTheme));
        v0d.a(this, new androidx.compose.runtime.internal.a(-626131502, new com.yandex.passport.internal.flags.presentation.s(b3, this, com.yandex.passport.internal.di.a.a().createLogoutBottomSheetComposeComponentBuilder().setProperties(b3).build(), passportLogoutPropertiesImpl, 1), true));
    }
}
