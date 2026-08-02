package xsna;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.newsfeed.entries.ClipsEntry;
import com.vk.dto.shortvideo.Clips;
import com.vk.newsfeed.common.recycler.holders.videos.clips.ClipsHolderViewImpl;
import com.vk.newsfeed.common.recycler.holders.videos.clips.stat.ClipsHolderEventBuilder;
import com.vkontakte.android.R;
import java.util.List;
import xsna.akd;

/* compiled from: ClipsRecomBlockHolder.kt */
/* loaded from: classes4.dex */
public final class d0f extends rp6<wjd, ClipsEntry> implements ent0 {
    public final ClipsHolderViewImpl E;
    public final ConstraintLayout F;
    public final fev G;

    public d0f(ViewGroup viewGroup) {
        super(R.layout.news_clips, viewGroup);
        ClipsHolderViewImpl clipsHolderViewImpl = (ClipsHolderViewImpl) this.itemView.findViewById(R.id.list);
        this.E = clipsHolderViewImpl;
        this.F = (ConstraintLayout) this.itemView.findViewById(R.id.skeleton);
        fev fevVar = new fev(clipsHolderViewImpl);
        this.G = fevVar;
        RecyclerView recyclerView = clipsHolderViewImpl.getRecyclerView();
        clipsHolderViewImpl.z(akd.b.a, true);
        clipsHolderViewImpl.setMeasureStrategy(new ClipsHolderViewImpl.a.b(e3m.a(R.dimen.clip_autoplay_height, this.itemView.getContext())));
        recyclerView.setOnFlingListener(null);
        fevVar.b.attachToRecyclerView(recyclerView);
    }

    @Override // xsna.rp6
    public final /* bridge */ /* synthetic */ void R6(wjd wjdVar) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.rp6
    public final void U6(ClipsEntry clipsEntry) {
        ClipsEntry clipsEntry2 = clipsEntry;
        String str = clipsEntry2.l;
        super.U6(clipsEntry2);
        Clips clips = clipsEntry2.j;
        List<ClipVideoFile> list = clips != null ? clips.b : null;
        boolean z = clipsEntry2.e;
        ClipsHolderViewImpl clipsHolderViewImpl = this.E;
        ConstraintLayout constraintLayout = this.F;
        if (z) {
            constraintLayout.setVisibility(0);
            f4m.j(clipsHolderViewImpl);
            new ClipsHolderEventBuilder(ClipsHolderEventBuilder.Event.SKELETON_SHOWN, str, ClipsHolderEventBuilder.HolderType.RECOMMENDATION_BLOCK).q();
            return;
        }
        List<ClipVideoFile> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            constraintLayout.setVisibility(0);
            f4m.j(clipsHolderViewImpl);
            new ClipsHolderEventBuilder(ClipsHolderEventBuilder.Event.EMPTY_PLACEHOLDER_SHOWN, str, ClipsHolderEventBuilder.HolderType.RECOMMENDATION_BLOCK).q();
        } else {
            f4m.j(constraintLayout);
            clipsHolderViewImpl.setVisibility(0);
            ClipsEntry clipsEntry3 = (ClipsEntry) q6();
            if (clipsEntry3 != null) {
                clipsHolderViewImpl.A(clips, this.u, clipsEntry3.l);
            }
            new ClipsHolderEventBuilder(ClipsHolderEventBuilder.Event.ITEMS_SHOWN, str, ClipsHolderEventBuilder.HolderType.RECOMMENDATION_BLOCK).q();
        }
    }

    @Override // xsna.ent0
    public final dnt0 q3() {
        return this.G.c;
    }
}
