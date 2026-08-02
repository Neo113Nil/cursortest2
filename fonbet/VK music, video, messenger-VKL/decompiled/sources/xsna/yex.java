package xsna;

import android.content.DialogInterface;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.lists.ListDataSet;
import com.vk.log.L;
import java.util.Iterator;
import xsna.aex;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class yex implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yex(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        aex.a a;
        switch (this.b) {
            case 0:
                zex zexVar = (zex) this.c;
                ListDataSet<aex> listDataSet = zexVar.d;
                tdx tdxVar = zexVar.e;
                if (tdxVar != null) {
                    int i = 0;
                    for (Object obj : tdxVar.d) {
                        int i2 = i + 1;
                        if (i < 0) {
                            e43.t();
                            throw null;
                        }
                        StoriesContainer storiesContainer = (StoriesContainer) obj;
                        if (i < listDataSet.d.size()) {
                            aex c = listDataSet.c(i);
                            aex.a aVar = c instanceof aex.a ? (aex.a) c : null;
                            if (aVar != null && (a = eex.a(storiesContainer)) != null && aVar.b().c != a.b().c) {
                                listDataSet.F(i, a);
                            }
                        }
                        i = i2;
                    }
                }
                Iterator<ydx> it = zexVar.k().iterator();
                while (it.hasNext()) {
                    try {
                        it.next().V2();
                    } catch (Throwable th) {
                        L.i(th);
                    }
                }
                return;
            case 1:
                ((k6k0) this.c).b(false);
                return;
            default:
                ((l9s0) this.c).d = null;
                return;
        }
    }
}
