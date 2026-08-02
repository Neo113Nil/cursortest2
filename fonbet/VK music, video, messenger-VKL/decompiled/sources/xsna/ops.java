package xsna;

import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import xsna.y320;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class ops implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Context c;

    public /* synthetic */ ops(Context context, int i) {
        this.b = i;
        this.c = context;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Context context = this.c;
        switch (i) {
            case 0:
                return new BitmapDrawable(context.getResources(), (Bitmap) obj);
            default:
                List<y320.a> list = (List) obj;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                for (y320.a aVar : list) {
                    arrayList.add(new Pair(Integer.valueOf(aVar.a), aVar.b));
                }
                ca70 ca70Var = ca70.a;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    Number number = (Number) pair.d();
                    yh70.b.d((String) pair.g(), number);
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Pair pair2 = (Pair) it2.next();
                    Number number2 = (Number) pair2.d();
                    o970.b.d((String) pair2.g(), number2);
                }
                NotificationManager f = ca70.f(context);
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    Pair pair3 = (Pair) it3.next();
                    int intValue = ((Number) pair3.d()).intValue();
                    String str = (String) pair3.g();
                    ca70 ca70Var2 = ca70.a;
                    f.cancel(str, ca70.e(Integer.valueOf(intValue)));
                }
                return s3q0.a;
        }
    }
}
