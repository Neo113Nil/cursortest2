package xsna;

import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.image.VKImageController;
import com.vkontakte.android.R;
import xsna.d030;

/* compiled from: ModalMapPresenter.kt */
/* loaded from: classes15.dex */
public final class e030 {
    public final c030 a;

    /* compiled from: ModalMapPresenter.kt */
    public static final class a implements tcr0 {
        public a() {
        }

        @Override // xsna.tcr0
        public final void B4(Throwable th) {
            e030.this.a.Mn(new d030.a(th));
        }

        @Override // xsna.tcr0
        public final void onSuccess() {
            e030.this.a.Mn(d030.c.a);
        }
    }

    public e030(c030 c030Var) {
        this.a = c030Var;
    }

    public final void a(VKImageController<? extends View> vKImageController, String str) {
        this.a.Mn(d030.b.a);
        vKImageController.d(str, new VKImageController.b(12.0f, new VKImageController.c(12.0f, 12.0f, 12.0f, 12.0f), false, R.drawable.vk_default_placeholder_10, null, null, VKImageController.ScaleType.FIT_XY, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, null, null, null, 65388), new a());
    }
}
