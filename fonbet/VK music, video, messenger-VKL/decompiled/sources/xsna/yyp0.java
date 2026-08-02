package xsna;

import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.attachments.EventAttachment;
import com.vkontakte.android.attachments.PollAttachment;
import kotlin.Pair;
import kotlin.Triple;
import xsna.l7x0;

/* compiled from: UiDtoFactory.kt */
/* loaded from: classes4.dex */
public final class yyp0 {
    public static ol60 a(NewsEntry newsEntry, EventAttachment eventAttachment) {
        return (ol60) j5g.a0(new zq70().L(0, new Pair(eventAttachment, newsEntry), null));
    }

    public static ol60 b(PollAttachment pollAttachment, v1c0 v1c0Var, ol60 ol60Var) {
        m7x0 m7x0Var = ol60Var instanceof lad0 ? ((lad0) ol60Var).I : new m7x0(0);
        if (!(m7x0Var.a instanceof l7x0.c)) {
            m7x0Var.a = l7x0.b.a;
        }
        return (ol60) j5g.a0(new nad0().a(0, new Triple(pollAttachment, v1c0Var, m7x0Var)));
    }
}
