package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.vk.newsfeed.api.posting.viewpresenter.settings.community.PostingSettingsCommunityItem;
import com.vkontakte.android.R;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: PostingSettingsCommunityAdapter.kt */
/* loaded from: classes4.dex */
public final class qlc0 extends zoj0<PostingSettingsCommunityItem, slc0<?>> {
    public final wmc e;
    public final ArrayList f;

    /* compiled from: PostingSettingsCommunityAdapter.kt */
    public static final class a extends m.e<PostingSettingsCommunityItem> {
        @Override // androidx.recyclerview.widget.m.e
        public final boolean areContentsTheSame(PostingSettingsCommunityItem postingSettingsCommunityItem, PostingSettingsCommunityItem postingSettingsCommunityItem2) {
            return postingSettingsCommunityItem.equals(postingSettingsCommunityItem2);
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areItemsTheSame(PostingSettingsCommunityItem postingSettingsCommunityItem, PostingSettingsCommunityItem postingSettingsCommunityItem2) {
            return postingSettingsCommunityItem.b() == postingSettingsCommunityItem2.b();
        }
    }

    /* compiled from: PostingSettingsCommunityAdapter.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PostingSettingsCommunityItem.ViewType.values().length];
            try {
                iArr[PostingSettingsCommunityItem.ViewType.Settings.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PostingSettingsCommunityItem.ViewType.Postpone.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PostingSettingsCommunityItem.ViewType.AuthorSign.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PostingSettingsCommunityItem.ViewType.Donut.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public qlc0(wmc wmcVar) {
        super(new com.vk.lists.a(new a()));
        this.e = wmcVar;
        this.f = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return ((PostingSettingsCommunityItem) this.c.c(i)).b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        slc0 slc0Var = (slc0) e0Var;
        PostingSettingsCommunityItem postingSettingsCommunityItem = (PostingSettingsCommunityItem) this.c.c(i);
        if (slc0Var instanceof x3j0) {
            ((x3j0) slc0Var).V5((PostingSettingsCommunityItem.d) postingSettingsCommunityItem);
        } else if (slc0Var instanceof zqc0) {
            ((zqc0) slc0Var).V5((PostingSettingsCommunityItem.c) postingSettingsCommunityItem);
        } else if (slc0Var instanceof ad5) {
            ((ad5) slc0Var).V5((PostingSettingsCommunityItem.a) postingSettingsCommunityItem);
        } else if (slc0Var instanceof n5o) {
            ((n5o) slc0Var).V5((PostingSettingsCommunityItem.b) postingSettingsCommunityItem);
        }
        this.f.add(slc0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        View b2 = tf3.b(viewGroup, R.layout.view_posting_settings_community_item, viewGroup, false);
        int i2 = b.$EnumSwitchMapping$0[PostingSettingsCommunityItem.ViewType.values()[i].ordinal()];
        wmc wmcVar = this.e;
        if (i2 == 1) {
            return new x3j0(b2, wmcVar);
        }
        if (i2 == 2) {
            return new zqc0(b2, wmcVar);
        }
        if (i2 == 3) {
            return new ad5(b2, wmcVar);
        }
        if (i2 == 4) {
            return new n5o(b2, wmcVar);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(RecyclerView.e0 e0Var) {
        slc0 slc0Var = (slc0) e0Var;
        super.onViewRecycled(slc0Var);
        this.f.remove(slc0Var);
    }
}
