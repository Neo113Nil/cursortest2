package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import xsna.k840;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class f630 implements izs {
    public final /* synthetic */ MusicTrack b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ f630(MusicTrack musicTrack, boolean z) {
        this.b = musicTrack;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Integer num = (Integer) obj;
        MusicTrack musicTrack = this.b;
        bn40.g(musicTrack.l ? "audio.restore" : "audio.add", num);
        MusicTrack Ab = musicTrack.Ab();
        musicTrack.U = true;
        musicTrack.l = false;
        UserId c = o25.a().c();
        int intValue = num.intValue();
        musicTrack.c = c;
        musicTrack.b = intValue;
        musicTrack.P = false;
        r5v0 r5v0Var = k840.a.h;
        if (r5v0Var == null) {
            r5v0Var = null;
        }
        r5v0Var.b(new fa50(Ab, musicTrack, this.c));
        return s3q0.a;
    }
}
