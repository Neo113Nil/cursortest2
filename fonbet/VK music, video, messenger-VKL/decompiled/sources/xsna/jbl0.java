package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.userstack.VkUserStack;
import com.vk.dto.polls.Poll;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: StickersPollViewHolder.kt */
/* loaded from: classes6.dex */
public final class jbl0 extends vfz<ual0> {
    public final TextView l;
    public final TextView m;
    public final VkUserStack n;
    public final TextView o;
    public final hbl0 p;

    public jbl0(Context context, ViewGroup viewGroup, com.vk.stories.design.view.stats.tabs.stickers.mvi.d dVar) {
        super(LayoutInflater.from(context).inflate(R.layout.pds_item_story_statistics_sticker_poll, viewGroup, false));
        this.l = (TextView) this.itemView.findViewById(R.id.title);
        this.m = (TextView) this.itemView.findViewById(R.id.subtitle_privacy);
        this.n = (VkUserStack) this.itemView.findViewById(R.id.subtitle_photo_stack);
        this.o = (TextView) this.itemView.findViewById(R.id.subtitle_votes_count);
        RecyclerView recyclerView = (RecyclerView) this.itemView.findViewById(R.id.options_recycler);
        hbl0 hbl0Var = new hbl0(this.itemView.getContext(), dVar);
        this.p = hbl0Var;
        dhk0 dhk0Var = new dhk0(0, 0, 0, cn70.b(4));
        dhk0Var.i = false;
        recyclerView.setAdapter(hbl0Var);
        recyclerView.addItemDecoration(dhk0Var);
        this.itemView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setNestedScrollingEnabled(false);
    }

    @Override // xsna.vfz
    public final void W5(ual0 ual0Var) {
        Poll poll = ual0Var.b;
        this.l.setText(poll.d);
        this.m.setText(b6().getString(poll.i ? R.string.story_statistics_stickers_poll_subtitle_anonymous : R.string.story_statistics_stickers_poll_subtitle_public));
        h6(poll);
        i6(poll);
        this.p.setItems(poll.f);
    }

    public final void h6(Poll poll) {
        boolean z = poll.i;
        TextView textView = this.o;
        VkUserStack vkUserStack = this.n;
        if (z || poll.h == 0) {
            bwt0.p0(vkUserStack, false);
            f4m.s(cn70.b(8), textView);
            return;
        }
        List Eb = poll.Eb();
        ArrayList arrayList = new ArrayList(c5g.u(Eb, 10));
        Iterator it = Eb.iterator();
        while (it.hasNext()) {
            String a = js5.a(50, (String) it.next());
            if (a == null) {
                a = "";
            }
            itj0.d(a, arrayList);
        }
        bwt0.p0(vkUserStack, true);
        vkUserStack.setAvatars(arrayList);
        f4m.s(cn70.b(6), textView);
    }

    public final void i6(Poll poll) {
        String string;
        int i = poll.h;
        if (i > 0) {
            string = b6().getQuantityString(R.plurals.story_statistics_stickers_poll_subtitle_votes_count, poll.h, uqm0.d(i));
        } else {
            string = b6().getString(R.string.story_statistics_stickers_poll_subtitle_votes_empty);
        }
        this.o.setText(string);
    }
}
