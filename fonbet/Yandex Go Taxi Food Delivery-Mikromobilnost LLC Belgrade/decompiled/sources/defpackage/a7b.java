package defpackage;

import android.os.SystemClock;
import android.view.View;
import androidx.compose.ui.semantics.f;
import androidx.room.util.a;
import com.squareup.moshi.Moshi;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.input.quote.QuotePresenter$QuoteType;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.view.timeline.i;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.d;
import com.ybsdk.widgets.common.CircleButtonsListView;
import com.ybsdk.widgets.common.chip.ChipListView;
import defpackage.iaz0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$LongRef;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final /* synthetic */ class a7b implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a7b(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Object value;
        zy11 chipsAdapterDelegate$lambda$7$lambda$6;
        zy11 buttonsAdapterDelegate$lambda$6$lambda$5;
        int i = this.a;
        int i2 = 3;
        int i3 = 1;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                l020 l020Var = (l020) obj;
                long j = ((i7b) obj3).b.a;
                ndz0 ndz0Var = l020Var.D;
                by10 by10Var = ndz0Var.d;
                Long l = (Long) a.b(by10Var.a, true, false, new qo6(j, (String) obj2, 14));
                if (l != null) {
                    long longValue = l.longValue();
                    ((Number) a.b(by10Var.a, false, true, new j2b(17, j, longValue))).intValue();
                    ndz0Var.k.h(j, alb1.b(ndz0Var.c, j, longValue));
                    l020Var.z.a(j);
                }
                return zy11Var;
            case 1:
                return Long.valueOf(((x8b) obj3).b.e((oll0) obj, (y8b) obj2));
            case 2:
                return new e9b((h9b) obj3, (ChatRequest) obj, (d9b) obj2);
            case 3:
                return new f9b((h9b) obj3, (ChatRequest) obj, (b9b) obj2);
            case 4:
                return new c9b((h9b) obj3, (ChatRequest) obj, (an8) obj2);
            case 5:
                kab kabVar = (kab) obj2;
                r3z a = ((oab) obj3).x.a();
                if (a != null) {
                    kabVar.v(a);
                }
                return zy11Var;
            case 6:
                qbb qbbVar = (qbb) obj3;
                oab oabVar = (oab) obj2;
                iaz0 iaz0Var = (iaz0) obj;
                vcz0 vcz0Var = oabVar.x;
                k020 k020Var = vcz0Var.b;
                long j2 = vcz0Var.a.a;
                at2 at2Var = k020Var.b;
                yab yabVar = new yab(at2Var.B().L(j2), (Moshi) k020Var.h.get(), at2Var.Y().g(j2));
                if (iaz0Var == null) {
                    iaz0Var = new iaz0();
                    iaz0Var.a(new iaz0.a());
                }
                qbbVar.a(yabVar, iaz0Var, oabVar.x.f());
                return zy11Var;
            case 7:
                i iVar = (i) obj3;
                ServerMessageRef serverMessageRef = (ServerMessageRef) obj2;
                String str = (String) obj;
                ((uv10) iVar.D.get()).e();
                ulg0 ulg0Var = iVar.J;
                String str2 = ulg0Var.b;
                if (str2 != null) {
                    Object obj4 = ulg0Var.c;
                    if (obj4 == null) {
                        obj4 = r620.d;
                    }
                    m0w m0wVar = ulg0Var.a;
                    m0wVar.getClass();
                    xv10 xv10Var = new xv10(str2, Collections.singletonList(serverMessageRef), QuotePresenter$QuoteType.QUOTE, str, obj4);
                    if (m0wVar.b()) {
                        ((com.yandex.messaging.input.quote.a) m0wVar.a.get()).f(xv10Var);
                    }
                }
                return zy11Var;
            case 8:
                return Integer.valueOf(((meb) obj3).c.c((oll0) obj, (m2b) obj2));
            case 9:
                return Long.valueOf(((meb) obj3).b.e((oll0) obj, (t2b) obj2));
            case 10:
                return Integer.valueOf(((meb) obj3).d.c((oll0) obj, (r2b) obj2));
            case 11:
                ((ueb) obj3).b.d((oll0) obj, (udb) obj2);
                return zy11Var;
            case 12:
                d dVar = (d) obj3;
                spd0 spd0Var = (spd0) obj;
                r0 r0Var = dVar.L;
                bob bobVar = new bob(spd0Var.a, false);
                r0Var.getClass();
                r0Var.m(null, bobVar);
                dVar.T.a(((ind0) obj2).b.getOffer(), spd0Var.a);
                return zy11Var;
            case 13:
                ArrayList arrayList = ((apb) obj3).b;
                ((m6y) ((u6y) obj)).f(arrayList.size(), null, new oob(0, nob.a, arrayList), new androidx.compose.runtime.internal.a(802480018, new pob(r4 ? 1 : 0, (tls) obj2, arrayList), true));
                return zy11Var;
            case 14:
                Set set = (Set) obj2;
                unp0 unp0Var = (unp0) obj;
                Iterator it = ((Set) obj3).iterator();
                while (it.hasNext()) {
                    ((knp0) it.next()).a.invoke(unp0Var);
                }
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    ((snp0) it2.next()).a.invoke(unp0Var);
                }
                return zy11Var;
            case 15:
                xni xniVar = (xni) obj2;
                r0 r0Var2 = ((rpb) obj3).a.a;
                do {
                    value = r0Var2.getValue();
                } while (!r0Var2.k(value, kotlin.collections.a.j0((List) value, xniVar)));
                return zy11Var;
            case 16:
                chipsAdapterDelegate$lambda$7$lambda$6 = ChipListView.chipsAdapterDelegate$lambda$7$lambda$6((n70) obj3, (ChipListView) obj2, (List) obj);
                return chipsAdapterDelegate$lambda$7$lambda$6;
            case 17:
                mtb mtbVar = (mtb) obj3;
                sls slsVar = (sls) obj2;
                mnq0 mnq0Var = (mnq0) obj;
                f.p(mnq0Var, 0);
                if (mtbVar.f) {
                    f.a(mnq0Var);
                    f.f(mnq0Var, null, new jc0(17, slsVar));
                }
                String str3 = mtbVar.e;
                if (str3 != null) {
                    f.l(mnq0Var, str3);
                }
                return zy11Var;
            case 18:
                buttonsAdapterDelegate$lambda$6$lambda$5 = CircleButtonsListView.buttonsAdapterDelegate$lambda$6$lambda$5((n70) obj3, (CircleButtonsListView) obj2, (List) obj);
                return buttonsAdapterDelegate$lambda$6$lambda$5;
            case 19:
                ((Double) obj).doubleValue();
                ((tls) obj3).invoke(Integer.valueOf(((yx40) obj2).getIntValue()));
                return zy11Var;
            case 20:
                Integer num = (Integer) obj;
                int intValue = num.intValue();
                ao6 ao6Var = ((ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.circle_input.d) obj3).d;
                nnn nnnVar = ((rub) ((n351) obj2)).f;
                ao6Var.a.c(String.valueOf(intValue), nnnVar.a);
                String str4 = nnnVar.b;
                if (str4 != null) {
                    String concat = str4.concat(".SliderAmountAssign");
                    u1n u1nVar = ao6Var.b;
                    Map e = gw00.e(new Pair("value", num));
                    u1nVar.getClass();
                    u1nVar.p(e, g8e.p(concat, Extension.DOT_CHAR, "Tapped"), null);
                }
                return zy11Var;
            case 21:
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) obj2;
                r4 = ref$BooleanRef.element || ((x2t) obj).j((dsv) obj3);
                ref$BooleanRef.element = r4;
                return Boolean.valueOf(!r4);
            case 22:
                Ref$BooleanRef ref$BooleanRef2 = (Ref$BooleanRef) obj2;
                boolean z = ref$BooleanRef2.element || ((x2t) obj).s0((zvd0) obj3);
                ref$BooleanRef2.element = z;
                return Boolean.valueOf(!z);
            case 23:
                Ref$LongRef ref$LongRef = (Ref$LongRef) obj3;
                tls tlsVar = (tls) obj2;
                long uptimeMillis = SystemClock.uptimeMillis();
                if (ref$LongRef.element <= uptimeMillis) {
                    tlsVar.invoke(obj);
                    ref$LongRef.element = uptimeMillis + 500;
                }
                return zy11Var;
            case 24:
                ((m2k0) obj).b(((rbn) obj3).a(((qor) obj2).getFloatValue()));
                return zy11Var;
            case 25:
                pey peyVar = (pey) obj3;
                wj6 wj6Var = new wj6(i3, (wls) obj2);
                peyVar.getLifecycle().a(wj6Var);
                return new te4(2, peyVar, wj6Var);
            case 26:
                View view = (View) obj3;
                phd phdVar = new phd(r4 ? 1 : 0, view, (oz40) obj2);
                view.getViewTreeObserver().addOnGlobalLayoutListener(phdVar);
                return new te4(i2, view, phdVar);
            case 27:
                ((tls) obj3).invoke(((cy41) ((vx41) obj2).b.get(((Integer) obj).intValue())).b);
                return zy11Var;
            case 28:
                fvd fvdVar = (fvd) obj3;
                List list = fvdVar.c.a;
                ((m6y) ((u6y) obj)).f(list.size(), new tj(8, new tbb(6, fvdVar), list), new qc0(list, 7), new androidx.compose.runtime.internal.a(2039820996, new zx8(list, (tls) obj2, i2), true));
                return zy11Var;
            default:
                io9 io9Var = (io9) obj2;
                ((syd) ((uv6) obj3).I).getClass();
                if (jl40.l((ryd) obj, ryd.a)) {
                    ((uv6) io9Var.a).r(new qu(9));
                    return zy11Var;
                }
                w511.b();
                return null;
        }
    }
}
