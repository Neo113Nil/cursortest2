package xsna;

import android.content.Context;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import java.text.SimpleDateFormat;

/* compiled from: SuperappLinksHandler.kt */
/* loaded from: classes6.dex */
public final class pnl implements SuperappUiRouterBridge.f {
    public final /* synthetic */ Context a;
    public final /* synthetic */ String b;

    public pnl(qnl qnlVar, Context context, String str) {
        this.a = context;
        this.b = str;
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge.f
    public final void a() {
        SimpleDateFormat simpleDateFormat = bgu0.a;
        rex0 rex0Var = e370.j;
        if (rex0Var == null) {
            rex0Var = null;
        }
        bgu0.b(this.a, rex0Var, this.b);
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge.f
    public final void b() {
        SimpleDateFormat simpleDateFormat = bgu0.a;
        rex0 rex0Var = e370.j;
        if (rex0Var == null) {
            rex0Var = null;
        }
        bgu0.b(this.a, rex0Var, this.b);
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge.f
    public final void onSuccess() {
    }
}
