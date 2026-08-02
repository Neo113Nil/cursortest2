package xsna;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.newsfeed.entries.ClipsEntry;
import com.vk.dto.shortvideo.Clips;
import com.vk.newsfeed.common.recycler.holders.videos.clips.ClipsHolderViewImpl;
import com.vk.newsfeed.common.recycler.holders.videos.clips.retention.RetentionType;
import com.vk.newsfeed.common.recycler.holders.videos.clips.stat.ClipsHolderEventBuilder;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import xsna.akd;

/* compiled from: ClipsRetentionBlockHolder.kt */
/* loaded from: classes4.dex */
public final class s1f extends rp6<wjd, ClipsEntry> implements ent0 {
    public final ClipsHolderViewImpl E;
    public final ConstraintLayout F;
    public final Object G;
    public final fev H;

    /* compiled from: ClipsRetentionBlockHolder.kt */
    public static final class a extends RecyclerView.r {
        public final RecyclerView a;
        public final int b;

        public a(RecyclerView recyclerView, int i) {
            this.a = recyclerView;
            this.b = i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final boolean onFling(int i, int i2) {
            double d = this.b * 0.5d;
            if (Math.abs(i) <= d) {
                return false;
            }
            this.a.fling((int) (Math.signum(i) * d), i2);
            return true;
        }
    }

    /* compiled from: ClipsRetentionBlockHolder.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RetentionType.values().length];
            try {
                iArr[RetentionType.OZON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RetentionType.SHOPS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public s1f(ViewGroup viewGroup, RetentionType retentionType) {
        super(R.layout.news_clips_retention_block, viewGroup);
        ClipsHolderViewImpl clipsHolderViewImpl = (ClipsHolderViewImpl) this.itemView.findViewById(R.id.list);
        this.E = clipsHolderViewImpl;
        this.F = (ConstraintLayout) this.itemView.findViewById(R.id.skeleton);
        Lazy a2 = msy.a(LazyThreadSafetyMode.NONE, new pce(this, 3));
        this.G = a2;
        this.H = new fev(clipsHolderViewImpl);
        RecyclerView recyclerView = clipsHolderViewImpl.getRecyclerView();
        int i = b.$EnumSwitchMapping$0[retentionType.ordinal()];
        clipsHolderViewImpl.z(i != 1 ? i != 2 ? akd.c.a : akd.d.a : akd.a.a, false);
        getContext();
        clipsHolderViewImpl.setMeasureStrategy(new ClipsHolderViewImpl.a.c());
        if (retentionType == RetentionType.RETENTION) {
            recyclerView.setOnFlingListener(new a(recyclerView, ((Number) a2.getValue()).intValue()));
        }
        f4m.q(cn70.b(3), this.itemView);
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
            getContext();
            constraintLayout.setVisibility(0);
            clipsHolderViewImpl.setVisibility(4);
            new ClipsHolderEventBuilder(ClipsHolderEventBuilder.Event.SKELETON_SHOWN, str, ClipsHolderEventBuilder.HolderType.RETENTION_BLOCK).q();
            return;
        }
        List<ClipVideoFile> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            getContext();
            constraintLayout.setVisibility(0);
            clipsHolderViewImpl.setVisibility(4);
            new ClipsHolderEventBuilder(ClipsHolderEventBuilder.Event.EMPTY_PLACEHOLDER_SHOWN, str, ClipsHolderEventBuilder.HolderType.RETENTION_BLOCK).q();
            return;
        }
        f4m.j(constraintLayout);
        clipsHolderViewImpl.setVisibility(0);
        ClipsEntry clipsEntry3 = (ClipsEntry) q6();
        if (clipsEntry3 != null) {
            clipsHolderViewImpl.A(clips, this.u, clipsEntry3.l);
        }
        new ClipsHolderEventBuilder(ClipsHolderEventBuilder.Event.ITEMS_SHOWN, str, ClipsHolderEventBuilder.HolderType.RETENTION_BLOCK).q();
    }

    @Override // xsna.ent0
    public final dnt0 q3() {
        return this.H.c;
    }
}
