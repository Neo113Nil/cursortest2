package xsna;

import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.View;
import com.vk.core.view.components.cell.VkCell;
import com.vkontakte.android.R;
import xsna.t6k;
import xsna.tlo0;
import xsna.y6k;

/* compiled from: ChatControlsVH.kt */
/* loaded from: classes2.dex */
public final class fqb extends vfz<t6k.c> {
    public final nkr0 l;
    public final SparseIntArray m;
    public final VkCell n;

    public fqb(View view, y6k.b bVar) {
        super(view);
        this.l = bVar;
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(0, R.string.vkim_new_chat_default_type);
        sparseIntArray.put(1, R.string.vkim_new_chat_closed_type);
        sparseIntArray.put(2, R.string.vkim_new_chat_custom_type);
        this.m = sparseIntArray;
        VkCell vkCell = (VkCell) view.findViewById(R.id.vkim_chat_controls_cell);
        this.n = vkCell;
        vkCell.setLeft(VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.c(R.drawable.vk_icon_settings_outline_28, VkCell.Left.Main.Size.Medium, (k1u0) null, (tlo0.h) null, 12)));
        jjc.g(vkCell, new com.vk.movika.sdk.base.observable.o(this, 15));
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(t6k.c cVar) {
        int i = cVar.b;
        VkCell.Middle.b a = VkCell.Middle.a.a(VkCell.Middle.Companion, new VkCell.Middle.e(tq.h(tlo0.Companion, R.string.vkim_new_chat_settings), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), null, null, 14);
        VkCell vkCell = this.n;
        vkCell.setMiddle(a);
        VkCell.Right.c cVar2 = VkCell.Right.Companion;
        SparseIntArray sparseIntArray = this.m;
        vkCell.setRight(VkCell.Right.c.a(cVar2, new VkCell.Right.a.e(new tlo0.f(sparseIntArray.get(i)), new tlo0.f(sparseIntArray.get(i))), null, null, null, 30));
    }
}
