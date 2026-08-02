package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.fave.entities.FaveEntry;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.typography.FontFamily;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.Collections;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Triple;
import xsna.ej90;

/* compiled from: VideoFaveTextHolderTransformer.kt */
/* loaded from: classes4.dex */
public final class eks0 implements gn60<Triple<? extends FaveEntry, ? extends NewsEntry, ? extends v1c0>, wm60> {
    public final List a(int i, Triple triple) {
        Object failure;
        fj90 fj90Var;
        VideoFile videoFile;
        FaveEntry faveEntry = (FaveEntry) triple.d();
        NewsEntry newsEntry = (NewsEntry) triple.g();
        v1c0 v1c0Var = (v1c0) triple.h();
        FontFamily fontFamily = FontFamily.REGULAR;
        float e = cn70.e() * 2.25f;
        float a = cn70.a() * 4.0f;
        int b = cn70.b(8);
        VideoAttachment k = di60.k((FaveEntry) triple.i());
        String j1 = (k == null || (videoFile = k.k) == null) ? null : videoFile.j1();
        if (j1 != null) {
            try {
                failure = new fj90(ej90.a.b(j1, null, 6));
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            if (failure instanceof Result.Failure) {
                failure = null;
            }
            fj90Var = (fj90) failure;
        } else {
            fj90Var = null;
        }
        int i2 = !v1c0Var.f ? Integer.MAX_VALUE : di60.k(faveEntry) != null ? 1 : 10;
        msy.a(LazyThreadSafetyMode.NONE, new exw(5));
        NewsEntry newsEntry2 = v1c0Var.b;
        s1q c = ydo0.d(newsEntry2) ? ydo0.c(newsEntry2) : null;
        s1q a2 = c != null ? s1q.a(c, i2, 62) : null;
        Pair o = ad0.o(faveEntry);
        return Collections.singletonList(new dio0(faveEntry, newsEntry, false, false, v1c0Var, j1, fj90Var, fontFamily, true, 15.0f, a2, a2 != null, (int) a, b, e, 1.0f, ad0.E(faveEntry), ad0.v(faveEntry, newsEntry), ad0.A(faveEntry, newsEntry), ad0.p(faveEntry), (String) o.i(), (String) o.j(), false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gn60
    public final /* bridge */ /* synthetic */ List x(Pair pair, bp5 bp5Var) {
        return a(0, (Triple) pair);
    }
}
