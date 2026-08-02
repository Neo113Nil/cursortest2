package defpackage;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.plus.notification.a;
import ru.yandex.taxi.lifecycle.c;

/* loaded from: classes8.dex */
public final class pmd0 implements vw60 {
    public final Context a;
    public final tj60 b;
    public final a c;
    public final Lifecycle d;

    public pmd0(Context context, tj60 tj60Var, a aVar, Lifecycle lifecycle) {
        this.a = context;
        this.b = tj60Var;
        this.c = aVar;
        this.d = lifecycle;
    }

    @Override // defpackage.vw60
    public final void c() {
        a aVar = this.c;
        aVar.c = this.a;
        aVar.d = this.b;
        c.a(this.d, new ssu(24, this));
    }

    @Override // defpackage.s150
    public final String getName() {
        return "PlusSubscriptionActivationStatusAttachListener";
    }
}
