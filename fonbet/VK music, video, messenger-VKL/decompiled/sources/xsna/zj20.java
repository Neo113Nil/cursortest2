package xsna;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import io.reactivex.rxjava3.internal.functions.a;

/* compiled from: MethodSelectorOpeningWrapper.kt */
/* loaded from: classes15.dex */
public final class zj20 {
    public boolean a;
    public final Object b;

    public zj20(View view) {
        this.a = !(view.getAlpha() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.b = view.animate();
    }

    public io.reactivex.rxjava3.disposables.c a(Context context, gzs gzsVar) {
        boolean z = this.a;
        a.m mVar = io.reactivex.rxjava3.internal.functions.a.b;
        if (z) {
            return new io.reactivex.rxjava3.disposables.f(mVar);
        }
        this.a = true;
        com.vk.movika.sdk.base.logic.processor.actions.e eVar = new com.vk.movika.sdk.base.logic.processor.actions.e(11, gzsVar, this);
        if (efy.b <= efy.a) {
            eVar.invoke();
            return new io.reactivex.rxjava3.disposables.f(mVar);
        }
        bpn0 bpn0Var = t65.a;
        mhy.b(context);
        gfy gfyVar = new gfy(eVar);
        efy.a(gfyVar);
        return new ffy(gfyVar);
    }

    public zj20() {
        this.b = new Handler(Looper.getMainLooper());
    }
}
