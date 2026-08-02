package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.media3.common.VideoFrameProcessingException;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: VideoGraph.java */
/* loaded from: classes12.dex */
public interface uns0 {

    /* compiled from: VideoGraph.java */
    public interface a {
        uns0 a(Context context, m6g m6gVar, g7l g7lVar, b bVar, Executor executor, long j, boolean z);
    }

    void a(@Nullable njn0 njn0Var);

    boolean b(int i, Bitmap bitmap, k5j k5jVar);

    void c();

    void d(dds0 dds0Var);

    void e(long j);

    void f(int i);

    void flush();

    void g(List<p8p> list);

    int h(int i);

    boolean i(int i);

    void initialize() throws VideoFrameProcessingException;

    Surface j(int i);

    void k(int i, int i2, androidx.media3.common.a aVar, List<p8p> list, long j);

    boolean l();

    void m(int i) throws VideoFrameProcessingException;

    void release();

    /* compiled from: VideoGraph.java */
    public interface b {
        default void a(VideoFrameProcessingException videoFrameProcessingException) {
        }

        default void b(float f) {
        }

        default void e(long j) {
        }

        default void c(int i, int i2) {
        }

        default void d(long j, boolean z) {
        }
    }
}
