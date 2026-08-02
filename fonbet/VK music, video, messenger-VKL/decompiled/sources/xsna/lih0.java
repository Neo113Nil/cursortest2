package xsna;

import java.util.List;
import one.video.player.error.OneVideoPlaybackException;
import one.video.player.model.text.SubtitleRenderItem;

/* compiled from: SdkAutoPlayListener.kt */
/* loaded from: classes17.dex */
public interface lih0 {
    void H(long j, long j2);

    void I(qi5 qi5Var, long j, long j2);

    void J(qi5 qi5Var, int i, int i2, OneVideoPlaybackException.ErrorCode errorCode, Throwable th);

    void K(int i, int i2);

    void L(qi5 qi5Var);

    void M(qi5 qi5Var);

    void a(boolean z);

    void b(qi5 qi5Var);

    void c();

    void d(qi5 qi5Var);

    void e(qi5 qi5Var);

    void f(qi5 qi5Var);

    void g(qi5 qi5Var);

    void h(qi5 qi5Var);

    void onIsPlayingChanged(boolean z);

    void q(List<? extends SubtitleRenderItem> list);

    void u();

    void x0();
}
