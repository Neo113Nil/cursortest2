package xsna;

import android.os.SystemClock;
import android.view.View;
import com.vk.im.ui.fragments.ImSelectContactsFragment;
import com.vk.navigation.NavigationDelegateActivity;
import com.vk.reefton.Reef;
import com.vk.reefton.ReefEvent;
import com.vungle.ads.internal.AnalyticsClient;
import io.appmetrica.analytics.impl.C4792e;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.time.Instant;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;
import ru.ok.android.externcalls.sdk.urlsharing.external.internal.listener.UrlSharingListenerManagerImpl;
import ru.ok.android.webrtc.PeerConnectionClient;
import ru.ok.tracer.opentelemetry.record.TracerOpenTelemetryRecorderProvider;
import xsna.lgg;
import xsna.r7v;
import xsna.rye;
import xsna.uni0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class xw1 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xw1(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        switch (this.b) {
            case 0:
                AnalyticsClient.a((com.vungle.ads.internal.executor.j) this.c);
                break;
            case 1:
                p52.N(((p52) this.c).getRoot());
                break;
            case 2:
                ((CallsAudioManagerV3Impl) this.c).syncWithSystemCommunicationDevice();
                break;
            case 3:
                rye.b bVar = (rye.b) this.c;
                try {
                    rye ryeVar = bVar.c;
                    if (ryeVar != null) {
                        ryeVar.dismiss();
                    }
                } catch (Exception unused) {
                }
                bVar.c = null;
                break;
            case 4:
                leg legVar = (leg) this.c;
                Boolean bool = Boolean.FALSE;
                legVar.getClass();
                legVar.d.invoke(bool);
                legVar.n(lgg.h.a);
                break;
            case 5:
                ((com.vk.catalog2.common.ui.holders.a) this.c).invoke();
                break;
            case 6:
                r7v r7vVar = (r7v) this.c;
                NavigationDelegateActivity navigationDelegateActivity = r7vVar.i;
                if (navigationDelegateActivity != null && (view = r7vVar.h) != null) {
                    r7v.a[] aVarArr = r7vVar.l;
                    int length = aVarArr.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            r7v.a aVar = aVarArr[i];
                            if (aVar.b(r7vVar.j)) {
                                aVar.a(navigationDelegateActivity, r7vVar.j, new td5(view, 11));
                            } else {
                                i++;
                            }
                        }
                    }
                }
                r7vVar.g = false;
                break;
            case 7:
                View view2 = ((ImSelectContactsFragment) this.c).X;
                if (view2 == null) {
                    view2 = null;
                }
                bwt0.p0(view2, false);
                break;
            case 8:
                ((ydz) this.c).d();
                break;
            case 9:
                ((gzs) this.c).invoke();
                break;
            case 10:
                PeerConnectionClient.a((RuntimeException) this.c);
                break;
            case 11:
                glg0.setRippleState$lambda$2((glg0) this.c);
                break;
            case 12:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.c;
                ro roVar = qni0.r;
                if (roVar != null) {
                    roVar.k("requesting time....");
                }
                gsv0 gsv0Var = qni0.g;
                if (gsv0Var != null) {
                    gsv0Var.a((uni0.a) ref$ObjectRef.element);
                    break;
                }
                break;
            case 13:
                Reef m = ((hwl0) this.c).m();
                if (m != null) {
                    m.a(new ReefEvent.y());
                    break;
                }
                break;
            case 14:
                yro0 yro0Var = (yro0) this.c;
                yro0Var.a.run();
                yro0Var.d = System.nanoTime();
                yro0Var.e = null;
                break;
            case 15:
                TracerOpenTelemetryRecorderProvider.scheduleExport$lambda$1$lambda$0((TracerOpenTelemetryRecorderProvider) this.c);
                break;
            case 16:
                com.vk.metrics.eventtracking.b.a.a((TimeoutException) this.c);
                break;
            case 17:
                UrlSharingListenerManagerImpl.saveUrlSharing$lambda$1((UrlSharingListenerManagerImpl) this.c);
                break;
            case 18:
                ((znq0) this.c).n.c();
                break;
            case 19:
                try {
                    ((gq4) this.c).run();
                    break;
                } catch (Throwable th) {
                    gu8.e(null, "Unexpected exception: " + th.getMessage() + "\nexception=" + gu8.b(th));
                    return;
                }
            case 20:
                jmy0 jmy0Var = (jmy0) this.c;
                while (!jmy0Var.f) {
                    try {
                        DatagramPacket datagramPacket = new DatagramPacket(new byte[1500], 1500);
                        try {
                            jmy0Var.a.receive(datagramPacket);
                            if (jmy0Var.c.test(datagramPacket)) {
                                jmy0Var.e.add(new imy0(datagramPacket, Instant.now()));
                            }
                        } catch (SocketException e) {
                            throw e;
                        } catch (SocketTimeoutException unused2) {
                        }
                    } catch (IOException e2) {
                        if (jmy0Var.f) {
                            return;
                        }
                        jmy0Var.b.accept(e2);
                        return;
                    } catch (Throwable th2) {
                        jmy0Var.b.accept(th2);
                        return;
                    }
                }
                break;
            case 21:
                ((C4792e) this.c).a();
                break;
            default:
                e1z0 e1z0Var = (e1z0) this.c;
                if (e1z0Var.o) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (e1z0Var.d(elapsedRealtime) != 1) {
                        e1z0Var.e();
                        break;
                    } else {
                        e1z0Var.a(elapsedRealtime);
                        break;
                    }
                }
                break;
        }
    }
}
