package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.components.cell.button.VkCellButton;
import com.vk.newsfeed.impl.posting.profilefriendslists.MoreItemsType;
import com.vkontakte.android.R;

/* compiled from: ProfileFriendsMoreVh.kt */
/* loaded from: classes4.dex */
public final class kxd0 extends vfz<jxd0> implements View.OnClickListener {
    public final a l;
    public final MoreItemsType m;
    public final VkCellButton n;
    public jxd0 o;

    /* compiled from: ProfileFriendsMoreVh.kt */
    public interface a {
        void a(int i);
    }

    /* compiled from: ProfileFriendsMoreVh.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MoreItemsType.values().length];
            try {
                iArr[MoreItemsType.MORE_CONVERSATIONS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MoreItemsType.MORE_FRIENDS_LISTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public kxd0(ViewGroup viewGroup, a aVar, MoreItemsType moreItemsType) {
        super(R.layout.holder_profile_friends_more, viewGroup);
        this.l = aVar;
        this.m = moreItemsType;
        VkCellButton vkCellButton = (VkCellButton) this.itemView;
        this.n = vkCellButton;
        vkCellButton.setOnClickListener(this);
    }

    @Override // xsna.vfz
    public final void W5(jxd0 jxd0Var) {
        int i;
        jxd0 jxd0Var2 = jxd0Var;
        this.o = jxd0Var2;
        MoreItemsType moreItemsType = this.m;
        int i2 = moreItemsType == null ? -1 : b.$EnumSwitchMapping$0[moreItemsType.ordinal()];
        if (i2 == 1) {
            i = R.plurals.best_friends_more_converations;
        } else {
            if (i2 != 2) {
                throw new IllegalArgumentException("unknown more title type: " + moreItemsType);
            }
            i = R.plurals.profile_friends_more_friends_lists;
        }
        int i3 = jxd0Var2.b;
        this.n.setTitle(y8g0.d(i, i3, Integer.valueOf(i3)));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        jxd0 jxd0Var;
        if (!epx.f(view, this.itemView) || bwt0.b() || (jxd0Var = this.o) == null) {
            return;
        }
        this.l.a(jxd0Var.b);
    }
}
