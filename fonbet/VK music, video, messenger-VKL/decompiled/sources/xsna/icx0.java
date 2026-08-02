package xsna;

import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.ui.watchmovie.player.VoipWatchMoviePlayerControlView;
import java.util.LinkedHashMap;

/* compiled from: WatchTogetherController.kt */
/* loaded from: classes7.dex */
public interface icx0 {

    /* compiled from: WatchTogetherController.kt */
    public interface a {
        void a3(LinkedHashMap linkedHashMap);
    }

    io.reactivex.rxjava3.subjects.f a();

    p3x0 b();

    void c(a aVar, boolean z);

    io.reactivex.rxjava3.internal.operators.observable.q d();

    void e(VoipWatchMoviePlayerControlView voipWatchMoviePlayerControlView);

    io.reactivex.rxjava3.internal.operators.observable.q f(boolean z);

    void g();

    void h(VoipWatchMoviePlayerControlView voipWatchMoviePlayerControlView);

    void i();

    void j();

    void k(long j);

    void l(p3x0 p3x0Var);

    CallMemberId m();

    void mute(boolean z);

    boolean n();

    void setVolume(float f);
}
