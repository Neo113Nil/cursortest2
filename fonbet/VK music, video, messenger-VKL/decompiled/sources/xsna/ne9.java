package xsna;

import android.view.View;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.UnityAds;
import com.vk.documents.ui.fragments.DocumentsViewFragment;
import com.vk.voip.OKVoipEngine;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.Ref$IntRef;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.audio.NoiseSuppressionManager;
import ru.ok.android.webrtc.SharedLocalMediaStreamSource;
import ru.ok.android.webrtc.SharedPeerConnectionFactory;
import xsna.kk9;
import xsna.l570;
import xsna.ub9;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class ne9 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ne9(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00df A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Throwable th;
        boolean z;
        boolean z2;
        final l570.b open;
        final Ref$IntRef ref$IntRef;
        final Ref$IntRef ref$IntRef2;
        final Ref$IntRef ref$IntRef3;
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((re9) obj2).i.g((ub9.a) obj);
                return;
            case 1:
                ((kk9.d) obj2).c((jhu0) obj);
                return;
            case 2:
                ((View) obj2).postDelayed(new q44((syc) obj, 3), 0L);
                return;
            case 3:
                int i2 = DocumentsViewFragment.x0;
                ((DocumentsViewFragment) obj2).wo((View) obj);
                return;
            case 4:
                final l570.a aVar = (l570.a) obj2;
                final OKVoipEngine oKVoipEngine = (OKVoipEngine) ((com.vk.voip.b) obj);
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                try {
                    open = aVar.open();
                } catch (Exception e) {
                    e = e;
                    z2 = false;
                } catch (Throwable th2) {
                    th = th2;
                    z = false;
                }
                if (open == null) {
                    return;
                }
                String str = open.b;
                com.vk.voip.ui.c.b.getClass();
                String str2 = (String) ((m570) com.vk.voip.ui.c.S()).b.invoke();
                try {
                    try {
                        ref$IntRef = new Ref$IntRef();
                        ref$IntRef.element = 13;
                        ref$IntRef2 = new Ref$IntRef();
                        ref$IntRef2.element = 25;
                        ref$IntRef3 = new Ref$IntRef();
                        ref$IntRef3.element = 600;
                    } catch (Exception e2) {
                        e = e2;
                        z2 = true;
                        try {
                            com.vk.metrics.eventtracking.b.a.a(e);
                            if (!z2) {
                                return;
                            }
                            aVar.close();
                            return;
                        } catch (Throwable th3) {
                            z = z2;
                            th = th3;
                            if (z) {
                                throw th;
                            }
                            try {
                                aVar.close();
                                throw th;
                            } catch (Exception e3) {
                                com.vk.metrics.eventtracking.b.a.a(e3);
                                throw th;
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        z = true;
                        if (z) {
                        }
                    }
                    if (str2 != null && str2.length() != 0) {
                        JSONObject jSONObject = new JSONObject(str2);
                        ref$IntRef.element = jSONObject.optInt("timeLimitMillis", 13);
                        ref$IntRef2.element = jSONObject.optInt("stutterCountMillis", 25);
                        ref$IntRef3.element = jSONObject.optInt("timeframeMillis", 600);
                        pro0.f(new gzs() { // from class: xsna.n570
                            @Override // xsna.gzs
                            public final Object invoke() {
                                NoiseSuppressionManager noiseSuppressionManager;
                                String absolutePath = open.a.getAbsolutePath();
                                l570.a aVar2 = aVar;
                                int U1 = aVar2.U1();
                                int S0 = aVar2.S0();
                                int E2 = aVar2.E2();
                                int i3 = ref$IntRef.element;
                                int i4 = ref$IntRef2.element;
                                int i5 = ref$IntRef3.element;
                                com.vk.voip.ui.c.b.getClass();
                                boolean booleanValue = ((Boolean) ((m570) com.vk.voip.ui.c.S()).c.invoke()).booleanValue();
                                OKVoipEngine.this.getClass();
                                Conversation conversation = OKVoipEngine.E.getConversation();
                                if (conversation != null && (noiseSuppressionManager = conversation.getNoiseSuppressionManager()) != null) {
                                    noiseSuppressionManager.setNoiseSuppressionParams(new ko70(false, true, true, E2, absolutePath, U1, S0, i3, i4, i5, booleanValue));
                                }
                                countDownLatch.countDown();
                                return s3q0.a;
                            }
                        });
                        countDownLatch.await();
                        aVar.close();
                        return;
                    }
                    aVar.close();
                    return;
                } catch (Exception e4) {
                    com.vk.metrics.eventtracking.b.a.a(e4);
                    return;
                }
                if (str.length() != 0) {
                    JSONObject jSONObject2 = new JSONObject(str);
                    ref$IntRef.element = jSONObject2.optInt("timeLimitMillis", 13);
                    ref$IntRef2.element = jSONObject2.optInt("stutterCountMillis", 25);
                    ref$IntRef3.element = jSONObject2.optInt("timeframeMillis", 600);
                }
                pro0.f(new gzs() { // from class: xsna.n570
                    @Override // xsna.gzs
                    public final Object invoke() {
                        NoiseSuppressionManager noiseSuppressionManager;
                        String absolutePath = open.a.getAbsolutePath();
                        l570.a aVar2 = aVar;
                        int U1 = aVar2.U1();
                        int S0 = aVar2.S0();
                        int E2 = aVar2.E2();
                        int i3 = ref$IntRef.element;
                        int i4 = ref$IntRef2.element;
                        int i5 = ref$IntRef3.element;
                        com.vk.voip.ui.c.b.getClass();
                        boolean booleanValue = ((Boolean) ((m570) com.vk.voip.ui.c.S()).c.invoke()).booleanValue();
                        OKVoipEngine.this.getClass();
                        Conversation conversation = OKVoipEngine.E.getConversation();
                        if (conversation != null && (noiseSuppressionManager = conversation.getNoiseSuppressionManager()) != null) {
                            noiseSuppressionManager.setNoiseSuppressionParams(new ko70(false, true, true, E2, absolutePath, U1, S0, i3, i4, i5, booleanValue));
                        }
                        countDownLatch.countDown();
                        return s3q0.a;
                    }
                });
                countDownLatch.await();
                break;
            case 5:
                ((SharedPeerConnectionFactory) obj2).a((SharedLocalMediaStreamSource) obj);
                return;
            default:
                UnityAds.initialize$lambda$9$lambda$8$lambda$7((IUnityAdsInitializationListener) obj2, (Throwable) obj);
                return;
        }
    }
}
