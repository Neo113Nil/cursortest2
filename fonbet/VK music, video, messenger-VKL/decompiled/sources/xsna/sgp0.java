package xsna;

import com.vk.audiomsg.player.SpeakerType;
import com.vk.audiomsg.player.Speed;
import xsna.hil;

/* compiled from: TrackPlayer.kt */
/* loaded from: classes.dex */
public interface sgp0 {
    void a(lza0 lza0Var, float f);

    ur4 b();

    void c(bgk0 bgk0Var, Speed speed);

    void d(bgk0 bgk0Var, SpeakerType speakerType);

    void e(lza0 lza0Var);

    SpeakerType f();

    void g(hil.b bVar);

    float getVolume();

    void h(bgk0 bgk0Var, ur4 ur4Var);

    void i(bgk0 bgk0Var, float f);

    boolean isLoading();

    boolean isPaused();

    boolean isPlaying();

    void j(lza0 lza0Var);

    void k(bgk0 bgk0Var);

    boolean m();

    float o();

    void p(bgk0 bgk0Var);

    void q(bgk0 bgk0Var);

    Speed z();
}
