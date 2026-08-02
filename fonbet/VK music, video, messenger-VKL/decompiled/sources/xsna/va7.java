package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.avatar.badge.VkAvatarBadge;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.user.OnlineInfo;
import com.vkontakte.android.R;
import java.util.List;
import xsna.ib7;
import xsna.k1u0;
import xsna.tlo0;

/* compiled from: BirthdaysListProfileHolder.kt */
/* loaded from: classes15.dex */
public final class va7 extends nfz<ib7> {
    public static final /* synthetic */ int o = 0;
    public final np1 m;
    public final VkCell n;

    /* compiled from: BirthdaysListProfileHolder.kt */
    public final class a implements VkCell.d {
        public final VkAvatar a;

        public a(Context context) {
            this.a = new VkAvatar(context, null, 6, 0);
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final void a(VkCell.f fVar) {
            c cVar = fVar instanceof c ? (c) fVar : null;
            if (cVar == null) {
                return;
            }
            VkAvatar vkAvatar = this.a;
            vkAvatar.S0();
            kr5 kr5Var = cVar.a;
            VkCell.Left.Main.Size size = VkCell.Left.Main.Size.Medium;
            int i = va7.o;
            vkAvatar.o0(kr5Var.b(size.k(va7.this.itemView.getContext())), null);
            if (cVar.b.Bb()) {
                vkAvatar.Q0(new com.vk.core.view.components.avatar.badge.e(vkAvatar.getContext(), VkAvatarBadge.Alignment.BottomRight, null));
            }
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final View getView() {
            return this.a;
        }
    }

    /* compiled from: BirthdaysListProfileHolder.kt */
    public final class b implements VkCell.e {
        public b() {
        }

        @Override // com.vk.core.view.components.cell.VkCell.e
        public final VkCell.d create(Context context) {
            return va7.this.new a(context);
        }
    }

    /* compiled from: BirthdaysListProfileHolder.kt */
    public static final class c implements VkCell.f {
        public final kr5 a;
        public final OnlineInfo b;

        public c(kr5 kr5Var, OnlineInfo onlineInfo) {
            this.a = kr5Var;
            this.b = onlineInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "AvatarViewParams(config=" + this.a + ", onlineInfo=" + this.b + ')';
        }
    }

    public va7(ViewGroup viewGroup, np1 np1Var) {
        super(R.layout.birthdays_list_profile_item, viewGroup);
        this.m = np1Var;
        this.n = (VkCell) this.itemView;
        getContext();
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(hfz hfzVar) {
        ib7 ib7Var = (ib7) hfzVar;
        String str = ib7Var.e;
        this.l = ib7Var;
        ua7 ua7Var = new ua7(this, ib7Var, 0);
        VkCell vkCell = this.n;
        vkCell.setOnClickListener(ua7Var);
        vkCell.setLeftMainAvatarController(new b());
        vkCell.setLeft(VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.a(new c(ib7Var.c, ib7Var.f), VkCell.Left.Main.Size.Medium)));
        VerifyInfo verifyInfo = ib7Var.g;
        VkCell.Right.d dVar = null;
        Drawable h = verifyInfo.Cb() ? VerifyInfoHelper.h(VerifyInfoHelper.a, verifyInfo, this.itemView.getContext(), null, 28) : null;
        vkCell.setMiddle(new VkCell.Middle.b(new VkCell.Middle.e(oq.d(tlo0.Companion, ib7Var.d), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, h != null ? new VkCell.Middle.e.b.C0817b(new eko(h), (k1u0) null, (tlo0.f) null, (Size) null, 14) : null, 30), str.length() > 0 ? new VkCell.Middle.d(new tlo0.h(str), (gzs) null, 0, (TextUtils.TruncateAt) null, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 62) : null, (VkCell.Middle.c) null, (VkCell.Middle.Size) null, 12));
        List<ib7.a> list = ib7Var.h;
        if (list.size() == 1) {
            dVar = new VkCell.Right.d((VkCell.Right.a) null, h6(list.get(0)), (VkCell.Right.ExtraAction.a) null, (VkCell.Right.b) null, 29);
        } else if (list.size() == 2) {
            dVar = new VkCell.Right.d((VkCell.Right.a) null, new VkCell.Right.e.c(h6(list.get(0)), h6(list.get(1))), (VkCell.Right.ExtraAction.a) null, (VkCell.Right.b) null, 29);
        }
        vkCell.setRight(dVar);
    }

    public final VkCell.Right.e.b h6(ib7.a aVar) {
        return new VkCell.Right.e.b((dko) new gko(aVar.a), (k1u0) new k1u0.a(new x7g(R.attr.vk_ui_icon_accent)), (Size) null, (tlo0) tq.h(tlo0.Companion, aVar.b), false, (gzs) new com.vk.catalog2.common.ui.holders.b(2, this, aVar), 20);
    }
}
