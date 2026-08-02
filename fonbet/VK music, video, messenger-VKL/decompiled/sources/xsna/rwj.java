package xsna;

import android.net.Uri;
import com.vk.api.generated.audio.dto.AudioStreamDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.AudioStream;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.podcast.Podcast;
import com.vk.toggle.features.MusicFeatures;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;
import xsna.k840;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class rwj implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ MusicTrack c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ rwj(MusicTrack musicTrack, String str, swj swjVar, String str2) {
        this.c = musicTrack;
        this.d = str;
        this.f = swjVar;
        this.e = str2;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        List<AudioStream> list;
        Object obj;
        String str;
        switch (this.b) {
            case 0:
                String str2 = (String) this.d;
                swj swjVar = (swj) this.f;
                String str3 = (String) this.e;
                MusicTrack musicTrack = this.c;
                AudioStreamDto.TypeDto b = ob50.b(musicTrack);
                if (MusicFeatures.AUDIO_GET_ALL_PLAYING_FORMATS.h() && (list = musicTrack.j) != null) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (epx.f(((AudioStream) next).b, b != null ? b.j() : null)) {
                                obj = next;
                            }
                        }
                    }
                    AudioStream audioStream = (AudioStream) obj;
                    if (audioStream != null && (str = audioStream.c) != null) {
                        str2 = str;
                    }
                }
                swjVar.a.g(str3, b, Uri.parse(str2), musicTrack.Fb().getBytes(StandardCharsets.UTF_8));
                break;
            default:
                vh40 vh40Var = (vh40) this.d;
                UserId userId = (UserId) this.e;
                UserId userId2 = (UserId) this.f;
                fq40 fq40Var = vh40Var.b;
                int p = fq40Var.p(userId, userId2);
                Podcast n = fq40Var.n(userId, userId2);
                if (n != null) {
                    if (p == 0) {
                        sg40 sg40Var = vh40Var.c;
                        sg40Var.n.submit(new jg40(sg40Var, userId, n));
                    }
                    MusicTrack musicTrack2 = this.c;
                    if (musicTrack2 != null) {
                        MusicTrack a = kq40.a(musicTrack2);
                        r5v0 r5v0Var = k840.a.h;
                        if (r5v0Var == null) {
                            r5v0Var = null;
                        }
                        r5v0Var.b(new ib50(musicTrack2, a));
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ rwj(vh40 vh40Var, UserId userId, UserId userId2, MusicTrack musicTrack) {
        this.d = vh40Var;
        this.e = userId;
        this.f = userId2;
        this.c = musicTrack;
    }
}
