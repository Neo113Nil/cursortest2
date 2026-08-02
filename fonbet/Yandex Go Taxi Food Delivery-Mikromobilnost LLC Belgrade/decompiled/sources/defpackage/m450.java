package defpackage;

import android.media.MediaPlayer;
import com.yandex.mapkit.annotations.LocalizedPhrase;
import com.yandex.mapkit.annotations.SpeakerPhraseToken;
import java.io.File;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes12.dex */
public final class m450 extends gf50 {
    public final String a;
    public final mlb0 b;
    public final String c;
    public final String d;
    public float e;
    public final Map f;
    public final MediaPlayer g;
    public final LinkedBlockingQueue h;

    public m450(String str, mlb0 mlb0Var, String str2, String str3, float f, Map map) {
        this.a = str;
        this.b = mlb0Var;
        this.c = str2;
        this.d = str3;
        this.e = f;
        this.f = map;
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: l450
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer2) {
                m450.this.b();
            }
        });
        float f2 = this.e;
        mediaPlayer.setVolume(f2, f2);
        this.g = mediaPlayer;
        this.h = new LinkedBlockingQueue();
    }

    @Override // defpackage.gf50
    public final void a(float f) {
        this.e = f;
        this.g.setVolume(f, f);
    }

    public final void b() {
        File file = (File) this.h.poll();
        if (file != null) {
            if (!file.exists()) {
                file = null;
            }
            if (file == null) {
                return;
            }
            MediaPlayer mediaPlayer = this.g;
            mediaPlayer.stop();
            mediaPlayer.reset();
            mediaPlayer.setDataSource(file.getPath());
            mediaPlayer.prepare();
            mediaPlayer.start();
        }
    }

    @Override // com.yandex.mapkit.annotations.Speaker
    public final double duration(LocalizedPhrase localizedPhrase) {
        double doubleValue;
        Map map = this.f;
        if (map.isEmpty()) {
            return 0.0d;
        }
        double d = 0.0d;
        for (SpeakerPhraseToken speakerPhraseToken : localizedPhrase.getTokens()) {
            this.b.getClass();
            String a = mlb0.a(speakerPhraseToken);
            if (a != null) {
                StringBuilder w = oyr.w(this.c, "/", this.d, "/navigation/", a);
                w.append(".opus");
                Double d2 = (Double) map.get(w.toString());
                if (d2 != null) {
                    doubleValue = d2.doubleValue();
                    d += doubleValue;
                }
            }
            doubleValue = 0.0d;
            d += doubleValue;
        }
        return d;
    }

    @Override // com.yandex.mapkit.annotations.Speaker
    public final void reset() {
        this.h.clear();
        this.g.stop();
    }

    @Override // com.yandex.mapkit.annotations.Speaker
    public final void say(LocalizedPhrase localizedPhrase) {
        for (SpeakerPhraseToken speakerPhraseToken : localizedPhrase.getTokens()) {
            this.b.getClass();
            String a = mlb0.a(speakerPhraseToken);
            if (a != null) {
                this.h.put(new File(unr0.o(this.a, "/navigation/", a, ".opus")));
            }
        }
        b();
    }
}
