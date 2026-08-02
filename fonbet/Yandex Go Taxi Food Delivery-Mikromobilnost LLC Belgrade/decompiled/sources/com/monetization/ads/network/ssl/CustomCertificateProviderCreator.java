package com.monetization.ads.network.ssl;

import android.content.Context;
import com.monetization.ads.network.ssl.browser.ssl.CustomCertificatesProvider;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/monetization/ads/network/ssl/CustomCertificateProviderCreator;", "", "Landroid/content/Context;", "context", "Lcom/monetization/ads/network/ssl/browser/ssl/CustomCertificatesProvider;", "create", "(Landroid/content/Context;)Lcom/monetization/ads/network/ssl/browser/ssl/CustomCertificatesProvider;", "mobileads_internalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CustomCertificateProviderCreator {
    public static final CustomCertificateProviderCreator INSTANCE = new CustomCertificateProviderCreator();
    private static final ConcurrentLinkedQueue a = new ConcurrentLinkedQueue();

    private CustomCertificateProviderCreator() {
    }

    public static final CustomCertificatesProvider create(Context context) {
        return new CustomAdsCertificateProvider(context, (byte[][]) a.toArray(new byte[0][]));
    }
}
