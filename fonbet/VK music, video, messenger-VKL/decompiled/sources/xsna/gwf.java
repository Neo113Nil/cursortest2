package xsna;

import android.content.Context;
import android.view.View;
import com.vk.external.miniapp.net.app.WebAdConfig;

/* compiled from: ClosingBannerAdsDelegate.kt */
/* loaded from: classes6.dex */
public interface gwf {

    /* compiled from: ClosingBannerAdsDelegate.kt */
    public interface a {
        void K2();

        void a(View view, wzs<? super Integer, ? super Integer, s3q0> wzsVar);
    }

    void a(Context context, Long l, WebAdConfig webAdConfig);

    void destroy();

    /* compiled from: ClosingBannerAdsDelegate.kt */
    public static final class b {
        public static final /* synthetic */ b a = new b();

        public final gwf getSTUB() {
            return new a();
        }

        /* compiled from: ClosingBannerAdsDelegate.kt */
        public static final class a implements gwf {
            @Override // xsna.gwf
            public final void destroy() {
            }

            @Override // xsna.gwf
            public final void a(Context context, Long l, WebAdConfig webAdConfig) {
            }
        }
    }
}
