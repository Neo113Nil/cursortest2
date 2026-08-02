package com.yandex.plus.home.plaque.feature.internal.presentation;

import com.yandex.plus.log.api.LogPriority;
import defpackage.boc0;
import defpackage.eg20;
import defpackage.eic0;
import defpackage.joc0;
import defpackage.kjz;
import defpackage.lf20;
import defpackage.lho;
import defpackage.loc0;
import defpackage.pgz;
import defpackage.phc0;
import defpackage.rkc0;
import defpackage.roc0;
import defpackage.tcc;
import defpackage.tf20;
import defpackage.tje;
import defpackage.tls;
import defpackage.unr0;
import defpackage.w511;
import defpackage.xhc0;
import defpackage.yo40;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.r0;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class PlaqueViewControllerImpl$view$2 extends FunctionReferenceImpl implements tls {
    public final void i(eg20 eg20Var) {
        Object value;
        boc0 boc0Var;
        d dVar = (d) this.receiver;
        pgz pgzVar = dVar.h;
        LogPriority logPriority = LogPriority.INFO;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, "PlaqueViewModel", "onWidgetClicked()");
        }
        eic0 action = eg20Var.getAction();
        kjz kjzVar = dVar.a;
        rkc0 rkc0Var = (rkc0) kjzVar.b;
        if (action == null) {
            return;
        }
        xhc0 xhc0Var = (xhc0) dVar.l.getValue();
        boc0 boc0Var2 = (boc0) rkc0Var.e.getValue();
        if (xhc0Var != null) {
            if (xhc0Var instanceof phc0) {
                String str = ((phc0) xhc0Var).b().a;
                pgz pgzVar2 = (pgz) kjzVar.c;
                if (pgzVar2.e(logPriority)) {
                    pgzVar2.a(logPriority, "PlaqueContextObservableImpl", unr0.l(')', "onPlaqueInteracted(", str));
                }
                Set set = rkc0Var.b;
                r0 r0Var = rkc0Var.e;
                do {
                    value = r0Var.getValue();
                    boc0Var = (boc0) value;
                    set.add(str);
                } while (!r0Var.k(value, boc0.a(boc0Var, kotlin.collections.b.o(boc0Var.a, new Pair("PlaquesInteracted", kotlin.collections.a.N0(set))))));
                tje.N(dVar.i, null, null, new PlaqueViewModel$handleClick$1(dVar, xhc0Var, action, null), 3);
            }
            yo40 yo40Var = dVar.e;
            roc0 b = xhc0Var.b();
            Map c = xhc0Var.c();
            lho lhoVar = (lho) yo40Var.a;
            String str2 = b.a;
            Object obj = boc0Var2.a.get(MetaDataField.SCREEN_FIELD);
            String str3 = obj instanceof String ? (String) obj : null;
            if (str3 == null) {
                str3 = "no_value";
            }
            loc0 loc0Var = b.c;
            joc0 joc0Var = loc0Var instanceof joc0 ? (joc0) loc0Var : null;
            String num = joc0Var != null ? Integer.valueOf(joc0Var.a()).toString() : null;
            String str4 = num != null ? num : "no_value";
            List i = yo40.i(b.b);
            ArrayList arrayList = new ArrayList(tcc.n(i, 10));
            Iterator it = i.iterator();
            while (it.hasNext()) {
                arrayList.add(yo40.o((tf20) it.next(), boc0Var2));
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("element_id", eg20Var.getId());
            if (eg20Var instanceof tf20) {
                linkedHashMap.put("element_type", "widget");
                linkedHashMap.putAll(yo40.o((tf20) eg20Var, boc0Var2));
            } else if (!(eg20Var instanceof lf20)) {
                w511.b();
                return;
            } else {
                linkedHashMap.put("element_type", "group");
                linkedHashMap.putAll(yo40.l(eg20Var.getAction()));
            }
            lhoVar.getClass();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("plaque_id", str2);
            linkedHashMap2.put(MetaDataField.SCREEN_FIELD, str3);
            linkedHashMap2.put("notification_count", str4);
            linkedHashMap2.put("widget_list", arrayList);
            linkedHashMap2.put("metric_context", c);
            linkedHashMap2.put("element_clicked", linkedHashMap);
            linkedHashMap2.put("_meta", lho.a(1, new HashMap()));
            lhoVar.d("CashbackBadge.Tapped", linkedHashMap2);
        }
        tje.N(dVar.o, null, null, new PlaqueViewModel$handleClick$2(action, boc0Var2, dVar, null), 3);
    }

    @Override // defpackage.tls
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        i((eg20) obj);
        return zy11.a;
    }
}
