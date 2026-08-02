package xsna;

import com.vk.superapp.api.dto.widgets.actions.WebAction;
import com.vk.superapp.api.dto.widgets.actions.WebActionOpenNativeApp;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class r8r0 implements gzs {
    public final /* synthetic */ WebAction b;
    public final /* synthetic */ u8r0 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Integer f;

    public /* synthetic */ r8r0(WebAction webAction, u8r0 u8r0Var, String str, String str2, Integer num) {
        this.b = webAction;
        this.c = u8r0Var;
        this.d = str;
        this.e = str2;
        this.f = num;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        WebAction webAction = ((WebActionOpenNativeApp) this.b).e;
        if (webAction != null) {
            this.c.f(webAction, this.d, this.e, this.f);
        }
        return s3q0.a;
    }
}
