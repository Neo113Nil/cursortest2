package xsna;

import android.os.SystemClock;
import com.vk.ads.analytics.NativeAdType;
import com.vk.ads.analytics.NativeAdUserLevelAnalyticsSender;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.core.models.news.YandexNativeAdEntry;
import com.vk.libvideo.live.impl.views.stat.StatAdapter;
import java.util.ArrayList;
import xsna.mwa;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class yva implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ yva(UserProfile userProfile, com.vk.libvideo.live.impl.views.stat.a aVar, int i) {
        this.b = 2;
        this.d = userProfile;
        this.e = aVar;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                com.vk.channels.impl.comments.b bVar = (com.vk.channels.impl.comments.b) this.d;
                mwa.a aVar = (mwa.a) this.e;
                com.vk.channels.impl.comments.g gVar = (com.vk.channels.impl.comments.g) obj;
                bVar.m.remove(Integer.valueOf(this.c));
                return com.vk.channels.impl.comments.g.a(gVar, com.vk.channels.impl.comments.b.s(bVar, aVar, false, 3), null, null, false, 14);
            case 1:
                UserId userId = (UserId) this.d;
                UserId userId2 = (UserId) this.e;
                String str = (String) obj;
                int i = this.c;
                return i > 0 ? new com.vk.upload.impl.tasks.b(str, userId, i, userId2, "", false) : new com.vk.upload.impl.tasks.a(str, userId, i, userId2, "", false);
            case 2:
                UserProfile userProfile = (UserProfile) this.d;
                com.vk.libvideo.live.impl.views.stat.a aVar2 = (com.vk.libvideo.live.impl.views.stat.a) this.e;
                userProfile.j = true;
                ArrayList<StatAdapter.a> arrayList = aVar2.h.d;
                int i2 = this.c;
                arrayList.get(i2).h = true;
                aVar2.h.notifyItemChanged(i2, new Object());
                return s3q0.a;
            default:
                h5y0 h5y0Var = (h5y0) this.d;
                YandexNativeAdEntry yandexNativeAdEntry = (YandexNativeAdEntry) this.e;
                z4y0 z4y0Var = (z4y0) obj;
                h5y0.q0(1, 1, 1);
                NewsEntry.TrackData trackData = yandexNativeAdEntry.m;
                NativeAdUserLevelAnalyticsSender nativeAdUserLevelAnalyticsSender = h5y0Var.b;
                NativeAdType nativeAdType = NativeAdType.YANDEX;
                String str2 = trackData.b;
                int i3 = trackData.c;
                int i4 = this.c;
                nativeAdUserLevelAnalyticsSender.a(new fv50(nativeAdType, i4, str2, i3), null, true, SystemClock.elapsedRealtime() - h5y0Var.e);
                YandexNativeAdEntry yandexNativeAdEntry2 = new YandexNativeAdEntry(yandexNativeAdEntry.i, yandexNativeAdEntry.j, z4y0Var, Integer.valueOf(i4), yandexNativeAdEntry.m);
                yandexNativeAdEntry2.c = yandexNativeAdEntry.c;
                yandexNativeAdEntry2.g = yandexNativeAdEntry.g;
                yandexNativeAdEntry2.h = yandexNativeAdEntry.h;
                return yandexNativeAdEntry2;
        }
    }

    public /* synthetic */ yva(Object obj, int i, Object obj2, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
        this.e = obj2;
    }
}
