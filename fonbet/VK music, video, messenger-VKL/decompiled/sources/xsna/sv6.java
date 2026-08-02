package xsna;

import android.content.Context;
import com.ironsource.Be;
import com.ironsource.C4605ve;
import com.ironsource.InterfaceC4569te;
import com.vk.core.simplescreen.ScreenContainer;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class sv6 implements Runnable {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ sv6(Be be, InterfaceC4569te interfaceC4569te, Context context, C4605ve c4605ve, Context context2) {
        this.c = be;
        this.d = interfaceC4569te;
        this.e = context;
        this.g = c4605ve;
        this.f = context2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                Be.a((Be) this.c, (InterfaceC4569te) this.d, (Context) this.e, (C4605ve) this.g, (Context) this.f);
                break;
            default:
                n3u0 n3u0Var = (n3u0) this.c;
                zlw zlwVar = (zlw) this.d;
                r4p r4pVar = (r4p) this.e;
                com.vk.attachpicker.screen.s sVar = (com.vk.attachpicker.screen.s) this.f;
                j34 j34Var = (j34) this.g;
                com.vk.attachpicker.screen.p pVar = n3u0Var.e;
                boolean z = pVar.L;
                com.vk.core.simplescreen.a aVar = pVar.z;
                c6a0 c6a0Var = pVar.f0;
                String a = c6a0Var != null ? c6a0Var.a() : null;
                com.vk.attachpicker.screen.t tVar = pVar.S;
                com.vk.attachpicker.screen.h hVar = new com.vk.attachpicker.screen.h(zlwVar, r4pVar, sVar, j34Var, z, aVar, a, tVar.N());
                tVar.u(pVar.z);
                ScreenContainer screenContainer = pVar.f;
                if (screenContainer != null) {
                    screenContainer.d(hVar);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ sv6(n3u0 n3u0Var, zlw zlwVar, r4p r4pVar, com.vk.attachpicker.screen.s sVar, j34 j34Var) {
        this.c = n3u0Var;
        this.d = zlwVar;
        this.e = r4pVar;
        this.f = sVar;
        this.g = j34Var;
    }
}
