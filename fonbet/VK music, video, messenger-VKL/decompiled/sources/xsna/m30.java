package xsna;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import com.vk.core.view.components.cell.VkCell;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.k1u0;
import xsna.tlo0;

/* compiled from: ActionListAdapter.kt */
/* loaded from: classes2.dex */
public final class m30 extends qul {
    public final Context h;
    public final izs<Integer, s3q0> i;

    /* compiled from: ActionListAdapter.kt */
    public static final class a extends vfz<r10> {
        public final izs<Integer, s3q0> l;
        public final VkCell m;
        public r10 n;

        /* JADX WARN: Multi-variable type inference failed */
        public a(View view, izs<? super Integer, s3q0> izsVar) {
            super(view);
            this.l = izsVar;
            VkCell vkCell = (VkCell) this.itemView.findViewById(R.id.vkCellActionItem);
            this.m = vkCell;
            jjc.g(vkCell, new u8(this, 2));
        }

        @Override // xsna.vfz
        public final void W5(r10 r10Var) {
            tlo0 h;
            r10 r10Var2 = r10Var;
            this.n = r10Var2;
            VkCell.Left.a aVar = VkCell.Left.Companion;
            int i = r10Var2.c;
            Integer num = r10Var2.e;
            VkCell.Left.b a = VkCell.Left.a.a(aVar, new VkCell.Left.Main.c(i, VkCell.Left.Main.Size.Medium, num == null ? k1u0.c.a : new k1u0.a(new x7g(num.intValue())), (tlo0.h) null, 8));
            VkCell vkCell = this.m;
            vkCell.setLeft(a);
            VkCell.Middle.a aVar2 = VkCell.Middle.Companion;
            Integer num2 = r10Var2.f;
            int i2 = r10Var2.b;
            if (num2 != null) {
                int intValue = num2.intValue();
                tlo0.a aVar3 = tlo0.Companion;
                SpannableStringBuilder c = cqm0.c(e3m.f(intValue, this.itemView.getContext()), this.itemView.getContext().getString(i2));
                aVar3.getClass();
                h = new tlo0.h(c);
            } else {
                h = tq.h(tlo0.Companion, i2);
            }
            vkCell.setMiddle(VkCell.Middle.a.a(aVar2, new VkCell.Middle.e(h, 1, TextUtils.TruncateAt.END, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 50), null, null, 14));
        }
    }

    public m30(ArrayList arrayList, Context context, izs izsVar) {
        super(false);
        this.h = context;
        this.i = izsVar;
        x0(r10.class, new tb(this, 2));
        setItems(arrayList);
    }
}
