package xsna;

import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.source.i;
import xsna.jza0;
import xsna.p06;

/* compiled from: AnalyticsCollector.java */
/* loaded from: classes12.dex */
public interface zw1 extends jza0.b, androidx.media3.exoplayer.source.j, p06.a, androidx.media3.exoplayer.drm.a {
    void C(by1 by1Var);

    void G(by1 by1Var);

    void O(jza0 jza0Var, Looper looper);

    void V();

    void Z(int i);

    void b(long j, Object obj);

    void c(Exception exc);

    void c0(int i, int i2, boolean z);

    void e(g8l g8lVar);

    void f(g8l g8lVar);

    void g(androidx.media3.common.a aVar, @Nullable n8l n8lVar);

    void i(int i, long j, long j2);

    void j(String str);

    void l(String str);

    void m(int i, long j);

    void n(g8l g8lVar);

    void o(AudioSink.a aVar);

    void onAudioDecoderInitialized(String str, long j, long j2);

    void onDroppedFrames(int i, long j);

    void onVideoDecoderInitialized(String str, long j, long j2);

    void p(AudioSink.a aVar);

    void q(Exception exc);

    void r(long j);

    void release();

    void s(g8l g8lVar);

    void t(Exception exc);

    void u(androidx.media3.common.a aVar, @Nullable n8l n8lVar);

    void w(com.google.common.collect.g gVar, @Nullable i.b bVar);
}
