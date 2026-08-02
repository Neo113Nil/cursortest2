package yads;

import android.content.Context;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import xsna.c5g;
import xsna.epx;

/* loaded from: classes10.dex */
public final class qi3 {
    public final Context a;
    public final be0 b = new be0();
    public final gl3 c = new gl3();

    public qi3(Context context) {
        this.a = context.getApplicationContext();
    }

    public final void a(List list, Map map) {
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.b.a((String) it.next(), map));
        }
        this.c.getClass();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (!epx.f((String) next, AndroidWebViewClient.BLANK_PAGE)) {
                arrayList2.add(next);
            }
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            String str = (String) it3.next();
            hj3 a = hj3.c.a(this.a);
            a.b.a(new ce2(a.a, str, new sn3()));
        }
    }
}
