package xsna;

import android.content.Context;
import com.vk.external.miniapp.net.ad.AdSlotSkipReason;
import com.vk.external.miniapp.net.ad.AdvertisementConfig;
import com.vk.external.miniapp.net.app.WebAdConfig;
import com.vk.superapp.advertisement.api.dto.BannerAdUiData;
import com.vk.superapp.advertisement.requestsanalytics.AdRequestPurpose;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.j11;
import xsna.mo6;

/* compiled from: SingleStickyBannerAdRequest.kt */
/* loaded from: classes6.dex */
public final class ewj0 extends mo6 {
    /* JADX WARN: Removed duplicated region for block: B:38:0x004f  */
    @Override // xsna.eel0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(BannerAdUiData bannerAdUiData, long j, Context context, WebAdConfig webAdConfig) {
        List list;
        List<AdvertisementConfig.ConfigItem> a;
        Object obj;
        AdvertisementConfig.SlotConfig b;
        gnl gnlVar = e370.m;
        if (gnlVar == null) {
            gnlVar = null;
        }
        com.vk.superapp.advertisement.b j0 = gnlVar.a().j0();
        if (webAdConfig == null) {
            list = EmptyList.b;
        } else {
            int i = webAdConfig.b;
            AdvertisementConfig v = j0.v();
            if (v != null && (a = v.a()) != null) {
                Iterator<T> it = a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((AdvertisementConfig.ConfigItem) obj).c() == i) {
                            break;
                        }
                    }
                }
                AdvertisementConfig.ConfigItem configItem = (AdvertisementConfig.ConfigItem) obj;
                if (configItem != null && (b = configItem.b()) != null) {
                    list = com.vk.superapp.advertisement.b.D(b, i);
                    if (list == null) {
                        list = EmptyList.b;
                    }
                }
            }
            list = null;
            if (list == null) {
            }
        }
        gnl gnlVar2 = e370.m;
        if (gnlVar2 == null) {
            gnlVar2 = null;
        }
        if (gnlVar2.a().j0().w(webAdConfig) == null || list.isEmpty()) {
            this.e.b(webAdConfig != null ? Integer.valueOf(webAdConfig.b) : null);
            return;
        }
        this.h = null;
        this.i = 0;
        w(new uh0(AdRequestPurpose.SHOW_INSTANCE), bannerAdUiData, jn00.b((hel0) list.get(0)), context, webAdConfig, j);
    }

    @Override // xsna.e41
    public final void destroy() {
        mo6.a aVar = this.g;
        if (aVar != null) {
            aVar.a.c();
        }
        mo6.a aVar2 = this.g;
        if (aVar2 != null) {
            aVar2.a.a();
        }
        ydl0 ydl0Var = this.h;
        if (ydl0Var != null) {
            ydl0Var.c();
        }
        this.g = null;
        this.h = null;
    }

    public final void w(uh0 uh0Var, BannerAdUiData bannerAdUiData, gel0 gel0Var, Context context, WebAdConfig webAdConfig, long j) {
        r31 r31Var = (r31) this.b;
        int i = gel0Var.a;
        r31Var.h = Integer.valueOf(i);
        del0 del0Var = this.f.a;
        df0 a = a();
        ydl0 a2 = del0Var.a(context, gel0Var, new df0(a.a, String.valueOf(j), a.b, a.c, webAdConfig != null && webAdConfig.d, a.f));
        this.h = a2;
        if (a2 == null) {
            String a3 = lhg.a(i, "Incompatible slot: ");
            j11.a aVar = new j11.a(2005, a3, "Hasn't banners error");
            mo6.t(gel0Var, a3);
            r31Var.j(i, AdSlotSkipReason.NETWORK_ERROR);
            x(uh0Var, aVar, bannerAdUiData, context, webAdConfig, j);
            return;
        }
        a2.e(new dwj0(this, uh0Var, gel0Var, context, bannerAdUiData, webAdConfig, j));
        ydl0 ydl0Var = this.h;
        if (ydl0Var != null) {
            ydl0Var.load();
        }
    }

    public final void x(uh0 uh0Var, j11 j11Var, BannerAdUiData bannerAdUiData, Context context, WebAdConfig webAdConfig, long j) {
        List list;
        List<AdvertisementConfig.ConfigItem> a;
        Object obj;
        AdvertisementConfig.SlotConfig b;
        gnl gnlVar = e370.m;
        List list2 = null;
        if (gnlVar == null) {
            gnlVar = null;
        }
        com.vk.superapp.advertisement.b j0 = gnlVar.a().j0();
        if (webAdConfig == null) {
            list = EmptyList.b;
        } else {
            int i = webAdConfig.b;
            AdvertisementConfig v = j0.v();
            if (v != null && (a = v.a()) != null) {
                Iterator<T> it = a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((AdvertisementConfig.ConfigItem) obj).c() == i) {
                            break;
                        }
                    }
                }
                AdvertisementConfig.ConfigItem configItem = (AdvertisementConfig.ConfigItem) obj;
                if (configItem != null && (b = configItem.b()) != null) {
                    list2 = com.vk.superapp.advertisement.b.D(b, i);
                }
            }
            list = list2 == null ? EmptyList.b : list2;
        }
        if (this.i >= e43.h(list)) {
            this.e.i(j11Var, (String) uh0Var.b);
            return;
        }
        int i2 = this.i + 1;
        this.i = i2;
        w(uh0Var, bannerAdUiData, jn00.b((hel0) list.get(i2)), context, webAdConfig, j);
    }
}
