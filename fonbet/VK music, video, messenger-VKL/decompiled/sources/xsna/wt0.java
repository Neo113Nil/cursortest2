package xsna;

import android.text.TextUtils;
import android.view.View;
import com.vk.core.view.components.cell.VkCell;
import com.vkontakte.android.R;
import xsna.t6k;
import xsna.tlo0;
import xsna.y6k;

/* compiled from: AdmissionVH.kt */
/* loaded from: classes2.dex */
public final class wt0 extends vfz<t6k.a> {
    public final nkr0 l;
    public final VkCell m;

    public wt0(View view, y6k.b bVar) {
        super(view);
        this.l = bVar;
        VkCell vkCell = (VkCell) view.findViewById(R.id.vkim_chat_controls_cell);
        this.m = vkCell;
        jjc.g(vkCell, new tm0(this, 1));
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(t6k.a aVar) {
        tlo0 c;
        VkCell.Middle.b a = VkCell.Middle.a.a(VkCell.Middle.Companion, new VkCell.Middle.e(tq.h(tlo0.Companion, R.string.vkim_new_chat_admission_title), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), null, null, 14);
        VkCell vkCell = this.m;
        vkCell.setMiddle(a);
        e0o e0oVar = aVar.b;
        if (e0oVar == null) {
            c = new tlo0.f(R.string.vkim_new_chat_admission_all);
        } else {
            String str = e0oVar.b;
            c = e0oVar.d ? tlo0.a.c(R.string.vkim_new_chat_admission_dons_type_and_higher, str) : tlo0.a.c(R.string.vkim_new_chat_admission_dons_type, str);
        }
        vkCell.setRight(VkCell.Right.c.a(VkCell.Right.Companion, new VkCell.Right.a.e(c, c), null, null, null, 30));
    }
}
