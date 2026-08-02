package xsna;

import com.vk.core.utils.newtork.d;
import java.util.List;
import xsna.oqo0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class vdj implements izs {
    public final /* synthetic */ int b;

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                List list = (List) obj;
                boolean z = false;
                Boolean bool = (Boolean) j5g.b0(0, list);
                Boolean bool2 = (Boolean) j5g.b0(1, list);
                if (epx.f(bool, Boolean.TRUE) && epx.f(bool2, Boolean.FALSE)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                return (d.a) ((com.vk.core.utils.newtork.d) obj);
            default:
                com.vk.metrics.eventtracking.b.a.a(new oqo0.a((Throwable) obj));
                return s3q0.a;
        }
    }
}
