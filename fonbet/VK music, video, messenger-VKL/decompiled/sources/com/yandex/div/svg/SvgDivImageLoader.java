package com.yandex.div.svg;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.drawable.PictureDrawable;
import com.yandex.div.core.images.DivImageDownloadCallback;
import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.images.LoadReference;
import com.yandex.div.svg.SvgDivImageLoader;
import java.io.InputStream;
import kotlin.Result;
import okhttp3.d;
import okhttp3.o;
import okhttp3.p;
import okhttp3.v;
import xsna.brm0;
import xsna.drm0;
import xsna.eln0;
import xsna.i7o0;
import xsna.myc0;
import xsna.ro;
import xsna.yvj;
import xsna.zvj;

/* compiled from: SvgDivImageLoader.kt */
/* loaded from: classes7.dex */
public final class SvgDivImageLoader implements DivImageLoader {
    private final Context context;
    private final o httpClient = new o(new o.a());
    private final yvj coroutineScope = zvj.b();
    private final SvgDecoder svgDecoder = new SvgDecoder(false, 1, null);
    private final SvgCacheManager svgCacheManager = new SvgCacheManager();

    public SvgDivImageLoader(Context context) {
        this.context = context;
    }

    private final d createCallOrNull(String str) {
        if (!brm0.B(str, "http://", false) && !brm0.B(str, "https://", false)) {
            return null;
        }
        p.a aVar = new p.a();
        aVar.i(str);
        return this.httpClient.a(aVar.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] downloadImage(d dVar) {
        Object failure;
        try {
            v vVar = dVar.execute().h;
            failure = vVar != null ? vVar.bytes() : null;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        return (byte[]) (failure instanceof Result.Failure ? null : failure);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] getImageData(String str) {
        AssetManager assets;
        InputStream open;
        String U = drm0.U(str, "file:///android_asset/");
        Context applicationContext = this.context.getApplicationContext();
        if (applicationContext == null || (assets = applicationContext.getAssets()) == null || (open = assets.open(U)) == null) {
            return null;
        }
        try {
            byte[] h = i7o0.h(open);
            open.close();
            return h;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ro.e(open, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadImage$lambda$1(d dVar) {
        if (dVar != null) {
            dVar.cancel();
        }
    }

    @Override // com.yandex.div.core.images.DivImageLoader
    public Boolean hasSvgSupport() {
        return Boolean.TRUE;
    }

    @Override // com.yandex.div.core.images.DivImageLoader
    public LoadReference loadImage(String str, DivImageDownloadCallback divImageDownloadCallback) {
        final d createCallOrNull = createCallOrNull(str);
        PictureDrawable pictureDrawable = this.svgCacheManager.get(str);
        if (pictureDrawable != null) {
            divImageDownloadCallback.onSuccess(pictureDrawable);
            return new eln0();
        }
        myc0.h(this.coroutineScope, null, null, new SvgDivImageLoader$loadImage$2(divImageDownloadCallback, createCallOrNull, this, str, null), 3);
        return new LoadReference() { // from class: xsna.fln0
            @Override // com.yandex.div.core.images.LoadReference
            public final void cancel() {
                SvgDivImageLoader.loadImage$lambda$1(okhttp3.d.this);
            }
        };
    }

    @Override // com.yandex.div.core.images.DivImageLoader
    public LoadReference loadImageBytes(final String str, final DivImageDownloadCallback divImageDownloadCallback) {
        return new LoadReference() { // from class: xsna.gln0
            @Override // com.yandex.div.core.images.LoadReference
            public final void cancel() {
                SvgDivImageLoader.this.loadImage(str, divImageDownloadCallback);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadImage$lambda$0() {
    }
}
