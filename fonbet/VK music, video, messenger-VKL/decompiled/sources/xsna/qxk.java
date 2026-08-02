package xsna;

import com.vk.voip.ui.call_list.scheduled.ui.items.ScheduledCallViewItem;
import java.util.ArrayList;
import java.util.Calendar;

/* compiled from: DateIntervalHelpersFactory.kt */
/* loaded from: classes7.dex */
public final class qxk implements lxk {
    public final Calendar a = Calendar.getInstance();
    public boolean b;
    public final /* synthetic */ rxk c;
    public final /* synthetic */ txk d;

    public qxk(rxk rxkVar, txk txkVar) {
        this.c = rxkVar;
        this.d = txkVar;
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
            arrayList.add(new ScheduledCallViewItem.a(rxkVar.b.c()));
            this.b = true;
            txkVar.a = true;
            txkVar.c = true;
        }
        return arrayList;
    }

    @Override // xsna.lxk
    public final boolean b(Calendar calendar) {
        return c09.e(this.a, calendar);
    }
}
