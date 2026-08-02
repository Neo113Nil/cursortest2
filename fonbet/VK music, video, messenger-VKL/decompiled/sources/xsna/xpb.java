package xsna;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.components.cell.VkCell;
import com.vkontakte.android.R;
import xsna.k1u0;
import xsna.tlo0;
import xsna.vwb;

/* compiled from: ChatControlSwitchItemDelegate.kt */
/* loaded from: classes2.dex */
public final class xpb extends p1u0<vwb.c> {
    public final xwb a;

    /* compiled from: ChatControlSwitchItemDelegate.kt */
    public static final class a extends vfz<vwb.c> {
        public final InterfaceC4032a l;
        public final VkCell m;

        /* compiled from: ChatControlSwitchItemDelegate.kt */
        /* renamed from: xsna.xpb$a$a, reason: collision with other inner class name */
        public interface InterfaceC4032a {
            void b(vwb.c cVar);
        }

        public a(View view, xwb xwbVar) {
            super(view);
            this.l = xwbVar;
            this.m = (VkCell) view;
        }

        @Override // xsna.vfz
        /* renamed from: W5 */
        public final void i6(vwb.c cVar) {
            vwb.c cVar2 = cVar;
            VkCell.Left.b a = VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.c(cVar2.c, VkCell.Left.Main.Size.Medium, k1u0.c.a, (tlo0.h) null, 8));
            VkCell vkCell = this.m;
            vkCell.setLeft(a);
            vkCell.setMiddle(new VkCell.Middle.b(new VkCell.Middle.e(tq.h(tlo0.Companion, cVar2.d), 1, TextUtils.TruncateAt.END, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 50), new VkCell.Middle.d(new tlo0.f(cVar2.e), (gzs) null, 0, (TextUtils.TruncateAt) null, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 62), (VkCell.Middle.c) null, (VkCell.Middle.Size) null, 12));
            vkCell.setRight(VkCell.Right.c.a(VkCell.Right.Companion, new VkCell.Right.a.f(4, new m84(4, this, cVar2), cVar2.f), null, null, null, 30));
            vkCell.setOnClickListener(new wpb(0, this, cVar2));
        }
    }

    public xpb(xwb xwbVar) {
        this.a = xwbVar;
    }

    @Override // xsna.p1u0
    public final vfz<? extends vwb.c> b(ViewGroup viewGroup) {
        return new a(s3j0.b(viewGroup, R.layout.vkim_chat_control_param_swith_item, viewGroup, false), this.a);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof vwb.c;
    }
}
