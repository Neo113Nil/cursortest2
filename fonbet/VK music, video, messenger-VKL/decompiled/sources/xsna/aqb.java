package xsna;

import android.text.TextUtils;
import android.util.Size;
import android.view.View;
import com.vk.core.view.components.cell.VkCell;
import com.vkontakte.android.R;
import xsna.iqb;
import xsna.spb;
import xsna.tlo0;

/* compiled from: ChatControlsAdapter.kt */
/* loaded from: classes2.dex */
public final class aqb extends vfz<spb.a> {
    public static final int p = cn70.b(28);
    public final View l;
    public final iqb.a m;
    public final VkCell n;
    public spb.a o;

    /* compiled from: ChatControlsAdapter.kt */
    public static final class a implements VkCell.f {
        public final int a;

        public a(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("ChatControlIconParams(iconRes="), this.a, ')');
        }
    }

    public aqb(View view, iqb.a aVar) {
        super(view);
        this.l = view;
        this.m = aVar;
        VkCell vkCell = (VkCell) view.findViewById(R.id.vkim_chat_control_cell);
        this.n = vkCell;
        vkCell.c(new nt(14), new zpb((byte) 0, 0));
        bwt0.i0(this.itemView, new com.vk.im.ui.components.viewcontrollers.dialog_header.info.a(this, 19));
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(spb.a aVar) {
        spb.a aVar2 = aVar;
        this.o = aVar2;
        this.l.setId(aVar2.b);
        a aVar3 = new a(aVar2.c);
        int i = p;
        VkCell.Left.b bVar = new VkCell.Left.b(new VkCell.Left.Main.e(aVar3, new Size(i, i)), null);
        VkCell vkCell = this.n;
        vkCell.setLeft(bVar);
        vkCell.setMiddle(new VkCell.Middle.b(new VkCell.Middle.e(tq.h(tlo0.Companion, aVar2.d), 1, TextUtils.TruncateAt.END, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 50), new VkCell.Middle.d(new tlo0.f(aVar2.e), (gzs) null, 0, (TextUtils.TruncateAt) null, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 62), (VkCell.Middle.c) null, (VkCell.Middle.Size) null, 12));
    }
}
