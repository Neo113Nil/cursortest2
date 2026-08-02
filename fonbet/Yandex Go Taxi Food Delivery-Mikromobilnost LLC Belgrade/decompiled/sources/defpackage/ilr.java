package defpackage;

import android.content.Context;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.navigation.FlexRouteHandlerImpl;
import com.yandex.fintechsdk.adapters.yb.sdk.impl.c;
import com.ybsdk.api.YBSdk;
import com.ybsdk.api.entities.YBSdkTheme;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes10.dex */
public final /* synthetic */ class ilr implements sls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ ilr(FlexRouteHandlerImpl flexRouteHandlerImpl, u1m u1mVar, ywl ywlVar, boolean z, boolean z2, Map map) {
        this.w = flexRouteHandlerImpl;
        this.x = u1mVar;
        this.y = ywlVar;
        this.b = z;
        this.c = z2;
        this.z = map;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 overlay$lambda$3;
        int i = this.a;
        Object obj = this.z;
        Object obj2 = this.y;
        Object obj3 = this.x;
        Object obj4 = this.w;
        switch (i) {
            case 0:
                overlay$lambda$3 = FlexRouteHandlerImpl.overlay$lambda$3((FlexRouteHandlerImpl) obj4, (u1m) obj3, (ywl) obj2, this.b, this.c, (Map) obj);
                return overlay$lambda$3;
            default:
                mp51 mp51Var = (mp51) obj4;
                Context context = (Context) obj3;
                Locale locale = (Locale) obj2;
                String str = (String) obj;
                try {
                    w4o w4oVar = this.c ? t4o.d : v4o.d;
                    YBSdk.init$default(new hh51(context, new vx51(mp51Var), w4oVar, new ec31(27, locale), new xc8(str, 24), null, null, bvf0.c(this.b ? YBSdkTheme.DARK : YBSdkTheme.LIGHT), null, 16096), null, 2, null);
                } catch (Exception unused) {
                }
                return YBSdk.createSdkComponent(new pg51(new r100()));
        }
    }

    public /* synthetic */ ilr(c cVar, mp51 mp51Var, Context context, boolean z, boolean z2, Locale locale, String str) {
        this.w = mp51Var;
        this.x = context;
        this.b = z;
        this.c = z2;
        this.y = locale;
        this.z = str;
    }
}
