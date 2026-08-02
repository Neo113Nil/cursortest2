package xsna;

import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.core.models.news.PromoButton;

/* compiled from: PromoButtonPrefetchHelper.kt */
/* loaded from: classes4.dex */
public final class r4e0 extends de {
    @Override // xsna.de
    public final int b0(u1c0 u1c0Var) {
        return 1;
    }

    @Override // xsna.de
    public final String d0(u1c0 u1c0Var, int i) {
        Image image;
        ImageSize Cb;
        NewsEntry newsEntry = u1c0Var.a;
        if (!(newsEntry instanceof PromoButton) || (image = ((PromoButton) newsEntry).k) == null || (Cb = image.Cb(iah0.a(48.0f), true, false)) == null) {
            return null;
        }
        return Cb.d.d;
    }
}
