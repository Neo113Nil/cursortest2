package xsna;

import android.content.Context;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.attachments.DisclaimerData;
import com.vkontakte.android.attachments.ShitAttachment;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* compiled from: AdCardTransformer.kt */
/* loaded from: classes4.dex */
public final class id0 implements gn60<Pair<? extends List<? extends ShitAttachment.Card>, ? extends NewsEntry>, wm60> {
    public final List<ol60> a(int i, Pair<? extends List<ShitAttachment.Card>, ? extends NewsEntry> pair, wm60 wm60Var) {
        List<ShitAttachment.Card> d = pair.d();
        NewsEntry g = pair.g();
        if (!(g instanceof ShitAttachment)) {
            return EmptyList.b;
        }
        StringBuilder sb = new StringBuilder();
        for (ShitAttachment.Card card : d) {
            sb.setLength(0);
            String str = myc0.f(card.n) ? card.n : card.f;
            String str2 = card.c;
            if (str2 == null) {
                str2 = "";
            }
            sb.append(str2);
            sb.append(str);
            String str3 = card.g;
            sb.append(str3 != null ? str3 : "");
            DisclaimerData disclaimerData = ((ShitAttachment) g).Z;
            if (disclaimerData != null) {
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                sb.append(di60.m(disclaimerData, context));
            }
            card.t = sb.toString();
        }
        return Collections.singletonList(new wt9(d));
    }

    @Override // xsna.gn60
    public final /* bridge */ /* synthetic */ List x(Pair pair, bp5 bp5Var) {
        return a(0, pair, bp5Var);
    }
}
