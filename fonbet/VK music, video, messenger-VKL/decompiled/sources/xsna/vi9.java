package xsna;

import android.content.Context;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.ikv0;

/* compiled from: CameraInfoSnackbar.kt */
/* loaded from: classes16.dex */
public final class vi9 extends k96 {
    public vi9(Context context) {
        super(context);
        this.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, context.getString(R.string.close), new com.vk.movika.sdk.base.observable.i(5));
    }

    public final void q(String str) {
        ucp ucpVar = ucp.a;
        this.u = new ikv0.d(new ikv0.d.c(ucp.i(str).toString(), 5), (ikv0.d.b) null, (ikv0.d.a) null, 6);
    }

    @Override // xsna.ikv0.a
    public final void h(ikv0.c cVar) {
    }

    @Override // xsna.ikv0.a
    public final void i(ikv0.d dVar) {
    }

    @Override // xsna.ikv0.a
    public final void j(ikv0.e eVar) {
    }
}
