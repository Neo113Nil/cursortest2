package xsna;

import com.vk.dto.music.MusicTrack;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class g630 implements izs {
    public final /* synthetic */ com.vk.music.track.a b;
    public final /* synthetic */ MusicTrack c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ g630(com.vk.music.track.a aVar, MusicTrack musicTrack, boolean z, boolean z2) {
        this.b = aVar;
        this.c = musicTrack;
        this.d = z;
        this.e = z2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Boolean bool = (Boolean) obj;
        bn40.g("audio.audioRemoveDislike", bool);
        if (bool.booleanValue()) {
            this.b.d.b(new gb50(this.c, this.d, this.e));
        }
        return s3q0.a;
    }
}
