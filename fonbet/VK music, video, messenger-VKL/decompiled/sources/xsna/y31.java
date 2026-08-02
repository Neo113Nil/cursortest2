package xsna;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.vk.external.miniapp.net.ad.AdvertisementType;
import com.vk.external.miniapp.net.app.WebAdConfig;
import com.vk.superapp.advertisement.api.dto.BannerAdUiData;
import com.vk.superapp.bridges.advertisement.BannerParamsSnapshot;
import xsna.j11;

/* compiled from: AdvertisementController.kt */
/* loaded from: classes6.dex */
public interface y31 {

    /* compiled from: AdvertisementController.kt */
    public static final class a {
        public final long a;
        public final AdvertisementType b;
        public final boolean c;
        public final AdvertisementType d;

        public a(long j, AdvertisementType advertisementType, boolean z, AdvertisementType advertisementType2) {
            this.a = j;
            this.b = advertisementType;
            this.c = z;
            this.d = advertisementType2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d;
        }

        public final int hashCode() {
            return this.d.hashCode() + qoy.b((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31, 31, this.c);
        }

        public final String toString() {
            return "FullscreenAdParams(appId=" + this.a + ", adType=" + this.b + ", useWaterfall=" + this.c + ", originalAdType=" + this.d + ')';
        }
    }

    /* compiled from: AdvertisementController.kt */
    public interface b {
        void a(AdvertisementType advertisementType, int i, boolean z, boolean z2, String str);

        void b(AdvertisementType advertisementType, j11 j11Var, String str);

        void c(AdvertisementType advertisementType, String str);

        void d(AdvertisementType advertisementType, boolean z, String str);

        void e(AdvertisementType advertisementType, j11.b bVar, String str);

        void f(AdvertisementType advertisementType, boolean z, j11 j11Var, String str);

        void g(String str);
    }

    /* compiled from: AdvertisementController.kt */
    public interface c {
        void a(View view, BannerAdUiData bannerAdUiData, wzs<? super Integer, ? super Integer, s3q0> wzsVar);

        void b(Integer num);

        boolean c();

        void d(BannerParamsSnapshot bannerParamsSnapshot, String str);

        void e(BannerParamsSnapshot bannerParamsSnapshot, String str);

        void f(BannerParamsSnapshot bannerParamsSnapshot, j11 j11Var, String str);

        boolean g();

        void h(BannerParamsSnapshot bannerParamsSnapshot, String str);

        void i(j11 j11Var, String str);

        void j(BannerParamsSnapshot bannerParamsSnapshot, String str);
    }

    /* compiled from: AdvertisementController.kt */
    public static final class d {
        public final r31 a;
        public final tkk0 b;
        public final j1y c;

        public d(r31 r31Var, tkk0 tkk0Var, j1y j1yVar) {
            this.a = r31Var;
            this.b = tkk0Var;
            this.c = j1yVar;
        }
    }

    void a();

    void b(Context context);

    void c(BannerAdUiData bannerAdUiData, long j, Context context, WebAdConfig webAdConfig);

    void d(Activity activity, a aVar, WebAdConfig webAdConfig);

    void e(Activity activity, a aVar, WebAdConfig webAdConfig);

    @ozl
    void f(Activity activity, k1y k1yVar);

    BannerParamsSnapshot g();

    boolean h(WebAdConfig webAdConfig);

    void i(Activity activity, long j, WebAdConfig webAdConfig, d dVar);

    boolean j();

    void k(Activity activity, a aVar, WebAdConfig webAdConfig);

    void l(aj0 aj0Var, m1y m1yVar);

    void m(boolean z);

    void n(Context context, WebAdConfig webAdConfig);

    void release();
}
