package defpackage;

import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import com.ybsdk.screens.initial.a;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public final class q1h implements k3h {
    public final /* synthetic */ di51 a;
    public final /* synthetic */ j3h b;
    public final /* synthetic */ u470 c;
    public final /* synthetic */ tfl0 d;
    public final /* synthetic */ a e;

    public q1h(di51 di51Var, j3h j3hVar, u470 u470Var, tfl0 tfl0Var, kg51 kg51Var, fj3 fj3Var, a aVar) {
        this.a = di51Var;
        this.b = j3hVar;
        this.c = u470Var;
        this.d = tfl0Var;
        this.e = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.List] */
    @Override // defpackage.k3h
    public final y0h a(BaseDeeplinkAction baseDeeplinkAction) {
        if (!(baseDeeplinkAction instanceof DeeplinkAction.AuthLanding)) {
            return x0h.a;
        }
        Object value = this.a.m().getValue();
        EmptyList emptyList = EmptyList.a;
        if (value != null) {
            ?? b = ((l3h) this.b).b(this.c.a());
            if (b != 0) {
                emptyList = b;
            }
        } else {
            this.d.j(a.c(this.e));
        }
        return new v0h(emptyList, null, 6);
    }
}
