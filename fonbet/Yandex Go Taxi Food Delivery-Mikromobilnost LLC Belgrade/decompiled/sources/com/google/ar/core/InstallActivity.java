package com.google.ar.core;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.ar.core.ArCoreApk;
import com.google.ar.core.exceptions.FatalException;
import com.google.ar.core.exceptions.UnavailableDeviceNotCompatibleException;
import com.google.ar.core.exceptions.UnavailableUserDeclinedInstallationException;
import defpackage.akh0;
import defpackage.lxh0;
import defpackage.xeh0;
import java.util.concurrent.atomic.AtomicReference;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes11.dex */
public class InstallActivity extends Activity {
    private static final int BOX_SIZE_DP = 280;
    private static final int INSTALLING_TEXT_BOTTOM_MARGIN_DP = 30;
    static final String INSTALL_BEHAVIOR_KEY = "behavior";
    static final String MESSAGE_TYPE_KEY = "message";
    private static final String TAG = "ARCore-InstallActivity";
    private boolean finished;
    private ArCoreApk.InstallBehavior installBehavior;
    private boolean installStarted;
    private ArCoreApk.UserMessageType messageType;
    private boolean waitingForCompletion;
    private final ContextThemeWrapper themeWrapper = new ContextThemeWrapper(this, android.R.style.Theme.Material.Light.Dialog.Alert);
    private w lastEvent = w.b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: animateToSpinner, reason: merged with bridge method [inline-methods] */
    public void b() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        float f = displayMetrics.density * 280.0f;
        int width = getWindow().getDecorView().getWidth();
        int height = getWindow().getDecorView().getHeight();
        setContentView(new RelativeLayout(this));
        int i = (int) f;
        getWindow().getDecorView().setMinimumWidth(i);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new t(this, width, i, height));
        ofFloat.addListener(new u(this));
        ofFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: closeInstaller, reason: merged with bridge method [inline-methods] */
    public void e() {
        startActivity(new Intent(this, (Class<?>) InstallActivity.class).setFlags(SelfTester_JCP.DECRYPT_CBC));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: finishWithFailure, reason: merged with bridge method [inline-methods] */
    public void c(Exception exc) {
        q qVar = q.m;
        qVar.b = exc;
        qVar.b();
        this.finished = true;
        super.finish();
    }

    private boolean isOptional() {
        return this.installBehavior == ArCoreApk.InstallBehavior.OPTIONAL;
    }

    private void showEducationDialog() {
        setContentView(akh0.__arcore_education);
        findViewById(xeh0.__arcore_cancelButton).setOnClickListener(new s(this, 1));
        if (!isOptional()) {
            findViewById(xeh0.__arcore_cancelButton).setVisibility(8);
        }
        findViewById(xeh0.__arcore_continueButton).setOnClickListener(new s(this, 0));
        TextView textView = (TextView) findViewById(xeh0.__arcore_messageText);
        ArCoreApk.UserMessageType userMessageType = ArCoreApk.UserMessageType.APPLICATION;
        ArCoreApk.Availability availability = ArCoreApk.Availability.UNKNOWN_ERROR;
        if (this.messageType.ordinal() != 1) {
            textView.setText(lxh0.__arcore_install_app);
        } else {
            textView.setText(lxh0.__arcore_install_feature);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showSpinner, reason: merged with bridge method [inline-methods] */
    public void a() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i = (int) (displayMetrics.density * 280.0f);
        getWindow().setLayout(i, i);
        RelativeLayout relativeLayout = new RelativeLayout(this.themeWrapper);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        ProgressBar progressBar = new ProgressBar(this.themeWrapper);
        progressBar.setIndeterminate(true);
        progressBar.setLayoutParams(layoutParams);
        relativeLayout.addView(progressBar);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(14);
        layoutParams2.addRule(12);
        layoutParams2.bottomMargin = (int) (displayMetrics.density * 30.0f);
        TextView textView = new TextView(this.themeWrapper);
        textView.setText(lxh0.__arcore_installing);
        textView.setLayoutParams(layoutParams2);
        relativeLayout.addView(textView);
        setContentView(relativeLayout);
        getWindow().setLayout(i, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: startInstaller, reason: merged with bridge method [inline-methods] */
    public void d() {
        this.installStarted = true;
        this.lastEvent = w.b;
        d0 a = q.m.a(this);
        c0 c0Var = new c0(this);
        if (a.h == null) {
            try {
                a.g = getPackageManager().getPackageInstaller();
                ab abVar = new ab(a, c0Var);
                a.h = abVar;
                a.g.registerSessionCallback(abVar);
            } catch (NullPointerException unused) {
                c0Var.b(new FatalException("Unable to obtain Android PackageInstaller; is this a Play Instant App?"));
            }
        }
        if (a.e == null) {
            ac acVar = new ac(c0Var);
            a.e = acVar;
            a.f = this;
            if (Build.VERSION.SDK_INT >= 33) {
                registerReceiver(acVar, new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"), 2);
            } else {
                registerReceiver(acVar, new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"));
            }
        }
        try {
            a.d(new i(a, this, c0Var));
        } catch (ag unused2) {
            d0.e(this, c0Var);
        }
    }

    public final /* synthetic */ void f(w wVar) {
        this.lastEvent = wVar;
    }

    @Override // android.app.Activity
    public void finish() {
        c(new UnavailableUserDeclinedInstallationException());
    }

    public final /* synthetic */ boolean g() {
        return this.waitingForCompletion;
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 16);
        sb.append("activityResult: ");
        sb.append(i2);
        Log.i(TAG, sb.toString());
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            if (bundle != null) {
                c(new FatalException("Install activity was suspended and recreated."));
                return;
            }
            this.messageType = (ArCoreApk.UserMessageType) getIntent().getSerializableExtra("message");
            ArCoreApk.InstallBehavior installBehavior = (ArCoreApk.InstallBehavior) getIntent().getSerializableExtra(INSTALL_BEHAVIOR_KEY);
            this.installBehavior = installBehavior;
            if (this.messageType != null && installBehavior != null) {
                setTheme(android.R.style.Theme.Material.Light.Dialog.Alert);
                getWindow().requestFeature(1);
                setFinishOnTouchOutside(isOptional());
                if (this.messageType == ArCoreApk.UserMessageType.USER_ALREADY_INFORMED) {
                    a();
                    return;
                }
                AtomicReference atomicReference = new AtomicReference(ArCoreApk.Availability.UNKNOWN_CHECKING);
                q.m.a(this).c(this, new b0(atomicReference));
                int ordinal = ((ArCoreApk.Availability) atomicReference.get()).ordinal();
                if (ordinal != 0 && ordinal == 3) {
                    c(new UnavailableDeviceNotCompatibleException());
                    return;
                }
                showEducationDialog();
                return;
            }
            Log.e(TAG, "missing intent data.");
            c(new FatalException("Install activity launched without config data."));
        } catch (RuntimeException e) {
            c(new FatalException("Exception starting install flow", e));
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        if (!this.finished) {
            q.m.b();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        if (!this.installStarted) {
            if (this.messageType == ArCoreApk.UserMessageType.USER_ALREADY_INFORMED) {
                d();
            }
        } else {
            if (this.finished) {
                return;
            }
            synchronized (this) {
                try {
                    w wVar = this.lastEvent;
                    if (wVar == w.b) {
                        finish();
                    } else if (wVar == w.a) {
                        this.waitingForCompletion = true;
                    } else {
                        c(q.m.b);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("didResume", true);
    }
}
