package xsna;

import androidx.appcompat.app.AppCompatActivity;
import com.vk.core.apps.VkBuildAppStore;
import com.vk.inappreview.ReviewActionResult$Failed;
import ru.rustore.sdk.core.exception.RuStoreApplicationBannedException;
import ru.rustore.sdk.core.exception.RuStoreException;
import ru.rustore.sdk.core.exception.RuStoreNotInstalledException;
import ru.rustore.sdk.core.exception.RuStoreOutdatedException;
import ru.rustore.sdk.core.exception.RuStoreUserBannedException;
import ru.rustore.sdk.core.exception.RuStoreUserUnauthorizedException;
import ru.rustore.sdk.review.errors.RuStoreInvalidReviewInfo;
import ru.rustore.sdk.review.errors.RuStoreRequestLimitReached;
import ru.rustore.sdk.review.errors.RuStoreReviewExists;

/* compiled from: RuStoreInAppReviewManager.kt */
/* loaded from: classes2.dex */
public final class arg0 implements crw {
    public final AppCompatActivity a;
    public final brw b;
    public lrg0 c;
    public final wm80 d = new wm80(this, 15);
    public final yr00 e = new yr00(this, 26);
    public final String f = VkBuildAppStore.RUSTORE.i();

    public arg0(AppCompatActivity appCompatActivity, brw brwVar) {
        this.a = appCompatActivity;
        this.b = brwVar;
    }

    public static ReviewActionResult$Failed a(Throwable th) {
        RuStoreException ruStoreException = th instanceof RuStoreException ? (RuStoreException) th : null;
        return new ReviewActionResult$Failed(ruStoreException instanceof RuStoreInvalidReviewInfo ? ReviewActionResult$Failed.ErrorReason.INTERNAL_ERROR : ((ruStoreException instanceof RuStoreNotInstalledException) || (ruStoreException instanceof RuStoreOutdatedException)) ? ReviewActionResult$Failed.ErrorReason.STORE_NOT_FOUND : ((ruStoreException instanceof RuStoreUserUnauthorizedException) || (ruStoreException instanceof RuStoreUserBannedException) || (ruStoreException instanceof RuStoreApplicationBannedException) || (ruStoreException instanceof RuStoreRequestLimitReached) || (ruStoreException instanceof RuStoreReviewExists)) ? ReviewActionResult$Failed.ErrorReason.INVALID_REQUEST : ReviewActionResult$Failed.ErrorReason.UNKNOWN);
    }

    @Override // xsna.crw
    public final void onCreate() {
        r100.a(this.f, "RuStore in-app review manager created");
    }

    @Override // xsna.crw
    public final void onPause() {
        r100.a(this.f, "RuStore in-app review manager paused");
        brw brwVar = this.b;
        brwVar.h = null;
        brwVar.i = null;
    }

    @Override // xsna.crw
    public final void onResume() {
        r100.a(this.f, "RuStore in-app review manager resumed");
        wm80 wm80Var = this.d;
        brw brwVar = this.b;
        brwVar.h = wm80Var;
        brwVar.i = this.e;
    }
}
