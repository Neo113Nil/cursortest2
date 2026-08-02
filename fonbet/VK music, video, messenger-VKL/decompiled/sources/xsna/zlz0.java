package xsna;

import android.os.Looper;
import android.os.Message;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes.dex */
public final class zlz0 extends com.google.android.gms.internal.base.zar {
    public final /* synthetic */ amz0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zlz0(amz0 amz0Var, Looper looper) {
        super(looper);
        this.a = amz0Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            ((ylz0) message.obj).b(this.a);
        } else {
            if (i == 2) {
                throw ((RuntimeException) message.obj);
            }
            new StringBuilder(String.valueOf(i).length() + 20);
        }
    }
}
