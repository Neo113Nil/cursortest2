package xsna;

import android.content.Context;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.ironsource.Be;
import com.ironsource.C4278d9;
import com.ironsource.C4462ne;
import com.ironsource.C4498pe;
import com.ironsource.Ce;
import com.ironsource.InterfaceC4569te;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.UnityAds;
import java.util.Iterator;
import kotlin.Result;
import ru.ok.android.webrtc.protocol.RtcCommandExecutor;
import ru.ok.android.webrtc.protocol.RtcFormat;
import xsna.iog0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class wv6 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ wv6(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object failure;
        switch (this.b) {
            case 0:
                Be.d.a((Be) this.c, (Context) this.d, (C4462ne) this.e);
                break;
            case 1:
                Ce.a.a((InterfaceC4569te) this.c, (C4498pe) this.d, (C4278d9) this.e);
                break;
            case 2:
                iog0.a aVar = (iog0.a) this.c;
                n220 n220Var = (n220) this.d;
                ppj0 ppj0Var = (ppj0) this.e;
                try {
                    failure = aVar.l();
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                if (failure instanceof Result.Failure) {
                    failure = null;
                }
                kcl kclVar = (uvf) failure;
                if (kclVar == null) {
                    aVar.j(null, false, null);
                    break;
                } else {
                    n220Var.c(ppj0Var, kclVar);
                    aVar.j(kclVar, true, null);
                    break;
                }
            case 3:
                ((IUnityAdsInitializationListener) this.c).onInitializationFailed((UnityAds.UnityAdsInitializationError) this.d, (String) this.e);
                break;
            case 4:
                ((SessionManager) this.c).lambda$setApplicationContext$0((Context) this.d, (PerfSession) this.e);
                break;
            default:
                zwy0 zwy0Var = (zwy0) this.c;
                byte[] bArr = (byte[]) this.d;
                RtcFormat rtcFormat = (RtcFormat) this.e;
                Iterator it = zwy0Var.b.iterator();
                while (it.hasNext()) {
                    try {
                        ((RtcCommandExecutor.Listener) it.next()).onRtcDataSent(bArr, rtcFormat);
                    } catch (Throwable th2) {
                        zwy0Var.a.reportException("CallsListeners", "rtc.command.handle.listeners.ondatasend", th2);
                    }
                }
                break;
        }
    }
}
