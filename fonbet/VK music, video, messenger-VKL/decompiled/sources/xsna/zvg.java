package xsna;

import com.vk.ecomm.checklist.impl.domain.model.CommunityCheckListTip;
import xsna.fzd0;
import xsna.owg;

/* compiled from: CommunityCheckListFeature.kt */
/* loaded from: classes18.dex */
public final class zvg implements fzd0.a {
    public final /* synthetic */ yvg a;

    public zvg(yvg yvgVar) {
        this.a = yvgVar;
    }

    @Override // xsna.fzd0.a
    public final void a(fzd0.c cVar) {
        if (cVar instanceof fzd0.c.b) {
            this.a.T(new owg.d(CommunityCheckListTip.Type.LOAD_AVATAR));
        }
    }
}
