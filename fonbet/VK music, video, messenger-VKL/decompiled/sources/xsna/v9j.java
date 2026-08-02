package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.ironsource.C4218a3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.billing.StorePurchasesManager;
import com.vk.contactssync.api.di.ContactSyncColdStartModalComponent;
import com.vk.core.apps.BuildInfo;
import com.vk.core.preference.Preference;
import com.vk.fullscreen.promo.core.PromoSessionInfo;
import com.vk.newsfeed.impl.fragments.PostViewFragment;
import com.vk.newsfeed.impl.stats.PostViewFragmentTimeSpentTracker;
import com.vk.permission.PermissionHelper;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import one.video.calls.sdk_private.bE;
import one.video.calls.sdk_private.bF;
import ru.ok.android.webrtc.PeerConnectionClient;
import ru.ok.android.webrtc.protocol.RtcTransport;
import ru.ok.android.webrtc.protocol.impl.commands.RtcCommandExecutorImpl;
import ru.ok.android.webrtc.stat.NegotiationError;
import xsna.hul;
import xsna.jpx0;
import xsna.ky6;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class v9j implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ v9j(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        StorePurchasesManager.BillingAvailabilityStatus billingAvailabilityStatus;
        switch (this.b) {
            case 0:
                x9j x9jVar = (x9j) this.c;
                PromoSessionInfo promoSessionInfo = (PromoSessionInfo) this.d;
                c63 c63Var = c63.a;
                Activity b = c63.b();
                if (b == null) {
                    c63.a(new y9j(x9jVar, promoSessionInfo));
                    return;
                }
                PermissionHelper.a.getClass();
                boolean n = PermissionHelper.n(b);
                if (n) {
                    x9j.e = true;
                    ky6.a aVar = (ky6.a) Preference.j().edit();
                    aVar.putInt("__contact_sync_cold_start_any_modal_version__", BuildInfo.e);
                    aVar.apply();
                } else {
                    x9j.d = true;
                    ky6.a aVar2 = (ky6.a) Preference.j().edit();
                    aVar2.putInt("__contact_sync_cold_start_any_modal_version__", BuildInfo.e);
                    aVar2.apply();
                }
                ((ContactSyncColdStartModalComponent) m7m.a(b).a(fpf0.a(ContactSyncColdStartModalComponent.class))).Qd().a(b, new z9j(n, x9jVar, promoSessionInfo), new aaj(n, x9jVar, promoSessionInfo), new baj(n, x9jVar, promoSessionInfo));
                return;
            case 1:
                Runnable runnable = (Runnable) this.c;
                hul.a aVar3 = (hul.a) this.d;
                try {
                    runnable.run();
                    return;
                } catch (Exception e) {
                    aVar3.b(e);
                    throw e;
                }
            case 2:
                io.reactivex.rxjava3.subjects.f fVar = (io.reactivex.rxjava3.subjects.f) this.c;
                Context context = (Context) this.d;
                if (o27.d.d(false)) {
                    billingAvailabilityStatus = StorePurchasesManager.BillingAvailabilityStatus.READY;
                } else {
                    billingAvailabilityStatus = context.getPackageManager().resolveActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("market://details?id=")), 64) != null ? StorePurchasesManager.BillingAvailabilityStatus.NOT_AUTHORIZED : StorePurchasesManager.BillingAvailabilityStatus.NOT_AVAILABLE;
                }
                fVar.onNext(billingAvailabilityStatus);
                fVar.onComplete();
                return;
            case 3:
                p600 p600Var = (p600) this.c;
                p600Var.c.setValue(p600Var, p600.e[0], this.d);
                return;
            case 4:
                ((PeerConnectionClient) this.c).d((NegotiationError) this.d);
                return;
            case 5:
                PostViewFragment postViewFragment = (PostViewFragment) this.c;
                RecyclerView recyclerView = (RecyclerView) this.d;
                String[] strArr = PostViewFragment.T0;
                PostViewFragmentTimeSpentTracker Do = postViewFragment.Do();
                if (Do != null) {
                    Do.a(recyclerView);
                    return;
                }
                return;
            case 6:
                ((RtcCommandExecutorImpl) this.c).a((RtcTransport) this.d);
                return;
            case 7:
                xon0 xon0Var = (xon0) this.c;
                von0 von0Var = (von0) this.d;
                hs9 hs9Var = xon0Var.b;
                synchronized (hs9Var.b) {
                    hs9Var.c.remove(xon0Var);
                    hs9Var.d.remove(xon0Var);
                }
                xon0Var.e.i(von0Var);
                return;
            case 8:
                jpx0 jpx0Var = (jpx0) this.c;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.d;
                jpx0.a aVar4 = jpx0Var.a;
                aVar4.getClass();
                if (atomicBoolean.get()) {
                    new Thread(new qye(14, aVar4, atomicBoolean), "ExoPlayer:WifiLockManager").start();
                    return;
                }
                return;
            case 9:
                C4218a3.a((C4218a3) this.c, (IronSourceError) this.d);
                return;
            default:
                one.video.calls.sdk_private.a0 a0Var = (one.video.calls.sdk_private.a0) this.c;
                sdy0 sdy0Var = (sdy0) this.d;
                if (sdy0Var.d()) {
                    try {
                        Consumer consumer = (Consumer) a0Var.c.get(Long.valueOf(alk.k(sdy0Var.a())));
                        if (consumer == null) {
                            sdy0Var.a(259L);
                            return;
                        }
                        dky0 a = sdy0Var.a();
                        yry0 yry0Var = new yry0();
                        yry0Var.a = sdy0Var;
                        yry0Var.b = a;
                        consumer.accept(yry0Var);
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                }
                tpy0 tpy0Var = a0Var.k;
                if (tpy0Var == null) {
                    bE bEVar = a0Var.b;
                    bEVar.e(259L, bF.d.b, null);
                    bEVar.r().h();
                    return;
                } else {
                    dky0 a2 = sdy0Var.a();
                    yry0 yry0Var2 = new yry0();
                    yry0Var2.a = sdy0Var;
                    yry0Var2.b = a2;
                    tpy0Var.accept(yry0Var2);
                    return;
                }
        }
    }
}
