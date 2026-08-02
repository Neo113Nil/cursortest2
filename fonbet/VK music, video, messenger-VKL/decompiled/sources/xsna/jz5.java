package xsna;

import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.log.L;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class jz5 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ o1d c;

    public /* synthetic */ jz5(o1d o1dVar, int i) {
        this.b = i;
        this.c = o1dVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.b) {
            case 0:
                L.e("TemplateFlow", "BadgesHelper success");
                g620.f().a().i(this.c.getContext(), fpf0.a(ClipFeedTab.TopVideo.class), null);
                return s3q0.a;
            default:
                return o1d.I(this.c, bool.booleanValue());
        }
    }
}
