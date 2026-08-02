package defpackage;

import androidx.fragment.app.Fragment;
import com.ybsdk.di.helpers.LandingCloseCloseCallback;
import com.ybsdk.di.modules.features.c;
import com.ybsdk.feature.webview.api.WebViewAppearanceOption;
import com.ybsdk.feature.webview.api.WebViewControl;
import com.ybsdk.feature.webview.api.WebViewScreenParams;
import com.ybsdk.feature.webview.internal.a;
import com.ybsdk.rconfig.CardLanding;
import com.ybsdk.rconfig.b;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class df8 implements cf8, kcs {
    public final /* synthetic */ tc9 a;
    public final pg5 b;
    public final pn8 c;
    public final wm8 d;

    public df8(pg5 pg5Var, pn8 pn8Var, wm8 wm8Var, Map map) {
        this.a = new tc9(map, 10);
        this.b = pg5Var;
        this.c = pn8Var;
        this.d = wm8Var;
    }

    @Override // defpackage.kcs
    public final Fragment a(String str) {
        return this.a.a(str);
    }

    public final List b() {
        c cVar = (c) this.c.a;
        b bVar = cVar.c;
        String url = ((CardLanding) bVar.d(bVar.i.j).getData()).getUrl();
        List c = ((l3h) ((j3h) cVar.a.get())).c(url);
        if (c != null) {
            return c;
        }
        np41 np41Var = cVar.b;
        WebViewControl.Type type = WebViewControl.Type.CROSS;
        WebViewControl.Companion.getClass();
        return Collections.singletonList(((a) np41Var).e(new WebViewScreenParams(url, false, null, new WebViewAppearanceOption.NoToolbar(new WebViewControl(type, ln41.a()), false, true, 2, null), LandingCloseCloseCallback.INSTANCE, null, null, null, false, 486, null)));
    }
}
