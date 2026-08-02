package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.AudioManager;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.google.common.util.concurrent.AtomicDouble;
import com.google.firebase.perf.util.Timer;
import com.ironsource.C4459nb;
import com.unity3d.services.UnityAdsConstants;
import com.vk.medianative.MediaNative;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import ru.mail.libverify.api.VerificationApi;
import ru.ok.android.webrtc.protocol.RtcTransport;
import ru.ok.android.webrtc.protocol.screenshare.send.ScreenshareSender;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.kwy0;
import xsna.wka;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class gq4 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ gq4(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                Context context = (Context) this.c;
                wwi wwiVar = (wwi) this.d;
                hq4.a = (AudioManager) context.getSystemService("audio");
                wwiVar.f();
                break;
            case 1:
                we9 we9Var = (we9) this.c;
                vfq0 vfq0Var = (vfq0) this.d;
                vfq0Var.toString();
                we9Var.toString();
                we9Var.b.d(vfq0Var.e() + vfq0Var.hashCode(), vfq0Var.k);
                we9Var.y();
                break;
            case 2:
                ArrayList arrayList = (ArrayList) this.c;
                wka wkaVar = (wka) this.d;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    wka.b bVar = (wka.b) it.next();
                    ArrayList<hla> arrayList2 = wkaVar.w;
                    hla hlaVar = bVar.a;
                    hla hlaVar2 = bVar.b;
                    if (hlaVar != null) {
                        View view = hlaVar.itemView;
                        ViewPropertyAnimator duration = view.animate().setDuration(wkaVar.f);
                        arrayList2.add(hlaVar);
                        duration.translationX(bVar.e - bVar.c);
                        duration.translationY(bVar.f - bVar.d);
                        duration.alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setListener(new yka(wkaVar, bVar, duration, view)).start();
                    }
                    if (hlaVar2 != null) {
                        View view2 = hlaVar2.itemView;
                        ViewPropertyAnimator animate = view2.animate();
                        arrayList2.add(hlaVar2);
                        animate.translationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(wkaVar.f).alpha(1.0f).setListener(new zka(wkaVar, bVar, animate, view2)).start();
                    }
                }
                arrayList.clear();
                wkaVar.s.remove(arrayList);
                break;
            case 3:
                z3k z3kVar = (z3k) this.c;
                com.google.firebase.perf.v1.d b = z3kVar.b((Timer) this.d);
                if (b != null) {
                    z3kVar.a.add(b);
                    break;
                }
                break;
            case 4:
                byte[] bArr = (byte[]) this.c;
                kew kewVar = (kew) this.d;
                if (bArr != null) {
                    File a = kewVar.a();
                    Bitmap k = kd7.k(BitmapFactory.decodeByteArray(bArr, 0, bArr.length, null), 180, true);
                    MediaNative.blurBitmap(k, k.getWidth() / 4);
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
                    kd7.l(k, a, 50);
                    break;
                }
                break;
            case 5:
                ((ScreenshareSender) this.c).a((RtcTransport) this.d);
                break;
            case 6:
                kwy0.a aVar = (kwy0.a) this.c;
                e5z0 e5z0Var = (e5z0) this.d;
                AtomicDouble atomicDouble = aVar.a;
                atomicDouble.getClass();
                float longBitsToDouble = (float) Double.longBitsToDouble(atomicDouble.b.getAndSet(Double.doubleToRawLongBits(ConnectivityTracker.DEFAULT_UPLINK_BITRATE)));
                if (b920.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, longBitsToDouble) == -1) {
                    try {
                        HashMap hashMap = new HashMap();
                        hashMap.put("duration", kwy0.n.format(longBitsToDouble));
                        hashMap.put("localTimestamp", Long.toString(SystemClock.elapsedRealtime()));
                        h8z0.f(e5z0Var, "playbackDuration", hashMap, 1);
                        break;
                    } catch (Throwable th) {
                        gu8.e("PlaybackTracker", "Unexpected exception: " + th.getMessage() + "\nexception=" + gu8.b(th));
                        return;
                    }
                }
                break;
            case 7:
                yads.jm.a((yads.jm) this.c, (yads.l4) this.d);
                break;
            case 8:
                C4459nb.a((C4459nb) this.c, (Map) this.d);
                break;
            default:
                ((ru.mail.libverify.api.q) this.c).b((VerificationApi.SmsCodeNotificationListener) this.d);
                break;
        }
    }
}
