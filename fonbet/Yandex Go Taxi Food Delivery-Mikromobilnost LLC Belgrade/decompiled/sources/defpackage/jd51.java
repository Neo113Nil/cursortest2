package defpackage;

import android.content.Context;
import com.yandex.payment.sdk.core.data.PaymentSdkEnvironment;
import com.yandex.xplat.xflags.LanguageKind;
import io.appmetrica.analytics.AppMetrica;
import java.util.LinkedHashMap;
import kotlin.collections.EmptyList;

/* loaded from: classes2.dex */
public final class jd51 implements v7p {
    public final /* synthetic */ int a;
    public final mj31 b;

    public /* synthetic */ jd51(mj31 mj31Var, int i) {
        this.a = i;
        this.b = mj31Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        mj31 mj31Var = this.b;
        switch (i) {
            case 0:
                wwf wwfVar = new wwf((Context) mj31Var.b);
                vs20 vs20Var = new vs20(0);
                jln jlnVar = new jln(wwfVar, vs20Var, wwfVar);
                i4u i4uVar = new i4u(new qdh());
                String a = vs20Var.a(scc.i((String) wwfVar.a, "psdk_flags"));
                vs20Var.a(scc.i(a, "feature_flags.json"));
                return new t1r(jlnVar, new ga0(a, vs20Var.a(scc.i(a, "pending_feature_flags.json")), false), i4uVar);
            case 1:
                wwf wwfVar2 = new wwf((Context) mj31Var.b);
                vs20 vs20Var2 = new vs20(0);
                jln jlnVar2 = new jln(wwfVar2, vs20Var2, wwfVar2);
                i4u i4uVar2 = new i4u(new qdh());
                String a2 = vs20Var2.a(scc.i((String) wwfVar2.a, "xmail_flags"));
                return new v1r(jlnVar2, new rbh(vs20Var2.a(scc.i(a2, "activated_flags.json")), vs20Var2.a(scc.i(a2, "pending_flags.json")), 0), i4uVar2);
            case 2:
                return new gq50(false, bwa1.a(((PaymentSdkEnvironment) mj31Var.c) == PaymentSdkEnvironment.TESTING), EmptyList.a);
            case 3:
                return new hkh(new qq31(20, mj31Var));
            default:
                id51 id51Var = new id51((Context) mj31Var.b);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put(wxd.a.b, new ouu0(((LanguageKind) id51Var.b.getValue()).getValue()));
                String str = wxd.d.b;
                Context context = id51Var.a;
                linkedHashMap.put(str, new ouu0(context.getApplicationInfo().packageName));
                linkedHashMap.put(wxd.b.b, new ja31(new bg1("7.6.6", 18)));
                linkedHashMap.put(wxd.c.b, new o6w(1));
                String str2 = wxd.e.b;
                String uuid = AppMetrica.getUuid(context);
                if (uuid == null) {
                    uuid = "";
                }
                linkedHashMap.put(str2, new o6w(uuid.hashCode() % 100));
                String str3 = wxd.f.b;
                String uuid2 = AppMetrica.getUuid(context);
                linkedHashMap.put(str3, new ouu0(uuid2 != null ? uuid2 : ""));
                return linkedHashMap;
        }
    }
}
