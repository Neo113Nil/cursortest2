package xsna;

import androidx.media3.common.VideoFrameProcessingException;
import java.util.concurrent.Executor;

/* compiled from: GlShaderProgram.java */
/* loaded from: classes12.dex */
public interface o0u {

    /* compiled from: GlShaderProgram.java */
    public interface a {
        void a(VideoFrameProcessingException videoFrameProcessingException);
    }

    void a(Executor executor, tp1 tp1Var);

    void b(b bVar);

    void c(k0u k0uVar, r0u r0uVar, long j);

    void d(c cVar);

    void e(r0u r0uVar);

    void f();

    void flush();

    void release() throws VideoFrameProcessingException;

    /* compiled from: GlShaderProgram.java */
    public interface b {
        default void a() {
        }

        default void e() {
        }

        default void b(r0u r0uVar) {
        }
    }

    /* compiled from: GlShaderProgram.java */
    public interface c {
        default void c() {
        }

        default void d(r0u r0uVar, long j) {
        }
    }
}
