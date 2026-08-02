package defpackage;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public final class ff5 extends q55 {
    public final Map a;
    public final m2v b = new m2v();
    public final boolean c;

    public ff5(Map map, boolean z) {
        this.a = map;
        this.c = z;
    }

    @Override // defpackage.t85
    public final Object a(String str) {
        return this.a.get(str);
    }

    @Override // defpackage.t85
    public final String b() {
        return (String) this.a.get("method");
    }

    @Override // defpackage.t85
    public final boolean c() {
        return this.c;
    }

    @Override // defpackage.q55
    public final rc70 d() {
        return this.b;
    }

    public final void e(ArrayList arrayList) {
        if (this.c) {
            return;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        m2v m2vVar = this.b;
        hashMap2.put(AuthSdkActivity.RESPONSE_TYPE_CODE, (String) m2vVar.b);
        hashMap2.put(Constants.KEY_MESSAGE, (String) m2vVar.c);
        hashMap2.put(Constants.KEY_DATA, m2vVar.w);
        hashMap.put("error", hashMap2);
        arrayList.add(hashMap);
    }

    public final void f(ArrayList arrayList) {
        if (this.c) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(TarifficatorScenarioActivity.RESULT_KEY, this.b.a);
        arrayList.add(hashMap);
    }
}
