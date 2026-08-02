package xsna;

import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import xsna.l2f;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class oa4 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ oa4(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                SchemeStat$TypeDevNullItem schemeStat$TypeDevNullItem = (SchemeStat$TypeDevNullItem) this.c;
                l5m l5mVar = new l5m(null, null, 3);
                l5mVar.g = schemeStat$TypeDevNullItem;
                l5mVar.q();
                break;
            case 1:
                xyb xybVar = (xyb) this.c;
                xybVar.t = null;
                azb azbVar = xybVar.A;
                if (azbVar != null) {
                    azbVar.b();
                    break;
                }
                break;
            case 2:
                ((l2f.a) this.c).a(Boolean.TRUE);
                break;
            case 3:
                x3s x3sVar = (x3s) this.c;
                x3sVar.c.a(cjq0.b);
                break;
            case 4:
                io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) this.c;
                if (cVar != null) {
                    cVar.dispose();
                    break;
                }
                break;
            case 5:
                ((ncl0) this.c).t(0);
                break;
            default:
                ((com.vk.voip.ui.hint.a) this.c).c();
                break;
        }
    }
}
