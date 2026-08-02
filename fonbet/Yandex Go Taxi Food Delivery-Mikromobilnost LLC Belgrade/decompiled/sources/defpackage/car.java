package defpackage;

import android.content.Intent;
import com.yandex.payment.sdk.flex.actions.FinishFlowActionHandler$FinishFlowStatus;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class car implements vfr {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ car(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.vfr
    public final void a(mgr mgrVar, yfr yfrVar) {
        Object obj;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                bgr bgrVar = (bgr) mgrVar;
                h450 h450Var = (h450) obj2;
                bar barVar = FinishFlowActionHandler$FinishFlowStatus.Companion;
                String str = bgrVar.a;
                barVar.getClass();
                Iterator<E> it = FinishFlowActionHandler$FinishFlowStatus.a().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (cvu0.t(((FinishFlowActionHandler$FinishFlowStatus) obj).name(), str, true)) {
                        }
                    } else {
                        obj = null;
                    }
                }
                FinishFlowActionHandler$FinishFlowStatus finishFlowActionHandler$FinishFlowStatus = (FinishFlowActionHandler$FinishFlowStatus) obj;
                if (finishFlowActionHandler$FinishFlowStatus == null) {
                    finishFlowActionHandler$FinishFlowStatus = FinishFlowActionHandler$FinishFlowStatus.UNKNOWN;
                }
                Map map = bgrVar.b;
                Intent intent = new Intent();
                for (Map.Entry entry : map.entrySet()) {
                    intent.putExtra((String) entry.getKey(), (String) entry.getValue());
                }
                h450Var.a(new d450(finishFlowActionHandler$FinishFlowStatus, intent));
                break;
            case 1:
                ((h450) obj2).a(new g450(((cgr) mgrVar).a));
                break;
            default:
                egr egrVar = (egr) mgrVar;
                rwo rwoVar = (rwo) obj2;
                String str2 = egrVar.a;
                Map map2 = egrVar.b;
                LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(map2.size()));
                for (Map.Entry entry2 : map2.entrySet()) {
                    linkedHashMap.put(entry2.getKey(), new ktu0((String) entry2.getValue()));
                }
                ((y22) rwoVar).a(new iho(str2, new lhn((Map) new LinkedHashMap(linkedHashMap))));
                break;
        }
    }

    @Override // defpackage.vfr
    public final String b() {
        switch (this.a) {
            case 0:
                return "FinishFlowAction";
            case 1:
                return "OpenBrowserAction";
            default:
                return "SendAnalyticsEventAction";
        }
    }
}
