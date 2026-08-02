package xsna;

import android.content.Context;
import android.view.ViewGroup;
import com.vk.dto.polls.Poll;
import com.vk.stories.design.view.stats.tabs.stickers.poll.PollPayload;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: StickersPollDelegate.kt */
/* loaded from: classes6.dex */
public final class fbl0 extends p1u0<ual0> {
    public final Context a;
    public final com.vk.stories.design.view.stats.tabs.stickers.mvi.d b;

    public fbl0(Context context, com.vk.stories.design.view.stats.tabs.stickers.mvi.d dVar) {
        this.a = context;
        this.b = dVar;
    }

    @Override // xsna.p1u0
    public final void a(vfz<ual0> vfzVar, ual0 ual0Var, List list) {
        ual0 ual0Var2 = ual0Var;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            vfzVar.W5(ual0Var2);
            return;
        }
        jbl0 jbl0Var = vfzVar instanceof jbl0 ? (jbl0) vfzVar : null;
        if (jbl0Var != null) {
            Object Y = j5g.Y(list);
            List list3 = Y instanceof List ? (List) Y : null;
            if (list3 == null) {
                return;
            }
            Poll poll = ual0Var2.b;
            if (list3.contains(PollPayload.TITLE)) {
                jbl0Var.l.setText(poll.d);
            }
            if (list3.contains(PollPayload.SUBTITLE)) {
                jbl0Var.m.setText(jbl0Var.b6().getString(poll.i ? R.string.story_statistics_stickers_poll_subtitle_anonymous : R.string.story_statistics_stickers_poll_subtitle_public));
            }
            if (list3.contains(PollPayload.PHOTOS)) {
                jbl0Var.h6(poll);
            }
            if (list3.contains(PollPayload.VOTES)) {
                jbl0Var.i6(poll);
            }
            if (list3.contains(PollPayload.OPTIONS)) {
                jbl0Var.p.setItems(poll.f);
            }
        }
    }

    @Override // xsna.p1u0
    public final vfz<? extends ual0> b(ViewGroup viewGroup) {
        return new jbl0(this.a, viewGroup, this.b);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof ual0;
    }
}
