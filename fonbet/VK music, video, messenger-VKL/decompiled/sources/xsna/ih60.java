package xsna;

import com.vk.ads.di.NewsfeedOptionalAdsComponent;
import com.vk.ads.dto.VkOptionalNativeAdType;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class ih60 implements Callable {
    public final /* synthetic */ kh60 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ ih60(kh60 kh60Var, boolean z) {
        this.b = kh60Var;
        this.c = z;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        boolean z;
        kh60 kh60Var = this.b;
        if (((NewsfeedOptionalAdsComponent) kh60Var.b.getValue()).T1(VkOptionalNativeAdType.APPLOVIN)) {
            String Z = ((b25) kh60Var.c.getValue()).Z();
            z = !(Z == null || Z.length() == 0);
        } else {
            z = false;
        }
        boolean z2 = this.c;
        return z ? zeq0.d(z2, "ads_applovin") : zeq0.d(z2, new String[0]);
    }
}
