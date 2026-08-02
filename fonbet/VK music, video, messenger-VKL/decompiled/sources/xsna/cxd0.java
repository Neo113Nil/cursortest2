package xsna;

import com.ironsource.adapters.unityads.UnityAdsAdapter;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.unity3d.ads.IUnityAdsTokenListener;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.superapp.api.dto.account.ProfileNavigationInfo;
import java.util.List;
import ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager;
import ru.ok.android.webrtc.features.CallFeature;
import ru.ok.face.pipeline_frugal.FaceMorphingPipeline;
import ru.ok.gl.tf.Tensorflow;
import ru.ok.tensorflow.util.Function;
import xsna.xex0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class cxd0 implements io.reactivex.rxjava3.functions.l, m6o, io.reactivex.rxjava3.core.d, Function, io.reactivex.rxjava3.functions.b, IUnityAdsTokenListener, io.reactivex.rxjava3.functions.m, io.reactivex.rxjava3.core.s, yads.wl1 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cxd0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // yads.wl1
    public int a(Object obj) {
        return yads.xl1.a((yads.nx0) this.c, (yads.jl1) obj);
    }

    @Override // io.reactivex.rxjava3.functions.b
    public void accept(Object obj, Object obj2) {
        ((com.vk.core.view.components.spinner.c) this.c).dismiss();
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        Object lambda$handleFrames$3;
        switch (this.b) {
            case 0:
                return ((w110) this.c).invoke(obj);
            case 1:
            case 2:
            case 3:
            case 9:
            case 10:
            case 11:
            case 18:
            default:
                return (WebApiApplication) ((xex0.a) this.c).invoke(obj);
            case 4:
                return (nph0) ((w110) this.c).invoke(obj);
            case 5:
                return (io.reactivex.rxjava3.core.t) ((qt5) this.c).invoke(obj);
            case 6:
                return (List) ((fo20) this.c).invoke(obj);
            case 7:
                return (ProfileNavigationInfo.SecurityRecommendationIndicator) ((fo20) this.c).invoke(obj);
            case 8:
                lambda$handleFrames$3 = ((Tensorflow) this.c).lambda$handleFrames$3((FaceMorphingPipeline) obj);
                return lambda$handleFrames$3;
            case 12:
                return (Boolean) ((wep0) this.c).invoke(obj);
            case 13:
                return (io.reactivex.rxjava3.core.e) ((wep0) this.c).invoke(obj);
            case 14:
                return (io.reactivex.rxjava3.core.t) ((lzl0) this.c).invoke(obj);
            case 15:
                return (List) ((lzl0) this.c).invoke(obj);
            case 16:
                return (u6x0) ((lzl0) this.c).invoke(obj);
            case 17:
                return (it80) ((wep0) this.c).invoke(obj);
            case 19:
                return (io.reactivex.rxjava3.core.b0) ((ix50) this.c).invoke(obj);
            case 20:
                return (io.reactivex.rxjava3.core.t) ((vnb0) this.c).invoke(obj);
        }
    }

    @Override // xsna.m6o
    public double b(double d) {
        pjp0 pjp0Var = (pjp0) this.c;
        double d2 = pjp0Var.b;
        double d3 = pjp0Var.c;
        double d4 = pjp0Var.d;
        return d >= pjp0Var.e * d4 ? (Math.pow(d, 1.0d / pjp0Var.a) - d3) / d2 : d / d4;
    }

    @Override // com.unity3d.ads.IUnityAdsTokenListener
    public void onUnityAdsTokenReady(String str) {
        UnityAdsAdapter.collectBiddingData$lambda$10((BiddingDataCallback) this.c, str);
    }

    @Override // io.reactivex.rxjava3.core.d
    public void subscribe(io.reactivex.rxjava3.core.b bVar) {
        try {
            ((gzs) this.c).invoke();
            bVar.onComplete();
        } catch (Throwable th) {
            bVar.b(th);
        }
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return ((Boolean) ((wep0) this.c).invoke(obj)).booleanValue();
    }

    public /* synthetic */ cxd0(kqf0 kqf0Var, jqf0 jqf0Var) {
        this.b = 1;
        this.c = kqf0Var;
    }

    @Override // io.reactivex.rxjava3.core.s
    public void subscribe(io.reactivex.rxjava3.core.r rVar) {
        r6x0 r6x0Var = (r6x0) this.c;
        final o6x0 o6x0Var = new o6x0(rVar);
        com.vk.voip.b bVar = r6x0Var.b;
        final ulp h = bVar.h();
        rVar.a(new io.reactivex.rxjava3.functions.e() { // from class: xsna.n6x0
            @Override // io.reactivex.rxjava3.functions.e
            public final void cancel() {
                o6x0 o6x0Var2 = o6x0Var;
                tlp.this.c(CallFeature.MOVIE_SHARE, o6x0Var2);
            }
        });
        ConversationFeatureManager g = bVar.g();
        boolean z = false;
        if (g != null && g.isFeatureEnabled(CallFeature.MOVIE_SHARE)) {
            z = true;
        }
        rVar.onNext(Boolean.valueOf(z));
        h.e(CallFeature.MOVIE_SHARE, o6x0Var);
    }
}
