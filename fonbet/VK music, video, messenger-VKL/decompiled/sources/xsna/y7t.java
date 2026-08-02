package xsna;

import android.view.View;
import com.vk.external.miniapp.net.app.WebPhoto;
import com.vk.lists.ListDataSet;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class y7t implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ y7t(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                ArrayList arrayList = ((ListDataSet) ((z7t) this.d).c).d;
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((WebPhoto) it.next()).b);
                }
                SuperappUiRouterBridge superappUiRouterBridge = e370.d;
                if (superappUiRouterBridge == null) {
                    superappUiRouterBridge = null;
                }
                superappUiRouterBridge.n0(this.c, arrayList2);
                break;
            default:
                gdl0 gdl0Var = (gdl0) this.d;
                hgh0 hgh0Var = gdl0Var.e;
                if (hgh0Var == null) {
                    hgh0Var = null;
                }
                hgh0Var.onPageSelected(this.c - gdl0Var.f);
                break;
        }
    }
}
