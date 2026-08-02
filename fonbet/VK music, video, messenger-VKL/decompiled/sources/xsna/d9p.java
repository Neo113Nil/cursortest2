package xsna;

import ru.ok.gleffects.EffectHolder;
import ru.ok.gleffects.impl.EffectNativeSink;
import ru.ok.gleffects.recognition.GalleryAsset;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class d9p implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d9p(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((EffectHolder) this.c).lambda$handleGalleryItemSelected$26((EffectNativeSink) this.d, (GalleryAsset) this.e);
                break;
            default:
                com.vungle.ads.internal.downloader.h.a((com.vungle.ads.internal.downloader.k) this.c, (com.vungle.ads.internal.downloader.h) this.d, (com.vungle.ads.internal.downloader.d) this.e);
                break;
        }
    }
}
