package xsna;

import com.vk.media.player.VideoMode;
import java.util.List;
import one.video.player.OneVideoPlayer;

/* compiled from: PlayerProtocol.kt */
/* loaded from: classes3.dex */
public interface d3b0 {
    void C(boolean z);

    void L(VideoMode videoMode);

    OneVideoPlayer a();

    void b();

    m7q c();

    void d(izs<? super d3b0, s3q0> izsVar);

    boolean e();

    void f(m7q m7qVar);

    void g(toz tozVar);

    String getSessionId();

    nza0 h();

    void i(m7q m7qVar, z0d0 z0d0Var);

    boolean isPrepared();

    void j(ujt0 ujt0Var);

    boolean k(ujt0 ujt0Var);

    void l(m7q m7qVar, List<String> list);

    izs<d3b0, s3q0> m();

    am80 n();

    void o(fuk0 fuk0Var);

    void p(mm80 mm80Var);

    @ozl
    boolean q(one.video.player.tracks.a aVar);
}
