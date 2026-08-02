package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.newsfeed.common.discover.media.cells.holders.tags.DiscoverTagType;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: TagsAdapterV2.kt */
/* loaded from: classes4.dex */
public final class r1o0 extends RecyclerView.Adapter<vif0<String>> {
    public final ArrayList<ean> c = new ArrayList<>();

    /* compiled from: TagsAdapterV2.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DiscoverTagType.values().length];
            try {
                iArr[DiscoverTagType.SIMPLE_BADGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DiscoverTagType.OZON_BADGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public r1o0(int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        int i2 = a.$EnumSwitchMapping$0[this.c.get(i).b.ordinal()];
        if (i2 == 1) {
            return 0;
        }
        if (i2 == 2) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(vif0<String> vif0Var, int i) {
        vif0<String> vif0Var2 = vif0Var;
        ean eanVar = (ean) j5g.b0(i, this.c);
        if (eanVar == null) {
            return;
        }
        vif0Var2.V5(eanVar.a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final vif0<String> onCreateViewHolder(ViewGroup viewGroup, int i) {
        return i == 1 ? new l0o0(viewGroup) : new m0o0(viewGroup);
    }
}
