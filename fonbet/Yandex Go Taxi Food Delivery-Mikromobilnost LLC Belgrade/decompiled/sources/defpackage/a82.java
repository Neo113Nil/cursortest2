package defpackage;

import android.content.pm.verify.domain.DomainVerificationManager;
import android.os.VibratorManager;
import android.view.View;
import android.view.translation.ViewTranslationCallback;
import android.window.SplashScreenView;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a82 {
    public static /* bridge */ /* synthetic */ DomainVerificationManager c(Object obj) {
        return (DomainVerificationManager) obj;
    }

    public static /* bridge */ /* synthetic */ VibratorManager h(Object obj) {
        return (VibratorManager) obj;
    }

    public static /* bridge */ /* synthetic */ ViewTranslationCallback j(Object obj) {
        return (ViewTranslationCallback) obj;
    }

    public static /* bridge */ /* synthetic */ SplashScreenView l(View view) {
        return (SplashScreenView) view;
    }

    public static /* bridge */ /* synthetic */ Class m() {
        return DomainVerificationManager.class;
    }

    public static /* bridge */ /* synthetic */ boolean v(View view) {
        return view instanceof SplashScreenView;
    }
}
