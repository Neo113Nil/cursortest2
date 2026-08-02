package xsna;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.avatar.badge.VkAvatarBadge;
import com.vk.core.view.components.cell.VkCell;
import com.vkontakte.android.R;
import com.vkontakte.android.actionlinks.views.holders.user.ItemUser$OnlineStatus;

/* compiled from: ItemUserView.kt */
/* loaded from: classes16.dex */
public final class kvx extends FrameLayout implements ivx {
    public hvx b;
    public final VkCell c;

    /* compiled from: ItemUserView.kt */
    public static final class a implements VkCell.d {
        public final VkAvatar a;

        /* compiled from: ItemUserView.kt */
        /* renamed from: xsna.kvx$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C3210a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ItemUser$OnlineStatus.values().length];
                try {
                    iArr[ItemUser$OnlineStatus.ONLINE_WEB.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ItemUser$OnlineStatus.ONLINE_MOBILE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public a(Context context) {
            VkAvatar vkAvatar = new VkAvatar(context, null, 6, 0);
            vkAvatar.setPlaceholderImage(R.drawable.vk_icon_user_24);
            this.a = vkAvatar;
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final void a(VkCell.f fVar) {
            if (fVar instanceof c) {
                c cVar = (c) fVar;
                String str = cVar.a;
                VkAvatar vkAvatar = this.a;
                VkAvatarBadge vkAvatarBadge = null;
                vkAvatar.o0(str, null);
                vkAvatar.S0();
                int i = C3210a.$EnumSwitchMapping$0[cVar.b.ordinal()];
                if (i == 1) {
                    vkAvatarBadge = new com.vk.core.view.components.avatar.badge.e(vkAvatar.getContext(), VkAvatarBadge.Alignment.BottomRight, null);
                } else if (i == 2) {
                    vkAvatarBadge = new com.vk.core.view.components.avatar.badge.c(vkAvatar.getContext(), VkAvatarBadge.Alignment.BottomRight);
                }
                if (vkAvatarBadge != null) {
                    vkAvatar.Q0(vkAvatarBadge);
                }
            }
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final View getView() {
            return this.a;
        }
    }

    /* compiled from: ItemUserView.kt */
    public static final class b implements VkCell.e {
        @Override // com.vk.core.view.components.cell.VkCell.e
        public final VkCell.d create(Context context) {
            return new a(context);
        }
    }

    /* compiled from: ItemUserView.kt */
    public static final class c implements VkCell.f {
        public final String a;
        public final ItemUser$OnlineStatus b;

        public c(String str, ItemUser$OnlineStatus itemUser$OnlineStatus) {
            this.a = str;
            this.b = itemUser$OnlineStatus;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && this.b == cVar.b;
        }

        public final int hashCode() {
            String str = this.a;
            return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            return "AvatarViewParams(avatarUrl=" + this.a + ", onlineStatus=" + this.b + ')';
        }
    }

    public kvx(Context context) {
        super(context, null, 0);
        VkCell vkCell = new VkCell(context, null, 6, 0);
        vkCell.setLeftMainAvatarController(new b());
        vkCell.setOnClickListener(new q01(this, 7));
        this.c = vkCell;
        addView(vkCell);
    }

    @Override // xsna.dc6
    public hvx getPresenter() {
        return this.b;
    }

    @Override // xsna.dc6
    public void setPresenter(hvx hvxVar) {
        this.b = hvxVar;
    }

    @Override // xsna.cux
    public void setActionVisibility(boolean z) {
    }
}
