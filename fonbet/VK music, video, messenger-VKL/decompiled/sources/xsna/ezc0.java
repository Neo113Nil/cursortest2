package xsna;

import com.vk.catalog.mvi.block.impl.slider.SliderView;
import com.vk.sunrise.SunState;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class ezc0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ezc0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                Boolean invoke = ((kzc0) this.c).c.invoke();
                invoke.booleanValue();
                return invoke;
            case 1:
                y0i0 y0i0Var = (y0i0) this.c;
                boolean z = ((p680) obj).c;
                a1w a1wVar = y0i0Var.a;
                if (z) {
                    a1wVar.z(y0i0Var.c, "AdminImEngineSyncHelper: restore after invalidate (changeConfig)");
                } else {
                    a1wVar.A("AdminImEngineSyncHelper: no credentials are provided");
                }
                return s3q0.a;
            case 2:
                return new SliderView.a(((cg50) this.c).f(), (b2a) obj);
            default:
                ((z6n0) this.c).a = (SunState) obj;
                return s3q0.a;
        }
    }
}
