package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.dto.common.Attachment;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: GridDisplayItemsFactory.kt */
/* loaded from: classes4.dex */
public final class lfu {
    public static w84 a(e84 e84Var) {
        v64 n;
        NewsEntry newsEntry = e84Var.a;
        NewsEntry newsEntry2 = e84Var.b;
        ArrayList arrayList = e84Var.c;
        w84 w84Var = new w84(newsEntry, newsEntry2, PsExtractor.PRIVATE_STREAM_1, arrayList);
        w84Var.l = e84Var.e;
        NewsEntry newsEntry3 = e84Var.a;
        NewsEntry newsEntry4 = e84Var.b;
        int i = newsEntry3 instanceof Post ? 10 : 5;
        if (arrayList.size() <= i) {
            i = arrayList.size();
        }
        int i2 = i;
        ArrayList arrayList2 = new ArrayList();
        for (int i3 = 0; i3 < i2; i3++) {
            Attachment attachment = (Attachment) j5g.b0(i3, arrayList);
            if (attachment != null && (n = alk.n(fz5.m(attachment), attachment, newsEntry3, newsEntry4)) != null) {
                arrayList2.add(n);
            }
        }
        w84Var.h = (ol60) j5g.a0(Collections.singletonList(new z5t(newsEntry3, newsEntry4, arrayList2, i2, 0)));
        return w84Var;
    }
}
