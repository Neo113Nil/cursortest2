package xsna;

import android.content.Context;
import android.util.Size;
import com.vk.core.view.components.button.VkButton;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.ikv0;
import xsna.yaf;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class qif implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qif(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        int i2 = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                ((izs) obj).invoke(new yaf.b.h(i2));
                break;
            default:
                Context context = (Context) obj;
                ikv0.a aVar = new ikv0.a(context);
                aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_error_circle_outline_28, Integer.valueOf(R.attr.vk_ui_icon_negative), (Size) null, 12);
                aVar.u = new ikv0.d(new ikv0.d.c(context.getString(i2)), (ikv0.d.b) null, (ikv0.d.a) null, 6);
                String string = context.getString(R.string.clips_publish_error_snack_btn);
                VkButton.Appearance appearance = VkButton.Appearance.Accent;
                aVar.s = new ikv0.e.a(Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, string, new kdw(25));
                pkv0.f(aVar);
                break;
        }
        return s3q0.a;
    }
}
