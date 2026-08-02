package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.media3.common.VideoFrameProcessingException;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.concurrent.Executor;
import xsna.ouj0;

/* compiled from: VideoFrameProcessor.java */
/* loaded from: classes12.dex */
public interface kms0 {
    public static final com.google.common.collect.g a = ImmutableList.p(new a());

    /* compiled from: VideoFrameProcessor.java */
    public class a implements p8p {
    }

    /* compiled from: VideoFrameProcessor.java */
    public interface b {
        kms0 a(Context context, g7l g7lVar, m6g m6gVar, boolean z, Executor executor, ouj0.a aVar) throws VideoFrameProcessingException;
    }

    void a(@Nullable njn0 njn0Var);

    Surface b();

    void c();

    boolean d(Bitmap bitmap, k5j k5jVar);

    void e(long j);

    boolean f();

    void flush();

    int g();

    void h();

    void i(int i, long j, androidx.media3.common.a aVar, List list);

    void release();

    /* compiled from: VideoFrameProcessor.java */
    public interface c {
        default void e() {
        }

        default void f() {
        }

        default void a(VideoFrameProcessingException videoFrameProcessingException) {
        }

        default void b(float f) {
        }

        default void c(int i, int i2) {
        }

        default void d(long j, boolean z) {
        }
    }
}
