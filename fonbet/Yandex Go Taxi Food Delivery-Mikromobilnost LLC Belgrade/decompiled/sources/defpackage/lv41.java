package defpackage;

import com.ybsdk.feature.webview.internal.presentation.c;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final /* synthetic */ class lv41 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;

    public /* synthetic */ lv41(c cVar, int i) {
        this.a = i;
        this.b = cVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        r0 r0Var;
        Object value;
        r0 r0Var2;
        Object value2;
        iu41 iu41Var;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        c cVar = this.b;
        switch (i) {
            case 0:
                pz40 Y = cVar.Y();
                do {
                    r0Var = (r0) Y;
                    value = r0Var.getValue();
                } while (!r0Var.k(value, iu41.a((iu41) value, null, 0, true, null, 55)));
                return zy11Var;
            case 1:
                return ((iu41) cVar.X()).a;
            default:
                cVar.F.e(cVar.B, "WebView load deadline exceeded", true);
                pz40 Y2 = cVar.Y();
                do {
                    r0Var2 = (r0) Y2;
                    value2 = r0Var2.getValue();
                    iu41Var = (iu41) value2;
                } while (!r0Var2.k(value2, iu41.a(iu41Var, iu41Var.a.b(new Throwable("WebView load deadline exceeded"), null), 0, false, null, 62)));
                return zy11Var;
        }
    }
}
