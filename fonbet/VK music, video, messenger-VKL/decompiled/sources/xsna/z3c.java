package xsna;

import android.app.Activity;
import android.view.ViewGroup;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class z3c implements wzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ z3c(ViewGroup viewGroup, ComposeView composeView, w6s0 w6s0Var, Activity activity) {
        this.c = viewGroup;
        this.d = composeView;
        this.e = w6s0Var;
        this.f = activity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                i4c.e((v8s) this.c, (izs) this.d, (xvy) this.e, (q630) this.f, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            default:
                ViewGroup viewGroup = (ViewGroup) this.c;
                ComposeView composeView = (ComposeView) this.d;
                w6s0 w6s0Var = (w6s0) this.e;
                Activity activity = (Activity) this.f;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-316974444, intValue, -1, "com.vk.libvideo.bottomsheet.VideoBottomSheetRedesign.show.<anonymous>.<anonymous> (VideoBottomSheetRedesign.kt:61)");
                    }
                    Object x = aVar.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (x == c0012a) {
                        x = androidx.compose.runtime.k.b(Boolean.TRUE);
                        aVar.R(x);
                    }
                    wh50 wh50Var = (wh50) x;
                    boolean y = aVar.y(viewGroup) | aVar.y(composeView) | aVar.y(w6s0Var);
                    Object x2 = aVar.x();
                    if (y || x2 == c0012a) {
                        x2 = new uw5(wh50Var, viewGroup, composeView, w6s0Var);
                        aVar.R(x2);
                    }
                    gzs<s3q0> gzsVar = (gzs) x2;
                    w6s0Var.c = gzsVar;
                    if (((Boolean) wh50Var.getValue()).booleanValue()) {
                        aVar.K(1647907325);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1784036062, 0, -1, "com.vk.libvideo.bottomsheet.VideoBottomSheetRedesign.VideoBottomSheetScreen (VideoBottomSheetRedesign.kt:96)");
                        }
                        w6s0Var.c(w6s0Var.a.f || dhr0.M(), kai.c(-1445872855, new yu70(gzsVar, w6s0Var, activity), aVar), aVar, 48);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar.K(1644668910);
                    }
                    aVar.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ z3c(v8s v8sVar, izs izsVar, xvy xvyVar, q630 q630Var, int i) {
        this.c = v8sVar;
        this.d = izsVar;
        this.e = xvyVar;
        this.f = q630Var;
    }
}
