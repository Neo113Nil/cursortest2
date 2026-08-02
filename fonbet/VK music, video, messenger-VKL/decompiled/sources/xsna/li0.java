package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.util.SparseArray;
import com.ironsource.C4654y9;
import com.ironsource.K9;
import com.ironsource.Yd;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.catalog2.common.ui.mvp.holder.container.VkTabsVh;
import com.vk.clips.sdk.stats.pixels.models.AdStatPixel;
import com.vk.core.view.components.tabs.VkTabs;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.network.eventhub.api.Message;
import com.vk.network.eventhub.impl.EventHubServiceClient;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeoutException;
import one.video.calls.sdk_private.aF;
import ru.ok.android.webrtc.opengl.CallOpenGLContext;
import xsna.ub9;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class li0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ li0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        switch (this.b) {
            case 0:
                SparseArray sparseArray = (SparseArray) this.c;
                mi0 mi0Var = (mi0) this.d;
                bjk0 bjk0Var = new bjk0(sparseArray);
                while (bjk0Var.hasNext()) {
                    Iterator it = ((List) sparseArray.get(bjk0Var.nextInt())).iterator();
                    Object[] objArr = false;
                    while (it.hasNext()) {
                        Runnable remove = mi0Var.c.remove((AdStatPixel) it.next());
                        if (remove != null && objArr == false) {
                            mi0Var.b.removeCallbacks(remove);
                            objArr = true;
                        }
                    }
                }
                break;
            case 1:
                CallOpenGLContext.a((CallOpenGLContext) this.c, (CountDownLatch) this.d);
                break;
            case 2:
                DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) this.c;
                uek uekVar = (uek) this.d;
                String[] strArr = DebugDevSettingsFragment.t0;
                if (uekVar.b()) {
                    File file = uekVar.e;
                    enj.r(debugDevSettingsFragment.mo2getContext(), "Запись NetLog запущена в " + file.getAbsolutePath(), 0);
                    break;
                }
                break;
            case 3:
                sez sezVar = (sez) this.c;
                ub9.a aVar = (ub9.a) this.d;
                if (!sezVar.isDone()) {
                    aVar.d(new TimeoutException("Cannot complete surfaceList within 5000"));
                    sezVar.cancel(true);
                    break;
                }
                break;
            case 4:
                EventHubServiceClient eventHubServiceClient = (EventHubServiceClient) this.c;
                Message.b bVar = (Message.b) this.d;
                Throwable th = EventHubServiceClient.t;
                eventHubServiceClient.l(bVar);
                break;
            case 5:
                i9n0 i9n0Var = (i9n0) this.c;
                Context context = (Context) this.d;
                String a = context != null ? dgq0.a(context) : null;
                if (a == null) {
                    a = "";
                }
                i9n0Var.g(a);
                i9n0Var.a = 0L;
                i9n0Var.b = 0L;
                break;
            case 6:
                VkTabsVh vkTabsVh = (VkTabsVh) this.c;
                a7a a7aVar = (a7a) this.d;
                Rect rect = new Rect();
                com.vk.core.view.components.tabs.d a2 = vkTabsVh.a(a7aVar.b);
                if (a2 != null) {
                    f4m.d(rect, a2);
                    b7a b7aVar = vkTabsVh.d;
                    VkTabs vkTabs = vkTabsVh.j;
                    vkTabsVh.r = b7a.c(b7aVar, (vkTabs != null ? vkTabs : null).getContext(), rect, a7aVar.a, null, new spv0(i, vkTabsVh, a7aVar), 8);
                    break;
                }
                break;
            case 7:
                Yd.a((Yd) this.c, (IronSourceError) this.d);
                break;
            case 8:
                com.vungle.ads.internal.session.b.a((com.vungle.ads.internal.session.b) this.c, (String) this.d);
                break;
            case 9:
                ((cny0) this.c).f.a((List) this.d, aF.a);
                break;
            case 10:
                ((com.my.tracker.obfuscated.e0) this.c).a((Boolean) this.d);
                break;
            case 11:
                ((ru.mail.libverify.api.q) this.c).a((ru.mail.libverify.api.s) this.d);
                break;
            default:
                C4654y9.a((C4654y9) this.c, (K9) this.d);
                break;
        }
    }
}
