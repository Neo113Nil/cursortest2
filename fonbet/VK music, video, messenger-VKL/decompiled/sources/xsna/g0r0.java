package xsna;

import android.content.Context;
import android.text.TextUtils;
import android.util.Size;
import android.view.View;
import com.vk.core.view.components.avatar.badge.VkAvatarBadge;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.user.Platform;
import com.vk.dto.user.VisibleStatus;
import com.vk.im.engine.models.users.UserNameCase;
import com.vk.im.ui.views.avatars.VkImAvatar;
import com.vkontakte.android.R;
import xsna.k1u0;
import xsna.t6k;
import xsna.tlo0;
import xsna.y6k;

/* compiled from: UserVH.kt */
/* loaded from: classes2.dex */
public final class g0r0 extends vfz<t6k.i> {
    public final nkr0 l;
    public final VkCell m;

    /* compiled from: UserVH.kt */
    public static final class a implements VkCell.d {
        public final Context a;
        public final VkImAvatar b;

        /* compiled from: UserVH.kt */
        /* renamed from: xsna.g0r0$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C2904a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Platform.values().length];
                try {
                    iArr[Platform.MOBILE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public a(Context context) {
            this.a = context;
            VkImAvatar vkImAvatar = new VkImAvatar(context, null, 6, 0);
            vkImAvatar.S0();
            this.b = vkImAvatar;
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final void a(VkCell.f fVar) {
            c cVar = fVar instanceof c ? (c) fVar : null;
            if (cVar != null) {
                qtd0 qtd0Var = cVar.a;
                VkImAvatar vkImAvatar = this.b;
                VkImAvatar.c1(vkImAvatar, qtd0Var);
                vkImAvatar.S0();
                if (cVar.b) {
                    Platform platform = cVar.c;
                    int i = platform == null ? -1 : C2904a.$EnumSwitchMapping$0[platform.ordinal()];
                    Context context = this.a;
                    vkImAvatar.Q0(i == 1 ? new com.vk.core.view.components.avatar.badge.c(context, VkAvatarBadge.Alignment.BottomRight) : new com.vk.core.view.components.avatar.badge.e(context, VkAvatarBadge.Alignment.BottomRight, null));
                }
            }
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final View getView() {
            return this.b;
        }
    }

    /* compiled from: UserVH.kt */
    public static final class b implements VkCell.e {
        @Override // com.vk.core.view.components.cell.VkCell.e
        public final VkCell.d create(Context context) {
            return new a(context);
        }
    }

    /* compiled from: UserVH.kt */
    public static final class c implements VkCell.f {
        public final qtd0 a;
        public final boolean b;
        public final Platform c;

        public c(qtd0 qtd0Var, boolean z, Platform platform) {
            this.a = qtd0Var;
            this.b = z;
            this.c = platform;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && this.b == cVar.b && this.c == cVar.c;
        }

        public final int hashCode() {
            int b = qoy.b(this.a.hashCode() * 31, 31, this.b);
            Platform platform = this.c;
            return b + (platform == null ? 0 : platform.hashCode());
        }

        public final String toString() {
            return "AvatarViewParams(profile=" + this.a + ", isOnline=" + this.b + ", platform=" + this.c + ')';
        }
    }

    public g0r0(View view, y6k.b bVar) {
        super(view);
        this.l = bVar;
        VkCell vkCell = (VkCell) view.findViewById(R.id.vkim_user_cell);
        this.m = vkCell;
        vkCell.setLeftMainAvatarController(new b());
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(t6k.i iVar) {
        qtd0 qtd0Var = iVar.b;
        boolean z = (qtd0Var.mb().Ab() || qtd0Var.mb().zb() == null) ? false : true;
        VisibleStatus zb = qtd0Var.mb().zb();
        VkCell.Left.b a2 = VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.a(new c(qtd0Var, z, zb != null ? zb.e : null), 48));
        VkCell vkCell = this.m;
        vkCell.setLeft(a2);
        boolean z2 = qtd0Var instanceof com.vk.im.engine.models.contacts.a;
        vkCell.setMiddle(VkCell.Middle.a.a(VkCell.Middle.Companion, new VkCell.Middle.e(oq.d(tlo0.Companion, qtd0Var.Q2(UserNameCase.NOM)), 1, TextUtils.TruncateAt.END, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 50), z2 && o25.b(o25.a()) ? new VkCell.Middle.d(new tlo0.f(R.string.vkim_new_chat_invite_sms_info), (gzs) null, 0, (TextUtils.TruncateAt) null, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 62) : null, null, 12));
        vkCell.setRight(VkCell.Right.c.a(VkCell.Right.Companion, null, new VkCell.Right.e.b((dko) new gko(R.drawable.vk_icon_cancel_outline_28), (k1u0) new k1u0.a(new x7g(R.attr.vk_ui_icon_secondary)), (Size) null, (tlo0) new tlo0.f(R.string.vkim_remove_from_list), false, (gzs) new ge0(18, this, qtd0Var), 20), null, null, 29));
        if (z2) {
            vkCell.setEnabled(false);
            vkCell.setOnClickListener(null);
        } else {
            vkCell.setEnabled(true);
            jjc.g(vkCell, new v53(26, this, qtd0Var));
        }
    }
}
