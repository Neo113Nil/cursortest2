package xsna;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.picture.c;
import com.vk.newsfeed.api.posting.profilefriendslists.ProfileFriendItem;
import com.vk.stat.scheme.SchemeStat$PostDraftItemEventType;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import xsna.tlo0;

/* compiled from: BestFriendsConversationVh.kt */
/* loaded from: classes4.dex */
public final class rx6 extends vfz<px6> implements w8i {
    public final d l;
    public final VkCell m;
    public px6 n;
    public final Object o;

    /* compiled from: BestFriendsConversationVh.kt */
    public static final class a implements VkCell.d {
        public final VkAvatar a;
        public final Object b;

        public a(Context context) {
            VkAvatar vkAvatar = new VkAvatar(context, null, 6, 0);
            vkAvatar.setPlaceholderImage(dhr0.w(R.drawable.user_placeholder, context));
            this.a = vkAvatar;
            this.b = msy.a(LazyThreadSafetyMode.NONE, new qx6(context, 0));
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
        @Override // com.vk.core.view.components.cell.VkCell.d
        public final void a(VkCell.f fVar) {
            c cVar = fVar instanceof c ? (c) fVar : null;
            if (cVar != null) {
                ox6 ox6Var = cVar.a;
                String str = ox6Var.d;
                VkAvatar vkAvatar = this.a;
                if (str != null && !drm0.N(str)) {
                    vkAvatar.setContent(new c.d(str, null));
                    return;
                }
                ?? r0 = this.b;
                com.vk.im.ui.views.avatars.a aVar = (com.vk.im.ui.views.avatars.a) r0.getValue();
                long j = ox6Var.a;
                String str2 = ox6Var.b;
                int i = com.vk.im.ui.views.avatars.a.o;
                aVar.b(j, str2, null);
                vkAvatar.setContent(new c.b(new eko((com.vk.im.ui.views.avatars.a) r0.getValue())));
            }
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final View getView() {
            return this.a;
        }
    }

    /* compiled from: BestFriendsConversationVh.kt */
    public static final class b implements VkCell.e {
        @Override // com.vk.core.view.components.cell.VkCell.e
        public final VkCell.d create(Context context) {
            return new a(context);
        }
    }

    /* compiled from: BestFriendsConversationVh.kt */
    public static final class c implements VkCell.f {
        public final ox6 a;

        public c(ox6 ox6Var) {
            this.a = ox6Var;
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
            return "AvatarViewParams(conversation=" + this.a + ')';
        }
    }

    /* compiled from: BestFriendsConversationVh.kt */
    public interface d {
        void L1(ox6 ox6Var);

        void M1(List<ProfileFriendItem> list);

        void S0(List<ProfileFriendItem> list);
    }

    public rx6(ViewGroup viewGroup, d dVar) {
        super(R.layout.select_friends_row_item, viewGroup);
        this.l = dVar;
        VkCell vkCell = (VkCell) this.itemView;
        this.m = vkCell;
        this.o = msy.a(LazyThreadSafetyMode.NONE, new ng1(this, 6));
        vkCell.setLeftMainAvatarController(new b());
        this.itemView.setOnClickListener(new i1(this, 1));
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    public static final void h6(rx6 rx6Var) {
        d dVar = rx6Var.l;
        px6 px6Var = rx6Var.n;
        if (px6Var != null) {
            List<ProfileFriendItem> list = px6Var.d;
            if (!px6Var.c) {
                dVar.S0(list);
                return;
            }
            dVar.M1(list);
            jbc0 jbc0Var = (jbc0) rx6Var.o.getValue();
            SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType = SchemeStat$PostDraftItemEventType.POST_NOW;
            jbc0Var.g();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.vfz
    public final void W5(px6 px6Var) {
        VkCell.Right.a.b bVar;
        px6 px6Var2 = px6Var;
        this.n = px6Var2;
        VkCell.Left.a aVar = VkCell.Left.Companion;
        ox6 ox6Var = px6Var2.b;
        VkCell.Left.b a2 = VkCell.Left.a.a(aVar, new VkCell.Left.Main.a(new c(ox6Var), VkCell.Left.Main.Size.Small));
        VkCell vkCell = this.m;
        vkCell.setLeft(a2);
        VkCell.Middle.a aVar2 = VkCell.Middle.Companion;
        tlo0.h d2 = oq.d(tlo0.Companion, ox6Var.b);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        Object[] objArr = 0 == true ? 1 : 0;
        vkCell.setMiddle(VkCell.Middle.a.a(aVar2, new VkCell.Middle.e(d2, 1, truncateAt, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 50), new VkCell.Middle.d((tlo0) new tlo0.d(R.plurals.friends_quantity, ox6Var.c), (gzs) objArr, 1, truncateAt, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 50), null, 12));
        if (!px6Var2.e) {
            vkCell.setRight((VkCell.Right.d) null);
            return;
        }
        if (px6Var2.c) {
            bVar = new VkCell.Right.a.b(new tlo0.f(R.string.add), new sx6(0, this, rx6.class, "onClickAddFriend", "onClickAddFriend()V", 0, 0), VkButton.Appearance.Accent, VkButton.Mode.Outline, VkButton.Size.Small, null, null, null, 2016);
        } else {
            bVar = new VkCell.Right.a.b(new tlo0.f(R.string.best_friends_cancel), new tx6(0, this, rx6.class, "onClickAddFriend", "onClickAddFriend()V", 0, 0), VkButton.Appearance.Neutral, VkButton.Mode.Outline, VkButton.Size.Small, null, null, null, 2016);
        }
        vkCell.setRight(VkCell.Right.c.a(VkCell.Right.Companion, bVar, null, null, null, 30));
    }
}
