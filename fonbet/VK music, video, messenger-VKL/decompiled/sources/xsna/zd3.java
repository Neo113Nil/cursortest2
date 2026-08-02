package xsna;

import android.content.Context;
import com.vk.dto.common.data.ApiApplication;
import com.vk.external.miniapp.net.app.WebApiApplication;

/* compiled from: AppsBridge.kt */
/* loaded from: classes15.dex */
public interface zd3 {
    static /* synthetic */ void g(zd3 zd3Var, Context context, ApiApplication apiApplication, String str, String str2, int i) {
        if ((i & 4) != 0) {
            str = null;
        }
        zd3Var.b(context, apiApplication, str, (i & 8) != 0 ? "menu" : "search", (i & 16) != 0 ? null : str2);
    }

    void a(WebApiApplication webApiApplication, int i, int i2, im80 im80Var, e1s0 e1s0Var, pnr0 pnr0Var, Context context);

    io.reactivex.rxjava3.disposables.c b(Context context, ApiApplication apiApplication, String str, String str2, String str3);

    void c(com.vk.movika.sdk.base.observable.w wVar);

    void d(Context context);

    Long e();

    void f(Context context, String str);
}
