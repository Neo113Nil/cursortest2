package xsna;

import com.vk.dto.common.Image;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.attachments.PrettyCardAttachment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.Triple;

/* compiled from: PrettyCardsHolderTransformer.kt */
/* loaded from: classes4.dex */
public final class h3d0 implements gn60<Triple<? extends NewsEntry, ? extends NewsEntry, ? extends PrettyCardAttachment>, wm60> {
    public final List a(int i, Triple triple) {
        NewsEntry newsEntry = (NewsEntry) triple.d();
        NewsEntry newsEntry2 = (NewsEntry) triple.g();
        PrettyCardAttachment prettyCardAttachment = (PrettyCardAttachment) triple.h();
        ArrayList arrayList = new ArrayList();
        List<PrettyCardAttachment.Card> list = prettyCardAttachment.f;
        if (list != null) {
            int i2 = 0;
            for (Object obj : list) {
                int i3 = i2 + 1;
                String str = null;
                if (i2 < 0) {
                    e43.t();
                    throw null;
                }
                PrettyCardAttachment.Card card = (PrettyCardAttachment.Card) obj;
                PrettyCardAttachment.Button button = card.g;
                int i4 = button != null ? 0 : 8;
                Image image = card.h;
                String str2 = card.f;
                String str3 = card.i;
                String str4 = card.j;
                if (button != null) {
                    str = button.b;
                }
                arrayList.add(new c3d0(newsEntry, newsEntry2, prettyCardAttachment, card, image, str2, str3, str4, str, i4, i2));
                i2 = i3;
            }
        }
        return Collections.singletonList(new i3d0((NewsEntry) triple.i(), (NewsEntry) triple.j(), prettyCardAttachment, arrayList));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gn60
    public final /* bridge */ /* synthetic */ List x(Pair pair, bp5 bp5Var) {
        return a(0, (Triple) pair);
    }
}
