package com.yandex.voip_calls.calls_go;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.js4;
import defpackage.ljo;
import defpackage.ll7;
import defpackage.ml7;
import defpackage.nl7;
import defpackage.q501;
import defpackage.rk6;
import defpackage.v5c0;
import defpackage.yl7;
import defpackage.zi;
import io.flutter.embedding.android.FlutterActivity;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.a;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0003J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0012\u0010\bR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/yandex/voip_calls/calls_go/CallsGoActivity;", "Lio/flutter/embedding/android/FlutterActivity;", "<init>", "()V", "Landroid/content/Intent;", "intent", "Lzy11;", "handleIntent", "(Landroid/content/Intent;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "finish", "onNewIntent", "Lyl7;", "lastConfig", "Lyl7;", "Lll7;", "notificationsInteractor$delegate", "Li3y;", "getNotificationsInteractor", "()Lll7;", "notificationsInteractor", "calls_go_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CallsGoActivity extends FlutterActivity {
    private yl7 lastConfig;

    /* renamed from: notificationsInteractor$delegate, reason: from kotlin metadata */
    private final i3y notificationsInteractor = a.a(new rk6(9, this));

    private final ll7 getNotificationsInteractor() {
        return (ll7) this.notificationsInteractor.getValue();
    }

    private final void handleIntent(Intent intent) {
        Objects.toString(intent);
        q501 q501Var = nl7.b;
        if (q501.z()) {
            if (jl40.l(intent.getAction(), IncomingCallAction.ANSWER.getAction())) {
                if (q501.z()) {
                    nl7.c.post(new zi(22));
                    return;
                } else {
                    q501.C("notification_accept_after_call_ended", "User clicked accept on notification but no active call exists");
                    return;
                }
            }
            return;
        }
        q501.C("notification_intent_after_call_ended", "Notification intent (action=" + intent.getAction() + ") arrived but no active call exists");
        getNotificationsInteractor().a.cancel(228);
        new Handler(Looper.getMainLooper()).post(new js4(25, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ll7 notificationsInteractor_delegate$lambda$0(CallsGoActivity callsGoActivity) {
        return new ll7(callsGoActivity);
    }

    @Override // android.app.Activity
    public void finish() {
        if (getParentActivityIntent() != null) {
            try {
                startActivity(getParentActivityIntent());
            } catch (Throwable unused) {
            }
        }
        super.finish();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Configuration configuration = getContext().getResources().getConfiguration();
        boolean z = configuration.getLayoutDirection() == 1;
        boolean z2 = (configuration.uiMode & 48) != 16;
        yl7 yl7Var = new yl7(z, z2);
        if (jl40.l(this.lastConfig, yl7Var)) {
            return;
        }
        this.lastConfig = yl7Var;
        q501 q501Var = nl7.b;
        if (q501.z()) {
            nl7.c.post(new ml7(z2, z));
        } else {
            q501.C("update_theme_mode_after_call_ended", "updateThemeMode called but no active call exists");
        }
    }

    @Override // io.flutter.embedding.android.FlutterActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        Configuration configuration = getResources().getConfiguration();
        boolean z = configuration.getLayoutDirection() == 1;
        boolean z2 = (configuration.uiMode & 48) != 16;
        this.lastConfig = new yl7(z, z2);
        q501 q501Var = nl7.b;
        if (q501.z()) {
            super.onCreate(savedInstanceState);
            handleIntent(getIntent());
            if (q501.z()) {
                nl7.c.post(new ml7(z2, z));
                return;
            } else {
                q501.C("update_theme_mode_after_call_ended", "updateThemeMode called but no active call exists");
                return;
            }
        }
        int i = 25;
        try {
            super.onCreate(savedInstanceState);
        } catch (IllegalStateException e) {
            q501 q501Var2 = nl7.b;
            if (nl7.A) {
                v5c0 v5c0Var = nl7.B;
                if (v5c0Var == null) {
                    v5c0Var = null;
                }
                v5c0Var.K(e.toString(), ljo.b(e));
            }
            getNotificationsInteractor().a.cancel(228);
        } finally {
            new Handler(Looper.getMainLooper()).post(new js4(i, this));
        }
    }

    @Override // io.flutter.embedding.android.FlutterActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        handleIntent(intent);
    }
}
