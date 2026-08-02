package xsna;

import android.content.Context;
import com.vk.log.L;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class vtc0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Context c;

    public /* synthetic */ vtc0(Context context, int i) {
        this.b = i;
        this.c = context;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                j03.j(this.c, (Throwable) obj);
                break;
            case 1:
                j03.j(this.c, (Throwable) obj);
                break;
            default:
                Throwable th = (Throwable) obj;
                enj.r(this.c, "Trace collect failed: " + th.getMessage(), 0);
                L.i(th);
                break;
        }
        return s3q0.a;
    }
}
