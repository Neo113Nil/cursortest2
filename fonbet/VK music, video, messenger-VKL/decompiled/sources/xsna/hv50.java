package xsna;

import com.vk.ads.di.NewsfeedOptionalAdsComponent;
import com.vk.bridges.di.AuthBridgeComponent;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;

/* compiled from: NativeAdPreloadDelegate.kt */
/* loaded from: classes4.dex */
public final class hv50 {
    public final m73 a;
    public final Lazy b;
    public final Lazy c;
    public final Object d;
    public final Object e;

    public hv50(Lazy<? extends AuthBridgeComponent> lazy, Lazy<? extends NewsfeedOptionalAdsComponent> lazy2, m73 m73Var) {
        this.a = m73Var;
        this.b = lazy;
        this.c = lazy2;
        ek ekVar = new ek(20);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.d = msy.a(lazyThreadSafetyMode, ekVar);
        this.e = msy.a(lazyThreadSafetyMode, new vo50(1));
    }
}
