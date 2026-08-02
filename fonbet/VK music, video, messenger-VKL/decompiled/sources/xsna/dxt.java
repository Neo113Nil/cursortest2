package xsna;

import android.app.Activity;
import android.util.LruCache;
import android.view.View;
import com.vk.dto.specials.SpecialEvent;
import com.vk.dto.specials.SpecialEvents;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.music.player.api.di.PlayerUIComponent;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.webrtc.PeerConnection;
import ru.ok.android.webrtc.PeerConnectionClient;
import ru.ok.gl.effects.media.controller.video.ExtraVideoSupplier;
import xsna.c5j;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class dxt implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ dxt(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        if (r0.s <= 0) goto L15;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i = 0;
        switch (this.b) {
            case 0:
                fjk0 fjk0Var = (fjk0) this.c;
                SpecialEvents specialEvents = (SpecialEvents) this.d;
                fjk0Var.b = specialEvents;
                ((AtomicBoolean) fjk0Var.a).set(true);
                ArrayList<SpecialEvent> d = specialEvents.d();
                if (d != null && !d.isEmpty()) {
                    wmi0.a.a("special_events", specialEvents);
                    break;
                } else {
                    fjk0Var.a();
                    break;
                }
                break;
            case 1:
                Activity activity = (Activity) this.c;
                nau nauVar = (nau) this.d;
                com.google.android.gms.internal.consent_sdk.zzj zzb = com.google.android.gms.internal.consent_sdk.zza.zza(activity).zzb();
                c5j.a aVar = new c5j.a();
                aVar.a = "ca-app-pub-4106656545138592~9513992581";
                zzb.requestConsentInfoUpdate(activity, new c5j(aVar), new xm8(nauVar, zzb), new mau(nauVar, i));
                break;
            case 2:
                com.vk.media.ok.b bVar = (com.vk.media.ok.b) this.c;
                ExtraVideoSupplier extraVideoSupplier = (ExtraVideoSupplier) this.d;
                if (bVar.o()) {
                    if (bVar.u()) {
                        bVar.t = true;
                    }
                    extraVideoSupplier.setPlayWhenReady(false);
                    bVar.i.stop(bVar.A);
                    if (bVar.u()) {
                        extraVideoSupplier.restart(0L);
                        extraVideoSupplier.setPlayWhenReady(true);
                        break;
                    }
                }
                break;
            case 3:
                ((PeerConnectionClient) this.c).b((PeerConnection.IceGatheringState) this.d);
                break;
            case 4:
                zja0 zja0Var = (zja0) this.c;
                try {
                    zja0Var.b.updateViewLayout((View) this.d, zja0Var.c);
                    break;
                } catch (Throwable unused) {
                    return;
                }
            case 5:
                e2b0 e2b0Var = (e2b0) this.c;
                PlayerUIComponent playerUIComponent = e2b0Var.H;
                if (!((String) this.d).isEmpty()) {
                    e5b0 w4 = playerUIComponent.w4();
                    if (!w4.b) {
                        LruCache<UUID, mzp0> lruCache = rzp0.a;
                        mzp0 e = rzp0.e(w4.a);
                        if (e != null) {
                            e.c(true);
                            s3q0 s3q0Var = s3q0.a;
                            break;
                        }
                    }
                } else {
                    e5b0 w42 = playerUIComponent.w4();
                    if (!w42.b) {
                        LruCache<UUID, mzp0> lruCache2 = rzp0.a;
                        mzp0 e2 = rzp0.e(w42.a);
                        if (e2 != null) {
                            e2.f();
                            e2b0Var.I(e2.Y0());
                            s3q0 s3q0Var2 = s3q0.a;
                            break;
                        }
                    }
                }
                break;
            case 6:
                gd60.Z0(hd60.a(), ((m2m0) this.c).itemView.getContext(), ((StoriesContainer) this.d).Ab(), null, null, 12);
                break;
            case 7:
                ((yads.gk3) this.c).c((yads.pa0) this.d);
                break;
            case 8:
                w8z0 w8z0Var = (w8z0) this.c;
                s3z0 s3z0Var = (s3z0) this.d;
                w8z0Var.f.h(w8z0Var.g);
                w8z0Var.g(null, xla.a(iaz0.o), s3z0Var);
                break;
            default:
                pdz0 pdz0Var = (pdz0) this.c;
                List list = (List) this.d;
                List list2 = pdz0Var.f;
                int i2 = pdz0Var.q;
                if (i2 != 0) {
                    if (i2 == 1 && !pdz0Var.z() && list2.size() > pdz0Var.r) {
                        pdz0Var.s -= 200;
                    }
                    break;
                }
                if (list.size() > pdz0Var.r && pdz0Var.m != null) {
                    if (pdz0Var.z()) {
                        pdz0Var.m.b();
                    } else {
                        pdz0Var.g.a.p(pdz0Var.s);
                        pdz0Var.m.d();
                    }
                }
                int i3 = pdz0Var.q;
                if (i3 != 0) {
                    if (i3 == 1 && (pdz0Var.z() || list2.size() >= pdz0Var.r)) {
                        pdz0Var.n -= 200;
                    }
                    if (pdz0Var.n > 0) {
                        pdz0Var.s();
                        break;
                    }
                }
                pdz0Var.y();
                break;
        }
    }
}
