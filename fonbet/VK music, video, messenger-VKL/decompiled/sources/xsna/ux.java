package xsna;

import com.vk.biometrics.lock.impl.presentation.base.mvi.setup.a;
import com.vk.dto.common.AttachmentType;
import com.vk.music.playlist.display.domain.a;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import xsna.fd70;
import xsna.rv9;
import xsna.zvu;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class ux implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ ux(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                this.c.invoke(new PostingAction.Editing.SetActionButton(null));
                break;
            case 1:
                this.c.invoke(a.c.b);
                break;
            case 2:
                this.c.invoke(rv9.j.b);
                break;
            case 3:
                this.c.invoke(zvu.b.b);
                break;
            case 4:
                this.c.invoke(a.b.g.b);
                break;
            case 5:
                this.c.invoke(fd70.c.b);
                break;
            default:
                this.c.invoke(AttachmentType.MARKET_LINK);
                break;
        }
        return s3q0.a;
    }
}
