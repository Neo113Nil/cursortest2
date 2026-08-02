package xsna;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.components.cell.VkCell;
import com.vk.imageloader.view.VKImageView;
import com.vk.newsfeed.common.posting.listfriends.ListFriendsIconDrawable;
import com.vkontakte.android.R;
import xsna.tlo0;
import xsna.w7k;

/* compiled from: ListsFriendsItemVh.kt */
/* loaded from: classes4.dex */
public final class uhz extends vfz<com.vk.newsfeed.common.posting.listfriends.a> {
    public final d l;
    public final VkCell m;
    public com.vk.newsfeed.common.posting.listfriends.a n;

    /* compiled from: ListsFriendsItemVh.kt */
    public static final class a implements VkCell.d {
        public final VKImageView a;

        public a(Context context) {
            VKImageView vKImageView = new VKImageView(context, null, 6, 0);
            vKImageView.setPlaceholderImage(dhr0.w(R.drawable.user_placeholder, context));
            this.a = vKImageView;
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final void a(VkCell.f fVar) {
            c cVar = fVar instanceof c ? (c) fVar : null;
            if (cVar != null) {
                this.a.setImageDrawable(cVar.a);
            }
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final View getView() {
            return this.a;
        }
    }

    /* compiled from: ListsFriendsItemVh.kt */
    public static final class b implements VkCell.e {
        @Override // com.vk.core.view.components.cell.VkCell.e
        public final VkCell.d create(Context context) {
            return new a(context);
        }
    }

    /* compiled from: ListsFriendsItemVh.kt */
    public static final class c implements VkCell.f {
        public final ListFriendsIconDrawable a;

        public c(ListFriendsIconDrawable listFriendsIconDrawable) {
            this.a = listFriendsIconDrawable;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "AvatarViewParams(icon=" + this.a + ')';
        }
    }

    /* compiled from: ListsFriendsItemVh.kt */
    public interface d extends w7k.a {
        void P(int i, int i2, String str);

        void e(int i, boolean z);

        void l0(int i, int i2);
    }

    public uhz(ViewGroup viewGroup, d dVar) {
        super(R.layout.select_friends_row_item, viewGroup);
        this.l = dVar;
        VkCell vkCell = (VkCell) this.itemView;
        this.m = vkCell;
        vkCell.setLeftMainAvatarController(new b());
        vkCell.setOnClickListener(new og8(this, 3));
    }

    @Override // xsna.vfz
    public final void W5(com.vk.newsfeed.common.posting.listfriends.a aVar) {
        com.vk.newsfeed.common.posting.listfriends.a aVar2 = aVar;
        this.n = aVar2;
        VkCell.Left.b h6 = h6(aVar2);
        VkCell vkCell = this.m;
        vkCell.setLeft(h6);
        vkCell.setMiddle(VkCell.Middle.a.a(VkCell.Middle.Companion, new VkCell.Middle.e(oq.d(tlo0.Companion, aVar2.c), 1, TextUtils.TruncateAt.END, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 50), null, null, 14));
        vkCell.setRight(VkCell.Right.c.a(VkCell.Right.Companion, null, null, new VkCell.Right.ExtraAction.d(new hn9(16, this, aVar2), (tlo0.f) null, 6), null, 27));
        View findViewById = vkCell.findViewById(R.id.ds_internal_cell_right_extra_actions_wrapper);
        if (findViewById != null) {
            findViewById.setContentDescription(y8g0.e(R.string.list_friends_overflow_menu_actions_accessibility));
        }
    }

    public final VkCell.Left.b h6(com.vk.newsfeed.common.posting.listfriends.a aVar) {
        VkCell.Left.a aVar2 = VkCell.Left.Companion;
        VkCell.Left.Main.a aVar3 = new VkCell.Left.Main.a(new c((ListFriendsIconDrawable) aVar.g.getValue()), VkCell.Left.Main.Size.Small);
        boolean z = aVar.e;
        VkCell.Left.c.a aVar4 = new VkCell.Left.c.a(4, new mk(13, this, aVar), z);
        aVar2.getClass();
        return new VkCell.Left.b(aVar3, aVar4);
    }

    public final void i6(com.vk.newsfeed.common.posting.listfriends.a aVar) {
        if (bwt0.b()) {
            return;
        }
        aVar.e = !aVar.e;
        this.m.setLeft(h6(aVar));
        this.l.e(aVar.b, aVar.e);
    }
}
