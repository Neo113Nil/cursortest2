package xsna;

import com.vk.dto.music.MusicTrack;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class c630 implements izs {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ MusicTrack c;
    public final /* synthetic */ com.vk.music.track.a d;

    public /* synthetic */ c630(boolean z, MusicTrack musicTrack, com.vk.music.track.a aVar) {
        this.b = z;
        this.c = musicTrack;
        this.d = aVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Boolean bool = (Boolean) obj;
        boolean z = this.b;
        MusicTrack musicTrack = this.c;
        if (z) {
            musicTrack.m = true;
        }
        bn40.g("audio.audioAddDislike", bool);
        if (bool.booleanValue()) {
            this.d.d.b(new hb50(musicTrack, musicTrack, z));
        }
        return s3q0.a;
    }
}
