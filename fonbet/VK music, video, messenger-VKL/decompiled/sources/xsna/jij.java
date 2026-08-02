package xsna;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.dialogs.bottomsheet.modern.impl.CustomisableBottomSheetFragment;
import com.vk.fullscreenbanners.api.dto.AudioGetFullScreenBannerResult;
import com.vk.fullscreenbanners.api.dto.FullScreenBanner;
import com.vk.fullscreenbanners.controllers.FullScreenBannerModalFragment;
import java.util.UUID;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class jij implements izs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ jij(qij qijVar, RectF rectF, RectF rectF2, boolean z) {
        this.d = qijVar;
        this.e = rectF;
        this.f = rectF2;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.f;
        boolean z = this.c;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                qij qijVar = (qij) obj4;
                RectF rectF = (RectF) obj2;
                gzs gzsVar = (gzs) obj;
                qijVar.h = true;
                Matrix matrix = qijVar.r;
                matrix.reset();
                matrix.setRectToRect(qijVar.b(), (RectF) obj3, Matrix.ScaleToFit.CENTER);
                float[] fArr = qijVar.s;
                matrix.getValues(fArr);
                View view = qijVar.b;
                view.setPivotX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                view.setPivotY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                float height = ((rectF.height() - qijVar.b().height()) / 2.0f) * fArr[4];
                float width = (rectF.width() - qijVar.b().width()) / 2.0f;
                float f = fArr[0];
                float f2 = width * f;
                if (z) {
                    view.setScaleX(f);
                    view.setScaleY(fArr[4]);
                    view.setTranslationY(fArr[5] - height);
                    view.setTranslationX(fArr[2] - f2);
                    qijVar.h = false;
                    gzsVar.invoke();
                } else {
                    view.animate().scaleX(fArr[0]).scaleY(fArr[4]).translationY(fArr[5] - height).translationX(fArr[2] - f2).withEndAction(new jx8(2, qijVar, gzsVar)).start();
                }
                break;
            default:
                kwu0 kwu0Var = (kwu0) obj4;
                AppCompatActivity appCompatActivity = (AppCompatActivity) obj2;
                kwu0Var.c((String) obj3);
                boolean z2 = kwu0Var.b;
                FullScreenBanner fullScreenBanner = ((AudioGetFullScreenBannerResult) obj).b;
                if (fullScreenBanner != null) {
                    if (z && !z2) {
                        break;
                    } else {
                        if (z2) {
                            int i2 = kwu0.g;
                            fnu0 fnu0Var = new fnu0(fullScreenBanner);
                            op5 op5Var = new op5(0);
                            lwu0 lwu0Var = new lwu0();
                            lwu0Var.a = -10;
                            com.vk.music.notifications.inapp.b.f(new svs(new pvs(fullScreenBanner, fnu0Var, op5Var, lwu0Var), kwu0Var.d), kwu0Var, kwu0Var, 8);
                        } else {
                            int i3 = FullScreenBannerModalFragment.T;
                            mzp0 mzp0Var = kwu0Var.d;
                            UUID Y0 = mzp0Var != null ? mzp0Var.Y0() : null;
                            int i4 = CustomisableBottomSheetFragment.S;
                            FullScreenBannerModalFragment fullScreenBannerModalFragment = new FullScreenBannerModalFragment();
                            Bundle bundle = new Bundle();
                            bundle.putParcelable("banner_arg", fullScreenBanner);
                            bundle.putString("fullscreen_banner_session_uuid", String.valueOf(Y0));
                            fullScreenBannerModalFragment.setArguments(bundle);
                            fullScreenBannerModalFragment.N = kwu0Var;
                            fullScreenBannerModalFragment.O = kwu0Var;
                            s3q0 s3q0Var = s3q0.a;
                            CustomisableBottomSheetFragment.b.a(appCompatActivity, fullScreenBannerModalFragment, null);
                        }
                        break;
                    }
                } else {
                    break;
                }
        }
        return s3q0.a;
    }

    public /* synthetic */ jij(kwu0 kwu0Var, String str, boolean z, AppCompatActivity appCompatActivity) {
        this.d = kwu0Var;
        this.e = str;
        this.c = z;
        this.f = appCompatActivity;
    }
}
