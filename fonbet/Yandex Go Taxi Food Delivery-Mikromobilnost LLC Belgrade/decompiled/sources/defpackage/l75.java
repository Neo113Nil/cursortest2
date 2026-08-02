package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.animation.e;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.expression.BduiExpressionResolverImpl;
import com.yandex.fintechsdk.flows.applink.payment.internal.model.feature.FeatureFlag;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes13.dex */
public final /* synthetic */ class l75 implements tls {
    public final /* synthetic */ int a;

    public /* synthetic */ l75(int i) {
        this.a = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        String resolveString$lambda$1;
        Double resolveDouble$lambda$5;
        Uri resolveUrl$lambda$7;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                return p1j0.a;
            case 1:
                return (lma0) ((a5g) obj).F2.get();
            case 2:
                return (doa0) ((a5g) obj).H2.get();
            case 3:
                return (atj) ((a5g) obj).j1.get();
            case 4:
                ((qgc0) obj).k1();
                return zy11Var;
            case 5:
                wj00 b = ((y3x) obj).b();
                return new q95(b.p(ACSPConstants.STATUS), b.h("status_code"), b.h("status_desc"));
            case 6:
                return (CharSequence) obj;
            case 7:
                acx acxVar = (acx) obj;
                acxVar.c = true;
                acxVar.h = "dtoMessageType";
                acxVar.k = true;
                return zy11Var;
            case 8:
                int i2 = ne5.a;
                return zy11Var;
            case 9:
                Long l = (Long) obj;
                l.longValue();
                return l;
            case 10:
                resolveString$lambda$1 = BduiExpressionResolverImpl.resolveString$lambda$1((String) obj);
                return resolveString$lambda$1;
            case 11:
                resolveDouble$lambda$5 = BduiExpressionResolverImpl.resolveDouble$lambda$5(obj);
                return resolveDouble$lambda$5;
            case 12:
                resolveUrl$lambda$7 = BduiExpressionResolverImpl.resolveUrl$lambda$7((Uri) obj);
                return resolveUrl$lambda$7;
            case 13:
                return ((FeatureFlag) obj).getValue();
            case 14:
                return q5b1.k((e) obj);
            case 15:
                ib11 ib11Var = (ib11) obj;
                w211 w211Var = ib11Var.j;
                String str = ib11Var.b;
                String str2 = ib11Var.f;
                String X = a.X(ib11Var.l, "|", null, null, new l75(18), 30);
                StringBuilder sb = new StringBuilder();
                sb.append(w211Var);
                sb.append("_");
                sb.append(str);
                sb.append("_");
                sb.append(str2);
                return oyr.t(sb, "_", X);
            case 16:
                return q5b1.k((e) obj);
            case 17:
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ib11) it.next()).b);
                }
                return arrayList;
            case 18:
                d611 d611Var = (d611) obj;
                return g8e.p(d611Var.e, ":", d611Var.a);
            case 19:
                return Integer.valueOf(((Integer) obj).intValue() / 4);
            case 20:
                return Integer.valueOf((-((Integer) obj).intValue()) / 5);
            case 21:
                ListItemComponent listItemComponent = new ListItemComponent(((ViewGroup) obj).getContext(), null, 0, 6, null);
                lob1.c(listItemComponent, 3);
                return listItemComponent;
            case 22:
                return new nj5((ListItemComponent) obj, 0);
            case 23:
                ListItemComponent listItemComponent2 = new ListItemComponent(((ViewGroup) obj).getContext(), null, 0, 6, null);
                lob1.c(listItemComponent2, 3);
                return listItemComponent2;
            case 24:
                return new uj5((ListItemComponent) obj, 0);
            case 25:
                ListItemComponent listItemComponent3 = new ListItemComponent(((ViewGroup) obj).getContext(), null, 0, 6, null);
                lob1.c(listItemComponent3, 3);
                return listItemComponent3;
            case 26:
                return new ck5((ListItemComponent) obj);
            case 27:
                ((hk5) obj).Q();
                return zy11Var;
            case 28:
                ((hk5) obj).m1();
                return zy11Var;
            default:
                return new ImageView((Context) obj);
        }
    }
}
