package xsna;

import com.vk.ecomm.storefront.impl.community.presentation.model.ProductsManagementActionType;
import com.vk.music.stickyplayer.domain.PlayerContext;
import com.vk.newsfeed.posting.poll_editor.domain.model.PollEditorScreen;
import xsna.hjl0;
import xsna.mbf;
import xsna.nqd0;
import xsna.pnb0;
import xsna.sdo;
import xsna.sx40;
import xsna.yda;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class ega implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ ega(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                this.c.invoke(yda.b.b);
                break;
            case 1:
                this.c.invoke(mbf.c.i.a);
                break;
            case 2:
                this.c.invoke(new efn(0));
                break;
            case 3:
                this.c.invoke(sdo.c.b);
                break;
            case 4:
                this.c.invoke(hjl0.a.j.b);
                break;
            case 5:
                this.c.invoke(new sx40.a.d(PlayerContext.FULL));
                break;
            case 6:
                this.c.invoke(new pnb0.c.g(PollEditorScreen.RemovePollAlert.b));
                break;
            default:
                this.c.invoke(new nqd0.b(ProductsManagementActionType.CANCEL));
                break;
        }
        return s3q0.a;
    }
}
