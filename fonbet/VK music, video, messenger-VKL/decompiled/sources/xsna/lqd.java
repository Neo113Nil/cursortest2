package xsna;

import com.vk.design.demo.presentation.screens.ContextMenuScreenContent;
import com.vk.im.ui.components.common.BanDuration;
import xsna.mat;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class lqd implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ lqd(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                this.c.invoke((CharSequence) obj);
                break;
            case 1:
                this.c.invoke(((Boolean) obj).booleanValue() ? ContextMenuScreenContent.ImplementationType.View : ContextMenuScreenContent.ImplementationType.Compose);
                break;
            case 2:
                this.c.invoke(new mat.e((djc) obj));
                break;
            default:
                this.c.invoke(Integer.valueOf(((BanDuration) obj).h()));
                break;
        }
        return s3q0.a;
    }
}
