package defpackage;

import com.yandex.fintechsdk.adapters.flex.sdk.api.FlexAdapter;
import com.yandex.fintechsdk.core.analytics.impl.internal.a;
import java.util.LinkedHashMap;
import java.util.List;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;

/* loaded from: classes12.dex */
public final class d0e extends bu90 {
    public final boj0 a;

    public d0e(boj0 boj0Var) {
        this.a = boj0Var;
    }

    @Override // defpackage.bu90
    public final void a(String str) {
        boj0 boj0Var = this.a;
        z22 z22Var = (z22) boj0Var.c;
        FlexAdapter flexAdapter = (FlexAdapter) boj0Var.x;
        try {
            zcx zcxVar = (zcx) boj0Var.z;
            zcxVar.getClass();
            qee0 qee0Var = (qee0) zcxVar.b(qee0.Companion.serializer(), str);
            LinkedHashMap linkedHashMap = (LinkedHashMap) boj0Var.y;
            String str2 = qee0Var.a;
            mee0 mee0Var = (mee0) linkedHashMap.get(str2);
            if (mee0Var == null) {
                return;
            }
            c cVar = qee0Var.b;
            if (cVar == null) {
                b bVar = qee0Var.c;
                cVar = bVar != null ? qcx.m(bVar) : null;
            }
            List<uee0> list = mee0Var.c;
            if (list != null) {
                for (uee0 uee0Var : list) {
                    String d = boj0.d(uee0Var.a, cVar);
                    if (d != null) {
                        String str3 = uee0Var.d;
                        if (str3 != null) {
                            ((zh5) boj0Var.w).setVariable(str3, d);
                        }
                        xpq0 xpq0Var = uee0Var.b;
                        if (xpq0Var != null) {
                            String str4 = xpq0Var.a;
                            String str5 = xpq0Var.b;
                            if (flexAdapter != null) {
                                flexAdapter.updateStateValue(str4, str5, d);
                            }
                        }
                        List list2 = uee0Var.c;
                        if (list2 != null) {
                            if (list2.size() == 2) {
                                String str6 = (String) list2.get(0);
                                String str7 = (String) list2.get(1);
                                if (flexAdapter != null) {
                                    flexAdapter.updateStateValue(str6, str7, d);
                                }
                            } else {
                                ((a) z22Var).c("bdui_webview_post_message", new IllegalArgumentException("Unexpected sendToBackendPath size: " + list2.size() + ", expected 2"));
                            }
                        }
                    }
                }
            }
            ((a) z22Var).a(new gi5(str2));
            ((klk) boj0Var.b).handleAction(mee0Var.b);
        } catch (Exception unused) {
        }
    }
}
