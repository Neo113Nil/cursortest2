package defpackage;

import android.view.View;
import com.yandex.go.shortcuts.impl.view.adapter.a;
import com.yandex.passport.common.network.r;
import com.yandex.passport.internal.social.esia.EsiaBindWebClient;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ru.yandex.taxi.widget.c;

/* loaded from: classes13.dex */
public final /* synthetic */ class fv implements tls {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ fv(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
        this.x = obj4;
        this.y = obj5;
        this.z = obj6;
        this.A = obj7;
        this.B = obj8;
        this.C = obj9;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.C;
        Object obj3 = this.B;
        Object obj4 = this.A;
        Object obj5 = this.z;
        Object obj6 = this.y;
        Object obj7 = this.x;
        Object obj8 = this.w;
        Object obj9 = this.c;
        Object obj10 = this.b;
        switch (i) {
            case 0:
                return new a((w3s0) obj10, (t4s0) obj9, (c1f) obj8, (n170) obj7, (c) obj6, (com.yandex.go.shortcuts.impl.ui.shortcutview.a) obj5, (View) obj, (j1s0) obj4, (mqv0) obj3, (x1s0) obj2);
            default:
                String str = (String) obj3;
                Map map = (Map) obj2;
                r rVar = (r) obj;
                rVar.c("/3/authorize/submit");
                rVar.b("Ya-Consumer-Authorization", "OAuth ".concat((String) obj10));
                rVar.f("client_id", (String) obj9);
                rVar.f("language", (String) obj8);
                rVar.f("response_type", (String) obj7);
                rVar.f("fingerprint", (String) obj6);
                rVar.f(CommonUrlParts.APP_ID, (String) obj5);
                Iterator it = ((List) obj4).iterator();
                while (it.hasNext()) {
                    rVar.f("requested_scopes", (String) it.next());
                }
                rVar.f(EsiaBindWebClient.REDIRECT_PARAM_NAME, str);
                rVar.e(map);
                return zy11.a;
        }
    }
}
