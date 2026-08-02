package xsna;

import android.view.View;
import android.widget.FrameLayout;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.im.engine.models.messages.MsgSendSource;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import java.util.ArrayList;
import java.util.List;
import xsna.djc;
import xsna.o9t;
import xsna.st;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class itb implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ itb(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00df, code lost:
    
        if (r0 == null) goto L37;
     */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        djc djcVar;
        switch (this.b) {
            case 0:
                ((ktb) this.c).d(250, (ArrayList) this.d, (List) this.e);
                break;
            case 1:
                tt ttVar = (tt) this.c;
                nkx0 nkx0Var = (nkx0) this.d;
                izs izsVar = (izs) this.e;
                st stVar = ttVar.c;
                if (stVar != null) {
                    String str = stVar.d;
                    int i = st.a.$EnumSwitchMapping$0[stVar.a.ordinal()];
                    if (i == 1) {
                        String str2 = stVar.c;
                        if (str2 == null) {
                            str2 = "";
                        }
                        djcVar = new djc.e(str2, str);
                        break;
                    } else if (i == 2) {
                        if (nkx0Var == null) {
                            djcVar = djc.d.a;
                            break;
                        } else {
                            djcVar = new djc.g(str, nkx0Var);
                            break;
                        }
                    } else {
                        djcVar = djc.d.a;
                        break;
                    }
                }
                djcVar = djc.d.a;
                izsVar.invoke(new o9t.m(djcVar));
                break;
            default:
                tha0 tha0Var = (tha0) this.c;
                String str3 = (String) this.d;
                MsgSendSource.b bVar = (MsgSendSource.b) this.e;
                tha0Var.p = new io.reactivex.rxjava3.disposables.b();
                tha0Var.r.d();
                xia0 X0 = tha0Var.X0();
                d98 d98Var = new d98(X0.a, new aja0(X0));
                X0.l = d98Var;
                d98Var.d();
                zyz zyzVar = new zyz(tha0Var.i, tha0Var.m, tha0Var.X0(), str3, bVar, tha0Var.l);
                View X02 = zyzVar.h().X0(tha0Var.X0().e);
                zyzVar.h().c1();
                if (tha0Var.s.c()) {
                    tha0Var.s.a();
                }
                xia0 X03 = tha0Var.X0();
                FrameLayout frameLayout = X03.e;
                if (frameLayout != null) {
                    frameLayout.removeAllViews();
                }
                FrameLayout frameLayout2 = X03.e;
                if (frameLayout2 != null) {
                    frameLayout2.addView(X02);
                }
                if (X03.m == null) {
                    X03.p = X03.b.o0(X03.p);
                    d98 d98Var2 = X03.l;
                    if (d98Var2 != null) {
                        d98Var2.e(false);
                    }
                    X03.n = null;
                }
                tha0Var.o.c(new UiTrackingScreen(MobileOfficialAppsCoreNavStat$EventScreen.IM_ATTACHES_LOCATION), true);
                tha0Var.s = zyzVar;
                break;
        }
        return s3q0.a;
    }
}
