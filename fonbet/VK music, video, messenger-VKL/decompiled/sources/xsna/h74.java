package xsna;

import com.vk.biometrics.lock.impl.presentation.base.mvi.pin.a;
import com.vk.music.podcast.impl.ui.offlinepage.presentation.feature.a;
import com.vk.music.stickyplayer.domain.PlayerContext;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction$Navigation$Picker$OpenPrivacyDatePicker;
import xsna.izi;
import xsna.jun0;
import xsna.kqc0;
import xsna.o3v;
import xsna.q610;
import xsna.sx40;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class h74 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ h74(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                this.c.invoke(PostingAction$Navigation$Picker$OpenPrivacyDatePicker.b);
                break;
            case 1:
                this.c.invoke(new a.f(o3v.a.a));
                break;
            case 2:
                this.c.invoke(izi.b.b);
                break;
            case 3:
                this.c.invoke(kqc0.f.b);
                break;
            case 4:
                this.c.invoke(q610.b.b);
                break;
            case 5:
                this.c.invoke(a.d.b);
                break;
            case 6:
                this.c.invoke(jun0.b.b);
                break;
            default:
                this.c.invoke(new sx40.o0(PlayerContext.MINI));
                break;
        }
        return s3q0.a;
    }
}
