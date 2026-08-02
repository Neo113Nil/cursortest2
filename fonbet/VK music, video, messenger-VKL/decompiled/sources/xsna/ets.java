package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.friends.api.presentation.FriendsSelectionType;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.nqs;

/* compiled from: FriendsSelectionAdapter.kt */
/* loaded from: classes15.dex */
public final class ets extends xb {
    public final dh8 g;
    public final hts h;
    public final FriendsSelectionType i;

    /* compiled from: FriendsSelectionAdapter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FriendsSelectionType.values().length];
            try {
                iArr[FriendsSelectionType.SINGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FriendsSelectionType.MULTIPLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ets(hg6 hg6Var, dh8 dh8Var, hts htsVar, FriendsSelectionType friendsSelectionType) {
        super(hg6Var);
        this.g = dh8Var;
        this.h = htsVar;
        this.i = friendsSelectionType;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        nqs nqsVar = (nqs) this.c.c(i);
        if ((nqsVar instanceof nqs.a) || (nqsVar instanceof pqs)) {
            return 0;
        }
        if (nqsVar instanceof oqs) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((vif0) e0Var).V5(this.c.c(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ekq0 ekq0Var;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalArgumentException(lhg.a(i, "Unsupported view type "));
            }
            axu axuVar = new axu(viewGroup);
            return new gts(axuVar, axuVar.itemView);
        }
        int i2 = a.$EnumSwitchMapping$0[this.i.ordinal()];
        if (i2 == 1) {
            ekq0Var = new ekq0(viewGroup, R.layout.user_item, false, false);
            ekq0Var.t = new h2s(this, 2);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            ekq0Var = new ekq0(viewGroup, R.layout.user_item_checkable, true, false);
            ekq0Var.v = new com.vk.movika.tools.controls.seekbar.h(this, 5);
        }
        return new fts(this, ekq0Var, ekq0Var.itemView);
    }

    @Override // xsna.xb
    public final int v(int i) {
        return 1;
    }
}
