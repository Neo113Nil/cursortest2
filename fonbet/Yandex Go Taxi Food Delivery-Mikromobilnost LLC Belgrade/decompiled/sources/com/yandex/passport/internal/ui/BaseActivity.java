package com.yandex.passport.internal.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Base64;
import android.view.MenuItem;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import com.yandex.passport.R;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.internal.analytics.c0;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.flags.experiments.ExperimentsUpdater$LoadingStrategy;
import com.yandex.passport.internal.t;
import defpackage.vng;
import defpackage.w53;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

@Deprecated
/* loaded from: classes8.dex */
public class BaseActivity extends AppCompatActivity {
    private com.yandex.passport.internal.core.accounts.j androidAccountHelper;
    private com.yandex.passport.legacy.lx.g checkAuthenticatorCanceller;
    public c0 eventReporter;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$runCheckAuthenticator$0(String str) {
        if (str != null) {
            showInvalidSignatureDialog(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$runCheckAuthenticator$1(Throwable th) {
        com.yandex.passport.legacy.a.d(new Exception(th));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showInvalidSignatureDialog$2(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showInvalidSignatureDialog$3(DialogInterface dialogInterface) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String makeCheckAuthenticator() throws PackageManager.NameNotFoundException, NoSuchAlgorithmException {
        String e = this.androidAccountHelper.e();
        if (e.equals(getPackageName())) {
            return null;
        }
        PackageManager packageManager = getPackageManager();
        byte[] bArr = com.yandex.passport.internal.entities.o.c;
        com.yandex.passport.internal.entities.o r = com.yandex.passport.internal.util.p.r(packageManager, e);
        if (r.c()) {
            return null;
        }
        boolean d = com.yandex.passport.common.util.a.d(this);
        com.yandex.passport.internal.entities.o f = com.yandex.passport.internal.util.p.f(getPackageManager(), getPackageName());
        if (r.b() || d) {
            if (Arrays.equals(f.a(), r.a())) {
                return null;
            }
        }
        c0 c0Var = this.eventReporter;
        String encodeToString = Base64.encodeToString(r.a(), 2);
        c0Var.getClass();
        w53 w53Var = new w53();
        w53Var.put("package", e);
        w53Var.put("fingerprint", encodeToString);
        c0Var.a.a(com.yandex.passport.internal.analytics.i.k, w53Var);
        return e;
    }

    private void runCheckAuthenticator() {
        int i = 2;
        this.checkAuthenticatorCanceller = new com.yandex.passport.legacy.lx.f(new com.yandex.passport.legacy.lx.l(new t(i, this))).e(new a(i, this), new com.yandex.passport.common.util.b(6));
    }

    private void showBackButton(boolean z) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().p(z);
        }
        if (getActionBar() != null) {
            getActionBar().setDisplayHomeAsUpEnabled(z);
        }
    }

    private void showInvalidSignatureDialog(String str) {
        PackageManager packageManager = getPackageManager();
        try {
            str = packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 128)).toString();
        } catch (PackageManager.NameNotFoundException unused) {
        }
        String string = getResources().getString(R.string.passport_invalid_signature_dialog_text, str);
        AlertDialog.a aVar = new AlertDialog.a(this);
        aVar.d(string);
        aVar.a();
        aVar.i(R.string.passport_invalid_signature_dialog_title);
        int i = 0;
        aVar.setPositiveButton(android.R.string.ok, new d(i, this)).g(new e(i, this)).create().show();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        com.yandex.passport.internal.helper.g localeHelper = com.yandex.passport.internal.di.a.a().getLocaleHelper();
        super.attachBaseContext(localeHelper.b(context));
        localeHelper.b(this);
    }

    public void displayHomeAsUp() {
        showBackButton(true);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            Resources.Theme theme = getTheme();
            int i = R.attr.passportBackButtonDrawable;
            int i2 = R.drawable.passport_back;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(new int[]{i});
            try {
                Drawable t = vng.t(obtainStyledAttributes.getResourceId(0, i2), this);
                obtainStyledAttributes.recycle();
                supportActionBar.r(t);
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        }
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overrideTransitionCloseBack();
    }

    public void finishWithForwardAnimation() {
        super.finish();
        overrideTransitionCloseForward();
    }

    public com.yandex.passport.api.o getAnimationTheme() {
        return null;
    }

    public void hideHomeAsUp() {
        showBackButton(false);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        PassportProcessGlobalComponent a = com.yandex.passport.internal.di.a.a();
        this.androidAccountHelper = a.getAndroidAccountManagerHelper();
        this.eventReporter = a.getEventReporter();
        a.getExperimentsUpdater().a(ExperimentsUpdater$LoadingStrategy.DAILY, Environment.PRODUCTION);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            if (getSupportFragmentManager().K() > 0) {
                getSupportFragmentManager().V();
                return true;
            }
            finish();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        com.yandex.passport.legacy.lx.g gVar = this.checkAuthenticatorCanceller;
        if (gVar != null) {
            gVar.a();
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        runCheckAuthenticator();
    }

    public void overrideTransitionCloseBack() {
        com.yandex.passport.api.o animationTheme = getAnimationTheme();
        if (animationTheme != null) {
            overridePendingTransition(animationTheme.getCloseBackEnterAnimation(), animationTheme.getCloseBackExitAnimation());
        }
    }

    public void overrideTransitionCloseForward() {
        com.yandex.passport.api.o animationTheme = getAnimationTheme();
        if (animationTheme != null) {
            overridePendingTransition(animationTheme.getCloseForwardEnterAnimation(), animationTheme.getCloseForwardExitAnimation());
        }
    }

    public void overrideTransitionOpen() {
        com.yandex.passport.api.o animationTheme = getAnimationTheme();
        if (animationTheme != null) {
            overridePendingTransition(animationTheme.getOpenEnterAnimation(), animationTheme.getOpenExitAnimation());
        }
    }

    public boolean supportOnOptionsItemSelected(MenuItem menuItem) {
        return super.onOptionsItemSelected(menuItem);
    }
}
