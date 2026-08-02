package xsna;

import android.graphics.RectF;
import android.view.View;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogRootVh;
import com.vk.core.view.components.formitem.VkFormField;
import com.vk.libvideo.api.di.VkVideoPromoComponent;
import com.vk.stories.design.view.stats.tabs.stickers.mvi.StoryStatisticsStickersFragment;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.video.growth.api.di.VideoGrowthComponent;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.video.ui.discovery.minimizable.c;
import com.vk.voip.ui.media_request.VoipEnableOwnMicAndVideoRequestedDialog;
import com.vk.voip.ui.qr.ui.VoipQrCodeScannerFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import org.json.JSONObject;
import xsna.b78;
import xsna.j9d0;
import xsna.lne0;
import xsna.sx40;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class mll0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mll0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = null;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                Iterator<T> it = ((xvy) obj2).j().f().iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (epx.f(((xuy) next).getKey(), "header")) {
                            obj = next;
                        }
                    }
                }
                xuy xuyVar = (xuy) obj;
                break;
            case 1:
                LinkedHashSet linkedHashSet = ((j0m0) obj2).k;
                ArrayList arrayList = new ArrayList(c5g.u(linkedHashSet, 10));
                Iterator it2 = linkedHashSet.iterator();
                while (it2.hasNext()) {
                    ((g1m0) it2.next()).getClass();
                    arrayList.add(0L);
                }
                break;
            case 2:
                int i2 = hem0.y1;
                break;
            case 3:
                int i3 = StoryStatisticsStickersFragment.X;
                break;
            case 4:
                plm0 plm0Var = (plm0) obj2;
                break;
            case 5:
                ((uvm0) obj2).f = null;
                break;
            case 6:
                break;
            case 7:
                wmo0 wmo0Var = (wmo0) obj2;
                wmo0Var.getClass();
                break;
            case 8:
                ((com.vk.movika.sdk.base.ui.r) obj2).invoke();
                break;
            case 9:
                RectF rectF = new RectF();
                ((r9r0) obj2).a.computeBounds(rectF, true);
                break;
            case 10:
                ((kfr0) obj2).c.n(JsApiMethodType.RECOMMEND_APP, new JSONObject().put("result", true));
                break;
            case 11:
                ((u4a) obj2).b.getClass();
                break;
            case 12:
                int i4 = VideoCatalogRootVh.M0;
                break;
            case 13:
                break;
            case 14:
                com.vk.video.ui.discovery.minimizable.g gVar = (com.vk.video.ui.discovery.minimizable.g) obj2;
                zst0 fc = gVar.p.fc();
                fc.a(new ece0(gVar, 24));
                break;
            case 15:
                VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = (VideoMinimizableDiscoveryFragment) obj2;
                int i5 = VideoMinimizableDiscoveryFragment.p1;
                ((VideoGrowthComponent) videoMinimizableDiscoveryFragment.ko().f.getValue()).Z7().d(((VkVideoPromoComponent) videoMinimizableDiscoveryFragment.ko().D.getValue()).Ka().d().f);
                xn50.a.c(videoMinimizableDiscoveryFragment, c.d1.b);
                break;
            case 16:
                ((b78.i) obj2).a().invoke(sx40.c.b);
                break;
            case 17:
                ggu0 ggu0Var = (ggu0) obj2;
                break;
            case 18:
                List<Class<? extends View>> list = VkFormField.C;
                break;
            case 19:
                break;
            case 20:
                break;
            case 21:
                VoipEnableOwnMicAndVideoRequestedDialog voipEnableOwnMicAndVideoRequestedDialog = (VoipEnableOwnMicAndVideoRequestedDialog) obj2;
                voipEnableOwnMicAndVideoRequestedDialog.b.invoke(VoipEnableOwnMicAndVideoRequestedDialog.RequestMedia.MICROPHONE);
                dw20 dw20Var = voipEnableOwnMicAndVideoRequestedDialog.c;
                if (dw20Var != null) {
                    dw20Var.hide();
                }
                break;
            case 22:
                int i6 = VoipQrCodeScannerFragment.W;
                ((VoipQrCodeScannerFragment) obj2).S.onNext(lne0.a.a);
                break;
            default:
                ((glx0) obj2).e(j9d0.i.a);
                break;
        }
        return s3q0.a;
    }
}
