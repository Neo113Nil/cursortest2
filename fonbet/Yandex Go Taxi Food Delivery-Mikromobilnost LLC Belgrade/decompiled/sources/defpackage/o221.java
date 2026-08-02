package defpackage;

import android.os.Handler;
import com.yandex.messenger.websdk.api.Cancelable;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import kotlin.collections.a;

/* loaded from: classes15.dex */
public final /* synthetic */ class o221 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ yx1 b;
    public final /* synthetic */ s221 c;

    public /* synthetic */ o221(yx1 yx1Var, s221 s221Var, int i) {
        this.a = i;
        this.b = yx1Var;
        this.c = s221Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                yx1 yx1Var = this.b;
                s221 s221Var = this.c;
                Throwable th = (Throwable) obj;
                LinkedHashMap linkedHashMap = (LinkedHashMap) yx1Var.g;
                Cancelable cancelable = (Cancelable) linkedHashMap.get(s221Var);
                if (cancelable != null) {
                    linkedHashMap.remove(s221Var);
                    cancelable.cancel();
                }
                CancellationException cancellationException = new CancellationException(th.toString());
                cancellationException.initCause(th);
                u221 u221Var = (u221) ((LinkedHashMap) yx1Var.e).get(s221Var);
                if (u221Var != null) {
                    synchronized (u221Var) {
                        for (t221 t221Var : a.J0(u221Var.a)) {
                            Handler handler = t221Var.c;
                            if (handler != null) {
                                handler.post(new t601(13, t221Var, cancellationException));
                            }
                            t221Var.c = null;
                        }
                    }
                }
                return zy11.a;
            default:
                this.b.e(this.c, (w221) obj);
                return zy11.a;
        }
    }
}
