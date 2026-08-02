package defpackage;

import android.content.Intent;
import android.net.Uri;
import com.yandex.go.intentprocessor.i;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.web.UiWebViewConfig;

/* loaded from: classes.dex */
public final class izs implements x7w {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ izs(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.x7w
    public final Object a(oep0 oep0Var, Intent intent, Continuation continuation) {
        Uri data;
        UiWebViewConfig uiWebViewConfig;
        int i = this.a;
        n5u n5uVar = n5u.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Uri data2 = intent.getData();
                if (!(data2 == null ? false : "geo".equalsIgnoreCase(data2.getScheme())) || (data = intent.getData()) == null) {
                    return n5uVar;
                }
                i iVar = (i) obj;
                return new m5u(iVar.d(new o7z(data), iVar.m), false);
            default:
                if (!intent.hasExtra(UiWebViewConfig.EXTRAS_CONFIG) || (uiWebViewConfig = (UiWebViewConfig) ffx.P(intent, UiWebViewConfig.EXTRAS_CONFIG, UiWebViewConfig.class)) == null) {
                    return n5uVar;
                }
                ((ft41) ((dt41) ((yvf0) obj).get())).P(uiWebViewConfig);
                return new m5u(true, false);
        }
    }
}
