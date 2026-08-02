package defpackage;

import com.yandex.mapkit.map.MapWindow;
import com.yandex.mobile.drive.sdk.map.handlers.a;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes15.dex */
public final /* synthetic */ class kht implements mwi0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kht(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.mwi0
    public final void remove() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((lht) obj).b.unregister();
                break;
            case 1:
                a aVar = (a) obj;
                ((MapWindow) aVar.a.c).getMap().removeInputListener(aVar.h);
                break;
            case 2:
                ((m2v) ((kzo) obj).c).G(null);
                break;
            default:
                Iterator it = ((ArrayList) obj).iterator();
                while (it.hasNext()) {
                    ((mwi0) it.next()).remove();
                }
                break;
        }
    }
}
