package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.serialize.Serializer;
import com.vk.superapp.api.dto.story.actions.WebActionEmoji;

/* compiled from: EmojiAdapter.kt */
/* loaded from: classes15.dex */
public final class xcp extends RecyclerView.Adapter<ldp> {
    public final uei0 c;

    public xcp(uei0 uei0Var) {
        this.c = uei0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        Serializer.c<WebActionEmoji> cVar = WebActionEmoji.CREATOR;
        return WebActionEmoji.d.length;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(ldp ldpVar, int i) {
        ldpVar.l.o0(i5s.a(new StringBuilder("asset:///emoji/"), WebActionEmoji.d[i], ".png"), null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final ldp onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ldp(viewGroup.getContext(), this.c);
    }
}
