package xsna;

import com.vk.music.stickyplayer.domain.PlayerContext;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.PostingStepScreen;
import xsna.f0k;
import xsna.izi;
import xsna.jun0;
import xsna.sx40;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class i74 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ i74(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                this.c.invoke(new PostingAction.Navigation.OpenInCurrentStep(PostingStepScreen.AdditionalSettingsScreen.b));
                break;
            case 1:
                this.c.invoke(izi.d.b);
                break;
            case 2:
                this.c.invoke(tf70.b);
                break;
            case 3:
                this.c.invoke(jun0.f.b);
                break;
            case 4:
                this.c.invoke(f0k.d.b.b);
                break;
            default:
                this.c.invoke(new sx40.o0(PlayerContext.MINI));
                break;
        }
        return s3q0.a;
    }
}
