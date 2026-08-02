package xsna;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.vk.core.view.components.cell.VkCell;
import com.vk.folders.impl.configure.h;
import com.vkontakte.android.R;
import xsna.tlo0;

/* compiled from: CounterSettingsVh.kt */
/* loaded from: classes18.dex */
public final class uxj extends vfz<fxj> {
    public final yra l;
    public final VkCell m;
    public fxj n;

    /* JADX WARN: Multi-variable type inference failed */
    public uxj(ViewGroup viewGroup, h.b bVar) {
        super(R.layout.vkim_folder_cell_item, viewGroup);
        this.l = bVar;
        VkCell vkCell = (VkCell) this.itemView.findViewById(R.id.vkim_cell);
        this.m = vkCell;
        Object[] objArr = 0 == true ? 1 : 0;
        vkCell.setMiddle(VkCell.Middle.a.a(VkCell.Middle.Companion, new VkCell.Middle.e(tq.h(tlo0.Companion, R.string.vkim_folder_include_folder_counter_title), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), new VkCell.Middle.d((tlo0) new tlo0.f(R.string.vkim_folder_include_folder_counter_subtitle), (gzs) null, 0, (TextUtils.TruncateAt) objArr, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 62), null, 12));
        vkCell.setOnClickListener(new nn9(this, 2));
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(fxj fxjVar) {
        fxj fxjVar2 = fxjVar;
        this.n = fxjVar2;
        VkCell.Right.c cVar = VkCell.Right.Companion;
        boolean z = fxjVar2.d;
        this.m.setRight(VkCell.Right.c.a(cVar, new VkCell.Right.a.f(4, new vf1(5, this, fxjVar2), z), null, null, null, 30));
    }
}
