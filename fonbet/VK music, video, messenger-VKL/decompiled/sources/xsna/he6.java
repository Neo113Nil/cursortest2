package xsna;

import android.view.View;
import com.ironsource.C4254c3;
import com.ironsource.Ya;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.sdk.controller.v;
import com.unity3d.mediation.LevelPlayAdError;
import com.vk.push.core.ipc.BaseIPCClient;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import ru.ok.android.webrtc.PeerConnectionClient;
import ru.ok.android.webrtc.signaling.api.Signaling;
import ru.ok.android.webrtc.stat.NegotiationError;
import ru.ok.tensorflow.tflite.GpuCache;
import ru.ok.tensorflow.tflite.InterpreterWrapper;
import xsna.bm80;
import xsna.hul;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class he6 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ he6(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.jvm.internal.Lambda, xsna.izs] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                BaseIPCClient baseIPCClient = (BaseIPCClient) this.c;
                ?? r1 = (Lambda) this.d;
                synchronized (baseIPCClient.k) {
                    try {
                        Iterator it = baseIPCClient.k.iterator();
                        while (it.hasNext()) {
                            r1.invoke(it.next());
                        }
                        baseIPCClient.k.clear();
                        s3q0 s3q0Var = s3q0.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                Runnable runnable = (Runnable) this.c;
                hul.a aVar = (hul.a) this.d;
                try {
                    runnable.run();
                    aVar.a(null);
                    return;
                } catch (Exception e) {
                    aVar.b(e);
                    return;
                }
            case 2:
                ((InterpreterWrapper) this.c).lambda$initGPU$13((GpuCache) this.d);
                return;
            case 3:
                bm80 bm80Var = (bm80) this.c;
                bm80.a aVar2 = (bm80.a) this.d;
                if (epx.f(bm80Var.c, aVar2)) {
                    return;
                }
                bm80Var.d = bm80.a(aVar2);
                bm80Var.c = aVar2;
                bm80Var.b.invoke(Integer.valueOf(bm80Var.d.b));
                return;
            case 4:
                ((PeerConnectionClient) this.c).e((NegotiationError) this.d);
                return;
            case 5:
                ((Signaling) this.c).c((JSONObject) this.d, "signaling.listener.response.notification");
                return;
            case 6:
                androidx.constraintlayout.motion.widget.d dVar = (androidx.constraintlayout.motion.widget.d) this.c;
                View[] viewArr = (View[]) this.d;
                if (dVar.p != -1) {
                    for (View view : viewArr) {
                        view.setTag(dVar.p, Long.valueOf(System.nanoTime()));
                    }
                }
                if (dVar.q != -1) {
                    for (View view2 : viewArr) {
                        view2.setTag(dVar.q, null);
                    }
                    return;
                }
                return;
            case 7:
                Ya.a((LevelPlayAdError) this.c, (Ya) this.d);
                return;
            case 8:
                C4254c3.a((IronSourceError) this.c, (C4254c3) this.d);
                return;
            case 9:
                ((yads.cl) this.c).d((yads.pa0) this.d);
                return;
            case 10:
                ((com.mbridge.msdk.config.component.info.provider.subprovider.e) this.c).b((com.mbridge.msdk.config.component.info.provider.listener.a) this.d);
                return;
            case 11:
                ((izs) this.c).invoke((ArrayList) this.d);
                return;
            case 12:
                ((yads.gk3) this.c).b((String) this.d);
                return;
            default:
                ((v.s) this.c).m((String) this.d);
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ he6(BaseIPCClient baseIPCClient, izs izsVar) {
        this.b = 0;
        this.c = baseIPCClient;
        this.d = (Lambda) izsVar;
    }
}
