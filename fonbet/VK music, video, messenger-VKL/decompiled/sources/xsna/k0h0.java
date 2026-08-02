package xsna;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: SampleSource.kt */
/* loaded from: classes3.dex */
public interface k0h0 {
    public static final a a = a.a;

    /* compiled from: SampleSource.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final C3155a b = new C3155a();

        /* compiled from: SampleSource.kt */
        /* renamed from: xsna.k0h0$a$a, reason: collision with other inner class name */
        public static final class C3155a implements b {
            public final ByteBuffer a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());
            public final boolean b = true;

            @Override // xsna.k0h0.b
            public final long a() {
                return 0L;
            }

            @Override // xsna.k0h0.b
            public final boolean b() {
                return false;
            }

            @Override // xsna.k0h0.b
            public final boolean c() {
                return this.b;
            }

            @Override // xsna.k0h0.b
            public final ByteBuffer getData() {
                return this.a;
            }

            @Override // xsna.k0h0.b
            public final int getFlags() {
                return 0;
            }

            @Override // xsna.k0h0.b
            public final int getSize() {
                return 0;
            }
        }
    }

    /* compiled from: SampleSource.kt */
    public interface b {
        long a();

        boolean b();

        boolean c();

        ByteBuffer getData();

        int getFlags();

        int getSize();
    }

    boolean d(long j, long j2);

    b g();

    MediaFormat getFormat();

    boolean i();

    int m();

    void release();

    void seekTo(long j);
}
