package xsna;

import com.vk.fullscreenvideo.a;
import com.vk.music.playlist.display.domain.a;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import xsna.aiq0;
import xsna.hjl0;
import xsna.le70;
import xsna.wml0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class px implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ px(izs izsVar, int i) {
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
                this.c.invoke(aiq0.g.d.b);
                break;
            case 2:
                this.c.invoke(a.b.e.b);
                break;
            case 3:
                this.c.invoke(le70.f.b);
                break;
            case 4:
                this.c.invoke(hjl0.a.c.b);
                break;
            case 5:
                this.c.invoke(wml0.d.b);
                break;
            default:
                this.c.invoke(a.e.a);
                break;
        }
        return s3q0.a;
    }
}
