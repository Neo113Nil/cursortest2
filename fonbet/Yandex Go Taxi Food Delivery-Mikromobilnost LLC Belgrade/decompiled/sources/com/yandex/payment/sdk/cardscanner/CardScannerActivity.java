package com.yandex.payment.sdk.cardscanner;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.core.f;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.b;
import androidx.lifecycle.Lifecycle;
import com.yandex.payment.sdk.core.camerascanner.CardScanData;
import com.yandex.payment.sdk.core.camerascanner.CardScannerError;
import defpackage.ci8;
import defpackage.cma1;
import defpackage.cx7;
import defpackage.fn8;
import defpackage.fsy0;
import defpackage.gn8;
import defpackage.hq7;
import defpackage.i5f0;
import defpackage.k9h0;
import defpackage.md6;
import defpackage.nm7;
import defpackage.ny61;
import defpackage.o89;
import defpackage.qke;
import defpackage.sr4;
import defpackage.tlh0;
import defpackage.unb1;
import defpackage.v5a1;
import defpackage.y0i0;
import defpackage.zy11;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 -2\u00020\u0001:\u0001.B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u001e\u0010\u0003J\u000f\u0010\u001f\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u001f\u0010\u0003J\u000f\u0010 \u001a\u00020\u0004H\u0014¢\u0006\u0004\b \u0010\u0003J\u000f\u0010!\u001a\u00020\u0004H\u0014¢\u0006\u0004\b!\u0010\u0003J\u000f\u0010\"\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\"\u0010\u0003J\u000f\u0010#\u001a\u00020\u0004H\u0016¢\u0006\u0004\b#\u0010\u0003R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lcom/yandex/payment/sdk/cardscanner/CardScannerActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Lzy11;", "prepareCamera", "Lcom/yandex/payment/sdk/core/camerascanner/CardScanData;", "card", "finishWithResult", "(Lcom/yandex/payment/sdk/core/camerascanner/CardScanData;)V", "Lcom/yandex/payment/sdk/core/camerascanner/CardScannerError;", "type", "finishWithFailure", "(Lcom/yandex/payment/sdk/core/camerascanner/CardScannerError;)V", "", "allPermissionsGranted", "()Z", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "", "requestCode", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "onStart", "onStop", "onDestroy", "onResume", "onPause", "onBackPressed", "Lgn8;", "viewBinding", "Lgn8;", "Ljava/util/concurrent/ExecutorService;", "executor", "Ljava/util/concurrent/ExecutorService;", "Lhq7;", "cameraController", "Lhq7;", "Companion", "fn8", "cardscanner_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CardScannerActivity extends AppCompatActivity {
    public static final String CARD_DATA = "CARD_DATA";
    public static final String ERROR_TYPE = "ERROR_TYPE";
    private static final int REQUEST_CODE_PERMISSIONS = 10;
    public static final int RESULT_ERROR = 2;
    public static final String THEME_RES_ID = "THEME_RES_ID";
    private hq7 cameraController;
    private ExecutorService executor;
    private gn8 viewBinding;
    public static final fn8 Companion = new fn8();
    private static final String[] REQUIRED_PERMISSIONS = {"android.permission.CAMERA"};

    private final boolean allPermissionsGranted() {
        for (String str : REQUIRED_PERMISSIONS) {
            if (qke.h(getBaseContext(), str) != 0) {
                return false;
            }
        }
        return true;
    }

    private final void finishWithFailure(CardScannerError type) {
        setResult(2, new Intent().putExtra(ERROR_TYPE, (Parcelable) type));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishWithResult(CardScanData card) {
        setResult(-1, new Intent().putExtra(CARD_DATA, card));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(CardScannerActivity cardScannerActivity, View view) {
        cardScannerActivity.setResult(0);
        cardScannerActivity.finish();
    }

    private final void prepareCamera() {
        sr4 sr4Var = new sr4(25, unb1.c(fsy0.c));
        gn8 gn8Var = this.viewBinding;
        if (gn8Var == null) {
            gn8Var = null;
        }
        this.cameraController = new hq7(this, gn8Var.b.getSurfaceProvider(), new md6(17, sr4Var, this), new cx7(16, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 prepareCamera$lambda$0(CardScannerActivity cardScannerActivity, Exception exc) {
        cardScannerActivity.finishWithFailure(CardScannerError.FailedCameraInit);
        return zy11.a;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        setResult(0);
        super.onBackPressed();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        setTheme(getIntent().getIntExtra(THEME_RES_ID, y0i0.PaymentsdkYaTheme_CardScanner));
        super.onCreate(savedInstanceState);
        View inflate = getLayoutInflater().inflate(tlh0.card_scanner_activity_layout, (ViewGroup) null, false);
        int i = k9h0.paymentsdk_camera_preview;
        PreviewView previewView = (PreviewView) cma1.O(i, inflate);
        if (previewView != null) {
            i = k9h0.paymentsdk_camera_target;
            TargetView targetView = (TargetView) cma1.O(i, inflate);
            if (targetView != null) {
                i = k9h0.paymentsdk_scan_cancel;
                TextView textView = (TextView) cma1.O(i, inflate);
                if (textView != null) {
                    i = k9h0.paymentsdk_scan_hint;
                    if (((TextView) cma1.O(i, inflate)) != null) {
                        i = k9h0.paymentsdk_scan_title;
                        if (((TextView) cma1.O(i, inflate)) != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                            this.viewBinding = new gn8(constraintLayout, previewView, targetView, textView);
                            setContentView(constraintLayout);
                            getWindow().getDecorView().setSystemUiVisibility(4);
                            this.executor = Executors.newSingleThreadExecutor();
                            if (allPermissionsGranted()) {
                                prepareCamera();
                            } else {
                                b.J(this, REQUIRED_PERMISSIONS, 10);
                            }
                            gn8 gn8Var = this.viewBinding;
                            (gn8Var != null ? gn8Var : null).d.setOnClickListener(new ci8(1, this));
                            setRequestedOrientation(1);
                            return;
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        hq7 hq7Var = this.cameraController;
        if (hq7Var != null) {
            f fVar = hq7Var.h;
            if (fVar != null) {
                fVar.H();
            }
            hq7Var.e.shutdown();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        hq7 hq7Var = this.cameraController;
        if (hq7Var != null) {
            hq7Var.f.a.i(Lifecycle.State.CREATED);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        if (requestCode == 10) {
            if (allPermissionsGranted()) {
                prepareCamera();
            } else {
                finishWithFailure(CardScannerError.NoPermissions);
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        hq7 hq7Var = this.cameraController;
        if (hq7Var != null) {
            hq7Var.f.a.i(Lifecycle.State.RESUMED);
            if (hq7Var.g) {
                return;
            }
            hq7Var.g = true;
            CardScannerActivity cardScannerActivity = hq7Var.a;
            i5f0 i5f0Var = i5f0.b;
            o89 c = v5a1.c(cardScannerActivity);
            c.c(new nm7(6, c, hq7Var), cardScannerActivity.getMainExecutor());
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        getWindow().setFlags(8192, 8192);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        getWindow().setFlags(0, 8192);
    }
}
