package defpackage;

import android.net.Uri;
import com.adjust.sdk.Constants;
import com.yandex.go.analytics.b;
import com.yandex.go.app.icon.api.RestoreSource;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.collections.a;

/* loaded from: classes12.dex */
public final class hu2 implements v1g0 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ hu2(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.v1g0
    public final boolean a(Map map) {
        Uri uri;
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                if (!jl40.l((String) map.get("type"), "change_app_icon")) {
                    return false;
                }
                ((b) obj).a("AppIconDelegate.PushHandle");
                q5h q5hVar = (q5h) obj2;
                q5hVar.getClass();
                q5hVar.e(RestoreSource.PUSH);
                return true;
            default:
                tqt tqtVar = (tqt) obj2;
                if (tqtVar.a()) {
                    String str = (String) map.get(Constants.DEEPLINK);
                    if (str == null) {
                        str = "";
                    }
                    try {
                        uri = Uri.parse(str);
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Throwable unused) {
                        uri = null;
                    }
                    ((pux0) ((o3h) obj)).getClass();
                    if (a.G(pux0.b, uri != null ? uri.getScheme() : null)) {
                        if (jl40.l(uri != null ? uri.getAuthority() : null, "disableGPModeInTaxiApp")) {
                            uqt uqtVar = tqtVar.a;
                            qme0 qme0Var = uqtVar.c;
                            kgx[] kgxVarArr = uqt.x;
                            qme0Var.setValue(uqtVar, kgxVarArr[0], Boolean.FALSE);
                            uqtVar.w.setValue(uqtVar, kgxVarArr[1], "");
                            ((cne0) uqtVar.b).b();
                        }
                    }
                }
                return tqtVar.a();
        }
    }
}
