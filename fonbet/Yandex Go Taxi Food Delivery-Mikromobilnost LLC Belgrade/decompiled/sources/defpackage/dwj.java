package defpackage;

import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import kotlin.collections.builders.MapBuilder;

/* loaded from: classes13.dex */
public final /* synthetic */ class dwj implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ lg80 w;

    public /* synthetic */ dwj(String str, String str2, lg80 lg80Var, int i) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.w = lg80Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        lg80 lg80Var = this.w;
        String str = this.c;
        String str2 = this.b;
        w3j0 w3j0Var = (w3j0) obj;
        switch (i) {
            case 0:
                if (str2 != null) {
                    w3j0Var.a.put(LaunchBrowserActivity.KEY_URI, str2);
                }
                if (str != null) {
                    w3j0Var.a.put("oid", str);
                }
                w3j0Var.d("mode", lg80Var.b());
                MapBuilder mapBuilder = new MapBuilder();
                mapBuilder.put("type", "close");
                mapBuilder.put("oid", str);
                mapBuilder.put("url", str2);
                w3j0Var.f("action", mapBuilder.j());
                break;
            default:
                if (str2 != null) {
                    w3j0Var.a.put(LaunchBrowserActivity.KEY_URI, str2);
                }
                if (str != null) {
                    w3j0Var.a.put("oid", str);
                }
                w3j0Var.d("mode", lg80Var != null ? lg80Var.b() : null);
                break;
        }
        return zy11Var;
    }
}
