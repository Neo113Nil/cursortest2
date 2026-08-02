package xsna;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.mobile.ads.nativeads.NativeAd;
import com.yandex.mobile.ads.nativeads.NativeAdViewBinder;
import xsna.b5y0;
import xsna.k5y0;

/* compiled from: YandexNativeAdViewBinderImpl.kt */
/* loaded from: classes14.dex */
public final class l5y0 implements k5y0 {
    public final NativeAdViewBinder a;

    /* compiled from: YandexNativeAdViewBinderImpl.kt */
    public static final class a implements k5y0.a {
        public Context a;
        public ViewGroup b;
        public ViewGroup c;
        public ViewGroup d;
        public TextView e;
        public TextView f;
        public TextView g;
        public ImageView h;
        public ImageView i;
        public ImageView j;
        public TextView k;
        public TextView l;
        public TextView m;

        @Override // xsna.k5y0.a
        public final a a(Context context) {
            this.a = context;
            return this;
        }
    }

    public l5y0(NativeAdViewBinder nativeAdViewBinder) {
        this.a = nativeAdViewBinder;
    }

    @Override // xsna.k5y0
    public final void a(z4y0 z4y0Var) {
        if (z4y0Var instanceof d5y0) {
            ((d5y0) z4y0Var).a.setNativeAdEventListener(null);
        }
    }

    @Override // xsna.k5y0
    public final void b(z4y0 z4y0Var, b5y0.b bVar) {
        if (z4y0Var instanceof d5y0) {
            NativeAd nativeAd = ((d5y0) z4y0Var).a;
            nativeAd.bindNativeAd(this.a);
            nativeAd.setNativeAdEventListener(new qd50(bVar, z4y0Var));
        }
    }
}
