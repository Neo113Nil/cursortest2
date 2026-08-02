package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.libvideo.live.api.broadcast_settings.models.BroadcastAuthor;
import com.vkontakte.android.R;
import xsna.nj8;

/* compiled from: BroadcastSettingsAuthorSelectorViewHolder.kt */
/* loaded from: classes3.dex */
public final class mi8 extends mj8 {
    public final a m;

    /* compiled from: BroadcastSettingsAuthorSelectorViewHolder.kt */
    public static final class a extends sxm {
        public final izs<BroadcastAuthor, s3q0> i;

        /* JADX WARN: Multi-variable type inference failed */
        public a(izs<? super BroadcastAuthor, s3q0> izsVar) {
            this.i = izsVar;
            x0(nj8.a.class, new ha(this, 9));
        }
    }

    public mi8(ViewGroup viewGroup, com.vk.im.ui.fragments.b bVar) {
        super(viewGroup, R.layout.live_broadcast_settings_author_selector_item, 0);
        RecyclerView recyclerView = (RecyclerView) this.itemView.findViewById(R.id.live_broadcast_settings_author_selector_recycler);
        a aVar = new a(bVar);
        this.m = aVar;
        viewGroup.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setAdapter(aVar);
    }

    @Override // xsna.mj8, xsna.vfz
    /* renamed from: W5 */
    public final void h6(hfz hfzVar) {
        this.m.setItems(((nj8.b) hfzVar).b);
    }

    @Override // xsna.mj8
    public final void h6(nj8 nj8Var) {
        this.m.setItems(((nj8.b) nj8Var).b);
    }
}
