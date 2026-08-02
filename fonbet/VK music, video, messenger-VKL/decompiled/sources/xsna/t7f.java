package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import xsna.spt;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class t7f implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ MusicTrack c;

    public /* synthetic */ t7f(MusicTrack musicTrack) {
        this.c = musicTrack;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return MusicTrack.zb(this.c, 0, null, 0, 0, ((spt.a) obj).a, false, null, null, false, false, null, null, null, -129, 1048575);
            default:
                UserId c = o25.a().c();
                int intValue = ((Integer) obj).intValue();
                MusicTrack musicTrack = this.c;
                musicTrack.c = c;
                musicTrack.b = intValue;
                return s3q0.a;
        }
    }
}
