package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.im.popup.Popup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import xsna.cwb0;

/* compiled from: PopupChooserExt.kt */
/* loaded from: classes2.dex */
public final class gwb0 {
    public static final <T> Popup.a<T> a(cwb0.m<T> mVar) {
        Popup.g gVar;
        Popup.g aVar;
        int a = mVar.a();
        Integer num = mVar.d;
        Integer num2 = mVar.e;
        Integer num3 = mVar.g;
        int i = mVar.j;
        int i2 = mVar.k;
        ListBuilder e = e43.e();
        CharSequence charSequence = mVar.b;
        if (charSequence != null && charSequence.length() != 0) {
            e.add(new lwb0(charSequence, 0, null, null, 0, null, false, null, false, false, IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW));
        }
        List<jwb0<T>> list = mVar.l;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            jwb0 jwb0Var = (jwb0) it.next();
            arrayList.add(new lwb0(jwb0Var.a, jwb0Var.b, jwb0Var.c, jwb0Var.d, jwb0Var.e, jwb0Var.f, jwb0Var.h, jwb0Var.i, jwb0Var.j, false, 1536));
            a = a;
        }
        int i3 = a;
        e.addAll(arrayList);
        s3q0 s3q0Var = s3q0.a;
        ListBuilder g = e.g();
        List<T> list2 = mVar.m;
        cwb0.c1 c1Var = mVar.n;
        if (c1Var instanceof cwb0.c1.b) {
            gVar = Popup.g.b.a;
        } else {
            if (c1Var instanceof cwb0.c1.a) {
                ((cwb0.c1.a) c1Var).getClass();
                aVar = new Popup.g.a(null);
                return new Popup.a<>(i3, num, num2, num3, i, i2, g, list2, aVar, false);
            }
            gVar = Popup.g.c.a;
        }
        aVar = gVar;
        return new Popup.a<>(i3, num, num2, num3, i, i2, g, list2, aVar, false);
    }
}
