package com.monetization.ads.network.ssl;

import android.content.Context;
import com.monetization.ads.network.ssl.browser.ssl.CustomCertificatesProvider;
import com.yandex.mobile.ads.R$raw;
import defpackage.f73;
import defpackage.ny61;
import defpackage.rzo;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0012\n\u0002\b\u0006\b\u0000\u0018\u0000B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/monetization/ads/network/ssl/CustomAdsCertificateProvider;", "Landroid/content/Context;", "context", "", "", "customCertificates", "<init>", "(Landroid/content/Context;[[B)V", "provide", "()[[B", "mobileads_internalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CustomAdsCertificateProvider implements CustomCertificatesProvider {
    private final Context a;
    private final Context b;
    private final byte[][] c;

    public CustomAdsCertificateProvider(Context context, byte[][] bArr) {
        this.a = context.getApplicationContext();
        this.b = context.getApplicationContext();
        this.c = bArr;
    }

    @Override // com.monetization.ads.network.ssl.browser.ssl.CustomCertificatesProvider
    public byte[][] provide() {
        try {
            InputStream openRawResource = this.b.getResources().openRawResource(R$raw.monetization_ads_sdkinternalca);
            try {
                byte[] R = rzo.R(openRawResource);
                openRawResource.close();
                try {
                    openRawResource = this.a.getResources().openRawResource(R$raw.monetization_ads_bundled_cert);
                    try {
                        byte[] R2 = rzo.R(openRawResource);
                        openRawResource.close();
                        return (byte[][]) f73.t((byte[][]) f73.t(new byte[][]{R2}, new byte[][]{R}), this.c);
                    } finally {
                    }
                } catch (IOException e) {
                    ny61.h("Failed to create cert", e);
                    return null;
                }
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        } catch (IOException e2) {
            ny61.h("Failed to create cert", e2);
            return null;
        }
    }
}
