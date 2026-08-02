package xsna;

import android.content.Context;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.nativeads.NativeAd;
import com.yandex.mobile.ads.nativeads.NativeAdLoadListener;
import com.yandex.mobile.ads.nativeads.NativeAdLoader;
import com.yandex.mobile.ads.nativeads.NativeAdRequestConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: YandexNativeAdLoaderImpl.kt */
/* loaded from: classes14.dex */
public final class e5y0 {
    public final Context a;
    public volatile boolean b;
    public final AtomicInteger c = new AtomicInteger(0);
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final Stack<kv50> f = new Stack<>();
    public final LinkedHashMap g = new LinkedHashMap();

    /* compiled from: YandexNativeAdLoaderImpl.kt */
    public static final class a implements NativeAdLoadListener {
        public final /* synthetic */ wzs<z4y0, NativeAdLoader, s3q0> a;
        public final /* synthetic */ NativeAdLoader b;
        public final /* synthetic */ e5y0 c;
        public final /* synthetic */ izs<AdRequestError, s3q0> d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(wzs<? super z4y0, ? super NativeAdLoader, s3q0> wzsVar, NativeAdLoader nativeAdLoader, e5y0 e5y0Var, izs<? super AdRequestError, s3q0> izsVar) {
            this.a = wzsVar;
            this.b = nativeAdLoader;
            this.c = e5y0Var;
            this.d = izsVar;
        }

        @Override // com.yandex.mobile.ads.nativeads.NativeAdLoadListener
        public final void onAdFailedToLoad(AdRequestError adRequestError) {
            this.d.invoke(adRequestError);
            e5y0 e5y0Var = this.c;
            if (e5y0Var.c.incrementAndGet() >= 3) {
                e5y0Var.b = true;
            }
            this.c.d.remove(this.b);
        }

        @Override // com.yandex.mobile.ads.nativeads.NativeAdLoadListener
        public final void onAdLoaded(NativeAd nativeAd) {
            wzs<z4y0, NativeAdLoader, s3q0> wzsVar = this.a;
            d5y0 d5y0Var = new d5y0(nativeAd);
            NativeAdLoader nativeAdLoader = this.b;
            wzsVar.invoke(d5y0Var, nativeAdLoader);
            e5y0 e5y0Var = this.c;
            e5y0Var.b = false;
            e5y0Var.c.set(0);
            e5y0Var.d.remove(nativeAdLoader);
        }
    }

    public e5y0(Context context) {
        this.a = context;
    }

    public final void a(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.g.remove((z4y0) it.next());
        }
    }

    public final void b(gv50 gv50Var, wzs<? super z4y0, ? super NativeAdLoader, s3q0> wzsVar, izs<? super AdRequestError, s3q0> izsVar) {
        NativeAdLoader nativeAdLoader = new NativeAdLoader(this.a);
        nativeAdLoader.setNativeAdLoadListener(new a(wzsVar, nativeAdLoader, this, izsVar));
        this.d.add(nativeAdLoader);
        nativeAdLoader.loadAd(new NativeAdRequestConfiguration.Builder(gv50Var.a).setShouldLoadImagesAutomatically(true).build());
    }
}
