package xsna;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.vk.core.view.components.cell.VkCell;
import com.vkontakte.android.R;
import xsna.e3m;
import xsna.hny;
import xsna.lyv;
import xsna.tlo0;

/* compiled from: SublistVh.kt */
/* loaded from: classes18.dex */
public final class ium0 extends vfz<eum0> {
    public final VkCell l;

    public ium0(ViewGroup viewGroup) {
        super(R.layout.vkim_folder_cell_item, viewGroup);
        VkCell vkCell = (VkCell) this.itemView.findViewById(R.id.vkim_cell);
        this.l = vkCell;
        vkCell.setLeftMainAvatarController(myv.a);
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(eum0 eum0Var) {
        hum0 hum0Var;
        VkCell.Middle.d dVar;
        eum0 eum0Var2 = eum0Var;
        String str = eum0Var2.c;
        VkCell.Left.a aVar = VkCell.Left.Companion;
        String str2 = eum0Var2.d;
        int hashCode = str2.hashCode();
        if (hashCode == -840272977) {
            if (str2.equals("unread")) {
                hum0Var = new hum0(R.drawable.vk_icon_message_unread_top_outline_24, R.drawable.gradient_green);
            }
            hum0Var = hum0.c;
        } else if (hashCode != -256926552) {
            if (hashCode == 443164224 && str2.equals("personal")) {
                hum0Var = new hum0(R.drawable.vk_icon_users_outline_24, R.drawable.gradient_turquoise);
            }
            hum0Var = hum0.c;
        } else {
            if (str2.equals("business_notify")) {
                hum0Var = new hum0(R.drawable.vk_icon_work_outline_24, R.drawable.gradient_blue);
            }
            hum0Var = hum0.c;
        }
        int i = hum0Var.a;
        int i2 = hum0Var.b;
        hny hnyVar = new hny(this.itemView.getContext());
        e3m.a aVar2 = e3m.a;
        Context context = hnyVar.a;
        hnyVar.b(m33.a(i2, context));
        hnyVar.b.add(new hny.e(new baf0(m33.a(i, context), 0)));
        VkCell.Left.b a = VkCell.Left.a.a(aVar, new VkCell.Left.Main.a(new lyv.b(new dpg0(hnyVar, 100.0f)), VkCell.Left.Main.Size.Medium));
        VkCell vkCell = this.l;
        vkCell.setLeft(a);
        VkCell.Middle.a aVar3 = VkCell.Middle.Companion;
        VkCell.Middle.e eVar = new VkCell.Middle.e(oq.d(tlo0.Companion, eum0Var2.b), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62);
        if (myc0.f(str)) {
            dVar = new VkCell.Middle.d(new tlo0.h(str), (gzs) null, 0, (TextUtils.TruncateAt) null, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 62);
        } else {
            dVar = null;
        }
        vkCell.setMiddle(VkCell.Middle.a.a(aVar3, eVar, dVar, null, 12));
    }
}
