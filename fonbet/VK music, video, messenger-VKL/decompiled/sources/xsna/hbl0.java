package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.polls.PollOption;
import com.vkontakte.android.R;

/* compiled from: StickersPollOptionAdapter.kt */
/* loaded from: classes6.dex */
public final class hbl0 extends zoj0<PollOption, ibl0> {
    public final Context e;
    public final ebl0 f;

    public hbl0(Context context, ebl0 ebl0Var) {
        this.e = context;
        this.f = ebl0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((ibl0) e0Var).V5(this.c.c(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ibl0(LayoutInflater.from(this.e).inflate(R.layout.pds_item_story_statistics_sticker_poll_option, viewGroup, false), this.f);
    }
}
