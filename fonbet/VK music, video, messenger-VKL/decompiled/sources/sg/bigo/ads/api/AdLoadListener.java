package sg.bigo.ads.api;

import androidx.annotation.NonNull;
import sg.bigo.ads.api.Ad;

/* loaded from: classes9.dex */
public interface AdLoadListener<T extends Ad> {
    void onAdLoaded(@NonNull T t);

    void onError(@NonNull AdError adError);
}
