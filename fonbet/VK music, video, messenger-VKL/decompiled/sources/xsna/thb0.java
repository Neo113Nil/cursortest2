package xsna;

import android.content.Context;
import com.vk.music.podcast.impl.ui.PodcastCatalogFragment;
import com.vk.music.podcast.impl.ui.PodcastCategoryCatalogFragment;

/* compiled from: PodcastLauncherImpl.kt */
/* loaded from: classes.dex */
public final class thb0 implements shb0 {
    @Override // xsna.shb0
    public final void a(Context context, String str, String str2) {
        if (str2 == null || str2.length() == 0) {
            PodcastCatalogFragment.a aVar = new PodcastCatalogFragment.a(0);
            aVar.y(str);
            aVar.k(context);
        } else {
            PodcastCategoryCatalogFragment.a aVar2 = new PodcastCategoryCatalogFragment.a(str2);
            aVar2.y(str);
            aVar2.k(context);
        }
    }
}
