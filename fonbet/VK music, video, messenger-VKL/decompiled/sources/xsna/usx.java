package xsna;

import android.app.Activity;
import com.ironsource.adapters.ironsource.nativeAd.IronSourceNativeAdAdapter;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayInitRequest;
import com.vk.unitylevelplay.impl.UnityLevelPlayFeatureImpl;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class usx implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ usx(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                IronSourceNativeAdAdapter.loadNativeAdForBidding$lambda$0((IronSourceNativeAdAdapter) this.c, (JSONObject) this.d, (NativeAdSmashListener) this.e, (String) this.f);
                break;
            case 1:
                LevelPlay.init((Activity) this.c, (LevelPlayInitRequest) this.d, new com.vk.unitylevelplay.impl.a((UnityLevelPlayFeatureImpl) this.e, (f7c) this.f));
                break;
            default:
                ((yads.co1) this.c).a((yads.do1) this.d, (yads.wg1) this.e, (yads.in1) this.f);
                break;
        }
    }
}
