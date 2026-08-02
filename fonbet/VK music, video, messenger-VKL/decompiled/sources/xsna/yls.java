package xsna;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.cell.VkCell;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsImStat$TypeImConversationsBannerItem;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vkontakte.android.R;
import xsna.ea7;
import xsna.gko;
import xsna.tlo0;

/* compiled from: FriendsBirthdayModalPage.kt */
/* loaded from: classes6.dex */
public final class yls implements fcn {
    public dw20 b;

    /* compiled from: FriendsBirthdayModalPage.kt */
    public static final class a {
    }

    /* compiled from: FriendsBirthdayModalPage.kt */
    public static final class b extends s770 {
        public final h1 c;
        public final nk0 d;

        public b(h1 h1Var, nk0 nk0Var) {
            this.c = h1Var;
            this.d = nk0Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.s770
        public final void m(hkp hkpVar, Object obj, int i) {
            ea7 ea7Var = (ea7) obj;
            if (ea7Var instanceof ea7.a) {
                f4m.j((VkCell) hkpVar.f(R.id.friends_birthday_item_cell));
                ((TextView) hkpVar.f(R.id.friends_birthday_item_title)).setText(((ea7.a) ea7Var).a);
                return;
            }
            if (ea7Var instanceof ea7.b) {
                ea7.b bVar = (ea7.b) ea7Var;
                ba7 ba7Var = bVar.a;
                VkCell vkCell = (VkCell) hkpVar.f(R.id.friends_birthday_item_cell);
                vkCell.setLeftMainAvatarController(new bs5());
                VkCell.Left.a aVar = VkCell.Left.Companion;
                String a = js5.a(cn70.b(40), ba7Var.b);
                if (a == null) {
                    a = "";
                }
                vkCell.setLeft(VkCell.Left.a.a(aVar, new VkCell.Left.Main.a(new ws5(a), VkCell.Left.Main.Size.Small)));
                VkCell.Middle.d dVar = null;
                VkCell.Middle.c cVar = null;
                Object[] objArr = 0 == true ? 1 : 0;
                vkCell.setMiddle(new VkCell.Middle.b(new VkCell.Middle.e(oq.d(tlo0.Companion, ba7Var.c), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), dVar, cVar, (VkCell.Middle.Size) objArr, 14));
                VkCell.Right.c cVar2 = VkCell.Right.Companion;
                VkButton.Mode mode = VkButton.Mode.Link;
                VkButton.Appearance appearance = VkButton.Appearance.Neutral;
                gko.b bVar2 = gko.Companion;
                vkCell.setRight(VkCell.Right.c.a(cVar2, new VkCell.Right.a.b(null, new defpackage.f0(12, this, bVar), appearance, mode, null, new VkCell.Right.a.b.c(new gko(R.drawable.vk_icon_gift_outline_36), Integer.valueOf(cn70.b(28)), Integer.valueOf(R.attr.vk_ui_icon_accent_themed)), new tlo0.f(R.string.send_gift), null, 1937), null, null, null, 30));
                bwt0.i0(vkCell, new o9(24, this, bVar));
                f4m.j((TextView) hkpVar.f(R.id.friends_birthday_item_title));
            }
        }

        @Override // xsna.s770
        public final hkp p(View view) {
            hkp hkpVar = new hkp(7);
            hkpVar.d(view.findViewById(R.id.friends_birthday_item_cell));
            hkpVar.d(view.findViewById(R.id.friends_birthday_item_title));
            return hkpVar;
        }
    }

    @Override // xsna.fcn
    public final boolean M4() {
        return true;
    }

    @Override // xsna.fcn
    public final boolean N8() {
        return false;
    }

    @Override // xsna.fcn
    public final void b(boolean z) {
        dw20 dw20Var = this.b;
        if (dw20Var != null) {
            dw20Var.dismiss();
        }
        MobileOfficialAppsImStat$TypeImConversationsBannerItem.EventType eventType = MobileOfficialAppsImStat$TypeImConversationsBannerItem.EventType.HIDE;
        iid0 iid0Var = new iid0();
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        SchemeStat$TypeAction b2 = SchemeStat$TypeAction.a.b(null, null, new MobileOfficialAppsImStat$TypeImConversationsBannerItem("friends_birthdays_modal", eventType, null), 3);
        iid0Var.f = c;
        iid0Var.g = b2;
        iid0Var.q();
    }

    @Override // xsna.fcn
    public final void dismiss() {
        b(false);
    }

    @Override // xsna.fcn
    public final boolean v6() {
        return false;
    }
}
