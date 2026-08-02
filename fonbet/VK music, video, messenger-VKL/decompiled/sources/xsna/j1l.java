package xsna;

import android.text.format.DateFormat;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.timepicker.b;
import java.util.Calendar;
import xsna.ffj;
import xsna.snu0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class j1l implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ j1l(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                n1l n1lVar = (n1l) this.c;
                FragmentManager fragmentManager = (FragmentManager) this.d;
                b.d dVar = new b.d();
                dVar.d(DateFormat.is24HourFormat(n1lVar.c) ? 1 : 0);
                Calendar calendar = n1lVar.d;
                dVar.b(calendar.get(11));
                dVar.c(calendar.get(12));
                com.google.android.material.timepicker.b a = dVar.a();
                a.Td(fragmentManager, "timepicker");
                a.x.add(new m1l(0, n1lVar, a));
                break;
            default:
                s720 s720Var = (s720) this.c;
                snu0.a aVar = (snu0.a) this.d;
                ffj.c<MenuKey> cVar = s720Var.p;
                if (cVar != null) {
                    aVar.a(cVar);
                    break;
                }
                break;
        }
    }
}
