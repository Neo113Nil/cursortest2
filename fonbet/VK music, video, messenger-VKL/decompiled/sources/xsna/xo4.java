package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;

/* compiled from: AudioGet.java */
/* loaded from: classes14.dex */
public final class xo4 extends pug0<MusicTrack> {
    public xo4(UserId userId, int i) {
        super("audio.get", MusicTrack.e0);
        F(userId, "owner_id");
        C(i, "count");
    }
}
