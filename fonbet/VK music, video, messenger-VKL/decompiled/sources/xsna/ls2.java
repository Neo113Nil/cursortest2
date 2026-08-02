package xsna;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.preference.Preference;
import com.vk.push.rustore.impl.RuStorePushService;
import com.vkontakte.android.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.chromium.net.impl.CronetBidirectionalStream;
import ru.ok.android.webrtc.Call;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.h0x;
import xsna.ikv0;
import xsna.l8n0;
import xsna.u3z0;
import xsna.usi0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class ls2 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ls2(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [androidx.coordinatorlayout.widget.CoordinatorLayout, xsna.wf] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        switch (this.b) {
            case 0:
                ((ms2) this.c).e.remove((CallParticipant.ParticipantId) this.d);
                return;
            case 1:
                ((Call) this.c).b((Runnable) this.d);
                return;
            case 2:
                CronetBidirectionalStream.lambda$postTaskToExecutor$0((String) this.c, (Runnable) this.d);
                return;
            case 3:
                v5m v5mVar = (v5m) this.c;
                Context context = (Context) this.d;
                if (v5mVar.a != null || context == null) {
                    return;
                }
                v5mVar.a = Preference.h(context, 0, "FirebasePerfSharedPrefs");
                return;
            case 4:
                ((ikv0.a) this.c).p(((Activity) this.d).getWindow());
                return;
            case 5:
                ((h0x.a) this.c).a((List) this.d);
                return;
            case 6:
                nx50 nx50Var = (nx50) this.c;
                String str = (String) this.d;
                hfl0 hfl0Var = nx50Var.o0;
                cnh cnhVar = new cnh(nx50Var, 28);
                ?? r0 = hfl0Var.c;
                if (r0 != 0) {
                    r0.y1(new ndg0(4, cnhVar, str));
                    return;
                }
                return;
            case 7:
                RuStorePushService ruStorePushService = (RuStorePushService) this.c;
                zge0.a.c(ruStorePushService, "rustore", ruStorePushService.l, (String) this.d);
                return;
            case 8:
                usi0 usi0Var = (usi0) this.c;
                cti0 cti0Var = (cti0) this.d;
                if (usi0Var instanceof usi0.a) {
                    ujp ujpVar = cti0Var.g;
                    usi0.a aVar = (usi0.a) usi0Var;
                    synchronized (ujpVar) {
                        ujpVar.a.c(aVar);
                    }
                    if (cti0Var.b()) {
                        return;
                    }
                    x570 x570Var = cti0Var.f;
                    ReentrantReadWriteLock reentrantReadWriteLock = x570Var.c;
                    ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
                    int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                    for (int i2 = 0; i2 < readHoldCount; i2++) {
                        readLock.unlock();
                    }
                    ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                    writeLock.lock();
                    try {
                        ArrayList arrayList = new ArrayList(x570Var.a());
                        Iterator it = arrayList.iterator();
                        int i3 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i3 = -1;
                            } else if (!epx.f(((usi0.a) it.next()).c().a, aVar.c().a)) {
                                i3++;
                            }
                        }
                        if (i3 != -1) {
                            arrayList.remove(i3);
                        }
                        x570Var.c(SignalingProtocol.KEY_REMOVE, arrayList);
                        s3q0 s3q0Var = s3q0.a;
                        return;
                    } finally {
                        while (i < readHoldCount) {
                            readLock.lock();
                            i++;
                        }
                        writeLock.unlock();
                    }
                }
                return;
            case 9:
                ArrayList arrayList2 = (ArrayList) this.c;
                l8n0 l8n0Var = (l8n0) this.d;
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    l8n0.b bVar = (l8n0.b) it2.next();
                    RecyclerView.e0 e0Var = bVar.a;
                    RecyclerView.e0 e0Var2 = bVar.a;
                    if (l8n0.J(e0Var)) {
                        int i4 = bVar.b;
                        int i5 = bVar.c;
                        int i6 = bVar.d;
                        int i7 = bVar.e;
                        long j = l8n0Var.s;
                        if (l8n0.I(e0Var2, i4, i5, i6, i7)) {
                            View view = e0Var2.itemView;
                            int i8 = i6 - i4;
                            int i9 = i7 - i5;
                            ViewPropertyAnimator animate = view.animate();
                            l8n0Var.p.add(e0Var2);
                            l8n0 l8n0Var2 = l8n0Var;
                            l8n0Var = l8n0Var2;
                            animate.alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(j / 2).setStartDelay(0L).setListener(new q8n0(l8n0Var2, e0Var2, i8, view, i9, j, animate));
                            animate.start();
                        } else {
                            l8n0Var.D(e0Var2, i4, i5, i6, i7);
                        }
                    } else {
                        l8n0Var.D(e0Var2, bVar.b, bVar.c, bVar.d, bVar.e);
                    }
                }
                arrayList2.clear();
                l8n0Var.m.remove(arrayList2);
                return;
            case 10:
                com.vk.attachpicker.screen.p pVar = (com.vk.attachpicker.screen.p) this.c;
                com.vk.attachpicker.screen.m mVar = (com.vk.attachpicker.screen.m) this.d;
                mVar.g.post(new drp0(mVar, R.string.picker_trim_video_length, true, pVar.M));
                return;
            case 11:
                ((com.mbridge.msdk.config.component.pipeline.a) this.c).d((com.mbridge.msdk.config.component.base.b) this.d);
                return;
            case 12:
                ((mky0) this.c).j.accept((zjy0) this.d);
                return;
            case 13:
                eqy0 eqy0Var = (eqy0) this.c;
                kry0 kry0Var = (kry0) this.d;
                while (i == 0) {
                    try {
                        uqy0 a = kry0Var.a();
                        if (a.a() == 10307) {
                            eqy0Var.d(r7.a, ((wpy0) a).b);
                            i = 1;
                        }
                    } catch (IOException unused) {
                        eqy0Var.d(0L, "");
                        return;
                    }
                }
                return;
            default:
                ((t8z0) this.c).accept((u3z0.a) this.d);
                return;
        }
    }
}
