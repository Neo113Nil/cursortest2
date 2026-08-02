package xsna;

import android.app.job.JobParameters;
import android.content.Context;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.audio.b;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.vk.log.L;
import java.util.regex.Pattern;
import ru.ok.gleffects.impl.EffectNativeSink;
import xsna.h660;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class gc3 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ gc3(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                jc3 jc3Var = (jc3) obj2;
                jc3Var.h = false;
                jc3Var.f = System.currentTimeMillis();
                jc3Var.b((RecyclerView) obj);
                break;
            case 1:
                androidx.media3.exoplayer.audio.b bVar = ((b.a) obj2).b;
                String str = y2r0.a;
                bVar.o((AudioSink.a) obj);
                break;
            case 2:
                ((EffectNativeSink) obj2).lambda$submitTaskOnWorkerThread$13((Runnable) obj);
                break;
            case 3:
                int i2 = JobInfoSchedulerService.b;
                ((JobInfoSchedulerService) obj2).jobFinished((JobParameters) obj, false);
                break;
            default:
                h660.d dVar = (h660.d) obj;
                Pattern pattern = h660.a;
                WifiManager wifiManager = (WifiManager) ((Context) obj2).getApplicationContext().getSystemService("wifi");
                if (!wifiManager.isWifiEnabled()) {
                    L.p("Enabling wi-fi...");
                    if (!wifiManager.setWifiEnabled(true)) {
                        L.G("Wi-fi could not be enabled!");
                        break;
                    } else {
                        L.p("Wi-fi enabled");
                        int i3 = 0;
                        while (!wifiManager.isWifiEnabled()) {
                            if (i3 >= 10) {
                                L.p("Took too long to enable wi-fi, quitting");
                                break;
                            } else {
                                L.p("Still waiting for wi-fi to enable...");
                                try {
                                    Thread.sleep(1000L);
                                } catch (InterruptedException unused) {
                                }
                                i3++;
                            }
                        }
                    }
                }
                String str2 = dVar.b;
                String str3 = dVar.c;
                try {
                    h660.b.Companion.getClass();
                    h660.b a = h660.b.a.a(str2);
                    if (a != h660.b.NO_PASSWORD) {
                        if (str3 != null && str3.length() != 0) {
                            int i4 = h660.c.$EnumSwitchMapping$0[a.ordinal()];
                            if (i4 == 1) {
                                WifiConfiguration a2 = h660.a.a(dVar);
                                a2.wepKeys[0] = h660.a.b(str3, 10, 26, 58);
                                a2.wepTxKeyIndex = 0;
                                a2.allowedAuthAlgorithms.set(1);
                                a2.allowedKeyManagement.set(0);
                                a2.allowedGroupCiphers.set(2);
                                a2.allowedGroupCiphers.set(3);
                                a2.allowedGroupCiphers.set(0);
                                a2.allowedGroupCiphers.set(1);
                                h660.a.c(wifiManager, a2);
                                break;
                            } else if (i4 == 2) {
                                WifiConfiguration a3 = h660.a.a(dVar);
                                a3.preSharedKey = h660.a.b(str3, 64);
                                a3.allowedAuthAlgorithms.set(0);
                                a3.allowedProtocols.set(0);
                                a3.allowedProtocols.set(1);
                                a3.allowedKeyManagement.set(1);
                                a3.allowedKeyManagement.set(2);
                                a3.allowedPairwiseCiphers.set(1);
                                a3.allowedPairwiseCiphers.set(2);
                                a3.allowedGroupCiphers.set(2);
                                a3.allowedGroupCiphers.set(3);
                                h660.a.c(wifiManager, a3);
                                break;
                            } else if (i4 == 3) {
                                WifiConfiguration a4 = h660.a.a(dVar);
                                a4.preSharedKey = h660.a.b(str3, 64);
                                a4.allowedAuthAlgorithms.set(0);
                                a4.allowedProtocols.set(1);
                                a4.allowedKeyManagement.set(2);
                                a4.allowedPairwiseCiphers.set(1);
                                a4.allowedPairwiseCiphers.set(2);
                                a4.allowedGroupCiphers.set(2);
                                a4.allowedGroupCiphers.set(3);
                                a4.enterpriseConfig.setPassword(str3);
                                h660.a.c(wifiManager, a4);
                                break;
                            }
                        }
                    } else {
                        WifiConfiguration a5 = h660.a.a(dVar);
                        a5.allowedKeyManagement.set(0);
                        h660.a.c(wifiManager, a5);
                        break;
                    }
                } catch (IllegalArgumentException unused2) {
                    L.G("Bad network type");
                }
                break;
        }
    }
}
