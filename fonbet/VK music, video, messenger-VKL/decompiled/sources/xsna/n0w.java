package xsna;

import android.content.Context;
import com.vk.log.L;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class n0w implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Context c;

    public /* synthetic */ n0w(Context context, int i) {
        this.b = i;
        this.c = context;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                enj.q(R.string.vkim_error_internal, 0, this.c);
                break;
            case 1:
                j03.j(this.c, (Throwable) obj);
                break;
            case 2:
                huh0.b(this.c);
                break;
            default:
                Throwable th = (Throwable) obj;
                L.i(th);
                cvk.w(j03.g(this.c, th, R.string.error), false);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ n0w(huh0 huh0Var, Context context) {
        this.b = 2;
        this.c = context;
    }
}
