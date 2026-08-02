package defpackage;

import android.content.Context;
import com.monetization.ads.network.core.Request;
import java.util.UUID;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import yads.pu0;
import yads.su0;
import yads.uu0;

/* loaded from: classes7.dex */
public final class mg81 {
    public final Context a;
    public final i3y b = a.a(new su0(this));

    public mg81(Context context) {
        this.a = context;
    }

    public final Object a(String str, uu0 uu0Var) {
        j18 j18Var = new j18(1, dvw.b(uu0Var));
        j18Var.u();
        Request eg81Var = new eg81(str, new bp5(j18Var), new bp5(j18Var));
        eg81Var.setShouldCache(false);
        UUID randomUUID = UUID.randomUUID();
        eg81Var.setTag(randomUUID);
        ((dy61) this.b.getValue()).b(eg81Var);
        j18Var.w(new pu0(this, randomUUID));
        Object s = j18Var.s();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return s;
    }
}
