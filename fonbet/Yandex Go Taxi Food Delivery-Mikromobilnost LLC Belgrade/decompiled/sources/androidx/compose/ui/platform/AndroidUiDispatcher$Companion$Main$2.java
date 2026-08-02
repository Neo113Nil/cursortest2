package androidx.compose.ui.platform;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import defpackage.o400;
import defpackage.sjh;
import defpackage.sls;
import defpackage.tje;
import defpackage.uyj;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lfse;", "invoke", "()Lfse;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
/* loaded from: classes.dex */
final class AndroidUiDispatcher$Companion$Main$2 extends Lambda implements sls {
    public static final AndroidUiDispatcher$Companion$Main$2 w = new AndroidUiDispatcher$Companion$Main$2(0);

    @Override // defpackage.sls
    public final Object invoke() {
        Choreographer choreographer;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            choreographer = Choreographer.getInstance();
        } else {
            sjh sjhVar = uyj.a;
            choreographer = (Choreographer) tje.Y(o400.a, new AndroidUiDispatcher$Companion$Main$2$dispatcher$1());
        }
        f fVar = new f(choreographer, Handler.createAsync(Looper.getMainLooper()));
        return fVar.plus(fVar.D);
    }
}
