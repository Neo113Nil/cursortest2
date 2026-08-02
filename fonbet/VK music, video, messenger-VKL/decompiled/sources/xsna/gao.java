package xsna;

import android.webkit.WebView;
import androidx.media3.exoplayer.offline.DownloadHelper;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.serialization.json.JsonObject;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class gao implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ gao(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                hao haoVar = (hao) this.c;
                CountDownLatch countDownLatch = (CountDownLatch) this.d;
                AtomicReference atomicReference = (AtomicReference) this.e;
                AtomicReference atomicReference2 = (AtomicReference) this.f;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.g;
                try {
                    DownloadHelper i = haoVar.i();
                    haoVar.s = i;
                    i.j(new iao(atomicBoolean, haoVar, atomicReference, atomicReference2, countDownLatch));
                    break;
                } catch (Exception e) {
                    atomicReference2.set(e);
                    countDownLatch.countDown();
                    return;
                }
            default:
                com.vungle.ads.internal.ui.z.a((com.vungle.ads.internal.ui.view.o) this.c, (String) this.d, (JsonObject) this.e, (com.vungle.ads.internal.ui.z) this.f, (WebView) this.g);
                break;
        }
    }
}
