package xsna;

import com.vk.design.demo.presentation.nav.ScreenKey;
import com.vk.dto.common.id.UserId;
import xsna.h3m;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class r38 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ r38(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                this.c.invoke((UserId) obj);
                break;
            default:
                this.c.invoke(new h3m.b((ScreenKey) obj));
                break;
        }
        return s3q0.a;
    }
}
