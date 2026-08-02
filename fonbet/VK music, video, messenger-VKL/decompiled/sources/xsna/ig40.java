package xsna;

import com.vk.mediastore.media.exo.datasource.VkHttpCallFactory;
import okhttp3.d;

/* compiled from: MusicDownloadCallFactory.kt */
/* loaded from: classes3.dex */
public final class ig40 implements d.a {
    public final VkHttpCallFactory b;
    public final okhttp3.o c;

    public ig40(VkHttpCallFactory vkHttpCallFactory, okhttp3.o oVar) {
        this.b = vkHttpCallFactory;
        this.c = oVar;
    }

    @Override // okhttp3.d.a
    public final okhttp3.d a(okhttp3.p pVar) {
        String str = pVar.a.i;
        return (qar0.g().c.matcher(str).lookingAt() || drm0.D(str, ".jpeg", true) || drm0.D(str, ".jpg", true)) ? this.c.a(pVar) : this.b.a(pVar);
    }
}
