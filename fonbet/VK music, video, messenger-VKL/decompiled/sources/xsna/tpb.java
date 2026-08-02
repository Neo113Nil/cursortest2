package xsna;

import android.text.TextUtils;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.components.cell.VkCell;
import com.vkontakte.android.R;
import xsna.tlo0;
import xsna.vwb;

/* compiled from: ChatControlItemDelegate.kt */
/* loaded from: classes2.dex */
public final class tpb extends p1u0<vwb.b> {
    public static final int b = cn70.b(28);
    public final xwb a;

    /* compiled from: ChatControlItemDelegate.kt */
    public static final class a extends vfz<vwb.b> {
        public final vpb l;
        public final VkCell m;

        /* compiled from: ChatControlItemDelegate.kt */
        /* renamed from: xsna.tpb$a$a, reason: collision with other inner class name */
        public static final class C3760a implements VkCell.f {
            public final int a;

            public C3760a(int i) {
                this.a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3760a) && this.a == ((C3760a) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("ChatControlIconParams(iconRes="), this.a, ')');
            }
        }

        public a(View view, xwb xwbVar) {
            super(view);
            this.l = xwbVar;
            VkCell vkCell = (VkCell) view.findViewById(R.id.vkim_chat_control_cell);
            this.m = vkCell;
            vkCell.c(new a60(13), new j21((byte) 0, 2));
        }

        @Override // xsna.vfz
        /* renamed from: W5 */
        public final void i6(vwb.b bVar) {
            vwb.b bVar2 = bVar;
            bwt0.i0(this.itemView, new com.vk.im.engine.commands.messages.a(8, this, bVar2));
            C3760a c3760a = new C3760a(bVar2.c);
            int i = tpb.b;
            VkCell.Left.b bVar3 = new VkCell.Left.b(new VkCell.Left.Main.e(c3760a, new Size(i, i)), null);
            VkCell vkCell = this.m;
            vkCell.setLeft(bVar3);
            vkCell.setMiddle(new VkCell.Middle.b(new VkCell.Middle.e(tq.h(tlo0.Companion, bVar2.d), 1, TextUtils.TruncateAt.END, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 50), new VkCell.Middle.d(new tlo0.f(bVar2.e), (gzs) null, 0, (TextUtils.TruncateAt) null, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 62), (VkCell.Middle.c) null, (VkCell.Middle.Size) null, 12));
        }
    }

    public tpb(xwb xwbVar) {
        this.a = xwbVar;
    }

    @Override // xsna.p1u0
    public final vfz<? extends vwb.b> b(ViewGroup viewGroup) {
        return new a(s3j0.b(viewGroup, R.layout.vkim_chat_control_param_item_new, viewGroup, false), this.a);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof vwb.b;
    }
}
