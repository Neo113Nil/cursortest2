package xsna;

import android.content.Context;
import android.util.SparseArray;
import com.vk.im.engine.models.messages.Msg;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* compiled from: MsgSearchDateDecoration.kt */
/* loaded from: classes2.dex */
public final class uw30 extends m2i0 {
    public final Calendar m;
    public final ci30 n;

    public uw30(Context context) {
        super(context, true, true, 0, 56);
        this.m = Calendar.getInstance();
        this.n = new ci30(context);
        this.j.setTextSize(iah0.a(16));
    }

    public final void o(List<? extends com.vk.im.ui.components.msg_search.vc.a> list) {
        SparseArray<CharSequence> sparseArray = new SparseArray<>();
        Iterator<? extends com.vk.im.ui.components.msg_search.vc.a> it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (it.next() instanceof gk30) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            this.h = sparseArray;
            return;
        }
        long j = ((gk30) list.get(i)).d.g;
        ci30 ci30Var = this.n;
        sparseArray.put(i, ci30Var.a(j));
        int size = list.size() - 1;
        while (i < size) {
            Msg msg = ((gk30) list.get(i)).d;
            i++;
            Msg msg2 = ((gk30) list.get(i)).d;
            long j2 = msg.g;
            Calendar calendar = this.m;
            calendar.setTimeInMillis(j2);
            Pair pair = new Pair(Integer.valueOf(calendar.get(6)), Integer.valueOf(calendar.get(1)));
            int intValue = ((Number) pair.d()).intValue();
            int intValue2 = ((Number) pair.g()).intValue();
            calendar.setTimeInMillis(msg2.g);
            Pair pair2 = new Pair(Integer.valueOf(calendar.get(6)), Integer.valueOf(calendar.get(1)));
            int intValue3 = ((Number) pair2.d()).intValue();
            int intValue4 = ((Number) pair2.g()).intValue();
            if (intValue != intValue3 || intValue2 != intValue4) {
                sparseArray.put(i, ci30Var.a(msg2.g));
            }
        }
        this.h = sparseArray;
    }
}
