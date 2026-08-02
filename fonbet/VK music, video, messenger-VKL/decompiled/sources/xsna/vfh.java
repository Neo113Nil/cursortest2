package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.group.GroupChat;
import com.vkontakte.android.R;
import xsna.k1u0;
import xsna.tlo0;

/* compiled from: CommunityProfileContentChatsAdapter.kt */
/* loaded from: classes5.dex */
public final class vfh extends zoj0<GroupChat, a> {
    public final wl0 e;

    /* compiled from: CommunityProfileContentChatsAdapter.kt */
    public static final class a extends vif0<GroupChat> {
        public final VkCell n;

        /* compiled from: CommunityProfileContentChatsAdapter.kt */
        /* renamed from: xsna.vfh$a$a, reason: collision with other inner class name */
        public static final class C3888a implements VkCell.d {
            public final VkAvatar a;

            public C3888a(Context context) {
                VkAvatar vkAvatar = new VkAvatar(context, null, 6, 0);
                vkAvatar.setScaleType(ImageView.ScaleType.CENTER_CROP);
                vkAvatar.setBackgroundResource(R.drawable.bg_community_circle_preview);
                this.a = vkAvatar;
            }

            @Override // com.vk.core.view.components.cell.VkCell.d
            public final void a(VkCell.f fVar) {
                c cVar = fVar instanceof c ? (c) fVar : null;
                if (cVar != null) {
                    this.a.o0(cVar.a, null);
                }
            }

            @Override // com.vk.core.view.components.cell.VkCell.d
            public final View getView() {
                return this.a;
            }
        }

        /* compiled from: CommunityProfileContentChatsAdapter.kt */
        public static final class b implements VkCell.e {
            @Override // com.vk.core.view.components.cell.VkCell.e
            public final VkCell.d create(Context context) {
                return new C3888a(context);
            }
        }

        /* compiled from: CommunityProfileContentChatsAdapter.kt */
        public static final class c implements VkCell.f {
            public final String a;

            public c(String str) {
                this.a = str;
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
                return ho8.a(new StringBuilder("AvatarViewParams(avatarUrl="), this.a, ')');
            }
        }

        public a(VkCell vkCell, wl0 wl0Var) {
            super(vkCell);
            this.n = vkCell;
            bwt0.i0(vkCell, new d50(9, wl0Var, this));
            vkCell.setLeftMainAvatarController(new b());
        }

        @Override // xsna.vif0
        public final void i6(GroupChat groupChat) {
            GroupChat groupChat2 = groupChat;
            VkCell.Left.b a = VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.a(new c(groupChat2.d), VkCell.Left.Main.Size.Medium));
            VkCell vkCell = this.n;
            vkCell.setLeft(a);
            String str = groupChat2.c;
            Resources resources = this.itemView.getContext().getResources();
            int i = groupChat2.i;
            String quantityString = resources.getQuantityString(R.plurals.profile_content_chat_members_count, i, uqm0.l(i));
            VkCell.Middle.e.b.C0817b c0817b = groupChat2.l ? new VkCell.Middle.e.b.C0817b(new gko(R.drawable.vk_icon_donut_color_16), k1u0.c.a, (tlo0.f) null, (Size) null, 12) : null;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            vkCell.setMiddle(new VkCell.Middle.b(new VkCell.Middle.e(oq.d(tlo0.Companion, str), 1, truncateAt, (VkCell.Middle.e.b) null, c0817b, 18), new VkCell.Middle.d(new tlo0.h(quantityString), (gzs) null, 1, truncateAt, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 50), (VkCell.Middle.c) null, (VkCell.Middle.Size) null, 12));
        }
    }

    /* compiled from: CommunityProfileContentChatsAdapter.kt */
    public static final class b extends m.e<GroupChat> {
        @Override // androidx.recyclerview.widget.m.e
        public final boolean areContentsTheSame(GroupChat groupChat, GroupChat groupChat2) {
            return groupChat.equals(groupChat2);
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areItemsTheSame(GroupChat groupChat, GroupChat groupChat2) {
            return groupChat.b == groupChat2.b;
        }
    }

    public vfh(wl0 wl0Var) {
        super(new com.vk.lists.a(new b()));
        this.e = wl0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((a) e0Var).V5(this.c.c(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        VkCell vkCell = new VkCell(viewGroup.getContext(), null, 6, 0);
        vkCell.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new a(vkCell, this.e);
    }
}
