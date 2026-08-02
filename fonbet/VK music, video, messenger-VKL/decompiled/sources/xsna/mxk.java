package xsna;

import com.vk.voip.ui.call_list.scheduled.ui.items.ScheduledCallViewItem;
import java.util.ArrayList;
import java.util.Calendar;

/* compiled from: DateIntervalHelpersFactory.kt */
/* loaded from: classes7.dex */
public final class mxk implements lxk {
    public Calendar a = Calendar.getInstance();
    public final /* synthetic */ rxk b;
    public final /* synthetic */ txk c;

    public mxk(rxk rxkVar, txk txkVar) {
        this.b = rxkVar;
        this.c = txkVar;
    }

    @Override // xsna.lxk
    public final ArrayList a(Calendar calendar) {
        ArrayList arrayList = new ArrayList();
        Calendar calendar2 = this.a;
        c09 c09Var = c09.a;
        if (calendar2.get(1) == calendar.get(1) && calendar2.get(2) == calendar.get(2)) {
            return arrayList;
        }
        rxk rxkVar = this.b;
        g7h0 g7h0Var = rxkVar.a;
        txk txkVar = this.c;
        l59 l59Var = (l59) g7h0Var.invoke(txkVar);
        if (l59Var != null) {
            arrayList.add(l59Var);
        }
        arrayList.add(new ScheduledCallViewItem.a(rxkVar.b.a(calendar)));
        txkVar.a = true;
        this.a = calendar;
        return arrayList;
    }

    @Override // xsna.lxk
    public final boolean b(Calendar calendar) {
        return true;
    }
}
