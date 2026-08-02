package xsna;

import com.vk.voip.ui.call_list.scheduled.ui.items.ScheduledCallViewItem;
import java.util.ArrayList;
import java.util.Calendar;

/* compiled from: DateIntervalHelpersFactory.kt */
/* loaded from: classes7.dex */
public final class oxk implements lxk {
    public final Calendar a;
    public boolean b;
    public final /* synthetic */ rxk c;
    public final /* synthetic */ txk d;

    public oxk(rxk rxkVar, txk txkVar) {
        this.c = rxkVar;
        this.d = txkVar;
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, 7);
        calendar.set(11, 0);
        calendar.set(12, 0);
        this.a = calendar;
    }

    @Override // xsna.lxk
    public final ArrayList a(Calendar calendar) {
        ArrayList arrayList = new ArrayList();
        if (!this.b) {
            rxk rxkVar = this.c;
            g7h0 g7h0Var = rxkVar.a;
            txk txkVar = this.d;
            l59 l59Var = (l59) g7h0Var.invoke(txkVar);
            if (l59Var != null) {
                arrayList.add(l59Var);
            }
            arrayList.add(new ScheduledCallViewItem.a(rxkVar.b.e(txkVar.b || txkVar.c)));
            this.b = true;
            txkVar.a = true;
        }
        return arrayList;
    }

    @Override // xsna.lxk
    public final boolean b(Calendar calendar) {
        return calendar.before(this.a);
    }
}
