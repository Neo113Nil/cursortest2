package xsna;

import com.vk.core.util.measure.ScaleType;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import one.video.transform.TransformController;

/* compiled from: VideoAutoplayWideNoInfoHolderTransformer.kt */
/* loaded from: classes4.dex */
public final class j4s0 implements gn60<p2s0, wm60> {
    public final List a(p2s0 p2s0Var) {
        NewsEntry newsEntry = p2s0Var.a;
        NewsEntry newsEntry2 = p2s0Var.b;
        VideoAttachment videoAttachment = p2s0Var.c;
        int i = p2s0Var.d;
        boolean z = p2s0Var.e.l;
        return Collections.singletonList(new h4s0(newsEntry, newsEntry2, alk.G(newsEntry, newsEntry2, videoAttachment), i, ScaleType.CENTER_CROP, TransformController.ScaleType.CROP, z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gn60
    public final /* bridge */ /* synthetic */ List x(Pair pair, bp5 bp5Var) {
        return a((p2s0) pair);
    }
}
