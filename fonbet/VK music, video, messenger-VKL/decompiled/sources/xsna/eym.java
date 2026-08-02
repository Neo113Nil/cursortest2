package xsna;

import android.os.Parcelable;
import com.vk.dto.newsfeed.entries.Digest;
import com.vk.dto.newsfeed.entries.DigestItem;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.List;

/* compiled from: DigestGridPrefetchHelper.kt */
/* loaded from: classes4.dex */
public final class eym extends de {
    @Override // xsna.de
    public final int b0(u1c0 u1c0Var) {
        List<DigestItem> list;
        NewsEntry newsEntry = u1c0Var.b;
        Digest digest = newsEntry instanceof Digest ? (Digest) newsEntry : null;
        if (digest == null || (list = digest.m) == null) {
            return 0;
        }
        return list.size();
    }

    @Override // xsna.de
    public final String d0(u1c0 u1c0Var, int i) {
        NewsEntry newsEntry = u1c0Var.a;
        Digest digest = newsEntry instanceof Digest ? (Digest) newsEntry : null;
        if (digest != null) {
            DigestItem digestItem = (DigestItem) j5g.b0(i, digest.m);
            Parcelable d = digestItem != null ? digestItem.d() : null;
            tfw tfwVar = d instanceof tfw ? (tfw) d : null;
            if (tfwVar != null) {
                return tfwVar.h9();
            }
        }
        return null;
    }
}
