package com.yandex.passport.internal.sloth.performers;

import android.content.Context;
import com.yandex.passport.R;
import com.yandex.passport.internal.sloth.SlothEulaSupport$TextKey;
import defpackage.cvu0;
import defpackage.gw00;
import defpackage.qke;
import defpackage.sf00;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tls;
import defpackage.uf00;
import defpackage.vf00;
import defpackage.zy11;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.builders.MapBuilder;
import org.json.JSONObject;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes15.dex */
public final /* synthetic */ class f implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Map map;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                g gVar = (g) obj3;
                tje.N(((com.yandex.passport.common.coroutine.f) gVar.d).a(true), null, null, new GetSmsCommandPerformer$performCommand$2$1(gVar, (GetSmsCommandPerformer$SmsCodeLocalReceiver) obj2, null), 3);
                break;
            default:
                com.yandex.passport.internal.sloth.k kVar = ((b) obj2).a;
                JSONObject jSONObject = (JSONObject) obj;
                Set set = (Set) obj3;
                com.yandex.passport.internal.sloth.i iVar = SlothEulaSupport$TextKey.Companion;
                int d = gw00.d(tcc.n(set, 10));
                if (d < 16) {
                    d = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(d);
                for (Object obj4 : set) {
                    iVar.getClass();
                    map = SlothEulaSupport$TextKey.mapping;
                    linkedHashMap.put(obj4, (SlothEulaSupport$TextKey) map.get((String) obj4));
                }
                MapBuilder k = qke.k(linkedHashMap);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(gw00.d(k.getSize()));
                Object it = ((vf00) k.entrySet()).iterator();
                while (((uf00) it).hasNext()) {
                    Map.Entry entry = (Map.Entry) ((sf00) it).next();
                    Object key = entry.getKey();
                    SlothEulaSupport$TextKey slothEulaSupport$TextKey = (SlothEulaSupport$TextKey) entry.getValue();
                    Context context = kVar.a;
                    int i2 = com.yandex.passport.internal.sloth.j.a[slothEulaSupport$TextKey.ordinal()];
                    linkedHashMap2.put(key, i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? (String) kVar.d.get(slothEulaSupport$TextKey) : context.getString(R.string.passport_eula_taxi_agreement_text_override) : context.getString(R.string.passport_eula_privacy_policy_text) : context.getString(R.string.passport_eula_user_agreement_text) : context.getString(R.string.passport_eula_reg_format_android));
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(gw00.d(linkedHashMap2.size()));
                for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                    Object key2 = entry2.getKey();
                    String str = (String) entry2.getValue();
                    linkedHashMap3.put(key2, str != null ? cvu0.v(cvu0.v(str, " ", " ", false), "&#160;", " ", false) : null);
                }
                Object it2 = ((vf00) qke.k(linkedHashMap3).entrySet()).iterator();
                while (((uf00) it2).hasNext()) {
                    Map.Entry entry3 = (Map.Entry) ((sf00) it2).next();
                    jSONObject.put((String) entry3.getKey(), (String) entry3.getValue());
                }
                jSONObject.put("appType", kVar.b ? TariffOrderFlow.ORDER_FLOW_TAXI_KEY : "default");
                break;
        }
        return zy11Var;
    }
}
