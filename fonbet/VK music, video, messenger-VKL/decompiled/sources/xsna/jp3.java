package xsna;

import com.vk.dto.music.MusicTrack;
import com.vk.music.player.PlayState;
import com.vk.music.player.e;
import xsna.k840;

/* compiled from: ArticlePlayerListener.kt */
/* loaded from: classes15.dex */
public final class jp3 extends e.a {
    public final com.vk.articles.a b;
    public String c;
    public PlayState d = PlayState.PLAYING;
    public final u2b0 e = k840.a.g().b();

    public jp3(com.vk.articles.a aVar) {
        this.b = aVar;
    }

    public static String a(String str, PlayState playState) {
        return ss9.a("Article.onAudioStateChanged('", str, "','", playState.h() ? "play" : "pause", "')");
    }

    @Override // com.vk.music.player.e.a, com.vk.music.player.e
    public final void N3(final PlayState playState, com.vk.music.player.f fVar) {
        String str;
        MusicTrack f;
        if (fVar == null || (f = fVar.f()) == null || (str = f.Fb()) == null) {
            str = "0";
        }
        final String str2 = str;
        MusicTrack K0 = this.e.K0();
        final String Fb = K0 != null ? K0.Fb() : null;
        final String str3 = this.c;
        final PlayState playState2 = this.d;
        this.b.post(new Runnable() { // from class: xsna.ip3
            @Override // java.lang.Runnable
            public final void run() {
                com.vk.articles.a aVar = this.b;
                String str4 = Fb;
                String str5 = str3;
                boolean f2 = epx.f(str4, str5);
                String str6 = str2;
                PlayState playState3 = playState;
                if (f2 && str5 != null) {
                    aVar.e(jp3.a(str5, PlayState.PAUSED));
                    aVar.e(jp3.a(str6, playState3));
                } else {
                    if (!str6.equals(str5) || playState2 == playState3) {
                        return;
                    }
                    aVar.e(jp3.a(str6, playState3));
                }
            }
        });
        if (playState.i()) {
            str2 = null;
        }
        this.c = str2;
        this.d = playState.i() ? PlayState.PLAYING : playState;
    }
}
