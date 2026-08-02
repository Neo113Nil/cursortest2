package xsna;

import android.net.Uri;
import android.view.View;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.vk.core.ui.image.VKImageController;
import kotlin.Result;
import xsna.qr9;

/* compiled from: ImageCaptchaPresenter.kt */
/* loaded from: classes15.dex */
public final class mgw extends r96 {
    public final VKImageController.b e;
    public String f;
    public final zf20 g;
    public VKImageController<? extends View> h;
    public final bpn0 i = new bpn0(new p5h(this, 28));

    /* compiled from: ImageCaptchaPresenter.kt */
    public final class a implements tcr0 {
        public final dhh b;

        public a(dhh dhhVar) {
            this.b = dhhVar;
        }

        @Override // xsna.tcr0
        public final void B4(Throwable th) {
            this.b.invoke(new qr9.d(mgw.this.b));
        }

        @Override // xsna.tcr0
        public final void onSuccess() {
            this.b.invoke(new qr9.e(false, mgw.this.b));
        }
    }

    public mgw(VKImageController.b bVar, String str, zf20 zf20Var) {
        this.e = bVar;
        this.f = str;
        this.g = zf20Var;
    }

    public final void c(Uri uri, boolean z) {
        Object failure;
        b(new qr9.c(this.b));
        try {
            this.h.d(uri.toString(), this.e, (a) this.i.getValue());
            failure = s3q0.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a2 = Result.a(failure);
        if (a2 != null) {
            par0.a.getClass();
            par0.c("SakCaptchaFragment failed load image captcha", a2);
            this.g.invoke();
        }
        if (z) {
            this.d.start();
        }
    }

    @Override // xsna.pr9
    public final void deactivate() {
        this.d.cancel();
    }

    @Override // xsna.pr9
    public final void refresh() {
        Uri.Builder buildUpon = jeq0.g(this.f).buildUpon();
        buildUpon.appendQueryParameter(ToolBar.REFRESH, "1");
        c(buildUpon.build(), true);
    }
}
