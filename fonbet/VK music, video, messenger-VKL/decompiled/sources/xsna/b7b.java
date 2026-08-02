package xsna;

import android.content.Context;
import com.vk.core.apps.BuildInfo;

/* compiled from: ChannelNotificationsEventsProcessor.kt */
/* loaded from: classes.dex */
public final class b7b {
    public final a7b a;
    public final jbb b;
    public final wdb c;

    public b7b(a1w a1wVar, tkb tkbVar, Context context, ui70 ui70Var, b25 b25Var, BuildInfo.Client client) {
        iv3 iv3Var = new iv3(context);
        jp9 jp9Var = new jp9(context, iv3Var);
        azp0 azp0Var = new azp0(iv3Var);
        j7b j7bVar = new j7b(context, new tb8(a1wVar, 2), a1wVar.r().h);
        this.a = new a7b(context, a1wVar, j7bVar, client, tkbVar, ui70Var, b25Var);
        this.b = new jbb(jp9Var, b25Var);
        this.c = new wdb(a1wVar, j7bVar, b25Var, azp0Var, jp9Var);
    }
}
