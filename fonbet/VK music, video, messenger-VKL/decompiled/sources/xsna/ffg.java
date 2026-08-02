package xsna;

import android.content.Context;
import com.vk.api.sdk.exceptions.VKApiExecutionException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class ffg implements izs {
    public final /* synthetic */ lfg b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ ffg(lfg lfgVar, boolean z, boolean z2) {
        this.b = lfgVar;
        this.c = z;
        this.d = z2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        lfg lfgVar = this.b;
        if (lfgVar.a6() == 1) {
            lfgVar.H8(th, this.c, this.d);
        } else if (th instanceof VKApiExecutionException) {
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            j03.i(context, (VKApiExecutionException) th);
        }
        return s3q0.a;
    }
}
