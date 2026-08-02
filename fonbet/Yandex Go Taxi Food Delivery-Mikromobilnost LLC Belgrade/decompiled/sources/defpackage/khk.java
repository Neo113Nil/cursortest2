package defpackage;

import com.ybsdk.feature.deeplink.api.Deeplink;
import com.ybsdk.feature.deeplink.api.DeeplinkHandleResult$DeeplinkType;
import com.ybsdk.screens.divbottomsheet.c;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import java.util.Iterator;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public final /* synthetic */ class khk implements a3z {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ khk(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.a3z
    public final y0h a(Deeplink deeplink) {
        int i = this.a;
        x0h x0hVar = x0h.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                c cVar = (c) obj;
                if (!(deeplink.getAction() instanceof DeeplinkAction.Close)) {
                    return x0hVar;
                }
                ((sls) cVar.z.b).invoke();
                b3z b3zVar = cVar.B;
                b3zVar.d.remove(cVar.F);
                return new v0h(EmptyList.a, DeeplinkHandleResult$DeeplinkType.SCREEN_OPEN, 2);
            case 1:
                Iterator it = ((c) obj).D.b.iterator();
                while (it.hasNext()) {
                    y0h a = ((a3z) it.next()).a(deeplink);
                    if ((a instanceof v0h) || jl40.l(a, w0h.a)) {
                        return a;
                    }
                    if (!jl40.l(a, x0hVar)) {
                        w511.b();
                        return null;
                    }
                }
                return x0hVar;
            default:
                v04 v04Var = (v04) obj;
                if (jl40.l(deeplink.getAction().getDeeplinkUri().getHost(), "screen.open") && !jl40.l(deeplink.getAction().getDeeplinkUri().getPath(), "/bottom_sheet")) {
                    v04Var.invoke();
                }
                return x0hVar;
        }
    }
}
