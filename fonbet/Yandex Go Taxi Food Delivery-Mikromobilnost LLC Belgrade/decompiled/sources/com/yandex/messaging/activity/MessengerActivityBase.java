package com.yandex.messaging.activity;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.appcompat.app.AppCompatActivity;
import com.yandex.messaging.internal.authorized.sync.d;
import defpackage.ccg;
import defpackage.dh60;
import defpackage.e1k;
import defpackage.fcg;
import defpackage.g420;
import defpackage.i3y;
import defpackage.kt11;
import defpackage.lqo;
import defpackage.lt11;
import defpackage.n7c;
import defpackage.oo31;
import defpackage.q5z;
import defpackage.rv10;
import defpackage.tz10;
import defpackage.vbb;
import defpackage.wi60;
import defpackage.xyz;
import defpackage.zy11;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0019\u0010\u0010\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0016\u0010\u0003J\u000f\u0010\u0017\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0017\u0010\u0003J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0018\u0010\fJ\u000f\u0010\u0019\u001a\u00020\nH\u0004¢\u0006\u0004\b\u0019\u0010\u0003J\u000f\u0010\u001a\u001a\u00020\nH\u0004¢\u0006\u0004\b\u001a\u0010\u0003R\u001b\u0010 \u001a\u00020\u001b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/yandex/messaging/activity/MessengerActivityBase;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Landroid/content/Context;", "context", "updateLocale", "(Landroid/content/Context;)Landroid/content/Context;", "Landroid/content/Intent;", "intent", "Lzy11;", "showOnLockedScreenIfRequired", "(Landroid/content/Intent;)V", "requestUnlockIfRequired", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "newBase", "attachBaseContext", "(Landroid/content/Context;)V", "onStart", "onStop", "onResume", "onNewIntent", "applyThemeOverlay", "applyForcedDarkThemeOverlay", "Llt11;", "sdkComponent$delegate", "Li3y;", "getSdkComponent", "()Llt11;", "sdkComponent", "Le1k;", "onlineRequest", "Le1k;", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class MessengerActivityBase extends AppCompatActivity {
    public static final int $stable = 8;
    private e1k onlineRequest;

    /* renamed from: sdkComponent$delegate, reason: from kotlin metadata */
    private final i3y sdkComponent = kotlin.a.a(new xyz(28, this));

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onResume$lambda$1(kt11 kt11Var) {
        ccg ccgVar = (ccg) kt11Var;
        d z = ccgVar.a.z();
        q5z.h(z);
        z.a();
        vbb vbbVar = ccgVar.a;
        com.yandex.messaging.internal.authorized.b y = vbbVar.y();
        SharedPreferences T = vbbVar.T();
        q5z.h(T);
        Context A = vbbVar.A();
        SharedPreferences T2 = vbbVar.T();
        q5z.h(T2);
        dh60 O = vbbVar.O();
        q5z.h(O);
        wi60 wi60Var = new wi60(A, T2, O);
        boolean z2 = T.getBoolean("system_notifications_granted", false);
        boolean c = wi60Var.c();
        if (z2 != c) {
            oo31.n(T, "system_notifications_granted", c);
            y.a.post(new n7c(y, y.e.b(), 1));
        }
        return zy11.a;
    }

    private final void requestUnlockIfRequired(Intent intent) {
        if (intent.getBooleanExtra("request_unlock", false)) {
            intent.putExtra("request_unlock", false);
            ((KeyguardManager) getSystemService("keyguard")).requestDismissKeyguard(this, null);
        }
    }

    private final void showOnLockedScreenIfRequired(Intent intent) {
        if (intent.getBooleanExtra("show_on_locked_screen", false)) {
            setShowWhenLocked(true);
            setTurnScreenOn(true);
            getWindow().addFlags(2621440);
        }
    }

    private final Context updateLocale(Context context) {
        Locale locale;
        g420 g420Var = new com.yandex.messaging.sdk.a(context).e;
        lqo lqoVar = g420Var.d;
        Locale locale2 = (Locale) g420Var.k.o.invoke();
        if (locale2 != null) {
            Configuration configuration = new Configuration(context.getResources().getConfiguration());
            configuration.setLocale(locale2);
            Context createConfigurationContext = context.createConfigurationContext(configuration);
            if (createConfigurationContext != null) {
                return createConfigurationContext;
            }
        } else if (!lqoVar.a(tz10.i)) {
            Locale locale3 = context.getResources().getConfiguration().getLocales().get(0);
            if (locale3 == null) {
                locale3 = Locale.getDefault();
            }
            if (TextUtils.getLayoutDirectionFromLocale(locale3) == 1 && (locale = Locale.US) != null) {
                Configuration configuration2 = new Configuration(context.getResources().getConfiguration());
                configuration2.setLocale(locale);
                Context createConfigurationContext2 = context.createConfigurationContext(configuration2);
                if (createConfigurationContext2 != null) {
                    return createConfigurationContext2;
                }
            }
        }
        return context;
    }

    public final void applyForcedDarkThemeOverlay() {
        getTheme().applyStyle(((fcg) getSdkComponent()).c().c, false);
        Iterator it = ((fcg) getSdkComponent()).c().a().iterator();
        while (it.hasNext()) {
            getTheme().applyStyle(((Number) it.next()).intValue(), false);
        }
    }

    public final void applyThemeOverlay() {
        getTheme().applyStyle(((fcg) getSdkComponent()).c().b(), false);
        Iterator it = ((fcg) getSdkComponent()).c().a().iterator();
        while (it.hasNext()) {
            getTheme().applyStyle(((Number) it.next()).intValue(), false);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context newBase) {
        super.attachBaseContext(updateLocale(newBase));
    }

    public final lt11 getSdkComponent() {
        return (lt11) this.sdkComponent.getValue();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        showOnLockedScreenIfRequired(getIntent());
        requestUnlockIfRequired(getIntent());
        applyThemeOverlay();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        requestUnlockIfRequired(intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        ((fcg) getSdkComponent()).b().a(new rv10(12));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        if (this.onlineRequest == null) {
            com.yandex.messaging.profile.d z = ((fcg) getSdkComponent()).a.z();
            q5z.h(z);
            this.onlineRequest = new com.yandex.messaging.sync.b(z);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        e1k e1kVar = this.onlineRequest;
        if (e1kVar != null) {
            e1kVar.close();
        }
        this.onlineRequest = null;
    }
}
