package xsna;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vkontakte.android.R;

/* compiled from: ContactAndLinksItem.kt */
/* loaded from: classes5.dex */
public final class w7j extends qaz {
    public final /* synthetic */ y7j m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7j(String str, y7j y7jVar) {
        super(str, 0);
        this.m = y7jVar;
    }

    @Override // xsna.qaz, xsna.rku0
    public final void f(Context context, View view) {
        y7j y7jVar = this.m;
        if (context != null) {
            try {
                context.startActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, rf3.c(y7jVar.i, new StringBuilder("mailto:"))));
            } catch (Throwable unused) {
                cvk.u(R.string.error_open_app, false);
            }
        }
        g2h g2hVar = new g2h(y7jVar.o);
        g2hVar.b = y7jVar.p;
        g2hVar.d = "email";
        g2hVar.a();
    }
}
