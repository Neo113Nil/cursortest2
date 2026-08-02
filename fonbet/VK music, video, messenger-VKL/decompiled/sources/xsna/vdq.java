package xsna;

import android.os.Bundle;
import com.vk.auth.api.models.AuthResult;
import com.vk.log.L;
import com.vk.stories.StoriesVideoEncoder;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import xsna.yo60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class vdq implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vdq(com.vk.billing.h hVar, AtomicInteger atomicInteger) {
        this.b = 4;
        this.c = atomicInteger;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        Bundle bundle;
        switch (this.b) {
            case 0:
                ((bq60) this.c).a(yo60.e.a.a);
                break;
            case 1:
                q6r0.b((m6r0) this.c);
                break;
            case 2:
                ((h3t) this.c).e.d(false);
                break;
            case 3:
                z5w z5wVar = (z5w) this.c;
                z5wVar.c.c.e();
                c5w c5wVar = z5wVar.d;
                c5wVar.e = false;
                io.reactivex.rxjava3.disposables.c cVar = c5wVar.f;
                if (cVar != null) {
                    cVar.dispose();
                }
                io.reactivex.rxjava3.disposables.c cVar2 = c5wVar.g;
                if (cVar2 != null) {
                    cVar2.dispose();
                    break;
                }
                break;
            case 4:
                com.vk.billing.h.r((AtomicInteger) this.c, null);
                break;
            case 5:
                ((a2e0) this.c).a();
                break;
            case 6:
                com.vk.storycamera.upload.a aVar = (com.vk.storycamera.upload.a) this.c;
                L.l("Story watchdog");
                if (aVar.N != null) {
                    StoriesVideoEncoder.b bVar = aVar.N;
                    if (bVar != null) {
                        bVar.a();
                    }
                    aVar.s0(new TimeoutException("Story encoding timeout"));
                    break;
                }
                break;
            default:
                AuthResult authResult = (AuthResult) this.c;
                if (authResult != null && (bundle = authResult.r) != null && !sv1.r(bundle) && rte0.o(bundle) != null) {
                    i0q0.f(new cck0(bundle, 9));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ vdq(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
