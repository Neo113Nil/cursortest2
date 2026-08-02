package xsna;

import com.vk.biometrics.lock.impl.presentation.base.mvi.pin.a;
import com.vk.core.compose.component.alert.Alert$DismissReason;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import xsna.dbe0;
import xsna.f0k;
import xsna.o3v;
import xsna.xyj;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class w77 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ w77(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                this.c.invoke(new a.f(o3v.a.a));
                break;
            case 1:
                this.c.invoke(CommunityProfileAction.n.a.c.b);
                break;
            case 2:
                this.c.invoke(new xyj.i(false));
                break;
            case 3:
                this.c.invoke(dbe0.f.c.b);
                break;
            case 4:
                this.c.invoke(dbe0.a.b.b);
                break;
            case 5:
                this.c.invoke(f0k.d.a.b);
                break;
            case 6:
                this.c.invoke(dbe0.r.b.b);
                break;
            default:
                this.c.invoke(Alert$DismissReason.TOUCH_OUTSIDE);
                break;
        }
        return s3q0.a;
    }
}
