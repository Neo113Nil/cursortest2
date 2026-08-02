package defpackage;

import android.content.Intent;
import android.net.Uri;
import com.yandex.go.payments.paymentlist.navigation.deeplink.a;
import kotlin.coroutines.Continuation;

/* loaded from: classes8.dex */
public final class gaa0 implements vje {
    public final /* synthetic */ a a;

    public gaa0(a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.vje
    public final Object a(Intent intent, Continuation continuation) {
        Uri data = intent.getData();
        if (data != null && "paymentmethods".equalsIgnoreCase(data.getAuthority())) {
            a aVar = this.a;
            if (aVar.x()) {
                return new m5u(false, false);
            }
            aVar.i();
        }
        return n5u.a;
    }
}
