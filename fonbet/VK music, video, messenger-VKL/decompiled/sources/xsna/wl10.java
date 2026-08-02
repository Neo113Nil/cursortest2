package xsna;

import android.view.View;
import com.google.android.material.datepicker.c;

/* compiled from: MaterialCalendar.java */
/* loaded from: classes13.dex */
public final class wl10 implements View.OnClickListener {
    public final /* synthetic */ com.google.android.material.datepicker.c b;

    public wl10(com.google.android.material.datepicker.c cVar) {
        this.b = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        com.google.android.material.datepicker.c cVar = this.b;
        c.d dVar = cVar.n;
        c.d dVar2 = c.d.YEAR;
        if (dVar == dVar2) {
            cVar.vn(c.d.DAY);
        } else if (dVar == c.d.DAY) {
            cVar.vn(dVar2);
        }
    }
}
