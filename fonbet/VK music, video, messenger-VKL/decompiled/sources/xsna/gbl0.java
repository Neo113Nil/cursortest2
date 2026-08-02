package xsna;

import androidx.recyclerview.widget.m;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.polls.Poll;
import com.vk.stories.design.view.stats.tabs.stickers.poll.PollPayload;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: StickersPollDiffUtilItemCallback.kt */
/* loaded from: classes6.dex */
public final class gbl0 extends m.e<ual0> {
    public static boolean a(ual0 ual0Var, ual0 ual0Var2) {
        Poll poll = ual0Var.b;
        Poll poll2 = ual0Var.b;
        String str = poll.d;
        Poll poll3 = ual0Var2.b;
        Poll poll4 = ual0Var2.b;
        return epx.f(str, poll3.d) && poll2.i == poll4.i && b(ual0Var, ual0Var2) && poll2.h == poll4.h && epx.f(poll2.f, poll4.f);
    }

    public static boolean b(ual0 ual0Var, ual0 ual0Var2) {
        Poll poll = ual0Var.b;
        boolean z = poll.i;
        Poll poll2 = ual0Var2.b;
        boolean z2 = poll2.i;
        int i = poll2.h;
        if (z != z2) {
            return false;
        }
        int i2 = poll.h;
        if (!(i2 == 0 && i == 0) && (i2 == 0 || i == 0)) {
            return false;
        }
        Set<UserId> keySet = poll.v.keySet();
        Map<UserId, Owner> map = poll2.v;
        List<UserId> list = poll2.u;
        return epx.f(keySet, map.keySet()) && poll.u.size() == list.size() && poll.u.containsAll(list);
    }

    public static ArrayList c(ual0 ual0Var, ual0 ual0Var2) {
        ArrayList arrayList = new ArrayList();
        Poll poll = ual0Var.b;
        Poll poll2 = ual0Var.b;
        String str = poll.d;
        Poll poll3 = ual0Var2.b;
        Poll poll4 = ual0Var2.b;
        if (!epx.f(str, poll3.d)) {
            arrayList.add(PollPayload.TITLE);
        }
        if (poll2.i != poll4.i) {
            arrayList.add(PollPayload.SUBTITLE);
        }
        if (!b(ual0Var, ual0Var2)) {
            arrayList.add(PollPayload.PHOTOS);
        }
        if (poll2.h != poll4.h) {
            arrayList.add(PollPayload.VOTES);
        }
        if (!epx.f(poll2.f, poll4.f)) {
            arrayList.add(PollPayload.OPTIONS);
        }
        return arrayList;
    }

    @Override // androidx.recyclerview.widget.m.e
    public final /* bridge */ /* synthetic */ boolean areContentsTheSame(ual0 ual0Var, ual0 ual0Var2) {
        return a(ual0Var, ual0Var2);
    }

    @Override // androidx.recyclerview.widget.m.e
    public final boolean areItemsTheSame(ual0 ual0Var, ual0 ual0Var2) {
        return ual0Var.b.b == ual0Var2.b.b;
    }

    @Override // androidx.recyclerview.widget.m.e
    public final /* bridge */ /* synthetic */ Object getChangePayload(ual0 ual0Var, ual0 ual0Var2) {
        return c(ual0Var, ual0Var2);
    }
}
