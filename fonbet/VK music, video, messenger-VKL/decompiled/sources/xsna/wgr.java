package xsna;

import android.content.Context;
import com.vk.core.view.components.button.VkButton;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.ikv0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class wgr implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wgr(Object obj, long j, int i) {
        this.b = i;
        this.d = obj;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        int i2 = 1;
        long j = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                ((zgr) obj).j.d(j, true);
                break;
            default:
                dhr0.a.getClass();
                Context E = dhr0.E();
                ikv0.a aVar = new ikv0.a(E);
                aVar.t = ikv0.c.f.a;
                aVar.u = new ikv0.d(new ikv0.d.c(E.getString(R.string.sent_new_chat_snackbar_title)), (ikv0.d.b) null, (ikv0.d.a) null, 6);
                String string = E.getString(R.string.sent_new_chat_snackbar_button);
                VkButton.Appearance appearance = VkButton.Appearance.Accent;
                aVar.s = new ikv0.e.a(Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, string, new ysy((com.vk.sharing.core.view.f) obj, j, i2));
                pkv0.f(aVar);
                break;
        }
    }
}
