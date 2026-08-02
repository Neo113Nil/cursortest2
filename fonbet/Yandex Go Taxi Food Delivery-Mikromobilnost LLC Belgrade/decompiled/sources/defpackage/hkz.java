package defpackage;

import com.yandex.go.superapp.tracking.api.domain.models.LogisticsOrderTracking$Status;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.logistics.deliveries.order.c;
import ru.yandex.taxi.superapp.orders.models.ActionType;

/* loaded from: classes14.dex */
public final class hkz implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ hn70 b;
    public final /* synthetic */ c c;
    public final /* synthetic */ bjz w;
    public final /* synthetic */ List x;

    public hkz(vpr vprVar, hn70 hn70Var, c cVar, bjz bjzVar, List list) {
        this.a = vprVar;
        this.b = hn70Var;
        this.c = cVar;
        this.w = bjzVar;
        this.x = list;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        Pair pair = (Pair) obj;
        hn70 a = hn70.a(this.b, (String) pair.getFirst(), null, null, (String) pair.getSecond(), null, 2096894);
        this.c.getClass();
        bjz bjzVar = this.w;
        String str = bjzVar.a;
        ListBuilder a2 = rcc.a();
        wiz wizVar = bjzVar.j;
        if (wizVar != null) {
            ww wwVar = new ww(ActionType.LOGISTICS_PERFORMER);
            wwVar.b = wizVar.a;
            viz vizVar = wizVar.b;
            wwVar.l = vizVar.b;
            wwVar.m = true;
            wwVar.d = vizVar.a;
            String str2 = wizVar.c;
            if (str2 != null) {
                wwVar.c = str2;
            }
            a2.add(new xw(wwVar));
            uiz uizVar = wizVar.d;
            if (uizVar != null) {
                ww wwVar2 = new ww(ActionType.CALL);
                wwVar2.b = uizVar.a;
                boolean z = uizVar.b;
                wwVar2.n = z;
                wwVar2.k = !z;
                a2.add(new xw(wwVar2));
            }
        }
        miz mizVar = bjzVar.n;
        if (mizVar != null) {
            ww wwVar3 = new ww(ActionType.CANCEL);
            wwVar3.b = mizVar.b;
            wwVar3.k = bjzVar.h != LogisticsOrderTracking$Status.Cancelling;
            a2.add(new xw(wwVar3));
        }
        String str3 = bjzVar.l.a;
        if (str3 != null) {
            ww wwVar4 = new ww(ActionType.ORDER_DETAILS);
            wwVar4.b = str3;
            a2.add(new xw(wwVar4));
        }
        ziz zizVar = bjzVar.m;
        if (zizVar != null) {
            ww wwVar5 = new ww(ActionType.LOGISTICS_SHOW_CONTENT);
            wwVar5.b = zizVar.a;
            a2.add(new xw(wwVar5));
        }
        ListBuilder j = a2.j();
        dub dubVar = new dub(str, j);
        if (j.isEmpty()) {
            dubVar = null;
        }
        return this.a.emit(new yn70(a, null, null, dubVar, this.x, null, 462), continuation);
    }
}
